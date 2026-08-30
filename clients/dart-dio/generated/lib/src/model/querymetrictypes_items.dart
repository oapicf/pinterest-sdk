//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'querymetrictypes_items.g.dart';

class QuerymetrictypesItems extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const QuerymetrictypesItems ENGAGEMENT = _$ENGAGEMENT;
  @BuiltValueEnumConst(wireName: r'ENGAGEMENT_RATE')
  static const QuerymetrictypesItems ENGAGEMENT_RATE = _$ENGAGEMENT_RATE;
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const QuerymetrictypesItems IMPRESSION = _$IMPRESSION;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const QuerymetrictypesItems OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK_RATE')
  static const QuerymetrictypesItems OUTBOUND_CLICK_RATE = _$OUTBOUND_CLICK_RATE;
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const QuerymetrictypesItems PIN_CLICK = _$PIN_CLICK;
  @BuiltValueEnumConst(wireName: r'PIN_CLICK_RATE')
  static const QuerymetrictypesItems PIN_CLICK_RATE = _$PIN_CLICK_RATE;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const QuerymetrictypesItems SAVE = _$SAVE;
  @BuiltValueEnumConst(wireName: r'SAVE_RATE')
  static const QuerymetrictypesItems SAVE_RATE = _$SAVE_RATE;

  static Serializer<QuerymetrictypesItems> get serializer => _$querymetrictypesItemsSerializer;

  const QuerymetrictypesItems._(String name): super(name);

  static BuiltSet<QuerymetrictypesItems> get values => _$values;
  static QuerymetrictypesItems valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class QuerymetrictypesItemsMixin = Object with _$QuerymetrictypesItemsMixin;

