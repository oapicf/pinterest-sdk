//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_attribution_window_days.g.dart';

class ConversionAttributionWindowDays extends EnumClass {

  @BuiltValueEnumConst(wireNumber: 0)
  static const ConversionAttributionWindowDays number0 = _$number0;
  @BuiltValueEnumConst(wireNumber: 1)
  static const ConversionAttributionWindowDays number1 = _$number1;
  @BuiltValueEnumConst(wireNumber: 7)
  static const ConversionAttributionWindowDays number7 = _$number7;
  @BuiltValueEnumConst(wireNumber: 14)
  static const ConversionAttributionWindowDays number14 = _$number14;
  @BuiltValueEnumConst(wireNumber: 30)
  static const ConversionAttributionWindowDays number30 = _$number30;
  @BuiltValueEnumConst(wireNumber: 60)
  static const ConversionAttributionWindowDays number60 = _$number60;

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

