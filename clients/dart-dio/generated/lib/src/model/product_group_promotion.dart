//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/grid_click_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/creative_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_promotion.g.dart';

/// ProductGroupPromotion
///
/// Properties:
/// * [adGroupId] - ID of the ad group the product group belongs to.
/// * [bidInMicroCurrency] - The bid in micro currency.
/// * [catalogProductGroupId] - ID of the catalogs product group that this product group promotion references
/// * [catalogProductGroupName] - Catalogs product group name
/// * [collectionsHeaderType] - Collections ad header type
/// * [collectionsHeroDestinationUrl] - Collections Hero Destination Url
/// * [collectionsHeroPinId] - Hero Pin ID if this PG is promoted as a Collection
/// * [creativeType] 
/// * [customizableCtaType] - Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
/// * [definition] - The full product group definition path
/// * [gridClickType] 
/// * [id] - ID of the product group promotion.
/// * [included] - True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
/// * [isGenerateBackground] - Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
/// * [isMdl] - If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
/// * [parentId] - The parent Product Group ID of this Product Group
/// * [preferredMediaType] - Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
/// * [relativeDefinition] - The definition of the product group, relative to its parent - an attribute name/value pair
/// * [selectedImageTag] - The ad image tag selected for the product group promotion.
/// * [selectedVideoTag] - The ad video tag selected for the product group promotion.
/// * [slideshowCollectionsDescription] - Slideshow Collections Description
/// * [slideshowCollectionsTitle] - Slideshow Collections Title
/// * [status] 
/// * [trackingUrl] - Tracking template for proudct group promotions. 4000 limit
@BuiltValue()
abstract class ProductGroupPromotion implements Built<ProductGroupPromotion, ProductGroupPromotionBuilder> {
  /// ID of the ad group the product group belongs to.
  @BuiltValueField(wireName: r'ad_group_id')
  String? get adGroupId;

  /// The bid in micro currency.
  @BuiltValueField(wireName: r'bid_in_micro_currency')
  int? get bidInMicroCurrency;

  /// ID of the catalogs product group that this product group promotion references
  @BuiltValueField(wireName: r'catalog_product_group_id')
  String? get catalogProductGroupId;

  /// Catalogs product group name
  @BuiltValueField(wireName: r'catalog_product_group_name')
  String? get catalogProductGroupName;

  /// Collections ad header type
  @BuiltValueField(wireName: r'collections_header_type')
  ProductGroupPromotionCollectionsHeaderTypeEnum? get collectionsHeaderType;
  // enum collectionsHeaderTypeEnum {  SHOP_THIS_COLLECTION,  EXPLORE_THIS_COLLECTION,  NO_HEADER,  ON_SALE,  GET_DEAL,  ,  };

  /// Collections Hero Destination Url
  @BuiltValueField(wireName: r'collections_hero_destination_url')
  String? get collectionsHeroDestinationUrl;

  /// Hero Pin ID if this PG is promoted as a Collection
  @BuiltValueField(wireName: r'collections_hero_pin_id')
  String? get collectionsHeroPinId;

  @BuiltValueField(wireName: r'creative_type')
  CreativeType? get creativeType;
  // enum creativeTypeEnum {  REGULAR,  VIDEO,  SHOPPING,  CAROUSEL,  MAX_VIDEO,  SHOP_THE_PIN,  COLLECTION,  IDEA,  SHOWCASE,  QUIZ,  COLLAGE,  MAX_WIDTH_REGULAR_COLLECTION,  MAX_WIDTH_VIDEO_COLLECTION,  };

  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueField(wireName: r'customizable_cta_type')
  ProductGroupPromotionCustomizableCtaTypeEnum? get customizableCtaType;
  // enum customizableCtaTypeEnum {  SHOP_NOW,  BOOK_NOW,  ON_SALE,  GET_DEAL,  BUY_ONLINE_PICKUP_IN_STORE,  ,  };

  /// The full product group definition path
  @BuiltValueField(wireName: r'definition')
  String? get definition;

  @BuiltValueField(wireName: r'grid_click_type')
  GridClickType? get gridClickType;
  // enum gridClickTypeEnum {  CLOSEUP,  DIRECT_TO_DESTINATION,  };

  /// ID of the product group promotion.
  @BuiltValueField(wireName: r'id')
  String? get id;

