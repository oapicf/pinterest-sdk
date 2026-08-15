//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_request_patch.g.dart';

/// Schema used for updating the integration metadata.
///
/// Properties:
/// * [additionalId1] 
/// * [connectedAdvertiserId] 
/// * [connectedLbaId] 
/// * [connectedMerchantId] 
/// * [connectedTagId] 
/// * [partnerAccessToken] 
/// * [partnerAccessTokenExpiry] 
/// * [partnerMetadata] 
/// * [partnerPrimaryEmail] 
/// * [partnerRefreshToken] 
/// * [partnerRefreshTokenExpiry] 
/// * [scopes] 
@BuiltValue()
abstract class IntegrationRequestPatch implements Built<IntegrationRequestPatch, IntegrationRequestPatchBuilder> {
  @BuiltValueField(wireName: r'additional_id_1')
  String? get additionalId1;

  @BuiltValueField(wireName: r'connected_advertiser_id')
  String? get connectedAdvertiserId;

  @BuiltValueField(wireName: r'connected_lba_id')
  String? get connectedLbaId;

  @BuiltValueField(wireName: r'connected_merchant_id')
  String? get connectedMerchantId;

  @BuiltValueField(wireName: r'connected_tag_id')
  String? get connectedTagId;

  @BuiltValueField(wireName: r'partner_access_token')
  String? get partnerAccessToken;

  @BuiltValueField(wireName: r'partner_access_token_expiry')
  num? get partnerAccessTokenExpiry;

  @BuiltValueField(wireName: r'partner_metadata')
  String? get partnerMetadata;

  @BuiltValueField(wireName: r'partner_primary_email')
  String? get partnerPrimaryEmail;

  @BuiltValueField(wireName: r'partner_refresh_token')
  String? get partnerRefreshToken;

  @BuiltValueField(wireName: r'partner_refresh_token_expiry')
  num? get partnerRefreshTokenExpiry;

  @BuiltValueField(wireName: r'scopes')
  String? get scopes;

  IntegrationRequestPatch._();

  factory IntegrationRequestPatch([void updates(IntegrationRequestPatchBuilder b)]) = _$IntegrationRequestPatch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationRequestPatchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationRequestPatch> get serializer => _$IntegrationRequestPatchSerializer();
}

class _$IntegrationRequestPatchSerializer implements PrimitiveSerializer<IntegrationRequestPatch> {
  @override
  final Iterable<Type> types = const [IntegrationRequestPatch, _$IntegrationRequestPatch];

  @override
  final String wireName = r'IntegrationRequestPatch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationRequestPatch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.additionalId1 != null) {
      yield r'additional_id_1';
      yield serializers.serialize(
        object.additionalId1,
        specifiedType: const FullType(String),
      );
    }
    if (object.connectedAdvertiserId != null) {
      yield r'connected_advertiser_id';
      yield serializers.serialize(
        object.connectedAdvertiserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.connectedLbaId != null) {
      yield r'connected_lba_id';
      yield serializers.serialize(
        object.connectedLbaId,
        specifiedType: const FullType(String),
      );
    }
    if (object.connectedMerchantId != null) {
      yield r'connected_merchant_id';
      yield serializers.serialize(
        object.connectedMerchantId,
        specifiedType: const FullType(String),
      );
    }
    if (object.connectedTagId != null) {
      yield r'connected_tag_id';
      yield serializers.serialize(
        object.connectedTagId,
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
    if (object.partnerAccessTokenExpiry != null) {
      yield r'partner_access_token_expiry';
      yield serializers.serialize(
        object.partnerAccessTokenExpiry,
        specifiedType: const FullType(num),
      );
    }
    if (object.partnerMetadata != null) {
      yield r'partner_metadata';
      yield serializers.serialize(
        object.partnerMetadata,
        specifiedType: const FullType(String),
      );
    }
    if (object.partnerPrimaryEmail != null) {
      yield r'partner_primary_email';
      yield serializers.serialize(
        object.partnerPrimaryEmail,
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
    if (object.partnerRefreshTokenExpiry != null) {
      yield r'partner_refresh_token_expiry';
      yield serializers.serialize(
        object.partnerRefreshTokenExpiry,
        specifiedType: const FullType(num),
      );
    }
    if (object.scopes != null) {
      yield r'scopes';
      yield serializers.serialize(
        object.scopes,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationRequestPatch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationRequestPatchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'additional_id_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.additionalId1 = valueDes;
          break;
        case r'connected_advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.connectedAdvertiserId = valueDes;
          break;
        case r'connected_lba_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.connectedLbaId = valueDes;
          break;
        case r'connected_merchant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.connectedMerchantId = valueDes;
          break;
        case r'connected_tag_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.connectedTagId = valueDes;
          break;
        case r'partner_access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerAccessToken = valueDes;
          break;
        case r'partner_access_token_expiry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.partnerAccessTokenExpiry = valueDes;
          break;
        case r'partner_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerMetadata = valueDes;
          break;
        case r'partner_primary_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerPrimaryEmail = valueDes;
          break;
        case r'partner_refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.partnerRefreshToken = valueDes;
          break;
        case r'partner_refresh_token_expiry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.partnerRefreshTokenExpiry = valueDes;
          break;
        case r'scopes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.scopes = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationRequestPatch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationRequestPatchBuilder();
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

