//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MultipleProductGroupsInner {
  /// Returns a new [MultipleProductGroupsInner] instance.
  MultipleProductGroupsInner({
    this.description,
    required this.feedId,
    required this.filters,
    this.isFeatured = false,
    required this.name,
    required this.catalogId,
    required this.catalogType,
    this.country,
    this.locale,
  });

  String? description;

  /// Catalog Feed id pertaining to the catalog product group.
  String feedId;

  CatalogsCreativeAssetsProductGroupFilters filters;

  /// boolean indicator of whether the product group is being featured or not
  bool isFeatured;

  String name;

  /// Catalog id pertaining to the creative assets product group.
  String catalogId;

  MultipleProductGroupsInnerCatalogTypeEnum catalogType;

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
  bool operator ==(Object other) => identical(this, other) || other is MultipleProductGroupsInner &&
    other.description == description &&
    other.feedId == feedId &&
    other.filters == filters &&
    other.isFeatured == isFeatured &&
    other.name == name &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    other.locale == locale;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (feedId.hashCode) +
    (filters.hashCode) +
    (isFeatured.hashCode) +
    (name.hashCode) +
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (locale == null ? 0 : locale!.hashCode);

  @override
  String toString() => 'MultipleProductGroupsInner[description=$description, feedId=$feedId, filters=$filters, isFeatured=$isFeatured, name=$name, catalogId=$catalogId, catalogType=$catalogType, country=$country, locale=$locale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'feed_id'] = this.feedId;
      json[r'filters'] = this.filters;
      json[r'is_featured'] = this.isFeatured;
      json[r'name'] = this.name;
      json[r'catalog_id'] = this.catalogId;
      json[r'catalog_type'] = this.catalogType;
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

  /// Returns a new [MultipleProductGroupsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MultipleProductGroupsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MultipleProductGroupsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MultipleProductGroupsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MultipleProductGroupsInner(
        description: mapValueOfType<String>(json, r'description'),
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        isFeatured: mapValueOfType<bool>(json, r'is_featured') ?? false,
        name: mapValueOfType<String>(json, r'name')!,
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: MultipleProductGroupsInnerCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country']),
        locale: CatalogsLocale.fromJson(json[r'locale']),
      );
    }
    return null;
  }

  static List<MultipleProductGroupsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MultipleProductGroupsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MultipleProductGroupsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MultipleProductGroupsInner> mapFromJson(dynamic json) {
    final map = <String, MultipleProductGroupsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MultipleProductGroupsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MultipleProductGroupsInner-objects as value to a dart map
  static Map<String, List<MultipleProductGroupsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MultipleProductGroupsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MultipleProductGroupsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'feed_id',
    'filters',
    'name',
    'catalog_id',
    'catalog_type',
  };
}


class MultipleProductGroupsInnerCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const MultipleProductGroupsInnerCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = MultipleProductGroupsInnerCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][MultipleProductGroupsInnerCatalogTypeEnum].
  static const values = <MultipleProductGroupsInnerCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static MultipleProductGroupsInnerCatalogTypeEnum? fromJson(dynamic value) => MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer().decode(value);

  static List<MultipleProductGroupsInnerCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MultipleProductGroupsInnerCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MultipleProductGroupsInnerCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MultipleProductGroupsInnerCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [MultipleProductGroupsInnerCatalogTypeEnum].
class MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer {
  factory MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer() => _instance ??= const MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer._();

  const MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer._();

  String encode(MultipleProductGroupsInnerCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a MultipleProductGroupsInnerCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MultipleProductGroupsInnerCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return MultipleProductGroupsInnerCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer] instance.
  static MultipleProductGroupsInnerCatalogTypeEnumTypeTransformer? _instance;
}


