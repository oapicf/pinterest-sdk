//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SchedulesCreate200ResponseInnerData {
  /// Returns a new [SchedulesCreate200ResponseInnerData] instance.
  SchedulesCreate200ResponseInnerData({
    this.deltaValue,
    this.endTimestamp,
    required this.entityId,
    this.entityType,
    this.name,
    this.scheduleAction,
    required this.scheduleId,
    this.scheduleStatus,
    this.scheduleType,
    this.startTimestamp,
    required this.id,
    required this.exceptions,
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

  /// Schedule ID.
  String scheduleId;

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

  String id;

  PinterestLibError exceptions;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SchedulesCreate200ResponseInnerData &&
    other.deltaValue == deltaValue &&
    other.endTimestamp == endTimestamp &&
    other.entityId == entityId &&
    other.entityType == entityType &&
    other.name == name &&
    other.scheduleAction == scheduleAction &&
    other.scheduleId == scheduleId &&
    other.scheduleStatus == scheduleStatus &&
    other.scheduleType == scheduleType &&
    other.startTimestamp == startTimestamp &&
    other.id == id &&
    other.exceptions == exceptions;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (deltaValue == null ? 0 : deltaValue!.hashCode) +
    (endTimestamp == null ? 0 : endTimestamp!.hashCode) +
    (entityId.hashCode) +
    (entityType == null ? 0 : entityType!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (scheduleAction == null ? 0 : scheduleAction!.hashCode) +
    (scheduleId.hashCode) +
    (scheduleStatus == null ? 0 : scheduleStatus!.hashCode) +
    (scheduleType == null ? 0 : scheduleType!.hashCode) +
    (startTimestamp == null ? 0 : startTimestamp!.hashCode) +
    (id.hashCode) +
    (exceptions.hashCode);

  @override
  String toString() => 'SchedulesCreate200ResponseInnerData[deltaValue=$deltaValue, endTimestamp=$endTimestamp, entityId=$entityId, entityType=$entityType, name=$name, scheduleAction=$scheduleAction, scheduleId=$scheduleId, scheduleStatus=$scheduleStatus, scheduleType=$scheduleType, startTimestamp=$startTimestamp, id=$id, exceptions=$exceptions]';

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
      json[r'schedule_id'] = this.scheduleId;
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
      json[r'id'] = this.id;
      json[r'exceptions'] = this.exceptions;
    return json;
  }

  /// Returns a new [SchedulesCreate200ResponseInnerData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SchedulesCreate200ResponseInnerData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_id'), 'Required key "SchedulesCreate200ResponseInnerData[entity_id]" is missing from JSON.');
        assert(json[r'entity_id'] != null, 'Required key "SchedulesCreate200ResponseInnerData[entity_id]" has a null value in JSON.');
        assert(json.containsKey(r'schedule_id'), 'Required key "SchedulesCreate200ResponseInnerData[schedule_id]" is missing from JSON.');
        assert(json[r'schedule_id'] != null, 'Required key "SchedulesCreate200ResponseInnerData[schedule_id]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "SchedulesCreate200ResponseInnerData[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "SchedulesCreate200ResponseInnerData[id]" has a null value in JSON.');
        assert(json.containsKey(r'exceptions'), 'Required key "SchedulesCreate200ResponseInnerData[exceptions]" is missing from JSON.');
        assert(json[r'exceptions'] != null, 'Required key "SchedulesCreate200ResponseInnerData[exceptions]" has a null value in JSON.');
        return true;
      }());

      return SchedulesCreate200ResponseInnerData(
        deltaValue: ScheduleDeltaValue.fromJson(json[r'delta_value']),
        endTimestamp: mapValueOfType<int>(json, r'end_timestamp'),
        entityId: mapValueOfType<String>(json, r'entity_id')!,
        entityType: AdAccountEntityType.fromJson(json[r'entity_type']),
        name: mapValueOfType<String>(json, r'name'),
        scheduleAction: ScheduleAction.fromJson(json[r'schedule_action']),
        scheduleId: mapValueOfType<String>(json, r'schedule_id')!,
        scheduleStatus: ScheduleStatus.fromJson(json[r'schedule_status']),
        scheduleType: ScheduleType.fromJson(json[r'schedule_type']),
        startTimestamp: mapValueOfType<int>(json, r'start_timestamp'),
        id: mapValueOfType<String>(json, r'id')!,
        exceptions: PinterestLibError.fromJson(json[r'exceptions'])!,
      );
    }
    return null;
  }

  static List<SchedulesCreate200ResponseInnerData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SchedulesCreate200ResponseInnerData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SchedulesCreate200ResponseInnerData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SchedulesCreate200ResponseInnerData> mapFromJson(dynamic json) {
    final map = <String, SchedulesCreate200ResponseInnerData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SchedulesCreate200ResponseInnerData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SchedulesCreate200ResponseInnerData-objects as value to a dart map
  static Map<String, List<SchedulesCreate200ResponseInnerData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SchedulesCreate200ResponseInnerData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SchedulesCreate200ResponseInnerData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_id',
    'schedule_id',
    'id',
    'exceptions',
  };
}

