//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/frequency_goal_metadata_timerange.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'frequency_goal_metadata.g.dart';

/// Frequency target can only be between 2 and 20
///
/// Properties:
/// * [frequency] 
/// * [timerange] 
@BuiltValue()
abstract class FrequencyGoalMetadata implements Built<FrequencyGoalMetadata, FrequencyGoalMetadataBuilder> {
  @BuiltValueField(wireName: r'frequency')
  int? get frequency;

  @BuiltValueField(wireName: r'timerange')
  FrequencyGoalMetadataTimerange? get timerange;
  // enum timerangeEnum {  THIRTY_DAY,  DAY,  SEVEN_DAY,  TWENTY_MINUTE,  TEN_MINUTE,  TWENTY_FOUR_HOUR,  };

  FrequencyGoalMetadata._();

  factory FrequencyGoalMetadata([void updates(FrequencyGoalMetadataBuilder b)]) = _$FrequencyGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(FrequencyGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<FrequencyGoalMetadata> get serializer => _$FrequencyGoalMetadataSerializer();
}

class _$FrequencyGoalMetadataSerializer implements PrimitiveSerializer<FrequencyGoalMetadata> {
  @override
  final Iterable<Type> types = const [FrequencyGoalMetadata, _$FrequencyGoalMetadata];

  @override
  final String wireName = r'FrequencyGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    FrequencyGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.frequency != null) {
      yield r'frequency';
      yield serializers.serialize(
        object.frequency,
        specifiedType: const FullType(int),
      );
    }
    if (object.timerange != null) {
      yield r'timerange';
      yield serializers.serialize(
        object.timerange,
        specifiedType: const FullType(FrequencyGoalMetadataTimerange),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    FrequencyGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required FrequencyGoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'frequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.frequency = valueDes;
          break;
        case r'timerange':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(FrequencyGoalMetadataTimerange),
          ) as FrequencyGoalMetadataTimerange?;
          if (valueDes == null) continue;
          result.timerange = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  FrequencyGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = FrequencyGoalMetadataBuilder();
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

