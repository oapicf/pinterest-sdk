//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delivery_estimate_objective_type.g.dart';

class DeliveryEstimateObjectiveType extends EnumClass {

  /// Objective type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'AWARENESS')
  static const DeliveryEstimateObjectiveType AWARENESS = _$AWARENESS;
  /// Objective type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'CONSIDERATION')
  static const DeliveryEstimateObjectiveType CONSIDERATION = _$CONSIDERATION;
  /// Objective type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'CATALOG_SALES')
  static const DeliveryEstimateObjectiveType CATALOG_SALES = _$CATALOG_SALES;
  /// Objective type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'WEB_CONVERSION')
  static const DeliveryEstimateObjectiveType WEB_CONVERSION = _$WEB_CONVERSION;

  static Serializer<DeliveryEstimateObjectiveType> get serializer => _$deliveryEstimateObjectiveTypeSerializer;

  const DeliveryEstimateObjectiveType._(String name): super(name);

  static BuiltSet<DeliveryEstimateObjectiveType> get values => _$values;
  static DeliveryEstimateObjectiveType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class DeliveryEstimateObjectiveTypeMixin = Object with _$DeliveryEstimateObjectiveTypeMixin;

