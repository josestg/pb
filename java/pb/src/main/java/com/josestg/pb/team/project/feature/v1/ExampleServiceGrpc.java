package com.josestg.pb.team.project.feature.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ExampleServiceGrpc {

  private ExampleServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "team.project.feature.v1.ExampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.josestg.pb.team.project.feature.v1.ExampleRequest,
      com.josestg.pb.team.project.feature.v1.ExampleResponse> getExampleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Example",
      requestType = com.josestg.pb.team.project.feature.v1.ExampleRequest.class,
      responseType = com.josestg.pb.team.project.feature.v1.ExampleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.josestg.pb.team.project.feature.v1.ExampleRequest,
      com.josestg.pb.team.project.feature.v1.ExampleResponse> getExampleMethod() {
    io.grpc.MethodDescriptor<com.josestg.pb.team.project.feature.v1.ExampleRequest, com.josestg.pb.team.project.feature.v1.ExampleResponse> getExampleMethod;
    if ((getExampleMethod = ExampleServiceGrpc.getExampleMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getExampleMethod = ExampleServiceGrpc.getExampleMethod) == null) {
          ExampleServiceGrpc.getExampleMethod = getExampleMethod =
              io.grpc.MethodDescriptor.<com.josestg.pb.team.project.feature.v1.ExampleRequest, com.josestg.pb.team.project.feature.v1.ExampleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Example"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.team.project.feature.v1.ExampleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.team.project.feature.v1.ExampleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("Example"))
              .build();
        }
      }
    }
    return getExampleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceStub>() {
        @java.lang.Override
        public ExampleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServiceStub(channel, callOptions);
        }
      };
    return ExampleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ExampleServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingV2Stub>() {
        @java.lang.Override
        public ExampleServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ExampleServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingStub>() {
        @java.lang.Override
        public ExampleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServiceBlockingStub(channel, callOptions);
        }
      };
    return ExampleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceFutureStub>() {
        @java.lang.Override
        public ExampleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExampleServiceFutureStub(channel, callOptions);
        }
      };
    return ExampleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void example(com.josestg.pb.team.project.feature.v1.ExampleRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.team.project.feature.v1.ExampleResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExampleMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExampleService.
   */
  public static abstract class ExampleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExampleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExampleService.
   */
  public static final class ExampleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExampleServiceStub> {
    private ExampleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void example(com.josestg.pb.team.project.feature.v1.ExampleRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.team.project.feature.v1.ExampleResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExampleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExampleService.
   */
  public static final class ExampleServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ExampleServiceBlockingV2Stub> {
    private ExampleServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.team.project.feature.v1.ExampleResponse example(com.josestg.pb.team.project.feature.v1.ExampleRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExampleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ExampleService.
   */
  public static final class ExampleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExampleServiceBlockingStub> {
    private ExampleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.team.project.feature.v1.ExampleResponse example(com.josestg.pb.team.project.feature.v1.ExampleRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExampleMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExampleService.
   */
  public static final class ExampleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExampleServiceFutureStub> {
    private ExampleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.josestg.pb.team.project.feature.v1.ExampleResponse> example(
        com.josestg.pb.team.project.feature.v1.ExampleRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExampleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXAMPLE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXAMPLE:
          serviceImpl.example((com.josestg.pb.team.project.feature.v1.ExampleRequest) request,
              (io.grpc.stub.StreamObserver<com.josestg.pb.team.project.feature.v1.ExampleResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getExampleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.josestg.pb.team.project.feature.v1.ExampleRequest,
              com.josestg.pb.team.project.feature.v1.ExampleResponse>(
                service, METHODID_EXAMPLE)))
        .build();
  }

  private static abstract class ExampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.josestg.pb.team.project.feature.v1.Example.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExampleService");
    }
  }

  private static final class ExampleServiceFileDescriptorSupplier
      extends ExampleServiceBaseDescriptorSupplier {
    ExampleServiceFileDescriptorSupplier() {}
  }

  private static final class ExampleServiceMethodDescriptorSupplier
      extends ExampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExampleServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleServiceFileDescriptorSupplier())
              .addMethod(getExampleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
