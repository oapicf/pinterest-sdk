//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroupProductCounts {
  /// Returns a new [CatalogsHotelProductGroupProductCounts] instance.
  CatalogsHotelProductGroupProductCounts({
    required this.catalogType,
    required this.total,
  });

  CatalogsHotelProductGroupProductCountsCatalogTypeEnum catalogType;

  /// Minimum value: 0
  num total;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupProductCounts &&
    other.catalogType == catalogType &&
    other.total == total;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (total.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroupProductCounts[catalogType=$catalogType, total=$total]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'total'] = this.total;
    return json;
  }

  /// Returns a new [CatalogsHotelProductGroupProductCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroupProductCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelProductGroupProductCounts[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelProductGroupProductCounts[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelProductGroupProductCounts(
        catalogType: CatalogsHotelProductGroupProductCountsCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        total: num.parse('${json[r'total']}'),
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroupProductCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupProductCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupProductCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroupProductCounts> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroupProductCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroupProductCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroupProductCounts-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroupProductCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroupProductCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroupProductCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'total',
  };
}


class CatalogsHotelProductGroupProductCountsCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelProductGroupProductCountsCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelProductGroupProductCountsCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelProductGroupProductCountsCatalogTypeEnum].
  static const values = <CatalogsHotelProductGroupProductCountsCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelProductGroupProductCountsCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelProductGroupProductCountsCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupProductCountsCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupProductCountsCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupProductCountsCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupProductCountsCatalogTypeEnum].
class CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelProductGroupProductCountsCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelProductGroupProductCountsCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupProductCountsCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelProductGroupProductCountsCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelProductGroupProductCountsCatalogTypeEnumTypeTransformer? _instance;
}


