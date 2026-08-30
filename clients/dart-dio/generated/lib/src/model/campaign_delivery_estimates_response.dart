//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_planning_curve_estimate.dart';
import 'package:openapi/src/model/campaign_delivery_estimates_derived_metrics.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_delivery_estimates_response.g.dart';

/// Delivery estimates response for a campaign.
///
/// Properties:
/// * [curves] - Estimated curves. Each curve will pertain to a single estimation type.
/// * [derivedMetrics] 
/// * [maxPotentialSpend] - Maximum potential spend estimate.
@BuiltValue()
abstract class CampaignDeliveryEstimatesResponse implements Built<CampaignDeliveryEstimatesResponse, CampaignDeliveryEstimatesResponseBuilder> {
  /// Estimated curves. Each curve will pertain to a single estimation type.
  @BuiltValueField(wireName: r'curves')
  BuiltList<CampaignPlanningCurveEstimate>? get curves;

  @BuiltValueField(wireName: r'derived_metrics')
  CampaignDeliveryEstimatesDerivedMetrics? get derivedMetrics;

  /// Maximum potential spend estimate.
  @BuiltValueField(wireName: r'max_potential_spend')
  int? get maxPotentialSpend;

  CampaignDeliveryEstimatesResponse._();

  factory CampaignDeliveryEstimatesResponse([void updates(CampaignDeliveryEstimatesResponseBuilder b)]) = _$CampaignDeliveryEstimatesResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignDeliveryEstimatesResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignDeliveryEstimatesResponse> get serializer => _$CampaignDeliveryEstimatesResponseSerializer();
}

class _$CampaignDeliveryEstimatesResponseSerializer implements PrimitiveSerializer<CampaignDeliveryEstimatesResponse> {
  @override
  final Iterable<Type> types = const [CampaignDeliveryEstimatesResponse, _$CampaignDeliveryEstimatesResponse];

  @override
  final String wireName = r'CampaignDeliveryEstimatesResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignDeliveryEstimatesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    CampaignDeliveryEstimatesResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignDeliveryEstimatesResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  CampaignDeliveryEstimatesResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignDeliveryEstimatesResponseBuilder();
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

