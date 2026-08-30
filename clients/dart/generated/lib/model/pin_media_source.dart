//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaSource {
  /// Returns a new [PinMediaSource] instance.
  PinMediaSource({
    required this.contentType,
    required this.data,
    this.isStandard = true,
    required this.sourceType,
    required this.url,
    this.coverImageContentType,
    this.coverImageData,
    this.coverImageKeyFrameTime,
    this.coverImageUrl,
    required this.mediaId,
    this.index,
    this.items = const [],
    this.isAffiliateLink = false,
  });

  ContentType contentType;

  String data;

  /// Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users.
  bool isStandard;

  PinMediaSourceSourceTypeEnum sourceType;

  String url;

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

  String mediaId;

  /// Minimum value: 0
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? index;

  /// Array with image objects.
  List<PinMediaSourceImagesURLItem> items;

  /// This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products.
  bool isAffiliateLink;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaSource &&
    other.contentType == contentType &&
    other.data == data &&
    other.isStandard == isStandard &&
    other.sourceType == sourceType &&
    other.url == url &&
    other.coverImageContentType == coverImageContentType &&
    other.coverImageData == coverImageData &&
    other.coverImageKeyFrameTime == coverImageKeyFrameTime &&
    other.coverImageUrl == coverImageUrl &&
    other.mediaId == mediaId &&
    other.index == index &&
    _deepEquality.equals(other.items, items) &&
    other.isAffiliateLink == isAffiliateLink;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType.hashCode) +
    (data.hashCode) +
    (isStandard.hashCode) +
    (sourceType.hashCode) +
    (url.hashCode) +
    (coverImageContentType == null ? 0 : coverImageContentType!.hashCode) +
    (coverImageData == null ? 0 : coverImageData!.hashCode) +
    (coverImageKeyFrameTime == null ? 0 : coverImageKeyFrameTime!.hashCode) +
    (coverImageUrl == null ? 0 : coverImageUrl!.hashCode) +
    (mediaId.hashCode) +
    (index == null ? 0 : index!.hashCode) +
    (items.hashCode) +
    (isAffiliateLink.hashCode);

  @override
  String toString() => 'PinMediaSource[contentType=$contentType, data=$data, isStandard=$isStandard, sourceType=$sourceType, url=$url, coverImageContentType=$coverImageContentType, coverImageData=$coverImageData, coverImageKeyFrameTime=$coverImageKeyFrameTime, coverImageUrl=$coverImageUrl, mediaId=$mediaId, index=$index, items=$items, isAffiliateLink=$isAffiliateLink]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content_type'] = this.contentType;
      json[r'data'] = this.data;
      json[r'is_standard'] = this.isStandard;
      json[r'source_type'] = this.sourceType;
      json[r'url'] = this.url;
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
      json[r'media_id'] = this.mediaId;
    if (this.index != null) {
      json[r'index'] = this.index;
    } else {
      json[r'index'] = null;
    }
      json[r'items'] = this.items;
      json[r'is_affiliate_link'] = this.isAffiliateLink;
    return json;
  }

  /// Returns a new [PinMediaSource] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaSource? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'content_type'), 'Required key "PinMediaSource[content_type]" is missing from JSON.');
        assert(json[r'content_type'] != null, 'Required key "PinMediaSource[content_type]" has a null value in JSON.');
        assert(json.containsKey(r'data'), 'Required key "PinMediaSource[data]" is missing from JSON.');
        assert(json[r'data'] != null, 'Required key "PinMediaSource[data]" has a null value in JSON.');
        assert(json.containsKey(r'source_type'), 'Required key "PinMediaSource[source_type]" is missing from JSON.');
        assert(json[r'source_type'] != null, 'Required key "PinMediaSource[source_type]" has a null value in JSON.');
        assert(json.containsKey(r'url'), 'Required key "PinMediaSource[url]" is missing from JSON.');
        assert(json[r'url'] != null, 'Required key "PinMediaSource[url]" has a null value in JSON.');
        assert(json.containsKey(r'media_id'), 'Required key "PinMediaSource[media_id]" is missing from JSON.');
        assert(json[r'media_id'] != null, 'Required key "PinMediaSource[media_id]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "PinMediaSource[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "PinMediaSource[items]" has a null value in JSON.');
        return true;
      }());

      return PinMediaSource(
        contentType: ContentType.fromJson(json[r'content_type'])!,
        data: mapValueOfType<String>(json, r'data')!,
        isStandard: mapValueOfType<bool>(json, r'is_standard') ?? true,
        sourceType: PinMediaSourceSourceTypeEnum.fromJson(json[r'source_type'])!,
        url: mapValueOfType<String>(json, r'url')!,
        coverImageContentType: ContentType.fromJson(json[r'cover_image_content_type']),
        coverImageData: mapValueOfType<String>(json, r'cover_image_data'),
        coverImageKeyFrameTime: mapValueOfType<int>(json, r'cover_image_key_frame_time'),
        coverImageUrl: mapValueOfType<String>(json, r'cover_image_url'),
        mediaId: mapValueOfType<String>(json, r'media_id')!,
        index: mapValueOfType<int>(json, r'index'),
        items: PinMediaSourceImagesURLItem.listFromJson(json[r'items']),
        isAffiliateLink: mapValueOfType<bool>(json, r'is_affiliate_link') ?? false,
      );
    }
    return null;
  }

  static List<PinMediaSource> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSource>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSource.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaSource> mapFromJson(dynamic json) {
    final map = <String, PinMediaSource>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaSource.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaSource-objects as value to a dart map
  static Map<String, List<PinMediaSource>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaSource>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaSource.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'content_type',
    'data',
    'source_type',
    'url',
    'media_id',
    'items',
  };
}


enum PinMediaSourceSourceTypeEnum {
  pinUrl._(r'pin_url'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinMediaSourceSourceTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinMediaSourceSourceTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinMediaSourceSourceTypeEnum? fromJson(dynamic value) => PinMediaSourceSourceTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinMediaSourceSourceTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinMediaSourceSourceTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaSourceSourceTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaSourceSourceTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaSourceSourceTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaSourceSourceTypeEnum].
class PinMediaSourceSourceTypeEnumTypeTransformer {
  factory PinMediaSourceSourceTypeEnumTypeTransformer() => _instance ??= const PinMediaSourceSourceTypeEnumTypeTransformer._();

  const PinMediaSourceSourceTypeEnumTypeTransformer._();

  String encode(PinMediaSourceSourceTypeEnum data) => data._value;

  /// Returns the instance of [PinMediaSourceSourceTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaSourceSourceTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinMediaSourceSourceTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'pin_url': return PinMediaSourceSourceTypeEnum.pinUrl;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinMediaSourceSourceTypeEnumTypeTransformer? _instance;
}


