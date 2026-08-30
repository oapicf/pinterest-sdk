//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/partner_metadata.dart';
import 'package:openapi/src/model/lead_subscription.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_subscription_post_params.g.dart';

/// LeadSubscriptionPostParams
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
/// * [partnerAccessToken] - Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
/// * [partnerMetadata] - Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
/// * [partnerRefreshToken] - Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
@BuiltValue()
abstract class LeadSubscriptionPostParams implements LeadSubscription, Built<LeadSubscriptionPostParams, LeadSubscriptionPostParamsBuilder> {
  /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_access_token')
  String? get partnerAccessToken;

  /// Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_metadata')
  PartnerMetadata? get partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_refresh_token')
  String? get partnerRefreshToken;

  LeadSubscriptionPostParams._();

  factory LeadSubscriptionPostParams([void updates(LeadSubscriptionPostParamsBuilder b)]) = _$LeadSubscriptionPostParams;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadSubscriptionPostParamsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadSubscriptionPostParams> get serializer => _$LeadSubscriptionPostParamsSerializer();
}

class _$LeadSubscriptionPostParamsSerializer implements PrimitiveSerializer<LeadSubscriptionPostParams> {
  @override
  final Iterable<Type> types = const [LeadSubscriptionPostParams, _$LeadSubscriptionPostParams];

  @override
  final String wireName = r'LeadSubscriptionPostParams';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadSubscriptionPostParams object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.partnerAccessToken != null) {
      yield r'partner_access_token';
      yield serializers.serialize(
        object.partnerAccessToken,
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
    if (object.cryptographicKey != null) {
      yield r'cryptographic_key';
      yield serializers.serialize(
        object.cryptographicKey,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.userAccountId != null) {
      yield r'user_account_id';
      yield serializers.serialize(
        object.userAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.partnerMetadata != null) {
      yield r'partner_metadata';
      yield serializers.serialize(
        object.partnerMetadata,
        specifiedType: const FullType(PartnerMetadata),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerRefreshToken != null) {
      yield r'partner_refresh_token';
      yield serializers.serialize(
        object.partnerRefreshToken,
        specifiedType: const FullType(String),
      );
    }
    if (object.cryptographicAlgorithm != null) {
      yield r'cryptographic_algorithm';
      yield serializers.serialize(
        object.cryptographicAlgorithm,
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
    LeadSubscriptionPostParams object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadSubscriptionPostParamsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'partner_access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerAccessToken = valueDes;
          break;
        case r'api_version':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.apiVersion = valueDes;
          break;
        case r'cryptographic_key':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cryptographicKey = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'user_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userAccountId = valueDes;
          break;
        case r'partner_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PartnerMetadata),
          ) as PartnerMetadata?;
          if (valueDes == null) continue;
          result.partnerMetadata.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'partner_refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerRefreshToken = valueDes;
          break;
        case r'cryptographic_algorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.cryptographicAlgorithm = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'webhook_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  LeadSubscriptionPostParams deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadSubscriptionPostParamsBuilder();
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

