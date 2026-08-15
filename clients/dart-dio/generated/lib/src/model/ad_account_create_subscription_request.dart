//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_account_create_subscription_request_partner_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account_create_subscription_request.g.dart';

/// AdAccountCreateSubscriptionRequest
///
/// Properties:
/// * [leadFormId] - Lead form ID.
/// * [partnerAccessToken] - Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
/// * [partnerMetadata] 
/// * [partnerRefreshToken] - Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
/// * [webhookUrl] - Standard HTTPS webhook URL.
@BuiltValue()
abstract class AdAccountCreateSubscriptionRequest implements Built<AdAccountCreateSubscriptionRequest, AdAccountCreateSubscriptionRequestBuilder> {
  /// Lead form ID.
  @BuiltValueField(wireName: r'lead_form_id')
  String? get leadFormId;

  /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_access_token')
  String? get partnerAccessToken;

  @BuiltValueField(wireName: r'partner_metadata')
  AdAccountCreateSubscriptionRequestPartnerMetadata? get partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_refresh_token')
  String? get partnerRefreshToken;

  /// Standard HTTPS webhook URL.
  @BuiltValueField(wireName: r'webhook_url')
  String get webhookUrl;

  AdAccountCreateSubscriptionRequest._();

  factory AdAccountCreateSubscriptionRequest([void updates(AdAccountCreateSubscriptionRequestBuilder b)]) = _$AdAccountCreateSubscriptionRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountCreateSubscriptionRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccountCreateSubscriptionRequest> get serializer => _$AdAccountCreateSubscriptionRequestSerializer();
}

class _$AdAccountCreateSubscriptionRequestSerializer implements PrimitiveSerializer<AdAccountCreateSubscriptionRequest> {
  @override
  final Iterable<Type> types = const [AdAccountCreateSubscriptionRequest, _$AdAccountCreateSubscriptionRequest];

  @override
  final String wireName = r'AdAccountCreateSubscriptionRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccountCreateSubscriptionRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.leadFormId != null) {
      yield r'lead_form_id';
      yield serializers.serialize(
        object.leadFormId,
        specifiedType: const FullType(String),
      );
    }
    if (object.partnerAccessToken != null) {
      yield r'partner_access_token';
      yield serializers.serialize(
        object.partnerAccessToken,
        specifiedType: const FullType(String),
      );
    }
    if (object.partnerMetadata != null) {
      yield r'partner_metadata';
      yield serializers.serialize(
        object.partnerMetadata,
        specifiedType: const FullType(AdAccountCreateSubscriptionRequestPartnerMetadata),
      );
    }
    if (object.partnerRefreshToken != null) {
      yield r'partner_refresh_token';
      yield serializers.serialize(
        object.partnerRefreshToken,
        specifiedType: const FullType(String),
      );
    }
    yield r'webhook_url';
    yield serializers.serialize(
      object.webhookUrl,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccountCreateSubscriptionRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountCreateSubscriptionRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.leadFormId = valueDes;
          break;
        case r'partner_access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerAccessToken = valueDes;
          break;
        case r'partner_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdAccountCreateSubscriptionRequestPartnerMetadata),
          ) as AdAccountCreateSubscriptionRequestPartnerMetadata;
          result.partnerMetadata.replace(valueDes);
          break;
        case r'partner_refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerRefreshToken = valueDes;
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
  AdAccountCreateSubscriptionRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountCreateSubscriptionRequestBuilder();
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

