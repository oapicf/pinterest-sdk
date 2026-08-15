//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MediaUpload {
  /// Returns a new [MediaUpload] instance.
  MediaUpload({
    required this.mediaId,
    required this.mediaType,
    this.uploadParameters,
    this.uploadUrl,
  });

  /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  String mediaId;

  MediaUploadType mediaType;

  /// The list of parameter key/value pairs you will need to send with your POST request to upload your media file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MediaUploadParameters? uploadParameters;

  /// The URL where you will POST your media file.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? uploadUrl;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MediaUpload &&
    other.mediaId == mediaId &&
    other.mediaType == mediaType &&
    other.uploadParameters == uploadParameters &&
    other.uploadUrl == uploadUrl;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mediaId.hashCode) +
    (mediaType.hashCode) +
    (uploadParameters == null ? 0 : uploadParameters!.hashCode) +
    (uploadUrl == null ? 0 : uploadUrl!.hashCode);

  @override
  String toString() => 'MediaUpload[mediaId=$mediaId, mediaType=$mediaType, uploadParameters=$uploadParameters, uploadUrl=$uploadUrl]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'media_id'] = this.mediaId;
      json[r'media_type'] = this.mediaType;
    if (this.uploadParameters != null) {
      json[r'upload_parameters'] = this.uploadParameters;
    } else {
      json[r'upload_parameters'] = null;
    }
    if (this.uploadUrl != null) {
      json[r'upload_url'] = this.uploadUrl;
    } else {
      json[r'upload_url'] = null;
    }
    return json;
  }

  /// Returns a new [MediaUpload] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MediaUpload? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "MediaUpload[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "MediaUpload[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return MediaUpload(
        mediaId: mapValueOfType<String>(json, r'media_id')!,
        mediaType: MediaUploadType.fromJson(json[r'media_type'])!,
        uploadParameters: MediaUploadParameters.fromJson(json[r'upload_parameters']),
        uploadUrl: mapValueOfType<String>(json, r'upload_url'),
      );
    }
    return null;
  }

  static List<MediaUpload> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MediaUpload>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MediaUpload.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MediaUpload> mapFromJson(dynamic json) {
    final map = <String, MediaUpload>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MediaUpload.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MediaUpload-objects as value to a dart map
  static Map<String, List<MediaUpload>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MediaUpload>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MediaUpload.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_id',
    'media_type',
  };
}

