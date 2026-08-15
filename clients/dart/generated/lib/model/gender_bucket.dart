//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class GenderBucket {
  /// Instantiate a new enum with the provided [value].
  const GenderBucket._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MALE = GenderBucket._(r'MALE');
  static const FEMALE = GenderBucket._(r'FEMALE');
  static const UNSPECIFIED = GenderBucket._(r'UNSPECIFIED');

  /// List of all possible values in this [enum][GenderBucket].
  static const values = <GenderBucket>[
    MALE,
    FEMALE,
    UNSPECIFIED,
  ];

  static GenderBucket? fromJson(dynamic value) => GenderBucketTypeTransformer().decode(value);

  static List<GenderBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GenderBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GenderBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GenderBucket] to String,
/// and [decode] dynamic data back to [GenderBucket].
class GenderBucketTypeTransformer {
  factory GenderBucketTypeTransformer() => _instance ??= const GenderBucketTypeTransformer._();

  const GenderBucketTypeTransformer._();

  String encode(GenderBucket data) => data.value;

  /// Decodes a [dynamic value][data] to a GenderBucket.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GenderBucket? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'MALE': return GenderBucket.MALE;
        case r'FEMALE': return GenderBucket.FEMALE;
        case r'UNSPECIFIED': return GenderBucket.UNSPECIFIED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [GenderBucketTypeTransformer] instance.
  static GenderBucketTypeTransformer? _instance;
}

