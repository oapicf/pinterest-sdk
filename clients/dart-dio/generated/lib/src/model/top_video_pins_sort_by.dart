//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_video_pins_sort_by.g.dart';

class TopVideoPinsSortBy extends EnumClass {

  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const TopVideoPinsSortBy SAVE = _$SAVE;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const TopVideoPinsSortBy IMPRESSION = _$IMPRESSION;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const TopVideoPinsSortBy OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'VIDEO_MRC_VIEW')
  static const TopVideoPinsSortBy VIDEO_MRC_VIEW = _$VIDEO_MRC_VIEW;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'VIDEO_AVG_WATCH_TIME')
  static const TopVideoPinsSortBy VIDEO_AVG_WATCH_TIME = _$VIDEO_AVG_WATCH_TIME;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'VIDEO_V50_WATCH_TIME')
  static const TopVideoPinsSortBy VIDEO_V50_WATCH_TIME = _$VIDEO_V50_WATCH_TIME;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'QUARTILE_95_PERCENT_VIEW')
  static const TopVideoPinsSortBy QUARTILE_95_PERCENT_VIEW = _$QUARTILE_95_PERCENT_VIEW;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'VIDEO_10S_VIEW')
  static const TopVideoPinsSortBy VIDEO_10S_VIEW = _$VIDEO_10S_VIEW;
  /// Sort metric for top video pins analytics.
  @BuiltValueEnumConst(wireName: r'VIDEO_START')
  static const TopVideoPinsSortBy VIDEO_START = _$VIDEO_START;

  static Serializer<TopVideoPinsSortBy> get serializer => _$topVideoPinsSortBySerializer;

  const TopVideoPinsSortBy._(String name): super(name);

  static BuiltSet<TopVideoPinsSortBy> get values => _$values;
  static TopVideoPinsSortBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TopVideoPinsSortByMixin = Object with _$TopVideoPinsSortByMixin;

