//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'mobile_app_platform.g.dart';

class MobileAppPlatform extends EnumClass {

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
  @BuiltValueEnumConst(wireName: r'IOS')
  static const MobileAppPlatform IOS = _$IOS;
  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for an `APP_INSTALL` campaign.
  @BuiltValueEnumConst(wireName: r'ANDROID')
  static const MobileAppPlatform ANDROID = _$ANDROID;

  static Serializer<MobileAppPlatform> get serializer => _$mobileAppPlatformSerializer;

  const MobileAppPlatform._(String name): super(name);

  static BuiltSet<MobileAppPlatform> get values => _$values;
  static MobileAppPlatform valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class MobileAppPlatformMixin = Object with _$MobileAppPlatformMixin;

