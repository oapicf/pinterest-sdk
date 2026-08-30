//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'action_type.g.dart';

class ActionType extends EnumClass {

  /// Ad group billable event type. For update, only draft ad groups may update billable event.
  @BuiltValueEnumConst(wireName: r'CLICKTHROUGH')
  static const ActionType CLICKTHROUGH = _$CLICKTHROUGH;
  /// Ad group billable event type. For update, only draft ad groups may update billable event.
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const ActionType IMPRESSION = _$IMPRESSION;
  /// Ad group billable event type. For update, only draft ad groups may update billable event.
  @BuiltValueEnumConst(wireName: r'VIDEO_V_50_MRC')
  static const ActionType VIDEO_V_50_MRC = _$VIDEO_V_50_MRC;

  static Serializer<ActionType> get serializer => _$actionTypeSerializer;

  const ActionType._(String name): super(name);

  static BuiltSet<ActionType> get values => _$values;
  static ActionType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ActionTypeMixin = Object with _$ActionTypeMixin;

