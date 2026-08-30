//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelProductGroupUpdateRequest {
  /// Returns a new [CatalogsHotelProductGroupUpdateRequest] instance.
  CatalogsHotelProductGroupUpdateRequest({
    this.catalogType,
    this.description,
    this.filters,
    this.name,
  });

  CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum? catalogType;

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsHotelProductGroupFilters? filters;

  /// Name of catalog product group
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelProductGroupUpdateRequest &&
    other.catalogType == catalogType &&
    other.description == description &&
    other.filters == filters &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType == null ? 0 : catalogType!.hashCode) +
    (description == null ? 0 : description!.hashCode) +
    (filters == null ? 0 : filters!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'CatalogsHotelProductGroupUpdateRequest[catalogType=$catalogType, description=$description, filters=$filters, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogType != null) {
      json[r'catalog_type'] = this.catalogType;
    } else {
      json[r'catalog_type'] = null;
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
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelProductGroupUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelProductGroupUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsHotelProductGroupUpdateRequest(
        catalogType: CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum.fromJson(json[r'catalog_type']),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsHotelProductGroupFilters.fromJson(json[r'filters']),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<CatalogsHotelProductGroupUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelProductGroupUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelProductGroupUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelProductGroupUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelProductGroupUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsHotelProductGroupUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelProductGroupUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelProductGroupUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


enum CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum {
  HOTEL._(r'HOTEL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum].
class CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'HOTEL': return CatalogsHotelProductGroupUpdateRequestCatalogTypeEnum.HOTEL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelProductGroupUpdateRequestCatalogTypeEnumTypeTransformer? _instance;
}


