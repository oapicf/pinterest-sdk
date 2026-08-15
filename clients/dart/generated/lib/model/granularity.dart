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
class Granularity {
  /// Instantiate a new enum with the provided [value].
  const Granularity._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TOTAL = Granularity._(r'TOTAL');
  static const DAY = Granularity._(r'DAY');
  static const HOUR = Granularity._(r'HOUR');
  static const WEEK = Granularity._(r'WEEK');
  static const MONTH = Granularity._(r'MONTH');

  /// List of all possible values in this [enum][Granularity].
  static const values = <Granularity>[
    TOTAL,
    DAY,
    HOUR,
    WEEK,
    MONTH,
  ];

  static Granularity? fromJson(dynamic value) => GranularityTypeTransformer().decode(value);

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

  String encode(Granularity data) => data.value;

  /// Decodes a [dynamic value][data] to a Granularity.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Granularity? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [GranularityTypeTransformer] instance.
  static GranularityTypeTransformer? _instance;
}

