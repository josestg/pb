package com.josestg.pb.session.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class RevokeServiceGrpc {

  private RevokeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "identity.session.v1.RevokeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.josestg.pb.session.v1.RevokeRequest,
      com.josestg.pb.session.v1.RevokeResponse> getRevokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Revoke",
      requestType = com.josestg.pb.session.v1.RevokeRequest.class,
      responseType = com.josestg.pb.session.v1.RevokeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.josestg.pb.session.v1.RevokeRequest,
      com.josestg.pb.session.v1.RevokeResponse> getRevokeMethod() {
    io.grpc.MethodDescriptor<com.josestg.pb.session.v1.RevokeRequest, com.josestg.pb.session.v1.RevokeResponse> getRevokeMethod;
    if ((getRevokeMethod = RevokeServiceGrpc.getRevokeMethod) == null) {
      synchronized (RevokeServiceGrpc.class) {
        if ((getRevokeMethod = RevokeServiceGrpc.getRevokeMethod) == null) {
          RevokeServiceGrpc.getRevokeMethod = getRevokeMethod =
              io.grpc.MethodDescriptor.<com.josestg.pb.session.v1.RevokeRequest, com.josestg.pb.session.v1.RevokeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Revoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.session.v1.RevokeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.session.v1.RevokeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RevokeServiceMethodDescriptorSupplier("Revoke"))
              .build();
        }
      }
    }
    return getRevokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RevokeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RevokeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RevokeServiceStub>() {
        @java.lang.Override
        public RevokeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RevokeServiceStub(channel, callOptions);
        }
      };
    return RevokeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static RevokeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RevokeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RevokeServiceBlockingV2Stub>() {
        @java.lang.Override
        public RevokeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RevokeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return RevokeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RevokeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RevokeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RevokeServiceBlockingStub>() {
        @java.lang.Override
        public RevokeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RevokeServiceBlockingStub(channel, callOptions);
        }
      };
    return RevokeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RevokeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RevokeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RevokeServiceFutureStub>() {
        @java.lang.Override
        public RevokeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RevokeServiceFutureStub(channel, callOptions);
        }
      };
    return RevokeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void revoke(com.josestg.pb.session.v1.RevokeRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.RevokeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RevokeService.
   */
  public static abstract class RevokeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RevokeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RevokeService.
   */
  public static final class RevokeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<RevokeServiceStub> {
    private RevokeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RevokeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RevokeServiceStub(channel, callOptions);
    }

    /**
     */
    public void revoke(com.josestg.pb.session.v1.RevokeRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.RevokeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RevokeService.
   */
  public static final class RevokeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<RevokeServiceBlockingV2Stub> {
    private RevokeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RevokeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RevokeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.session.v1.RevokeResponse revoke(com.josestg.pb.session.v1.RevokeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRevokeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service RevokeService.
   */
  public static final class RevokeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RevokeServiceBlockingStub> {
    private RevokeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RevokeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RevokeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.session.v1.RevokeResponse revoke(com.josestg.pb.session.v1.RevokeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RevokeService.
   */
  public static final class RevokeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<RevokeServiceFutureStub> {
    private RevokeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RevokeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RevokeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.josestg.pb.session.v1.RevokeResponse> revoke(
        com.josestg.pb.session.v1.RevokeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REVOKE = 0;

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
        case METHODID_REVOKE:
          serviceImpl.revoke((com.josestg.pb.session.v1.RevokeRequest) request,
              (io.grpc.stub.StreamObserver<com.josestg.pb.session.v1.RevokeResponse>) responseObserver);
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
          getRevokeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.josestg.pb.session.v1.RevokeRequest,
              com.josestg.pb.session.v1.RevokeResponse>(
                service, METHODID_REVOKE)))
        .build();
  }

  private static abstract class RevokeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RevokeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.josestg.pb.session.v1.Session.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RevokeService");
    }
  }

  private static final class RevokeServiceFileDescriptorSupplier
      extends RevokeServiceBaseDescriptorSupplier {
    RevokeServiceFileDescriptorSupplier() {}
  }

  private static final class RevokeServiceMethodDescriptorSupplier
      extends RevokeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RevokeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (RevokeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RevokeServiceFileDescriptorSupplier())
              .addMethod(getRevokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
