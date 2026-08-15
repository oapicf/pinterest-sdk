//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class VideoMetadataWithItemType {
  /// Returns a new [VideoMetadataWithItemType] instance.
  VideoMetadataWithItemType({
    this.coverImageUrl,
    this.duration,
    this.height,
    this.itemType,
    this.videoUrl,
    this.width,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? coverImageUrl;

  /// Duration (in miliseconds). Field maybe null after creation due to video processing time.
  num? duration;

  /// Height (in pixels). Field maybe null after creation due to video processing time.
  int? height;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? itemType;

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  String? videoUrl;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  int? width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VideoMetadataWithItemType &&
    other.coverImageUrl == coverImageUrl &&
    other.duration == duration &&
    other.height == height &&
    other.itemType == itemType &&
    other.videoUrl == videoUrl &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (duration == null ? 0 : duration!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (itemType == null ? 0 : itemType!.hashCode) +
    (videoUrl == null ? 0 : videoUrl!.hashCode) +
    (width == null ? 0 : width!.hashCode);

  @override
  String toString() => 'VideoMetadataWithItemType[coverImageUrl=$coverImageUrl, duration=$duration, height=$height, itemType=$itemType, videoUrl=$videoUrl, width=$width]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.coverImageUrl != null) {
      json[r'cover_image_url'] = this.coverImageUrl;
    } else {
      json[r'cover_image_url'] = null;
    }
    if (this.duration != null) {
      json[r'duration'] = this.duration;
    } else {
      json[r'duration'] = null;
    }
    if (this.height != null) {
      json[r'height'] = this.height;
    } else {
      json[r'height'] = null;
    }
    if (this.itemType != null) {
      json[r'item_type'] = this.itemType;
    } else {
      json[r'item_type'] = null;
    }
    if (this.videoUrl != null) {
      json[r'video_url'] = this.videoUrl;
    } else {
      json[r'video_url'] = null;
    }
    if (this.width != null) {
      json[r'width'] = this.width;
    } else {
      json[r'width'] = null;
    }
    return json;
  }

  /// Returns a new [VideoMetadataWithItemType] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static VideoMetadataWithItemType? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "VideoMetadataWithItemType[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "VideoMetadataWithItemType[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return VideoMetadataWithItemType(
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        duration: json[r'duration'] == null
            ? null
            : num.parse('${json[r'duration']}'),
        height: mapValueOfType<int>(json, r'height'),
        itemType: mapValueOfType<String>(json, r'item_type'),
        videoUrl: mapValueOfType<String>(json, r'video_url'),
        width: mapValueOfType<int>(json, r'width'),
      );
    }
    return null;
  }

  static List<VideoMetadataWithItemType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VideoMetadataWithItemType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VideoMetadataWithItemType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, VideoMetadataWithItemType> mapFromJson(dynamic json) {
    final map = <String, VideoMetadataWithItemType>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = VideoMetadataWithItemType.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of VideoMetadataWithItemType-objects as value to a dart map
  static Map<String, List<VideoMetadataWithItemType>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<VideoMetadataWithItemType>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = VideoMetadataWithItemType.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

