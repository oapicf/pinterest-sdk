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
class AdsAnalyticsFilterColumn {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsFilterColumn._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SPEND_IN_DOLLAR = AdsAnalyticsFilterColumn._(r'SPEND_IN_DOLLAR');
  static const TOTAL_IMPRESSION = AdsAnalyticsFilterColumn._(r'TOTAL_IMPRESSION');

  /// List of all possible values in this [enum][AdsAnalyticsFilterColumn].
  static const values = <AdsAnalyticsFilterColumn>[
    SPEND_IN_DOLLAR,
    TOTAL_IMPRESSION,
  ];

  static AdsAnalyticsFilterColumn? fromJson(dynamic value) => AdsAnalyticsFilterColumnTypeTransformer().decode(value);

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

  String encode(AdsAnalyticsFilterColumn data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsFilterColumn.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsFilterColumn? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [AdsAnalyticsFilterColumnTypeTransformer] instance.
  static AdsAnalyticsFilterColumnTypeTransformer? _instance;
}

