//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroupCreateRequest {
  /// Returns a new [CatalogsHotelProductGroupCreateRequest] instance.
  CatalogsHotelProductGroupCreateRequest({
    required this.catalogId,
    required this.catalogType,
    this.description,
    required this.filters,
    required this.name,
  });

  /// Catalog id pertaining to the hotel product group.
  String catalogId;

  CatalogsHotelProductGroupCreateRequestCatalogTypeEnum catalogType;

  String? description;

  CatalogsHotelProductGroupFilters filters;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupCreateRequest &&
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
  String toString() => 'CatalogsHotelProductGroupCreateRequest[catalogId=$catalogId, catalogType=$catalogType, description=$description, filters=$filters, name=$name]';

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

  /// Returns a new [CatalogsHotelProductGroupCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroupCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsHotelProductGroupCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsHotelProductGroupCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsHotelProductGroupCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsHotelProductGroupCreateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsHotelProductGroupFilters.fromJson(json[r'filters'])!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroupCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroupCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroupCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroupCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroupCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroupCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroupCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroupCreateRequest.listFromJson(entry.value, growable: growable,);
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


class CatalogsHotelProductGroupCreateRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsHotelProductGroupCreateRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const HOTEL = CatalogsHotelProductGroupCreateRequestCatalogTypeEnum._(r'HOTEL');

  /// List of all possible values in this [enum][CatalogsHotelProductGroupCreateRequestCatalogTypeEnum].
  static const values = <CatalogsHotelProductGroupCreateRequestCatalogTypeEnum>[
    HOTEL,
  ];

  static CatalogsHotelProductGroupCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsHotelProductGroupCreateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupCreateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupCreateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupCreateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupCreateRequestCatalogTypeEnum].
class CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelProductGroupCreateRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsHotelProductGroupCreateRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelProductGroupCreateRequestCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsHotelProductGroupCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


