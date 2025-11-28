set(ABSL_PROVIDER "module" CACHE STRING "" FORCE)
set(ABSL_USE_SYSTEM_PACKAGE OFF CACHE BOOL "" FORCE)
set(ABSL_ENABLE_INSTALL OFF CACHE BOOL "" FORCE)
set(ABSL_PROPAGATE_CXX_STD ON CACHE BOOL "" FORCE)

include(FetchContent)
FetchContent_Declare(googleapis_googleapis_protocolbuffers_cpp
        URL https://buf.build/gen/cmake/googleapis/googleapis/protocolbuffers/cpp/v33.1-f0e53af8f2fc.1
        NETRC REQUIRED
        EXCLUDE_FROM_ALL
)
FetchContent_MakeAvailable(googleapis_googleapis_protocolbuffers_cpp)
find_package(Protobuf CONFIG REQUIRED)
find_package(gRPC CONFIG REQUIRED)

FetchContent_Declare(
        abseil_cpp
        GIT_REPOSITORY https://github.com/abseil/abseil-cpp.git
        GIT_TAG         20250814.1
)
FetchContent_MakeAvailable(abseil_cpp)

FetchContent_Declare(
        protovalidate_cc
        GIT_REPOSITORY https://github.com/bufbuild/protovalidate-cc.git
        GIT_TAG v1.0.0
)
FetchContent_MakeAvailable(protovalidate_cc)

file(GLOB_RECURSE PROTO_CPP_GEN
        *.cc
        *.h
)

add_library(proto_ccp_lib STATIC ${PROTO_CPP_GEN})

target_include_directories(proto_ccp_lib
        PUBLIC
        ${CMAKE_SOURCE_DIR}/gen
)

target_link_libraries(proto_ccp_lib
        PUBLIC
        protobuf::libprotobuf
        gRPC::grpc++
        protovalidate_cc
)
