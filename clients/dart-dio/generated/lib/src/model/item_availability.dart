//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_availability.g.dart';

class ItemAvailability extends EnumClass {

  /// Availability of the item
  @BuiltValueEnumConst(wireName: r'in stock')
  static const ItemAvailability inStock = _$inStock;
  /// Availability of the item
  @BuiltValueEnumConst(wireName: r'out of stock')
  static const ItemAvailability outOfStock = _$outOfStock;
  /// Availability of the item
  @BuiltValueEnumConst(wireName: r'preorder')
  static const ItemAvailability preorder = _$preorder;

  static Serializer<ItemAvailability> get serializer => _$itemAvailabilitySerializer;

  const ItemAvailability._(String name): super(name);

  static BuiltSet<ItemAvailability> get values => _$values;
  static ItemAvailability valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ItemAvailabilityMixin = Object with _$ItemAvailabilityMixin;

