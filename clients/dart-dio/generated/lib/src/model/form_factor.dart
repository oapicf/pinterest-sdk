//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'form_factor.g.dart';

class FormFactor extends EnumClass {

  /// Device form factor
  @BuiltValueEnumConst(wireName: r'desktop')
  static const FormFactor desktop = _$desktop;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'laptop')
  static const FormFactor laptop = _$laptop;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'cellphone')
  static const FormFactor cellphone = _$cellphone;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'tablet')
  static const FormFactor tablet = _$tablet;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'smartwatch')
  static const FormFactor smartwatch = _$smartwatch;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'tv')
  static const FormFactor tv = _$tv;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'vr')
  static const FormFactor vr = _$vr;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'console')
  static const FormFactor console = _$console;
  /// Device form factor
  @BuiltValueEnumConst(wireName: r'other')
  static const FormFactor other = _$other;

  static Serializer<FormFactor> get serializer => _$formFactorSerializer;

  const FormFactor._(String name): super(name);

  static BuiltSet<FormFactor> get values => _$values;
  static FormFactor valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class FormFactorMixin = Object with _$FormFactorMixin;

