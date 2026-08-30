//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_gender.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_bid_options_gender_multipliers.g.dart';

/// This represents a mapping from gender targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All gender multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [GENDER] 
@BuiltValue()
abstract class ScheduleBidOptionsGenderMultipliers implements Built<ScheduleBidOptionsGenderMultipliers, ScheduleBidOptionsGenderMultipliersBuilder> {
  @BuiltValueField(wireName: r'GENDER')
  TargetingSpecGender? get GENDER;
  // enum GENDEREnum {  unknown,  male,  female,  };

  ScheduleBidOptionsGenderMultipliers._();

  factory ScheduleBidOptionsGenderMultipliers([void updates(ScheduleBidOptionsGenderMultipliersBuilder b)]) = _$ScheduleBidOptionsGenderMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleBidOptionsGenderMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleBidOptionsGenderMultipliers> get serializer => _$ScheduleBidOptionsGenderMultipliersSerializer();
}

class _$ScheduleBidOptionsGenderMultipliersSerializer implements PrimitiveSerializer<ScheduleBidOptionsGenderMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleBidOptionsGenderMultipliers, _$ScheduleBidOptionsGenderMultipliers];

  @override
  final String wireName = r'ScheduleBidOptionsGenderMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleBidOptionsGenderMultipliers object, {
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
    ScheduleBidOptionsGenderMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleBidOptionsGenderMultipliersBuilder result,
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
  ScheduleBidOptionsGenderMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleBidOptionsGenderMultipliersBuilder();
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

