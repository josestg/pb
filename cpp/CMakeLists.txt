cmake_minimum_required(VERSION 4.0.2)
project(cpp)
if(CMAKE_SYSTEM_PROCESSOR MATCHES "arm64|aarch64")
    message(STATUS "ARM64 detected: removing x86 SIMD flags")

    foreach(flag
            -msse
            -msse2
            -msse3
            -mssse3
            -msse4
            -msse4.1
            -msse4.2
            -mavx
            -mavx2
    )
        string(REPLACE "${flag}" "" CMAKE_C_FLAGS "${CMAKE_C_FLAGS}")
        string(REPLACE "${flag}" "" CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS}")
    endforeach()
    add_compile_options(-DABSL_VECTORIZE_WITH_SIMD=0)
endif()

set(CMAKE_CXX_STANDARD 23)

add_subdirectory(gen)
add_executable(cpp main.cpp)

target_link_libraries(cpp
        PRIVATE
        proto_ccp_lib
)