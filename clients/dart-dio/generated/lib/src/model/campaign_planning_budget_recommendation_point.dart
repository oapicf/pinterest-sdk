//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_estimation_type.dart';
import 'package:openapi/src/model/campaign_planning_point_estimate.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_budget_recommendation_point.g.dart';

/// A point estimation containing the estimate data and estimation type for a budget recommendation.
///
/// Properties:
/// * [estimationType] - Estimation type for this point.
/// * [pointEstimate] - Point estimate data.
@BuiltValue()
abstract class CampaignPlanningBudgetRecommendationPoint implements Built<CampaignPlanningBudgetRecommendationPoint, CampaignPlanningBudgetRecommendationPointBuilder> {
  /// Estimation type for this point.
  @BuiltValueField(wireName: r'estimation_type')
  CampaignPlanningEstimationType? get estimationType;
  // enum estimationTypeEnum {  IMPRESSION,  CLICK,  CONVERSION,  WEEKLY_FREQUENCY,  WEEKLY_REACH,  LIFETIME_FREQUENCY,  LIFETIME_REACH,  CPM,  CPC,  CPA,  };

  /// Point estimate data.
  @BuiltValueField(wireName: r'point_estimate')
  CampaignPlanningPointEstimate? get pointEstimate;

  CampaignPlanningBudgetRecommendationPoint._();

  factory CampaignPlanningBudgetRecommendationPoint([void updates(CampaignPlanningBudgetRecommendationPointBuilder b)]) = _$CampaignPlanningBudgetRecommendationPoint;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningBudgetRecommendationPointBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningBudgetRecommendationPoint> get serializer => _$CampaignPlanningBudgetRecommendationPointSerializer();
}

class _$CampaignPlanningBudgetRecommendationPointSerializer implements PrimitiveSerializer<CampaignPlanningBudgetRecommendationPoint> {
  @override
  final Iterable<Type> types = const [CampaignPlanningBudgetRecommendationPoint, _$CampaignPlanningBudgetRecommendationPoint];

  @override
  final String wireName = r'CampaignPlanningBudgetRecommendationPoint';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningBudgetRecommendationPoint object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.estimationType != null) {
      yield r'estimation_type';
      yield serializers.serialize(
        object.estimationType,
        specifiedType: const FullType(CampaignPlanningEstimationType),
      );
    }
    if (object.pointEstimate != null) {
      yield r'point_estimate';
      yield serializers.serialize(
        object.pointEstimate,
        specifiedType: const FullType(CampaignPlanningPointEstimate),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningBudgetRecommendationPoint object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningBudgetRecommendationPointBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'estimation_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningEstimationType),
          ) as CampaignPlanningEstimationType?;
          if (valueDes == null) continue;
          result.estimationType = valueDes;
          break;
        case r'point_estimate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningPointEstimate),
          ) as CampaignPlanningPointEstimate?;
          if (valueDes == null) continue;
          result.pointEstimate.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningBudgetRecommendationPoint deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningBudgetRecommendationPointBuilder();
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

