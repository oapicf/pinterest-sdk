//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_attribution_window_days.g.dart';

class ConversionAttributionWindowDays extends EnumClass {

  @BuiltValueEnumConst(wireName: r'0')
  static const ConversionAttributionWindowDays n0 = _$n0;
  @BuiltValueEnumConst(wireName: r'1')
  static const ConversionAttributionWindowDays n1 = _$n1;
  @BuiltValueEnumConst(wireName: r'7')
  static const ConversionAttributionWindowDays n7 = _$n7;
  @BuiltValueEnumConst(wireName: r'14')
  static const ConversionAttributionWindowDays n14 = _$n14;
  @BuiltValueEnumConst(wireName: r'30')
  static const ConversionAttributionWindowDays n30 = _$n30;
  @BuiltValueEnumConst(wireName: r'60')
  static const ConversionAttributionWindowDays n60 = _$n60;

  static Serializer<ConversionAttributionWindowDays> get serializer => _$conversionAttributionWindowDaysSerializer;

  const ConversionAttributionWindowDays._(String name): super(name);

  static BuiltSet<ConversionAttributionWindowDays> get values => _$values;
  static ConversionAttributionWindowDays valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionAttributionWindowDaysMixin = Object with _$ConversionAttributionWindowDaysMixin;

