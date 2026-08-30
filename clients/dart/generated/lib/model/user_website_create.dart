//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserWebsiteCreate {
  /// Returns a new [UserWebsiteCreate] instance.
  UserWebsiteCreate({
    this.verificationMethod = WebsiteVerificationMethod.METATAG,
    this.website,
  });

  /// Method used to verify website ownership.
  WebsiteVerificationMethod verificationMethod;

  /// Website with path or domain only
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserWebsiteCreate &&
    other.verificationMethod == verificationMethod &&
    other.website == website;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (verificationMethod.hashCode) +
    (website == null ? 0 : website!.hashCode);

  @override
  String toString() => 'UserWebsiteCreate[verificationMethod=$verificationMethod, website=$website]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'verification_method'] = this.verificationMethod;
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    return json;
  }

  /// Returns a new [UserWebsiteCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserWebsiteCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return UserWebsiteCreate(
        verificationMethod: WebsiteVerificationMethod.fromJson(json[r'verification_method']) ?? WebsiteVerificationMethod.METATAG,
        website: mapValueOfType<String>(json, r'website'),
      );
    }
    return null;
  }

  static List<UserWebsiteCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserWebsiteCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserWebsiteCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserWebsiteCreate> mapFromJson(dynamic json) {
    final map = <String, UserWebsiteCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserWebsiteCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserWebsiteCreate-objects as value to a dart map
  static Map<String, List<UserWebsiteCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserWebsiteCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserWebsiteCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

