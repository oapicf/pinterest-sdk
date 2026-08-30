//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_ad_preview.g.dart';

/// Campaign ad preview record.
///
/// Properties:
/// * [adAccountId] - Advertiser ID for this preview.
/// * [adGroupId] - Ad group ID to create a preview record for.
/// * [clientId] - Client ID that created preview.
/// * [expiresAt] - Unix timestamp in milliseconds for preview expiration.
/// * [isActive] - Whether preview link is active.
/// * [pinId] - Pin ID for pin promotion preview.
/// * [pinPromotionId] - Pin promotion ID for this preview.
/// * [promotedProductGroupId] - Promoted product group ID for catalog previews.
/// * [url] - Campaign ad preview URL.
/// * [userId] - User ID that created preview.
/// * [uuid] - Pin promotion preview key.
@BuiltValue()
abstract class CampaignAdPreview implements Built<CampaignAdPreview, CampaignAdPreviewBuilder> {
  /// Advertiser ID for this preview.
  @BuiltValueField(wireName: r'ad_account_id')
  String get adAccountId;

  /// Ad group ID to create a preview record for.
  @BuiltValueField(wireName: r'ad_group_id')
  String get adGroupId;

  /// Client ID that created preview.
  @BuiltValueField(wireName: r'client_id')
  int? get clientId;

  /// Unix timestamp in milliseconds for preview expiration.
  @BuiltValueField(wireName: r'expires_at')
  int get expiresAt;

  /// Whether preview link is active.
  @BuiltValueField(wireName: r'is_active')
  bool get isActive;

  /// Pin ID for pin promotion preview.
  @BuiltValueField(wireName: r'pin_id')
  int? get pinId;

  /// Pin promotion ID for this preview.
  @BuiltValueField(wireName: r'pin_promotion_id')
  int? get pinPromotionId;

  /// Promoted product group ID for catalog previews.
  @BuiltValueField(wireName: r'promoted_product_group_id')
  int? get promotedProductGroupId;

  /// Campaign ad preview URL.
  @BuiltValueField(wireName: r'url')
  String get url;

  /// User ID that created preview.
  @BuiltValueField(wireName: r'user_id')
  int get userId;

  /// Pin promotion preview key.
  @BuiltValueField(wireName: r'uuid')
  String get uuid;

  CampaignAdPreview._();

  factory CampaignAdPreview([void updates(CampaignAdPreviewBuilder b)]) = _$CampaignAdPreview;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignAdPreviewBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignAdPreview> get serializer => _$CampaignAdPreviewSerializer();
}

class _$CampaignAdPreviewSerializer implements PrimitiveSerializer<CampaignAdPreview> {
  @override
  final Iterable<Type> types = const [CampaignAdPreview, _$CampaignAdPreview];

  @override
  final String wireName = r'CampaignAdPreview';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignAdPreview object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_account_id';
    yield serializers.serialize(
      object.adAccountId,
      specifiedType: const FullType(String),
    );
    yield r'ad_group_id';
    yield serializers.serialize(
      object.adGroupId,
      specifiedType: const FullType(String),
    );
    if (object.clientId != null) {
      yield r'client_id';
      yield serializers.serialize(
        object.clientId,
        specifiedType: const FullType(int),
      );
    }
    yield r'expires_at';
    yield serializers.serialize(
      object.expiresAt,
      specifiedType: const FullType(int),
    );
    yield r'is_active';
    yield serializers.serialize(
      object.isActive,
      specifiedType: const FullType(bool),
    );
    if (object.pinId != null) {
      yield r'pin_id';
      yield serializers.serialize(
        object.pinId,
        specifiedType: const FullType(int),
      );
    }
    if (object.pinPromotionId != null) {
      yield r'pin_promotion_id';
      yield serializers.serialize(
        object.pinPromotionId,
        specifiedType: const FullType(int),
      );
    }
    if (object.promotedProductGroupId != null) {
      yield r'promoted_product_group_id';
      yield serializers.serialize(
        object.promotedProductGroupId,
        specifiedType: const FullType(int),
      );
    }
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
    yield r'user_id';
    yield serializers.serialize(
      object.userId,
      specifiedType: const FullType(int),
    );
    yield r'uuid';
    yield serializers.serialize(
      object.uuid,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignAdPreview object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignAdPreviewBuilder result,
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
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        case r'client_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.clientId = valueDes;
          break;
        case r'expires_at':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.expiresAt = valueDes;
          break;
        case r'is_active':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isActive = valueDes;
          break;
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pinId = valueDes;
          break;
        case r'pin_promotion_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.pinPromotionId = valueDes;
          break;
        case r'promoted_product_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.promotedProductGroupId = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        case r'user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.userId = valueDes;
          break;
        case r'uuid':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.uuid = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignAdPreview deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignAdPreviewBuilder();
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

