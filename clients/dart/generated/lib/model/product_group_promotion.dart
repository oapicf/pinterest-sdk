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
    this.isImageAutoResizing,
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? bidInMicroCurrency;

  /// ID of the catalogs product group that this product group promotion references (required for create operations)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogProductGroupId;

  /// Catalogs product group name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogProductGroupName;

  CollectionsHeaderType? collectionsHeaderType;

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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProductGroupPromotionCustomizableCTAType? customizableCtaType;

  /// The full product group definition path
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? definition;

  GridClickType? gridClickType;

  /// ID of the product group promotion (required for update operations).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// True if the group is BIDDABLE, false if it should be EXCLUDED from serving ads.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? included;

  /// Enable generate backgrounds for the product group, default value is FALSE. When enabled, Pinterest will use generative AI to apply backgrounds for your product images that help drive user inspiration and engagement.
  bool? isGenerateBackground;

  /// Set to `TRUE` to automatically resize your product images with generative AI. This ensures that images have optimal appearance for better performance.
  bool? isImageAutoResizing;

  /// If set to true products promoted in this product group will use the Mobile Deep Link specified in your catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isMdl;

  /// The parent Product Group ID of this Product Group
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? parentId;

  PreferredMediaType? preferredMediaType;

  /// The definition of the product group, relative to its parent - an attribute name/value pair
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
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
    other.isImageAutoResizing == isImageAutoResizing &&
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
    (isImageAutoResizing == null ? 0 : isImageAutoResizing!.hashCode) +
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
  String toString() => 'ProductGroupPromotion[adGroupId=$adGroupId, bidInMicroCurrency=$bidInMicroCurrency, catalogProductGroupId=$catalogProductGroupId, catalogProductGroupName=$catalogProductGroupName, collectionsHeaderType=$collectionsHeaderType, collectionsHeroDestinationUrl=$collectionsHeroDestinationUrl, collectionsHeroPinId=$collectionsHeroPinId, creativeType=$creativeType, customizableCtaType=$customizableCtaType, definition=$definition, gridClickType=$gridClickType, id=$id, included=$included, isGenerateBackground=$isGenerateBackground, isImageAutoResizing=$isImageAutoResizing, isMdl=$isMdl, parentId=$parentId, preferredMediaType=$preferredMediaType, relativeDefinition=$relativeDefinition, selectedImageTag=$selectedImageTag, selectedVideoTag=$selectedVideoTag, slideshowCollectionsDescription=$slideshowCollectionsDescription, slideshowCollectionsTitle=$slideshowCollectionsTitle, status=$status, trackingUrl=$trackingUrl]';

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
    if (this.isImageAutoResizing != null) {
      json[r'is_image_auto_resizing'] = this.isImageAutoResizing;
    } else {
      json[r'is_image_auto_resizing'] = null;
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
        return true;
      }());

      return ProductGroupPromotion(
        adGroupId: mapValueOfType<String>(json, r'ad_group_id'),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        catalogProductGroupId: mapValueOfType<String>(json, r'catalog_product_group_id'),
        catalogProductGroupName: mapValueOfType<String>(json, r'catalog_product_group_name'),
        collectionsHeaderType: CollectionsHeaderType.fromJson(json[r'collections_header_type']),
        collectionsHeroDestinationUrl: mapValueOfType<String>(json, r'collections_hero_destination_url'),
        collectionsHeroPinId: mapValueOfType<String>(json, r'collections_hero_pin_id'),
        creativeType: CreativeType.fromJson(json[r'creative_type']),
        customizableCtaType: ProductGroupPromotionCustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        definition: mapValueOfType<String>(json, r'definition'),
        gridClickType: GridClickType.fromJson(json[r'grid_click_type']),
        id: mapValueOfType<String>(json, r'id'),
        included: mapValueOfType<bool>(json, r'included'),
        isGenerateBackground: mapValueOfType<bool>(json, r'is_generate_background'),
        isImageAutoResizing: mapValueOfType<bool>(json, r'is_image_auto_resizing'),
        isMdl: mapValueOfType<bool>(json, r'is_mdl'),
        parentId: mapValueOfType<String>(json, r'parent_id'),
        preferredMediaType: PreferredMediaType.fromJson(json[r'preferred_media_type']),
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

