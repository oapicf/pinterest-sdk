//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemDeleteBatchRecord {
  /// Returns a new [ItemDeleteBatchRecord] instance.
  ItemDeleteBatchRecord({
    this.itemId,
  });

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemDeleteBatchRecord &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (itemId == null ? 0 : itemId!.hashCode);

  @override
  String toString() => 'ItemDeleteBatchRecord[itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    return json;
  }

  /// Returns a new [ItemDeleteBatchRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemDeleteBatchRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemDeleteBatchRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemDeleteBatchRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemDeleteBatchRecord(
        itemId: mapValueOfType<String>(json, r'item_id'),
      );
    }
    return null;
  }

  static List<ItemDeleteBatchRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemDeleteBatchRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemDeleteBatchRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemDeleteBatchRecord> mapFromJson(dynamic json) {
    final map = <String, ItemDeleteBatchRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemDeleteBatchRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemDeleteBatchRecord-objects as value to a dart map
  static Map<String, List<ItemDeleteBatchRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemDeleteBatchRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemDeleteBatchRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

