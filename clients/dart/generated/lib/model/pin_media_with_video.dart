//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaWithVideo {
  /// Returns a new [PinMediaWithVideo] instance.
  PinMediaWithVideo({
    this.coverImageUrl,
    this.duration,
    this.height,
    this.images,
    required this.mediaType,
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
  ImageSize? images;

  PinMediaWithVideoMediaTypeEnum mediaType;

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  String? videoUrl;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  int? width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaWithVideo &&
    other.coverImageUrl == coverImageUrl &&
    other.duration == duration &&
    other.height == height &&
    other.images == images &&
    other.mediaType == mediaType &&
    other.videoUrl == videoUrl &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (duration == null ? 0 : duration!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (images == null ? 0 : images!.hashCode) +
    (mediaType.hashCode) +
    (videoUrl == null ? 0 : videoUrl!.hashCode) +
    (width == null ? 0 : width!.hashCode);

  @override
  String toString() => 'PinMediaWithVideo[coverImageUrl=$coverImageUrl, duration=$duration, height=$height, images=$images, mediaType=$mediaType, videoUrl=$videoUrl, width=$width]';

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
    if (this.images != null) {
      json[r'images'] = this.images;
    } else {
      json[r'images'] = null;
    }
      json[r'media_type'] = this.mediaType;
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

  /// Returns a new [PinMediaWithVideo] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaWithVideo? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaWithVideo[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaWithVideo[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaWithVideo(
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        duration: json[r'duration'] == null
            ? null
            : num.parse('${json[r'duration']}'),
        height: mapValueOfType<int>(json, r'height'),
        images: ImageSize.fromJson(json[r'images']),
        mediaType: PinMediaWithVideoMediaTypeEnum.fromJson(json[r'media_type'])!,
        videoUrl: mapValueOfType<String>(json, r'video_url'),
        width: mapValueOfType<int>(json, r'width'),
      );
    }
    return null;
  }

  static List<PinMediaWithVideo> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithVideo>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithVideo.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaWithVideo> mapFromJson(dynamic json) {
    final map = <String, PinMediaWithVideo>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaWithVideo.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaWithVideo-objects as value to a dart map
  static Map<String, List<PinMediaWithVideo>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaWithVideo>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaWithVideo.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_type',
  };
}


class PinMediaWithVideoMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaWithVideoMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const video = PinMediaWithVideoMediaTypeEnum._(r'video');

  /// List of all possible values in this [enum][PinMediaWithVideoMediaTypeEnum].
  static const values = <PinMediaWithVideoMediaTypeEnum>[
    video,
  ];

  static PinMediaWithVideoMediaTypeEnum? fromJson(dynamic value) => PinMediaWithVideoMediaTypeEnumTypeTransformer().decode(value);

  static List<PinMediaWithVideoMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithVideoMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithVideoMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaWithVideoMediaTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaWithVideoMediaTypeEnum].
class PinMediaWithVideoMediaTypeEnumTypeTransformer {
  factory PinMediaWithVideoMediaTypeEnumTypeTransformer() => _instance ??= const PinMediaWithVideoMediaTypeEnumTypeTransformer._();

  const PinMediaWithVideoMediaTypeEnumTypeTransformer._();

  String encode(PinMediaWithVideoMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaWithVideoMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaWithVideoMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'video': return PinMediaWithVideoMediaTypeEnum.video;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaWithVideoMediaTypeEnumTypeTransformer] instance.
  static PinMediaWithVideoMediaTypeEnumTypeTransformer? _instance;
}


