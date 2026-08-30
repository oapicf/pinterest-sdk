//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'change_history_operation_type.g.dart';

class ChangeHistoryOperationType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATE')
  static const ChangeHistoryOperationType CREATE = _$CREATE;
  @BuiltValueEnumConst(wireName: r'UPDATE')
  static const ChangeHistoryOperationType UPDATE = _$UPDATE;
  @BuiltValueEnumConst(wireName: r'DELETE')
  static const ChangeHistoryOperationType DELETE = _$DELETE;

  static Serializer<ChangeHistoryOperationType> get serializer => _$changeHistoryOperationTypeSerializer;

  const ChangeHistoryOperationType._(String name): super(name);

  static BuiltSet<ChangeHistoryOperationType> get values => _$values;
  static ChangeHistoryOperationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ChangeHistoryOperationTypeMixin = Object with _$ChangeHistoryOperationTypeMixin;

