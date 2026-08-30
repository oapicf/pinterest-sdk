//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/http_method.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_log_client_request.g.dart';

/// HTTP request details included in the log sent by the client.
///
/// Properties:
/// * [host] - HTTP request host from host header.
/// * [method] 
/// * [path] - HTTP request path.
/// * [requestHeaders] - HTTP request headers as key-value pairs.
/// * [responseHeaders] - HTTP response headers as key-value pairs.
/// * [responseStatusCode] 
@BuiltValue()
abstract class IntegrationLogClientRequest implements Built<IntegrationLogClientRequest, IntegrationLogClientRequestBuilder> {
  /// HTTP request host from host header.
  @BuiltValueField(wireName: r'host')
  String get host;

  @BuiltValueField(wireName: r'method')
  HttpMethod get method;
  // enum methodEnum {  GET,  HEAD,  POST,  PUT,  DELETE,  CONNECT,  OPTIONS,  TRACE,  PATCH,  };

  /// HTTP request path.
  @BuiltValueField(wireName: r'path')
  String get path;

  /// HTTP request headers as key-value pairs.
  @BuiltValueField(wireName: r'request_headers')
  BuiltMap<String, String>? get requestHeaders;

  /// HTTP response headers as key-value pairs.
  @BuiltValueField(wireName: r'response_headers')
  BuiltMap<String, String>? get responseHeaders;

  @BuiltValueField(wireName: r'response_status_code')
  int? get responseStatusCode;

  IntegrationLogClientRequest._();

  factory IntegrationLogClientRequest([void updates(IntegrationLogClientRequestBuilder b)]) = _$IntegrationLogClientRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogClientRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLogClientRequest> get serializer => _$IntegrationLogClientRequestSerializer();
}

class _$IntegrationLogClientRequestSerializer implements PrimitiveSerializer<IntegrationLogClientRequest> {
  @override
  final Iterable<Type> types = const [IntegrationLogClientRequest, _$IntegrationLogClientRequest];

  @override
  final String wireName = r'IntegrationLogClientRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLogClientRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'host';
    yield serializers.serialize(
      object.host,
      specifiedType: const FullType(String),
    );
    yield r'method';
    yield serializers.serialize(
      object.method,
      specifiedType: const FullType(HttpMethod),
    );
    yield r'path';
    yield serializers.serialize(
      object.path,
      specifiedType: const FullType(String),
    );
    if (object.requestHeaders != null) {
      yield r'request_headers';
      yield serializers.serialize(
        object.requestHeaders,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(String)]),
      );
    }
    if (object.responseHeaders != null) {
      yield r'response_headers';
      yield serializers.serialize(
        object.responseHeaders,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(String)]),
      );
    }
    if (object.responseStatusCode != null) {
      yield r'response_status_code';
      yield serializers.serialize(
        object.responseStatusCode,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLogClientRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogClientRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'host':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.host = valueDes;
          break;
        case r'method':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(HttpMethod),
          ) as HttpMethod;
          result.method = valueDes;
          break;
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.path = valueDes;
          break;
        case r'request_headers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(String)]),
          ) as BuiltMap<String, String>?;
          if (valueDes == null) continue;
          result.requestHeaders.replace(valueDes);
          break;
        case r'response_headers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(String)]),
          ) as BuiltMap<String, String>?;
          if (valueDes == null) continue;
          result.responseHeaders.replace(valueDes);
          break;
        case r'response_status_code':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.responseStatusCode = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLogClientRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogClientRequestBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

