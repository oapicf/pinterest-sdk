//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemIdFilter {
  /// Returns a new [ItemIdFilter] instance.
  ItemIdFilter({
    required this.ITEM_ID,
  });

  CatalogsProductGroupMultipleStringCriteria ITEM_ID;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemIdFilter &&
    other.ITEM_ID == ITEM_ID;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ITEM_ID.hashCode);

  @override
  String toString() => 'ItemIdFilter[ITEM_ID=$ITEM_ID]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ITEM_ID'] = this.ITEM_ID;
    return json;
  }

  /// Returns a new [ItemIdFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemIdFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemIdFilter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemIdFilter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemIdFilter(
        ITEM_ID: mapValueOfType<CatalogsProductGroupMultipleStringCriteria>(json, r'ITEM_ID')!,
      );
    }
    return null;
  }

  static List<ItemIdFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemIdFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemIdFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemIdFilter> mapFromJson(dynamic json) {
    final map = <String, ItemIdFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemIdFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemIdFilter-objects as value to a dart map
  static Map<String, List<ItemIdFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemIdFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemIdFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ITEM_ID',
  };
}

