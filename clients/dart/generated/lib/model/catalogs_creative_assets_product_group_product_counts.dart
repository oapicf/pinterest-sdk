//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsProductGroupProductCounts {
  /// Returns a new [CatalogsCreativeAssetsProductGroupProductCounts] instance.
  CatalogsCreativeAssetsProductGroupProductCounts({
    required this.appLinks,
    required this.catalogType,
    required this.images,
    required this.total,
    required this.videos,
  });

  /// Minimum value: 0
  num appLinks;

  CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum catalogType;

  /// Minimum value: 0
  num images;

  /// Minimum value: 0
  num total;

  /// Minimum value: 0
  num videos;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsProductGroupProductCounts &&
    other.appLinks == appLinks &&
    other.catalogType == catalogType &&
    other.images == images &&
    other.total == total &&
    other.videos == videos;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (appLinks.hashCode) +
    (catalogType.hashCode) +
    (images.hashCode) +
    (total.hashCode) +
    (videos.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsProductGroupProductCounts[appLinks=$appLinks, catalogType=$catalogType, images=$images, total=$total, videos=$videos]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'app_links'] = this.appLinks;
      json[r'catalog_type'] = this.catalogType;
      json[r'images'] = this.images;
      json[r'total'] = this.total;
      json[r'videos'] = this.videos;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsProductGroupProductCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsProductGroupProductCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'app_links'), 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[app_links]" is missing from JSON.');
        assert(json[r'app_links'] != null, 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[app_links]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'images'), 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[images]" is missing from JSON.');
        assert(json[r'images'] != null, 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[images]" has a null value in JSON.');
        assert(json.containsKey(r'total'), 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[total]" is missing from JSON.');
        assert(json[r'total'] != null, 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[total]" has a null value in JSON.');
        assert(json.containsKey(r'videos'), 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[videos]" is missing from JSON.');
        assert(json[r'videos'] != null, 'Required key "CatalogsCreativeAssetsProductGroupProductCounts[videos]" has a null value in JSON.');
        return true;
      }());

      return CatalogsCreativeAssetsProductGroupProductCounts(
        appLinks: num.parse('${json[r'app_links']}'),
        catalogType: CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        images: num.parse('${json[r'images']}'),
        total: num.parse('${json[r'total']}'),
        videos: num.parse('${json[r'videos']}'),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsProductGroupProductCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupProductCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupProductCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsProductGroupProductCounts> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsProductGroupProductCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsProductGroupProductCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsProductGroupProductCounts-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsProductGroupProductCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsProductGroupProductCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsProductGroupProductCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'app_links',
    'catalog_type',
    'images',
    'total',
    'videos',
  };
}


enum CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum].
class CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsProductGroupProductCountsCatalogTypeEnumTypeTransformer? _instance;
}


