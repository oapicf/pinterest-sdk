//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'filter_operator_type.g.dart';

class FilterOperatorType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'IS')
  static const FilterOperatorType IS = _$IS;
  @BuiltValueEnumConst(wireName: r'CONTAINS')
  static const FilterOperatorType CONTAINS = _$CONTAINS;

  static Serializer<FilterOperatorType> get serializer => _$filterOperatorTypeSerializer;

  const FilterOperatorType._(String name): super(name);

  static BuiltSet<FilterOperatorType> get values => _$values;
  static FilterOperatorType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class FilterOperatorTypeMixin = Object with _$FilterOperatorTypeMixin;

