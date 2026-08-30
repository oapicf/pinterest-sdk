//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailProductGroupProductCounts {
  /// Returns a new [CatalogsRetailProductGroupProductCounts] instance.
  CatalogsRetailProductGroupProductCounts({
    required this.catalogType,
    required this.inStock,
    required this.outOfStock,
    required this.preorder,
    required this.total,
    this.videos,
  });

  CatalogsRetailProductGroupProductCountsCatalogTypeEnum catalogType;

  /// Minimum value: 0
  num inStock;

  /// Minimum value: 0
  num outOfStock;

  /// Minimum value: 0
  num preorder;

  /// Minimum value: 0
  num total;

  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? videos;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailProductGroupProductCounts &&
    other.catalogType == catalogType &&
    other.inStock == inStock &&
    other.outOfStock == outOfStock &&
    other.preorder == preorder &&
    other.total == total &&
    other.videos == videos;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (inStock.hashCode) +
    (outOfStock.hashCode) +
    (preorder.hashCode) +
    (total.hashCode) +
    (videos == null ? 0 : videos!.hashCode);

  @override
  String toString() => 'CatalogsRetailProductGroupProductCounts[catalogType=$catalogType, inStock=$inStock, outOfStock=$outOfStock, preorder=$preorder, total=$total, videos=$videos]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'in_stock'] = this.inStock;
      json[r'out_of_stock'] = this.outOfStock;
      json[r'preorder'] = this.preorder;
      json[r'total'] = this.total;
    if (this.videos != null) {
      json[r'videos'] = this.videos;
    } else {
      json[r'videos'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailProductGroupProductCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailProductGroupProductCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailProductGroupProductCounts[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailProductGroupProductCounts[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'in_stock'), 'Required key "CatalogsRetailProductGroupProductCounts[in_stock]" is missing from JSON.');
        assert(json[r'in_stock'] != null, 'Required key "CatalogsRetailProductGroupProductCounts[in_stock]" has a null value in JSON.');
        assert(json.containsKey(r'out_of_stock'), 'Required key "CatalogsRetailProductGroupProductCounts[out_of_stock]" is missing from JSON.');
        assert(json[r'out_of_stock'] != null, 'Required key "CatalogsRetailProductGroupProductCounts[out_of_stock]" has a null value in JSON.');
        assert(json.containsKey(r'preorder'), 'Required key "CatalogsRetailProductGroupProductCounts[preorder]" is missing from JSON.');
        assert(json[r'preorder'] != null, 'Required key "CatalogsRetailProductGroupProductCounts[preorder]" has a null value in JSON.');
        assert(json.containsKey(r'total'), 'Required key "CatalogsRetailProductGroupProductCounts[total]" is missing from JSON.');
        assert(json[r'total'] != null, 'Required key "CatalogsRetailProductGroupProductCounts[total]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailProductGroupProductCounts(
        catalogType: CatalogsRetailProductGroupProductCountsCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        inStock: num.parse('${json[r'in_stock']}'),
        outOfStock: num.parse('${json[r'out_of_stock']}'),
        preorder: num.parse('${json[r'preorder']}'),
        total: num.parse('${json[r'total']}'),
        videos: num.parse('${json[r'videos']}'),
      );
    }
    return null;
  }

  static List<CatalogsRetailProductGroupProductCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupProductCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupProductCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailProductGroupProductCounts> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailProductGroupProductCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailProductGroupProductCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailProductGroupProductCounts-objects as value to a dart map
  static Map<String, List<CatalogsRetailProductGroupProductCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailProductGroupProductCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailProductGroupProductCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'in_stock',
    'out_of_stock',
    'preorder',
    'total',
  };
}


enum CatalogsRetailProductGroupProductCountsCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailProductGroupProductCountsCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailProductGroupProductCountsCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailProductGroupProductCountsCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailProductGroupProductCountsCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailProductGroupProductCountsCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupProductCountsCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupProductCountsCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailProductGroupProductCountsCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailProductGroupProductCountsCatalogTypeEnum].
class CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailProductGroupProductCountsCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailProductGroupProductCountsCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailProductGroupProductCountsCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailProductGroupProductCountsCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailProductGroupProductCountsCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailProductGroupProductCountsCatalogTypeEnumTypeTransformer? _instance;
}


