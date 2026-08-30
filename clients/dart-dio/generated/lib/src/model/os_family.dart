//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'os_family.g.dart';

class OsFamily extends EnumClass {

  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'ios')
  static const OsFamily ios = _$ios;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'android')
  static const OsFamily android = _$android;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'macos')
  static const OsFamily macos = _$macos;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'windows')
  static const OsFamily windows = _$windows;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'linux')
  static const OsFamily linux = _$linux;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'bsd')
  static const OsFamily bsd = _$bsd;
  /// Operating system family.
  @BuiltValueEnumConst(wireName: r'other')
  static const OsFamily other = _$other;

  static Serializer<OsFamily> get serializer => _$osFamilySerializer;

  const OsFamily._(String name): super(name);

  static BuiltSet<OsFamily> get values => _$values;
  static OsFamily valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class OsFamilyMixin = Object with _$OsFamilyMixin;

