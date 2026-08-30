//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EntityLabelError {
  /// Returns a new [EntityLabelError] instance.
  EntityLabelError({
    this.data,
    this.errorMessages = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityLabel? data;

  List<String> errorMessages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EntityLabelError &&
    other.data == data &&
    _deepEquality.equals(other.errorMessages, errorMessages);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (errorMessages.hashCode);

  @override
  String toString() => 'EntityLabelError[data=$data, errorMessages=$errorMessages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
      json[r'error_messages'] = this.errorMessages;
    return json;
  }

  /// Returns a new [EntityLabelError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EntityLabelError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return EntityLabelError(
        data: EntityLabel.fromJson(json[r'data']),
        errorMessages: json[r'error_messages'] is Iterable
            ? (json[r'error_messages'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<EntityLabelError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EntityLabelError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EntityLabelError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EntityLabelError> mapFromJson(dynamic json) {
    final map = <String, EntityLabelError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EntityLabelError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EntityLabelError-objects as value to a dart map
  static Map<String, List<EntityLabelError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EntityLabelError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EntityLabelError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

