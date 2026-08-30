//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'entity_label_status.g.dart';

class EntityLabelStatus extends EnumClass {

  @BuiltValueEnumConst(wireName: r'ACTIVE')
  static const EntityLabelStatus ACTIVE = _$ACTIVE;
  @BuiltValueEnumConst(wireName: r'ARCHIVED')
  static const EntityLabelStatus ARCHIVED = _$ARCHIVED;
  @BuiltValueEnumConst(wireName: r'NULL')
  static const EntityLabelStatus NULL = _$NULL;

  static Serializer<EntityLabelStatus> get serializer => _$entityLabelStatusSerializer;

  const EntityLabelStatus._(String name): super(name);

  static BuiltSet<EntityLabelStatus> get values => _$values;
  static EntityLabelStatus valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class EntityLabelStatusMixin = Object with _$EntityLabelStatusMixin;

