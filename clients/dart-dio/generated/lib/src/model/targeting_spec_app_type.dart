//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'targeting_spec_app_type.g.dart';

class TargetingSpecAppType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'android_mobile')
  static const TargetingSpecAppType androidMobile = _$androidMobile;
  @BuiltValueEnumConst(wireName: r'android_tablet')
  static const TargetingSpecAppType androidTablet = _$androidTablet;
  @BuiltValueEnumConst(wireName: r'ipad')
  static const TargetingSpecAppType ipad = _$ipad;
  @BuiltValueEnumConst(wireName: r'iphone')
  static const TargetingSpecAppType iphone = _$iphone;
  @BuiltValueEnumConst(wireName: r'web')
  static const TargetingSpecAppType web = _$web;
  @BuiltValueEnumConst(wireName: r'web_mobile')
  static const TargetingSpecAppType webMobile = _$webMobile;

  static Serializer<TargetingSpecAppType> get serializer => _$targetingSpecAppTypeSerializer;

  const TargetingSpecAppType._(String name): super(name);

  static BuiltSet<TargetingSpecAppType> get values => _$values;
  static TargetingSpecAppType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TargetingSpecAppTypeMixin = Object with _$TargetingSpecAppTypeMixin;

