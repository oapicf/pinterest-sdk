//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScheduleCreateRequestAllOf1 {
  /// Returns a new [ScheduleCreateRequestAllOf1] instance.
  ScheduleCreateRequestAllOf1({
    required this.entityId,
    required this.entityType,
  });

  String entityId;

  /// Entity type
  String entityType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScheduleCreateRequestAllOf1 &&
    other.entityId == entityId &&
    other.entityType == entityType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entityId.hashCode) +
    (entityType.hashCode);

  @override
  String toString() => 'ScheduleCreateRequestAllOf1[entityId=$entityId, entityType=$entityType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entity_id'] = this.entityId;
      json[r'entity_type'] = this.entityType;
    return json;
  }

  /// Returns a new [ScheduleCreateRequestAllOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScheduleCreateRequestAllOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_id'), 'Required key "ScheduleCreateRequestAllOf1[entity_id]" is missing from JSON.');
        assert(json[r'entity_id'] != null, 'Required key "ScheduleCreateRequestAllOf1[entity_id]" has a null value in JSON.');
        assert(json.containsKey(r'entity_type'), 'Required key "ScheduleCreateRequestAllOf1[entity_type]" is missing from JSON.');
        assert(json[r'entity_type'] != null, 'Required key "ScheduleCreateRequestAllOf1[entity_type]" has a null value in JSON.');
        return true;
      }());

      return ScheduleCreateRequestAllOf1(
        entityId: mapValueOfType<String>(json, r'entity_id')!,
        entityType: mapValueOfType<String>(json, r'entity_type')!,
      );
    }
    return null;
  }

  static List<ScheduleCreateRequestAllOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleCreateRequestAllOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleCreateRequestAllOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScheduleCreateRequestAllOf1> mapFromJson(dynamic json) {
    final map = <String, ScheduleCreateRequestAllOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScheduleCreateRequestAllOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScheduleCreateRequestAllOf1-objects as value to a dart map
  static Map<String, List<ScheduleCreateRequestAllOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScheduleCreateRequestAllOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScheduleCreateRequestAllOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_id',
    'entity_type',
  };
}

