//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_age_bucket_multipliers.g.dart';

/// This represents a mapping from age bucket to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [AGE_BUCKET] 
@BuiltValue()
abstract class ScheduleAgeBucketMultipliers implements Built<ScheduleAgeBucketMultipliers, ScheduleAgeBucketMultipliersBuilder> {
  @BuiltValueField(wireName: r'AGE_BUCKET')
  ScheduleAgeBucketMultipliersAGE_BUCKETEnum? get AGE_BUCKET;
  // enum AGE_BUCKETEnum {  18-24,  25-34,  35-44,  45-49,  50-54,  55-64,  65+,  };

  ScheduleAgeBucketMultipliers._();

  factory ScheduleAgeBucketMultipliers([void updates(ScheduleAgeBucketMultipliersBuilder b)]) = _$ScheduleAgeBucketMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleAgeBucketMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleAgeBucketMultipliers> get serializer => _$ScheduleAgeBucketMultipliersSerializer();
}

class _$ScheduleAgeBucketMultipliersSerializer implements PrimitiveSerializer<ScheduleAgeBucketMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleAgeBucketMultipliers, _$ScheduleAgeBucketMultipliers];

  @override
  final String wireName = r'ScheduleAgeBucketMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleAgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AGE_BUCKET != null) {
      yield r'AGE_BUCKET';
      yield serializers.serialize(
        object.AGE_BUCKET,
        specifiedType: const FullType(ScheduleAgeBucketMultipliersAGE_BUCKETEnum),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleAgeBucketMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleAgeBucketMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AGE_BUCKET':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleAgeBucketMultipliersAGE_BUCKETEnum),
          ) as ScheduleAgeBucketMultipliersAGE_BUCKETEnum?;
          if (valueDes == null) continue;
          result.AGE_BUCKET = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleAgeBucketMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleAgeBucketMultipliersBuilder();
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

class ScheduleAgeBucketMultipliersAGE_BUCKETEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'18-24')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n1824 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n1824;
  @BuiltValueEnumConst(wireName: r'25-34')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n2534 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n2534;
  @BuiltValueEnumConst(wireName: r'35-44')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n3544 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n3544;
  @BuiltValueEnumConst(wireName: r'45-49')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n4549 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n4549;
  @BuiltValueEnumConst(wireName: r'50-54')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n5054 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n5054;
  @BuiltValueEnumConst(wireName: r'55-64')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n5564 = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n5564;
  @BuiltValueEnumConst(wireName: r'65+')
  static const ScheduleAgeBucketMultipliersAGE_BUCKETEnum n65plus = _$scheduleAgeBucketMultipliersAGEBUCKETEnum_n65plus;

  static Serializer<ScheduleAgeBucketMultipliersAGE_BUCKETEnum> get serializer => _$scheduleAgeBucketMultipliersAGEBUCKETEnumSerializer;

  const ScheduleAgeBucketMultipliersAGE_BUCKETEnum._(String name): super(name);

  static BuiltSet<ScheduleAgeBucketMultipliersAGE_BUCKETEnum> get values => _$scheduleAgeBucketMultipliersAGEBUCKETEnumValues;
  static ScheduleAgeBucketMultipliersAGE_BUCKETEnum valueOf(String name) => _$scheduleAgeBucketMultipliersAGEBUCKETEnumValueOf(name);
}

