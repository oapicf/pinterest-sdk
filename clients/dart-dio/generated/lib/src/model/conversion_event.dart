//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_event.g.dart';

class ConversionEvent extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PAGE_VISIT')
  static const ConversionEvent PAGE_VISIT = _$PAGE_VISIT;
  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const ConversionEvent SIGNUP = _$SIGNUP;
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const ConversionEvent CHECKOUT = _$CHECKOUT;
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const ConversionEvent CUSTOM = _$CUSTOM;
  @BuiltValueEnumConst(wireName: r'VIEW_CATEGORY')
  static const ConversionEvent VIEW_CATEGORY = _$VIEW_CATEGORY;
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const ConversionEvent SEARCH = _$SEARCH;
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const ConversionEvent ADD_TO_CART = _$ADD_TO_CART;
  @BuiltValueEnumConst(wireName: r'WATCH_VIDEO')
  static const ConversionEvent WATCH_VIDEO = _$WATCH_VIDEO;
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const ConversionEvent LEAD = _$LEAD;
  @BuiltValueEnumConst(wireName: r'APP_INSTALL')
  static const ConversionEvent APP_INSTALL = _$APP_INSTALL;

  static Serializer<ConversionEvent> get serializer => _$conversionEventSerializer;

  const ConversionEvent._(String name): super(name);

  static BuiltSet<ConversionEvent> get values => _$values;
  static ConversionEvent valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionEventMixin = Object with _$ConversionEventMixin;

