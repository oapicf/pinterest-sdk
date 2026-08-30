//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'queryvideopinmetrictypes_items.g.dart';

class QueryvideopinmetrictypesItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const QueryvideopinmetrictypesItems IMPRESSION = _$IMPRESSION;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const QueryvideopinmetrictypesItems SAVE = _$SAVE;
  @BuiltValueEnumConst(wireName: r'VIDEO_MRC_VIEW')
  static const QueryvideopinmetrictypesItems VIDEO_MRC_VIEW = _$VIDEO_MRC_VIEW;
  @BuiltValueEnumConst(wireName: r'VIDEO_AVG_WATCH_TIME')
  static const QueryvideopinmetrictypesItems VIDEO_AVG_WATCH_TIME = _$VIDEO_AVG_WATCH_TIME;
  @BuiltValueEnumConst(wireName: r'VIDEO_V50_WATCH_TIME')
  static const QueryvideopinmetrictypesItems VIDEO_V50_WATCH_TIME = _$VIDEO_V50_WATCH_TIME;
  @BuiltValueEnumConst(wireName: r'QUARTILE_95_PERCENT_VIEW')
  static const QueryvideopinmetrictypesItems QUARTILE_95_PERCENT_VIEW = _$QUARTILE_95_PERCENT_VIEW;
  @BuiltValueEnumConst(wireName: r'VIDEO_10S_VIEW')
  static const QueryvideopinmetrictypesItems VIDEO_10S_VIEW = _$VIDEO_10S_VIEW;
  @BuiltValueEnumConst(wireName: r'VIDEO_START')
  static const QueryvideopinmetrictypesItems VIDEO_START = _$VIDEO_START;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const QueryvideopinmetrictypesItems OUTBOUND_CLICK = _$OUTBOUND_CLICK;

  static Serializer<QueryvideopinmetrictypesItems> get serializer => _$queryvideopinmetrictypesItemsSerializer;

  const QueryvideopinmetrictypesItems._(String name): super(name);

  static BuiltSet<QueryvideopinmetrictypesItems> get values => _$values;
  static QueryvideopinmetrictypesItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class QueryvideopinmetrictypesItemsMixin = Object with _$QueryvideopinmetrictypesItemsMixin;

