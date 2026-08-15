//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_campaign_targeting_type.g.dart';

class AdsAnalyticsCampaignTargetingType extends EnumClass {

  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsCampaignTargetingType KEYWORD = _$KEYWORD;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsCampaignTargetingType APPTYPE = _$APPTYPE;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsCampaignTargetingType GENDER = _$GENDER;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsCampaignTargetingType LOCATION = _$LOCATION;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsCampaignTargetingType PLACEMENT = _$PLACEMENT;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsCampaignTargetingType COUNTRY = _$COUNTRY;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsCampaignTargetingType TARGETED_INTEREST = _$TARGETED_INTEREST;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsCampaignTargetingType PINNER_INTEREST = _$PINNER_INTEREST;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsCampaignTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsCampaignTargetingType GEO = _$GEO;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsCampaignTargetingType AGE_BUCKET = _$AGE_BUCKET;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsCampaignTargetingType REGION = _$REGION;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'CREATIVE_TYPE')
  static const AdsAnalyticsCampaignTargetingType CREATIVE_TYPE = _$CREATIVE_TYPE;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsCampaignTargetingType AGE_BUCKET_AND_GENDER = _$AGE_BUCKET_AND_GENDER;
  /// Reporting targeting type for campaigns
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MULTIPLIER')
  static const AdsAnalyticsCampaignTargetingType AUDIENCE_MULTIPLIER = _$AUDIENCE_MULTIPLIER;

  static Serializer<AdsAnalyticsCampaignTargetingType> get serializer => _$adsAnalyticsCampaignTargetingTypeSerializer;

  const AdsAnalyticsCampaignTargetingType._(String name): super(name);

  static BuiltSet<AdsAnalyticsCampaignTargetingType> get values => _$values;
  static AdsAnalyticsCampaignTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsCampaignTargetingTypeMixin = Object with _$AdsAnalyticsCampaignTargetingTypeMixin;

