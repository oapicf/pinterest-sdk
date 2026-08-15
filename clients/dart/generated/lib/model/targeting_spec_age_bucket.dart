//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TargetingSpecAgeBucket {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecAgeBucket._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const n1824 = TargetingSpecAgeBucket._(r'18-24');
  static const n19plus = TargetingSpecAgeBucket._(r'19+');
  static const n20plus = TargetingSpecAgeBucket._(r'20+');
  static const n21plus = TargetingSpecAgeBucket._(r'21+');
  static const n2534 = TargetingSpecAgeBucket._(r'25-34');
  static const n3544 = TargetingSpecAgeBucket._(r'35-44');
  static const n4549 = TargetingSpecAgeBucket._(r'45-49');
  static const n5054 = TargetingSpecAgeBucket._(r'50-54');
  static const n5564 = TargetingSpecAgeBucket._(r'55-64');
  static const n65plus = TargetingSpecAgeBucket._(r'65+');

  /// List of all possible values in this [enum][TargetingSpecAgeBucket].
  static const values = <TargetingSpecAgeBucket>[
    n1824,
    n19plus,
    n20plus,
    n21plus,
    n2534,
    n3544,
    n4549,
    n5054,
    n5564,
    n65plus,
  ];

  static TargetingSpecAgeBucket? fromJson(dynamic value) => TargetingSpecAgeBucketTypeTransformer().decode(value);

  static List<TargetingSpecAgeBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecAgeBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecAgeBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecAgeBucket] to String,
/// and [decode] dynamic data back to [TargetingSpecAgeBucket].
class TargetingSpecAgeBucketTypeTransformer {
  factory TargetingSpecAgeBucketTypeTransformer() => _instance ??= const TargetingSpecAgeBucketTypeTransformer._();

  const TargetingSpecAgeBucketTypeTransformer._();

  String encode(TargetingSpecAgeBucket data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecAgeBucket.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecAgeBucket? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'18-24': return TargetingSpecAgeBucket.n1824;
        case r'19+': return TargetingSpecAgeBucket.n19plus;
        case r'20+': return TargetingSpecAgeBucket.n20plus;
        case r'21+': return TargetingSpecAgeBucket.n21plus;
        case r'25-34': return TargetingSpecAgeBucket.n2534;
        case r'35-44': return TargetingSpecAgeBucket.n3544;
        case r'45-49': return TargetingSpecAgeBucket.n4549;
        case r'50-54': return TargetingSpecAgeBucket.n5054;
        case r'55-64': return TargetingSpecAgeBucket.n5564;
        case r'65+': return TargetingSpecAgeBucket.n65plus;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecAgeBucketTypeTransformer] instance.
  static TargetingSpecAgeBucketTypeTransformer? _instance;
}

