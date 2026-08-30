//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_gender_filter.g.dart';

class TrendsGenderFilter extends EnumClass {

  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'male')
  static const TrendsGenderFilter male = _$male;
  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'female')
  static const TrendsGenderFilter female = _$female;
  /// Gender category for trends demographic distribution.
  @BuiltValueEnumConst(wireName: r'unknown')
  static const TrendsGenderFilter unknown = _$unknown;

  static Serializer<TrendsGenderFilter> get serializer => _$trendsGenderFilterSerializer;

  const TrendsGenderFilter._(String name): super(name);

  static BuiltSet<TrendsGenderFilter> get values => _$values;
  static TrendsGenderFilter valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TrendsGenderFilterMixin = Object with _$TrendsGenderFilterMixin;

