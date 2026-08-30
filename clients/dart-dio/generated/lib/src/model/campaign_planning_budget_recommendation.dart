//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_experiment_budget_recommendation.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_planning_budget_recommendation_point.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_budget_recommendation.g.dart';

/// Budget recommendation response containing recommended budget, estimated days, and point estimations.
///
/// Properties:
/// * [budgetRecommendation] - The recommended budget amount.
/// * [experimentCampaignBudgetRecommendation] - List of experimental budget recommendations.
/// * [lifetimeDaysRecommendation] - Recommended number of days for the campaign lifetime.
/// * [pointEstimations] - List of point estimations for different budget scenarios.
@BuiltValue()
abstract class CampaignPlanningBudgetRecommendation implements Built<CampaignPlanningBudgetRecommendation, CampaignPlanningBudgetRecommendationBuilder> {
  /// The recommended budget amount.
  @BuiltValueField(wireName: r'budget_recommendation')
  int? get budgetRecommendation;

  /// List of experimental budget recommendations.
  @BuiltValueField(wireName: r'experiment_campaign_budget_recommendation')
  BuiltList<CampaignPlanningExperimentBudgetRecommendation>? get experimentCampaignBudgetRecommendation;

  /// Recommended number of days for the campaign lifetime.
  @BuiltValueField(wireName: r'lifetime_days_recommendation')
  int? get lifetimeDaysRecommendation;

  /// List of point estimations for different budget scenarios.
  @BuiltValueField(wireName: r'point_estimations')
  BuiltList<CampaignPlanningBudgetRecommendationPoint>? get pointEstimations;

  CampaignPlanningBudgetRecommendation._();

  factory CampaignPlanningBudgetRecommendation([void updates(CampaignPlanningBudgetRecommendationBuilder b)]) = _$CampaignPlanningBudgetRecommendation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningBudgetRecommendationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningBudgetRecommendation> get serializer => _$CampaignPlanningBudgetRecommendationSerializer();
}

class _$CampaignPlanningBudgetRecommendationSerializer implements PrimitiveSerializer<CampaignPlanningBudgetRecommendation> {
  @override
  final Iterable<Type> types = const [CampaignPlanningBudgetRecommendation, _$CampaignPlanningBudgetRecommendation];

  @override
  final String wireName = r'CampaignPlanningBudgetRecommendation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningBudgetRecommendation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.budgetRecommendation != null) {
      yield r'budget_recommendation';
      yield serializers.serialize(
        object.budgetRecommendation,
        specifiedType: const FullType(int),
      );
    }
    if (object.experimentCampaignBudgetRecommendation != null) {
      yield r'experiment_campaign_budget_recommendation';
      yield serializers.serialize(
        object.experimentCampaignBudgetRecommendation,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningExperimentBudgetRecommendation)]),
      );
    }
    if (object.lifetimeDaysRecommendation != null) {
      yield r'lifetime_days_recommendation';
      yield serializers.serialize(
        object.lifetimeDaysRecommendation,
        specifiedType: const FullType(int),
      );
    }
    if (object.pointEstimations != null) {
      yield r'point_estimations';
      yield serializers.serialize(
        object.pointEstimations,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningBudgetRecommendationPoint)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningBudgetRecommendation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningBudgetRecommendationBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'budget_recommendation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.budgetRecommendation = valueDes;
          break;
        case r'experiment_campaign_budget_recommendation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningExperimentBudgetRecommendation)]),
          ) as BuiltList<CampaignPlanningExperimentBudgetRecommendation>?;
          if (valueDes == null) continue;
          result.experimentCampaignBudgetRecommendation.replace(valueDes);
          break;
        case r'lifetime_days_recommendation':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeDaysRecommendation = valueDes;
          break;
        case r'point_estimations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningBudgetRecommendationPoint)]),
          ) as BuiltList<CampaignPlanningBudgetRecommendationPoint>?;
          if (valueDes == null) continue;
          result.pointEstimations.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningBudgetRecommendation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningBudgetRecommendationBuilder();
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