  /// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  @BuiltValueField(wireName: r'included')
  bool? get included;

  /// Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  @BuiltValueField(wireName: r'is_generate_background')
  bool? get isGenerateBackground;

  /// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  @BuiltValueField(wireName: r'is_mdl')
  bool? get isMdl;

  /// The parent Product Group ID of this Product Group
  @BuiltValueField(wireName: r'parent_id')
  String? get parentId;

  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  @BuiltValueField(wireName: r'preferred_media_type')
  ProductGroupPromotionPreferredMediaTypeEnum? get preferredMediaType;
  // enum preferredMediaTypeEnum {  VIDEO,  IMAGE,  ,  };

  /// The definition of the product group, relative to its parent - an attribute name/value pair
  @BuiltValueField(wireName: r'relative_definition')
  String? get relativeDefinition;

  /// The ad image tag selected for the product group promotion.
  @BuiltValueField(wireName: r'selected_image_tag')
  String? get selectedImageTag;

  /// The ad video tag selected for the product group promotion.
  @BuiltValueField(wireName: r'selected_video_tag')
  String? get selectedVideoTag;

  /// Slideshow Collections Description
  @BuiltValueField(wireName: r'slideshow_collections_description')
  String? get slideshowCollectionsDescription;

  /// Slideshow Collections Title
  @BuiltValueField(wireName: r'slideshow_collections_title')
  String? get slideshowCollectionsTitle;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  /// Tracking template for proudct group promotions. 4000 limit
  @BuiltValueField(wireName: r'tracking_url')
  String? get trackingUrl;

  ProductGroupPromotion._();

  factory ProductGroupPromotion([void updates(ProductGroupPromotionBuilder b)]) = _$ProductGroupPromotion;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupPromotionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupPromotion> get serializer => _$ProductGroupPromotionSerializer();
}

class _$ProductGroupPromotionSerializer implements PrimitiveSerializer<ProductGroupPromotion> {
  @override
  final Iterable<Type> types = const [ProductGroupPromotion, _$ProductGroupPromotion];

