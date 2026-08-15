//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_status.g.dart';

class EntityStatus extends EnumClass {

  /// Entity status
  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const EntityStatus ACTIVE = _$ACTIVE;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'PAUSED')
  static const EntityStatus PAUSED = _$PAUSED;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const EntityStatus ARCHIVED = _$ARCHIVED;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'DRAFT')
  static const EntityStatus DRAFT = _$DRAFT;
  /// Entity status
  @BuiltValueEnumConst(wireName: r'DELETED_DRAFT')
  static const EntityStatus DELETED_DRAFT = _$DELETED_DRAFT;

  static Serializer<EntityStatus> get serializer => _$entityStatusSerializer;

  const EntityStatus._(String name): super(name);

  static BuiltSet<EntityStatus> get values => _$values;
  static EntityStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class EntityStatusMixin = Object with _$EntityStatusMixin;

