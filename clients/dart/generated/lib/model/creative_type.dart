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
class CreativeType {
  /// Instantiate a new enum with the provided [value].
  const CreativeType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const REGULAR = CreativeType._(r'REGULAR');
  static const VIDEO = CreativeType._(r'VIDEO');
  static const SHOPPING = CreativeType._(r'SHOPPING');
  static const CAROUSEL = CreativeType._(r'CAROUSEL');
  static const MAX_VIDEO = CreativeType._(r'MAX_VIDEO');
  static const SHOP_THE_PIN = CreativeType._(r'SHOP_THE_PIN');
  static const COLLECTION = CreativeType._(r'COLLECTION');
  static const IDEA = CreativeType._(r'IDEA');
  static const SHOWCASE = CreativeType._(r'SHOWCASE');
  static const QUIZ = CreativeType._(r'QUIZ');
  static const COLLAGE = CreativeType._(r'COLLAGE');
  static const MAX_WIDTH_REGULAR_COLLECTION = CreativeType._(r'MAX_WIDTH_REGULAR_COLLECTION');
  static const MAX_WIDTH_VIDEO_COLLECTION = CreativeType._(r'MAX_WIDTH_VIDEO_COLLECTION');

  /// List of all possible values in this [enum][CreativeType].
  static const values = <CreativeType>[
    REGULAR,
    VIDEO,
    SHOPPING,
    CAROUSEL,
    MAX_VIDEO,
    SHOP_THE_PIN,
    COLLECTION,
    IDEA,
    SHOWCASE,
    QUIZ,
    COLLAGE,
    MAX_WIDTH_REGULAR_COLLECTION,
    MAX_WIDTH_VIDEO_COLLECTION,
  ];

  static CreativeType? fromJson(dynamic value) => CreativeTypeTypeTransformer().decode(value);

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

  String encode(CreativeType data) => data.value;

  /// Decodes a [dynamic value][data] to a CreativeType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreativeType? decode(dynamic data, {bool allowNull = true}) {
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
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CreativeTypeTypeTransformer] instance.
  static CreativeTypeTypeTransformer? _instance;
}

