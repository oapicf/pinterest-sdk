//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EntityDataChangeHistory {
  /// Returns a new [EntityDataChangeHistory] instance.
  EntityDataChangeHistory({
    this.changedFieldId,
    this.changedFieldName,
    this.dataType,
    this.newDataValue,
    this.oldDataValue,
  });

  /// A string identifier representing the changed field on the entity
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? changedFieldId;

  /// The human readable name of the changed field on the entity
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? changedFieldName;

  /// Specifies the type of the field's data values
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ChangeHistoryDataType? dataType;

  /// A string representation of the value of the changed field, after the change
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? newDataValue;

  /// A string representation of the value of the changed field, before the change
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? oldDataValue;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EntityDataChangeHistory &&
    other.changedFieldId == changedFieldId &&
    other.changedFieldName == changedFieldName &&
    other.dataType == dataType &&
    other.newDataValue == newDataValue &&
    other.oldDataValue == oldDataValue;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (changedFieldId == null ? 0 : changedFieldId!.hashCode) +
    (changedFieldName == null ? 0 : changedFieldName!.hashCode) +
    (dataType == null ? 0 : dataType!.hashCode) +
    (newDataValue == null ? 0 : newDataValue!.hashCode) +
    (oldDataValue == null ? 0 : oldDataValue!.hashCode);

  @override
  String toString() => 'EntityDataChangeHistory[changedFieldId=$changedFieldId, changedFieldName=$changedFieldName, dataType=$dataType, newDataValue=$newDataValue, oldDataValue=$oldDataValue]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.changedFieldId != null) {
      json[r'changed_field_id'] = this.changedFieldId;
    } else {
      json[r'changed_field_id'] = null;
    }
    if (this.changedFieldName != null) {
      json[r'changed_field_name'] = this.changedFieldName;
    } else {
      json[r'changed_field_name'] = null;
    }
    if (this.dataType != null) {
      json[r'data_type'] = this.dataType;
    } else {
      json[r'data_type'] = null;
    }
    if (this.newDataValue != null) {
      json[r'new_data_value'] = this.newDataValue;
    } else {
      json[r'new_data_value'] = null;
    }
    if (this.oldDataValue != null) {
      json[r'old_data_value'] = this.oldDataValue;
    } else {
      json[r'old_data_value'] = null;
    }
    return json;
  }

  /// Returns a new [EntityDataChangeHistory] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EntityDataChangeHistory? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return EntityDataChangeHistory(
        changedFieldId: mapValueOfType<String>(json, r'changed_field_id'),
        changedFieldName: mapValueOfType<String>(json, r'changed_field_name'),
        dataType: ChangeHistoryDataType.fromJson(json[r'data_type']),
        newDataValue: mapValueOfType<String>(json, r'new_data_value'),
        oldDataValue: mapValueOfType<String>(json, r'old_data_value'),
      );
    }
    return null;
  }

  static List<EntityDataChangeHistory> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityDataChangeHistory>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityDataChangeHistory.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EntityDataChangeHistory> mapFromJson(dynamic json) {
    final map = <String, EntityDataChangeHistory>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EntityDataChangeHistory.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EntityDataChangeHistory-objects as value to a dart map
  static Map<String, List<EntityDataChangeHistory>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EntityDataChangeHistory>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EntityDataChangeHistory.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

