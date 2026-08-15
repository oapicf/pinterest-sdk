//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BrandAccountsCreateRequest {
  /// Returns a new [BrandAccountsCreateRequest] instance.
  BrandAccountsCreateRequest({
    required this.name,
    required this.username,
    required this.country,
    this.about,
    this.website,
    this.profileImage,
  });

  /// Brand Account name
  String name;

  /// Brand Account username
  String username;

  Country country;

  /// Brand Account about information
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? about;

  /// Brand Account website
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageBase64? profileImage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BrandAccountsCreateRequest &&
    other.name == name &&
    other.username == username &&
    other.country == country &&
    other.about == about &&
    other.website == website &&
    other.profileImage == profileImage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (name.hashCode) +
    (username.hashCode) +
    (country.hashCode) +
    (about == null ? 0 : about!.hashCode) +
    (website == null ? 0 : website!.hashCode) +
    (profileImage == null ? 0 : profileImage!.hashCode);

  @override
  String toString() => 'BrandAccountsCreateRequest[name=$name, username=$username, country=$country, about=$about, website=$website, profileImage=$profileImage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'name'] = this.name;
      json[r'username'] = this.username;
      json[r'country'] = this.country;
    if (this.about != null) {
      json[r'about'] = this.about;
    } else {
      json[r'about'] = null;
    }
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    if (this.profileImage != null) {
      json[r'profile_image'] = this.profileImage;
    } else {
      json[r'profile_image'] = null;
    }
    return json;
  }

  /// Returns a new [BrandAccountsCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BrandAccountsCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BrandAccountsCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BrandAccountsCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BrandAccountsCreateRequest(
        name: mapValueOfType<String>(json, r'name')!,
        username: mapValueOfType<String>(json, r'username')!,
        country: Country.fromJson(json[r'country'])!,
        about: mapValueOfType<String>(json, r'about'),
        website: mapValueOfType<String>(json, r'website'),
        profileImage: ImageBase64.fromJson(json[r'profile_image']),
      );
    }
    return null;
  }

  static List<BrandAccountsCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandAccountsCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandAccountsCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BrandAccountsCreateRequest> mapFromJson(dynamic json) {
    final map = <String, BrandAccountsCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BrandAccountsCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BrandAccountsCreateRequest-objects as value to a dart map
  static Map<String, List<BrandAccountsCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BrandAccountsCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BrandAccountsCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'name',
    'username',
    'country',
  };
}

