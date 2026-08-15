//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pacing_delivery_type.g.dart';

class PacingDeliveryType extends EnumClass {

  /// Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
  @BuiltValueEnumConst(wireName: r'STANDARD')
  static const PacingDeliveryType STANDARD = _$STANDARD;
  /// Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
  @BuiltValueEnumConst(wireName: r'ACCELERATED')
  static const PacingDeliveryType ACCELERATED = _$ACCELERATED;

  static Serializer<PacingDeliveryType> get serializer => _$pacingDeliveryTypeSerializer;

  const PacingDeliveryType._(String name): super(name);

  static BuiltSet<PacingDeliveryType> get values => _$values;
  static PacingDeliveryType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class PacingDeliveryTypeMixin = Object with _$PacingDeliveryTypeMixin;

