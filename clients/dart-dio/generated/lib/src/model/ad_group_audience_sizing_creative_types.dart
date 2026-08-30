//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_audience_sizing_creative_types.g.dart';

class AdGroupAudienceSizingCreativeTypes extends EnumClass {

  @BuiltValueEnumConst(wireName: r'REGULAR')
  static const AdGroupAudienceSizingCreativeTypes REGULAR = _$REGULAR;
  @BuiltValueEnumConst(wireName: r'VIDEO')
  static const AdGroupAudienceSizingCreativeTypes VIDEO = _$VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOPPING')
  static const AdGroupAudienceSizingCreativeTypes SHOPPING = _$SHOPPING;
  @BuiltValueEnumConst(wireName: r'CAROUSEL')
  static const AdGroupAudienceSizingCreativeTypes CAROUSEL = _$CAROUSEL;
  @BuiltValueEnumConst(wireName: r'MAX_VIDEO')
  static const AdGroupAudienceSizingCreativeTypes MAX_VIDEO = _$MAX_VIDEO;
  @BuiltValueEnumConst(wireName: r'SHOP_THE_PIN')
  static const AdGroupAudienceSizingCreativeTypes SHOP_THE_PIN = _$SHOP_THE_PIN;
  @BuiltValueEnumConst(wireName: r'COLLECTION')
  static const AdGroupAudienceSizingCreativeTypes COLLECTION = _$COLLECTION;
  @BuiltValueEnumConst(wireName: r'IDEA')
  static const AdGroupAudienceSizingCreativeTypes IDEA = _$IDEA;

  static Serializer<AdGroupAudienceSizingCreativeTypes> get serializer => _$adGroupAudienceSizingCreativeTypesSerializer;

  const AdGroupAudienceSizingCreativeTypes._(String name): super(name);

  static BuiltSet<AdGroupAudienceSizingCreativeTypes> get values => _$values;
  static AdGroupAudienceSizingCreativeTypes valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdGroupAudienceSizingCreativeTypesMixin = Object with _$AdGroupAudienceSizingCreativeTypesMixin;

