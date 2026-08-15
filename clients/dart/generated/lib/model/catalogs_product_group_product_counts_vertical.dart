//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupProductCountsVertical {
  /// Returns a new [CatalogsProductGroupProductCountsVertical] instance.
  CatalogsProductGroupProductCountsVertical({
    required this.catalogType,
    required this.inStock,
    required this.outOfStock,
    required this.preorder,
    required this.total,
    required this.videos,
  });

  CatalogsType catalogType;

  /// Minimum value: 0
  num inStock;

  /// Minimum value: 0
  num outOfStock;

  /// Minimum value: 0
  num preorder;

  /// Minimum value: 0
  num total;

  /// Minimum value: 0
  num videos;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupProductCountsVertical &&
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
    (videos.hashCode);

  @override
  String toString() => 'CatalogsProductGroupProductCountsVertical[catalogType=$catalogType, inStock=$inStock, outOfStock=$outOfStock, preorder=$preorder, total=$total, videos=$videos]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'in_stock'] = this.inStock;
      json[r'out_of_stock'] = this.outOfStock;
      json[r'preorder'] = this.preorder;
      json[r'total'] = this.total;
      json[r'videos'] = this.videos;
    return json;
  }

  /// Returns a new [CatalogsProductGroupProductCountsVertical] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupProductCountsVertical? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupProductCountsVertical[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupProductCountsVertical[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupProductCountsVertical(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        inStock: num.parse('${json[r'in_stock']}'),
        outOfStock: num.parse('${json[r'out_of_stock']}'),
        preorder: num.parse('${json[r'preorder']}'),
        total: num.parse('${json[r'total']}'),
        videos: num.parse('${json[r'videos']}'),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupProductCountsVertical> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupProductCountsVertical>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupProductCountsVertical.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupProductCountsVertical> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupProductCountsVertical>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupProductCountsVertical.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupProductCountsVertical-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupProductCountsVertical>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupProductCountsVertical>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupProductCountsVertical.listFromJson(entry.value, growable: growable,);
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
    'videos',
  };
}

