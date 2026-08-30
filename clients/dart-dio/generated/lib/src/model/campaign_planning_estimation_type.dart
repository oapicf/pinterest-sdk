//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_estimation_type.g.dart';

class CampaignPlanningEstimationType extends EnumClass {

  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'IMPRESSION')
  static const CampaignPlanningEstimationType IMPRESSION = _$IMPRESSION;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'CLICK')
  static const CampaignPlanningEstimationType CLICK = _$CLICK;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'CONVERSION')
  static const CampaignPlanningEstimationType CONVERSION = _$CONVERSION;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'WEEKLY_FREQUENCY')
  static const CampaignPlanningEstimationType WEEKLY_FREQUENCY = _$WEEKLY_FREQUENCY;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'WEEKLY_REACH')
  static const CampaignPlanningEstimationType WEEKLY_REACH = _$WEEKLY_REACH;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'LIFETIME_FREQUENCY')
  static const CampaignPlanningEstimationType LIFETIME_FREQUENCY = _$LIFETIME_FREQUENCY;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'LIFETIME_REACH')
  static const CampaignPlanningEstimationType LIFETIME_REACH = _$LIFETIME_REACH;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'CPM')
  static const CampaignPlanningEstimationType CPM = _$CPM;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'CPC')
  static const CampaignPlanningEstimationType CPC = _$CPC;
  /// Estimation type for campaign planning estimated curve
  @BuiltValueEnumConst(wireName: r'CPA')
  static const CampaignPlanningEstimationType CPA = _$CPA;

  static Serializer<CampaignPlanningEstimationType> get serializer => _$campaignPlanningEstimationTypeSerializer;

  const CampaignPlanningEstimationType._(String name): super(name);

  static BuiltSet<CampaignPlanningEstimationType> get values => _$values;
  static CampaignPlanningEstimationType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningEstimationTypeMixin = Object with _$CampaignPlanningEstimationTypeMixin;

