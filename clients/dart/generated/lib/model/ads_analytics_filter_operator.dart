//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Filter operator for sync reporting
enum AdsAnalyticsFilterOperator {
  LESS_THAN._(r'LESS_THAN'),
  GREATER_THAN._(r'GREATER_THAN'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsAnalyticsFilterOperator._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsAnalyticsFilterOperator] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsAnalyticsFilterOperator? fromJson(dynamic value) => AdsAnalyticsFilterOperatorTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsAnalyticsFilterOperator]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdsAnalyticsFilterOperator> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsFilterOperator>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsFilterOperator.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsFilterOperator] to String,
/// and [decode] dynamic data back to [AdsAnalyticsFilterOperator].
class AdsAnalyticsFilterOperatorTypeTransformer {
  factory AdsAnalyticsFilterOperatorTypeTransformer() => _instance ??= const AdsAnalyticsFilterOperatorTypeTransformer._();

  const AdsAnalyticsFilterOperatorTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsAnalyticsFilterOperator data) => data._value;

  /// Returns the instance of [AdsAnalyticsFilterOperator] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsFilterOperator? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsAnalyticsFilterOperator) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'LESS_THAN': return AdsAnalyticsFilterOperator.LESS_THAN;
        case r'GREATER_THAN': return AdsAnalyticsFilterOperator.GREATER_THAN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdsAnalyticsFilterOperatorTypeTransformer? _instance;
}

