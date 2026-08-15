//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ProductGroupPromotion {
  /// Returns a new [ProductGroupPromotion] instance.
  ProductGroupPromotion({
    this.adGroupId,
    this.bidInMicroCurrency,
    this.catalogProductGroupId,
    this.catalogProductGroupName,
    this.collectionsHeaderType,
    this.collectionsHeroDestinationUrl,
    this.collectionsHeroPinId,
    this.creativeType,
    this.customizableCtaType,
    this.definition,
    this.gridClickType,
    this.id,
    this.included,
    this.isGenerateBackground,
    this.isMdl,
    this.parentId,
    this.preferredMediaType,
    this.relativeDefinition,
    this.selectedImageTag,
    this.selectedVideoTag,
    this.slideshowCollectionsDescription,
    this.slideshowCollectionsTitle,
    this.status,
    this.trackingUrl,
  });

  /// ID of the ad group the product group belongs to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adGroupId;

  /// The bid in micro currency.
  int? bidInMicroCurrency;

  /// ID of the catalogs product group that this product group promotion references
  String? catalogProductGroupId;

  /// Catalogs product group name
  String? catalogProductGroupName;

  /// Collections ad header type
  ProductGroupPromotionCollectionsHeaderTypeEnum? collectionsHeaderType;

  /// Collections Hero Destination Url
  String? collectionsHeroDestinationUrl;

  /// Hero Pin ID if this PG is promoted as a Collection
  String? collectionsHeroPinId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreativeType? creativeType;

  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
  ProductGroupPromotionCustomizableCtaTypeEnum? customizableCtaType;

  /// The full product group definition path
  String? definition;

  GridClickType? gridClickType;

  /// ID of the product group promotion.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  bool? included;

  /// Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  bool? isGenerateBackground;

  /// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  bool? isMdl;

  /// The parent Product Group ID of this Product Group
  String? parentId;

  /// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  ProductGroupPromotionPreferredMediaTypeEnum? preferredMediaType;

  /// The definition of the product group, relative to its parent - an attribute name/value pair
  String? relativeDefinition;

  /// The ad image tag selected for the product group promotion.
  String? selectedImageTag;

  /// The ad video tag selected for the product group promotion.
  String? selectedVideoTag;

  /// Slideshow Collections Description
  String? slideshowCollectionsDescription;

  /// Slideshow Collections Title
  String? slideshowCollectionsTitle;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  /// Tracking template for proudct group promotions. 4000 limit
  String? trackingUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ProductGroupPromotion &&
    other.adGroupId == adGroupId &&
    other.bidInMicroCurrency == bidInMicroCurrency &&
    other.catalogProductGroupId == catalogProductGroupId &&
    other.catalogProductGroupName == catalogProductGroupName &&
    other.collectionsHeaderType == collectionsHeaderType &&
    other.collectionsHeroDestinationUrl == collectionsHeroDestinationUrl &&
    other.collectionsHeroPinId == collectionsHeroPinId &&
    other.creativeType == creativeType &&
    other.customizableCtaType == customizableCtaType &&
    other.definition == definition &&
    other.gridClickType == gridClickType &&
    other.id == id &&
    other.included == included &&
    other.isGenerateBackground == isGenerateBackground &&
    other.isMdl == isMdl &&
    other.parentId == parentId &&
    other.preferredMediaType == preferredMediaType &&
    other.relativeDefinition == relativeDefinition &&
    other.selectedImageTag == selectedImageTag &&
    other.selectedVideoTag == selectedVideoTag &&
    other.slideshowCollectionsDescription == slideshowCollectionsDescription &&
    other.slideshowCollectionsTitle == slideshowCollectionsTitle &&
    other.status == status &&
    other.trackingUrl == trackingUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adGroupId == null ? 0 : adGroupId!.hashCode) +
    (bidInMicroCurrency == null ? 0 : bidInMicroCurrency!.hashCode) +
    (catalogProductGroupId == null ? 0 : catalogProductGroupId!.hashCode) +
    (catalogProductGroupName == null ? 0 : catalogProductGroupName!.hashCode) +
    (collectionsHeaderType == null ? 0 : collectionsHeaderType!.hashCode) +
    (collectionsHeroDestinationUrl == null ? 0 : collectionsHeroDestinationUrl!.hashCode) +
    (collectionsHeroPinId == null ? 0 : collectionsHeroPinId!.hashCode) +
    (creativeType == null ? 0 : creativeType!.hashCode) +
    (customizableCtaType == null ? 0 : customizableCtaType!.hashCode) +
    (definition == null ? 0 : definition!.hashCode) +
    (gridClickType == null ? 0 : gridClickType!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (included == null ? 0 : included!.hashCode) +
    (isGenerateBackground == null ? 0 : isGenerateBackground!.hashCode) +
    (isMdl == null ? 0 : isMdl!.hashCode) +
    (parentId == null ? 0 : parentId!.hashCode) +
    (preferredMediaType == null ? 0 : preferredMediaType!.hashCode) +
    (relativeDefinition == null ? 0 : relativeDefinition!.hashCode) +
    (selectedImageTag == null ? 0 : selectedImageTag!.hashCode) +
    (selectedVideoTag == null ? 0 : selectedVideoTag!.hashCode) +
    (slideshowCollectionsDescription == null ? 0 : slideshowCollectionsDescription!.hashCode) +
    (slideshowCollectionsTitle == null ? 0 : slideshowCollectionsTitle!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (trackingUrl == null ? 0 : trackingUrl!.hashCode);

  @override
  String toString() => 'ProductGroupPromotion[adGroupId=$adGroupId, bidInMicroCurrency=$bidInMicroCurrency, catalogProductGroupId=$catalogProductGroupId, catalogProductGroupName=$catalogProductGroupName, collectionsHeaderType=$collectionsHeaderType, collectionsHeroDestinationUrl=$collectionsHeroDestinationUrl, collectionsHeroPinId=$collectionsHeroPinId, creativeType=$creativeType, customizableCtaType=$customizableCtaType, definition=$definition, gridClickType=$gridClickType, id=$id, included=$included, isGenerateBackground=$isGenerateBackground, isMdl=$isMdl, parentId=$parentId, preferredMediaType=$preferredMediaType, relativeDefinition=$relativeDefinition, selectedImageTag=$selectedImageTag, selectedVideoTag=$selectedVideoTag, slideshowCollectionsDescription=$slideshowCollectionsDescription, slideshowCollectionsTitle=$slideshowCollectionsTitle, status=$status, trackingUrl=$trackingUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adGroupId != null) {
      json[r'ad_group_id'] = this.adGroupId;
    } else {
      json[r'ad_group_id'] = null;
    }
    if (this.bidInMicroCurrency != null) {
      json[r'bid_in_micro_currency'] = this.bidInMicroCurrency;
    } else {
      json[r'bid_in_micro_currency'] = null;
    }
    if (this.catalogProductGroupId != null) {
      json[r'catalog_product_group_id'] = this.catalogProductGroupId;
    } else {
      json[r'catalog_product_group_id'] = null;
    }
    if (this.catalogProductGroupName != null) {
      json[r'catalog_product_group_name'] = this.catalogProductGroupName;
    } else {
      json[r'catalog_product_group_name'] = null;
    }
    if (this.collectionsHeaderType != null) {
      json[r'collections_header_type'] = this.collectionsHeaderType;
    } else {
      json[r'collections_header_type'] = null;
    }
    if (this.collectionsHeroDestinationUrl != null) {
      json[r'collections_hero_destination_url'] = this.collectionsHeroDestinationUrl;
    } else {
      json[r'collections_hero_destination_url'] = null;
    }
    if (this.collectionsHeroPinId != null) {
      json[r'collections_hero_pin_id'] = this.collectionsHeroPinId;
    } else {
      json[r'collections_hero_pin_id'] = null;
    }
    if (this.creativeType != null) {
      json[r'creative_type'] = this.creativeType;
    } else {
      json[r'creative_type'] = null;
    }
    if (this.customizableCtaType != null) {
      json[r'customizable_cta_type'] = this.customizableCtaType;
    } else {
      json[r'customizable_cta_type'] = null;
    }
    if (this.definition != null) {
      json[r'definition'] = this.definition;
    } else {
      json[r'definition'] = null;
    }
    if (this.gridClickType != null) {
      json[r'grid_click_type'] = this.gridClickType;
    } else {
      json[r'grid_click_type'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.included != null) {
      json[r'included'] = this.included;
    } else {
      json[r'included'] = null;
    }
    if (this.isGenerateBackground != null) {
      json[r'is_generate_background'] = this.isGenerateBackground;
    } else {
      json[r'is_generate_background'] = null;
    }
    if (this.isMdl != null) {
      json[r'is_mdl'] = this.isMdl;
    } else {
      json[r'is_mdl'] = null;
    }
    if (this.parentId != null) {
      json[r'parent_id'] = this.parentId;
    } else {
      json[r'parent_id'] = null;
    }
    if (this.preferredMediaType != null) {
      json[r'preferred_media_type'] = this.preferredMediaType;
    } else {
      json[r'preferred_media_type'] = null;
    }
    if (this.relativeDefinition != null) {
      json[r'relative_definition'] = this.relativeDefinition;
    } else {
      json[r'relative_definition'] = null;
    }
    if (this.selectedImageTag != null) {
      json[r'selected_image_tag'] = this.selectedImageTag;
    } else {
      json[r'selected_image_tag'] = null;
    }
    if (this.selectedVideoTag != null) {
      json[r'selected_video_tag'] = this.selectedVideoTag;
    } else {
      json[r'selected_video_tag'] = null;
    }
    if (this.slideshowCollectionsDescription != null) {
      json[r'slideshow_collections_description'] = this.slideshowCollectionsDescription;
    } else {
      json[r'slideshow_collections_description'] = null;
    }
    if (this.slideshowCollectionsTitle != null) {
      json[r'slideshow_collections_title'] = this.slideshowCollectionsTitle;
    } else {
      json[r'slideshow_collections_title'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.trackingUrl != null) {
      json[r'tracking_url'] = this.trackingUrl;
    } else {
      json[r'tracking_url'] = null;
    }
    return json;
  }

  /// Returns a new [ProductGroupPromotion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ProductGroupPromotion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ProductGroupPromotion[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ProductGroupPromotion[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ProductGroupPromotion(
        adGroupId: mapValueOfType<String>(json, r'ad_group_id'),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        catalogProductGroupId: mapValueOfType<String>(json, r'catalog_product_group_id'),
        catalogProductGroupName: mapValueOfType<String>(json, r'catalog_product_group_name'),
        collectionsHeaderType: ProductGroupPromotionCollectionsHeaderTypeEnum.fromJson(json[r'collections_header_type']),
        collectionsHeroDestinationUrl: mapValueOfType<String>(json, r'collections_hero_destination_url'),
        collectionsHeroPinId: mapValueOfType<String>(json, r'collections_hero_pin_id'),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
        customizableCtaType: ProductGroupPromotionCustomizableCtaTypeEnum.fromJson(json[r'customizable_cta_type']),
        definition: mapValueOfType<String>(json, r'definition'),
        gridClickType: GridClickType.fromJson(json[r'grid_click_type']),
        id: mapValueOfType<String>(json, r'id'),
        included: mapValueOfType<bool>(json, r'included'),
        isGenerateBackground: mapValueOfType<bool>(json, r'is_generate_background'),
        isMdl: mapValueOfType<bool>(json, r'is_mdl'),
        parentId: mapValueOfType<String>(json, r'parent_id'),
        preferredMediaType: ProductGroupPromotionPreferredMediaTypeEnum.fromJson(json[r'preferred_media_type']),
        relativeDefinition: mapValueOfType<String>(json, r'relative_definition'),
        selectedImageTag: mapValueOfType<String>(json, r'selected_image_tag'),
        selectedVideoTag: mapValueOfType<String>(json, r'selected_video_tag'),
        slideshowCollectionsDescription: mapValueOfType<String>(json, r'slideshow_collections_description'),
        slideshowCollectionsTitle: mapValueOfType<String>(json, r'slideshow_collections_title'),
        status: EntityStatus.fromJson(json[r'status']),
        trackingUrl: mapValueOfType<String>(json, r'tracking_url'),
      );
    }
    return null;
  }

  static List<ProductGroupPromotion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ProductGroupPromotion> mapFromJson(dynamic json) {
    final map = <String, ProductGroupPromotion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ProductGroupPromotion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ProductGroupPromotion-objects as value to a dart map
  static Map<String, List<ProductGroupPromotion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ProductGroupPromotion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ProductGroupPromotion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Collections ad header type
class ProductGroupPromotionCollectionsHeaderTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ProductGroupPromotionCollectionsHeaderTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOP_THIS_COLLECTION = ProductGroupPromotionCollectionsHeaderTypeEnum._(r'SHOP_THIS_COLLECTION');
  static const EXPLORE_THIS_COLLECTION = ProductGroupPromotionCollectionsHeaderTypeEnum._(r'EXPLORE_THIS_COLLECTION');
  static const NO_HEADER = ProductGroupPromotionCollectionsHeaderTypeEnum._(r'NO_HEADER');
  static const ON_SALE = ProductGroupPromotionCollectionsHeaderTypeEnum._(r'ON_SALE');
  static const GET_DEAL = ProductGroupPromotionCollectionsHeaderTypeEnum._(r'GET_DEAL');

  /// List of all possible values in this [enum][ProductGroupPromotionCollectionsHeaderTypeEnum].
  static const values = <ProductGroupPromotionCollectionsHeaderTypeEnum>[
    SHOP_THIS_COLLECTION,
    EXPLORE_THIS_COLLECTION,
    NO_HEADER,
    ON_SALE,
    GET_DEAL,
  ];

  static ProductGroupPromotionCollectionsHeaderTypeEnum? fromJson(dynamic value) => ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer().decode(value);

  static List<ProductGroupPromotionCollectionsHeaderTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionCollectionsHeaderTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionCollectionsHeaderTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductGroupPromotionCollectionsHeaderTypeEnum] to String,
