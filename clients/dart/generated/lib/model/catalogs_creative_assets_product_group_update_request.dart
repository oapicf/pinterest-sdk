//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsCreativeAssetsProductGroupUpdateRequest {
  /// Returns a new [CatalogsCreativeAssetsProductGroupUpdateRequest] instance.
  CatalogsCreativeAssetsProductGroupUpdateRequest({
    this.catalogType,
    this.description,
    this.filters,
    this.name,
  });

  CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum? catalogType;

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsCreativeAssetsProductGroupFilters? filters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsCreativeAssetsProductGroupUpdateRequest &&
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
  String toString() => 'CatalogsCreativeAssetsProductGroupUpdateRequest[catalogType=$catalogType, description=$description, filters=$filters, name=$name]';

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

  /// Returns a new [CatalogsCreativeAssetsProductGroupUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsCreativeAssetsProductGroupUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsCreativeAssetsProductGroupUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsCreativeAssetsProductGroupUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsCreativeAssetsProductGroupUpdateRequest(
        catalogType: CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum.fromJson(json[r'catalog_type']),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters']),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<CatalogsCreativeAssetsProductGroupUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsCreativeAssetsProductGroupUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsCreativeAssetsProductGroupUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsCreativeAssetsProductGroupUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsCreativeAssetsProductGroupUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsCreativeAssetsProductGroupUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsCreativeAssetsProductGroupUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsCreativeAssetsProductGroupUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum].
  static const values = <CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum].
class CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsCreativeAssetsProductGroupUpdateRequestCatalogTypeEnumTypeTransformer? _instance;
}


