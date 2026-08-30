//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsListProductsByFilterRequest {
  /// Returns a new [CatalogsListProductsByFilterRequest] instance.
  CatalogsListProductsByFilterRequest({
    required this.feedId,
    required this.filters,
    required this.catalogId,
    required this.catalogType,
    required this.country,
    required this.locale,
  });

  /// Catalog Feed id pertaining to the catalog product group filter.
  String feedId;

  CatalogsCreativeAssetsProductGroupFilters filters;

  /// Catalog ID pertaining to the product group.
  String catalogId;

  CatalogsListProductsByFilterRequestCatalogTypeEnum catalogType;

  Country country;

  CatalogsLocale locale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsListProductsByFilterRequest &&
    other.feedId == feedId &&
    other.filters == filters &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.locale == locale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (feedId.hashCode) +
    (filters.hashCode) +
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country.hashCode) +
    (locale.hashCode);

  @override
  String toString() => 'CatalogsListProductsByFilterRequest[feedId=$feedId, filters=$filters, catalogId=$catalogId, catalogType=$catalogType, country=$country, locale=$locale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'feed_id'] = this.feedId;
      json[r'filters'] = this.filters;
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
      json[r'country'] = this.country;
      json[r'locale'] = this.locale;
    return json;
  }

  /// Returns a new [CatalogsListProductsByFilterRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsListProductsByFilterRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'feed_id'), 'Required key "CatalogsListProductsByFilterRequest[feed_id]" is missing from JSON.');
        assert(json[r'feed_id'] != null, 'Required key "CatalogsListProductsByFilterRequest[feed_id]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "CatalogsListProductsByFilterRequest[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "CatalogsListProductsByFilterRequest[filters]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_id'), 'Required key "CatalogsListProductsByFilterRequest[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "CatalogsListProductsByFilterRequest[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsListProductsByFilterRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsListProductsByFilterRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "CatalogsListProductsByFilterRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsListProductsByFilterRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'locale'), 'Required key "CatalogsListProductsByFilterRequest[locale]" is missing from JSON.');
        assert(json[r'locale'] != null, 'Required key "CatalogsListProductsByFilterRequest[locale]" has a null value in JSON.');
        return true;
      }());

      return CatalogsListProductsByFilterRequest(
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsListProductsByFilterRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        locale: CatalogsLocale.fromJson(json[r'locale'])!,
      );
    }
    return null;
  }

  static List<CatalogsListProductsByFilterRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsListProductsByFilterRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsListProductsByFilterRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsListProductsByFilterRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsListProductsByFilterRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsListProductsByFilterRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsListProductsByFilterRequest-objects as value to a dart map
  static Map<String, List<CatalogsListProductsByFilterRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsListProductsByFilterRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsListProductsByFilterRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feed_id',
    'filters',
    'catalog_id',
    'catalog_type',
    'country',
    'locale',
  };
}


enum CatalogsListProductsByFilterRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsListProductsByFilterRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsListProductsByFilterRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsListProductsByFilterRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsListProductsByFilterRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsListProductsByFilterRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsListProductsByFilterRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsListProductsByFilterRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsListProductsByFilterRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsListProductsByFilterRequestCatalogTypeEnum].
class CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsListProductsByFilterRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsListProductsByFilterRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsListProductsByFilterRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsListProductsByFilterRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsListProductsByFilterRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsListProductsByFilterRequestCatalogTypeEnumTypeTransformer? _instance;
}


