//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdPreviewRequest {
  /// Returns a new [AdPreviewRequest] instance.
  AdPreviewRequest({
    required this.imageUrl,
    required this.title,
    required this.pinId,
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

  /// Image URL.
  String imageUrl;

  /// Title displayed below ad.
  String title;

  /// Pin ID.
  String pinId;

  /// Catalog Product Group Id.
  String catalogProductGroupId;

  /// Ad format of the shopping ad preview.
  AdPreviewRequestCreativeTypeEnum creativeType;

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
  AdPreviewRequestPreferredMediaTypeEnum? preferredMediaType;

  /// Multi video template tag, image_tag and video_tag are mutual exclusive.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? videoTag;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdPreviewRequest &&
    other.imageUrl == imageUrl &&
    other.title == title &&
    other.pinId == pinId &&
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
    (imageUrl.hashCode) +
    (title.hashCode) +
    (pinId.hashCode) +
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
  String toString() => 'AdPreviewRequest[imageUrl=$imageUrl, title=$title, pinId=$pinId, catalogProductGroupId=$catalogProductGroupId, creativeType=$creativeType, customizableCtaType=$customizableCtaType, heroImageTitle=$heroImageTitle, heroImageUrl=$heroImageUrl, heroPinId=$heroPinId, imageTag=$imageTag, itemId=$itemId, preferredMediaType=$preferredMediaType, videoTag=$videoTag]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'image_url'] = this.imageUrl;
      json[r'title'] = this.title;
      json[r'pin_id'] = this.pinId;
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

  /// Returns a new [AdPreviewRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdPreviewRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdPreviewRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdPreviewRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdPreviewRequest(
        imageUrl: mapValueOfType<String>(json, r'image_url')!,
        title: mapValueOfType<String>(json, r'title')!,
        pinId: mapValueOfType<String>(json, r'pin_id')!,
        catalogProductGroupId: mapValueOfType<String>(json, r'catalog_product_group_id')!,
        creativeType: AdPreviewRequestCreativeTypeEnum.fromJson(json[r'creative_type'])!,
        customizableCtaType: CustomizableCTAType.fromJson(json[r'customizable_cta_type']),
        heroImageTitle: mapValueOfType<String>(json, r'hero_image_title'),
        heroImageUrl: mapValueOfType<String>(json, r'hero_image_url'),
        heroPinId: mapValueOfType<String>(json, r'hero_pin_id'),
        imageTag: mapValueOfType<String>(json, r'image_tag'),
        itemId: mapValueOfType<String>(json, r'item_id'),
        preferredMediaType: AdPreviewRequestPreferredMediaTypeEnum.fromJson(json[r'preferred_media_type']),
        videoTag: mapValueOfType<String>(json, r'video_tag'),
      );
    }
    return null;
  }

  static List<AdPreviewRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdPreviewRequest> mapFromJson(dynamic json) {
    final map = <String, AdPreviewRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdPreviewRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdPreviewRequest-objects as value to a dart map
  static Map<String, List<AdPreviewRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdPreviewRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdPreviewRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'image_url',
    'title',
    'pin_id',
    'catalog_product_group_id',
    'creative_type',
  };
}

/// Ad format of the shopping ad preview.
class AdPreviewRequestCreativeTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdPreviewRequestCreativeTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SHOPPING = AdPreviewRequestCreativeTypeEnum._(r'SHOPPING');
  static const CAROUSEL = AdPreviewRequestCreativeTypeEnum._(r'CAROUSEL');
  static const COLLECTION = AdPreviewRequestCreativeTypeEnum._(r'COLLECTION');
  static const REGULAR = AdPreviewRequestCreativeTypeEnum._(r'REGULAR');

  /// List of all possible values in this [enum][AdPreviewRequestCreativeTypeEnum].
  static const values = <AdPreviewRequestCreativeTypeEnum>[
    SHOPPING,
    CAROUSEL,
    COLLECTION,
    REGULAR,
  ];

  static AdPreviewRequestCreativeTypeEnum? fromJson(dynamic value) => AdPreviewRequestCreativeTypeEnumTypeTransformer().decode(value);

  static List<AdPreviewRequestCreativeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewRequestCreativeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewRequestCreativeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdPreviewRequestCreativeTypeEnum] to String,
/// and [decode] dynamic data back to [AdPreviewRequestCreativeTypeEnum].
class AdPreviewRequestCreativeTypeEnumTypeTransformer {
  factory AdPreviewRequestCreativeTypeEnumTypeTransformer() => _instance ??= const AdPreviewRequestCreativeTypeEnumTypeTransformer._();

  const AdPreviewRequestCreativeTypeEnumTypeTransformer._();

  String encode(AdPreviewRequestCreativeTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdPreviewRequestCreativeTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdPreviewRequestCreativeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SHOPPING': return AdPreviewRequestCreativeTypeEnum.SHOPPING;
        case r'CAROUSEL': return AdPreviewRequestCreativeTypeEnum.CAROUSEL;
        case r'COLLECTION': return AdPreviewRequestCreativeTypeEnum.COLLECTION;
        case r'REGULAR': return AdPreviewRequestCreativeTypeEnum.REGULAR;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdPreviewRequestCreativeTypeEnumTypeTransformer] instance.
  static AdPreviewRequestCreativeTypeEnumTypeTransformer? _instance;
}


/// Preferred media type.
class AdPreviewRequestPreferredMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdPreviewRequestPreferredMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const VIDEO = AdPreviewRequestPreferredMediaTypeEnum._(r'VIDEO');
  static const IMAGE = AdPreviewRequestPreferredMediaTypeEnum._(r'IMAGE');

  /// List of all possible values in this [enum][AdPreviewRequestPreferredMediaTypeEnum].
  static const values = <AdPreviewRequestPreferredMediaTypeEnum>[
    VIDEO,
    IMAGE,
  ];

  static AdPreviewRequestPreferredMediaTypeEnum? fromJson(dynamic value) => AdPreviewRequestPreferredMediaTypeEnumTypeTransformer().decode(value);

  static List<AdPreviewRequestPreferredMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPreviewRequestPreferredMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPreviewRequestPreferredMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdPreviewRequestPreferredMediaTypeEnum] to String,
/// and [decode] dynamic data back to [AdPreviewRequestPreferredMediaTypeEnum].
class AdPreviewRequestPreferredMediaTypeEnumTypeTransformer {
  factory AdPreviewRequestPreferredMediaTypeEnumTypeTransformer() => _instance ??= const AdPreviewRequestPreferredMediaTypeEnumTypeTransformer._();

  const AdPreviewRequestPreferredMediaTypeEnumTypeTransformer._();

  String encode(AdPreviewRequestPreferredMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdPreviewRequestPreferredMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdPreviewRequestPreferredMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'VIDEO': return AdPreviewRequestPreferredMediaTypeEnum.VIDEO;
        case r'IMAGE': return AdPreviewRequestPreferredMediaTypeEnum.IMAGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdPreviewRequestPreferredMediaTypeEnumTypeTransformer] instance.
  static AdPreviewRequestPreferredMediaTypeEnumTypeTransformer? _instance;
}


