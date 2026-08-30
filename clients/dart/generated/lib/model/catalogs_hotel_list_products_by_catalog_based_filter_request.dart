//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelListProductsByCatalogBasedFilterRequest {
  /// Returns a new [CatalogsHotelListProductsByCatalogBasedFilterRequest] instance.
  CatalogsHotelListProductsByCatalogBasedFilterRequest({
    required this.catalogId,
    required this.catalogType,
    required this.filters,
  });

  /// Catalog ID pertaining to the product group.
  String catalogId;

  CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum catalogType;

  CatalogsHotelProductGroupFilters filters;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelListProductsByCatalogBasedFilterRequest &&
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
  String toString() => 'CatalogsHotelListProductsByCatalogBasedFilterRequest[catalogId=$catalogId, catalogType=$catalogType, filters=$filters]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
      json[r'filters'] = this.filters;
    return json;
  }

  /// Returns a new [CatalogsHotelListProductsByCatalogBasedFilterRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelListProductsByCatalogBasedFilterRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_id'), 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "CatalogsHotelListProductsByCatalogBasedFilterRequest[filters]" has a null value in JSON.');
        return true;
      }());

      return CatalogsHotelListProductsByCatalogBasedFilterRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        filters: CatalogsHotelProductGroupFilters.fromJson(json[r'filters'])!,
      );
    }
    return null;
  }

  static List<CatalogsHotelListProductsByCatalogBasedFilterRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelListProductsByCatalogBasedFilterRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelListProductsByCatalogBasedFilterRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelListProductsByCatalogBasedFilterRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelListProductsByCatalogBasedFilterRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelListProductsByCatalogBasedFilterRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelListProductsByCatalogBasedFilterRequest-objects as value to a dart map
  static Map<String, List<CatalogsHotelListProductsByCatalogBasedFilterRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelListProductsByCatalogBasedFilterRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelListProductsByCatalogBasedFilterRequest.listFromJson(entry.value, growable: growable,);
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


enum CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum].
class CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelListProductsByCatalogBasedFilterRequestCatalogTypeEnumTypeTransformer? _instance;
}


