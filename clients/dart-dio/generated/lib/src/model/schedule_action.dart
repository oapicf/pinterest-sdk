//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_action.g.dart';

class ScheduleAction extends EnumClass {

  /// The schedule action
  @BuiltValueEnumConst(wireName: r'INCREASE_BY_VALUE')
  static const ScheduleAction INCREASE_BY_VALUE = _$INCREASE_BY_VALUE;
  /// The schedule action
  @BuiltValueEnumConst(wireName: r'INCREASE_BY_PERCENT')
  static const ScheduleAction INCREASE_BY_PERCENT = _$INCREASE_BY_PERCENT;

  static Serializer<ScheduleAction> get serializer => _$scheduleActionSerializer;

  const ScheduleAction._(String name): super(name);

  static BuiltSet<ScheduleAction> get values => _$values;
  static ScheduleAction valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ScheduleActionMixin = Object with _$ScheduleActionMixin;

