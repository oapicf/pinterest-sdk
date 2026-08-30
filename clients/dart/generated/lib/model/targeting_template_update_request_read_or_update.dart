//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TargetingTemplateUpdateRequestReadOrUpdate {
  /// Returns a new [TargetingTemplateUpdateRequestReadOrUpdate] instance.
  TargetingTemplateUpdateRequestReadOrUpdate({
    required this.id,
    required this.operationType,
    this.targetingAttributes,
  });

  /// Targeting template ID
  String id;

  AudienceUpdateOperationType operationType;

  /// targeting profile attributes
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecOptimal? targetingAttributes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TargetingTemplateUpdateRequestReadOrUpdate &&
    other.id == id &&
    other.operationType == operationType &&
    other.targetingAttributes == targetingAttributes;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (operationType.hashCode) +
    (targetingAttributes == null ? 0 : targetingAttributes!.hashCode);

  @override
  String toString() => 'TargetingTemplateUpdateRequestReadOrUpdate[id=$id, operationType=$operationType, targetingAttributes=$targetingAttributes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'operation_type'] = this.operationType;
    if (this.targetingAttributes != null) {
      json[r'targeting_attributes'] = this.targetingAttributes;
    } else {
      json[r'targeting_attributes'] = null;
    }
    return json;
  }

  /// Returns a new [TargetingTemplateUpdateRequestReadOrUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TargetingTemplateUpdateRequestReadOrUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "TargetingTemplateUpdateRequestReadOrUpdate[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "TargetingTemplateUpdateRequestReadOrUpdate[id]" has a null value in JSON.');
        assert(json.containsKey(r'operation_type'), 'Required key "TargetingTemplateUpdateRequestReadOrUpdate[operation_type]" is missing from JSON.');
        assert(json[r'operation_type'] != null, 'Required key "TargetingTemplateUpdateRequestReadOrUpdate[operation_type]" has a null value in JSON.');
        return true;
      }());

      return TargetingTemplateUpdateRequestReadOrUpdate(
        id: mapValueOfType<String>(json, r'id')!,
        operationType: AudienceUpdateOperationType.fromJson(json[r'operation_type'])!,
        targetingAttributes: TargetingSpecOptimal.fromJson(json[r'targeting_attributes']),
      );
    }
    return null;
  }

  static List<TargetingTemplateUpdateRequestReadOrUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingTemplateUpdateRequestReadOrUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingTemplateUpdateRequestReadOrUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TargetingTemplateUpdateRequestReadOrUpdate> mapFromJson(dynamic json) {
    final map = <String, TargetingTemplateUpdateRequestReadOrUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TargetingTemplateUpdateRequestReadOrUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TargetingTemplateUpdateRequestReadOrUpdate-objects as value to a dart map
  static Map<String, List<TargetingTemplateUpdateRequestReadOrUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TargetingTemplateUpdateRequestReadOrUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TargetingTemplateUpdateRequestReadOrUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'operation_type',
  };
}

