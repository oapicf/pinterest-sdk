//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LocalInventoryItemsBatchCreate {
  /// Returns a new [LocalInventoryItemsBatchCreate] instance.
  LocalInventoryItemsBatchCreate({
    this.operations = const [],
  });

  /// Array of inventory operations. Up to 1000 items per request.
  List<LocalInventoryOperation> operations;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LocalInventoryItemsBatchCreate &&
    _deepEquality.equals(other.operations, operations);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (operations.hashCode);

  @override
  String toString() => 'LocalInventoryItemsBatchCreate[operations=$operations]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'operations'] = this.operations;
    return json;
  }

  /// Returns a new [LocalInventoryItemsBatchCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LocalInventoryItemsBatchCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'operations'), 'Required key "LocalInventoryItemsBatchCreate[operations]" is missing from JSON.');
        assert(json[r'operations'] != null, 'Required key "LocalInventoryItemsBatchCreate[operations]" has a null value in JSON.');
        return true;
      }());

      return LocalInventoryItemsBatchCreate(
        operations: LocalInventoryOperation.listFromJson(json[r'operations']),
      );
    }
    return null;
  }

  static List<LocalInventoryItemsBatchCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LocalInventoryItemsBatchCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LocalInventoryItemsBatchCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LocalInventoryItemsBatchCreate> mapFromJson(dynamic json) {
    final map = <String, LocalInventoryItemsBatchCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LocalInventoryItemsBatchCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LocalInventoryItemsBatchCreate-objects as value to a dart map
  static Map<String, List<LocalInventoryItemsBatchCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LocalInventoryItemsBatchCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LocalInventoryItemsBatchCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operations',
  };
}

