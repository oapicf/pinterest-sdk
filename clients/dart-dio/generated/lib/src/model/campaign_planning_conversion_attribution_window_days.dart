//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_conversion_attribution_window_days.g.dart';

class CampaignPlanningConversionAttributionWindowDays extends EnumClass {

  /// Conversion attribution window in days.
  @BuiltValueEnumConst(wireName: r'DAYS_0')
  static const CampaignPlanningConversionAttributionWindowDays DAYS_0 = _$DAYS_0;
  /// Conversion attribution window in days.
  @BuiltValueEnumConst(wireName: r'DAYS_1')
  static const CampaignPlanningConversionAttributionWindowDays DAYS_1 = _$DAYS_1;
  /// Conversion attribution window in days.
  @BuiltValueEnumConst(wireName: r'DAYS_7')
  static const CampaignPlanningConversionAttributionWindowDays DAYS_7 = _$DAYS_7;
  /// Conversion attribution window in days.
  @BuiltValueEnumConst(wireName: r'DAYS_30')
  static const CampaignPlanningConversionAttributionWindowDays DAYS_30 = _$DAYS_30;
  /// Conversion attribution window in days.
  @BuiltValueEnumConst(wireName: r'DAYS_60')
  static const CampaignPlanningConversionAttributionWindowDays DAYS_60 = _$DAYS_60;

  static Serializer<CampaignPlanningConversionAttributionWindowDays> get serializer => _$campaignPlanningConversionAttributionWindowDaysSerializer;

  const CampaignPlanningConversionAttributionWindowDays._(String name): super(name);

  static BuiltSet<CampaignPlanningConversionAttributionWindowDays> get values => _$values;
  static CampaignPlanningConversionAttributionWindowDays valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningConversionAttributionWindowDaysMixin = Object with _$CampaignPlanningConversionAttributionWindowDaysMixin;

