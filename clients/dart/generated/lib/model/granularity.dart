//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specifies the time interval at which analytics data is broken down. Determines how metrics are grouped within the requested date range. **Note:** The `HOUR` enum no longer provides data for conversion metrics, but it still returns data for non-conversion metrics. All other enums are unchanged.
enum Granularity {
  TOTAL._(r'TOTAL'),
  DAY._(r'DAY'),
  HOUR._(r'HOUR'),
  WEEK._(r'WEEK'),
  MONTH._(r'MONTH'),
  ;

  /// Instantiate a new enum with the provided value.
  const Granularity._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [Granularity] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static Granularity? fromJson(dynamic value) => GranularityTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [Granularity]
  /// that were successfully decoded from the passed [JSON][json].
  static List<Granularity> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Granularity>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Granularity.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Granularity] to String,
/// and [decode] dynamic data back to [Granularity].
class GranularityTypeTransformer {
  factory GranularityTypeTransformer() => _instance ??= const GranularityTypeTransformer._();

  const GranularityTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(Granularity data) => data._value;

  /// Returns the instance of [Granularity] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Granularity? decode(dynamic data, {bool allowNull = true}) {
    if (data is Granularity) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TOTAL': return Granularity.TOTAL;
        case r'DAY': return Granularity.DAY;
        case r'HOUR': return Granularity.HOUR;
        case r'WEEK': return Granularity.WEEK;
        case r'MONTH': return Granularity.MONTH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static GranularityTypeTransformer? _instance;
}

