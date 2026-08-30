//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attribution_action_type.g.dart';

class AttributionActionType extends EnumClass {

  /// Type of an attributed action.
  @BuiltValueEnumConst(wireName: r'view')
  static const AttributionActionType view = _$view;
  /// Type of an attributed action.
  @BuiltValueEnumConst(wireName: r'click')
  static const AttributionActionType click = _$click;

  static Serializer<AttributionActionType> get serializer => _$attributionActionTypeSerializer;

  const AttributionActionType._(String name): super(name);

  static BuiltSet<AttributionActionType> get values => _$values;
  static AttributionActionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AttributionActionTypeMixin = Object with _$AttributionActionTypeMixin;

