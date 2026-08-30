//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting columns for sync reporting data filter
enum AdsAnalyticsFilterColumn {
  SPEND_IN_DOLLAR._(r'SPEND_IN_DOLLAR'),
  TOTAL_IMPRESSION._(r'TOTAL_IMPRESSION'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsAnalyticsFilterColumn._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsAnalyticsFilterColumn] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsAnalyticsFilterColumn? fromJson(dynamic value) => AdsAnalyticsFilterColumnTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsAnalyticsFilterColumn]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdsAnalyticsFilterColumn> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsFilterColumn>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsFilterColumn.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsFilterColumn] to String,
/// and [decode] dynamic data back to [AdsAnalyticsFilterColumn].
class AdsAnalyticsFilterColumnTypeTransformer {
  factory AdsAnalyticsFilterColumnTypeTransformer() => _instance ??= const AdsAnalyticsFilterColumnTypeTransformer._();

  const AdsAnalyticsFilterColumnTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsAnalyticsFilterColumn data) => data._value;

  /// Returns the instance of [AdsAnalyticsFilterColumn] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsFilterColumn? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsAnalyticsFilterColumn) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SPEND_IN_DOLLAR': return AdsAnalyticsFilterColumn.SPEND_IN_DOLLAR;
        case r'TOTAL_IMPRESSION': return AdsAnalyticsFilterColumn.TOTAL_IMPRESSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdsAnalyticsFilterColumnTypeTransformer? _instance;
}

