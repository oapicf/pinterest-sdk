//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SchedulesCreate200ResponseInnerDataOneOf {
  /// Returns a new [SchedulesCreate200ResponseInnerDataOneOf] instance.
  SchedulesCreate200ResponseInnerDataOneOf({
    required this.id,
    required this.scheduleId,
    required this.exceptions,
  });

  String id;

  /// Schedule ID.
  String scheduleId;

  PinterestLibError exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SchedulesCreate200ResponseInnerDataOneOf &&
    other.id == id &&
    other.scheduleId == scheduleId &&
    other.exceptions == exceptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (scheduleId.hashCode) +
    (exceptions.hashCode);

  @override
  String toString() => 'SchedulesCreate200ResponseInnerDataOneOf[id=$id, scheduleId=$scheduleId, exceptions=$exceptions]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'schedule_id'] = this.scheduleId;
      json[r'exceptions'] = this.exceptions;
    return json;
  }

  /// Returns a new [SchedulesCreate200ResponseInnerDataOneOf] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SchedulesCreate200ResponseInnerDataOneOf? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "SchedulesCreate200ResponseInnerDataOneOf[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "SchedulesCreate200ResponseInnerDataOneOf[id]" has a null value in JSON.');
        assert(json.containsKey(r'schedule_id'), 'Required key "SchedulesCreate200ResponseInnerDataOneOf[schedule_id]" is missing from JSON.');
        assert(json[r'schedule_id'] != null, 'Required key "SchedulesCreate200ResponseInnerDataOneOf[schedule_id]" has a null value in JSON.');
        assert(json.containsKey(r'exceptions'), 'Required key "SchedulesCreate200ResponseInnerDataOneOf[exceptions]" is missing from JSON.');
        assert(json[r'exceptions'] != null, 'Required key "SchedulesCreate200ResponseInnerDataOneOf[exceptions]" has a null value in JSON.');
        return true;
      }());

      return SchedulesCreate200ResponseInnerDataOneOf(
        id: mapValueOfType<String>(json, r'id')!,
        scheduleId: mapValueOfType<String>(json, r'schedule_id')!,
        exceptions: PinterestLibError.fromJson(json[r'exceptions'])!,
      );
    }
    return null;
  }

  static List<SchedulesCreate200ResponseInnerDataOneOf> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SchedulesCreate200ResponseInnerDataOneOf>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SchedulesCreate200ResponseInnerDataOneOf.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SchedulesCreate200ResponseInnerDataOneOf> mapFromJson(dynamic json) {
    final map = <String, SchedulesCreate200ResponseInnerDataOneOf>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SchedulesCreate200ResponseInnerDataOneOf.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SchedulesCreate200ResponseInnerDataOneOf-objects as value to a dart map
  static Map<String, List<SchedulesCreate200ResponseInnerDataOneOf>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SchedulesCreate200ResponseInnerDataOneOf>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SchedulesCreate200ResponseInnerDataOneOf.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'schedule_id',
    'exceptions',
  };
}

