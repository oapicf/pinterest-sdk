//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_list_operation.g.dart';

class TargetingSpecListOperation extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SET')
  static const TargetingSpecListOperation SET = _$SET;
  @BuiltValueEnumConst(wireName: r'ADD')
  static const TargetingSpecListOperation ADD = _$ADD;
  @BuiltValueEnumConst(wireName: r'REMOVE')
  static const TargetingSpecListOperation REMOVE = _$REMOVE;

  static Serializer<TargetingSpecListOperation> get serializer => _$targetingSpecListOperationSerializer;

  const TargetingSpecListOperation._(String name): super(name);

  static BuiltSet<TargetingSpecListOperation> get values => _$values;
  static TargetingSpecListOperation valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TargetingSpecListOperationMixin = Object with _$TargetingSpecListOperationMixin;

