//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum QueryvideopinmetrictypesItems {
  IMPRESSION._(r'IMPRESSION'),
  SAVE._(r'SAVE'),
  VIDEO_MRC_VIEW._(r'VIDEO_MRC_VIEW'),
  VIDEO_AVG_WATCH_TIME._(r'VIDEO_AVG_WATCH_TIME'),
  VIDEO_V50_WATCH_TIME._(r'VIDEO_V50_WATCH_TIME'),
  QUARTILE_95_PERCENT_VIEW._(r'QUARTILE_95_PERCENT_VIEW'),
  VIDEO_10S_VIEW._(r'VIDEO_10S_VIEW'),
  VIDEO_START._(r'VIDEO_START'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  ;

  /// Instantiate a new enum with the provided value.
  const QueryvideopinmetrictypesItems._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [QueryvideopinmetrictypesItems] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static QueryvideopinmetrictypesItems? fromJson(dynamic value) => QueryvideopinmetrictypesItemsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [QueryvideopinmetrictypesItems]
  /// that were successfully decoded from the passed [JSON][json].
  static List<QueryvideopinmetrictypesItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QueryvideopinmetrictypesItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QueryvideopinmetrictypesItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [QueryvideopinmetrictypesItems] to String,
/// and [decode] dynamic data back to [QueryvideopinmetrictypesItems].
class QueryvideopinmetrictypesItemsTypeTransformer {
  factory QueryvideopinmetrictypesItemsTypeTransformer() => _instance ??= const QueryvideopinmetrictypesItemsTypeTransformer._();

  const QueryvideopinmetrictypesItemsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(QueryvideopinmetrictypesItems data) => data._value;

  /// Returns the instance of [QueryvideopinmetrictypesItems] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  QueryvideopinmetrictypesItems? decode(dynamic data, {bool allowNull = true}) {
    if (data is QueryvideopinmetrictypesItems) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return QueryvideopinmetrictypesItems.IMPRESSION;
        case r'SAVE': return QueryvideopinmetrictypesItems.SAVE;
        case r'VIDEO_MRC_VIEW': return QueryvideopinmetrictypesItems.VIDEO_MRC_VIEW;
        case r'VIDEO_AVG_WATCH_TIME': return QueryvideopinmetrictypesItems.VIDEO_AVG_WATCH_TIME;
        case r'VIDEO_V50_WATCH_TIME': return QueryvideopinmetrictypesItems.VIDEO_V50_WATCH_TIME;
        case r'QUARTILE_95_PERCENT_VIEW': return QueryvideopinmetrictypesItems.QUARTILE_95_PERCENT_VIEW;
        case r'VIDEO_10S_VIEW': return QueryvideopinmetrictypesItems.VIDEO_10S_VIEW;
        case r'VIDEO_START': return QueryvideopinmetrictypesItems.VIDEO_START;
        case r'OUTBOUND_CLICK': return QueryvideopinmetrictypesItems.OUTBOUND_CLICK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static QueryvideopinmetrictypesItemsTypeTransformer? _instance;
}

