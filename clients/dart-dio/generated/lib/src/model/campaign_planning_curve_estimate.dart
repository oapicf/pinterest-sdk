//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_estimation_type.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/campaign_planning_point_estimate.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_curve_estimate.g.dart';

/// CampaignPlanningCurveEstimate
///
/// Properties:
/// * [estimationType] - Estimation type for campaign planning estimated curve
/// * [points] - The estimation points that make up the estimated curve.
@BuiltValue()
abstract class CampaignPlanningCurveEstimate implements Built<CampaignPlanningCurveEstimate, CampaignPlanningCurveEstimateBuilder> {
  /// Estimation type for campaign planning estimated curve
  @BuiltValueField(wireName: r'estimation_type')
  CampaignPlanningEstimationType? get estimationType;
  // enum estimationTypeEnum {  IMPRESSION,  CLICK,  CONVERSION,  WEEKLY_FREQUENCY,  WEEKLY_REACH,  LIFETIME_FREQUENCY,  LIFETIME_REACH,  CPM,  CPC,  CPA,  };

  /// The estimation points that make up the estimated curve.
  @BuiltValueField(wireName: r'points')
  BuiltList<CampaignPlanningPointEstimate>? get points;

  CampaignPlanningCurveEstimate._();

  factory CampaignPlanningCurveEstimate([void updates(CampaignPlanningCurveEstimateBuilder b)]) = _$CampaignPlanningCurveEstimate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningCurveEstimateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningCurveEstimate> get serializer => _$CampaignPlanningCurveEstimateSerializer();
}

class _$CampaignPlanningCurveEstimateSerializer implements PrimitiveSerializer<CampaignPlanningCurveEstimate> {
  @override
  final Iterable<Type> types = const [CampaignPlanningCurveEstimate, _$CampaignPlanningCurveEstimate];

  @override
  final String wireName = r'CampaignPlanningCurveEstimate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningCurveEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.estimationType != null) {
      yield r'estimation_type';
      yield serializers.serialize(
        object.estimationType,
        specifiedType: const FullType(CampaignPlanningEstimationType),
      );
    }
    if (object.points != null) {
      yield r'points';
      yield serializers.serialize(
        object.points,
        specifiedType: const FullType(BuiltList, [FullType(CampaignPlanningPointEstimate)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningCurveEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningCurveEstimateBuilder result,
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
        case r'points':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignPlanningPointEstimate)]),
          ) as BuiltList<CampaignPlanningPointEstimate>?;
          if (valueDes == null) continue;
          result.points.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningCurveEstimate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningCurveEstimateBuilder();
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

