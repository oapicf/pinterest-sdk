//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_status.g.dart';

class ScheduleStatus extends EnumClass {

  /// Schedule status
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const ScheduleStatus DRAFT = _$DRAFT;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'CREATED')
  static const ScheduleStatus CREATED = _$CREATED;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'SCHEDULED')
  static const ScheduleStatus SCHEDULED = _$SCHEDULED;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const ScheduleStatus ACTIVE = _$ACTIVE;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const ScheduleStatus COMPLETED = _$COMPLETED;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const ScheduleStatus FAILED = _$FAILED;
  /// Schedule status
  @BuiltValueEnumConst(wireName: r'CANCELED')
  static const ScheduleStatus CANCELED = _$CANCELED;

  static Serializer<ScheduleStatus> get serializer => _$scheduleStatusSerializer;

  const ScheduleStatus._(String name): super(name);

  static BuiltSet<ScheduleStatus> get values => _$values;
  static ScheduleStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ScheduleStatusMixin = Object with _$ScheduleStatusMixin;

