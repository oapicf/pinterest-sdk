//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_gender.g.dart';

class TrendsGender extends EnumClass {

  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'male')
  static const TrendsGender male = _$male;
  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'female')
  static const TrendsGender female = _$female;
  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'unspecified')
  static const TrendsGender unspecified = _$unspecified;

  static Serializer<TrendsGender> get serializer => _$trendsGenderSerializer;

  const TrendsGender._(String name): super(name);

  static BuiltSet<TrendsGender> get values => _$values;
  static TrendsGender valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TrendsGenderMixin = Object with _$TrendsGenderMixin;

