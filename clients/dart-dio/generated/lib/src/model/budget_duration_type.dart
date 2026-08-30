//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'budget_duration_type.g.dart';

class BudgetDurationType extends EnumClass {

  /// Budget duration type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'FIXED_DAILY')
  static const BudgetDurationType FIXED_DAILY = _$FIXED_DAILY;
  /// Budget duration type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'FLEXIBLE_DAILY')
  static const BudgetDurationType FLEXIBLE_DAILY = _$FLEXIBLE_DAILY;
  /// Budget duration type for delivery estimates.
  @BuiltValueEnumConst(wireName: r'LIFETIME')
  static const BudgetDurationType LIFETIME = _$LIFETIME;

  static Serializer<BudgetDurationType> get serializer => _$budgetDurationTypeSerializer;

  const BudgetDurationType._(String name): super(name);

  static BuiltSet<BudgetDurationType> get values => _$values;
  static BudgetDurationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BudgetDurationTypeMixin = Object with _$BudgetDurationTypeMixin;

