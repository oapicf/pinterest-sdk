//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsAvailableFilterValues {
  /// Returns a new [CatalogsCreativeAssetsAvailableFilterValues] instance.
  CatalogsCreativeAssetsAvailableFilterValues({
    required this.catalogType,
    required this.filterValues,
  });

  CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum catalogType;

  CatalogsCreativeAssetsFilterValuesMap filterValues;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsAvailableFilterValues &&
    other.catalogType == catalogType &&
    other.filterValues == filterValues;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (filterValues.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsAvailableFilterValues[catalogType=$catalogType, filterValues=$filterValues]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'filter_values'] = this.filterValues;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsAvailableFilterValues] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsAvailableFilterValues? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsAvailableFilterValues[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsAvailableFilterValues[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsAvailableFilterValues(
        catalogType: CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        filterValues: CatalogsCreativeAssetsFilterValuesMap.fromJson(json[r'filter_values'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsAvailableFilterValues> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsAvailableFilterValues>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsAvailableFilterValues.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsAvailableFilterValues> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsAvailableFilterValues>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsAvailableFilterValues.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsAvailableFilterValues-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsAvailableFilterValues>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsAvailableFilterValues>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsAvailableFilterValues.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'filter_values',
  };
}


class CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum].
  static const values = <CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum].
class CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsAvailableFilterValuesCatalogTypeEnumTypeTransformer? _instance;
}


