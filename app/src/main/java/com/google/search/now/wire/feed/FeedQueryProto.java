// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/search/now/wire/feed/feed_query.proto

package com.google.search.now.wire.feed;

public final class FeedQueryProto {
  private FeedQueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface FeedQueryOrBuilder extends
      // @@protoc_insertion_point(interface_extends:search.now.wire.feed.FeedQuery)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    boolean hasReason();
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason getReason();

    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    boolean hasPageToken();
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    com.google.protobuf.ByteString getPageToken();
  }
  /**
   * Protobuf type {@code search.now.wire.feed.FeedQuery}
   */
  public  static final class FeedQuery extends
      com.google.protobuf.GeneratedMessageLite<
          FeedQuery, FeedQuery.Builder> implements
      // @@protoc_insertion_point(message_implements:search.now.wire.feed.FeedQuery)
      FeedQueryOrBuilder {
    private FeedQuery() {
      pageToken_ = com.google.protobuf.ByteString.EMPTY;
    }
    /**
     * Protobuf enum {@code search.now.wire.feed.FeedQuery.RequestReason}
     */
    public enum RequestReason
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN_REQUEST_REASON = 0;</code>
       */
      UNKNOWN_REQUEST_REASON(0),
      /**
       * <code>MANUAL_REFRESH = 1;</code>
       */
      MANUAL_REFRESH(1),
      /**
       * <code>SCHEDULED_REFRESH = 2;</code>
       */
      SCHEDULED_REFRESH(2),
      /**
       * <code>APP_OPEN_REFRESH = 3;</code>
       */
      APP_OPEN_REFRESH(3),
      /**
       * <code>NEXT_PAGE_SCROLL = 4;</code>
       */
      NEXT_PAGE_SCROLL(4),
      ;

      /**
       * <code>UNKNOWN_REQUEST_REASON = 0;</code>
       */
      public static final int UNKNOWN_REQUEST_REASON_VALUE = 0;
      /**
       * <code>MANUAL_REFRESH = 1;</code>
       */
      public static final int MANUAL_REFRESH_VALUE = 1;
      /**
       * <code>SCHEDULED_REFRESH = 2;</code>
       */
      public static final int SCHEDULED_REFRESH_VALUE = 2;
      /**
       * <code>APP_OPEN_REFRESH = 3;</code>
       */
      public static final int APP_OPEN_REFRESH_VALUE = 3;
      /**
       * <code>NEXT_PAGE_SCROLL = 4;</code>
       */
      public static final int NEXT_PAGE_SCROLL_VALUE = 4;


      @java.lang.Override
      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RequestReason valueOf(int value) {
        return forNumber(value);
      }

      public static RequestReason forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN_REQUEST_REASON;
          case 1: return MANUAL_REFRESH;
          case 2: return SCHEDULED_REFRESH;
          case 3: return APP_OPEN_REFRESH;
          case 4: return NEXT_PAGE_SCROLL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RequestReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestReason>() {
              @java.lang.Override
              public RequestReason findValueByNumber(int number) {
                return RequestReason.forNumber(number);
              }
            };

      private final int value;

      private RequestReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:search.now.wire.feed.FeedQuery.RequestReason)
    }

    private int bitField0_;
    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    @java.lang.Override
    public boolean hasReason() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    @java.lang.Override
    public com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason getReason() {
      com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason result = com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason.forNumber(reason_);
      return result == null ? com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason.UNKNOWN_REQUEST_REASON : result;
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    private void setReason(com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      reason_ = value.getNumber();
    }
    /**
     * <pre>
     * The reason the query is being initiated.
     * </pre>
     *
     * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
     */
    private void clearReason() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reason_ = 0;
    }

    public static final int PAGE_TOKEN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString pageToken_;
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    @java.lang.Override
    public boolean hasPageToken() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPageToken() {
      return pageToken_;
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    private void setPageToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      pageToken_ = value;
    }
    /**
     * <pre>
     * Used to fetch the next page when scrolling copied from
     * FeedResponse.next_page_token
     * </pre>
     *
     * <code>optional bytes page_token = 2;</code>
     */
    private void clearPageToken() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pageToken_ = getDefaultInstance().getPageToken();
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, reason_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, pageToken_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, pageToken_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.search.now.wire.feed.FeedQueryProto.FeedQuery prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code search.now.wire.feed.FeedQuery}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.search.now.wire.feed.FeedQueryProto.FeedQuery, Builder> implements
        // @@protoc_insertion_point(builder_implements:search.now.wire.feed.FeedQuery)
        com.google.search.now.wire.feed.FeedQueryProto.FeedQueryOrBuilder {
      // Construct using com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
       */
      @java.lang.Override
      public boolean hasReason() {
        return instance.hasReason();
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
       */
      @java.lang.Override
      public com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason getReason() {
        return instance.getReason();
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
       */
      public Builder setReason(com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason value) {
        copyOnWrite();
        instance.setReason(value);
        return this;
      }
      /**
       * <pre>
       * The reason the query is being initiated.
       * </pre>
       *
       * <code>optional .search.now.wire.feed.FeedQuery.RequestReason reason = 1;</code>
       */
      public Builder clearReason() {
        copyOnWrite();
        instance.clearReason();
        return this;
      }

      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * FeedResponse.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      @java.lang.Override
      public boolean hasPageToken() {
        return instance.hasPageToken();
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * FeedResponse.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getPageToken() {
        return instance.getPageToken();
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * FeedResponse.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public Builder setPageToken(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPageToken(value);
        return this;
      }
      /**
       * <pre>
       * Used to fetch the next page when scrolling copied from
       * FeedResponse.next_page_token
       * </pre>
       *
       * <code>optional bytes page_token = 2;</code>
       */
      public Builder clearPageToken() {
        copyOnWrite();
        instance.clearPageToken();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:search.now.wire.feed.FeedQuery)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.search.now.wire.feed.FeedQueryProto.FeedQuery();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.google.search.now.wire.feed.FeedQueryProto.FeedQuery other = (com.google.search.now.wire.feed.FeedQueryProto.FeedQuery) arg1;
          reason_ = visitor.visitInt(hasReason(), reason_,
              other.hasReason(), other.reason_);
          pageToken_ = visitor.visitByteString(
              hasPageToken(), pageToken_,
              other.hasPageToken(), other.pageToken_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 8: {
                  int rawValue = input.readEnum();
                  com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason value = com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.RequestReason.forNumber(rawValue);
                  if (value == null) {
                    super.mergeVarintField(1, rawValue);
                  } else {
                    bitField0_ |= 0x00000001;
                    reason_ = rawValue;
                  }
                  break;
                }
                case 18: {
                  bitField0_ |= 0x00000002;
                  pageToken_ = input.readBytes();
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.google.search.now.wire.feed.FeedQueryProto.FeedQuery> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.search.now.wire.feed.FeedQueryProto.FeedQuery.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:search.now.wire.feed.FeedQuery)
    private static final com.google.search.now.wire.feed.FeedQueryProto.FeedQuery DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new FeedQuery();
    }

    public static com.google.search.now.wire.feed.FeedQueryProto.FeedQuery getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<FeedQuery> PARSER;

    public static com.google.protobuf.Parser<FeedQuery> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}