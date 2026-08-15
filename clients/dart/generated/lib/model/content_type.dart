//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ContentType {
  /// Instantiate a new enum with the provided [value].
  const ContentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageSlashJpeg = ContentType._(r'image/jpeg');
  static const imageSlashPng = ContentType._(r'image/png');

  /// List of all possible values in this [enum][ContentType].
  static const values = <ContentType>[
    imageSlashJpeg,
    imageSlashPng,
  ];

  static ContentType? fromJson(dynamic value) => ContentTypeTypeTransformer().decode(value);

  static List<ContentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ContentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ContentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ContentType] to String,
/// and [decode] dynamic data back to [ContentType].
class ContentTypeTypeTransformer {
  factory ContentTypeTypeTransformer() => _instance ??= const ContentTypeTypeTransformer._();

  const ContentTypeTypeTransformer._();

  String encode(ContentType data) => data.value;

  /// Decodes a [dynamic value][data] to a ContentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ContentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image/jpeg': return ContentType.imageSlashJpeg;
        case r'image/png': return ContentType.imageSlashPng;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ContentTypeTypeTransformer] instance.
  static ContentTypeTypeTransformer? _instance;
}

