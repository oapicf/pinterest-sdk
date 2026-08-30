//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'attribution_model.g.dart';

class AttributionModel extends EnumClass {

  /// Attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'first_touch')
  static const AttributionModel firstTouch = _$firstTouch;
  /// Attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'last_touch')
  static const AttributionModel lastTouch = _$lastTouch;
  /// Attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'multi_touch')
  static const AttributionModel multiTouch = _$multiTouch;
  /// Attribution model used to attribute the conversion event.
  @BuiltValueEnumConst(wireName: r'mmm')
  static const AttributionModel mmm = _$mmm;

  static Serializer<AttributionModel> get serializer => _$attributionModelSerializer;

  const AttributionModel._(String name): super(name);

  static BuiltSet<AttributionModel> get values => _$values;
  static AttributionModel valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AttributionModelMixin = Object with _$AttributionModelMixin;

