//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum QuerypinanalyticsmetrictypesItems {
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
  const QuerypinanalyticsmetrictypesItems._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [QuerypinanalyticsmetrictypesItems] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static QuerypinanalyticsmetrictypesItems? fromJson(dynamic value) => QuerypinanalyticsmetrictypesItemsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [QuerypinanalyticsmetrictypesItems]
  /// that were successfully decoded from the passed [JSON][json].
  static List<QuerypinanalyticsmetrictypesItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuerypinanalyticsmetrictypesItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuerypinanalyticsmetrictypesItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [QuerypinanalyticsmetrictypesItems] to String,
/// and [decode] dynamic data back to [QuerypinanalyticsmetrictypesItems].
class QuerypinanalyticsmetrictypesItemsTypeTransformer {
  factory QuerypinanalyticsmetrictypesItemsTypeTransformer() => _instance ??= const QuerypinanalyticsmetrictypesItemsTypeTransformer._();

  const QuerypinanalyticsmetrictypesItemsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(QuerypinanalyticsmetrictypesItems data) => data._value;

  /// Returns the instance of [QuerypinanalyticsmetrictypesItems] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  QuerypinanalyticsmetrictypesItems? decode(dynamic data, {bool allowNull = true}) {
    if (data is QuerypinanalyticsmetrictypesItems) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return QuerypinanalyticsmetrictypesItems.IMPRESSION;
        case r'OUTBOUND_CLICK': return QuerypinanalyticsmetrictypesItems.OUTBOUND_CLICK;
        case r'PIN_CLICK': return QuerypinanalyticsmetrictypesItems.PIN_CLICK;
        case r'SAVE': return QuerypinanalyticsmetrictypesItems.SAVE;
        case r'SAVE_RATE': return QuerypinanalyticsmetrictypesItems.SAVE_RATE;
        case r'TOTAL_COMMENTS': return QuerypinanalyticsmetrictypesItems.TOTAL_COMMENTS;
        case r'TOTAL_REACTIONS': return QuerypinanalyticsmetrictypesItems.TOTAL_REACTIONS;
        case r'USER_FOLLOW': return QuerypinanalyticsmetrictypesItems.USER_FOLLOW;
        case r'PROFILE_VISIT': return QuerypinanalyticsmetrictypesItems.PROFILE_VISIT;
        case r'VIDEO_MRC_VIEW': return QuerypinanalyticsmetrictypesItems.VIDEO_MRC_VIEW;
        case r'VIDEO_10S_VIEW': return QuerypinanalyticsmetrictypesItems.VIDEO_10S_VIEW;
        case r'QUARTILE_95_PERCENT_VIEW': return QuerypinanalyticsmetrictypesItems.QUARTILE_95_PERCENT_VIEW;
        case r'VIDEO_V50_WATCH_TIME': return QuerypinanalyticsmetrictypesItems.VIDEO_V50_WATCH_TIME;
        case r'VIDEO_START': return QuerypinanalyticsmetrictypesItems.VIDEO_START;
        case r'VIDEO_AVG_WATCH_TIME': return QuerypinanalyticsmetrictypesItems.VIDEO_AVG_WATCH_TIME;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static QuerypinanalyticsmetrictypesItemsTypeTransformer? _instance;
}

