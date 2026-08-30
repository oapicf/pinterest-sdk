//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'integration_record.g.dart';

/// Integration record
///
/// Properties:
/// * [additionalId1] 
/// * [connectedAdvertiserId] 
/// * [connectedLbaId] 
/// * [connectedMerchantId] 
/// * [connectedTagId] 
/// * [connectedUserId] 
/// * [createdTime] 
/// * [externalBusinessId] 
/// * [id] - Integration record ID.
/// * [partnerAccessToken] 
/// * [partnerAccessTokenExpiry] 
/// * [partnerMetadata] 
/// * [partnerPrimaryEmail] 
/// * [partnerRefreshToken] 
/// * [partnerRefreshTokenExpiry] 
/// * [scopes] 
/// * [updatedTime] 
@BuiltValue()
abstract class IntegrationRecord implements Built<IntegrationRecord, IntegrationRecordBuilder> {
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

  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  @BuiltValueField(wireName: r'external_business_id')
  String? get externalBusinessId;

  /// Integration record ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'partner_access_token')
  String? get partnerAccessToken;

  @BuiltValueField(wireName: r'partner_access_token_expiry')
  int? get partnerAccessTokenExpiry;

  @BuiltValueField(wireName: r'partner_metadata')
  String? get partnerMetadata;

  @BuiltValueField(wireName: r'partner_primary_email')
  String? get partnerPrimaryEmail;

  @BuiltValueField(wireName: r'partner_refresh_token')
  String? get partnerRefreshToken;

  @BuiltValueField(wireName: r'partner_refresh_token_expiry')
  int? get partnerRefreshTokenExpiry;

  @BuiltValueField(wireName: r'scopes')
  String? get scopes;

  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  IntegrationRecord._();

  factory IntegrationRecord([void updates(IntegrationRecordBuilder b)]) = _$IntegrationRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(IntegrationRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<IntegrationRecord> get serializer => _$IntegrationRecordSerializer();
}

class _$IntegrationRecordSerializer implements PrimitiveSerializer<IntegrationRecord> {
  @override
  final Iterable<Type> types = const [IntegrationRecord, _$IntegrationRecord];

  @override
  final String wireName = r'IntegrationRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    IntegrationRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.additionalId1 != null) {
      yield r'additional_id_1';
      yield serializers.serialize(
        object.additionalId1,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.connectedAdvertiserId != null) {
      yield r'connected_advertiser_id';
      yield serializers.serialize(
        object.connectedAdvertiserId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.connectedLbaId != null) {
      yield r'connected_lba_id';
      yield serializers.serialize(
        object.connectedLbaId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.connectedMerchantId != null) {
      yield r'connected_merchant_id';
      yield serializers.serialize(
        object.connectedMerchantId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.connectedTagId != null) {
      yield r'connected_tag_id';
      yield serializers.serialize(
        object.connectedTagId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.connectedUserId != null) {
      yield r'connected_user_id';
      yield serializers.serialize(
        object.connectedUserId,
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
    if (object.externalBusinessId != null) {
      yield r'external_business_id';
      yield serializers.serialize(
        object.externalBusinessId,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.partnerAccessToken != null) {
      yield r'partner_access_token';
      yield serializers.serialize(
        object.partnerAccessToken,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerAccessTokenExpiry != null) {
      yield r'partner_access_token_expiry';
      yield serializers.serialize(
        object.partnerAccessTokenExpiry,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.partnerMetadata != null) {
      yield r'partner_metadata';
      yield serializers.serialize(
        object.partnerMetadata,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerPrimaryEmail != null) {
      yield r'partner_primary_email';
      yield serializers.serialize(
        object.partnerPrimaryEmail,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerRefreshToken != null) {
      yield r'partner_refresh_token';
      yield serializers.serialize(
        object.partnerRefreshToken,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.partnerRefreshTokenExpiry != null) {
      yield r'partner_refresh_token_expiry';
      yield serializers.serialize(
        object.partnerRefreshTokenExpiry,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.scopes != null) {
      yield r'scopes';
      yield serializers.serialize(
        object.scopes,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    IntegrationRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required IntegrationRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'additional_id_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.additionalId1 = valueDes;
          break;
        case r'connected_advertiser_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.connectedAdvertiserId = valueDes;
          break;
        case r'connected_lba_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.connectedLbaId = valueDes;
          break;
        case r'connected_merchant_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.connectedMerchantId = valueDes;
          break;
        case r'connected_tag_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.connectedTagId = valueDes;
          break;
        case r'connected_user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.connectedUserId = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'external_business_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.externalBusinessId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'partner_access_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerAccessToken = valueDes;
          break;
        case r'partner_access_token_expiry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.partnerAccessTokenExpiry = valueDes;
          break;
        case r'partner_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerMetadata = valueDes;
          break;
        case r'partner_primary_email':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerPrimaryEmail = valueDes;
          break;
        case r'partner_refresh_token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.partnerRefreshToken = valueDes;
          break;
        case r'partner_refresh_token_expiry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.partnerRefreshTokenExpiry = valueDes;
          break;
        case r'scopes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.scopes = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  IntegrationRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = IntegrationRecordBuilder();
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

