//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_goal_metadata_scrollup_goal_metadata.g.dart';

/// OptimizationGoalMetadataScrollupGoalMetadata
///
/// Properties:
/// * [scrollupGoalValueInMicroCurrency] 
@BuiltValue()
abstract class OptimizationGoalMetadataScrollupGoalMetadata implements Built<OptimizationGoalMetadataScrollupGoalMetadata, OptimizationGoalMetadataScrollupGoalMetadataBuilder> {
  @BuiltValueField(wireName: r'scrollup_goal_value_in_micro_currency')
  String? get scrollupGoalValueInMicroCurrency;

  OptimizationGoalMetadataScrollupGoalMetadata._();

  factory OptimizationGoalMetadataScrollupGoalMetadata([void updates(OptimizationGoalMetadataScrollupGoalMetadataBuilder b)]) = _$OptimizationGoalMetadataScrollupGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OptimizationGoalMetadataScrollupGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OptimizationGoalMetadataScrollupGoalMetadata> get serializer => _$OptimizationGoalMetadataScrollupGoalMetadataSerializer();
}

class _$OptimizationGoalMetadataScrollupGoalMetadataSerializer implements PrimitiveSerializer<OptimizationGoalMetadataScrollupGoalMetadata> {
  @override
  final Iterable<Type> types = const [OptimizationGoalMetadataScrollupGoalMetadata, _$OptimizationGoalMetadataScrollupGoalMetadata];

  @override
  final String wireName = r'OptimizationGoalMetadataScrollupGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OptimizationGoalMetadataScrollupGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.scrollupGoalValueInMicroCurrency != null) {
      yield r'scrollup_goal_value_in_micro_currency';
      yield serializers.serialize(
        object.scrollupGoalValueInMicroCurrency,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OptimizationGoalMetadataScrollupGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OptimizationGoalMetadataScrollupGoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scrollup_goal_value_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.scrollupGoalValueInMicroCurrency = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OptimizationGoalMetadataScrollupGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OptimizationGoalMetadataScrollupGoalMetadataBuilder();
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

