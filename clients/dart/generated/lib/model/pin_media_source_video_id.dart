//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSourceVideoID {
  /// Returns a new [PinMediaSourceVideoID] instance.
  PinMediaSourceVideoID({
    this.coverImageContentType,
    this.coverImageData,
    this.coverImageKeyFrameTime,
    this.coverImageUrl,
    this.isStandard = true,
    required this.mediaId,
    required this.sourceType,
  });

  /// Content type for cover image Base64.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ContentType? coverImageContentType;

  /// Cover image Base64.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? coverImageData;

  /// Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used.
  ///
  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? coverImageKeyFrameTime;

  /// Cover image URL.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? coverImageUrl;

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  bool isStandard;

  String mediaId;

  PinMediaSourceVideoIDSourceTypeEnum sourceType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSourceVideoID &&
    other.coverImageContentType == coverImageContentType &&
    other.coverImageData == coverImageData &&
    other.coverImageKeyFrameTime == coverImageKeyFrameTime &&
    other.coverImageUrl == coverImageUrl &&
    other.isStandard == isStandard &&
    other.mediaId == mediaId &&
    other.sourceType == sourceType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (coverImageContentType == null ? 0 : coverImageContentType!.hashCode) +
    (coverImageData == null ? 0 : coverImageData!.hashCode) +
    (coverImageKeyFrameTime == null ? 0 : coverImageKeyFrameTime!.hashCode) +
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (isStandard.hashCode) +
    (mediaId.hashCode) +
    (sourceType.hashCode);

  @override
  String toString() => 'PinMediaSourceVideoID[coverImageContentType=$coverImageContentType, coverImageData=$coverImageData, coverImageKeyFrameTime=$coverImageKeyFrameTime, coverImageUrl=$coverImageUrl, isStandard=$isStandard, mediaId=$mediaId, sourceType=$sourceType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.coverImageContentType != null) {
      json[r'cover_image_content_type'] = this.coverImageContentType;
    } else {
      json[r'cover_image_content_type'] = null;
    }
    if (this.coverImageData != null) {
      json[r'cover_image_data'] = this.coverImageData;
    } else {
      json[r'cover_image_data'] = null;
    }
    if (this.coverImageKeyFrameTime != null) {
      json[r'cover_image_key_frame_time'] = this.coverImageKeyFrameTime;
    } else {
      json[r'cover_image_key_frame_time'] = null;
    }
    if (this.coverImageUrl != null) {
      json[r'cover_image_url'] = this.coverImageUrl;
    } else {
      json[r'cover_image_url'] = null;
    }
      json[r'is_standard'] = this.isStandard;
      json[r'media_id'] = this.mediaId;
      json[r'source_type'] = this.sourceType;
    return json;
  }

  /// Returns a new [PinMediaSourceVideoID] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSourceVideoID? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'media_id'), 'Required key "PinMediaSourceVideoID[media_id]" is missing from JSON.');
        assert(json[r'media_id'] != null, 'Required key "PinMediaSourceVideoID[media_id]" has a null value in JSON.');
        assert(json.containsKey(r'source_type'), 'Required key "PinMediaSourceVideoID[source_type]" is missing from JSON.');
        assert(json[r'source_type'] != null, 'Required key "PinMediaSourceVideoID[source_type]" has a null value in JSON.');
        return true;
      }());

      return PinMediaSourceVideoID(
        coverImageContentType: ContentType.fromJson(json[r'cover_image_content_type']),
        coverImageData: mapValueOfType<String>(json, r'cover_image_data'),
        coverImageKeyFrameTime: mapValueOfType<int>(json, r'cover_image_key_frame_time'),
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        isStandard: mapValueOfType<bool>(json, r'is_standard') ?? true,
        mediaId: mapValueOfType<String>(json, r'media_id')!,
        sourceType: PinMediaSourceVideoIDSourceTypeEnum.fromJson(json[r'source_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaSourceVideoID> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceVideoID>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceVideoID.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSourceVideoID> mapFromJson(dynamic json) {
    final map = <String, PinMediaSourceVideoID>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSourceVideoID.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSourceVideoID-objects as value to a dart map
  static Map<String, List<PinMediaSourceVideoID>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSourceVideoID>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSourceVideoID.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_id',
    'source_type',
  };
}


enum PinMediaSourceVideoIDSourceTypeEnum {
  videoId._(r'video_id'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinMediaSourceVideoIDSourceTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinMediaSourceVideoIDSourceTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinMediaSourceVideoIDSourceTypeEnum? fromJson(dynamic value) => PinMediaSourceVideoIDSourceTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinMediaSourceVideoIDSourceTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinMediaSourceVideoIDSourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceVideoIDSourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceVideoIDSourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourceVideoIDSourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourceVideoIDSourceTypeEnum].
class PinMediaSourceVideoIDSourceTypeEnumTypeTransformer {
  factory PinMediaSourceVideoIDSourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourceVideoIDSourceTypeEnumTypeTransformer._();

  const PinMediaSourceVideoIDSourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourceVideoIDSourceTypeEnum data) => data._value;

  /// Returns the instance of [PinMediaSourceVideoIDSourceTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourceVideoIDSourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinMediaSourceVideoIDSourceTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'video_id': return PinMediaSourceVideoIDSourceTypeEnum.videoId;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinMediaSourceVideoIDSourceTypeEnumTypeTransformer? _instance;
}


