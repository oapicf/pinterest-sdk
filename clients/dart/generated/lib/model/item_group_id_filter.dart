//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemGroupIdFilter {
  /// Returns a new [ItemGroupIdFilter] instance.
  ItemGroupIdFilter({
    required this.ITEM_GROUP_ID,
  });

  CatalogsProductGroupMultipleStringCriteria ITEM_GROUP_ID;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemGroupIdFilter &&
    other.ITEM_GROUP_ID == ITEM_GROUP_ID;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ITEM_GROUP_ID.hashCode);

  @override
  String toString() => 'ItemGroupIdFilter[ITEM_GROUP_ID=$ITEM_GROUP_ID]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ITEM_GROUP_ID'] = this.ITEM_GROUP_ID;
    return json;
  }

  /// Returns a new [ItemGroupIdFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemGroupIdFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ITEM_GROUP_ID'), 'Required key "ItemGroupIdFilter[ITEM_GROUP_ID]" is missing from JSON.');
        assert(json[r'ITEM_GROUP_ID'] != null, 'Required key "ItemGroupIdFilter[ITEM_GROUP_ID]" has a null value in JSON.');
        return true;
      }());

      return ItemGroupIdFilter(
        ITEM_GROUP_ID: CatalogsProductGroupMultipleStringCriteria.fromJson(json[r'ITEM_GROUP_ID'])!,
      );
    }
    return null;
  }

  static List<ItemGroupIdFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemGroupIdFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemGroupIdFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemGroupIdFilter> mapFromJson(dynamic json) {
    final map = <String, ItemGroupIdFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemGroupIdFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemGroupIdFilter-objects as value to a dart map
  static Map<String, List<ItemGroupIdFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemGroupIdFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemGroupIdFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ITEM_GROUP_ID',
  };
}

