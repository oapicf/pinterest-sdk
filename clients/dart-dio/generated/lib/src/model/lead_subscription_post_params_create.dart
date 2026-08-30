//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/lead_subscription_create.dart';
import 'package:openapi/src/model/partner_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'lead_subscription_post_params_create.g.dart';

/// LeadSubscriptionPostParamsCreate
///
/// Properties:
/// * [leadFormId] - Lead form ID.
/// * [webhookUrl] - Standard HTTPS webhook URL.
/// * [partnerAccessToken] - Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
/// * [partnerMetadata] - Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
/// * [partnerRefreshToken] - Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
@BuiltValue()
abstract class LeadSubscriptionPostParamsCreate implements LeadSubscriptionCreate, Built<LeadSubscriptionPostParamsCreate, LeadSubscriptionPostParamsCreateBuilder> {
  /// Partner access token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_access_token')
  String? get partnerAccessToken;

  /// Partner metadata. Only for clients that requires special handling. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_metadata')
  PartnerMetadata? get partnerMetadata;

  /// Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param.
  @BuiltValueField(wireName: r'partner_refresh_token')
  String? get partnerRefreshToken;

  LeadSubscriptionPostParamsCreate._();

  factory LeadSubscriptionPostParamsCreate([void updates(LeadSubscriptionPostParamsCreateBuilder b)]) = _$LeadSubscriptionPostParamsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(LeadSubscriptionPostParamsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<LeadSubscriptionPostParamsCreate> get serializer => _$LeadSubscriptionPostParamsCreateSerializer();
}

class _$LeadSubscriptionPostParamsCreateSerializer implements PrimitiveSerializer<LeadSubscriptionPostParamsCreate> {
  @override
  final Iterable<Type> types = const [LeadSubscriptionPostParamsCreate, _$LeadSubscriptionPostParamsCreate];

  @override
  final String wireName = r'LeadSubscriptionPostParamsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    LeadSubscriptionPostParamsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.partnerMetadata != null) {
      yield r'partner_metadata';
      yield serializers.serialize(
        object.partnerMetadata,
        specifiedType: const FullType(PartnerMetadata),
      );
    }
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
    LeadSubscriptionPostParamsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required LeadSubscriptionPostParamsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'partner_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PartnerMetadata),
          ) as PartnerMetadata?;
          if (valueDes == null) continue;
          result.partnerMetadata.replace(valueDes);
          break;
        case r'lead_form_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.leadFormId = valueDes;
          break;
        case r'partner_access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerAccessToken = valueDes;
          break;
        case r'partner_refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  LeadSubscriptionPostParamsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = LeadSubscriptionPostParamsCreateBuilder();
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

