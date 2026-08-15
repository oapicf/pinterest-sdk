//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
  /// Returns a new [CatalogsVerticalsListProductsByCatalogBasedFilterRequest] instance.
  CatalogsVerticalsListProductsByCatalogBasedFilterRequest({
    required this.catalogId,
    required this.catalogType,
    required this.country,
    required this.filters,
    required this.locale,
  });

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum catalogType;

  Country country;

  CatalogsCreativeAssetsProductGroupFilters filters;

  CatalogsLocale locale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsVerticalsListProductsByCatalogBasedFilterRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.filters == filters &&
    other.locale == locale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country.hashCode) +
    (filters.hashCode) +
    (locale.hashCode);

  @override
  String toString() => 'CatalogsVerticalsListProductsByCatalogBasedFilterRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, filters=$filters, locale=$locale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
      json[r'country'] = this.country;
      json[r'filters'] = this.filters;
      json[r'locale'] = this.locale;
    return json;
  }

  /// Returns a new [CatalogsVerticalsListProductsByCatalogBasedFilterRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsVerticalsListProductsByCatalogBasedFilterRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsVerticalsListProductsByCatalogBasedFilterRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsVerticalsListProductsByCatalogBasedFilterRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsVerticalsListProductsByCatalogBasedFilterRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        locale: CatalogsLocale.fromJson(json[r'locale'])!,
      );
    }
    return null;
  }

  static List<CatalogsVerticalsListProductsByCatalogBasedFilterRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalsListProductsByCatalogBasedFilterRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalsListProductsByCatalogBasedFilterRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsVerticalsListProductsByCatalogBasedFilterRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsVerticalsListProductsByCatalogBasedFilterRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsVerticalsListProductsByCatalogBasedFilterRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsVerticalsListProductsByCatalogBasedFilterRequest-objects as value to a dart map
  static Map<String, List<CatalogsVerticalsListProductsByCatalogBasedFilterRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsVerticalsListProductsByCatalogBasedFilterRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsVerticalsListProductsByCatalogBasedFilterRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'country',
    'filters',
    'locale',
  };
}


class CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum].
  static const values = <CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum].
class CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsVerticalsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer? _instance;
}


