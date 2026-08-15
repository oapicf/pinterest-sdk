//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationLogsInvalidLogResponseRejectedLogsInner {
  /// Returns a new [IntegrationLogsInvalidLogResponseRejectedLogsInner] instance.
  IntegrationLogsInvalidLogResponseRejectedLogsInner({
    required this.field,
    this.logIndex,
    required this.reason,
    required this.value,
  });

  /// The field name containing an invalid value.
  String field;

  /// Index of the log in the batch.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? logIndex;

  /// The reason the value is invalid.
  String reason;

  /// The value that is invalid.
  String value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationLogsInvalidLogResponseRejectedLogsInner &&
    other.field == field &&
    other.logIndex == logIndex &&
    other.reason == reason &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (logIndex == null ? 0 : logIndex!.hashCode) +
    (reason.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'IntegrationLogsInvalidLogResponseRejectedLogsInner[field=$field, logIndex=$logIndex, reason=$reason, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
    if (this.logIndex != null) {
      json[r'log_index'] = this.logIndex;
    } else {
      json[r'log_index'] = null;
    }
      json[r'reason'] = this.reason;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [IntegrationLogsInvalidLogResponseRejectedLogsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationLogsInvalidLogResponseRejectedLogsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "IntegrationLogsInvalidLogResponseRejectedLogsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "IntegrationLogsInvalidLogResponseRejectedLogsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return IntegrationLogsInvalidLogResponseRejectedLogsInner(
        field: mapValueOfType<String>(json, r'field')!,
        logIndex: mapValueOfType<int>(json, r'log_index'),
        reason: mapValueOfType<String>(json, r'reason')!,
        value: mapValueOfType<String>(json, r'value')!,
      );
    }
    return null;
  }

  static List<IntegrationLogsInvalidLogResponseRejectedLogsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogsInvalidLogResponseRejectedLogsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogsInvalidLogResponseRejectedLogsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationLogsInvalidLogResponseRejectedLogsInner> mapFromJson(dynamic json) {
    final map = <String, IntegrationLogsInvalidLogResponseRejectedLogsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationLogsInvalidLogResponseRejectedLogsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationLogsInvalidLogResponseRejectedLogsInner-objects as value to a dart map
  static Map<String, List<IntegrationLogsInvalidLogResponseRejectedLogsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationLogsInvalidLogResponseRejectedLogsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationLogsInvalidLogResponseRejectedLogsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'reason',
    'value',
  };
}

