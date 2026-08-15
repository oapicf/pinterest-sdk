//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'source_platform_options.g.dart';

class SourcePlatformOptions extends EnumClass {

  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'WEB')
  static const SourcePlatformOptions WEB = _$WEB;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'MOBILE')
  static const SourcePlatformOptions MOBILE = _$MOBILE;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'MOBILE_ANDROID')
  static const SourcePlatformOptions MOBILE_ANDROID = _$MOBILE_ANDROID;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'MOBILE_IOS')
  static const SourcePlatformOptions MOBILE_IOS = _$MOBILE_IOS;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'OFFLINE')
  static const SourcePlatformOptions OFFLINE = _$OFFLINE;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'PINTEREST_WEB')
  static const SourcePlatformOptions PINTEREST_WEB = _$PINTEREST_WEB;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'PINTEREST_ANDROID')
  static const SourcePlatformOptions PINTEREST_ANDROID = _$PINTEREST_ANDROID;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'PINTEREST_IOS')
  static const SourcePlatformOptions PINTEREST_IOS = _$PINTEREST_IOS;
  /// List of source platforms for a conversion event.
  @BuiltValueEnumConst(wireName: r'POINT_OF_SALE')
  static const SourcePlatformOptions POINT_OF_SALE = _$POINT_OF_SALE;

  static Serializer<SourcePlatformOptions> get serializer => _$sourcePlatformOptionsSerializer;

  const SourcePlatformOptions._(String name): super(name);

  static BuiltSet<SourcePlatformOptions> get values => _$values;
  static SourcePlatformOptions valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class SourcePlatformOptionsMixin = Object with _$SourcePlatformOptionsMixin;

