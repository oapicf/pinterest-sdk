//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_gender_multipliers.g.dart';

/// This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [GENDER] 
@BuiltValue()
abstract class ScheduleGenderMultipliers implements Built<ScheduleGenderMultipliers, ScheduleGenderMultipliersBuilder> {
  @BuiltValueField(wireName: r'GENDER')
  TargetingSpecGender? get GENDER;
  // enum GENDEREnum {  unknown,  male,  female,  };

  ScheduleGenderMultipliers._();

  factory ScheduleGenderMultipliers([void updates(ScheduleGenderMultipliersBuilder b)]) = _$ScheduleGenderMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleGenderMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleGenderMultipliers> get serializer => _$ScheduleGenderMultipliersSerializer();
}

class _$ScheduleGenderMultipliersSerializer implements PrimitiveSerializer<ScheduleGenderMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleGenderMultipliers, _$ScheduleGenderMultipliers];

  @override
  final String wireName = r'ScheduleGenderMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleGenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.GENDER != null) {
      yield r'GENDER';
      yield serializers.serialize(
        object.GENDER,
        specifiedType: const FullType(TargetingSpecGender),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleGenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleGenderMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'GENDER':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecGender),
          ) as TargetingSpecGender?;
          if (valueDes == null) continue;
          result.GENDER = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleGenderMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleGenderMultipliersBuilder();
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

