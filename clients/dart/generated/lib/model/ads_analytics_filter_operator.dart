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
class AdsAnalyticsFilterOperator {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsFilterOperator._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const LESS_THAN = AdsAnalyticsFilterOperator._(r'LESS_THAN');
  static const GREATER_THAN = AdsAnalyticsFilterOperator._(r'GREATER_THAN');

  /// List of all possible values in this [enum][AdsAnalyticsFilterOperator].
  static const values = <AdsAnalyticsFilterOperator>[
    LESS_THAN,
    GREATER_THAN,
  ];

  static AdsAnalyticsFilterOperator? fromJson(dynamic value) => AdsAnalyticsFilterOperatorTypeTransformer().decode(value);

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

  String encode(AdsAnalyticsFilterOperator data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsFilterOperator.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsFilterOperator? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [AdsAnalyticsFilterOperatorTypeTransformer] instance.
  static AdsAnalyticsFilterOperatorTypeTransformer? _instance;
}

