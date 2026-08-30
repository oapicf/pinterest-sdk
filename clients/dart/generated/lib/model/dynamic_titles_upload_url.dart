//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DynamicTitlesUploadURL {
  /// Returns a new [DynamicTitlesUploadURL] instance.
  DynamicTitlesUploadURL({
    this.existingFilename,
    required this.requestId,
    required this.uploadUrl,
  });

  /// If present, a reviewed CSV was previously submitted for this ad group. Uploading a new file will replace it. Absent when no prior submission exists.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? existingFilename;

  /// Unique identifier for this upload session. Must be passed to the process endpoint.
  String requestId;

  /// Pre-signed S3 PUT URL to upload the reviewed CSV file.
  String uploadUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DynamicTitlesUploadURL &&
    other.existingFilename == existingFilename &&
    other.requestId == requestId &&
    other.uploadUrl == uploadUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (existingFilename == null ? 0 : existingFilename!.hashCode) +
    (requestId.hashCode) +
    (uploadUrl.hashCode);

  @override
  String toString() => 'DynamicTitlesUploadURL[existingFilename=$existingFilename, requestId=$requestId, uploadUrl=$uploadUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.existingFilename != null) {
      json[r'existing_filename'] = this.existingFilename;
    } else {
      json[r'existing_filename'] = null;
    }
      json[r'request_id'] = this.requestId;
      json[r'upload_url'] = this.uploadUrl;
    return json;
  }

  /// Returns a new [DynamicTitlesUploadURL] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DynamicTitlesUploadURL? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'request_id'), 'Required key "DynamicTitlesUploadURL[request_id]" is missing from JSON.');
        assert(json[r'request_id'] != null, 'Required key "DynamicTitlesUploadURL[request_id]" has a null value in JSON.');
        assert(json.containsKey(r'upload_url'), 'Required key "DynamicTitlesUploadURL[upload_url]" is missing from JSON.');
        assert(json[r'upload_url'] != null, 'Required key "DynamicTitlesUploadURL[upload_url]" has a null value in JSON.');
        return true;
      }());

      return DynamicTitlesUploadURL(
        existingFilename: mapValueOfType<String>(json, r'existing_filename'),
        requestId: mapValueOfType<String>(json, r'request_id')!,
        uploadUrl: mapValueOfType<String>(json, r'upload_url')!,
      );
    }
    return null;
  }

  static List<DynamicTitlesUploadURL> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DynamicTitlesUploadURL>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DynamicTitlesUploadURL.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DynamicTitlesUploadURL> mapFromJson(dynamic json) {
    final map = <String, DynamicTitlesUploadURL>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DynamicTitlesUploadURL.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DynamicTitlesUploadURL-objects as value to a dart map
  static Map<String, List<DynamicTitlesUploadURL>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DynamicTitlesUploadURL>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DynamicTitlesUploadURL.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'request_id',
    'upload_url',
  };
}

