//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullable_entity_status.g.dart';

class NullableEntityStatus extends EnumClass {

  /// Entity status
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const NullableEntityStatus ACTIVE = _$ACTIVE;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const NullableEntityStatus PAUSED = _$PAUSED;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const NullableEntityStatus ARCHIVED = _$ARCHIVED;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const NullableEntityStatus DRAFT = _$DRAFT;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const NullableEntityStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<NullableEntityStatus> get serializer => _$nullableEntityStatusSerializer;

  const NullableEntityStatus._(String name): super(name);

  static BuiltSet<NullableEntityStatus> get values => _$values;
  static NullableEntityStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class NullableEntityStatusMixin = Object with _$NullableEntityStatusMixin;

