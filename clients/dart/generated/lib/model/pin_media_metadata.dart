//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaMetadata {
  /// Returns a new [PinMediaMetadata] instance.
  PinMediaMetadata({
    this.description,
    this.images,
    required this.itemType,
    this.link,
    this.title,
    this.coverImageUrl,
    this.duration,
    this.height,
    this.videoUrl,
    this.videoUrlHls,
    this.width,
  });

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageSize? images;

  /// Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload.
  PinMediaMetadataItemTypeEnum itemType;

  String? link;

  String? title;

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

  /// Video url (HLS).  **Note:** This field is limited and not available to all apps.
  String? videoUrlHls;

  /// Width (in pixels). Field maybe null after creation due to video processing time.
  int? width;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaMetadata &&
    other.description == description &&
    other.images == images &&
    other.itemType == itemType &&
    other.link == link &&
    other.title == title &&
    other.coverImageUrl == coverImageUrl &&
    other.duration == duration &&
    other.height == height &&
    other.videoUrl == videoUrl &&
    other.videoUrlHls == videoUrlHls &&
    other.width == width;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (images == null ? 0 : images!.hashCode) +
    (itemType.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (title == null ? 0 : title!.hashCode) +
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (duration == null ? 0 : duration!.hashCode) +
    (height == null ? 0 : height!.hashCode) +
    (videoUrl == null ? 0 : videoUrl!.hashCode) +
    (videoUrlHls == null ? 0 : videoUrlHls!.hashCode) +
    (width == null ? 0 : width!.hashCode);

  @override
  String toString() => 'PinMediaMetadata[description=$description, images=$images, itemType=$itemType, link=$link, title=$title, coverImageUrl=$coverImageUrl, duration=$duration, height=$height, videoUrl=$videoUrl, videoUrlHls=$videoUrlHls, width=$width]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.description != null) {
      json[r'description'] = this.description;
    } else {
      json[r'description'] = null;
    }
    if (this.images != null) {
      json[r'images'] = this.images;
    } else {
      json[r'images'] = null;
    }
      json[r'item_type'] = this.itemType;
    if (this.link != null) {
      json[r'link'] = this.link;
    } else {
      json[r'link'] = null;
    }
    if (this.title != null) {
      json[r'title'] = this.title;
    } else {
      json[r'title'] = null;
    }
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

  /// Returns a new [PinMediaMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_type'), 'Required key "PinMediaMetadata[item_type]" is missing from JSON.');
        assert(json[r'item_type'] != null, 'Required key "PinMediaMetadata[item_type]" has a null value in JSON.');
        return true;
      }());

      return PinMediaMetadata(
        description: mapValueOfType<String>(json, r'description'),
        images: ImageSize.fromJson(json[r'images']),
        itemType: PinMediaMetadataItemTypeEnum.fromJson(json[r'item_type'])!,
        link: mapValueOfType<String>(json, r'link'),
        title: mapValueOfType<String>(json, r'title'),
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        duration: json[r'duration'] == null
            ? null
            : num.parse('${json[r'duration']}'),
        height: mapValueOfType<int>(json, r'height'),
        videoUrl: mapValueOfType<String>(json, r'video_url'),
        videoUrlHls: mapValueOfType<String>(json, r'video_url_hls'),
        width: mapValueOfType<int>(json, r'width'),
      );
    }
    return null;
  }

  static List<PinMediaMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaMetadata> mapFromJson(dynamic json) {
    final map = <String, PinMediaMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaMetadata-objects as value to a dart map
  static Map<String, List<PinMediaMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaMetadata.listFromJson(entry.value, growable: growable,);
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
enum PinMediaMetadataItemTypeEnum {
  video._(r'video'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinMediaMetadataItemTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinMediaMetadataItemTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinMediaMetadataItemTypeEnum? fromJson(dynamic value) => PinMediaMetadataItemTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinMediaMetadataItemTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinMediaMetadataItemTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaMetadataItemTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaMetadataItemTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaMetadataItemTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaMetadataItemTypeEnum].
class PinMediaMetadataItemTypeEnumTypeTransformer {
  factory PinMediaMetadataItemTypeEnumTypeTransformer() => _instance ??= const PinMediaMetadataItemTypeEnumTypeTransformer._();

  const PinMediaMetadataItemTypeEnumTypeTransformer._();

  String encode(PinMediaMetadataItemTypeEnum data) => data._value;

  /// Returns the instance of [PinMediaMetadataItemTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaMetadataItemTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinMediaMetadataItemTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'video': return PinMediaMetadataItemTypeEnum.video;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinMediaMetadataItemTypeEnumTypeTransformer? _instance;
}


