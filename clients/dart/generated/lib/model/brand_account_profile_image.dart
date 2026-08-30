//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BrandAccountProfileImage {
  /// Returns a new [BrandAccountProfileImage] instance.
  BrandAccountProfileImage({
    required this.contentType,
    required this.data,
  });

  BrandAccountProfileImageContentTypeEnum contentType;

  String data;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BrandAccountProfileImage &&
    other.contentType == contentType &&
    other.data == data;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (contentType.hashCode) +
    (data.hashCode);

  @override
  String toString() => 'BrandAccountProfileImage[contentType=$contentType, data=$data]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'content_type'] = this.contentType;
      json[r'data'] = this.data;
    return json;
  }

  /// Returns a new [BrandAccountProfileImage] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BrandAccountProfileImage? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'content_type'), 'Required key "BrandAccountProfileImage[content_type]" is missing from JSON.');
        assert(json[r'content_type'] != null, 'Required key "BrandAccountProfileImage[content_type]" has a null value in JSON.');
        assert(json.containsKey(r'data'), 'Required key "BrandAccountProfileImage[data]" is missing from JSON.');
        assert(json[r'data'] != null, 'Required key "BrandAccountProfileImage[data]" has a null value in JSON.');
        return true;
      }());

      return BrandAccountProfileImage(
        contentType: BrandAccountProfileImageContentTypeEnum.fromJson(json[r'content_type'])!,
        data: mapValueOfType<String>(json, r'data')!,
      );
    }
    return null;
  }

  static List<BrandAccountProfileImage> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandAccountProfileImage>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandAccountProfileImage.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BrandAccountProfileImage> mapFromJson(dynamic json) {
    final map = <String, BrandAccountProfileImage>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BrandAccountProfileImage.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BrandAccountProfileImage-objects as value to a dart map
  static Map<String, List<BrandAccountProfileImage>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BrandAccountProfileImage>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BrandAccountProfileImage.listFromJson(entry.value, growable: growable,);
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


enum BrandAccountProfileImageContentTypeEnum {
  imageSlashJpeg._(r'image/jpeg'),
  imageSlashPng._(r'image/png'),
  ;

  /// Instantiate a new enum with the provided value.
  const BrandAccountProfileImageContentTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BrandAccountProfileImageContentTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BrandAccountProfileImageContentTypeEnum? fromJson(dynamic value) => BrandAccountProfileImageContentTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BrandAccountProfileImageContentTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BrandAccountProfileImageContentTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BrandAccountProfileImageContentTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BrandAccountProfileImageContentTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BrandAccountProfileImageContentTypeEnum] to String,
/// and [decode] dynamic data back to [BrandAccountProfileImageContentTypeEnum].
class BrandAccountProfileImageContentTypeEnumTypeTransformer {
  factory BrandAccountProfileImageContentTypeEnumTypeTransformer() => _instance ??= const BrandAccountProfileImageContentTypeEnumTypeTransformer._();

  const BrandAccountProfileImageContentTypeEnumTypeTransformer._();

  String encode(BrandAccountProfileImageContentTypeEnum data) => data._value;

  /// Returns the instance of [BrandAccountProfileImageContentTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BrandAccountProfileImageContentTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is BrandAccountProfileImageContentTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'image/jpeg': return BrandAccountProfileImageContentTypeEnum.imageSlashJpeg;
        case r'image/png': return BrandAccountProfileImageContentTypeEnum.imageSlashPng;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BrandAccountProfileImageContentTypeEnumTypeTransformer? _instance;
}


