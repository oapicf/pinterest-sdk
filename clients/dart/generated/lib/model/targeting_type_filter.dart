//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTypeFilter {
  /// Returns a new [TargetingTypeFilter] instance.
  TargetingTypeFilter({
    this.targetingTypes = const [],
  });

  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  List<TargetingTypeFilterTargetingTypesEnum> targetingTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTypeFilter &&
    _deepEquality.equals(other.targetingTypes, targetingTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (targetingTypes.hashCode);

  @override
  String toString() => 'TargetingTypeFilter[targetingTypes=$targetingTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'targeting_types'] = this.targetingTypes;
    return json;
  }

  /// Returns a new [TargetingTypeFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTypeFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TargetingTypeFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TargetingTypeFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TargetingTypeFilter(
        targetingTypes: TargetingTypeFilterTargetingTypesEnum.listFromJson(json[r'targeting_types']),
      );
    }
    return null;
  }

  static List<TargetingTypeFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTypeFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTypeFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTypeFilter> mapFromJson(dynamic json) {
    final map = <String, TargetingTypeFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTypeFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTypeFilter-objects as value to a dart map
  static Map<String, List<TargetingTypeFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTypeFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTypeFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Reporting targeting type
class TargetingTypeFilterTargetingTypesEnum {
  /// Instantiate a new enum with the provided [value].
  const TargetingTypeFilterTargetingTypesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = TargetingTypeFilterTargetingTypesEnum._(r'KEYWORD');
  static const APPTYPE = TargetingTypeFilterTargetingTypesEnum._(r'APPTYPE');
  static const GENDER = TargetingTypeFilterTargetingTypesEnum._(r'GENDER');
  static const LOCATION = TargetingTypeFilterTargetingTypesEnum._(r'LOCATION');
  static const PLACEMENT = TargetingTypeFilterTargetingTypesEnum._(r'PLACEMENT');
  static const COUNTRY = TargetingTypeFilterTargetingTypesEnum._(r'COUNTRY');
  static const TARGETED_INTEREST = TargetingTypeFilterTargetingTypesEnum._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = TargetingTypeFilterTargetingTypesEnum._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = TargetingTypeFilterTargetingTypesEnum._(r'AUDIENCE_INCLUDE');
  static const GEO = TargetingTypeFilterTargetingTypesEnum._(r'GEO');
  static const AGE_BUCKET = TargetingTypeFilterTargetingTypesEnum._(r'AGE_BUCKET');
  static const REGION = TargetingTypeFilterTargetingTypesEnum._(r'REGION');
  static const MEDIA_TYPE = TargetingTypeFilterTargetingTypesEnum._(r'MEDIA_TYPE');
  static const AGE_BUCKET_AND_GENDER = TargetingTypeFilterTargetingTypesEnum._(r'AGE_BUCKET_AND_GENDER');
  static const AUDIENCE_MULTIPLIER = TargetingTypeFilterTargetingTypesEnum._(r'AUDIENCE_MULTIPLIER');
  static const CREATIVE_ENHANCEMENTS = TargetingTypeFilterTargetingTypesEnum._(r'CREATIVE_ENHANCEMENTS');
  static const LOCAL_ADS_STORE_CODE = TargetingTypeFilterTargetingTypesEnum._(r'LOCAL_ADS_STORE_CODE');

  /// List of all possible values in this [enum][TargetingTypeFilterTargetingTypesEnum].
  static const values = <TargetingTypeFilterTargetingTypesEnum>[
    KEYWORD,
    APPTYPE,
    GENDER,
    LOCATION,
    PLACEMENT,
    COUNTRY,
    TARGETED_INTEREST,
    PINNER_INTEREST,
    AUDIENCE_INCLUDE,
    GEO,
    AGE_BUCKET,
    REGION,
    MEDIA_TYPE,
    AGE_BUCKET_AND_GENDER,
    AUDIENCE_MULTIPLIER,
    CREATIVE_ENHANCEMENTS,
    LOCAL_ADS_STORE_CODE,
  ];

  static TargetingTypeFilterTargetingTypesEnum? fromJson(dynamic value) => TargetingTypeFilterTargetingTypesEnumTypeTransformer().decode(value);

  static List<TargetingTypeFilterTargetingTypesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTypeFilterTargetingTypesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTypeFilterTargetingTypesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingTypeFilterTargetingTypesEnum] to String,
/// and [decode] dynamic data back to [TargetingTypeFilterTargetingTypesEnum].
class TargetingTypeFilterTargetingTypesEnumTypeTransformer {
  factory TargetingTypeFilterTargetingTypesEnumTypeTransformer() => _instance ??= const TargetingTypeFilterTargetingTypesEnumTypeTransformer._();

  const TargetingTypeFilterTargetingTypesEnumTypeTransformer._();

  String encode(TargetingTypeFilterTargetingTypesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingTypeFilterTargetingTypesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingTypeFilterTargetingTypesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return TargetingTypeFilterTargetingTypesEnum.KEYWORD;
        case r'APPTYPE': return TargetingTypeFilterTargetingTypesEnum.APPTYPE;
        case r'GENDER': return TargetingTypeFilterTargetingTypesEnum.GENDER;
        case r'LOCATION': return TargetingTypeFilterTargetingTypesEnum.LOCATION;
        case r'PLACEMENT': return TargetingTypeFilterTargetingTypesEnum.PLACEMENT;
        case r'COUNTRY': return TargetingTypeFilterTargetingTypesEnum.COUNTRY;
        case r'TARGETED_INTEREST': return TargetingTypeFilterTargetingTypesEnum.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return TargetingTypeFilterTargetingTypesEnum.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return TargetingTypeFilterTargetingTypesEnum.AUDIENCE_INCLUDE;
        case r'GEO': return TargetingTypeFilterTargetingTypesEnum.GEO;
        case r'AGE_BUCKET': return TargetingTypeFilterTargetingTypesEnum.AGE_BUCKET;
        case r'REGION': return TargetingTypeFilterTargetingTypesEnum.REGION;
        case r'MEDIA_TYPE': return TargetingTypeFilterTargetingTypesEnum.MEDIA_TYPE;
        case r'AGE_BUCKET_AND_GENDER': return TargetingTypeFilterTargetingTypesEnum.AGE_BUCKET_AND_GENDER;
        case r'AUDIENCE_MULTIPLIER': return TargetingTypeFilterTargetingTypesEnum.AUDIENCE_MULTIPLIER;
        case r'CREATIVE_ENHANCEMENTS': return TargetingTypeFilterTargetingTypesEnum.CREATIVE_ENHANCEMENTS;
        case r'LOCAL_ADS_STORE_CODE': return TargetingTypeFilterTargetingTypesEnum.LOCAL_ADS_STORE_CODE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingTypeFilterTargetingTypesEnumTypeTransformer] instance.
  static TargetingTypeFilterTargetingTypesEnumTypeTransformer? _instance;
}


