//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_paid_type.g.dart';

class OrderLinePaidType extends EnumClass {

  /// Order Line Paid Type
  @BuiltValueEnumConst(wireName: r'PAID')
  static const OrderLinePaidType PAID = _$PAID;
  /// Order Line Paid Type
  @BuiltValueEnumConst(wireName: r'BONUS')
  static const OrderLinePaidType BONUS = _$BONUS;
  /// Order Line Paid Type
  @BuiltValueEnumConst(wireName: r'MAKE_GOOD')
  static const OrderLinePaidType MAKE_GOOD = _$MAKE_GOOD;
  /// Order Line Paid Type
  @BuiltValueEnumConst(wireName: r'TEST')
  static const OrderLinePaidType TEST = _$TEST;

  static Serializer<OrderLinePaidType> get serializer => _$orderLinePaidTypeSerializer;

  const OrderLinePaidType._(String name): super(name);

  static BuiltSet<OrderLinePaidType> get values => _$values;
  static OrderLinePaidType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class OrderLinePaidTypeMixin = Object with _$OrderLinePaidTypeMixin;