/// and [decode] dynamic data back to [ProductGroupPromotionCollectionsHeaderTypeEnum].
class ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer {
  factory ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer() => _instance ??= const ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer._();

  const ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer._();

  String encode(ProductGroupPromotionCollectionsHeaderTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductGroupPromotionCollectionsHeaderTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductGroupPromotionCollectionsHeaderTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOP_THIS_COLLECTION': return ProductGroupPromotionCollectionsHeaderTypeEnum.SHOP_THIS_COLLECTION;
        case r'EXPLORE_THIS_COLLECTION': return ProductGroupPromotionCollectionsHeaderTypeEnum.EXPLORE_THIS_COLLECTION;
        case r'NO_HEADER': return ProductGroupPromotionCollectionsHeaderTypeEnum.NO_HEADER;
        case r'ON_SALE': return ProductGroupPromotionCollectionsHeaderTypeEnum.ON_SALE;
        case r'GET_DEAL': return ProductGroupPromotionCollectionsHeaderTypeEnum.GET_DEAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer] instance.
  static ProductGroupPromotionCollectionsHeaderTypeEnumTypeTransformer? _instance;
}


/// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
class ProductGroupPromotionCustomizableCtaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ProductGroupPromotionCustomizableCtaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOP_NOW = ProductGroupPromotionCustomizableCtaTypeEnum._(r'SHOP_NOW');
  static const BOOK_NOW = ProductGroupPromotionCustomizableCtaTypeEnum._(r'BOOK_NOW');
  static const ON_SALE = ProductGroupPromotionCustomizableCtaTypeEnum._(r'ON_SALE');
  static const GET_DEAL = ProductGroupPromotionCustomizableCtaTypeEnum._(r'GET_DEAL');
  static const BUY_ONLINE_PICKUP_IN_STORE = ProductGroupPromotionCustomizableCtaTypeEnum._(r'BUY_ONLINE_PICKUP_IN_STORE');

  /// List of all possible values in this [enum][ProductGroupPromotionCustomizableCtaTypeEnum].
  static const values = <ProductGroupPromotionCustomizableCtaTypeEnum>[
    SHOP_NOW,
    BOOK_NOW,
    ON_SALE,
    GET_DEAL,
    BUY_ONLINE_PICKUP_IN_STORE,
  ];

  static ProductGroupPromotionCustomizableCtaTypeEnum? fromJson(dynamic value) => ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer().decode(value);

  static List<ProductGroupPromotionCustomizableCtaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionCustomizableCtaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionCustomizableCtaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductGroupPromotionCustomizableCtaTypeEnum] to String,
