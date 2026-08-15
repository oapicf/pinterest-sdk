//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserWebsiteSummary {
  /// Returns a new [UserWebsiteSummary] instance.
  UserWebsiteSummary({
    this.status,
    this.verifiedAt,
    this.website,
  });

  /// Status of the verification process
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? status;

  /// UTC timestamp when the verification happened - sometimes missing
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? verifiedAt;

  /// Website with path or domain only
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserWebsiteSummary &&
    other.status == status &&
    other.verifiedAt == verifiedAt &&
    other.website == website;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (status == null ? 0 : status!.hashCode) +
    (verifiedAt == null ? 0 : verifiedAt!.hashCode) +
    (website == null ? 0 : website!.hashCode);

  @override
  String toString() => 'UserWebsiteSummary[status=$status, verifiedAt=$verifiedAt, website=$website]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    if (this.verifiedAt != null) {
      json[r'verified_at'] = this.verifiedAt;
    } else {
      json[r'verified_at'] = null;
    }
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    return json;
  }

  /// Returns a new [UserWebsiteSummary] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserWebsiteSummary? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserWebsiteSummary[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserWebsiteSummary[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserWebsiteSummary(
        status: mapValueOfType<String>(json, r'status'),
        verifiedAt: mapValueOfType<String>(json, r'verified_at'),
        website: mapValueOfType<String>(json, r'website'),
      );
    }
    return null;
  }

  static List<UserWebsiteSummary> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserWebsiteSummary>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserWebsiteSummary.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserWebsiteSummary> mapFromJson(dynamic json) {
    final map = <String, UserWebsiteSummary>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserWebsiteSummary.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserWebsiteSummary-objects as value to a dart map
  static Map<String, List<UserWebsiteSummary>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserWebsiteSummary>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserWebsiteSummary.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

