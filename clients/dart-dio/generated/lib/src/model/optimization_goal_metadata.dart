//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/frequency_goal_metadata.dart';
import 'package:openapi/src/model/scrollup_goal_metadata.dart';
import 'package:openapi/src/model/conversion_tag_v3_goal_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_goal_metadata.g.dart';

/// OptimizationGoalMetadata
///
/// Properties:
/// * [conversionTagV3GoalMetadata] 
/// * [frequencyGoalMetadata] 
/// * [scrollupGoalMetadata] 
@BuiltValue()
abstract class OptimizationGoalMetadata implements Built<OptimizationGoalMetadata, OptimizationGoalMetadataBuilder> {
  @BuiltValueField(wireName: r'conversion_tag_v3_goal_metadata')
  ConversionTagV3GoalMetadata? get conversionTagV3GoalMetadata;

  @BuiltValueField(wireName: r'frequency_goal_metadata')
  FrequencyGoalMetadata? get frequencyGoalMetadata;

  @BuiltValueField(wireName: r'scrollup_goal_metadata')
  ScrollupGoalMetadata? get scrollupGoalMetadata;

  OptimizationGoalMetadata._();

  factory OptimizationGoalMetadata([void updates(OptimizationGoalMetadataBuilder b)]) = _$OptimizationGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OptimizationGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OptimizationGoalMetadata> get serializer => _$OptimizationGoalMetadataSerializer();
}

class _$OptimizationGoalMetadataSerializer implements PrimitiveSerializer<OptimizationGoalMetadata> {
  @override
  final Iterable<Type> types = const [OptimizationGoalMetadata, _$OptimizationGoalMetadata];

  @override
  final String wireName = r'OptimizationGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OptimizationGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.conversionTagV3GoalMetadata != null) {
      yield r'conversion_tag_v3_goal_metadata';
      yield serializers.serialize(
        object.conversionTagV3GoalMetadata,
        specifiedType: const FullType(ConversionTagV3GoalMetadata),
      );
    }
    if (object.frequencyGoalMetadata != null) {
      yield r'frequency_goal_metadata';
      yield serializers.serialize(
        object.frequencyGoalMetadata,
        specifiedType: const FullType(FrequencyGoalMetadata),
      );
    }
    if (object.scrollupGoalMetadata != null) {
      yield r'scrollup_goal_metadata';
      yield serializers.serialize(
        object.scrollupGoalMetadata,
        specifiedType: const FullType(ScrollupGoalMetadata),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OptimizationGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OptimizationGoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'conversion_tag_v3_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionTagV3GoalMetadata),
          ) as ConversionTagV3GoalMetadata?;
          if (valueDes == null) continue;
          result.conversionTagV3GoalMetadata.replace(valueDes);
          break;
        case r'frequency_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FrequencyGoalMetadata),
          ) as FrequencyGoalMetadata?;
          if (valueDes == null) continue;
          result.frequencyGoalMetadata.replace(valueDes);
          break;
        case r'scrollup_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScrollupGoalMetadata),
          ) as ScrollupGoalMetadata?;
          if (valueDes == null) continue;
          result.scrollupGoalMetadata.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OptimizationGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OptimizationGoalMetadataBuilder();
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

