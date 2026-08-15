//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsVerticalProductGroupCreateRequest {
  /// Returns a new [CatalogsVerticalProductGroupCreateRequest] instance.
  CatalogsVerticalProductGroupCreateRequest({
    required this.catalogId,
    required this.catalogType,
    this.country,
    this.description,
    required this.filters,
    this.locale,
    required this.name,
  });

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum catalogType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  String? description;

  CatalogsCreativeAssetsProductGroupFilters filters;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CatalogsLocale? locale;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsVerticalProductGroupCreateRequest &&
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
  String toString() => 'CatalogsVerticalProductGroupCreateRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, description=$description, filters=$filters, locale=$locale, name=$name]';

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

  /// Returns a new [CatalogsVerticalProductGroupCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsVerticalProductGroupCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsVerticalProductGroupCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsVerticalProductGroupCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsVerticalProductGroupCreateRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country']),
        description: mapValueOfType<String>(json, r'description'),
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        locale: CatalogsLocale.fromJson(json[r'locale']),
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<CatalogsVerticalProductGroupCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalProductGroupCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalProductGroupCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsVerticalProductGroupCreateRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsVerticalProductGroupCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsVerticalProductGroupCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsVerticalProductGroupCreateRequest-objects as value to a dart map
  static Map<String, List<CatalogsVerticalProductGroupCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsVerticalProductGroupCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsVerticalProductGroupCreateRequest.listFromJson(entry.value, growable: growable,);
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


class CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum].
  static const values = <CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum].
class CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsVerticalProductGroupCreateRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsVerticalProductGroupCreateRequestCatalogTypeEnumTypeTransformer? _instance;
}