/// and [decode] dynamic data back to [ProductGroupPromotionCustomizableCtaTypeEnum].
class ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer {
  factory ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer() => _instance ??= const ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer._();

  const ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer._();

  String encode(ProductGroupPromotionCustomizableCtaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductGroupPromotionCustomizableCtaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductGroupPromotionCustomizableCtaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOP_NOW': return ProductGroupPromotionCustomizableCtaTypeEnum.SHOP_NOW;
        case r'BOOK_NOW': return ProductGroupPromotionCustomizableCtaTypeEnum.BOOK_NOW;
        case r'ON_SALE': return ProductGroupPromotionCustomizableCtaTypeEnum.ON_SALE;
        case r'GET_DEAL': return ProductGroupPromotionCustomizableCtaTypeEnum.GET_DEAL;
        case r'BUY_ONLINE_PICKUP_IN_STORE': return ProductGroupPromotionCustomizableCtaTypeEnum.BUY_ONLINE_PICKUP_IN_STORE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer] instance.
  static ProductGroupPromotionCustomizableCtaTypeEnumTypeTransformer? _instance;
}


/// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
class ProductGroupPromotionPreferredMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ProductGroupPromotionPreferredMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const VIDEO = ProductGroupPromotionPreferredMediaTypeEnum._(r'VIDEO');
  static const IMAGE = ProductGroupPromotionPreferredMediaTypeEnum._(r'IMAGE');

  /// List of all possible values in this [enum][ProductGroupPromotionPreferredMediaTypeEnum].
  static const values = <ProductGroupPromotionPreferredMediaTypeEnum>[
    VIDEO,
    IMAGE,
  ];

  static ProductGroupPromotionPreferredMediaTypeEnum? fromJson(dynamic value) => ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer().decode(value);

  static List<ProductGroupPromotionPreferredMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionPreferredMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionPreferredMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductGroupPromotionPreferredMediaTypeEnum] to String,
/// and [decode] dynamic data back to [ProductGroupPromotionPreferredMediaTypeEnum].
class ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer {
  factory ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer() => _instance ??= const ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer._();

  const ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer._();

  String encode(ProductGroupPromotionPreferredMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductGroupPromotionPreferredMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductGroupPromotionPreferredMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'VIDEO': return ProductGroupPromotionPreferredMediaTypeEnum.VIDEO;
        case r'IMAGE': return ProductGroupPromotionPreferredMediaTypeEnum.IMAGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer] instance.
  static ProductGroupPromotionPreferredMediaTypeEnumTypeTransformer? _instance;
}


