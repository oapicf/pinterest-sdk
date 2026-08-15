//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsFilters {
  /// Returns a new [CatalogsItemsFilters] instance.
  CatalogsItemsFilters({
    required this.catalogType,
    this.catalogId,
    this.itemIds = const [],
    this.hotelIds = const [],
    this.creativeAssetsIds = const [],
  });

  CatalogsType catalogType;

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  List<String> itemIds;

  List<String> hotelIds;

  List<String> creativeAssetsIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsFilters &&
    other.catalogType == catalogType &&
    other.catalogId == catalogId &&
    _deepEquality.equals(other.itemIds, itemIds) &&
    _deepEquality.equals(other.hotelIds, hotelIds) &&
    _deepEquality.equals(other.creativeAssetsIds, creativeAssetsIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (itemIds.hashCode) +
    (hotelIds.hashCode) +
    (creativeAssetsIds.hashCode);

  @override
  String toString() => 'CatalogsItemsFilters[catalogType=$catalogType, catalogId=$catalogId, itemIds=$itemIds, hotelIds=$hotelIds, creativeAssetsIds=$creativeAssetsIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'item_ids'] = this.itemIds;
      json[r'hotel_ids'] = this.hotelIds;
      json[r'creative_assets_ids'] = this.creativeAssetsIds;
    return json;
  }

  /// Returns a new [CatalogsItemsFilters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsFilters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsItemsFilters[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsItemsFilters[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsItemsFilters(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
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

  static List<CatalogsItemsFilters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsFilters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsFilters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsFilters> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsFilters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsFilters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsFilters-objects as value to a dart map
  static Map<String, List<CatalogsItemsFilters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsFilters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsFilters.listFromJson(entry.value, growable: growable,);
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

