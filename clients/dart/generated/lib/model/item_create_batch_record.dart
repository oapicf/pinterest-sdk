//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemCreateBatchRecord {
  /// Returns a new [ItemCreateBatchRecord] instance.
  ItemCreateBatchRecord({
    this.attributes,
    this.itemId,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemAttributesRequest? attributes;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemCreateBatchRecord &&
    other.attributes == attributes &&
    other.itemId == itemId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributes == null ? 0 : attributes!.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode);

  @override
  String toString() => 'ItemCreateBatchRecord[attributes=$attributes, itemId=$itemId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributes != null) {
      json[r'attributes'] = this.attributes;
    } else {
      json[r'attributes'] = null;
    }
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    return json;
  }

  /// Returns a new [ItemCreateBatchRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemCreateBatchRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemCreateBatchRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemCreateBatchRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemCreateBatchRecord(
        attributes: ItemAttributesRequest.fromJson(json[r'attributes']),
        itemId: mapValueOfType<String>(json, r'item_id'),
      );
    }
    return null;
  }

  static List<ItemCreateBatchRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemCreateBatchRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemCreateBatchRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemCreateBatchRecord> mapFromJson(dynamic json) {
    final map = <String, ItemCreateBatchRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemCreateBatchRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemCreateBatchRecord-objects as value to a dart map
  static Map<String, List<ItemCreateBatchRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemCreateBatchRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemCreateBatchRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

