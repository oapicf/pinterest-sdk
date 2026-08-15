//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupAudienceSizingRequest {
  /// Returns a new [AdGroupAudienceSizingRequest] instance.
  AdGroupAudienceSizingRequest({
    this.autoTargetingEnabled = true,
    this.creativeTypes = const [],
    this.keywords = const [],
    this.placementGroup = 'ALL',
    this.productGroupIds = const [],
    this.targetingSpec,
  });

  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  bool autoTargetingEnabled;

  /// Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  List<AdGroupAudienceSizingRequestCreativeTypesEnum>? creativeTypes;

  /// Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  List<AdGroupAudienceSizingRequestKeywordsInner>? keywords;

  /// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  PlacementGroupType placementGroup;

  /// Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  List<String>? productGroupIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpec? targetingSpec;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupAudienceSizingRequest &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    _deepEquality.equals(other.creativeTypes, creativeTypes) &&
    _deepEquality.equals(other.keywords, keywords) &&
    other.placementGroup == placementGroup &&
    _deepEquality.equals(other.productGroupIds, productGroupIds) &&
    other.targetingSpec == targetingSpec;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled.hashCode) +
    (creativeTypes == null ? 0 : creativeTypes!.hashCode) +
    (keywords == null ? 0 : keywords!.hashCode) +
    (placementGroup.hashCode) +
    (productGroupIds == null ? 0 : productGroupIds!.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode);

  @override
  String toString() => 'AdGroupAudienceSizingRequest[autoTargetingEnabled=$autoTargetingEnabled, creativeTypes=$creativeTypes, keywords=$keywords, placementGroup=$placementGroup, productGroupIds=$productGroupIds, targetingSpec=$targetingSpec]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    if (this.creativeTypes != null) {
      json[r'creative_types'] = this.creativeTypes;
    } else {
      json[r'creative_types'] = null;
    }
    if (this.keywords != null) {
      json[r'keywords'] = this.keywords;
    } else {
      json[r'keywords'] = null;
    }
      json[r'placement_group'] = this.placementGroup;
    if (this.productGroupIds != null) {
      json[r'product_group_ids'] = this.productGroupIds;
    } else {
      json[r'product_group_ids'] = null;
    }
    if (this.targetingSpec != null) {
      json[r'targeting_spec'] = this.targetingSpec;
    } else {
      json[r'targeting_spec'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupAudienceSizingRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupAudienceSizingRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdGroupAudienceSizingRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdGroupAudienceSizingRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdGroupAudienceSizingRequest(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled') ?? true,
        creativeTypes: AdGroupAudienceSizingRequestCreativeTypesEnum.listFromJson(json[r'creative_types']),
        keywords: AdGroupAudienceSizingRequestKeywordsInner.listFromJson(json[r'keywords']),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']) ?? 'ALL',
        productGroupIds: json[r'product_group_ids'] is Iterable
            ? (json[r'product_group_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        targetingSpec: TargetingSpec.fromJson(json[r'targeting_spec']),
      );
    }
    return null;
  }

  static List<AdGroupAudienceSizingRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizingRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizingRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupAudienceSizingRequest> mapFromJson(dynamic json) {
    final map = <String, AdGroupAudienceSizingRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupAudienceSizingRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupAudienceSizingRequest-objects as value to a dart map
  static Map<String, List<AdGroupAudienceSizingRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupAudienceSizingRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupAudienceSizingRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class AdGroupAudienceSizingRequestCreativeTypesEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupAudienceSizingRequestCreativeTypesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REGULAR = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'REGULAR');
  static const VIDEO = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'VIDEO');
  static const SHOPPING = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'SHOPPING');
  static const CAROUSEL = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'CAROUSEL');
  static const MAX_VIDEO = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'MAX_VIDEO');
  static const SHOP_THE_PIN = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'SHOP_THE_PIN');
  static const COLLECTION = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'COLLECTION');
  static const IDEA = AdGroupAudienceSizingRequestCreativeTypesEnum._(r'IDEA');

  /// List of all possible values in this [enum][AdGroupAudienceSizingRequestCreativeTypesEnum].
  static const values = <AdGroupAudienceSizingRequestCreativeTypesEnum>[
    REGULAR,
    VIDEO,
    SHOPPING,
    CAROUSEL,
    MAX_VIDEO,
    SHOP_THE_PIN,
    COLLECTION,
    IDEA,
  ];

  static AdGroupAudienceSizingRequestCreativeTypesEnum? fromJson(dynamic value) => AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer().decode(value);

  static List<AdGroupAudienceSizingRequestCreativeTypesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizingRequestCreativeTypesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizingRequestCreativeTypesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupAudienceSizingRequestCreativeTypesEnum] to String,
/// and [decode] dynamic data back to [AdGroupAudienceSizingRequestCreativeTypesEnum].
class AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer {
  factory AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer() => _instance ??= const AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer._();

  const AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer._();

  String encode(AdGroupAudienceSizingRequestCreativeTypesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupAudienceSizingRequestCreativeTypesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupAudienceSizingRequestCreativeTypesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'REGULAR': return AdGroupAudienceSizingRequestCreativeTypesEnum.REGULAR;
        case r'VIDEO': return AdGroupAudienceSizingRequestCreativeTypesEnum.VIDEO;
        case r'SHOPPING': return AdGroupAudienceSizingRequestCreativeTypesEnum.SHOPPING;
        case r'CAROUSEL': return AdGroupAudienceSizingRequestCreativeTypesEnum.CAROUSEL;
        case r'MAX_VIDEO': return AdGroupAudienceSizingRequestCreativeTypesEnum.MAX_VIDEO;
        case r'SHOP_THE_PIN': return AdGroupAudienceSizingRequestCreativeTypesEnum.SHOP_THE_PIN;
        case r'COLLECTION': return AdGroupAudienceSizingRequestCreativeTypesEnum.COLLECTION;
        case r'IDEA': return AdGroupAudienceSizingRequestCreativeTypesEnum.IDEA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer] instance.
  static AdGroupAudienceSizingRequestCreativeTypesEnumTypeTransformer? _instance;
}


