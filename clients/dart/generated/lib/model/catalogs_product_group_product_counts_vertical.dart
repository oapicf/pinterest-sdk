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
    required this.appLinks,
    required this.images,
  });

  CatalogsProductGroupProductCountsVerticalCatalogTypeEnum catalogType;

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

  /// Minimum value: 0
  num appLinks;

  /// Minimum value: 0
  num images;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupProductCountsVertical &&
    other.catalogType == catalogType &&
    other.inStock == inStock &&
    other.outOfStock == outOfStock &&
    other.preorder == preorder &&
    other.total == total &&
    other.videos == videos &&
    other.appLinks == appLinks &&
    other.images == images;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (inStock.hashCode) +
    (outOfStock.hashCode) +
    (preorder.hashCode) +
    (total.hashCode) +
    (videos.hashCode) +
    (appLinks.hashCode) +
    (images.hashCode);

  @override
  String toString() => 'CatalogsProductGroupProductCountsVertical[catalogType=$catalogType, inStock=$inStock, outOfStock=$outOfStock, preorder=$preorder, total=$total, videos=$videos, appLinks=$appLinks, images=$images]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'in_stock'] = this.inStock;
      json[r'out_of_stock'] = this.outOfStock;
      json[r'preorder'] = this.preorder;
      json[r'total'] = this.total;
      json[r'videos'] = this.videos;
      json[r'app_links'] = this.appLinks;
      json[r'images'] = this.images;
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
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsProductGroupProductCountsVertical[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'in_stock'), 'Required key "CatalogsProductGroupProductCountsVertical[in_stock]" is missing from JSON.');
        assert(json[r'in_stock'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[in_stock]" has a null value in JSON.');
        assert(json.containsKey(r'out_of_stock'), 'Required key "CatalogsProductGroupProductCountsVertical[out_of_stock]" is missing from JSON.');
        assert(json[r'out_of_stock'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[out_of_stock]" has a null value in JSON.');
        assert(json.containsKey(r'preorder'), 'Required key "CatalogsProductGroupProductCountsVertical[preorder]" is missing from JSON.');
        assert(json[r'preorder'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[preorder]" has a null value in JSON.');
        assert(json.containsKey(r'total'), 'Required key "CatalogsProductGroupProductCountsVertical[total]" is missing from JSON.');
        assert(json[r'total'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[total]" has a null value in JSON.');
        assert(json.containsKey(r'videos'), 'Required key "CatalogsProductGroupProductCountsVertical[videos]" is missing from JSON.');
        assert(json[r'videos'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[videos]" has a null value in JSON.');
        assert(json.containsKey(r'app_links'), 'Required key "CatalogsProductGroupProductCountsVertical[app_links]" is missing from JSON.');
        assert(json[r'app_links'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[app_links]" has a null value in JSON.');
        assert(json.containsKey(r'images'), 'Required key "CatalogsProductGroupProductCountsVertical[images]" is missing from JSON.');
        assert(json[r'images'] != null, 'Required key "CatalogsProductGroupProductCountsVertical[images]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupProductCountsVertical(
        catalogType: CatalogsProductGroupProductCountsVerticalCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        inStock: num.parse('${json[r'in_stock']}'),
        outOfStock: num.parse('${json[r'out_of_stock']}'),
        preorder: num.parse('${json[r'preorder']}'),
        total: num.parse('${json[r'total']}'),
        videos: num.parse('${json[r'videos']}'),
        appLinks: num.parse('${json[r'app_links']}'),
        images: num.parse('${json[r'images']}'),
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
    'app_links',
    'images',
  };
}


enum CatalogsProductGroupProductCountsVerticalCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsProductGroupProductCountsVerticalCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsProductGroupProductCountsVerticalCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsProductGroupProductCountsVerticalCatalogTypeEnum? fromJson(dynamic value) => CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsProductGroupProductCountsVerticalCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsProductGroupProductCountsVerticalCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupProductCountsVerticalCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupProductCountsVerticalCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupProductCountsVerticalCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupProductCountsVerticalCatalogTypeEnum].
class CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer {
  factory CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer._();

  const CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsProductGroupProductCountsVerticalCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsProductGroupProductCountsVerticalCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupProductCountsVerticalCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsProductGroupProductCountsVerticalCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsProductGroupProductCountsVerticalCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsProductGroupProductCountsVerticalCatalogTypeEnumTypeTransformer? _instance;
}


