//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Report granularity for time-based aggregation: - TOTAL: Metrics are aggregated over the specified date range - WEEK: Metrics are broken down weekly - MONTH: Metrics are broken down monthly
enum ConversionProductReportGranularity {
  TOTAL._(r'TOTAL'),
  WEEK._(r'WEEK'),
  MONTH._(r'MONTH'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionProductReportGranularity._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionProductReportGranularity] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionProductReportGranularity? fromJson(dynamic value) => ConversionProductReportGranularityTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionProductReportGranularity]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionProductReportGranularity> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionProductReportGranularity>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionProductReportGranularity.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionProductReportGranularity] to String,
/// and [decode] dynamic data back to [ConversionProductReportGranularity].
class ConversionProductReportGranularityTypeTransformer {
  factory ConversionProductReportGranularityTypeTransformer() => _instance ??= const ConversionProductReportGranularityTypeTransformer._();

  const ConversionProductReportGranularityTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionProductReportGranularity data) => data._value;

  /// Returns the instance of [ConversionProductReportGranularity] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionProductReportGranularity? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionProductReportGranularity) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TOTAL': return ConversionProductReportGranularity.TOTAL;
        case r'WEEK': return ConversionProductReportGranularity.WEEK;
        case r'MONTH': return ConversionProductReportGranularity.MONTH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionProductReportGranularityTypeTransformer? _instance;
}

