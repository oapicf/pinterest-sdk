//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_metadata.g.dart';

/// Integration metadata
///
/// Properties:
/// * [additionalId1] 
/// * [connectedAdvertiserId] 
/// * [connectedLbaId] 
/// * [connectedMerchantId] 
/// * [connectedTagId] 
/// * [connectedUserId] 
/// * [createdTimestamp] 
/// * [externalBusinessId] 
/// * [id] 
/// * [partnerAccessTokenExpiry] 
/// * [partnerMetadata] 
/// * [partnerRefreshTokenExpiry] 
/// * [scopes] 
/// * [updatedTimestamp] 
@BuiltValue()
abstract class IntegrationMetadata implements Built<IntegrationMetadata, IntegrationMetadataBuilder> {
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

  @BuiltValueField(wireName: r'connected_user_id')
  String? get connectedUserId;

  @BuiltValueField(wireName: r'created_timestamp')
  num? get createdTimestamp;

  @BuiltValueField(wireName: r'external_business_id')
  String? get externalBusinessId;

  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'partner_access_token_expiry')
  num? get partnerAccessTokenExpiry;

  @BuiltValueField(wireName: r'partner_metadata')
  String? get partnerMetadata;

  @BuiltValueField(wireName: r'partner_refresh_token_expiry')
  num? get partnerRefreshTokenExpiry;

  @BuiltValueField(wireName: r'scopes')
  String? get scopes;

  @BuiltValueField(wireName: r'updated_timestamp')
  num? get updatedTimestamp;

  IntegrationMetadata._();

  factory IntegrationMetadata([void updates(IntegrationMetadataBuilder b)]) = _$IntegrationMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationMetadata> get serializer => _$IntegrationMetadataSerializer();
}

class _$IntegrationMetadataSerializer implements PrimitiveSerializer<IntegrationMetadata> {
  @override
  final Iterable<Type> types = const [IntegrationMetadata, _$IntegrationMetadata];

  @override
  final String wireName = r'IntegrationMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationMetadata object, {
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
    if (object.connectedUserId != null) {
      yield r'connected_user_id';
      yield serializers.serialize(
        object.connectedUserId,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTimestamp != null) {
      yield r'created_timestamp';
      yield serializers.serialize(
        object.createdTimestamp,
        specifiedType: const FullType(num),
      );
    }
    if (object.externalBusinessId != null) {
      yield r'external_business_id';
      yield serializers.serialize(
        object.externalBusinessId,
        specifiedType: const FullType(String),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
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
    if (object.updatedTimestamp != null) {
      yield r'updated_timestamp';
      yield serializers.serialize(
        object.updatedTimestamp,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationMetadataBuilder result,
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
        case r'connected_user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.connectedUserId = valueDes;
          break;
        case r'created_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.createdTimestamp = valueDes;
          break;
        case r'external_business_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.externalBusinessId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
        case r'updated_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.updatedTimestamp = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationMetadataBuilder();
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

