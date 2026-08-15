//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'label_parent_type.g.dart';

class LabelParentType extends EnumClass {

  /// Label parent entity type.
  @BuiltValueEnumConst(wireName: r'CAMPAIGN')
  static const LabelParentType CAMPAIGN = _$CAMPAIGN;

  static Serializer<LabelParentType> get serializer => _$labelParentTypeSerializer;

  const LabelParentType._(String name): super(name);

  static BuiltSet<LabelParentType> get values => _$values;
  static LabelParentType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class LabelParentTypeMixin = Object with _$LabelParentTypeMixin;

