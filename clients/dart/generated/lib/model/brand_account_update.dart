//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BrandAccountUpdate {
  /// Returns a new [BrandAccountUpdate] instance.
  BrandAccountUpdate({
    this.about,
    this.country,
    this.name,
    this.profileImage,
    this.username,
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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Country? country;

  /// Brand Account name
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BrandAccountProfileImageUpdate? profileImage;

  /// Brand Account username
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? username;

  /// Brand Account website
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? website;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BrandAccountUpdate &&
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
    (country == null ? 0 : country!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (profileImage == null ? 0 : profileImage!.hashCode) +
    (username == null ? 0 : username!.hashCode) +
    (website == null ? 0 : website!.hashCode);

  @override
  String toString() => 'BrandAccountUpdate[about=$about, country=$country, name=$name, profileImage=$profileImage, username=$username, website=$website]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.about != null) {
      json[r'about'] = this.about;
    } else {
      json[r'about'] = null;
    }
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.profileImage != null) {
      json[r'profile_image'] = this.profileImage;
    } else {
      json[r'profile_image'] = null;
    }
    if (this.username != null) {
      json[r'username'] = this.username;
    } else {
      json[r'username'] = null;
    }
    if (this.website != null) {
      json[r'website'] = this.website;
    } else {
      json[r'website'] = null;
    }
    return json;
  }

  /// Returns a new [BrandAccountUpdate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BrandAccountUpdate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BrandAccountUpdate(
        about: mapValueOfType<String>(json, r'about'),
        country: Country.fromJson(json[r'country']),
        name: mapValueOfType<String>(json, r'name'),
        profileImage: BrandAccountProfileImageUpdate.fromJson(json[r'profile_image']),
        username: mapValueOfType<String>(json, r'username'),
        website: mapValueOfType<String>(json, r'website'),
      );
    }
    return null;
  }

  static List<BrandAccountUpdate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandAccountUpdate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandAccountUpdate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BrandAccountUpdate> mapFromJson(dynamic json) {
    final map = <String, BrandAccountUpdate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BrandAccountUpdate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BrandAccountUpdate-objects as value to a dart map
  static Map<String, List<BrandAccountUpdate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BrandAccountUpdate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BrandAccountUpdate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

