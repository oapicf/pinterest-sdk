//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/customizable_cta_type.dart';
import 'package:openapi/src/model/ad_shopping_preview_creative_type.dart';
import 'package:openapi/src/model/base_preferred_media_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_preview_shopping.g.dart';

/// Ad preview from a catalog product group (shopping).
///
/// Properties:
/// * [catalogProductGroupId] - Catalog Product Group Id.
/// * [creativeType] - Ad format of the shopping ad preview.
/// * [customizableCtaType] - Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
/// * [heroImageTitle] - Title displayed below ad.
/// * [heroImageUrl] - Hero image URL.
/// * [heroPinId] - Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
/// * [imageTag] - Multi image template tag.
/// * [itemId] - Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
/// * [preferredMediaType] - Preferred media type.
/// * [showPromotion] - Include promotion data in preview when available on catalog item. Defaults to false.
/// * [videoTag] - Multi video template tag, image_tag and video_tag are mutual exclusive.
@BuiltValue()
abstract class AdPreviewShopping implements Built<AdPreviewShopping, AdPreviewShoppingBuilder> {
  /// Catalog Product Group Id.
  @BuiltValueField(wireName: r'catalog_product_group_id')
  String get catalogProductGroupId;

  /// Ad format of the shopping ad preview.
  @BuiltValueField(wireName: r'creative_type')
  AdShoppingPreviewCreativeType get creativeType;
  // enum creativeTypeEnum {  SHOPPING,  COLLECTION,  CAROUSEL,  MAX_WIDTH_COLLECTION,  };

  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
  @BuiltValueField(wireName: r'customizable_cta_type')
  CustomizableCTAType? get customizableCtaType;
  // enum customizableCtaTypeEnum {  GET_OFFER,  LEARN_MORE,  ORDER_NOW,  SHOP_NOW,  SIGN_UP,  SUBSCRIBE,  BUY_NOW,  CONTACT_US,  GET_QUOTE,  VISIT_SITE,  APPLY_NOW,  BOOK_NOW,  REQUEST_DEMO,  REGISTER_NOW,  FIND_A_DEALER,  ADD_TO_CART,  WATCH_NOW,  READ_MORE,  BUY_TICKETS,  DONATE_NOW,  DOWNLOAD,  EXPLORE_MORE,  FIND_A_LOCATION,  FIND_RETAILERS,  GET_DEAL,  GET_RECIPE,  GET_SHOWTIMES,  ON_SALE,  PLAY_GAME,  TRY_IT,  TAKE_A_PEEK,  ,  };

  /// Title displayed below ad.
  @BuiltValueField(wireName: r'hero_image_title')
  String? get heroImageTitle;

  /// Hero image URL.
  @BuiltValueField(wireName: r'hero_image_url')
  String? get heroImageUrl;

  /// Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
  @BuiltValueField(wireName: r'hero_pin_id')
  String? get heroPinId;

  /// Multi image template tag.
  @BuiltValueField(wireName: r'image_tag')
  String? get imageTag;

  /// Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  /// Preferred media type.
  @BuiltValueField(wireName: r'preferred_media_type')
  BasePreferredMediaType? get preferredMediaType;
  // enum preferredMediaTypeEnum {  VIDEO,  IMAGE,  };

  /// Include promotion data in preview when available on catalog item. Defaults to false.
  @BuiltValueField(wireName: r'show_promotion')
  bool? get showPromotion;

  /// Multi video template tag, image_tag and video_tag are mutual exclusive.
  @BuiltValueField(wireName: r'video_tag')
  String? get videoTag;

  AdPreviewShopping._();

  factory AdPreviewShopping([void updates(AdPreviewShoppingBuilder b)]) = _$AdPreviewShopping;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdPreviewShoppingBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdPreviewShopping> get serializer => _$AdPreviewShoppingSerializer();
}

class _$AdPreviewShoppingSerializer implements PrimitiveSerializer<AdPreviewShopping> {
  @override
  final Iterable<Type> types = const [AdPreviewShopping, _$AdPreviewShopping];

  @override
  final String wireName = r'AdPreviewShopping';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdPreviewShopping object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_product_group_id';
    yield serializers.serialize(
      object.catalogProductGroupId,
      specifiedType: const FullType(String),
    );
    yield r'creative_type';
    yield serializers.serialize(
      object.creativeType,
      specifiedType: const FullType(AdShoppingPreviewCreativeType),
    );
    if (object.customizableCtaType != null) {
      yield r'customizable_cta_type';
      yield serializers.serialize(
        object.customizableCtaType,
        specifiedType: const FullType.nullable(CustomizableCTAType),
      );
    }
    if (object.heroImageTitle != null) {
      yield r'hero_image_title';
      yield serializers.serialize(
        object.heroImageTitle,
        specifiedType: const FullType(String),
      );
    }
    if (object.heroImageUrl != null) {
      yield r'hero_image_url';
      yield serializers.serialize(
        object.heroImageUrl,
        specifiedType: const FullType(String),
      );
    }
    if (object.heroPinId != null) {
      yield r'hero_pin_id';
      yield serializers.serialize(
        object.heroPinId,
        specifiedType: const FullType(String),
      );
    }
    if (object.imageTag != null) {
      yield r'image_tag';
      yield serializers.serialize(
        object.imageTag,
        specifiedType: const FullType(String),
      );
    }
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
    if (object.preferredMediaType != null) {
      yield r'preferred_media_type';
      yield serializers.serialize(
        object.preferredMediaType,
        specifiedType: const FullType(BasePreferredMediaType),
      );
    }
    if (object.showPromotion != null) {
      yield r'show_promotion';
      yield serializers.serialize(
        object.showPromotion,
        specifiedType: const FullType(bool),
      );
    }
    if (object.videoTag != null) {
      yield r'video_tag';
      yield serializers.serialize(
        object.videoTag,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdPreviewShopping object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdPreviewShoppingBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_product_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogProductGroupId = valueDes;
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdShoppingPreviewCreativeType),
          ) as AdShoppingPreviewCreativeType;
          result.creativeType = valueDes;
          break;
        case r'customizable_cta_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CustomizableCTAType),
          ) as CustomizableCTAType?;
          if (valueDes == null) continue;
          result.customizableCtaType = valueDes;
          break;
        case r'hero_image_title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.heroImageTitle = valueDes;
          break;
        case r'hero_image_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.heroImageUrl = valueDes;
          break;
        case r'hero_pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.heroPinId = valueDes;
          break;
        case r'image_tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.imageTag = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemId = valueDes;
          break;
        case r'preferred_media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BasePreferredMediaType),
          ) as BasePreferredMediaType?;
          if (valueDes == null) continue;
          result.preferredMediaType = valueDes;
          break;
        case r'show_promotion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.showPromotion = valueDes;
          break;
        case r'video_tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.videoTag = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdPreviewShopping deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdPreviewShoppingBuilder();
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

