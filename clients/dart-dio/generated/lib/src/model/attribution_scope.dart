//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attribution_scope.g.dart';

class AttributionScope extends EnumClass {

  /// Ad event type used for attribution.
  @BuiltValueEnumConst(wireName: r'view')
  static const AttributionScope view = _$view;
  /// Ad event type used for attribution.
  @BuiltValueEnumConst(wireName: r'engagement')
  static const AttributionScope engagement = _$engagement;
  /// Ad event type used for attribution.
  @BuiltValueEnumConst(wireName: r'click')
  static const AttributionScope click = _$click;

  static Serializer<AttributionScope> get serializer => _$attributionScopeSerializer;

  const AttributionScope._(String name): super(name);

  static BuiltSet<AttributionScope> get values => _$values;
  static AttributionScope valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AttributionScopeMixin = Object with _$AttributionScopeMixin;

