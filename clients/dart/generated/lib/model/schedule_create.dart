//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScheduleCreate {
  /// Returns a new [ScheduleCreate] instance.
  ScheduleCreate({
    this.deltaValue,
    this.endTimestamp,
    required this.entityId,
    this.entityType,
    this.name,
    this.scheduleAction,
    this.scheduleStatus,
    this.scheduleType,
    this.startTimestamp,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScheduleDeltaValue? deltaValue;

  /// Schedule end time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? endTimestamp;

  /// entity ID.
  String entityId;

  /// Specify the entity_type to get summary information
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AdAccountEntityType? entityType;

  /// Schedule name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// The schedule action.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScheduleAction? scheduleAction;

  /// Schedule status.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScheduleStatus? scheduleStatus;

  /// The schedule type.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ScheduleType? scheduleType;

  /// Schedule start time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? startTimestamp;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScheduleCreate &&
    other.deltaValue == deltaValue &&
    other.endTimestamp == endTimestamp &&
    other.entityId == entityId &&
    other.entityType == entityType &&
    other.name == name &&
    other.scheduleAction == scheduleAction &&
    other.scheduleStatus == scheduleStatus &&
    other.scheduleType == scheduleType &&
    other.startTimestamp == startTimestamp;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deltaValue == null ? 0 : deltaValue!.hashCode) +
    (endTimestamp == null ? 0 : endTimestamp!.hashCode) +
    (entityId.hashCode) +
    (entityType == null ? 0 : entityType!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (scheduleAction == null ? 0 : scheduleAction!.hashCode) +
    (scheduleStatus == null ? 0 : scheduleStatus!.hashCode) +
    (scheduleType == null ? 0 : scheduleType!.hashCode) +
    (startTimestamp == null ? 0 : startTimestamp!.hashCode);

  @override
  String toString() => 'ScheduleCreate[deltaValue=$deltaValue, endTimestamp=$endTimestamp, entityId=$entityId, entityType=$entityType, name=$name, scheduleAction=$scheduleAction, scheduleStatus=$scheduleStatus, scheduleType=$scheduleType, startTimestamp=$startTimestamp]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.deltaValue != null) {
      json[r'delta_value'] = this.deltaValue;
    } else {
      json[r'delta_value'] = null;
    }
    if (this.endTimestamp != null) {
      json[r'end_timestamp'] = this.endTimestamp;
    } else {
      json[r'end_timestamp'] = null;
    }
      json[r'entity_id'] = this.entityId;
    if (this.entityType != null) {
      json[r'entity_type'] = this.entityType;
    } else {
      json[r'entity_type'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.scheduleAction != null) {
      json[r'schedule_action'] = this.scheduleAction;
    } else {
      json[r'schedule_action'] = null;
    }
    if (this.scheduleStatus != null) {
      json[r'schedule_status'] = this.scheduleStatus;
    } else {
      json[r'schedule_status'] = null;
    }
    if (this.scheduleType != null) {
      json[r'schedule_type'] = this.scheduleType;
    } else {
      json[r'schedule_type'] = null;
    }
    if (this.startTimestamp != null) {
      json[r'start_timestamp'] = this.startTimestamp;
    } else {
      json[r'start_timestamp'] = null;
    }
    return json;
  }

  /// Returns a new [ScheduleCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScheduleCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_id'), 'Required key "ScheduleCreate[entity_id]" is missing from JSON.');
        assert(json[r'entity_id'] != null, 'Required key "ScheduleCreate[entity_id]" has a null value in JSON.');
        return true;
      }());

      return ScheduleCreate(
        deltaValue: ScheduleDeltaValue.fromJson(json[r'delta_value']),
        endTimestamp: mapValueOfType<int>(json, r'end_timestamp'),
        entityId: mapValueOfType<String>(json, r'entity_id')!,
        entityType: AdAccountEntityType.fromJson(json[r'entity_type']),
        name: mapValueOfType<String>(json, r'name'),
        scheduleAction: ScheduleAction.fromJson(json[r'schedule_action']),
        scheduleStatus: ScheduleStatus.fromJson(json[r'schedule_status']),
        scheduleType: ScheduleType.fromJson(json[r'schedule_type']),
        startTimestamp: mapValueOfType<int>(json, r'start_timestamp'),
      );
    }
    return null;
  }

  static List<ScheduleCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScheduleCreate> mapFromJson(dynamic json) {
    final map = <String, ScheduleCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScheduleCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScheduleCreate-objects as value to a dart map
  static Map<String, List<ScheduleCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScheduleCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScheduleCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_id',
  };
}

