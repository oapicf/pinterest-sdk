//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_response_error.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_planning_ad_group_audience_size.dart';
import 'package:openapi/src/model/campaign_planning_curve_estimate.dart';
import 'package:openapi/src/model/campaign_delivery_estimates_derived_metrics.dart';
import 'package:openapi/src/model/campaign_planning_conversion_rate.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_campaign_delivery_estimates_item.g.dart';

/// Delivery estimate result for a single campaign within a bulk request.
///
/// Properties:
/// * [adgroupAudienceSizes] - Range audience sizes for each ad group, in the same order as the ad groups in the request.
/// * [conversionRate] - Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
/// * [conversionRates] - Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
/// * [curves] - Estimated curves. Each curve will pertain to a single estimation type.
/// * [derivedMetrics] 
/// * [errors] - Errors encountered during estimation for this campaign.
/// * [estimateId] - UUID used to track delivery estimates when they are generated as part of a saved campaign.
/// * [maxPotentialSpend] - Maximum potential spend estimate.
@BuiltValue()
abstract class BulkCampaignDeliveryEstimatesItem implements Built<BulkCampaignDeliveryEstimatesItem, BulkCampaignDeliveryEstimatesItemBuilder> {
  /// Range audience sizes for each ad group, in the same order as the ad groups in the request.
  @BuiltValueField(wireName: r'adgroup_audience_sizes')
  BuiltList<CampaignPlanningAdGroupAudienceSize>? get adgroupAudienceSizes;

  /// Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
  @BuiltValueField(wireName: r'conversion_rate')
  double? get conversionRate;

  /// Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
  @BuiltValueField(wireName: r'conversion_rates')
  BuiltList<CampaignPlanningConversionRate>? get conversionRates;

  /// Estimated curves. Each curve will pertain to a single estimation type.
  @BuiltValueField(wireName: r'curves')
  BuiltList<CampaignPlanningCurveEstimate>? get curves;

  @BuiltValueField(wireName: r'derived_metrics')
  CampaignDeliveryEstimatesDerivedMetrics? get derivedMetrics;

  /// Errors encountered during estimation for this campaign.
  @BuiltValueField(wireName: r'errors')
  BuiltList<CampaignPlanningResponseError>? get errors;

  /// UUID used to track delivery estimates when they are generated as part of a saved campaign.
  @BuiltValueField(wireName: r'estimate_id')
  String? get estimateId;

  /// Maximum potential spend estimate.
  @BuiltValueField(wireName: r'max_potential_spend')
  int? get maxPotentialSpend;

  BulkCampaignDeliveryEstimatesItem._();

  factory BulkCampaignDeliveryEstimatesItem([void updates(BulkCampaignDeliveryEstimatesItemBuilder b)]) = _$BulkCampaignDeliveryEstimatesItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkCampaignDeliveryEstimatesItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkCampaignDeliveryEstimatesItem> get serializer => _$BulkCampaignDeliveryEstimatesItemSerializer();
}

class _$BulkCampaignDeliveryEstimatesItemSerializer implements PrimitiveSerializer<BulkCampaignDeliveryEstimatesItem> {
  @override
  final Iterable<Type> types = const [BulkCampaignDeliveryEstimatesItem, _$BulkCampaignDeliveryEstimatesItem];

  @override
  final String wireName = r'BulkCampaignDeliveryEstimatesItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkCampaignDeliveryEstimatesItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adgroupAudienceSizes != null) {
      yield r'adgroup_audience_sizes';
      yield serializers.serialize(
        object.adgroupAudienceSizes,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningAdGroupAudienceSize)]),
      );
    }
    if (object.conversionRate != null) {
      yield r'conversion_rate';
      yield serializers.serialize(
        object.conversionRate,
        specifiedType: const FullType(double),
      );
    }
    if (object.conversionRates != null) {
      yield r'conversion_rates';
      yield serializers.serialize(
        object.conversionRates,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningConversionRate)]),
      );
    }
    if (object.curves != null) {
      yield r'curves';
      yield serializers.serialize(
        object.curves,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningCurveEstimate)]),
      );
    }
    if (object.derivedMetrics != null) {
      yield r'derived_metrics';
      yield serializers.serialize(
        object.derivedMetrics,
        specifiedType: const FullType(CampaignDeliveryEstimatesDerivedMetrics),
      );
    }
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningResponseError)]),
      );
    }
    if (object.estimateId != null) {
      yield r'estimate_id';
      yield serializers.serialize(
        object.estimateId,
        specifiedType: const FullType(String),
      );
    }
    if (object.maxPotentialSpend != null) {
      yield r'max_potential_spend';
      yield serializers.serialize(
        object.maxPotentialSpend,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkCampaignDeliveryEstimatesItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkCampaignDeliveryEstimatesItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'adgroup_audience_sizes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningAdGroupAudienceSize)]),
          ) as BuiltList<CampaignPlanningAdGroupAudienceSize>?;
          if (valueDes == null) continue;
          result.adgroupAudienceSizes.replace(valueDes);
          break;
        case r'conversion_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.conversionRate = valueDes;
          break;
        case r'conversion_rates':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningConversionRate)]),
          ) as BuiltList<CampaignPlanningConversionRate>?;
          if (valueDes == null) continue;
          result.conversionRates.replace(valueDes);
          break;
        case r'curves':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningCurveEstimate)]),
          ) as BuiltList<CampaignPlanningCurveEstimate>?;
          if (valueDes == null) continue;
          result.curves.replace(valueDes);
          break;
        case r'derived_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignDeliveryEstimatesDerivedMetrics),
          ) as CampaignDeliveryEstimatesDerivedMetrics?;
          if (valueDes == null) continue;
          result.derivedMetrics.replace(valueDes);
          break;
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningResponseError)]),
          ) as BuiltList<CampaignPlanningResponseError>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'estimate_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.estimateId = valueDes;
          break;
        case r'max_potential_spend':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxPotentialSpend = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkCampaignDeliveryEstimatesItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkCampaignDeliveryEstimatesItemBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

