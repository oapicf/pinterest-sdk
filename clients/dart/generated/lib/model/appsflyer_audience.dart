//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AppsflyerAudience {
  /// Returns a new [AppsflyerAudience] instance.
  AppsflyerAudience({
    required this.containerId,
    required this.name,
    required this.platform,
  });

  /// The ID of the audience container
  String containerId;

  /// The name of the audience
  String name;

  /// The platform of the audience
  AppsflyerPlatform platform;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AppsflyerAudience &&
    other.containerId == containerId &&
    other.name == name &&
    other.platform == platform;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (containerId.hashCode) +
    (name.hashCode) +
    (platform.hashCode);

  @override
  String toString() => 'AppsflyerAudience[containerId=$containerId, name=$name, platform=$platform]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'container_id'] = this.containerId;
      json[r'name'] = this.name;
      json[r'platform'] = this.platform;
    return json;
  }

  /// Returns a new [AppsflyerAudience] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AppsflyerAudience? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'container_id'), 'Required key "AppsflyerAudience[container_id]" is missing from JSON.');
        assert(json[r'container_id'] != null, 'Required key "AppsflyerAudience[container_id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "AppsflyerAudience[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "AppsflyerAudience[name]" has a null value in JSON.');
        assert(json.containsKey(r'platform'), 'Required key "AppsflyerAudience[platform]" is missing from JSON.');
        assert(json[r'platform'] != null, 'Required key "AppsflyerAudience[platform]" has a null value in JSON.');
        return true;
      }());

      return AppsflyerAudience(
        containerId: mapValueOfType<String>(json, r'container_id')!,
        name: mapValueOfType<String>(json, r'name')!,
        platform: AppsflyerPlatform.fromJson(json[r'platform'])!,
      );
    }
    return null;
  }

  static List<AppsflyerAudience> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AppsflyerAudience>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AppsflyerAudience.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AppsflyerAudience> mapFromJson(dynamic json) {
    final map = <String, AppsflyerAudience>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AppsflyerAudience.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AppsflyerAudience-objects as value to a dart map
  static Map<String, List<AppsflyerAudience>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AppsflyerAudience>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AppsflyerAudience.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'container_id',
    'name',
    'platform',
  };
}

