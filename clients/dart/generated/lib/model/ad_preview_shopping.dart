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
    this.videoTag,
  });

  /// Catalog Product Group Id.
  String catalogProductGroupId;

  /// Ad format of the shopping ad preview.
  AdPreviewShoppingCreativeTypeEnum creativeType;

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
  AdPreviewShoppingPreferredMediaTypeEnum? preferredMediaType;

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
    (videoTag == null ? 0 : videoTag!.hashCode);

  @override
  String toString() => 'AdPreviewShopping[catalogProductGroupId=$catalogProductGroupId, creativeType=$creativeType, customizableCtaType=$customizableCtaType, heroImageTitle=$heroImageTitle, heroImageUrl=$heroImageUrl, heroPinId=$heroPinId, imageTag=$imageTag, itemId=$itemId, preferredMediaType=$preferredMediaType, videoTag=$videoTag]';

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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdPreviewShopping[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdPreviewShopping[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdPreviewShopping(
        catalogProductGroupId: mapValueOfType<String>(json, r'catalog_product_group_id')!,
        creativeType: AdPreviewShoppingCreativeTypeEnum.fromJson(json[r'creative_type'])!,
        customizableCtaType: CustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        heroImageTitle: mapValueOfType<String>(json, r'hero_image_title'),
        heroImageUrl: mapValueOfType<String>(json, r'hero_image_url'),
        heroPinId: mapValueOfType<String>(json, r'hero_pin_id'),
        imageTag: mapValueOfType<String>(json, r'image_tag'),
        itemId: mapValueOfType<String>(json, r'item_id'),
        preferredMediaType: AdPreviewShoppingPreferredMediaTypeEnum.fromJson(json[r'preferred_media_type']),
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

/// Ad format of the shopping ad preview.
class AdPreviewShoppingCreativeTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdPreviewShoppingCreativeTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOPPING = AdPreviewShoppingCreativeTypeEnum._(r'SHOPPING');
  static const CAROUSEL = AdPreviewShoppingCreativeTypeEnum._(r'CAROUSEL');
  static const COLLECTION = AdPreviewShoppingCreativeTypeEnum._(r'COLLECTION');
  static const REGULAR = AdPreviewShoppingCreativeTypeEnum._(r'REGULAR');

  /// List of all possible values in this [enum][AdPreviewShoppingCreativeTypeEnum].
  static const values = <AdPreviewShoppingCreativeTypeEnum>[
    SHOPPING,
    CAROUSEL,
    COLLECTION,
    REGULAR,
  ];

  static AdPreviewShoppingCreativeTypeEnum? fromJson(dynamic value) => AdPreviewShoppingCreativeTypeEnumTypeTransformer().decode(value);

  static List<AdPreviewShoppingCreativeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewShoppingCreativeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewShoppingCreativeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdPreviewShoppingCreativeTypeEnum] to String,
/// and [decode] dynamic data back to [AdPreviewShoppingCreativeTypeEnum].
class AdPreviewShoppingCreativeTypeEnumTypeTransformer {
  factory AdPreviewShoppingCreativeTypeEnumTypeTransformer() => _instance ??= const AdPreviewShoppingCreativeTypeEnumTypeTransformer._();

  const AdPreviewShoppingCreativeTypeEnumTypeTransformer._();

  String encode(AdPreviewShoppingCreativeTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdPreviewShoppingCreativeTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdPreviewShoppingCreativeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOPPING': return AdPreviewShoppingCreativeTypeEnum.SHOPPING;
        case r'CAROUSEL': return AdPreviewShoppingCreativeTypeEnum.CAROUSEL;
        case r'COLLECTION': return AdPreviewShoppingCreativeTypeEnum.COLLECTION;
        case r'REGULAR': return AdPreviewShoppingCreativeTypeEnum.REGULAR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdPreviewShoppingCreativeTypeEnumTypeTransformer] instance.
  static AdPreviewShoppingCreativeTypeEnumTypeTransformer? _instance;
}


/// Preferred media type.
class AdPreviewShoppingPreferredMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdPreviewShoppingPreferredMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const VIDEO = AdPreviewShoppingPreferredMediaTypeEnum._(r'VIDEO');
  static const IMAGE = AdPreviewShoppingPreferredMediaTypeEnum._(r'IMAGE');

  /// List of all possible values in this [enum][AdPreviewShoppingPreferredMediaTypeEnum].
  static const values = <AdPreviewShoppingPreferredMediaTypeEnum>[
    VIDEO,
    IMAGE,
  ];

  static AdPreviewShoppingPreferredMediaTypeEnum? fromJson(dynamic value) => AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer().decode(value);

  static List<AdPreviewShoppingPreferredMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewShoppingPreferredMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewShoppingPreferredMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdPreviewShoppingPreferredMediaTypeEnum] to String,
/// and [decode] dynamic data back to [AdPreviewShoppingPreferredMediaTypeEnum].
class AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer {
  factory AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer() => _instance ??= const AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer._();

  const AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer._();

  String encode(AdPreviewShoppingPreferredMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdPreviewShoppingPreferredMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdPreviewShoppingPreferredMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'VIDEO': return AdPreviewShoppingPreferredMediaTypeEnum.VIDEO;
        case r'IMAGE': return AdPreviewShoppingPreferredMediaTypeEnum.IMAGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer] instance.
  static AdPreviewShoppingPreferredMediaTypeEnumTypeTransformer? _instance;
}


