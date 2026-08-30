//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsPostFilters {
  /// Returns a new [CatalogsItemsPostFilters] instance.
  CatalogsItemsPostFilters({
    this.catalogId,
    required this.catalogType,
    this.itemIds = const [],
    this.hotelIds = const [],
    this.creativeAssetsIds = const [],
  });

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsItemsPostFiltersCatalogTypeEnum catalogType;

  List<String> itemIds;

  List<String> hotelIds;

  List<String> creativeAssetsIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsPostFilters &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.itemIds, itemIds) &&
    _deepEquality.equals(other.hotelIds, hotelIds) &&
    _deepEquality.equals(other.creativeAssetsIds, creativeAssetsIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (itemIds.hashCode) +
    (hotelIds.hashCode) +
    (creativeAssetsIds.hashCode);

  @override
  String toString() => 'CatalogsItemsPostFilters[catalogId=$catalogId, catalogType=$catalogType, itemIds=$itemIds, hotelIds=$hotelIds, creativeAssetsIds=$creativeAssetsIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'item_ids'] = this.itemIds;
      json[r'hotel_ids'] = this.hotelIds;
      json[r'creative_assets_ids'] = this.creativeAssetsIds;
    return json;
  }

  /// Returns a new [CatalogsItemsPostFilters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsPostFilters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsItemsPostFilters[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsItemsPostFilters[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'item_ids'), 'Required key "CatalogsItemsPostFilters[item_ids]" is missing from JSON.');
        assert(json[r'item_ids'] != null, 'Required key "CatalogsItemsPostFilters[item_ids]" has a null value in JSON.');
        assert(json.containsKey(r'hotel_ids'), 'Required key "CatalogsItemsPostFilters[hotel_ids]" is missing from JSON.');
        assert(json[r'hotel_ids'] != null, 'Required key "CatalogsItemsPostFilters[hotel_ids]" has a null value in JSON.');
        assert(json.containsKey(r'creative_assets_ids'), 'Required key "CatalogsItemsPostFilters[creative_assets_ids]" is missing from JSON.');
        assert(json[r'creative_assets_ids'] != null, 'Required key "CatalogsItemsPostFilters[creative_assets_ids]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsPostFilters(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsItemsPostFiltersCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        itemIds: json[r'item_ids'] is Iterable
            ? (json[r'item_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        hotelIds: json[r'hotel_ids'] is Iterable
            ? (json[r'hotel_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        creativeAssetsIds: json[r'creative_assets_ids'] is Iterable
            ? (json[r'creative_assets_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsItemsPostFilters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsPostFilters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsPostFilters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsPostFilters> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsPostFilters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsPostFilters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsPostFilters-objects as value to a dart map
  static Map<String, List<CatalogsItemsPostFilters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsPostFilters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsPostFilters.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'item_ids',
    'hotel_ids',
    'creative_assets_ids',
  };
}


enum CatalogsItemsPostFiltersCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsPostFiltersCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsPostFiltersCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsPostFiltersCatalogTypeEnum? fromJson(dynamic value) => CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsPostFiltersCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsPostFiltersCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsPostFiltersCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsPostFiltersCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsPostFiltersCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsPostFiltersCatalogTypeEnum].
class CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer {
  factory CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer._();

  const CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsItemsPostFiltersCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsPostFiltersCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsPostFiltersCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsPostFiltersCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsItemsPostFiltersCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsPostFiltersCatalogTypeEnumTypeTransformer? _instance;
}


