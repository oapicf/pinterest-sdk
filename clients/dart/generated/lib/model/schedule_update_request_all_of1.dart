//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ScheduleUpdateRequestAllOf1 {
  /// Returns a new [ScheduleUpdateRequestAllOf1] instance.
  ScheduleUpdateRequestAllOf1({
    this.entityId,
    this.entityType,
    required this.id,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entityId;

  /// Entity type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entityType;

  /// Schedule ID.
  String id;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ScheduleUpdateRequestAllOf1 &&
    other.entityId == entityId &&
    other.entityType == entityType &&
    other.id == id;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entityId == null ? 0 : entityId!.hashCode) +
    (entityType == null ? 0 : entityType!.hashCode) +
    (id.hashCode);

  @override
  String toString() => 'ScheduleUpdateRequestAllOf1[entityId=$entityId, entityType=$entityType, id=$id]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.entityId != null) {
      json[r'entity_id'] = this.entityId;
    } else {
      json[r'entity_id'] = null;
    }
    if (this.entityType != null) {
      json[r'entity_type'] = this.entityType;
    } else {
      json[r'entity_type'] = null;
    }
      json[r'id'] = this.id;
    return json;
  }

  /// Returns a new [ScheduleUpdateRequestAllOf1] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ScheduleUpdateRequestAllOf1? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "ScheduleUpdateRequestAllOf1[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "ScheduleUpdateRequestAllOf1[id]" has a null value in JSON.');
        return true;
      }());

      return ScheduleUpdateRequestAllOf1(
        entityId: mapValueOfType<String>(json, r'entity_id'),
        entityType: mapValueOfType<String>(json, r'entity_type'),
        id: mapValueOfType<String>(json, r'id')!,
      );
    }
    return null;
  }

  static List<ScheduleUpdateRequestAllOf1> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ScheduleUpdateRequestAllOf1>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ScheduleUpdateRequestAllOf1.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ScheduleUpdateRequestAllOf1> mapFromJson(dynamic json) {
    final map = <String, ScheduleUpdateRequestAllOf1>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ScheduleUpdateRequestAllOf1.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ScheduleUpdateRequestAllOf1-objects as value to a dart map
  static Map<String, List<ScheduleUpdateRequestAllOf1>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ScheduleUpdateRequestAllOf1>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ScheduleUpdateRequestAllOf1.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

