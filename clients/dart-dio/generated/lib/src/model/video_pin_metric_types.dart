//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'video_pin_metric_types.g.dart';

class VideoPinMetricTypes extends EnumClass {

  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const VideoPinMetricTypes IMPRESSION = _$IMPRESSION;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const VideoPinMetricTypes OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const VideoPinMetricTypes PIN_CLICK = _$PIN_CLICK;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const VideoPinMetricTypes SAVE = _$SAVE;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'SAVE_RATE')
  static const VideoPinMetricTypes SAVE_RATE = _$SAVE_RATE;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'VIDEO_MRC_VIEW')
  static const VideoPinMetricTypes VIDEO_MRC_VIEW = _$VIDEO_MRC_VIEW;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'VIDEO_10S_VIEW')
  static const VideoPinMetricTypes VIDEO_10S_VIEW = _$VIDEO_10S_VIEW;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'QUARTILE_95_PERCENT_VIEW')
  static const VideoPinMetricTypes QUARTILE_95_PERCENT_VIEW = _$QUARTILE_95_PERCENT_VIEW;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'VIDEO_V50_WATCH_TIME')
  static const VideoPinMetricTypes VIDEO_V50_WATCH_TIME = _$VIDEO_V50_WATCH_TIME;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'VIDEO_START')
  static const VideoPinMetricTypes VIDEO_START = _$VIDEO_START;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'VIDEO_AVG_WATCH_TIME')
  static const VideoPinMetricTypes VIDEO_AVG_WATCH_TIME = _$VIDEO_AVG_WATCH_TIME;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'TOTAL_COMMENTS')
  static const VideoPinMetricTypes TOTAL_COMMENTS = _$TOTAL_COMMENTS;
  /// Video Pin metric types
  @BuiltValueEnumConst(wireName: r'TOTAL_REACTIONS')
  static const VideoPinMetricTypes TOTAL_REACTIONS = _$TOTAL_REACTIONS;

  static Serializer<VideoPinMetricTypes> get serializer => _$videoPinMetricTypesSerializer;

  const VideoPinMetricTypes._(String name): super(name);

  static BuiltSet<VideoPinMetricTypes> get values => _$values;
  static VideoPinMetricTypes valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class VideoPinMetricTypesMixin = Object with _$VideoPinMetricTypesMixin;

