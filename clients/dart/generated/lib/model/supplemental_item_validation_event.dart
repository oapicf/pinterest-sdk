//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SupplementalItemValidationEvent {
  /// Returns a new [SupplementalItemValidationEvent] instance.
  SupplementalItemValidationEvent({
    required this.attribute,
    required this.code,
    required this.message,
  });

  /// The item attribute referenced by the validation event eg. price, availability, ad_link
  String attribute;

  /// The event code that the item validation event references
  int code;

  /// Title message describing the item validation event
  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SupplementalItemValidationEvent &&
    other.attribute == attribute &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attribute.hashCode) +
    (code.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'SupplementalItemValidationEvent[attribute=$attribute, code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attribute'] = this.attribute;
      json[r'code'] = this.code;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [SupplementalItemValidationEvent] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SupplementalItemValidationEvent? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attribute'), 'Required key "SupplementalItemValidationEvent[attribute]" is missing from JSON.');
        assert(json[r'attribute'] != null, 'Required key "SupplementalItemValidationEvent[attribute]" has a null value in JSON.');
        assert(json.containsKey(r'code'), 'Required key "SupplementalItemValidationEvent[code]" is missing from JSON.');
        assert(json[r'code'] != null, 'Required key "SupplementalItemValidationEvent[code]" has a null value in JSON.');
        assert(json.containsKey(r'message'), 'Required key "SupplementalItemValidationEvent[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "SupplementalItemValidationEvent[message]" has a null value in JSON.');
        return true;
      }());

      return SupplementalItemValidationEvent(
        attribute: mapValueOfType<String>(json, r'attribute')!,
        code: mapValueOfType<int>(json, r'code')!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<SupplementalItemValidationEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SupplementalItemValidationEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SupplementalItemValidationEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SupplementalItemValidationEvent> mapFromJson(dynamic json) {
    final map = <String, SupplementalItemValidationEvent>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SupplementalItemValidationEvent.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SupplementalItemValidationEvent-objects as value to a dart map
  static Map<String, List<SupplementalItemValidationEvent>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SupplementalItemValidationEvent>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SupplementalItemValidationEvent.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attribute',
    'code',
    'message',
  };
}

