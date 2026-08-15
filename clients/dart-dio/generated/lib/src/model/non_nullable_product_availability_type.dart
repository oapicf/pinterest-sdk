//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'non_nullable_product_availability_type.g.dart';

class NonNullableProductAvailabilityType extends EnumClass {

  /// Product availability.
  @BuiltValueEnumConst(wireName: r'IN_STOCK')
  static const NonNullableProductAvailabilityType IN_STOCK = _$IN_STOCK;
  /// Product availability.
  @BuiltValueEnumConst(wireName: r'OUT_OF_STOCK')
  static const NonNullableProductAvailabilityType OUT_OF_STOCK = _$OUT_OF_STOCK;
  /// Product availability.
  @BuiltValueEnumConst(wireName: r'PREORDER')
  static const NonNullableProductAvailabilityType PREORDER = _$PREORDER;

  static Serializer<NonNullableProductAvailabilityType> get serializer => _$nonNullableProductAvailabilityTypeSerializer;

  const NonNullableProductAvailabilityType._(String name): super(name);

  static BuiltSet<NonNullableProductAvailabilityType> get values => _$values;
  static NonNullableProductAvailabilityType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NonNullableProductAvailabilityTypeMixin = Object with _$NonNullableProductAvailabilityTypeMixin;

