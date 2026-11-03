//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_tag_type.g.dart';

/// conversion tag type
class ConversionTagType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'PAGE_LOAD')
  static const ConversionTagType PAGE_LOAD = _$PAGE_LOAD;
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const ConversionTagType UNKNOWN = _$UNKNOWN;
  @BuiltValueEnumConst(wireName: r'INITIALIZED')
  static const ConversionTagType INITIALIZED = _$INITIALIZED;
  @BuiltValueEnumConst(wireName: r'PAGE_VISIT')
  static const ConversionTagType PAGE_VISIT = _$PAGE_VISIT;
  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const ConversionTagType SIGNUP = _$SIGNUP;
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const ConversionTagType CHECKOUT = _$CHECKOUT;
  @BuiltValueEnumConst(wireName: r'CUSTOM')
  static const ConversionTagType CUSTOM = _$CUSTOM;
  @BuiltValueEnumConst(wireName: r'VIEW_CATEGORY')
  static const ConversionTagType VIEW_CATEGORY = _$VIEW_CATEGORY;
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const ConversionTagType SEARCH = _$SEARCH;
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const ConversionTagType ADD_TO_CART = _$ADD_TO_CART;
  @BuiltValueEnumConst(wireName: r'WATCH_VIDEO')
  static const ConversionTagType WATCH_VIDEO = _$WATCH_VIDEO;
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const ConversionTagType LEAD = _$LEAD;
  @BuiltValueEnumConst(wireName: r'APP_INSTALL')
  static const ConversionTagType APP_INSTALL = _$APP_INSTALL;
  @BuiltValueEnumConst(wireName: r'WEB_SESSION')
  static const ConversionTagType WEB_SESSION = _$WEB_SESSION;
  @BuiltValueEnumConst(wireName: r'EXTERNAL_MEASUREMENT')
  static const ConversionTagType EXTERNAL_MEASUREMENT = _$EXTERNAL_MEASUREMENT;
  @BuiltValueEnumConst(wireName: r'ADD_PAYMENT_INFO')
  static const ConversionTagType ADD_PAYMENT_INFO = _$ADD_PAYMENT_INFO;
  @BuiltValueEnumConst(wireName: r'ADD_TO_WISHLIST')
  static const ConversionTagType ADD_TO_WISHLIST = _$ADD_TO_WISHLIST;
  @BuiltValueEnumConst(wireName: r'INITIATE_CHECKOUT')
  static const ConversionTagType INITIATE_CHECKOUT = _$INITIATE_CHECKOUT;
  @BuiltValueEnumConst(wireName: r'SUBSCRIBE')
  static const ConversionTagType SUBSCRIBE = _$SUBSCRIBE;
  @BuiltValueEnumConst(wireName: r'VIEW_CONTENT')
  static const ConversionTagType VIEW_CONTENT = _$VIEW_CONTENT;
  @BuiltValueEnumConst(wireName: r'ADVERTISER_DEFINED_EVENT')
  static const ConversionTagType ADVERTISER_DEFINED_EVENT = _$ADVERTISER_DEFINED_EVENT;
  @BuiltValueEnumConst(wireName: r'APP_OPEN')
  static const ConversionTagType APP_OPEN = _$APP_OPEN;
  @BuiltValueEnumConst(wireName: r'CONTACT')
  static const ConversionTagType CONTACT = _$CONTACT;
  @BuiltValueEnumConst(wireName: r'SCHEDULE')
  static const ConversionTagType SCHEDULE = _$SCHEDULE;
  @BuiltValueEnumConst(wireName: r'FIND_LOCATION')
  static const ConversionTagType FIND_LOCATION = _$FIND_LOCATION;
  @BuiltValueEnumConst(wireName: r'CUSTOMIZE_PRODUCT')
  static const ConversionTagType CUSTOMIZE_PRODUCT = _$CUSTOMIZE_PRODUCT;
  @BuiltValueEnumConst(wireName: r'SUBMIT_APPLICATION')
  static const ConversionTagType SUBMIT_APPLICATION = _$SUBMIT_APPLICATION;
  @BuiltValueEnumConst(wireName: r'START_TRIAL')
  static const ConversionTagType START_TRIAL = _$START_TRIAL;

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

