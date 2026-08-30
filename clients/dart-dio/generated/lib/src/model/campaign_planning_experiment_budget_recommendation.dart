//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_planning_budget_recommendation_point.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_experiment_budget_recommendation.g.dart';

/// Experimental budget recommendation for a single experiment version.
///
/// Properties:
/// * [budgetRecommendation] - Recommended budget for this experiment version.
/// * [lifetimeDaysRecommendation] - Recommended lifetime days for this experiment.
/// * [pointEstimations] - Point estimations for this experiment version.
/// * [versionId] - Version identifier for the experiment.
@BuiltValue()
abstract class CampaignPlanningExperimentBudgetRecommendation implements Built<CampaignPlanningExperimentBudgetRecommendation, CampaignPlanningExperimentBudgetRecommendationBuilder> {
  /// Recommended budget for this experiment version.
  @BuiltValueField(wireName: r'budget_recommendation')
  int? get budgetRecommendation;

  /// Recommended lifetime days for this experiment.
  @BuiltValueField(wireName: r'lifetime_days_recommendation')
  int? get lifetimeDaysRecommendation;

  /// Point estimations for this experiment version.
  @BuiltValueField(wireName: r'point_estimations')
  BuiltList<CampaignPlanningBudgetRecommendationPoint>? get pointEstimations;

  /// Version identifier for the experiment.
  @BuiltValueField(wireName: r'version_id')
  String? get versionId;

  CampaignPlanningExperimentBudgetRecommendation._();

  factory CampaignPlanningExperimentBudgetRecommendation([void updates(CampaignPlanningExperimentBudgetRecommendationBuilder b)]) = _$CampaignPlanningExperimentBudgetRecommendation;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningExperimentBudgetRecommendationBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningExperimentBudgetRecommendation> get serializer => _$CampaignPlanningExperimentBudgetRecommendationSerializer();
}

class _$CampaignPlanningExperimentBudgetRecommendationSerializer implements PrimitiveSerializer<CampaignPlanningExperimentBudgetRecommendation> {
  @override
  final Iterable<Type> types = const [CampaignPlanningExperimentBudgetRecommendation, _$CampaignPlanningExperimentBudgetRecommendation];

  @override
  final String wireName = r'CampaignPlanningExperimentBudgetRecommendation';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningExperimentBudgetRecommendation object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.budgetRecommendation != null) {
      yield r'budget_recommendation';
      yield serializers.serialize(
        object.budgetRecommendation,
        specifiedType: const FullType(int),
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
    if (object.versionId != null) {
      yield r'version_id';
      yield serializers.serialize(
        object.versionId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningExperimentBudgetRecommendation object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningExperimentBudgetRecommendationBuilder result,
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
        case r'version_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.versionId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningExperimentBudgetRecommendation deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningExperimentBudgetRecommendationBuilder();
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

