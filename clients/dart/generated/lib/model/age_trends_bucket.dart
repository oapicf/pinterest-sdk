//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AgeTrendsBucket {
  n1824._(r'18-24'),
  n2534._(r'25-34'),
  n3544._(r'35-44'),
  n4549._(r'45-49'),
  n5054._(r'50-54'),
  n5564._(r'55-64'),
  n65plus._(r'65+'),
  ;

  /// Instantiate a new enum with the provided value.
  const AgeTrendsBucket._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AgeTrendsBucket] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AgeTrendsBucket? fromJson(dynamic value) => AgeTrendsBucketTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AgeTrendsBucket]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AgeTrendsBucket> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AgeTrendsBucket>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AgeTrendsBucket.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AgeTrendsBucket] to String,
/// and [decode] dynamic data back to [AgeTrendsBucket].
class AgeTrendsBucketTypeTransformer {
  factory AgeTrendsBucketTypeTransformer() => _instance ??= const AgeTrendsBucketTypeTransformer._();

  const AgeTrendsBucketTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AgeTrendsBucket data) => data._value;

  /// Returns the instance of [AgeTrendsBucket] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AgeTrendsBucket? decode(dynamic data, {bool allowNull = true}) {
    if (data is AgeTrendsBucket) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'18-24': return AgeTrendsBucket.n1824;
        case r'25-34': return AgeTrendsBucket.n2534;
        case r'35-44': return AgeTrendsBucket.n3544;
        case r'45-49': return AgeTrendsBucket.n4549;
        case r'50-54': return AgeTrendsBucket.n5054;
        case r'55-64': return AgeTrendsBucket.n5564;
        case r'65+': return AgeTrendsBucket.n65plus;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AgeTrendsBucketTypeTransformer? _instance;
}

