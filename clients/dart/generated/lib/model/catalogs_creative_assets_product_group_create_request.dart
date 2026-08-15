//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsProductGroupCreateRequest {
  /// Returns a new [CatalogsCreativeAssetsProductGroupCreateRequest] instance.
  CatalogsCreativeAssetsProductGroupCreateRequest({
    required this.catalogId,
    required this.catalogType,
    this.description,
    required this.filters,
    required this.name,
  });

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum catalogType;

  String? description;

  CatalogsCreativeAssetsProductGroupFilters filters;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsProductGroupCreateRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.description == description &&
    other.filters == filters &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (filters.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'CatalogsCreativeAssetsProductGroupCreateRequest[catalogId=$catalogId, catalogType=$catalogType, description=$description, filters=$filters, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'filters'] = this.filters;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [CatalogsCreativeAssetsProductGroupCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsProductGroupCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsProductGroupCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsProductGroupCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsProductGroupCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsProductGroupCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsProductGroupCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsProductGroupCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsProductGroupCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsProductGroupCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsProductGroupCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_id',
    'catalog_type',
    'filters',
    'name',
  };
}


class CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum].
  static const values = <CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum].
class CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


