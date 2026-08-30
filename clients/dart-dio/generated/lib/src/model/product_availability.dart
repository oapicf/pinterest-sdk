//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_availability.g.dart';

class ProductAvailability extends EnumClass {

  /// Product availability.
  @BuiltValueEnumConst(wireName: r'IN_STOCK')
  static const ProductAvailability IN_STOCK = _$IN_STOCK;
  /// Product availability.
  @BuiltValueEnumConst(wireName: r'OUT_OF_STOCK')
  static const ProductAvailability OUT_OF_STOCK = _$OUT_OF_STOCK;
  /// Product availability.
  @BuiltValueEnumConst(wireName: r'PREORDER')
  static const ProductAvailability PREORDER = _$PREORDER;

  static Serializer<ProductAvailability> get serializer => _$productAvailabilitySerializer;

  const ProductAvailability._(String name): super(name);

  static BuiltSet<ProductAvailability> get values => _$values;
  static ProductAvailability valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ProductAvailabilityMixin = Object with _$ProductAvailabilityMixin;

