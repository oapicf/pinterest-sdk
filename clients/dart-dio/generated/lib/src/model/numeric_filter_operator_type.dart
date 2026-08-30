//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'numeric_filter_operator_type.g.dart';

class NumericFilterOperatorType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'GREATER_THAN')
  static const NumericFilterOperatorType GREATER_THAN = _$GREATER_THAN;
  @BuiltValueEnumConst(wireName: r'GREATER_THAN_OR_EQUALS')
  static const NumericFilterOperatorType GREATER_THAN_OR_EQUALS = _$GREATER_THAN_OR_EQUALS;
  @BuiltValueEnumConst(wireName: r'LESS_THAN')
  static const NumericFilterOperatorType LESS_THAN = _$LESS_THAN;
  @BuiltValueEnumConst(wireName: r'LESS_THAN_OR_EQUALS')
  static const NumericFilterOperatorType LESS_THAN_OR_EQUALS = _$LESS_THAN_OR_EQUALS;

  static Serializer<NumericFilterOperatorType> get serializer => _$numericFilterOperatorTypeSerializer;

  const NumericFilterOperatorType._(String name): super(name);

  static BuiltSet<NumericFilterOperatorType> get values => _$values;
  static NumericFilterOperatorType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NumericFilterOperatorTypeMixin = Object with _$NumericFilterOperatorTypeMixin;

