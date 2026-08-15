//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaWithImage {
  /// Returns a new [PinMediaWithImage] instance.
  PinMediaWithImage({
    this.images,
    required this.mediaType,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageSize? images;

  PinMediaWithImageMediaTypeEnum mediaType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaWithImage &&
    other.images == images &&
    other.mediaType == mediaType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (images == null ? 0 : images!.hashCode) +
    (mediaType.hashCode);

  @override
  String toString() => 'PinMediaWithImage[images=$images, mediaType=$mediaType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.images != null) {
      json[r'images'] = this.images;
    } else {
      json[r'images'] = null;
    }
      json[r'media_type'] = this.mediaType;
    return json;
  }

  /// Returns a new [PinMediaWithImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaWithImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaWithImage[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaWithImage[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaWithImage(
        images: ImageSize.fromJson(json[r'images']),
        mediaType: PinMediaWithImageMediaTypeEnum.fromJson(json[r'media_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaWithImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaWithImage> mapFromJson(dynamic json) {
    final map = <String, PinMediaWithImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaWithImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaWithImage-objects as value to a dart map
  static Map<String, List<PinMediaWithImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaWithImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaWithImage.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_type',
  };
}


class PinMediaWithImageMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaWithImageMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const image = PinMediaWithImageMediaTypeEnum._(r'image');

  /// List of all possible values in this [enum][PinMediaWithImageMediaTypeEnum].
  static const values = <PinMediaWithImageMediaTypeEnum>[
    image,
  ];

  static PinMediaWithImageMediaTypeEnum? fromJson(dynamic value) => PinMediaWithImageMediaTypeEnumTypeTransformer().decode(value);

  static List<PinMediaWithImageMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithImageMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithImageMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaWithImageMediaTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaWithImageMediaTypeEnum].
class PinMediaWithImageMediaTypeEnumTypeTransformer {
  factory PinMediaWithImageMediaTypeEnumTypeTransformer() => _instance ??= const PinMediaWithImageMediaTypeEnumTypeTransformer._();

  const PinMediaWithImageMediaTypeEnumTypeTransformer._();

  String encode(PinMediaWithImageMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaWithImageMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaWithImageMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'image': return PinMediaWithImageMediaTypeEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaWithImageMediaTypeEnumTypeTransformer] instance.
  static PinMediaWithImageMediaTypeEnumTypeTransformer? _instance;
}


