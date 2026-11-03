//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_ad_targeting_type.g.dart';

/// Reporting targeting type for ads
class AdsAnalyticsAdTargetingType extends EnumClass {

  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsAdTargetingType KEYWORD = _$KEYWORD;
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsAdTargetingType APPTYPE = _$APPTYPE;
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsAdTargetingType GENDER = _$GENDER;
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsAdTargetingType LOCATION = _$LOCATION;
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsAdTargetingType PLACEMENT = _$PLACEMENT;
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsAdTargetingType COUNTRY = _$COUNTRY;
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsAdTargetingType TARGETED_INTEREST = _$TARGETED_INTEREST;
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsAdTargetingType PINNER_INTEREST = _$PINNER_INTEREST;
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsAdTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsAdTargetingType GEO = _$GEO;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsAdTargetingType AGE_BUCKET = _$AGE_BUCKET;
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsAdTargetingType REGION = _$REGION;
  @BuiltValueEnumConst(wireName: r'QUIZ_RESULT')
  static const AdsAnalyticsAdTargetingType QUIZ_RESULT = _$QUIZ_RESULT;
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsAdTargetingType AGE_BUCKET_AND_GENDER = _$AGE_BUCKET_AND_GENDER;

  static Serializer<AdsAnalyticsAdTargetingType> get serializer => _$adsAnalyticsAdTargetingTypeSerializer;

  const AdsAnalyticsAdTargetingType._(String name): super(name);

  static BuiltSet<AdsAnalyticsAdTargetingType> get values => _$values;
  static AdsAnalyticsAdTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsAdTargetingTypeMixin = Object with _$AdsAnalyticsAdTargetingTypeMixin;

