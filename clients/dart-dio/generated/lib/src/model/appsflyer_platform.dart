//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'appsflyer_platform.g.dart';

class AppsflyerPlatform extends EnumClass {

  /// Platform options for AppsFlyer audience
  @BuiltValueEnumConst(wireName: r'android')
  static const AppsflyerPlatform android = _$android;
  /// Platform options for AppsFlyer audience
  @BuiltValueEnumConst(wireName: r'ios')
  static const AppsflyerPlatform ios = _$ios;

  static Serializer<AppsflyerPlatform> get serializer => _$appsflyerPlatformSerializer;

  const AppsflyerPlatform._(String name): super(name);

  static BuiltSet<AppsflyerPlatform> get values => _$values;
  static AppsflyerPlatform valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AppsflyerPlatformMixin = Object with _$AppsflyerPlatformMixin;

