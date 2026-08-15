//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MediaUploadParameters {
  /// Returns a new [MediaUploadParameters] instance.
  MediaUploadParameters({
    this.contentType,
    this.key,
    this.policy,
    this.xAmzAlgorithm,
    this.xAmzCredential,
    this.xAmzDate,
    this.xAmzSecurityToken,
    this.xAmzSignature,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? contentType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? key;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? policy;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? xAmzAlgorithm;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? xAmzCredential;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? xAmzDate;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? xAmzSecurityToken;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? xAmzSignature;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MediaUploadParameters &&
    other.contentType == contentType &&
    other.key == key &&
    other.policy == policy &&
    other.xAmzAlgorithm == xAmzAlgorithm &&
    other.xAmzCredential == xAmzCredential &&
    other.xAmzDate == xAmzDate &&
    other.xAmzSecurityToken == xAmzSecurityToken &&
    other.xAmzSignature == xAmzSignature;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType == null ? 0 : contentType!.hashCode) +
    (key == null ? 0 : key!.hashCode) +
    (policy == null ? 0 : policy!.hashCode) +
    (xAmzAlgorithm == null ? 0 : xAmzAlgorithm!.hashCode) +
    (xAmzCredential == null ? 0 : xAmzCredential!.hashCode) +
    (xAmzDate == null ? 0 : xAmzDate!.hashCode) +
    (xAmzSecurityToken == null ? 0 : xAmzSecurityToken!.hashCode) +
    (xAmzSignature == null ? 0 : xAmzSignature!.hashCode);

  @override
  String toString() => 'MediaUploadParameters[contentType=$contentType, key=$key, policy=$policy, xAmzAlgorithm=$xAmzAlgorithm, xAmzCredential=$xAmzCredential, xAmzDate=$xAmzDate, xAmzSecurityToken=$xAmzSecurityToken, xAmzSignature=$xAmzSignature]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.contentType != null) {
      json[r'Content-Type'] = this.contentType;
    } else {
      json[r'Content-Type'] = null;
    }
    if (this.key != null) {
      json[r'key'] = this.key;
    } else {
      json[r'key'] = null;
    }
    if (this.policy != null) {
      json[r'policy'] = this.policy;
    } else {
      json[r'policy'] = null;
    }
    if (this.xAmzAlgorithm != null) {
      json[r'x-amz-algorithm'] = this.xAmzAlgorithm;
    } else {
      json[r'x-amz-algorithm'] = null;
    }
    if (this.xAmzCredential != null) {
      json[r'x-amz-credential'] = this.xAmzCredential;
    } else {
      json[r'x-amz-credential'] = null;
    }
    if (this.xAmzDate != null) {
      json[r'x-amz-date'] = this.xAmzDate;
    } else {
      json[r'x-amz-date'] = null;
    }
    if (this.xAmzSecurityToken != null) {
      json[r'x-amz-security-token'] = this.xAmzSecurityToken;
    } else {
      json[r'x-amz-security-token'] = null;
    }
    if (this.xAmzSignature != null) {
      json[r'x-amz-signature'] = this.xAmzSignature;
    } else {
      json[r'x-amz-signature'] = null;
    }
    return json;
  }

  /// Returns a new [MediaUploadParameters] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MediaUploadParameters? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MediaUploadParameters[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MediaUploadParameters[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MediaUploadParameters(
        contentType: mapValueOfType<String>(json, r'Content-Type'),
        key: mapValueOfType<String>(json, r'key'),
        policy: mapValueOfType<String>(json, r'policy'),
        xAmzAlgorithm: mapValueOfType<String>(json, r'x-amz-algorithm'),
        xAmzCredential: mapValueOfType<String>(json, r'x-amz-credential'),
        xAmzDate: mapValueOfType<String>(json, r'x-amz-date'),
        xAmzSecurityToken: mapValueOfType<String>(json, r'x-amz-security-token'),
        xAmzSignature: mapValueOfType<String>(json, r'x-amz-signature'),
      );
    }
    return null;
  }

  static List<MediaUploadParameters> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MediaUploadParameters>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MediaUploadParameters.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MediaUploadParameters> mapFromJson(dynamic json) {
    final map = <String, MediaUploadParameters>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MediaUploadParameters.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MediaUploadParameters-objects as value to a dart map
  static Map<String, List<MediaUploadParameters>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MediaUploadParameters>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MediaUploadParameters.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

