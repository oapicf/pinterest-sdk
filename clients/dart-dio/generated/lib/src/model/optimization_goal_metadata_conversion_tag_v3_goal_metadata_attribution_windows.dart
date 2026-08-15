//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_goal_metadata_conversion_tag_v3_goal_metadata_attribution_windows.g.dart';

/// OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows
///
/// Properties:
/// * [clickWindowDays] 
/// * [engagementWindowDays] 
/// * [viewWindowDays] 
@BuiltValue()
abstract class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows implements Built<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows, OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsBuilder> {
  @BuiltValueField(wireName: r'click_window_days')
  int? get clickWindowDays;

  @BuiltValueField(wireName: r'engagement_window_days')
  int? get engagementWindowDays;

  @BuiltValueField(wireName: r'view_window_days')
  int? get viewWindowDays;

  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows._();

  factory OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows([void updates(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsBuilder b)]) = _$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows> get serializer => _$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsSerializer();
}

class _$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsSerializer implements PrimitiveSerializer<OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows> {
  @override
  final Iterable<Type> types = const [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows, _$OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows];

  @override
  final String wireName = r'OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(int),
      );
    }
    if (object.engagementWindowDays != null) {
      yield r'engagement_window_days';
      yield serializers.serialize(
        object.engagementWindowDays,
        specifiedType: const FullType(int),
      );
    }
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.clickWindowDays = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.engagementWindowDays = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.viewWindowDays = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindowsBuilder();
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

