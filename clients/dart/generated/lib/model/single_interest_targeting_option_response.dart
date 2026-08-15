//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SingleInterestTargetingOptionResponse {
  /// Returns a new [SingleInterestTargetingOptionResponse] instance.
  SingleInterestTargetingOptionResponse({
    this.childInterests = const [],
    this.id,
    this.level,
    this.name,
  });

  List<String> childInterests;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? level;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SingleInterestTargetingOptionResponse &&
    _deepEquality.equals(other.childInterests, childInterests) &&
    other.id == id &&
    other.level == level &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (childInterests.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (level == null ? 0 : level!.hashCode) +
    (name == null ? 0 : name!.hashCode);

  @override
  String toString() => 'SingleInterestTargetingOptionResponse[childInterests=$childInterests, id=$id, level=$level, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'child_interests'] = this.childInterests;
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.level != null) {
      json[r'level'] = this.level;
    } else {
      json[r'level'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    return json;
  }

  /// Returns a new [SingleInterestTargetingOptionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SingleInterestTargetingOptionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "SingleInterestTargetingOptionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "SingleInterestTargetingOptionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return SingleInterestTargetingOptionResponse(
        childInterests: json[r'child_interests'] is Iterable
            ? (json[r'child_interests'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        id: mapValueOfType<String>(json, r'id'),
        level: mapValueOfType<int>(json, r'level'),
        name: mapValueOfType<String>(json, r'name'),
      );
    }
    return null;
  }

  static List<SingleInterestTargetingOptionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SingleInterestTargetingOptionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SingleInterestTargetingOptionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SingleInterestTargetingOptionResponse> mapFromJson(dynamic json) {
    final map = <String, SingleInterestTargetingOptionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SingleInterestTargetingOptionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SingleInterestTargetingOptionResponse-objects as value to a dart map
  static Map<String, List<SingleInterestTargetingOptionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SingleInterestTargetingOptionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SingleInterestTargetingOptionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

