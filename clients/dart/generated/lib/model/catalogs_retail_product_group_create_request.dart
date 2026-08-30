//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailProductGroupCreateRequest {
  /// Returns a new [CatalogsRetailProductGroupCreateRequest] instance.
  CatalogsRetailProductGroupCreateRequest({
    required this.catalogId,
    required this.catalogType,
    this.country,
    this.description,
    required this.filters,
    this.locale,
    required this.name,
  });

  /// Catalog ID pertaining to the product group.
  String catalogId;

  /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  CatalogsRetailProductGroupCreateRequestCatalogTypeEnum catalogType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  String? description;

  CatalogsProductGroupFiltersRequest filters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsLocale? locale;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailProductGroupCreateRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.description == description &&
    other.filters == filters &&
    other.locale == locale &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (filters.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'CatalogsRetailProductGroupCreateRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, description=$description, filters=$filters, locale=$locale, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'filters'] = this.filters;
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [CatalogsRetailProductGroupCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailProductGroupCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_id'), 'Required key "CatalogsRetailProductGroupCreateRequest[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "CatalogsRetailProductGroupCreateRequest[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsRetailProductGroupCreateRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsRetailProductGroupCreateRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "CatalogsRetailProductGroupCreateRequest[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "CatalogsRetailProductGroupCreateRequest[filters]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "CatalogsRetailProductGroupCreateRequest[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "CatalogsRetailProductGroupCreateRequest[name]" has a null value in JSON.');
        return true;
      }());

      return CatalogsRetailProductGroupCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsRetailProductGroupCreateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country']),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsProductGroupFiltersRequest.fromJson(json[r'filters'])!,
        locale: CatalogsLocale.fromJson(json[r'locale']),
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CatalogsRetailProductGroupCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailProductGroupCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailProductGroupCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailProductGroupCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailProductGroupCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsRetailProductGroupCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailProductGroupCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailProductGroupCreateRequest.listFromJson(entry.value, growable: growable,);
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

/// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
enum CatalogsRetailProductGroupCreateRequestCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailProductGroupCreateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailProductGroupCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailProductGroupCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailProductGroupCreateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailProductGroupCreateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupCreateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupCreateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailProductGroupCreateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailProductGroupCreateRequestCatalogTypeEnum].
class CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailProductGroupCreateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailProductGroupCreateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailProductGroupCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailProductGroupCreateRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailProductGroupCreateRequestCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailProductGroupCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


