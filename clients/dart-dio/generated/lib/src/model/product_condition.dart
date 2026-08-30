//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_condition.g.dart';

class ProductCondition extends EnumClass {

  @BuiltValueEnumConst(wireName: r'NEW')
  static const ProductCondition NEW = _$NEW;
  @BuiltValueEnumConst(wireName: r'USED')
  static const ProductCondition USED = _$USED;
  @BuiltValueEnumConst(wireName: r'REFURBISHED')
  static const ProductCondition REFURBISHED = _$REFURBISHED;

  static Serializer<ProductCondition> get serializer => _$productConditionSerializer;

  const ProductCondition._(String name): super(name);

  static BuiltSet<ProductCondition> get values => _$values;
  static ProductCondition valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductConditionMixin = Object with _$ProductConditionMixin;

