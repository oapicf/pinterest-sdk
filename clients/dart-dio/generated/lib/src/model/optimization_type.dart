//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_type.g.dart';

class OptimizationType extends EnumClass {

  /// Optimization type for ad group delivery estimates. Supported types vary by objective.
  @BuiltValueEnumConst(wireName: r'CLICKTHROUGH')
  static const OptimizationType CLICKTHROUGH = _$CLICKTHROUGH;
  /// Optimization type for ad group delivery estimates. Supported types vary by objective.
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const OptimizationType IMPRESSION = _$IMPRESSION;
  /// Optimization type for ad group delivery estimates. Supported types vary by objective.
  @BuiltValueEnumConst(wireName: r'WEB_CONVERSION')
  static const OptimizationType WEB_CONVERSION = _$WEB_CONVERSION;
  /// Optimization type for ad group delivery estimates. Supported types vary by objective.
  @BuiltValueEnumConst(wireName: r'ROAS')
  static const OptimizationType ROAS = _$ROAS;
  /// Optimization type for ad group delivery estimates. Supported types vary by objective.
  @BuiltValueEnumConst(wireName: r'OUTBOUND_CLICK')
  static const OptimizationType OUTBOUND_CLICK = _$OUTBOUND_CLICK;

  static Serializer<OptimizationType> get serializer => _$optimizationTypeSerializer;

  const OptimizationType._(String name): super(name);

  static BuiltSet<OptimizationType> get values => _$values;
  static OptimizationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class OptimizationTypeMixin = Object with _$OptimizationTypeMixin;

