//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_event_mapping_type.g.dart';

/// Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
class AdvertiserDefinedEventMappingType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const AdvertiserDefinedEventMappingType SIGNUP = _$SIGNUP;
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const AdvertiserDefinedEventMappingType ADD_TO_CART = _$ADD_TO_CART;
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const AdvertiserDefinedEventMappingType LEAD = _$LEAD;
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const AdvertiserDefinedEventMappingType CHECKOUT = _$CHECKOUT;
  @BuiltValueEnumConst(wireName: r'SUBSCRIBE')
  static const AdvertiserDefinedEventMappingType SUBSCRIBE = _$SUBSCRIBE;
  @BuiltValueEnumConst(wireName: r'ADD_TO_WISHLIST')
  static const AdvertiserDefinedEventMappingType ADD_TO_WISHLIST = _$ADD_TO_WISHLIST;
  @BuiltValueEnumConst(wireName: r'ADD_PAYMENT_INFO')
  static const AdvertiserDefinedEventMappingType ADD_PAYMENT_INFO = _$ADD_PAYMENT_INFO;
  @BuiltValueEnumConst(wireName: r'INITIATE_CHECKOUT')
  static const AdvertiserDefinedEventMappingType INITIATE_CHECKOUT = _$INITIATE_CHECKOUT;
  @BuiltValueEnumConst(wireName: r'CONTACT')
  static const AdvertiserDefinedEventMappingType CONTACT = _$CONTACT;
  @BuiltValueEnumConst(wireName: r'CUSTOMIZE_PRODUCT')
  static const AdvertiserDefinedEventMappingType CUSTOMIZE_PRODUCT = _$CUSTOMIZE_PRODUCT;
  @BuiltValueEnumConst(wireName: r'FIND_LOCATION')
  static const AdvertiserDefinedEventMappingType FIND_LOCATION = _$FIND_LOCATION;
  @BuiltValueEnumConst(wireName: r'SCHEDULE')
  static const AdvertiserDefinedEventMappingType SCHEDULE = _$SCHEDULE;
  @BuiltValueEnumConst(wireName: r'SUBMIT_APPLICATION')
  static const AdvertiserDefinedEventMappingType SUBMIT_APPLICATION = _$SUBMIT_APPLICATION;
  @BuiltValueEnumConst(wireName: r'START_TRIAL')
  static const AdvertiserDefinedEventMappingType START_TRIAL = _$START_TRIAL;
  @BuiltValueEnumConst(wireName: r'PAGE_VISIT')
  static const AdvertiserDefinedEventMappingType PAGE_VISIT = _$PAGE_VISIT;
  @BuiltValueEnumConst(wireName: r'VIEW_CATEGORY')
  static const AdvertiserDefinedEventMappingType VIEW_CATEGORY = _$VIEW_CATEGORY;
  @BuiltValueEnumConst(wireName: r'VIEW_CONTENT')
  static const AdvertiserDefinedEventMappingType VIEW_CONTENT = _$VIEW_CONTENT;
  @BuiltValueEnumConst(wireName: r'SEARCH')
  static const AdvertiserDefinedEventMappingType SEARCH = _$SEARCH;
  @BuiltValueEnumConst(wireName: r'WATCH_VIDEO')
  static const AdvertiserDefinedEventMappingType WATCH_VIDEO = _$WATCH_VIDEO;

  static Serializer<AdvertiserDefinedEventMappingType> get serializer => _$advertiserDefinedEventMappingTypeSerializer;

  const AdvertiserDefinedEventMappingType._(String name): super(name);

  static BuiltSet<AdvertiserDefinedEventMappingType> get values => _$values;
  static AdvertiserDefinedEventMappingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdvertiserDefinedEventMappingTypeMixin = Object with _$AdvertiserDefinedEventMappingTypeMixin;

