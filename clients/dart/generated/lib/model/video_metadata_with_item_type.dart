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
    required this.itemType,
    this.videoUrl,
    this.videoUrlHls,
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

  /// Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  VideoMetadataWithItemTypeItemTypeEnum itemType;

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  String? videoUrl;

  /// Video url (HLS).  **Note:** This field is limited and not available to all apps.
  String? videoUrlHls;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  int? width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is VideoMetadataWithItemType &&
    other.coverImageUrl == coverImageUrl &&
    other.duration == duration &&
    other.height == height &&
    other.itemType == itemType &&
    other.videoUrl == videoUrl &&
    other.videoUrlHls == videoUrlHls &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (duration == null ? 0 : duration!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (itemType.hashCode) +
    (videoUrl == null ? 0 : videoUrl!.hashCode) +
    (videoUrlHls == null ? 0 : videoUrlHls!.hashCode) +
    (width == null ? 0 : width!.hashCode);

  @override
  String toString() => 'VideoMetadataWithItemType[coverImageUrl=$coverImageUrl, duration=$duration, height=$height, itemType=$itemType, videoUrl=$videoUrl, videoUrlHls=$videoUrlHls, width=$width]';

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
      json[r'item_type'] = this.itemType;
    if (this.videoUrl != null) {
      json[r'video_url'] = this.videoUrl;
    } else {
      json[r'video_url'] = null;
    }
    if (this.videoUrlHls != null) {
      json[r'video_url_hls'] = this.videoUrlHls;
    } else {
      json[r'video_url_hls'] = null;
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
        assert(json.containsKey(r'item_type'), 'Required key "VideoMetadataWithItemType[item_type]" is missing from JSON.');
        assert(json[r'item_type'] != null, 'Required key "VideoMetadataWithItemType[item_type]" has a null value in JSON.');
        return true;
      }());

      return VideoMetadataWithItemType(
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        duration: json[r'duration'] == null
            ? null
            : num.parse('${json[r'duration']}'),
        height: mapValueOfType<int>(json, r'height'),
        itemType: VideoMetadataWithItemTypeItemTypeEnum.fromJson(json[r'item_type'])!,
        videoUrl: mapValueOfType<String>(json, r'video_url'),
        videoUrlHls: mapValueOfType<String>(json, r'video_url_hls'),
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
    'item_type',
  };
}

/// Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
enum VideoMetadataWithItemTypeItemTypeEnum {
  video._(r'video'),
  ;

  /// Instantiate a new enum with the provided value.
  const VideoMetadataWithItemTypeItemTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VideoMetadataWithItemTypeItemTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VideoMetadataWithItemTypeItemTypeEnum? fromJson(dynamic value) => VideoMetadataWithItemTypeItemTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VideoMetadataWithItemTypeItemTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VideoMetadataWithItemTypeItemTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VideoMetadataWithItemTypeItemTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VideoMetadataWithItemTypeItemTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VideoMetadataWithItemTypeItemTypeEnum] to String,
/// and [decode] dynamic data back to [VideoMetadataWithItemTypeItemTypeEnum].
class VideoMetadataWithItemTypeItemTypeEnumTypeTransformer {
  factory VideoMetadataWithItemTypeItemTypeEnumTypeTransformer() => _instance ??= const VideoMetadataWithItemTypeItemTypeEnumTypeTransformer._();

  const VideoMetadataWithItemTypeItemTypeEnumTypeTransformer._();

  String encode(VideoMetadataWithItemTypeItemTypeEnum data) => data._value;

  /// Returns the instance of [VideoMetadataWithItemTypeItemTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VideoMetadataWithItemTypeItemTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is VideoMetadataWithItemTypeItemTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'video': return VideoMetadataWithItemTypeItemTypeEnum.video;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VideoMetadataWithItemTypeItemTypeEnumTypeTransformer? _instance;
}


