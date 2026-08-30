//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_confidence_level_alert_severity.g.dart';

class CampaignPlanningConfidenceLevelAlertSeverity extends EnumClass {

  /// Severity of a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'UNKNOWN')
  static const CampaignPlanningConfidenceLevelAlertSeverity UNKNOWN = _$UNKNOWN;
  /// Severity of a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'LOW_MILD')
  static const CampaignPlanningConfidenceLevelAlertSeverity LOW_MILD = _$LOW_MILD;
  /// Severity of a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'LOW_MODERATE')
  static const CampaignPlanningConfidenceLevelAlertSeverity LOW_MODERATE = _$LOW_MODERATE;
  /// Severity of a confidence level alert on delivery estimates.
  @BuiltValueEnumConst(wireName: r'LOW_SEVERE')
  static const CampaignPlanningConfidenceLevelAlertSeverity LOW_SEVERE = _$LOW_SEVERE;

  static Serializer<CampaignPlanningConfidenceLevelAlertSeverity> get serializer => _$campaignPlanningConfidenceLevelAlertSeveritySerializer;

  const CampaignPlanningConfidenceLevelAlertSeverity._(String name): super(name);

  static BuiltSet<CampaignPlanningConfidenceLevelAlertSeverity> get values => _$values;
  static CampaignPlanningConfidenceLevelAlertSeverity valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningConfidenceLevelAlertSeverityMixin = Object with _$CampaignPlanningConfidenceLevelAlertSeverityMixin;

