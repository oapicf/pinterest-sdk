//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ImageMetadata {
  /// Returns a new [ImageMetadata] instance.
  ImageMetadata({
    this.description,
    this.images,
    required this.itemType,
    this.link,
    this.title,
  });

  String? description;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ImageSize? images;

  /// Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
  ImageMetadataItemTypeEnum itemType;

  String? link;

  String? title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ImageMetadata &&
    other.description == description &&
    other.images == images &&
    other.itemType == itemType &&
    other.link == link &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description == null ? 0 : description!.hashCode) +
    (images == null ? 0 : images!.hashCode) +
    (itemType.hashCode) +
    (link == null ? 0 : link!.hashCode) +
    (title == null ? 0 : title!.hashCode);

  @override
  String toString() => 'ImageMetadata[description=$description, images=$images, itemType=$itemType, link=$link, title=$title]';

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
    return json;
  }

  /// Returns a new [ImageMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ImageMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'item_type'), 'Required key "ImageMetadata[item_type]" is missing from JSON.');
        assert(json[r'item_type'] != null, 'Required key "ImageMetadata[item_type]" has a null value in JSON.');
        return true;
      }());

      return ImageMetadata(
        description: mapValueOfType<String>(json, r'description'),
        images: ImageSize.fromJson(json[r'images']),
        itemType: ImageMetadataItemTypeEnum.fromJson(json[r'item_type'])!,
        link: mapValueOfType<String>(json, r'link'),
        title: mapValueOfType<String>(json, r'title'),
      );
    }
    return null;
  }

  static List<ImageMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ImageMetadata> mapFromJson(dynamic json) {
    final map = <String, ImageMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ImageMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ImageMetadata-objects as value to a dart map
  static Map<String, List<ImageMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ImageMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ImageMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'item_type',
  };
}

/// Discriminator literal identifying this as image metadata inside a `PinMediaMetadata` payload.
enum ImageMetadataItemTypeEnum {
  image._(r'image'),
  ;

  /// Instantiate a new enum with the provided value.
  const ImageMetadataItemTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ImageMetadataItemTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ImageMetadataItemTypeEnum? fromJson(dynamic value) => ImageMetadataItemTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ImageMetadataItemTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ImageMetadataItemTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ImageMetadataItemTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ImageMetadataItemTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ImageMetadataItemTypeEnum] to String,
/// and [decode] dynamic data back to [ImageMetadataItemTypeEnum].
class ImageMetadataItemTypeEnumTypeTransformer {
  factory ImageMetadataItemTypeEnumTypeTransformer() => _instance ??= const ImageMetadataItemTypeEnumTypeTransformer._();

  const ImageMetadataItemTypeEnumTypeTransformer._();

  String encode(ImageMetadataItemTypeEnum data) => data._value;

  /// Returns the instance of [ImageMetadataItemTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ImageMetadataItemTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is ImageMetadataItemTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'image': return ImageMetadataItemTypeEnum.image;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ImageMetadataItemTypeEnumTypeTransformer? _instance;
}


