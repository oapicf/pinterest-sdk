//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'workload_state.g.dart';

class WorkloadState extends EnumClass {

  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'NOT_STARTED')
  static const WorkloadState NOT_STARTED = _$NOT_STARTED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'RUNNING')
  static const WorkloadState RUNNING = _$RUNNING;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const WorkloadState PAUSED = _$PAUSED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'SUCCEEDED')
  static const WorkloadState SUCCEEDED = _$SUCCEEDED;
  /// Workload processing state
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const WorkloadState FAILED = _$FAILED;

  static Serializer<WorkloadState> get serializer => _$workloadStateSerializer;

  const WorkloadState._(String name): super(name);

  static BuiltSet<WorkloadState> get values => _$values;
  static WorkloadState valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class WorkloadStateMixin = Object with _$WorkloadStateMixin;

