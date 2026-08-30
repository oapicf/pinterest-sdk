//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabeledEntities {
  /// Returns a new [LabeledEntities] instance.
  LabeledEntities({
    this.entitiesLabels = const [],
    this.errors = const [],
  });

  List<EntityLabel> entitiesLabels;

  /// Labels that were not successfully applied.
  List<EntityLabelError> errors;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabeledEntities &&
    _deepEquality.equals(other.entitiesLabels, entitiesLabels) &&
    _deepEquality.equals(other.errors, errors);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entitiesLabels.hashCode) +
    (errors.hashCode);

  @override
  String toString() => 'LabeledEntities[entitiesLabels=$entitiesLabels, errors=$errors]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entities_labels'] = this.entitiesLabels;
      json[r'errors'] = this.errors;
    return json;
  }

  /// Returns a new [LabeledEntities] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabeledEntities? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LabeledEntities(
        entitiesLabels: EntityLabel.listFromJson(json[r'entities_labels']),
        errors: EntityLabelError.listFromJson(json[r'errors']),
      );
    }
    return null;
  }

  static List<LabeledEntities> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabeledEntities>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabeledEntities.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabeledEntities> mapFromJson(dynamic json) {
    final map = <String, LabeledEntities>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabeledEntities.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabeledEntities-objects as value to a dart map
  static Map<String, List<LabeledEntities>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabeledEntities>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabeledEntities.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

