//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Metrics availablity, e.g., \"READY\".
enum DataStatus {
  PROCESSING._(r'PROCESSING'),
  READY._(r'READY'),
  ESTIMATE._(r'ESTIMATE'),
  BEFORE_BUSINESS_CREATED._(r'BEFORE_BUSINESS_CREATED'),
  BEFORE_DATA_RETENTION_PERIOD._(r'BEFORE_DATA_RETENTION_PERIOD'),
  BEFORE_PIN_DATA_RETENTION_PERIOD._(r'BEFORE_PIN_DATA_RETENTION_PERIOD'),
  BEFORE_METRIC_START_DATE._(r'BEFORE_METRIC_START_DATE'),
  BEFORE_CORE_METRIC_START_DATE._(r'BEFORE_CORE_METRIC_START_DATE'),
  BEFORE_PIN_FORMAT_METRIC_START_DATE._(r'BEFORE_PIN_FORMAT_METRIC_START_DATE'),
  BEFORE_AUDIENCE_METRIC_START_DATE._(r'BEFORE_AUDIENCE_METRIC_START_DATE'),
  BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE._(r'BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE'),
  BEFORE_VIDEO_METRIC_START_DATE._(r'BEFORE_VIDEO_METRIC_START_DATE'),
  BEFORE_CONVERSION_METRIC_START_DATE._(r'BEFORE_CONVERSION_METRIC_START_DATE'),
  PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD._(r'PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD'),
  IN_BAD_TAG_DATE._(r'IN_BAD_TAG_DATE'),
  BEFORE_PUBLISHED_METRIC_START_DATE._(r'BEFORE_PUBLISHED_METRIC_START_DATE'),
  BEFORE_ASSIST_METRIC_START_DATE._(r'BEFORE_ASSIST_METRIC_START_DATE'),
  BEFORE_PIN_CREATED._(r'BEFORE_PIN_CREATED'),
  BEFORE_ACCOUNT_CLAIMED._(r'BEFORE_ACCOUNT_CLAIMED'),
  BEFORE_DEMOGRAPHIC_FILTERS_START_DATE._(r'BEFORE_DEMOGRAPHIC_FILTERS_START_DATE'),
  AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD._(r'AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD'),
  AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD._(r'AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD'),
  BEFORE_PRODUCT_GROUP_FILTER_START_DATE._(r'BEFORE_PRODUCT_GROUP_FILTER_START_DATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const DataStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [DataStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static DataStatus? fromJson(dynamic value) => DataStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [DataStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<DataStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DataStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DataStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DataStatus] to String,
/// and [decode] dynamic data back to [DataStatus].
class DataStatusTypeTransformer {
  factory DataStatusTypeTransformer() => _instance ??= const DataStatusTypeTransformer._();

  const DataStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(DataStatus data) => data._value;

  /// Returns the instance of [DataStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DataStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is DataStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PROCESSING': return DataStatus.PROCESSING;
        case r'READY': return DataStatus.READY;
        case r'ESTIMATE': return DataStatus.ESTIMATE;
        case r'BEFORE_BUSINESS_CREATED': return DataStatus.BEFORE_BUSINESS_CREATED;
        case r'BEFORE_DATA_RETENTION_PERIOD': return DataStatus.BEFORE_DATA_RETENTION_PERIOD;
        case r'BEFORE_PIN_DATA_RETENTION_PERIOD': return DataStatus.BEFORE_PIN_DATA_RETENTION_PERIOD;
        case r'BEFORE_METRIC_START_DATE': return DataStatus.BEFORE_METRIC_START_DATE;
        case r'BEFORE_CORE_METRIC_START_DATE': return DataStatus.BEFORE_CORE_METRIC_START_DATE;
        case r'BEFORE_PIN_FORMAT_METRIC_START_DATE': return DataStatus.BEFORE_PIN_FORMAT_METRIC_START_DATE;
        case r'BEFORE_AUDIENCE_METRIC_START_DATE': return DataStatus.BEFORE_AUDIENCE_METRIC_START_DATE;
        case r'BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE': return DataStatus.BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE;
        case r'BEFORE_VIDEO_METRIC_START_DATE': return DataStatus.BEFORE_VIDEO_METRIC_START_DATE;
        case r'BEFORE_CONVERSION_METRIC_START_DATE': return DataStatus.BEFORE_CONVERSION_METRIC_START_DATE;
        case r'PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD': return DataStatus.PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD;
        case r'IN_BAD_TAG_DATE': return DataStatus.IN_BAD_TAG_DATE;
        case r'BEFORE_PUBLISHED_METRIC_START_DATE': return DataStatus.BEFORE_PUBLISHED_METRIC_START_DATE;
        case r'BEFORE_ASSIST_METRIC_START_DATE': return DataStatus.BEFORE_ASSIST_METRIC_START_DATE;
        case r'BEFORE_PIN_CREATED': return DataStatus.BEFORE_PIN_CREATED;
        case r'BEFORE_ACCOUNT_CLAIMED': return DataStatus.BEFORE_ACCOUNT_CLAIMED;
        case r'BEFORE_DEMOGRAPHIC_FILTERS_START_DATE': return DataStatus.BEFORE_DEMOGRAPHIC_FILTERS_START_DATE;
        case r'AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD': return DataStatus.AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD;
        case r'AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD': return DataStatus.AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD;
        case r'BEFORE_PRODUCT_GROUP_FILTER_START_DATE': return DataStatus.BEFORE_PRODUCT_GROUP_FILTER_START_DATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static DataStatusTypeTransformer? _instance;
}

