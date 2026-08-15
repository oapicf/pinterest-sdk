//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_operation_status.g.dart';

class BatchOperationStatus extends EnumClass {

  /// The status of the operation performed by the batch
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const BatchOperationStatus PROCESSING = _$PROCESSING;
  /// The status of the operation performed by the batch
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const BatchOperationStatus COMPLETED = _$COMPLETED;
  /// The status of the operation performed by the batch
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const BatchOperationStatus FAILED = _$FAILED;

  static Serializer<BatchOperationStatus> get serializer => _$batchOperationStatusSerializer;

  const BatchOperationStatus._(String name): super(name);

  static BuiltSet<BatchOperationStatus> get values => _$values;
  static BatchOperationStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BatchOperationStatusMixin = Object with _$BatchOperationStatusMixin;

