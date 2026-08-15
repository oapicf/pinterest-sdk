//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemResponseOneOf1 {
  /// Returns a new [ItemResponseOneOf1] instance.
  ItemResponseOneOf1({
    required this.catalogType,
    this.errors = const [],
    this.itemId,
    this.hotelId,
    this.creativeAssetsId,
  });

  CatalogsType catalogType;

  List<ItemValidationEvent> errors;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  /// The catalog hotel id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? hotelId;

  /// The catalog creative assets id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? creativeAssetsId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemResponseOneOf1 &&
    other.catalogType == catalogType &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.hotelId == hotelId &&
    other.creativeAssetsId == creativeAssetsId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (errors.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (hotelId == null ? 0 : hotelId!.hashCode) +
    (creativeAssetsId == null ? 0 : creativeAssetsId!.hashCode);

  @override
  String toString() => 'ItemResponseOneOf1[catalogType=$catalogType, errors=$errors, itemId=$itemId, hotelId=$hotelId, creativeAssetsId=$creativeAssetsId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'errors'] = this.errors;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    if (this.hotelId != null) {
      json[r'hotel_id'] = this.hotelId;
    } else {
      json[r'hotel_id'] = null;
    }
    if (this.creativeAssetsId != null) {
      json[r'creative_assets_id'] = this.creativeAssetsId;
    } else {
      json[r'creative_assets_id'] = null;
    }
    return json;
  }

  /// Returns a new [ItemResponseOneOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemResponseOneOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemResponseOneOf1[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemResponseOneOf1[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemResponseOneOf1(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id'),
        hotelId: mapValueOfType<String>(json, r'hotel_id'),
        creativeAssetsId: mapValueOfType<String>(json, r'creative_assets_id'),
      );
    }
    return null;
  }

  static List<ItemResponseOneOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemResponseOneOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemResponseOneOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemResponseOneOf1> mapFromJson(dynamic json) {
    final map = <String, ItemResponseOneOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemResponseOneOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemResponseOneOf1-objects as value to a dart map
  static Map<String, List<ItemResponseOneOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemResponseOneOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemResponseOneOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'errors',
  };
}

