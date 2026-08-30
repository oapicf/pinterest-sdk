//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'supplemental_item_batch_operation_status.g.dart';

class SupplementalItemBatchOperationStatus extends EnumClass {

  /// The status of the batch operation
  @BuiltValueEnumConst(wireName: r'PROCESSING')
  static const SupplementalItemBatchOperationStatus PROCESSING = _$PROCESSING;
  /// The status of the batch operation
  @BuiltValueEnumConst(wireName: r'COMPLETED')
  static const SupplementalItemBatchOperationStatus COMPLETED = _$COMPLETED;
  /// The status of the batch operation
  @BuiltValueEnumConst(wireName: r'FAILED')
  static const SupplementalItemBatchOperationStatus FAILED = _$FAILED;

  static Serializer<SupplementalItemBatchOperationStatus> get serializer => _$supplementalItemBatchOperationStatusSerializer;

  const SupplementalItemBatchOperationStatus._(String name): super(name);

  static BuiltSet<SupplementalItemBatchOperationStatus> get values => _$values;
  static SupplementalItemBatchOperationStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class SupplementalItemBatchOperationStatusMixin = Object with _$SupplementalItemBatchOperationStatusMixin;

