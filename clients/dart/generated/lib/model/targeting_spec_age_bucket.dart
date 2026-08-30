//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum TargetingSpecAgeBucket {
  n1824._(r'18-24'),
  n19plus._(r'19+'),
  n20plus._(r'20+'),
  n21plus._(r'21+'),
  n2534._(r'25-34'),
  n3544._(r'35-44'),
  n4549._(r'45-49'),
  n5054._(r'50-54'),
  n5564._(r'55-64'),
  n65plus._(r'65+'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecAgeBucket._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecAgeBucket] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecAgeBucket? fromJson(dynamic value) => TargetingSpecAgeBucketTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecAgeBucket]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(TargetingSpecAgeBucket data) => data._value;

  /// Returns the instance of [TargetingSpecAgeBucket] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecAgeBucket? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecAgeBucket) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static TargetingSpecAgeBucketTypeTransformer? _instance;
}

