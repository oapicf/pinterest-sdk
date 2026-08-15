//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trend_type.g.dart';

class TrendType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'growing')
  static const TrendType growing = _$growing;
  @BuiltValueEnumConst(wireName: r'monthly')
  static const TrendType monthly = _$monthly;
  @BuiltValueEnumConst(wireName: r'yearly')
  static const TrendType yearly = _$yearly;
  @BuiltValueEnumConst(wireName: r'seasonal')
  static const TrendType seasonal = _$seasonal;

  static Serializer<TrendType> get serializer => _$trendTypeSerializer;

  const TrendType._(String name): super(name);

  static BuiltSet<TrendType> get values => _$values;
  static TrendType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TrendTypeMixin = Object with _$TrendTypeMixin;

