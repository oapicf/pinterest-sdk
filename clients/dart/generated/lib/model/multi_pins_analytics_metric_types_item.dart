//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Pin metric type for multi-pin analytics
enum MultiPinsAnalyticsMetricTypesItem {
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  PIN_CLICK._(r'PIN_CLICK'),
  SAVE._(r'SAVE'),
  SAVE_RATE._(r'SAVE_RATE'),
  TOTAL_COMMENTS._(r'TOTAL_COMMENTS'),
  TOTAL_REACTIONS._(r'TOTAL_REACTIONS'),
  USER_FOLLOW._(r'USER_FOLLOW'),
  PROFILE_VISIT._(r'PROFILE_VISIT'),
  VIDEO_MRC_VIEW._(r'VIDEO_MRC_VIEW'),
  VIDEO_10S_VIEW._(r'VIDEO_10S_VIEW'),
  QUARTILE_95_PERCENT_VIEW._(r'QUARTILE_95_PERCENT_VIEW'),
  VIDEO_V50_WATCH_TIME._(r'VIDEO_V50_WATCH_TIME'),
  VIDEO_START._(r'VIDEO_START'),
  VIDEO_AVG_WATCH_TIME._(r'VIDEO_AVG_WATCH_TIME'),
  ;

  /// Instantiate a new enum with the provided value.
  const MultiPinsAnalyticsMetricTypesItem._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MultiPinsAnalyticsMetricTypesItem] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MultiPinsAnalyticsMetricTypesItem? fromJson(dynamic value) => MultiPinsAnalyticsMetricTypesItemTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MultiPinsAnalyticsMetricTypesItem]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MultiPinsAnalyticsMetricTypesItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MultiPinsAnalyticsMetricTypesItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MultiPinsAnalyticsMetricTypesItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MultiPinsAnalyticsMetricTypesItem] to String,
/// and [decode] dynamic data back to [MultiPinsAnalyticsMetricTypesItem].
class MultiPinsAnalyticsMetricTypesItemTypeTransformer {
  factory MultiPinsAnalyticsMetricTypesItemTypeTransformer() => _instance ??= const MultiPinsAnalyticsMetricTypesItemTypeTransformer._();

  const MultiPinsAnalyticsMetricTypesItemTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MultiPinsAnalyticsMetricTypesItem data) => data._value;

  /// Returns the instance of [MultiPinsAnalyticsMetricTypesItem] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MultiPinsAnalyticsMetricTypesItem? decode(dynamic data, {bool allowNull = true}) {
    if (data is MultiPinsAnalyticsMetricTypesItem) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return MultiPinsAnalyticsMetricTypesItem.IMPRESSION;
        case r'OUTBOUND_CLICK': return MultiPinsAnalyticsMetricTypesItem.OUTBOUND_CLICK;
        case r'PIN_CLICK': return MultiPinsAnalyticsMetricTypesItem.PIN_CLICK;
        case r'SAVE': return MultiPinsAnalyticsMetricTypesItem.SAVE;
        case r'SAVE_RATE': return MultiPinsAnalyticsMetricTypesItem.SAVE_RATE;
        case r'TOTAL_COMMENTS': return MultiPinsAnalyticsMetricTypesItem.TOTAL_COMMENTS;
        case r'TOTAL_REACTIONS': return MultiPinsAnalyticsMetricTypesItem.TOTAL_REACTIONS;
        case r'USER_FOLLOW': return MultiPinsAnalyticsMetricTypesItem.USER_FOLLOW;
        case r'PROFILE_VISIT': return MultiPinsAnalyticsMetricTypesItem.PROFILE_VISIT;
        case r'VIDEO_MRC_VIEW': return MultiPinsAnalyticsMetricTypesItem.VIDEO_MRC_VIEW;
        case r'VIDEO_10S_VIEW': return MultiPinsAnalyticsMetricTypesItem.VIDEO_10S_VIEW;
        case r'QUARTILE_95_PERCENT_VIEW': return MultiPinsAnalyticsMetricTypesItem.QUARTILE_95_PERCENT_VIEW;
        case r'VIDEO_V50_WATCH_TIME': return MultiPinsAnalyticsMetricTypesItem.VIDEO_V50_WATCH_TIME;
        case r'VIDEO_START': return MultiPinsAnalyticsMetricTypesItem.VIDEO_START;
        case r'VIDEO_AVG_WATCH_TIME': return MultiPinsAnalyticsMetricTypesItem.VIDEO_AVG_WATCH_TIME;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MultiPinsAnalyticsMetricTypesItemTypeTransformer? _instance;
}

