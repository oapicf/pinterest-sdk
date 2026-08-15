//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'optimization_goal_metadata_frequency_goal_metadata.g.dart';

/// OptimizationGoalMetadataFrequencyGoalMetadata
///
/// Properties:
/// * [frequency] - Frequency target can only be between 2 and 20
/// * [timerange] - User entity counts time range
@BuiltValue()
abstract class OptimizationGoalMetadataFrequencyGoalMetadata implements Built<OptimizationGoalMetadataFrequencyGoalMetadata, OptimizationGoalMetadataFrequencyGoalMetadataBuilder> {
  /// Frequency target can only be between 2 and 20
  @BuiltValueField(wireName: r'frequency')
  int? get frequency;

  /// User entity counts time range
  @BuiltValueField(wireName: r'timerange')
  OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum? get timerange;
  // enum timerangeEnum {  THIRTY_DAY,  DAY,  SEVEN_DAY,  TWENTY_MINUTE,  TEN_MINUTE,  TWENTY_FOUR_HOUR,  };

  OptimizationGoalMetadataFrequencyGoalMetadata._();

  factory OptimizationGoalMetadataFrequencyGoalMetadata([void updates(OptimizationGoalMetadataFrequencyGoalMetadataBuilder b)]) = _$OptimizationGoalMetadataFrequencyGoalMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OptimizationGoalMetadataFrequencyGoalMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OptimizationGoalMetadataFrequencyGoalMetadata> get serializer => _$OptimizationGoalMetadataFrequencyGoalMetadataSerializer();
}

class _$OptimizationGoalMetadataFrequencyGoalMetadataSerializer implements PrimitiveSerializer<OptimizationGoalMetadataFrequencyGoalMetadata> {
  @override
  final Iterable<Type> types = const [OptimizationGoalMetadataFrequencyGoalMetadata, _$OptimizationGoalMetadataFrequencyGoalMetadata];

  @override
  final String wireName = r'OptimizationGoalMetadataFrequencyGoalMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OptimizationGoalMetadataFrequencyGoalMetadata object, {
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
        specifiedType: const FullType(OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OptimizationGoalMetadataFrequencyGoalMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OptimizationGoalMetadataFrequencyGoalMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'frequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.frequency = valueDes;
          break;
        case r'timerange':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum),
          ) as OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum;
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
  OptimizationGoalMetadataFrequencyGoalMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OptimizationGoalMetadataFrequencyGoalMetadataBuilder();
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

class OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum extends EnumClass {

  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'THIRTY_DAY')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum THIRTY_DAY = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_THIRTY_DAY;
  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'DAY')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum DAY = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_DAY;
  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'SEVEN_DAY')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum SEVEN_DAY = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_SEVEN_DAY;
  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'TWENTY_MINUTE')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum TWENTY_MINUTE = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_TWENTY_MINUTE;
  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'TEN_MINUTE')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum TEN_MINUTE = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_TEN_MINUTE;
  /// User entity counts time range
  @BuiltValueEnumConst(wireName: r'TWENTY_FOUR_HOUR')
  static const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum TWENTY_FOUR_HOUR = _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum_TWENTY_FOUR_HOUR;

  static Serializer<OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum> get serializer => _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumSerializer;

  const OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum._(String name): super(name);

  static BuiltSet<OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum> get values => _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumValues;
  static OptimizationGoalMetadataFrequencyGoalMetadataTimerangeEnum valueOf(String name) => _$optimizationGoalMetadataFrequencyGoalMetadataTimerangeEnumValueOf(name);
}

