//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LabeledEntitiesCreate {
  /// Returns a new [LabeledEntitiesCreate] instance.
  LabeledEntitiesCreate({
    this.entityIds = const [],
  });

  /// Entity IDs to apply label to.
  List<String> entityIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LabeledEntitiesCreate &&
    _deepEquality.equals(other.entityIds, entityIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (entityIds.hashCode);

  @override
  String toString() => 'LabeledEntitiesCreate[entityIds=$entityIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'entity_ids'] = this.entityIds;
    return json;
  }

  /// Returns a new [LabeledEntitiesCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LabeledEntitiesCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'entity_ids'), 'Required key "LabeledEntitiesCreate[entity_ids]" is missing from JSON.');
        assert(json[r'entity_ids'] != null, 'Required key "LabeledEntitiesCreate[entity_ids]" has a null value in JSON.');
        return true;
      }());

      return LabeledEntitiesCreate(
        entityIds: json[r'entity_ids'] is Iterable
            ? (json[r'entity_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<LabeledEntitiesCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabeledEntitiesCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabeledEntitiesCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LabeledEntitiesCreate> mapFromJson(dynamic json) {
    final map = <String, LabeledEntitiesCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LabeledEntitiesCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LabeledEntitiesCreate-objects as value to a dart map
  static Map<String, List<LabeledEntitiesCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LabeledEntitiesCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LabeledEntitiesCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'entity_ids',
  };
}

