//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdPreviewShopping {
  /// Returns a new [AdPreviewShopping] instance.
  AdPreviewShopping({
    required this.catalogProductGroupId,
    required this.creativeType,
    this.customizableCtaType,
    this.heroImageTitle,
    this.heroImageUrl,
    this.heroPinId,
    this.imageTag,
    this.itemId,
    this.preferredMediaType,
    this.showPromotion,
    this.videoTag,
  });

  /// Catalog Product Group Id.
  String catalogProductGroupId;

  /// Ad format of the shopping ad preview.
  AdShoppingPreviewCreativeType creativeType;

  /// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are `SHOP_NOW`, `BOOK_NOW`, `ON_SALE`, `GET_DEAL`, `BUY_ONLINE_PICKUP_IN_STORE`
  CustomizableCTAType? customizableCtaType;

  /// Title displayed below ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? heroImageTitle;

  /// Hero image URL.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? heroImageUrl;

  /// Pin id for the hero image. When creative type is COLLECTION, either hero_pin_id or (hero_image_url, hero_image_title) is required.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? heroPinId;

  /// Multi image template tag.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? imageTag;

  /// Item id for product to preview standard shopping ads, optional and only applicable when creative type is SHOPPING.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// Preferred media type.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BasePreferredMediaType? preferredMediaType;

  /// Include promotion data in preview when available on catalog item. Defaults to false.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? showPromotion;

  /// Multi video template tag, image_tag and video_tag are mutual exclusive.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? videoTag;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdPreviewShopping &&
    other.catalogProductGroupId == catalogProductGroupId &&
    other.creativeType == creativeType &&
    other.customizableCtaType == customizableCtaType &&
    other.heroImageTitle == heroImageTitle &&
    other.heroImageUrl == heroImageUrl &&
    other.heroPinId == heroPinId &&
    other.imageTag == imageTag &&
    other.itemId == itemId &&
    other.preferredMediaType == preferredMediaType &&
    other.showPromotion == showPromotion &&
    other.videoTag == videoTag;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogProductGroupId.hashCode) +
    (creativeType.hashCode) +
    (customizableCtaType == null ? 0 : customizableCtaType!.hashCode) +
    (heroImageTitle == null ? 0 : heroImageTitle!.hashCode) +
    (heroImageUrl == null ? 0 : heroImageUrl!.hashCode) +
    (heroPinId == null ? 0 : heroPinId!.hashCode) +
    (imageTag == null ? 0 : imageTag!.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (preferredMediaType == null ? 0 : preferredMediaType!.hashCode) +
    (showPromotion == null ? 0 : showPromotion!.hashCode) +
    (videoTag == null ? 0 : videoTag!.hashCode);

  @override
  String toString() => 'AdPreviewShopping[catalogProductGroupId=$catalogProductGroupId, creativeType=$creativeType, customizableCtaType=$customizableCtaType, heroImageTitle=$heroImageTitle, heroImageUrl=$heroImageUrl, heroPinId=$heroPinId, imageTag=$imageTag, itemId=$itemId, preferredMediaType=$preferredMediaType, showPromotion=$showPromotion, videoTag=$videoTag]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_product_group_id'] = this.catalogProductGroupId;
      json[r'creative_type'] = this.creativeType;
    if (this.customizableCtaType != null) {
      json[r'customizable_cta_type'] = this.customizableCtaType;
    } else {
      json[r'customizable_cta_type'] = null;
    }
    if (this.heroImageTitle != null) {
      json[r'hero_image_title'] = this.heroImageTitle;
    } else {
      json[r'hero_image_title'] = null;
    }
    if (this.heroImageUrl != null) {
      json[r'hero_image_url'] = this.heroImageUrl;
    } else {
      json[r'hero_image_url'] = null;
    }
    if (this.heroPinId != null) {
      json[r'hero_pin_id'] = this.heroPinId;
    } else {
      json[r'hero_pin_id'] = null;
    }
    if (this.imageTag != null) {
      json[r'image_tag'] = this.imageTag;
    } else {
      json[r'image_tag'] = null;
    }
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    if (this.preferredMediaType != null) {
      json[r'preferred_media_type'] = this.preferredMediaType;
    } else {
      json[r'preferred_media_type'] = null;
    }
    if (this.showPromotion != null) {
      json[r'show_promotion'] = this.showPromotion;
    } else {
      json[r'show_promotion'] = null;
    }
    if (this.videoTag != null) {
      json[r'video_tag'] = this.videoTag;
    } else {
      json[r'video_tag'] = null;
    }
    return json;
  }

  /// Returns a new [AdPreviewShopping] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdPreviewShopping? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_product_group_id'), 'Required key "AdPreviewShopping[catalog_product_group_id]" is missing from JSON.');
        assert(json[r'catalog_product_group_id'] != null, 'Required key "AdPreviewShopping[catalog_product_group_id]" has a null value in JSON.');
        assert(json.containsKey(r'creative_type'), 'Required key "AdPreviewShopping[creative_type]" is missing from JSON.');
        assert(json[r'creative_type'] != null, 'Required key "AdPreviewShopping[creative_type]" has a null value in JSON.');
        return true;
      }());

      return AdPreviewShopping(
        catalogProductGroupId: mapValueOfType<String>(json, r'catalog_product_group_id')!,
        creativeType: AdShoppingPreviewCreativeType.fromJson(json[r'creative_type'])!,
        customizableCtaType: CustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        heroImageTitle: mapValueOfType<String>(json, r'hero_image_title'),
        heroImageUrl: mapValueOfType<String>(json, r'hero_image_url'),
        heroPinId: mapValueOfType<String>(json, r'hero_pin_id'),
        imageTag: mapValueOfType<String>(json, r'image_tag'),
        itemId: mapValueOfType<String>(json, r'item_id'),
        preferredMediaType: BasePreferredMediaType.fromJson(json[r'preferred_media_type']),
        showPromotion: mapValueOfType<bool>(json, r'show_promotion'),
        videoTag: mapValueOfType<String>(json, r'video_tag'),
      );
    }
    return null;
  }

  static List<AdPreviewShopping> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewShopping>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewShopping.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdPreviewShopping> mapFromJson(dynamic json) {
    final map = <String, AdPreviewShopping>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdPreviewShopping.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdPreviewShopping-objects as value to a dart map
  static Map<String, List<AdPreviewShopping>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdPreviewShopping>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdPreviewShopping.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_product_group_id',
    'creative_type',
  };
}

