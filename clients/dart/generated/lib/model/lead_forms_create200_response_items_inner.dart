//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormsCreate200ResponseItemsInner {
  /// Returns a new [LeadFormsCreate200ResponseItemsInner] instance.
  LeadFormsCreate200ResponseItemsInner({
    this.data,
    this.exceptions = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LeadForm? data;

  List<PinterestLibBatchItemException> exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormsCreate200ResponseItemsInner &&
    other.data == data &&
    _deepEquality.equals(other.exceptions, exceptions);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (exceptions.hashCode);

  @override
  String toString() => 'LeadFormsCreate200ResponseItemsInner[data=$data, exceptions=$exceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
      json[r'exceptions'] = this.exceptions;
    return json;
  }

  /// Returns a new [LeadFormsCreate200ResponseItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormsCreate200ResponseItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LeadFormsCreate200ResponseItemsInner(
        data: LeadForm.fromJson(json[r'data']),
        exceptions: PinterestLibBatchItemException.listFromJson(json[r'exceptions']),
      );
    }
    return null;
  }

  static List<LeadFormsCreate200ResponseItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormsCreate200ResponseItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormsCreate200ResponseItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormsCreate200ResponseItemsInner> mapFromJson(dynamic json) {
    final map = <String, LeadFormsCreate200ResponseItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormsCreate200ResponseItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormsCreate200ResponseItemsInner-objects as value to a dart map
  static Map<String, List<LeadFormsCreate200ResponseItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormsCreate200ResponseItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormsCreate200ResponseItemsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

