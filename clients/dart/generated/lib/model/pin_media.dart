//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMedia {
  /// Returns a new [PinMedia] instance.
  PinMedia({
    this.images,
    required this.mediaType,
    this.coverImageUrl,
    this.duration,
    this.height,
    this.videoUrl,
    this.width,
    this.items = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageSize? images;

  PinMediaMediaTypeEnum mediaType;

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

  /// Video url (720p).  **Note:** This field is limited and not available to all apps.
  String? videoUrl;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  int? width;

  List<PinMediaMetadata> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMedia &&
    other.images == images &&
    other.mediaType == mediaType &&
    other.coverImageUrl == coverImageUrl &&
    other.duration == duration &&
    other.height == height &&
    other.videoUrl == videoUrl &&
    other.width == width &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (images == null ? 0 : images!.hashCode) +
    (mediaType.hashCode) +
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (duration == null ? 0 : duration!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (videoUrl == null ? 0 : videoUrl!.hashCode) +
    (width == null ? 0 : width!.hashCode) +
    (items.hashCode);

  @override
  String toString() => 'PinMedia[images=$images, mediaType=$mediaType, coverImageUrl=$coverImageUrl, duration=$duration, height=$height, videoUrl=$videoUrl, width=$width, items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.images != null) {
      json[r'images'] = this.images;
    } else {
      json[r'images'] = null;
    }
      json[r'media_type'] = this.mediaType;
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
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [PinMedia] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMedia? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMedia[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMedia[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMedia(
        images: ImageSize.fromJson(json[r'images']),
        mediaType: PinMediaMediaTypeEnum.fromJson(json[r'media_type'])!,
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        duration: json[r'duration'] == null
            ? null
            : num.parse('${json[r'duration']}'),
        height: mapValueOfType<int>(json, r'height'),
        videoUrl: mapValueOfType<String>(json, r'video_url'),
        width: mapValueOfType<int>(json, r'width'),
        items: PinMediaMetadata.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<PinMedia> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMedia>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMedia.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMedia> mapFromJson(dynamic json) {
    final map = <String, PinMedia>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMedia.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMedia-objects as value to a dart map
  static Map<String, List<PinMedia>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMedia>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMedia.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_type',
  };
}


class PinMediaMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const multipleMixed = PinMediaMediaTypeEnum._(r'multiple_mixed');

  /// List of all possible values in this [enum][PinMediaMediaTypeEnum].
  static const values = <PinMediaMediaTypeEnum>[
    multipleMixed,
  ];

  static PinMediaMediaTypeEnum? fromJson(dynamic value) => PinMediaMediaTypeEnumTypeTransformer().decode(value);

  static List<PinMediaMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaMediaTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaMediaTypeEnum].
class PinMediaMediaTypeEnumTypeTransformer {
  factory PinMediaMediaTypeEnumTypeTransformer() => _instance ??= const PinMediaMediaTypeEnumTypeTransformer._();

  const PinMediaMediaTypeEnumTypeTransformer._();

  String encode(PinMediaMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'multiple_mixed': return PinMediaMediaTypeEnum.multipleMixed;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaMediaTypeEnumTypeTransformer] instance.
  static PinMediaMediaTypeEnumTypeTransformer? _instance;
}


