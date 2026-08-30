//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BrandAccountCreate {
  /// Returns a new [BrandAccountCreate] instance.
  BrandAccountCreate({
    this.about,
    required this.country,
    required this.name,
    this.profileImage,
    required this.username,
    this.website,
  });

  /// Brand Account about information
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? about;

  Country country;

  /// Brand Account name
  String name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BrandAccountProfileImage? profileImage;

  /// Brand Account username
  String username;

  /// Brand Account website
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BrandAccountCreate &&
    other.about == about &&
    other.country == country &&
    other.name == name &&
    other.profileImage == profileImage &&
    other.username == username &&
    other.website == website;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (about == null ? 0 : about!.hashCode) +
    (country.hashCode) +
    (name.hashCode) +
    (profileImage == null ? 0 : profileImage!.hashCode) +
    (username.hashCode) +
    (website == null ? 0 : website!.hashCode);

  @override
  String toString() => 'BrandAccountCreate[about=$about, country=$country, name=$name, profileImage=$profileImage, username=$username, website=$website]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.about != null) {
      json[r'about'] = this.about;
    } else {
      json[r'about'] = null;
    }
      json[r'country'] = this.country;
      json[r'name'] = this.name;
    if (this.profileImage != null) {
      json[r'profile_image'] = this.profileImage;
    } else {
      json[r'profile_image'] = null;
    }
      json[r'username'] = this.username;
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    return json;
  }

  /// Returns a new [BrandAccountCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BrandAccountCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'country'), 'Required key "BrandAccountCreate[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "BrandAccountCreate[country]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "BrandAccountCreate[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "BrandAccountCreate[name]" has a null value in JSON.');
        assert(json.containsKey(r'username'), 'Required key "BrandAccountCreate[username]" is missing from JSON.');
        assert(json[r'username'] != null, 'Required key "BrandAccountCreate[username]" has a null value in JSON.');
        return true;
      }());

      return BrandAccountCreate(
        about: mapValueOfType<String>(json, r'about'),
        country: Country.fromJson(json[r'country'])!,
        name: mapValueOfType<String>(json, r'name')!,
        profileImage: BrandAccountProfileImage.fromJson(json[r'profile_image']),
        username: mapValueOfType<String>(json, r'username')!,
        website: mapValueOfType<String>(json, r'website'),
      );
    }
    return null;
  }

  static List<BrandAccountCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandAccountCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandAccountCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BrandAccountCreate> mapFromJson(dynamic json) {
    final map = <String, BrandAccountCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BrandAccountCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BrandAccountCreate-objects as value to a dart map
  static Map<String, List<BrandAccountCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BrandAccountCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BrandAccountCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'name',
    'username',
  };
}

