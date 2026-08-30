//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Sort metric for top video pins analytics.
enum TopVideoPinsSortBy {
  SAVE._(r'SAVE'),
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  VIDEO_MRC_VIEW._(r'VIDEO_MRC_VIEW'),
  VIDEO_AVG_WATCH_TIME._(r'VIDEO_AVG_WATCH_TIME'),
  VIDEO_V50_WATCH_TIME._(r'VIDEO_V50_WATCH_TIME'),
  QUARTILE_95_PERCENT_VIEW._(r'QUARTILE_95_PERCENT_VIEW'),
  VIDEO_10S_VIEW._(r'VIDEO_10S_VIEW'),
  VIDEO_START._(r'VIDEO_START'),
  ;

  /// Instantiate a new enum with the provided value.
  const TopVideoPinsSortBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TopVideoPinsSortBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TopVideoPinsSortBy? fromJson(dynamic value) => TopVideoPinsSortByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TopVideoPinsSortBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TopVideoPinsSortBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopVideoPinsSortBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopVideoPinsSortBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TopVideoPinsSortBy] to String,
/// and [decode] dynamic data back to [TopVideoPinsSortBy].
class TopVideoPinsSortByTypeTransformer {
  factory TopVideoPinsSortByTypeTransformer() => _instance ??= const TopVideoPinsSortByTypeTransformer._();

  const TopVideoPinsSortByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TopVideoPinsSortBy data) => data._value;

  /// Returns the instance of [TopVideoPinsSortBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TopVideoPinsSortBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is TopVideoPinsSortBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SAVE': return TopVideoPinsSortBy.SAVE;
        case r'IMPRESSION': return TopVideoPinsSortBy.IMPRESSION;
        case r'OUTBOUND_CLICK': return TopVideoPinsSortBy.OUTBOUND_CLICK;
        case r'VIDEO_MRC_VIEW': return TopVideoPinsSortBy.VIDEO_MRC_VIEW;
        case r'VIDEO_AVG_WATCH_TIME': return TopVideoPinsSortBy.VIDEO_AVG_WATCH_TIME;
        case r'VIDEO_V50_WATCH_TIME': return TopVideoPinsSortBy.VIDEO_V50_WATCH_TIME;
        case r'QUARTILE_95_PERCENT_VIEW': return TopVideoPinsSortBy.QUARTILE_95_PERCENT_VIEW;
        case r'VIDEO_10S_VIEW': return TopVideoPinsSortBy.VIDEO_10S_VIEW;
        case r'VIDEO_START': return TopVideoPinsSortBy.VIDEO_START;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TopVideoPinsSortByTypeTransformer? _instance;
}

