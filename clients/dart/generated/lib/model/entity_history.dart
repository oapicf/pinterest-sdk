//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EntityHistory {
  /// Returns a new [EntityHistory] instance.
  EntityHistory({
    this.changeTimestamp,
    this.dataChanges = const [],
    this.entityId,
    this.entityName,
    this.ldap,
    this.operation,
    this.userId,
  });

  /// A Unix timestamp representing the time of the change in seconds
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? changeTimestamp;

  /// Properties associated with a particular change to an entity's data
  List<EntityDataChangeHistory> dataChanges;

  /// The id of the entity that was changed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entityId;

  /// The name of the entity that was changed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? entityName;

  /// The LDAP of the user who initiated the change; only pertinent for changes initiated by internal users
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? ldap;

  /// The type of operation that caused the change
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ChangeHistoryOperationType? operation;

  /// The id of the user who initiated the change
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EntityHistory &&
    other.changeTimestamp == changeTimestamp &&
    _deepEquality.equals(other.dataChanges, dataChanges) &&
    other.entityId == entityId &&
    other.entityName == entityName &&
    other.ldap == ldap &&
    other.operation == operation &&
    other.userId == userId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (changeTimestamp == null ? 0 : changeTimestamp!.hashCode) +
    (dataChanges.hashCode) +
    (entityId == null ? 0 : entityId!.hashCode) +
    (entityName == null ? 0 : entityName!.hashCode) +
    (ldap == null ? 0 : ldap!.hashCode) +
    (operation == null ? 0 : operation!.hashCode) +
    (userId == null ? 0 : userId!.hashCode);

  @override
  String toString() => 'EntityHistory[changeTimestamp=$changeTimestamp, dataChanges=$dataChanges, entityId=$entityId, entityName=$entityName, ldap=$ldap, operation=$operation, userId=$userId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.changeTimestamp != null) {
      json[r'change_timestamp'] = this.changeTimestamp;
    } else {
      json[r'change_timestamp'] = null;
    }
      json[r'data_changes'] = this.dataChanges;
    if (this.entityId != null) {
      json[r'entity_id'] = this.entityId;
    } else {
      json[r'entity_id'] = null;
    }
    if (this.entityName != null) {
      json[r'entity_name'] = this.entityName;
    } else {
      json[r'entity_name'] = null;
    }
    if (this.ldap != null) {
      json[r'ldap'] = this.ldap;
    } else {
      json[r'ldap'] = null;
    }
    if (this.operation != null) {
      json[r'operation'] = this.operation;
    } else {
      json[r'operation'] = null;
    }
    if (this.userId != null) {
      json[r'user_id'] = this.userId;
    } else {
      json[r'user_id'] = null;
    }
    return json;
  }

  /// Returns a new [EntityHistory] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EntityHistory? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return EntityHistory(
        changeTimestamp: mapValueOfType<int>(json, r'change_timestamp'),
        dataChanges: EntityDataChangeHistory.listFromJson(json[r'data_changes']),
        entityId: mapValueOfType<String>(json, r'entity_id'),
        entityName: mapValueOfType<String>(json, r'entity_name'),
        ldap: mapValueOfType<String>(json, r'ldap'),
        operation: ChangeHistoryOperationType.fromJson(json[r'operation']),
        userId: mapValueOfType<String>(json, r'user_id'),
      );
    }
    return null;
  }

  static List<EntityHistory> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityHistory>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityHistory.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EntityHistory> mapFromJson(dynamic json) {
    final map = <String, EntityHistory>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EntityHistory.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EntityHistory-objects as value to a dart map
  static Map<String, List<EntityHistory>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EntityHistory>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EntityHistory.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

