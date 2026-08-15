//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserWebsiteVerificationCode {
  /// Returns a new [UserWebsiteVerificationCode] instance.
  UserWebsiteVerificationCode({
    this.dnsTxtRecord,
    this.fileContent,
    this.filename,
    this.metatag,
    this.verificationCode,
  });

  /// DNS TXT record to check against for the website to be claimed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? dnsTxtRecord;

  /// A full html file to upload to the website in order for it to be claimed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? fileContent;

  /// File expected to find on the website being claimed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? filename;

  /// Metatag the verification process searchs for the website to be claimed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? metatag;

  /// Code to check against the user claiming the website
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? verificationCode;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserWebsiteVerificationCode &&
    other.dnsTxtRecord == dnsTxtRecord &&
    other.fileContent == fileContent &&
    other.filename == filename &&
    other.metatag == metatag &&
    other.verificationCode == verificationCode;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dnsTxtRecord == null ? 0 : dnsTxtRecord!.hashCode) +
    (fileContent == null ? 0 : fileContent!.hashCode) +
    (filename == null ? 0 : filename!.hashCode) +
    (metatag == null ? 0 : metatag!.hashCode) +
    (verificationCode == null ? 0 : verificationCode!.hashCode);

  @override
  String toString() => 'UserWebsiteVerificationCode[dnsTxtRecord=$dnsTxtRecord, fileContent=$fileContent, filename=$filename, metatag=$metatag, verificationCode=$verificationCode]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dnsTxtRecord != null) {
      json[r'dns_txt_record'] = this.dnsTxtRecord;
    } else {
      json[r'dns_txt_record'] = null;
    }
    if (this.fileContent != null) {
      json[r'file_content'] = this.fileContent;
    } else {
      json[r'file_content'] = null;
    }
    if (this.filename != null) {
      json[r'filename'] = this.filename;
    } else {
      json[r'filename'] = null;
    }
    if (this.metatag != null) {
      json[r'metatag'] = this.metatag;
    } else {
      json[r'metatag'] = null;
    }
    if (this.verificationCode != null) {
      json[r'verification_code'] = this.verificationCode;
    } else {
      json[r'verification_code'] = null;
    }
    return json;
  }

  /// Returns a new [UserWebsiteVerificationCode] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserWebsiteVerificationCode? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserWebsiteVerificationCode[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserWebsiteVerificationCode[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserWebsiteVerificationCode(
        dnsTxtRecord: mapValueOfType<String>(json, r'dns_txt_record'),
        fileContent: mapValueOfType<String>(json, r'file_content'),
        filename: mapValueOfType<String>(json, r'filename'),
        metatag: mapValueOfType<String>(json, r'metatag'),
        verificationCode: mapValueOfType<String>(json, r'verification_code'),
      );
    }
    return null;
  }

  static List<UserWebsiteVerificationCode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserWebsiteVerificationCode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserWebsiteVerificationCode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserWebsiteVerificationCode> mapFromJson(dynamic json) {
    final map = <String, UserWebsiteVerificationCode>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserWebsiteVerificationCode.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserWebsiteVerificationCode-objects as value to a dart map
  static Map<String, List<UserWebsiteVerificationCode>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserWebsiteVerificationCode>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserWebsiteVerificationCode.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

