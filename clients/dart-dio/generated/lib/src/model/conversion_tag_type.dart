//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_type.g.dart';

class ConversionTagType extends EnumClass {

  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'PAGE_LOAD')
  static const ConversionTagType PAGE_LOAD = _$PAGE_LOAD;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const ConversionTagType UNKNOWN = _$UNKNOWN;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'INITIALIZED')
  static const ConversionTagType INITIALIZED = _$INITIALIZED;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'PAGE_VISIT')
  static const ConversionTagType PAGE_VISIT = _$PAGE_VISIT;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const ConversionTagType SIGNUP = _$SIGNUP;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const ConversionTagType CHECKOUT = _$CHECKOUT;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const ConversionTagType CUSTOM = _$CUSTOM;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'VIEW_CATEGORY')
  static const ConversionTagType VIEW_CATEGORY = _$VIEW_CATEGORY;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const ConversionTagType SEARCH = _$SEARCH;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const ConversionTagType ADD_TO_CART = _$ADD_TO_CART;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'WATCH_VIDEO')
  static const ConversionTagType WATCH_VIDEO = _$WATCH_VIDEO;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const ConversionTagType LEAD = _$LEAD;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'APP_INSTALL')
  static const ConversionTagType APP_INSTALL = _$APP_INSTALL;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'WEB_SESSION')
  static const ConversionTagType WEB_SESSION = _$WEB_SESSION;
  /// conversion tag type
  @BuiltValueEnumConst(wireName: r'EXTERNAL_MEASUREMENT')
  static const ConversionTagType EXTERNAL_MEASUREMENT = _$EXTERNAL_MEASUREMENT;

  static Serializer<ConversionTagType> get serializer => _$conversionTagTypeSerializer;

  const ConversionTagType._(String name): super(name);

  static BuiltSet<ConversionTagType> get values => _$values;
  static ConversionTagType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class ConversionTagTypeMixin = Object with _$ConversionTagTypeMixin;

