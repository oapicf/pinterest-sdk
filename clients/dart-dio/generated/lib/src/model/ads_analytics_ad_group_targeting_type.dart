//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_ad_group_targeting_type.g.dart';

/// Reporting targeting type for ad groups
class AdsAnalyticsAdGroupTargetingType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsAdGroupTargetingType KEYWORD = _$KEYWORD;
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsAdGroupTargetingType APPTYPE = _$APPTYPE;
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsAdGroupTargetingType GENDER = _$GENDER;
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsAdGroupTargetingType LOCATION = _$LOCATION;
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsAdGroupTargetingType PLACEMENT = _$PLACEMENT;
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsAdGroupTargetingType COUNTRY = _$COUNTRY;
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsAdGroupTargetingType TARGETED_INTEREST = _$TARGETED_INTEREST;
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsAdGroupTargetingType PINNER_INTEREST = _$PINNER_INTEREST;
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsAdGroupTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsAdGroupTargetingType GEO = _$GEO;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsAdGroupTargetingType AGE_BUCKET = _$AGE_BUCKET;
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsAdGroupTargetingType REGION = _$REGION;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsAdGroupTargetingType AGE_BUCKET_AND_GENDER = _$AGE_BUCKET_AND_GENDER;
  @BuiltValueEnumConst(wireName: r'CREATIVE_ENHANCEMENTS')
  static const AdsAnalyticsAdGroupTargetingType CREATIVE_ENHANCEMENTS = _$CREATIVE_ENHANCEMENTS;

  static Serializer<AdsAnalyticsAdGroupTargetingType> get serializer => _$adsAnalyticsAdGroupTargetingTypeSerializer;

  const AdsAnalyticsAdGroupTargetingType._(String name): super(name);

  static BuiltSet<AdsAnalyticsAdGroupTargetingType> get values => _$values;
  static AdsAnalyticsAdGroupTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsAdGroupTargetingTypeMixin = Object with _$AdsAnalyticsAdGroupTargetingTypeMixin;

