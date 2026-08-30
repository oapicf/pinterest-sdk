//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScheduleCreateRequest {
  /// Returns a new [ScheduleCreateRequest] instance.
  ScheduleCreateRequest({
    required this.entityId,
    required this.entityType,
    required this.deltaValue,
    required this.endTimestamp,
    required this.name,
    required this.scheduleAction,
    required this.scheduleStatus,
    required this.scheduleType,
    required this.startTimestamp,
  });

  String entityId;

  /// Entity type
  String entityType;

  ScheduleCommonDeltaValue deltaValue;

  /// Schedule end time. Unix timestamp in seconds.
  int endTimestamp;

  String name;

  ScheduleAction scheduleAction;

  ScheduleStatus scheduleStatus;

  ScheduleType scheduleType;

  /// Schedule start time. Unix timestamp in seconds.
  int startTimestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScheduleCreateRequest &&
    other.entityId == entityId &&
    other.entityType == entityType &&
    other.deltaValue == deltaValue &&
    other.endTimestamp == endTimestamp &&
    other.name == name &&
    other.scheduleAction == scheduleAction &&
    other.scheduleStatus == scheduleStatus &&
    other.scheduleType == scheduleType &&
    other.startTimestamp == startTimestamp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entityId.hashCode) +
    (entityType.hashCode) +
    (deltaValue.hashCode) +
    (endTimestamp.hashCode) +
    (name.hashCode) +
    (scheduleAction.hashCode) +
    (scheduleStatus.hashCode) +
    (scheduleType.hashCode) +
    (startTimestamp.hashCode);

  @override
  String toString() => 'ScheduleCreateRequest[entityId=$entityId, entityType=$entityType, deltaValue=$deltaValue, endTimestamp=$endTimestamp, name=$name, scheduleAction=$scheduleAction, scheduleStatus=$scheduleStatus, scheduleType=$scheduleType, startTimestamp=$startTimestamp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entity_id'] = this.entityId;
      json[r'entity_type'] = this.entityType;
      json[r'delta_value'] = this.deltaValue;
      json[r'end_timestamp'] = this.endTimestamp;
      json[r'name'] = this.name;
      json[r'schedule_action'] = this.scheduleAction;
      json[r'schedule_status'] = this.scheduleStatus;
      json[r'schedule_type'] = this.scheduleType;
      json[r'start_timestamp'] = this.startTimestamp;
    return json;
  }

  /// Returns a new [ScheduleCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScheduleCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_id'), 'Required key "ScheduleCreateRequest[entity_id]" is missing from JSON.');
        assert(json[r'entity_id'] != null, 'Required key "ScheduleCreateRequest[entity_id]" has a null value in JSON.');
        assert(json.containsKey(r'entity_type'), 'Required key "ScheduleCreateRequest[entity_type]" is missing from JSON.');
        assert(json[r'entity_type'] != null, 'Required key "ScheduleCreateRequest[entity_type]" has a null value in JSON.');
        assert(json.containsKey(r'delta_value'), 'Required key "ScheduleCreateRequest[delta_value]" is missing from JSON.');
        assert(json[r'delta_value'] != null, 'Required key "ScheduleCreateRequest[delta_value]" has a null value in JSON.');
        assert(json.containsKey(r'end_timestamp'), 'Required key "ScheduleCreateRequest[end_timestamp]" is missing from JSON.');
        assert(json[r'end_timestamp'] != null, 'Required key "ScheduleCreateRequest[end_timestamp]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "ScheduleCreateRequest[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "ScheduleCreateRequest[name]" has a null value in JSON.');
        assert(json.containsKey(r'schedule_action'), 'Required key "ScheduleCreateRequest[schedule_action]" is missing from JSON.');
        assert(json[r'schedule_action'] != null, 'Required key "ScheduleCreateRequest[schedule_action]" has a null value in JSON.');
        assert(json.containsKey(r'schedule_status'), 'Required key "ScheduleCreateRequest[schedule_status]" is missing from JSON.');
        assert(json[r'schedule_status'] != null, 'Required key "ScheduleCreateRequest[schedule_status]" has a null value in JSON.');
        assert(json.containsKey(r'schedule_type'), 'Required key "ScheduleCreateRequest[schedule_type]" is missing from JSON.');
        assert(json[r'schedule_type'] != null, 'Required key "ScheduleCreateRequest[schedule_type]" has a null value in JSON.');
        assert(json.containsKey(r'start_timestamp'), 'Required key "ScheduleCreateRequest[start_timestamp]" is missing from JSON.');
        assert(json[r'start_timestamp'] != null, 'Required key "ScheduleCreateRequest[start_timestamp]" has a null value in JSON.');
        return true;
      }());

      return ScheduleCreateRequest(
        entityId: mapValueOfType<String>(json, r'entity_id')!,
        entityType: mapValueOfType<String>(json, r'entity_type')!,
        deltaValue: ScheduleCommonDeltaValue.fromJson(json[r'delta_value'])!,
        endTimestamp: mapValueOfType<int>(json, r'end_timestamp')!,
        name: mapValueOfType<String>(json, r'name')!,
        scheduleAction: ScheduleAction.fromJson(json[r'schedule_action'])!,
        scheduleStatus: ScheduleStatus.fromJson(json[r'schedule_status'])!,
        scheduleType: ScheduleType.fromJson(json[r'schedule_type'])!,
        startTimestamp: mapValueOfType<int>(json, r'start_timestamp')!,
      );
    }
    return null;
  }

  static List<ScheduleCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScheduleCreateRequest> mapFromJson(dynamic json) {
    final map = <String, ScheduleCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScheduleCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScheduleCreateRequest-objects as value to a dart map
  static Map<String, List<ScheduleCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScheduleCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScheduleCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_id',
    'entity_type',
    'delta_value',
    'end_timestamp',
    'name',
    'schedule_action',
    'schedule_status',
    'schedule_type',
    'start_timestamp',
  };
}

