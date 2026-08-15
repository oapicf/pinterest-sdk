//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'batch_operation.g.dart';

class BatchOperation extends EnumClass {

  /// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const BatchOperation UPDATE = _$UPDATE;
  /// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  @BuiltValueEnumConst(wireName: r'UPSERT')
  static const BatchOperation UPSERT = _$UPSERT;
  /// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  @BuiltValueEnumConst(wireName: r'CREATE')
  static const BatchOperation CREATE = _$CREATE;
  /// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  @BuiltValueEnumConst(wireName: r'DELETE_DISCONTINUED')
  static const BatchOperation DELETE_DISCONTINUED = _$DELETE_DISCONTINUED;
  /// The operation performed by the batch. The DELETE_DISCONTINUED operation only updates availablity to \"Out of Stock\".
  @BuiltValueEnumConst(wireName: r'DELETE')
  static const BatchOperation DELETE = _$DELETE;

  static Serializer<BatchOperation> get serializer => _$batchOperationSerializer;

  const BatchOperation._(String name): super(name);

  static BuiltSet<BatchOperation> get values => _$values;
  static BatchOperation valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class BatchOperationMixin = Object with _$BatchOperationMixin;

