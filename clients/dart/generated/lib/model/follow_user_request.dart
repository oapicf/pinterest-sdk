//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FollowUserRequest {
  /// Returns a new [FollowUserRequest] instance.
  FollowUserRequest({
    this.autoFollow = false,
  });

  /// Whether this request comes as result of auto-follow after clicking on a link. Follow links can be used by partners on their site or in emails. Only selected partners can be followed this way. We verify that partner can be auto-followed.
  bool autoFollow;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FollowUserRequest &&
    other.autoFollow == autoFollow;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoFollow.hashCode);

  @override
  String toString() => 'FollowUserRequest[autoFollow=$autoFollow]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'auto_follow'] = this.autoFollow;
    return json;
  }

  /// Returns a new [FollowUserRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FollowUserRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FollowUserRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FollowUserRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FollowUserRequest(
        autoFollow: mapValueOfType<bool>(json, r'auto_follow') ?? false,
      );
    }
    return null;
  }

  static List<FollowUserRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FollowUserRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FollowUserRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FollowUserRequest> mapFromJson(dynamic json) {
    final map = <String, FollowUserRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FollowUserRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FollowUserRequest-objects as value to a dart map
  static Map<String, List<FollowUserRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FollowUserRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FollowUserRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

