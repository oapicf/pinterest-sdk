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

  /// Catalog ID pertaining to the product group.
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
        assert(json.containsKey(r'catalog_id'), 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[filters]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CatalogsCreativeAssetsProductGroupCreateRequest[name]" has a null value in JSON.');
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


enum CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnum) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static CatalogsCreativeAssetsProductGroupCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


