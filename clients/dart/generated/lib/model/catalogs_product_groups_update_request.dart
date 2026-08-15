//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupsUpdateRequest {
  /// Returns a new [CatalogsProductGroupsUpdateRequest] instance.
  CatalogsProductGroupsUpdateRequest({
    this.description,
    this.filters,
    this.isFeatured,
    this.name,
    this.catalogType,
    this.country,
    this.locale,
  });

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsCreativeAssetsProductGroupFilters? filters;

  /// boolean indicator of whether the product group is being featured or not
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isFeatured;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  CatalogsProductGroupsUpdateRequestCatalogTypeEnum? catalogType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsLocale? locale;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupsUpdateRequest &&
    other.description == description &&
    other.filters == filters &&
    other.isFeatured == isFeatured &&
    other.name == name &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.locale == locale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (filters == null ? 0 : filters!.hashCode) +
    (isFeatured == null ? 0 : isFeatured!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (catalogType == null ? 0 : catalogType!.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (locale == null ? 0 : locale!.hashCode);

  @override
  String toString() => 'CatalogsProductGroupsUpdateRequest[description=$description, filters=$filters, isFeatured=$isFeatured, name=$name, catalogType=$catalogType, country=$country, locale=$locale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.isFeatured != null) {
      json[r'is_featured'] = this.isFeatured;
    } else {
      json[r'is_featured'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
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
    if (this.locale != null) {
      json[r'locale'] = this.locale;
    } else {
      json[r'locale'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsProductGroupsUpdateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupsUpdateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupsUpdateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupsUpdateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupsUpdateRequest(
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters']),
        isFeatured: mapValueOfType<bool>(json, r'is_featured'),
        name: mapValueOfType<String>(json, r'name'),
        catalogType: CatalogsProductGroupsUpdateRequestCatalogTypeEnum.fromJson(json[r'catalog_type']),
        country: Country.fromJson(json[r'country']),
        locale: CatalogsLocale.fromJson(json[r'locale']),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupsUpdateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupsUpdateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupsUpdateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupsUpdateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupsUpdateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupsUpdateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupsUpdateRequest-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupsUpdateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupsUpdateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupsUpdateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}


class CatalogsProductGroupsUpdateRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupsUpdateRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsProductGroupsUpdateRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsProductGroupsUpdateRequestCatalogTypeEnum].
  static const values = <CatalogsProductGroupsUpdateRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsProductGroupsUpdateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsProductGroupsUpdateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupsUpdateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupsUpdateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupsUpdateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupsUpdateRequestCatalogTypeEnum].
class CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsProductGroupsUpdateRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupsUpdateRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupsUpdateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsProductGroupsUpdateRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsProductGroupsUpdateRequestCatalogTypeEnumTypeTransformer? _instance;
}


