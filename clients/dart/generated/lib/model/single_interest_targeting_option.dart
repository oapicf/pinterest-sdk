//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class SingleInterestTargetingOption {
  /// Returns a new [SingleInterestTargetingOption] instance.
  SingleInterestTargetingOption({
    this.childInterests = const [],
    required this.id,
    required this.level,
    required this.name,
  });

  List<String> childInterests;

  String id;

  int level;

  String name;

  @override
  bool operator ==(Object other) => identical(this, other) || other is SingleInterestTargetingOption &&
    _deepEquality.equals(other.childInterests, childInterests) &&
    other.id == id &&
    other.level == level &&
    other.name == name;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (childInterests.hashCode) +
    (id.hashCode) +
    (level.hashCode) +
    (name.hashCode);

  @override
  String toString() => 'SingleInterestTargetingOption[childInterests=$childInterests, id=$id, level=$level, name=$name]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'child_interests'] = this.childInterests;
      json[r'id'] = this.id;
      json[r'level'] = this.level;
      json[r'name'] = this.name;
    return json;
  }

  /// Returns a new [SingleInterestTargetingOption] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static SingleInterestTargetingOption? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'child_interests'), 'Required key "SingleInterestTargetingOption[child_interests]" is missing from JSON.');
        assert(json[r'child_interests'] != null, 'Required key "SingleInterestTargetingOption[child_interests]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "SingleInterestTargetingOption[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "SingleInterestTargetingOption[id]" has a null value in JSON.');
        assert(json.containsKey(r'level'), 'Required key "SingleInterestTargetingOption[level]" is missing from JSON.');
        assert(json[r'level'] != null, 'Required key "SingleInterestTargetingOption[level]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "SingleInterestTargetingOption[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "SingleInterestTargetingOption[name]" has a null value in JSON.');
        return true;
      }());

      return SingleInterestTargetingOption(
        childInterests: json[r'child_interests'] is Iterable
            ? (json[r'child_interests'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        id: mapValueOfType<String>(json, r'id')!,
        level: mapValueOfType<int>(json, r'level')!,
        name: mapValueOfType<String>(json, r'name')!,
      );
    }
    return null;
  }

  static List<SingleInterestTargetingOption> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SingleInterestTargetingOption>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SingleInterestTargetingOption.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, SingleInterestTargetingOption> mapFromJson(dynamic json) {
    final map = <String, SingleInterestTargetingOption>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = SingleInterestTargetingOption.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of SingleInterestTargetingOption-objects as value to a dart map
  static Map<String, List<SingleInterestTargetingOption>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<SingleInterestTargetingOption>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = SingleInterestTargetingOption.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'child_interests',
    'id',
    'level',
    'name',
  };
}

