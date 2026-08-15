//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemProcessingRecord {
  /// Returns a new [ItemProcessingRecord] instance.
  ItemProcessingRecord({
    this.errors = const [],
    this.itemId,
    this.status,
    this.warnings = const [],
  });

  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  List<ItemValidationEvent> errors;

  /// The catalog item id in the merchant namespace
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ItemProcessingStatus? status;

  /// Array with the validation warnings for the item processing record
  List<ItemValidationEvent> warnings;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemProcessingRecord &&
    _deepEquality.equals(other.errors, errors) &&
    other.itemId == itemId &&
    other.status == status &&
    _deepEquality.equals(other.warnings, warnings);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errors.hashCode) +
    (itemId == null ? 0 : itemId!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (warnings.hashCode);

  @override
  String toString() => 'ItemProcessingRecord[errors=$errors, itemId=$itemId, status=$status, warnings=$warnings]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'errors'] = this.errors;
    if (this.itemId != null) {
      json[r'item_id'] = this.itemId;
    } else {
      json[r'item_id'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'warnings'] = this.warnings;
    return json;
  }

  /// Returns a new [ItemProcessingRecord] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemProcessingRecord? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemProcessingRecord[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemProcessingRecord[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemProcessingRecord(
        errors: ItemValidationEvent.listFromJson(json[r'errors']),
        itemId: mapValueOfType<String>(json, r'item_id'),
        status: ItemProcessingStatus.fromJson(json[r'status']),
        warnings: ItemValidationEvent.listFromJson(json[r'warnings']),
      );
    }
    return null;
  }

  static List<ItemProcessingRecord> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemProcessingRecord>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemProcessingRecord.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemProcessingRecord> mapFromJson(dynamic json) {
    final map = <String, ItemProcessingRecord>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemProcessingRecord.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemProcessingRecord-objects as value to a dart map
  static Map<String, List<ItemProcessingRecord>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemProcessingRecord>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemProcessingRecord.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

