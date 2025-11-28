#include <iostream>
#include "google/rpc/status.pb.h"

int main() {
    google::rpc::Status status;
    status.set_code(42);
    std::printf("status: %d\n", status.code());
    return 0;
}
