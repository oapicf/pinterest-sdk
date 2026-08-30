//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FollowUserCreate {
  /// Returns a new [FollowUserCreate] instance.
  FollowUserCreate({
    this.autoFollow,
  });

  ///   Whether this request comes as result of auto-follow after clicking on a link.   Follow links can be used by partners on their site or in emails.   Only selected partners can be followed this way. We verify that partner can be auto-followed.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? autoFollow;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FollowUserCreate &&
    other.autoFollow == autoFollow;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoFollow == null ? 0 : autoFollow!.hashCode);

  @override
  String toString() => 'FollowUserCreate[autoFollow=$autoFollow]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.autoFollow != null) {
      json[r'auto_follow'] = this.autoFollow;
    } else {
      json[r'auto_follow'] = null;
    }
    return json;
  }

  /// Returns a new [FollowUserCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FollowUserCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return FollowUserCreate(
        autoFollow: mapValueOfType<bool>(json, r'auto_follow'),
      );
    }
    return null;
  }

  static List<FollowUserCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FollowUserCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FollowUserCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FollowUserCreate> mapFromJson(dynamic json) {
    final map = <String, FollowUserCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FollowUserCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FollowUserCreate-objects as value to a dart map
  static Map<String, List<FollowUserCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FollowUserCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FollowUserCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

