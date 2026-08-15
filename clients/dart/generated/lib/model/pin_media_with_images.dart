//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinMediaWithImages {
  /// Returns a new [PinMediaWithImages] instance.
  PinMediaWithImages({
    this.items = const [],
    required this.mediaType,
  });

  List<ImageMetadata> items;

  PinMediaWithImagesMediaTypeEnum mediaType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinMediaWithImages &&
    _deepEquality.equals(other.items, items) &&
    other.mediaType == mediaType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode) +
    (mediaType.hashCode);

  @override
  String toString() => 'PinMediaWithImages[items=$items, mediaType=$mediaType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
      json[r'media_type'] = this.mediaType;
    return json;
  }

  /// Returns a new [PinMediaWithImages] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinMediaWithImages? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "PinMediaWithImages[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "PinMediaWithImages[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return PinMediaWithImages(
        items: ImageMetadata.listFromJson(json[r'items']),
        mediaType: PinMediaWithImagesMediaTypeEnum.fromJson(json[r'media_type'])!,
      );
    }
    return null;
  }

  static List<PinMediaWithImages> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithImages>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithImages.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinMediaWithImages> mapFromJson(dynamic json) {
    final map = <String, PinMediaWithImages>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinMediaWithImages.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinMediaWithImages-objects as value to a dart map
  static Map<String, List<PinMediaWithImages>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinMediaWithImages>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinMediaWithImages.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'media_type',
  };
}


class PinMediaWithImagesMediaTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const PinMediaWithImagesMediaTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const multipleImages = PinMediaWithImagesMediaTypeEnum._(r'multiple_images');

  /// List of all possible values in this [enum][PinMediaWithImagesMediaTypeEnum].
  static const values = <PinMediaWithImagesMediaTypeEnum>[
    multipleImages,
  ];

  static PinMediaWithImagesMediaTypeEnum? fromJson(dynamic value) => PinMediaWithImagesMediaTypeEnumTypeTransformer().decode(value);

  static List<PinMediaWithImagesMediaTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinMediaWithImagesMediaTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinMediaWithImagesMediaTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinMediaWithImagesMediaTypeEnum] to String,
/// and [decode] dynamic data back to [PinMediaWithImagesMediaTypeEnum].
class PinMediaWithImagesMediaTypeEnumTypeTransformer {
  factory PinMediaWithImagesMediaTypeEnumTypeTransformer() => _instance ??= const PinMediaWithImagesMediaTypeEnumTypeTransformer._();

  const PinMediaWithImagesMediaTypeEnumTypeTransformer._();

  String encode(PinMediaWithImagesMediaTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a PinMediaWithImagesMediaTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinMediaWithImagesMediaTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'multiple_images': return PinMediaWithImagesMediaTypeEnum.multipleImages;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PinMediaWithImagesMediaTypeEnumTypeTransformer] instance.
  static PinMediaWithImagesMediaTypeEnumTypeTransformer? _instance;
}


