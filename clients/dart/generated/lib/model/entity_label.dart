//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EntityLabel {
  /// Returns a new [EntityLabel] instance.
  EntityLabel({
    required this.entityId,
    this.entityType,
    required this.labelId,
    this.status,
  });

  /// Entity ID to apply label to.
  String entityId;

  LabelParentType? entityType;

  /// Label ID.
  String labelId;

  EntityLabelStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EntityLabel &&
    other.entityId == entityId &&
    other.entityType == entityType &&
    other.labelId == labelId &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entityId.hashCode) +
    (entityType == null ? 0 : entityType!.hashCode) +
    (labelId.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'EntityLabel[entityId=$entityId, entityType=$entityType, labelId=$labelId, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entity_id'] = this.entityId;
    if (this.entityType != null) {
      json[r'entity_type'] = this.entityType;
    } else {
      json[r'entity_type'] = null;
    }
      json[r'label_id'] = this.labelId;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [EntityLabel] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EntityLabel? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_id'), 'Required key "EntityLabel[entity_id]" is missing from JSON.');
        assert(json[r'entity_id'] != null, 'Required key "EntityLabel[entity_id]" has a null value in JSON.');
        assert(json.containsKey(r'label_id'), 'Required key "EntityLabel[label_id]" is missing from JSON.');
        assert(json[r'label_id'] != null, 'Required key "EntityLabel[label_id]" has a null value in JSON.');
        return true;
      }());

      return EntityLabel(
        entityId: mapValueOfType<String>(json, r'entity_id')!,
        entityType: LabelParentType.fromJson(json[r'entity_type']),
        labelId: mapValueOfType<String>(json, r'label_id')!,
        status: EntityLabelStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<EntityLabel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityLabel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityLabel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EntityLabel> mapFromJson(dynamic json) {
    final map = <String, EntityLabel>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EntityLabel.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EntityLabel-objects as value to a dart map
  static Map<String, List<EntityLabel>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EntityLabel>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EntityLabel.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_id',
    'label_id',
  };
}

