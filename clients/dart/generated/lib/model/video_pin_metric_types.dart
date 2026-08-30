//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Video Pin metric types
enum VideoPinMetricTypes {
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  PIN_CLICK._(r'PIN_CLICK'),
  SAVE._(r'SAVE'),
  SAVE_RATE._(r'SAVE_RATE'),
  VIDEO_MRC_VIEW._(r'VIDEO_MRC_VIEW'),
  VIDEO_10S_VIEW._(r'VIDEO_10S_VIEW'),
  QUARTILE_95_PERCENT_VIEW._(r'QUARTILE_95_PERCENT_VIEW'),
  VIDEO_V50_WATCH_TIME._(r'VIDEO_V50_WATCH_TIME'),
  VIDEO_START._(r'VIDEO_START'),
  VIDEO_AVG_WATCH_TIME._(r'VIDEO_AVG_WATCH_TIME'),
  TOTAL_COMMENTS._(r'TOTAL_COMMENTS'),
  TOTAL_REACTIONS._(r'TOTAL_REACTIONS'),
  ;

  /// Instantiate a new enum with the provided value.
  const VideoPinMetricTypes._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [VideoPinMetricTypes] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static VideoPinMetricTypes? fromJson(dynamic value) => VideoPinMetricTypesTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [VideoPinMetricTypes]
  /// that were successfully decoded from the passed [JSON][json].
  static List<VideoPinMetricTypes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <VideoPinMetricTypes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = VideoPinMetricTypes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [VideoPinMetricTypes] to String,
/// and [decode] dynamic data back to [VideoPinMetricTypes].
class VideoPinMetricTypesTypeTransformer {
  factory VideoPinMetricTypesTypeTransformer() => _instance ??= const VideoPinMetricTypesTypeTransformer._();

  const VideoPinMetricTypesTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(VideoPinMetricTypes data) => data._value;

  /// Returns the instance of [VideoPinMetricTypes] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  VideoPinMetricTypes? decode(dynamic data, {bool allowNull = true}) {
    if (data is VideoPinMetricTypes) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return VideoPinMetricTypes.IMPRESSION;
        case r'OUTBOUND_CLICK': return VideoPinMetricTypes.OUTBOUND_CLICK;
        case r'PIN_CLICK': return VideoPinMetricTypes.PIN_CLICK;
        case r'SAVE': return VideoPinMetricTypes.SAVE;
        case r'SAVE_RATE': return VideoPinMetricTypes.SAVE_RATE;
        case r'VIDEO_MRC_VIEW': return VideoPinMetricTypes.VIDEO_MRC_VIEW;
        case r'VIDEO_10S_VIEW': return VideoPinMetricTypes.VIDEO_10S_VIEW;
        case r'QUARTILE_95_PERCENT_VIEW': return VideoPinMetricTypes.QUARTILE_95_PERCENT_VIEW;
        case r'VIDEO_V50_WATCH_TIME': return VideoPinMetricTypes.VIDEO_V50_WATCH_TIME;
        case r'VIDEO_START': return VideoPinMetricTypes.VIDEO_START;
        case r'VIDEO_AVG_WATCH_TIME': return VideoPinMetricTypes.VIDEO_AVG_WATCH_TIME;
        case r'TOTAL_COMMENTS': return VideoPinMetricTypes.TOTAL_COMMENTS;
        case r'TOTAL_REACTIONS': return VideoPinMetricTypes.TOTAL_REACTIONS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static VideoPinMetricTypesTypeTransformer? _instance;
}

