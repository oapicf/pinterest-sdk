//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class MediaType {
  /// Instantiate a new enum with the provided [value].
  const MediaType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const IMAGE = MediaType._(r'IMAGE');
  static const VIDEO = MediaType._(r'VIDEO');

  /// List of all possible values in this [enum][MediaType].
  static const values = <MediaType>[
    IMAGE,
    VIDEO,
  ];

  static MediaType? fromJson(dynamic value) => MediaTypeTypeTransformer().decode(value);

  static List<MediaType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MediaType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MediaType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MediaType] to String,
/// and [decode] dynamic data back to [MediaType].
class MediaTypeTypeTransformer {
  factory MediaTypeTypeTransformer() => _instance ??= const MediaTypeTypeTransformer._();

  const MediaTypeTypeTransformer._();

  String encode(MediaType data) => data.value;

  /// Decodes a [dynamic value][data] to a MediaType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MediaType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'IMAGE': return MediaType.IMAGE;
        case r'VIDEO': return MediaType.VIDEO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MediaTypeTypeTransformer] instance.
  static MediaTypeTypeTransformer? _instance;
}

