//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailAvailableFilterValues {
  /// Returns a new [CatalogsRetailAvailableFilterValues] instance.
  CatalogsRetailAvailableFilterValues({
    required this.catalogType,
    required this.filterValues,
  });

  CatalogsRetailAvailableFilterValuesCatalogTypeEnum catalogType;

  CatalogsRetailFilterValuesMap filterValues;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailAvailableFilterValues &&
    other.catalogType == catalogType &&
    other.filterValues == filterValues;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (filterValues.hashCode);

  @override
  String toString() => 'CatalogsRetailAvailableFilterValues[catalogType=$catalogType, filterValues=$filterValues]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'filter_values'] = this.filterValues;
    return json;
  }

  /// Returns a new [CatalogsRetailAvailableFilterValues] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailAvailableFilterValues? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsRetailAvailableFilterValues[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsRetailAvailableFilterValues[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsRetailAvailableFilterValues(
        catalogType: CatalogsRetailAvailableFilterValuesCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        filterValues: CatalogsRetailFilterValuesMap.fromJson(json[r'filter_values'])!,
      );
    }
    return null;
  }

  static List<CatalogsRetailAvailableFilterValues> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailAvailableFilterValues>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailAvailableFilterValues.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailAvailableFilterValues> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailAvailableFilterValues>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailAvailableFilterValues.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailAvailableFilterValues-objects as value to a dart map
  static Map<String, List<CatalogsRetailAvailableFilterValues>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailAvailableFilterValues>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailAvailableFilterValues.listFromJson(entry.value, growable: growable,);
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


class CatalogsRetailAvailableFilterValuesCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsRetailAvailableFilterValuesCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const RETAIL = CatalogsRetailAvailableFilterValuesCatalogTypeEnum._(r'RETAIL');

  /// List of all possible values in this [enum][CatalogsRetailAvailableFilterValuesCatalogTypeEnum].
  static const values = <CatalogsRetailAvailableFilterValuesCatalogTypeEnum>[
    RETAIL,
  ];

  static CatalogsRetailAvailableFilterValuesCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsRetailAvailableFilterValuesCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailAvailableFilterValuesCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailAvailableFilterValuesCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailAvailableFilterValuesCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailAvailableFilterValuesCatalogTypeEnum].
class CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailAvailableFilterValuesCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsRetailAvailableFilterValuesCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailAvailableFilterValuesCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailAvailableFilterValuesCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer] instance.
  static CatalogsRetailAvailableFilterValuesCatalogTypeEnumTypeTransformer? _instance;
}


