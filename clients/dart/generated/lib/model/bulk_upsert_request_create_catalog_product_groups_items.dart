//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BulkUpsertRequestCreateCatalogProductGroupsItems {
  /// Returns a new [BulkUpsertRequestCreateCatalogProductGroupsItems] instance.
  BulkUpsertRequestCreateCatalogProductGroupsItems({
    this.description,
    required this.feedId,
    required this.filters,
    this.isFeatured,
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
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isFeatured;

  String name;

  /// Catalog ID pertaining to the product group.
  String catalogId;

  BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum catalogType;

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
  bool operator ==(Object other) => identical(this, other) || other is BulkUpsertRequestCreateCatalogProductGroupsItems &&
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
    (isFeatured == null ? 0 : isFeatured!.hashCode) +
    (name.hashCode) +
    (catalogId.hashCode) +
    (catalogType.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (locale == null ? 0 : locale!.hashCode);

  @override
  String toString() => 'BulkUpsertRequestCreateCatalogProductGroupsItems[description=$description, feedId=$feedId, filters=$filters, isFeatured=$isFeatured, name=$name, catalogId=$catalogId, catalogType=$catalogType, country=$country, locale=$locale]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
      json[r'feed_id'] = this.feedId;
      json[r'filters'] = this.filters;
    if (this.isFeatured != null) {
      json[r'is_featured'] = this.isFeatured;
    } else {
      json[r'is_featured'] = null;
    }
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

  /// Returns a new [BulkUpsertRequestCreateCatalogProductGroupsItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BulkUpsertRequestCreateCatalogProductGroupsItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'feed_id'), 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[feed_id]" is missing from JSON.');
        assert(json[r'feed_id'] != null, 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[feed_id]" has a null value in JSON.');
        assert(json.containsKey(r'filters'), 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[filters]" is missing from JSON.');
        assert(json[r'filters'] != null, 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[filters]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[name]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_id'), 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[catalog_id]" is missing from JSON.');
        assert(json[r'catalog_id'] != null, 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[catalog_id]" has a null value in JSON.');
        assert(json.containsKey(r'catalog_type'), 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "BulkUpsertRequestCreateCatalogProductGroupsItems[catalog_type]" has a null value in JSON.');
        return true;
      }());

      return BulkUpsertRequestCreateCatalogProductGroupsItems(
        description: mapValueOfType<String>(json, r'description'),
        feedId: mapValueOfType<String>(json, r'feed_id')!,
        filters: CatalogsCreativeAssetsProductGroupFilters.fromJson(json[r'filters'])!,
        isFeatured: mapValueOfType<bool>(json, r'is_featured'),
        name: mapValueOfType<String>(json, r'name')!,
        catalogId: mapValueOfType<String>(json, r'catalog_id')!,
        catalogType: BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country']),
        locale: CatalogsLocale.fromJson(json[r'locale']),
      );
    }
    return null;
  }

  static List<BulkUpsertRequestCreateCatalogProductGroupsItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertRequestCreateCatalogProductGroupsItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertRequestCreateCatalogProductGroupsItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BulkUpsertRequestCreateCatalogProductGroupsItems> mapFromJson(dynamic json) {
    final map = <String, BulkUpsertRequestCreateCatalogProductGroupsItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BulkUpsertRequestCreateCatalogProductGroupsItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BulkUpsertRequestCreateCatalogProductGroupsItems-objects as value to a dart map
  static Map<String, List<BulkUpsertRequestCreateCatalogProductGroupsItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BulkUpsertRequestCreateCatalogProductGroupsItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BulkUpsertRequestCreateCatalogProductGroupsItems.listFromJson(entry.value, growable: growable,);
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


enum BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum? fromJson(dynamic value) => BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum].
class BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer {
  factory BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer() => _instance ??= const BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer._();

  const BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer._();

  String encode(BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum data) => data._value;

  /// Returns the instance of [BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumTypeTransformer? _instance;
}


