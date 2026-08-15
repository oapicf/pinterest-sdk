//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
  /// Returns a new [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] instance.
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest({
    required this.catalogId,
    required this.catalogType,
    required this.filters,
  });

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum catalogType;

  CatalogsCreativeAssetsProductGroupFilters filters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.filters == filters;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (filters.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest[catalogId=$catalogId, catalogType=$catalogType, filters=$filters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
      json[r'filters'] = this.filters;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'filters',
  };
}


class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum].
  static const values = <CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum].
class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer? _instance;
}


