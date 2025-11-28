package com.josestg.pb.payment.currency.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ExchangeServiceGrpc {

  private ExchangeServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "payment.currency.v1.ExchangeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.josestg.pb.payment.currency.v1.ExchangeRequest,
      com.josestg.pb.payment.currency.v1.ExchangeResponse> getExchangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Exchange",
      requestType = com.josestg.pb.payment.currency.v1.ExchangeRequest.class,
      responseType = com.josestg.pb.payment.currency.v1.ExchangeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.josestg.pb.payment.currency.v1.ExchangeRequest,
      com.josestg.pb.payment.currency.v1.ExchangeResponse> getExchangeMethod() {
    io.grpc.MethodDescriptor<com.josestg.pb.payment.currency.v1.ExchangeRequest, com.josestg.pb.payment.currency.v1.ExchangeResponse> getExchangeMethod;
    if ((getExchangeMethod = ExchangeServiceGrpc.getExchangeMethod) == null) {
      synchronized (ExchangeServiceGrpc.class) {
        if ((getExchangeMethod = ExchangeServiceGrpc.getExchangeMethod) == null) {
          ExchangeServiceGrpc.getExchangeMethod = getExchangeMethod =
              io.grpc.MethodDescriptor.<com.josestg.pb.payment.currency.v1.ExchangeRequest, com.josestg.pb.payment.currency.v1.ExchangeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Exchange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.payment.currency.v1.ExchangeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.josestg.pb.payment.currency.v1.ExchangeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExchangeServiceMethodDescriptorSupplier("Exchange"))
              .build();
        }
      }
    }
    return getExchangeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExchangeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceStub>() {
        @java.lang.Override
        public ExchangeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeServiceStub(channel, callOptions);
        }
      };
    return ExchangeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ExchangeServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceBlockingV2Stub>() {
        @java.lang.Override
        public ExchangeServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ExchangeServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExchangeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceBlockingStub>() {
        @java.lang.Override
        public ExchangeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeServiceBlockingStub(channel, callOptions);
        }
      };
    return ExchangeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExchangeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ExchangeServiceFutureStub>() {
        @java.lang.Override
        public ExchangeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ExchangeServiceFutureStub(channel, callOptions);
        }
      };
    return ExchangeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void exchange(com.josestg.pb.payment.currency.v1.ExchangeRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.payment.currency.v1.ExchangeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExchangeMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExchangeService.
   */
  public static abstract class ExchangeServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ExchangeServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExchangeService.
   */
  public static final class ExchangeServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ExchangeServiceStub> {
    private ExchangeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeServiceStub(channel, callOptions);
    }

    /**
     */
    public void exchange(com.josestg.pb.payment.currency.v1.ExchangeRequest request,
        io.grpc.stub.StreamObserver<com.josestg.pb.payment.currency.v1.ExchangeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExchangeService.
   */
  public static final class ExchangeServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ExchangeServiceBlockingV2Stub> {
    private ExchangeServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangeServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.payment.currency.v1.ExchangeResponse exchange(com.josestg.pb.payment.currency.v1.ExchangeRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service ExchangeService.
   */
  public static final class ExchangeServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ExchangeServiceBlockingStub> {
    private ExchangeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.josestg.pb.payment.currency.v1.ExchangeResponse exchange(com.josestg.pb.payment.currency.v1.ExchangeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExchangeMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExchangeService.
   */
  public static final class ExchangeServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ExchangeServiceFutureStub> {
    private ExchangeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExchangeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExchangeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.josestg.pb.payment.currency.v1.ExchangeResponse> exchange(
        com.josestg.pb.payment.currency.v1.ExchangeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExchangeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXCHANGE = 0;

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
        case METHODID_EXCHANGE:
          serviceImpl.exchange((com.josestg.pb.payment.currency.v1.ExchangeRequest) request,
              (io.grpc.stub.StreamObserver<com.josestg.pb.payment.currency.v1.ExchangeResponse>) responseObserver);
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
          getExchangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.josestg.pb.payment.currency.v1.ExchangeRequest,
              com.josestg.pb.payment.currency.v1.ExchangeResponse>(
                service, METHODID_EXCHANGE)))
        .build();
  }

  private static abstract class ExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExchangeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.josestg.pb.payment.currency.v1.Currency.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExchangeService");
    }
  }

  private static final class ExchangeServiceFileDescriptorSupplier
      extends ExchangeServiceBaseDescriptorSupplier {
    ExchangeServiceFileDescriptorSupplier() {}
  }

  private static final class ExchangeServiceMethodDescriptorSupplier
      extends ExchangeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ExchangeServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ExchangeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExchangeServiceFileDescriptorSupplier())
              .addMethod(getExchangeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
