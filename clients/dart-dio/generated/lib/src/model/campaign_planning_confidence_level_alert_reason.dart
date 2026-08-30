//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_confidence_level_alert_reason.g.dart';

class CampaignPlanningConfidenceLevelAlertReason extends EnumClass {

  /// Reason for a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const CampaignPlanningConfidenceLevelAlertReason UNKNOWN = _$UNKNOWN;
  /// Reason for a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'OTHER')
  static const CampaignPlanningConfidenceLevelAlertReason OTHER = _$OTHER;
  /// Reason for a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'ADVERTISER_HAS_NO_RECENT_CAMPAIGNS')
  static const CampaignPlanningConfidenceLevelAlertReason ADVERTISER_HAS_NO_RECENT_CAMPAIGNS = _$ADVERTISER_HAS_NO_RECENT_CAMPAIGNS;
  /// Reason for a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'ADVERTISER_HAS_NO_RECENT_CONVERSIONS')
  static const CampaignPlanningConfidenceLevelAlertReason ADVERTISER_HAS_NO_RECENT_CONVERSIONS = _$ADVERTISER_HAS_NO_RECENT_CONVERSIONS;

  static Serializer<CampaignPlanningConfidenceLevelAlertReason> get serializer => _$campaignPlanningConfidenceLevelAlertReasonSerializer;

  const CampaignPlanningConfidenceLevelAlertReason._(String name): super(name);

  static BuiltSet<CampaignPlanningConfidenceLevelAlertReason> get values => _$values;
  static CampaignPlanningConfidenceLevelAlertReason valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningConfidenceLevelAlertReasonMixin = Object with _$CampaignPlanningConfidenceLevelAlertReasonMixin;

