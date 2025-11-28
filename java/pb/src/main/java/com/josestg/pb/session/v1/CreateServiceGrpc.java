package com.josestg.pb.session.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class CreateServiceGrpc {

  private CreateServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "identity.session.v1.CreateService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.josestg.pb.session.v1.CreateRequest,
      com.josestg.pb.session.v1.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.josestg.pb.session.v1.CreateRequest.class,
      responseType = com.josestg.pb.session.v1.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.josestg.pb.session.v1.CreateRequest,
      com.josestg.pb.session.v1.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.josestg.pb.session.v1.CreateRequest, com.josestg.pb.session.v1.CreateResponse> getCreateMethod;
    if ((getCreateMethod = CreateServiceGrpc.getCreateMethod) == null) {
      synchronized (CreateServiceGrpc.class) {
        if ((getCreateMethod = CreateServiceGrpc.getCreateMethod) == null) {
          CreateServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.josestg.pb.session.v1.CreateRequest, com.josestg.pb.session.v1.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.session.v1.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.session.v1.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CreateServiceMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateServiceStub>() {
        @java.lang.Override
        public CreateServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateServiceStub(channel, callOptions);
        }
      };
    return CreateServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static CreateServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateServiceBlockingV2Stub>() {
        @java.lang.Override
        public CreateServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return CreateServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateServiceBlockingStub>() {
        @java.lang.Override
        public CreateServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateServiceBlockingStub(channel, callOptions);
        }
      };
    return CreateServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CreateServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CreateServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CreateServiceFutureStub>() {
        @java.lang.Override
        public CreateServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CreateServiceFutureStub(channel, callOptions);
        }
      };
    return CreateServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(com.josestg.pb.session.v1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.CreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service CreateService.
   */
  public static abstract class CreateServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return CreateServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service CreateService.
   */
  public static final class CreateServiceStub
      extends io.grpc.stub.AbstractAsyncStub<CreateServiceStub> {
    private CreateServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.josestg.pb.session.v1.CreateRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.CreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service CreateService.
   */
  public static final class CreateServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<CreateServiceBlockingV2Stub> {
    private CreateServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.session.v1.CreateResponse create(com.josestg.pb.session.v1.CreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service CreateService.
   */
  public static final class CreateServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<CreateServiceBlockingStub> {
    private CreateServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.session.v1.CreateResponse create(com.josestg.pb.session.v1.CreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service CreateService.
   */
  public static final class CreateServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<CreateServiceFutureStub> {
    private CreateServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CreateServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.josestg.pb.session.v1.CreateResponse> create(
        com.josestg.pb.session.v1.CreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

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
        case METHODID_CREATE:
          serviceImpl.create((com.josestg.pb.session.v1.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.CreateResponse>) responseObserver);
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.josestg.pb.session.v1.CreateRequest,
              com.josestg.pb.session.v1.CreateResponse>(
                service, METHODID_CREATE)))
        .build();
  }

  private static abstract class CreateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CreateServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.josestg.pb.session.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CreateService");
    }
  }

  private static final class CreateServiceFileDescriptorSupplier
      extends CreateServiceBaseDescriptorSupplier {
    CreateServiceFileDescriptorSupplier() {}
  }

  private static final class CreateServiceMethodDescriptorSupplier
      extends CreateServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    CreateServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (CreateServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CreateServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