  @override
  final String wireName = r'ProductGroupPromotion';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupPromotion object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroupId != null) {
      yield r'ad_group_id';
      yield serializers.serialize(
        object.adGroupId,
        specifiedType: const FullType(String),
      );
    }
    if (object.bidInMicroCurrency != null) {
      yield r'bid_in_micro_currency';
      yield serializers.serialize(
        object.bidInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.catalogProductGroupId != null) {
      yield r'catalog_product_group_id';
      yield serializers.serialize(
        object.catalogProductGroupId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.catalogProductGroupName != null) {
      yield r'catalog_product_group_name';
      yield serializers.serialize(
        object.catalogProductGroupName,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.collectionsHeaderType != null) {
      yield r'collections_header_type';
      yield serializers.serialize(
        object.collectionsHeaderType,
        specifiedType: const FullType.nullable(ProductGroupPromotionCollectionsHeaderTypeEnum),
      );
    }
    if (object.collectionsHeroDestinationUrl != null) {
      yield r'collections_hero_destination_url';
      yield serializers.serialize(
        object.collectionsHeroDestinationUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.collectionsHeroPinId != null) {
      yield r'collections_hero_pin_id';
      yield serializers.serialize(
        object.collectionsHeroPinId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.creativeType != null) {
      yield r'creative_type';
      yield serializers.serialize(
        object.creativeType,
        specifiedType: const FullType(CreativeType),
      );
    }
    if (object.customizableCtaType != null) {
      yield r'customizable_cta_type';
      yield serializers.serialize(
        object.customizableCtaType,
        specifiedType: const FullType.nullable(ProductGroupPromotionCustomizableCtaTypeEnum),
      );
    }
    if (object.definition != null) {
      yield r'definition';
      yield serializers.serialize(
        object.definition,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.gridClickType != null) {
      yield r'grid_click_type';
      yield serializers.serialize(
        object.gridClickType,
        specifiedType: const FullType.nullable(GridClickType),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.included != null) {
      yield r'included';
      yield serializers.serialize(
        object.included,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isGenerateBackground != null) {
      yield r'is_generate_background';
      yield serializers.serialize(
        object.isGenerateBackground,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isMdl != null) {
      yield r'is_mdl';
      yield serializers.serialize(
        object.isMdl,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.parentId != null) {
      yield r'parent_id';
      yield serializers.serialize(
        object.parentId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.preferredMediaType != null) {
      yield r'preferred_media_type';
      yield serializers.serialize(
        object.preferredMediaType,
        specifiedType: const FullType.nullable(ProductGroupPromotionPreferredMediaTypeEnum),
      );
    }
    if (object.relativeDefinition != null) {
      yield r'relative_definition';
      yield serializers.serialize(
        object.relativeDefinition,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.selectedImageTag != null) {
      yield r'selected_image_tag';
      yield serializers.serialize(
        object.selectedImageTag,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.selectedVideoTag != null) {
      yield r'selected_video_tag';
      yield serializers.serialize(
        object.selectedVideoTag,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.slideshowCollectionsDescription != null) {
      yield r'slideshow_collections_description';
      yield serializers.serialize(
        object.slideshowCollectionsDescription,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.slideshowCollectionsTitle != null) {
      yield r'slideshow_collections_title';
      yield serializers.serialize(
        object.slideshowCollectionsTitle,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
    if (object.trackingUrl != null) {
      yield r'tracking_url';
      yield serializers.serialize(
        object.trackingUrl,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupPromotion object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupPromotionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        case r'bid_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bidInMicroCurrency = valueDes;
          break;
        case r'catalog_product_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogProductGroupId = valueDes;
          break;
        case r'catalog_product_group_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.catalogProductGroupName = valueDes;
          break;
        case r'collections_header_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ProductGroupPromotionCollectionsHeaderTypeEnum),
          ) as ProductGroupPromotionCollectionsHeaderTypeEnum?;
          if (valueDes == null) continue;
          result.collectionsHeaderType = valueDes;
          break;
        case r'collections_hero_destination_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectionsHeroDestinationUrl = valueDes;
          break;
        case r'collections_hero_pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.collectionsHeroPinId = valueDes;
          break;
        case r'creative_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CreativeType),
          ) as CreativeType;
          result.creativeType = valueDes;
          break;
        case r'customizable_cta_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ProductGroupPromotionCustomizableCtaTypeEnum),
          ) as ProductGroupPromotionCustomizableCtaTypeEnum?;
          if (valueDes == null) continue;
          result.customizableCtaType = valueDes;
          break;
        case r'definition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.definition = valueDes;
          break;
        case r'grid_click_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(GridClickType),
          ) as GridClickType?;
          if (valueDes == null) continue;
          result.gridClickType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'included':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.included = valueDes;
          break;
        case r'is_generate_background':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isGenerateBackground = valueDes;
          break;
        case r'is_mdl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isMdl = valueDes;
          break;
        case r'parent_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.parentId = valueDes;
          break;
        case r'preferred_media_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ProductGroupPromotionPreferredMediaTypeEnum),
          ) as ProductGroupPromotionPreferredMediaTypeEnum?;
          if (valueDes == null) continue;
          result.preferredMediaType = valueDes;
          break;
        case r'relative_definition':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.relativeDefinition = valueDes;
          break;
        case r'selected_image_tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.selectedImageTag = valueDes;
          break;
        case r'selected_video_tag':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.selectedVideoTag = valueDes;
          break;
        case r'slideshow_collections_description':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.slideshowCollectionsDescription = valueDes;
          break;
        case r'slideshow_collections_title':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.slideshowCollectionsTitle = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        case r'tracking_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.trackingUrl = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupPromotion deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupPromotionBuilder();
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

class ProductGroupPromotionCollectionsHeaderTypeEnum extends EnumClass {

  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'SHOP_THIS_COLLECTION')
  static const ProductGroupPromotionCollectionsHeaderTypeEnum SHOP_THIS_COLLECTION = _$productGroupPromotionCollectionsHeaderTypeEnum_SHOP_THIS_COLLECTION;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'EXPLORE_THIS_COLLECTION')
  static const ProductGroupPromotionCollectionsHeaderTypeEnum EXPLORE_THIS_COLLECTION = _$productGroupPromotionCollectionsHeaderTypeEnum_EXPLORE_THIS_COLLECTION;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'NO_HEADER')
  static const ProductGroupPromotionCollectionsHeaderTypeEnum NO_HEADER = _$productGroupPromotionCollectionsHeaderTypeEnum_NO_HEADER;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'ON_SALE')
  static const ProductGroupPromotionCollectionsHeaderTypeEnum ON_SALE = _$productGroupPromotionCollectionsHeaderTypeEnum_ON_SALE;
  /// Collections ad header type
  @BuiltValueEnumConst(wireName: r'GET_DEAL')
  static const ProductGroupPromotionCollectionsHeaderTypeEnum GET_DEAL = _$productGroupPromotionCollectionsHeaderTypeEnum_GET_DEAL;

  static Serializer<ProductGroupPromotionCollectionsHeaderTypeEnum> get serializer => _$productGroupPromotionCollectionsHeaderTypeEnumSerializer;

  const ProductGroupPromotionCollectionsHeaderTypeEnum._(String name): super(name);

  static BuiltSet<ProductGroupPromotionCollectionsHeaderTypeEnum> get values => _$productGroupPromotionCollectionsHeaderTypeEnumValues;
  static ProductGroupPromotionCollectionsHeaderTypeEnum valueOf(String name) => _$productGroupPromotionCollectionsHeaderTypeEnumValueOf(name);
}

class ProductGroupPromotionCustomizableCtaTypeEnum extends EnumClass {

  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueEnumConst(wireName: r'SHOP_NOW')
  static const ProductGroupPromotionCustomizableCtaTypeEnum SHOP_NOW = _$productGroupPromotionCustomizableCtaTypeEnum_SHOP_NOW;
  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueEnumConst(wireName: r'BOOK_NOW')
  static const ProductGroupPromotionCustomizableCtaTypeEnum BOOK_NOW = _$productGroupPromotionCustomizableCtaTypeEnum_BOOK_NOW;
  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueEnumConst(wireName: r'ON_SALE')
  static const ProductGroupPromotionCustomizableCtaTypeEnum ON_SALE = _$productGroupPromotionCustomizableCtaTypeEnum_ON_SALE;
  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueEnumConst(wireName: r'GET_DEAL')
  static const ProductGroupPromotionCustomizableCtaTypeEnum GET_DEAL = _$productGroupPromotionCustomizableCtaTypeEnum_GET_DEAL;
  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  @BuiltValueEnumConst(wireName: r'BUY_ONLINE_PICKUP_IN_STORE')
  static const ProductGroupPromotionCustomizableCtaTypeEnum BUY_ONLINE_PICKUP_IN_STORE = _$productGroupPromotionCustomizableCtaTypeEnum_BUY_ONLINE_PICKUP_IN_STORE;

  static Serializer<ProductGroupPromotionCustomizableCtaTypeEnum> get serializer => _$productGroupPromotionCustomizableCtaTypeEnumSerializer;

  const ProductGroupPromotionCustomizableCtaTypeEnum._(String name): super(name);

  static BuiltSet<ProductGroupPromotionCustomizableCtaTypeEnum> get values => _$productGroupPromotionCustomizableCtaTypeEnumValues;
  static ProductGroupPromotionCustomizableCtaTypeEnum valueOf(String name) => _$productGroupPromotionCustomizableCtaTypeEnumValueOf(name);
}

class ProductGroupPromotionPreferredMediaTypeEnum extends EnumClass {

  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const ProductGroupPromotionPreferredMediaTypeEnum VIDEO = _$productGroupPromotionPreferredMediaTypeEnum_VIDEO;
  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  @BuiltValueEnumConst(wireName: r'IMAGE')
  static const ProductGroupPromotionPreferredMediaTypeEnum IMAGE = _$productGroupPromotionPreferredMediaTypeEnum_IMAGE;

  static Serializer<ProductGroupPromotionPreferredMediaTypeEnum> get serializer => _$productGroupPromotionPreferredMediaTypeEnumSerializer;

  const ProductGroupPromotionPreferredMediaTypeEnum._(String name): super(name);

  static BuiltSet<ProductGroupPromotionPreferredMediaTypeEnum> get values => _$productGroupPromotionPreferredMediaTypeEnumValues;
  static ProductGroupPromotionPreferredMediaTypeEnum valueOf(String name) => _$productGroupPromotionPreferredMediaTypeEnumValueOf(name);
}

