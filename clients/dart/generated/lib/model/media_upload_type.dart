//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class MediaUploadType {
  /// Instantiate a new enum with the provided [value].
  const MediaUploadType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const video = MediaUploadType._(r'video');

  /// List of all possible values in this [enum][MediaUploadType].
  static const values = <MediaUploadType>[
    video,
  ];

  static MediaUploadType? fromJson(dynamic value) => MediaUploadTypeTypeTransformer().decode(value);

  static List<MediaUploadType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MediaUploadType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MediaUploadType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MediaUploadType] to String,
/// and [decode] dynamic data back to [MediaUploadType].
class MediaUploadTypeTypeTransformer {
  factory MediaUploadTypeTypeTransformer() => _instance ??= const MediaUploadTypeTypeTransformer._();

  const MediaUploadTypeTypeTransformer._();

  String encode(MediaUploadType data) => data.value;

  /// Decodes a [dynamic value][data] to a MediaUploadType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MediaUploadType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'video': return MediaUploadType.video;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MediaUploadTypeTypeTransformer] instance.
  static MediaUploadTypeTypeTransformer? _instance;
}

