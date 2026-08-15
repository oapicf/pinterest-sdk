//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_create_subscription_response.g.dart';

/// AdAccountCreateSubscriptionResponse
///
/// Properties:
/// * [adAccountId] - The Ad Account ID that this lead form belongs to.
/// * [apiVersion] - API version.
/// * [createdTime] - Subscription creation time. Unix timestamp in milliseconds.
/// * [cryptographicAlgorithm] - Lead data encryption algorithm.
/// * [cryptographicKey] - Base64 encoded key for client to decrypt lead data.
/// * [id] - Subscription ID.
/// * [leadFormId] - Lead form ID.
/// * [userAccountId] - User account used to subscribe lead data.
/// * [webhookUrl] - Standard HTTPS webhook URL.
@BuiltValue()
abstract class AdAccountCreateSubscriptionResponse implements Built<AdAccountCreateSubscriptionResponse, AdAccountCreateSubscriptionResponseBuilder> {
  /// The Ad Account ID that this lead form belongs to.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// API version.
  @BuiltValueField(wireName: r'api_version')
  String? get apiVersion;

  /// Subscription creation time. Unix timestamp in milliseconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Lead data encryption algorithm.
  @BuiltValueField(wireName: r'cryptographic_algorithm')
  String? get cryptographicAlgorithm;

  /// Base64 encoded key for client to decrypt lead data.
  @BuiltValueField(wireName: r'cryptographic_key')
  String? get cryptographicKey;

  /// Subscription ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// Lead form ID.
  @BuiltValueField(wireName: r'lead_form_id')
  String? get leadFormId;

  /// User account used to subscribe lead data.
  @BuiltValueField(wireName: r'user_account_id')
  String? get userAccountId;

  /// Standard HTTPS webhook URL.
  @BuiltValueField(wireName: r'webhook_url')
  String? get webhookUrl;

  AdAccountCreateSubscriptionResponse._();

  factory AdAccountCreateSubscriptionResponse([void updates(AdAccountCreateSubscriptionResponseBuilder b)]) = _$AdAccountCreateSubscriptionResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountCreateSubscriptionResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountCreateSubscriptionResponse> get serializer => _$AdAccountCreateSubscriptionResponseSerializer();
}

class _$AdAccountCreateSubscriptionResponseSerializer implements PrimitiveSerializer<AdAccountCreateSubscriptionResponse> {
  @override
  final Iterable<Type> types = const [AdAccountCreateSubscriptionResponse, _$AdAccountCreateSubscriptionResponse];

  @override
  final String wireName = r'AdAccountCreateSubscriptionResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountCreateSubscriptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.apiVersion != null) {
      yield r'api_version';
      yield serializers.serialize(
        object.apiVersion,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.cryptographicAlgorithm != null) {
      yield r'cryptographic_algorithm';
      yield serializers.serialize(
        object.cryptographicAlgorithm,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.cryptographicKey != null) {
      yield r'cryptographic_key';
      yield serializers.serialize(
        object.cryptographicKey,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.userAccountId != null) {
      yield r'user_account_id';
      yield serializers.serialize(
        object.userAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.webhookUrl != null) {
      yield r'webhook_url';
      yield serializers.serialize(
        object.webhookUrl,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountCreateSubscriptionResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountCreateSubscriptionResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'api_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.apiVersion = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdTime = valueDes;
          break;
        case r'cryptographic_algorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cryptographicAlgorithm = valueDes;
          break;
        case r'cryptographic_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cryptographicKey = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'user_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.userAccountId = valueDes;
          break;
        case r'webhook_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.webhookUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccountCreateSubscriptionResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountCreateSubscriptionResponseBuilder();
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

