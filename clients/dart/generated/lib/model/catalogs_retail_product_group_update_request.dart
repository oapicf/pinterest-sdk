//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsRetailProductGroupUpdateRequest {
  /// Returns a new [CatalogsRetailProductGroupUpdateRequest] instance.
  CatalogsRetailProductGroupUpdateRequest({
    this.catalogType,
    this.country,
    this.description,
    this.filters,
    this.locale,
    this.name,
  });

  /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
  CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum? catalogType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsProductGroupFiltersRequest? filters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsLocale? locale;

  /// Name of catalog product group
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsRetailProductGroupUpdateRequest &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.description == description &&
    other.filters == filters &&
    other.locale == locale &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType == null ? 0 : catalogType!.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (filters == null ? 0 : filters!.hashCode) +
    (locale == null ? 0 : locale!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'CatalogsRetailProductGroupUpdateRequest[catalogType=$catalogType, country=$country, description=$description, filters=$filters, locale=$locale, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogType != null) {
      json[r'catalog_type'] = this.catalogType;
    } else {
      json[r'catalog_type'] = null;
    }
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
    if (this.filters != null) {
      json[r'filters'] = this.filters;
    } else {
      json[r'filters'] = null;
    }
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsRetailProductGroupUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsRetailProductGroupUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsRetailProductGroupUpdateRequest(
        catalogType: CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum.fromJson(json[r'catalog_type']),
        country: Country.fromJson(json[r'country']),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsProductGroupFiltersRequest.fromJson(json[r'filters']),
        locale: CatalogsLocale.fromJson(json[r'locale']),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<CatalogsRetailProductGroupUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsRetailProductGroupUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsRetailProductGroupUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsRetailProductGroupUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsRetailProductGroupUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsRetailProductGroupUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsRetailProductGroupUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsRetailProductGroupUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
enum CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum {
  RETAIL._(r'RETAIL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum].
class CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'RETAIL': return CatalogsRetailProductGroupUpdateRequestCatalogTypeEnum.RETAIL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsRetailProductGroupUpdateRequestCatalogTypeEnumTypeTransformer? _instance;
}


