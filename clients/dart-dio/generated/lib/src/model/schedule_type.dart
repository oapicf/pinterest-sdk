//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_type.g.dart';

class ScheduleType extends EnumClass {

  /// The schedule type
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_BUDGET_CHANGE')
  static const ScheduleType CAMPAIGN_BUDGET_CHANGE = _$CAMPAIGN_BUDGET_CHANGE;
  /// The schedule type
  @BuiltValueEnumConst(wireName: r'CAMPAIGN_BID_MULTIPLIERS')
  static const ScheduleType CAMPAIGN_BID_MULTIPLIERS = _$CAMPAIGN_BID_MULTIPLIERS;

  static Serializer<ScheduleType> get serializer => _$scheduleTypeSerializer;

  const ScheduleType._(String name): super(name);

  static BuiltSet<ScheduleType> get values => _$values;
  static ScheduleType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ScheduleTypeMixin = Object with _$ScheduleTypeMixin;

