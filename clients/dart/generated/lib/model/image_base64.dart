//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ImageBase64 {
  /// Returns a new [ImageBase64] instance.
  ImageBase64({
    required this.contentType,
    required this.data,
  });

  ImageBase64ContentTypeEnum contentType;

  String data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ImageBase64 &&
    other.contentType == contentType &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'ImageBase64[contentType=$contentType, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content_type'] = this.contentType;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [ImageBase64] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ImageBase64? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ImageBase64[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ImageBase64[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ImageBase64(
        contentType: ImageBase64ContentTypeEnum.fromJson(json[r'content_type'])!,
        data: mapValueOfType<String>(json, r'data')!,
      );
    }
    return null;
  }

  static List<ImageBase64> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageBase64>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageBase64.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ImageBase64> mapFromJson(dynamic json) {
    final map = <String, ImageBase64>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ImageBase64.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ImageBase64-objects as value to a dart map
  static Map<String, List<ImageBase64>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ImageBase64>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ImageBase64.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'content_type',
    'data',
  };
}


class ImageBase64ContentTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ImageBase64ContentTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const imageSlashJpeg = ImageBase64ContentTypeEnum._(r'image/jpeg');
  static const imageSlashPng = ImageBase64ContentTypeEnum._(r'image/png');

  /// List of all possible values in this [enum][ImageBase64ContentTypeEnum].
  static const values = <ImageBase64ContentTypeEnum>[
    imageSlashJpeg,
    imageSlashPng,
  ];

  static ImageBase64ContentTypeEnum? fromJson(dynamic value) => ImageBase64ContentTypeEnumTypeTransformer().decode(value);

  static List<ImageBase64ContentTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageBase64ContentTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageBase64ContentTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ImageBase64ContentTypeEnum] to String,
/// and [decode] dynamic data back to [ImageBase64ContentTypeEnum].
class ImageBase64ContentTypeEnumTypeTransformer {
  factory ImageBase64ContentTypeEnumTypeTransformer() => _instance ??= const ImageBase64ContentTypeEnumTypeTransformer._();

  const ImageBase64ContentTypeEnumTypeTransformer._();

  String encode(ImageBase64ContentTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ImageBase64ContentTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ImageBase64ContentTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image/jpeg': return ImageBase64ContentTypeEnum.imageSlashJpeg;
        case r'image/png': return ImageBase64ContentTypeEnum.imageSlashPng;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ImageBase64ContentTypeEnumTypeTransformer] instance.
  static ImageBase64ContentTypeEnumTypeTransformer? _instance;
}


