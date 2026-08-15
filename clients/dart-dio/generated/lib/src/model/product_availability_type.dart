//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_availability_type.g.dart';

class ProductAvailabilityType extends EnumClass {

  /// Default availability for products in a feed.
  @BuiltValueEnumConst(wireName: r'IN_STOCK')
  static const ProductAvailabilityType IN_STOCK = _$IN_STOCK;
  /// Default availability for products in a feed.
  @BuiltValueEnumConst(wireName: r'OUT_OF_STOCK')
  static const ProductAvailabilityType OUT_OF_STOCK = _$OUT_OF_STOCK;
  /// Default availability for products in a feed.
  @BuiltValueEnumConst(wireName: r'PREORDER')
  static const ProductAvailabilityType PREORDER = _$PREORDER;

  static Serializer<ProductAvailabilityType> get serializer => _$productAvailabilityTypeSerializer;

  const ProductAvailabilityType._(String name): super(name);

  static BuiltSet<ProductAvailabilityType> get values => _$values;
  static ProductAvailabilityType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductAvailabilityTypeMixin = Object with _$ProductAvailabilityTypeMixin;

