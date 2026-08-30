//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'multi_pins_analytics_metric_types_item.g.dart';

class MultiPinsAnalyticsMetricTypesItem extends EnumClass {

  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const MultiPinsAnalyticsMetricTypesItem IMPRESSION = _$IMPRESSION;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const MultiPinsAnalyticsMetricTypesItem OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const MultiPinsAnalyticsMetricTypesItem PIN_CLICK = _$PIN_CLICK;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const MultiPinsAnalyticsMetricTypesItem SAVE = _$SAVE;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'SAVE_RATE')
  static const MultiPinsAnalyticsMetricTypesItem SAVE_RATE = _$SAVE_RATE;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'TOTAL_COMMENTS')
  static const MultiPinsAnalyticsMetricTypesItem TOTAL_COMMENTS = _$TOTAL_COMMENTS;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'TOTAL_REACTIONS')
  static const MultiPinsAnalyticsMetricTypesItem TOTAL_REACTIONS = _$TOTAL_REACTIONS;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'USER_FOLLOW')
  static const MultiPinsAnalyticsMetricTypesItem USER_FOLLOW = _$USER_FOLLOW;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'PROFILE_VISIT')
  static const MultiPinsAnalyticsMetricTypesItem PROFILE_VISIT = _$PROFILE_VISIT;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'VIDEO_MRC_VIEW')
  static const MultiPinsAnalyticsMetricTypesItem VIDEO_MRC_VIEW = _$VIDEO_MRC_VIEW;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'VIDEO_10S_VIEW')
  static const MultiPinsAnalyticsMetricTypesItem VIDEO_10S_VIEW = _$VIDEO_10S_VIEW;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'QUARTILE_95_PERCENT_VIEW')
  static const MultiPinsAnalyticsMetricTypesItem QUARTILE_95_PERCENT_VIEW = _$QUARTILE_95_PERCENT_VIEW;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'VIDEO_V50_WATCH_TIME')
  static const MultiPinsAnalyticsMetricTypesItem VIDEO_V50_WATCH_TIME = _$VIDEO_V50_WATCH_TIME;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'VIDEO_START')
  static const MultiPinsAnalyticsMetricTypesItem VIDEO_START = _$VIDEO_START;
  /// Pin metric type for multi-pin analytics
  @BuiltValueEnumConst(wireName: r'VIDEO_AVG_WATCH_TIME')
  static const MultiPinsAnalyticsMetricTypesItem VIDEO_AVG_WATCH_TIME = _$VIDEO_AVG_WATCH_TIME;

  static Serializer<MultiPinsAnalyticsMetricTypesItem> get serializer => _$multiPinsAnalyticsMetricTypesItemSerializer;

  const MultiPinsAnalyticsMetricTypesItem._(String name): super(name);

  static BuiltSet<MultiPinsAnalyticsMetricTypesItem> get values => _$values;
  static MultiPinsAnalyticsMetricTypesItem valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MultiPinsAnalyticsMetricTypesItemMixin = Object with _$MultiPinsAnalyticsMetricTypesItemMixin;

