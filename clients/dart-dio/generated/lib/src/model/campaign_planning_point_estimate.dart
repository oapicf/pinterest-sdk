//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_point_estimate.g.dart';

/// A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
///
/// Properties:
/// * [budget] - The budget value of the point.
/// * [doubleY] - Y value as a decimal.
/// * [maxY] - The maximum Y value of the point.
/// * [minY] - The minimum Y value of the point.
/// * [y] - The expected Y value of the point.
@BuiltValue()
abstract class CampaignPlanningPointEstimate implements Built<CampaignPlanningPointEstimate, CampaignPlanningPointEstimateBuilder> {
  /// The budget value of the point.
  @BuiltValueField(wireName: r'budget')
  int get budget;

  /// Y value as a decimal.
  @BuiltValueField(wireName: r'double_y')
  double? get doubleY;

  /// The maximum Y value of the point.
  @BuiltValueField(wireName: r'max_y')
  int? get maxY;

  /// The minimum Y value of the point.
  @BuiltValueField(wireName: r'min_y')
  int? get minY;

  /// The expected Y value of the point.
  @BuiltValueField(wireName: r'y')
  int? get y;

  CampaignPlanningPointEstimate._();

  factory CampaignPlanningPointEstimate([void updates(CampaignPlanningPointEstimateBuilder b)]) = _$CampaignPlanningPointEstimate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningPointEstimateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningPointEstimate> get serializer => _$CampaignPlanningPointEstimateSerializer();
}

class _$CampaignPlanningPointEstimateSerializer implements PrimitiveSerializer<CampaignPlanningPointEstimate> {
  @override
  final Iterable<Type> types = const [CampaignPlanningPointEstimate, _$CampaignPlanningPointEstimate];

  @override
  final String wireName = r'CampaignPlanningPointEstimate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningPointEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'budget';
    yield serializers.serialize(
      object.budget,
      specifiedType: const FullType(int),
    );
    yield r'double_y';
    yield object.doubleY == null ? null : serializers.serialize(
      object.doubleY,
      specifiedType: const FullType.nullable(double),
    );
    yield r'max_y';
    yield object.maxY == null ? null : serializers.serialize(
      object.maxY,
      specifiedType: const FullType.nullable(int),
    );
    yield r'min_y';
    yield object.minY == null ? null : serializers.serialize(
      object.minY,
      specifiedType: const FullType.nullable(int),
    );
    yield r'y';
    yield object.y == null ? null : serializers.serialize(
      object.y,
      specifiedType: const FullType.nullable(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningPointEstimate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningPointEstimateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'budget':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.budget = valueDes;
          break;
        case r'double_y':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.doubleY = valueDes;
          break;
        case r'max_y':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.maxY = valueDes;
          break;
        case r'min_y':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.minY = valueDes;
          break;
        case r'y':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.y = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningPointEstimate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningPointEstimateBuilder();
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

