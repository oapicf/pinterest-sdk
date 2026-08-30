//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/frequency_goal_metadata.dart';
import 'package:openapi/src/model/scrollup_goal_metadata.dart';
import 'package:openapi/src/model/conversion_tag_v3_goal_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'nullable_optimization_goal_metadata.g.dart';

/// NullableOptimizationGoalMetadata
///
/// Properties:
/// * [conversionTagV3GoalMetadata] 
/// * [frequencyGoalMetadata] 
/// * [scrollupGoalMetadata] 
@BuiltValue()
abstract class NullableOptimizationGoalMetadata implements Built<NullableOptimizationGoalMetadata, NullableOptimizationGoalMetadataBuilder> {
  @BuiltValueField(wireName: r'conversion_tag_v3_goal_metadata')
  ConversionTagV3GoalMetadata? get conversionTagV3GoalMetadata;

  @BuiltValueField(wireName: r'frequency_goal_metadata')
  FrequencyGoalMetadata? get frequencyGoalMetadata;

  @BuiltValueField(wireName: r'scrollup_goal_metadata')
  ScrollupGoalMetadata? get scrollupGoalMetadata;

  NullableOptimizationGoalMetadata._();

  factory NullableOptimizationGoalMetadata([void updates(NullableOptimizationGoalMetadataBuilder b)]) = _$NullableOptimizationGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NullableOptimizationGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<NullableOptimizationGoalMetadata> get serializer => _$NullableOptimizationGoalMetadataSerializer();
}

class _$NullableOptimizationGoalMetadataSerializer implements PrimitiveSerializer<NullableOptimizationGoalMetadata> {
  @override
  final Iterable<Type> types = const [NullableOptimizationGoalMetadata, _$NullableOptimizationGoalMetadata];

  @override
  final String wireName = r'NullableOptimizationGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    NullableOptimizationGoalMetadata object, {
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
    NullableOptimizationGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NullableOptimizationGoalMetadataBuilder result,
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
  NullableOptimizationGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NullableOptimizationGoalMetadataBuilder();
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

