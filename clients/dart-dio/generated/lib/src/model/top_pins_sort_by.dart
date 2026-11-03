//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'top_pins_sort_by.g.dart';

/// Sort metric for top pins analytics.
class TopPinsSortBy extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ENGAGEMENT')
  static const TopPinsSortBy ENGAGEMENT = _$ENGAGEMENT;
  @BuiltValueEnumConst(wireName: r'SAVE')
  static const TopPinsSortBy SAVE = _$SAVE;
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const TopPinsSortBy IMPRESSION = _$IMPRESSION;
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const TopPinsSortBy OUTBOUND_CLICK = _$OUTBOUND_CLICK;
  @BuiltValueEnumConst(wireName: r'PIN_CLICK')
  static const TopPinsSortBy PIN_CLICK = _$PIN_CLICK;

  static Serializer<TopPinsSortBy> get serializer => _$topPinsSortBySerializer;

  const TopPinsSortBy._(String name): super(name);

  static BuiltSet<TopPinsSortBy> get values => _$values;
  static TopPinsSortBy valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TopPinsSortByMixin = Object with _$TopPinsSortByMixin;

