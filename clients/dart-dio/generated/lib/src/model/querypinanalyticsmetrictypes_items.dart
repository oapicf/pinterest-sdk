//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'querypinanalyticsmetrictypes_items.g.dart';

class QuerypinanalyticsmetrictypesItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const QuerypinanalyticsmetrictypesItems IMPRESSION = _$IMPRESSION;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const QuerypinanalyticsmetrictypesItems OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const QuerypinanalyticsmetrictypesItems PIN_CLICK = _$PIN_CLICK;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const QuerypinanalyticsmetrictypesItems SAVE = _$SAVE;
  @BuiltValueEnumConst(wireName: r'SAVE_RATE')
  static const QuerypinanalyticsmetrictypesItems SAVE_RATE = _$SAVE_RATE;
  @BuiltValueEnumConst(wireName: r'TOTAL_COMMENTS')
  static const QuerypinanalyticsmetrictypesItems TOTAL_COMMENTS = _$TOTAL_COMMENTS;
  @BuiltValueEnumConst(wireName: r'TOTAL_REACTIONS')
  static const QuerypinanalyticsmetrictypesItems TOTAL_REACTIONS = _$TOTAL_REACTIONS;
  @BuiltValueEnumConst(wireName: r'USER_FOLLOW')
  static const QuerypinanalyticsmetrictypesItems USER_FOLLOW = _$USER_FOLLOW;
  @BuiltValueEnumConst(wireName: r'PROFILE_VISIT')
  static const QuerypinanalyticsmetrictypesItems PROFILE_VISIT = _$PROFILE_VISIT;
  @BuiltValueEnumConst(wireName: r'VIDEO_MRC_VIEW')
  static const QuerypinanalyticsmetrictypesItems VIDEO_MRC_VIEW = _$VIDEO_MRC_VIEW;
  @BuiltValueEnumConst(wireName: r'VIDEO_10S_VIEW')
  static const QuerypinanalyticsmetrictypesItems VIDEO_10S_VIEW = _$VIDEO_10S_VIEW;
  @BuiltValueEnumConst(wireName: r'QUARTILE_95_PERCENT_VIEW')
  static const QuerypinanalyticsmetrictypesItems QUARTILE_95_PERCENT_VIEW = _$QUARTILE_95_PERCENT_VIEW;
  @BuiltValueEnumConst(wireName: r'VIDEO_V50_WATCH_TIME')
  static const QuerypinanalyticsmetrictypesItems VIDEO_V50_WATCH_TIME = _$VIDEO_V50_WATCH_TIME;
  @BuiltValueEnumConst(wireName: r'VIDEO_START')
  static const QuerypinanalyticsmetrictypesItems VIDEO_START = _$VIDEO_START;
  @BuiltValueEnumConst(wireName: r'VIDEO_AVG_WATCH_TIME')
  static const QuerypinanalyticsmetrictypesItems VIDEO_AVG_WATCH_TIME = _$VIDEO_AVG_WATCH_TIME;

  static Serializer<QuerypinanalyticsmetrictypesItems> get serializer => _$querypinanalyticsmetrictypesItemsSerializer;

  const QuerypinanalyticsmetrictypesItems._(String name): super(name);

  static BuiltSet<QuerypinanalyticsmetrictypesItems> get values => _$values;
  static QuerypinanalyticsmetrictypesItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class QuerypinanalyticsmetrictypesItemsMixin = Object with _$QuerypinanalyticsmetrictypesItemsMixin;

