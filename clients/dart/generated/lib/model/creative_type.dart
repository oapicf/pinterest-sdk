//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Ad creative type enum. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
enum CreativeType {
  REGULAR._(r'REGULAR'),
  VIDEO._(r'VIDEO'),
  SHOPPING._(r'SHOPPING'),
  CAROUSEL._(r'CAROUSEL'),
  MAX_VIDEO._(r'MAX_VIDEO'),
  SHOP_THE_PIN._(r'SHOP_THE_PIN'),
  COLLECTION._(r'COLLECTION'),
  IDEA._(r'IDEA'),
  SHOWCASE._(r'SHOWCASE'),
  QUIZ._(r'QUIZ'),
  COLLAGE._(r'COLLAGE'),
  MAX_WIDTH_REGULAR_COLLECTION._(r'MAX_WIDTH_REGULAR_COLLECTION'),
  MAX_WIDTH_VIDEO_COLLECTION._(r'MAX_WIDTH_VIDEO_COLLECTION'),
  APP._(r'APP'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreativeType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreativeType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreativeType? fromJson(dynamic value) => CreativeTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreativeType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreativeType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreativeType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreativeType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreativeType] to String,
/// and [decode] dynamic data back to [CreativeType].
class CreativeTypeTypeTransformer {
  factory CreativeTypeTypeTransformer() => _instance ??= const CreativeTypeTypeTransformer._();

  const CreativeTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CreativeType data) => data._value;

  /// Returns the instance of [CreativeType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreativeType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreativeType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'REGULAR': return CreativeType.REGULAR;
        case r'VIDEO': return CreativeType.VIDEO;
        case r'SHOPPING': return CreativeType.SHOPPING;
        case r'CAROUSEL': return CreativeType.CAROUSEL;
        case r'MAX_VIDEO': return CreativeType.MAX_VIDEO;
        case r'SHOP_THE_PIN': return CreativeType.SHOP_THE_PIN;
        case r'COLLECTION': return CreativeType.COLLECTION;
        case r'IDEA': return CreativeType.IDEA;
        case r'SHOWCASE': return CreativeType.SHOWCASE;
        case r'QUIZ': return CreativeType.QUIZ;
        case r'COLLAGE': return CreativeType.COLLAGE;
        case r'MAX_WIDTH_REGULAR_COLLECTION': return CreativeType.MAX_WIDTH_REGULAR_COLLECTION;
        case r'MAX_WIDTH_VIDEO_COLLECTION': return CreativeType.MAX_WIDTH_VIDEO_COLLECTION;
        case r'APP': return CreativeType.APP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreativeTypeTypeTransformer? _instance;
}

