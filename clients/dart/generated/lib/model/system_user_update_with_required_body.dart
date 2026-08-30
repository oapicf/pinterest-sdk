//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SystemUserUpdateWithRequiredBody {
  /// Returns a new [SystemUserUpdateWithRequiredBody] instance.
  SystemUserUpdateWithRequiredBody({
    required this.name,
  });

  /// New system user name
  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SystemUserUpdateWithRequiredBody &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode);

  @override
  String toString() => 'SystemUserUpdateWithRequiredBody[name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [SystemUserUpdateWithRequiredBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SystemUserUpdateWithRequiredBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'name'), 'Required key "SystemUserUpdateWithRequiredBody[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "SystemUserUpdateWithRequiredBody[name]" has a null value in JSON.');
        return true;
      }());

      return SystemUserUpdateWithRequiredBody(
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<SystemUserUpdateWithRequiredBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SystemUserUpdateWithRequiredBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SystemUserUpdateWithRequiredBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SystemUserUpdateWithRequiredBody> mapFromJson(dynamic json) {
    final map = <String, SystemUserUpdateWithRequiredBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SystemUserUpdateWithRequiredBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SystemUserUpdateWithRequiredBody-objects as value to a dart map
  static Map<String, List<SystemUserUpdateWithRequiredBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SystemUserUpdateWithRequiredBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SystemUserUpdateWithRequiredBody.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
  };
}

