//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/integration_log_level.dart';
import 'package:openapi/src/model/integration_log_event_type.dart';
import 'package:openapi/src/model/integration_log_client_request.dart';
import 'package:openapi/src/model/integration_log_client_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_log.g.dart';

/// Schema for log sent from an integration application.
///
/// Properties:
/// * [advertiserId] 
/// * [appVersionNumber] - Version number of the integration application.
/// * [clientTimestamp] - Timestamp in milliseconds of when the log was executed at the client.
/// * [error] 
/// * [eventType] - Log event type
/// * [externalBusinessId] 
/// * [feedProfileId] 
/// * [logLevel] - Log level type
/// * [merchantId] 
/// * [message] - Explanation of the event that occured.
/// * [platformVersionNumber] - Version number of the platform the integration application is running on.
/// * [request] 
/// * [tagId] 
@BuiltValue()
abstract class IntegrationLog implements Built<IntegrationLog, IntegrationLogBuilder> {
  @BuiltValueField(wireName: r'advertiser_id')
  String? get advertiserId;

  /// Version number of the integration application.
  @BuiltValueField(wireName: r'app_version_number')
  String? get appVersionNumber;

  /// Timestamp in milliseconds of when the log was executed at the client.
  @BuiltValueField(wireName: r'client_timestamp')
  int get clientTimestamp;

  @BuiltValueField(wireName: r'error')
  IntegrationLogClientError? get error;

  /// Log event type
  @BuiltValueField(wireName: r'event_type')
  IntegrationLogEventType get eventType;
  // enum eventTypeEnum {  APP,  API,  };

  @BuiltValueField(wireName: r'external_business_id')
  String? get externalBusinessId;

  @BuiltValueField(wireName: r'feed_profile_id')
  String? get feedProfileId;

  /// Log level type
  @BuiltValueField(wireName: r'log_level')
  IntegrationLogLevel get logLevel;
  // enum logLevelEnum {  INFO,  WARN,  ERROR,  };

  @BuiltValueField(wireName: r'merchant_id')
  String? get merchantId;

  /// Explanation of the event that occured.
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// Version number of the platform the integration application is running on.
  @BuiltValueField(wireName: r'platform_version_number')
  String? get platformVersionNumber;

  @BuiltValueField(wireName: r'request')
  IntegrationLogClientRequest? get request;

  @BuiltValueField(wireName: r'tag_id')
  String? get tagId;

  IntegrationLog._();

  factory IntegrationLog([void updates(IntegrationLogBuilder b)]) = _$IntegrationLog;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationLogBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationLog> get serializer => _$IntegrationLogSerializer();
}

class _$IntegrationLogSerializer implements PrimitiveSerializer<IntegrationLog> {
  @override
  final Iterable<Type> types = const [IntegrationLog, _$IntegrationLog];

  @override
  final String wireName = r'IntegrationLog';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationLog object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.advertiserId != null) {
      yield r'advertiser_id';
      yield serializers.serialize(
        object.advertiserId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.appVersionNumber != null) {
      yield r'app_version_number';
      yield serializers.serialize(
        object.appVersionNumber,
        specifiedType: const FullType(String),
      );
    }
    yield r'client_timestamp';
    yield serializers.serialize(
      object.clientTimestamp,
      specifiedType: const FullType(int),
    );
    if (object.error != null) {
      yield r'error';
      yield serializers.serialize(
        object.error,
        specifiedType: const FullType(IntegrationLogClientError),
      );
    }
    yield r'event_type';
    yield serializers.serialize(
      object.eventType,
      specifiedType: const FullType(IntegrationLogEventType),
    );
    if (object.externalBusinessId != null) {
      yield r'external_business_id';
      yield serializers.serialize(
        object.externalBusinessId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.feedProfileId != null) {
      yield r'feed_profile_id';
      yield serializers.serialize(
        object.feedProfileId,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'log_level';
    yield serializers.serialize(
      object.logLevel,
      specifiedType: const FullType(IntegrationLogLevel),
    );
    if (object.merchantId != null) {
      yield r'merchant_id';
      yield serializers.serialize(
        object.merchantId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.platformVersionNumber != null) {
      yield r'platform_version_number';
      yield serializers.serialize(
        object.platformVersionNumber,
        specifiedType: const FullType(String),
      );
    }
    if (object.request != null) {
      yield r'request';
      yield serializers.serialize(
        object.request,
        specifiedType: const FullType(IntegrationLogClientRequest),
      );
    }
    if (object.tagId != null) {
      yield r'tag_id';
      yield serializers.serialize(
        object.tagId,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationLog object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationLogBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.advertiserId = valueDes;
          break;
        case r'app_version_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.appVersionNumber = valueDes;
          break;
        case r'client_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.clientTimestamp = valueDes;
          break;
        case r'error':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IntegrationLogClientError),
          ) as IntegrationLogClientError?;
          if (valueDes == null) continue;
          result.error.replace(valueDes);
          break;
        case r'event_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(IntegrationLogEventType),
          ) as IntegrationLogEventType;
          result.eventType = valueDes;
          break;
        case r'external_business_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.externalBusinessId = valueDes;
          break;
        case r'feed_profile_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.feedProfileId = valueDes;
          break;
        case r'log_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(IntegrationLogLevel),
          ) as IntegrationLogLevel;
          result.logLevel = valueDes;
          break;
        case r'merchant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.merchantId = valueDes;
          break;
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        case r'platform_version_number':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.platformVersionNumber = valueDes;
          break;
        case r'request':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IntegrationLogClientRequest),
          ) as IntegrationLogClientRequest?;
          if (valueDes == null) continue;
          result.request.replace(valueDes);
          break;
        case r'tag_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.tagId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationLog deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationLogBuilder();
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

