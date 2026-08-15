//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Media {
  /// Returns a new [Media] instance.
  Media({
    required this.mediaId,
    required this.mediaType,
    this.status,
  });

  /// Unique identifier for this media upload. Used to track status and for attaching during Pin creation.
  String mediaId;

  MediaUploadType mediaType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MediaUploadStatus? status;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Media &&
    other.mediaId == mediaId &&
    other.mediaType == mediaType &&
    other.status == status;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (mediaId.hashCode) +
    (mediaType.hashCode) +
    (status == null ? 0 : status!.hashCode);

  @override
  String toString() => 'Media[mediaId=$mediaId, mediaType=$mediaType, status=$status]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'media_id'] = this.mediaId;
      json[r'media_type'] = this.mediaType;
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
    return json;
  }

  /// Returns a new [Media] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Media? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "Media[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "Media[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return Media(
        mediaId: mapValueOfType<String>(json, r'media_id')!,
        mediaType: MediaUploadType.fromJson(json[r'media_type'])!,
        status: MediaUploadStatus.fromJson(json[r'status']),
      );
    }
    return null;
  }

  static List<Media> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Media>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Media.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Media> mapFromJson(dynamic json) {
    final map = <String, Media>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Media.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Media-objects as value to a dart map
  static Map<String, List<Media>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Media>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Media.listFromJson(entry.value, growable: growable,);
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

