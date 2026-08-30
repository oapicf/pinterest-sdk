//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_conversion_event.g.dart';

class CampaignPlanningConversionEvent extends EnumClass {

  /// Conversion event for which a conversion rate estimate is computed.
  @BuiltValueEnumConst(wireName: r'SIGNUP')
  static const CampaignPlanningConversionEvent SIGNUP = _$SIGNUP;
  /// Conversion event for which a conversion rate estimate is computed.
  @BuiltValueEnumConst(wireName: r'CHECKOUT')
  static const CampaignPlanningConversionEvent CHECKOUT = _$CHECKOUT;
  /// Conversion event for which a conversion rate estimate is computed.
  @BuiltValueEnumConst(wireName: r'ADD_TO_CART')
  static const CampaignPlanningConversionEvent ADD_TO_CART = _$ADD_TO_CART;
  /// Conversion event for which a conversion rate estimate is computed.
  @BuiltValueEnumConst(wireName: r'LEAD')
  static const CampaignPlanningConversionEvent LEAD = _$LEAD;

  static Serializer<CampaignPlanningConversionEvent> get serializer => _$campaignPlanningConversionEventSerializer;

  const CampaignPlanningConversionEvent._(String name): super(name);

  static BuiltSet<CampaignPlanningConversionEvent> get values => _$values;
  static CampaignPlanningConversionEvent valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CampaignPlanningConversionEventMixin = Object with _$CampaignPlanningConversionEventMixin;

