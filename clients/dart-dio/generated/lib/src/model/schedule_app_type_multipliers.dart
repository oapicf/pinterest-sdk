//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec_app_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_app_type_multipliers.g.dart';

/// This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [APP_TYPE] 
@BuiltValue()
abstract class ScheduleAppTypeMultipliers implements Built<ScheduleAppTypeMultipliers, ScheduleAppTypeMultipliersBuilder> {
  @BuiltValueField(wireName: r'APP_TYPE')
  TargetingSpecAppType? get APP_TYPE;
  // enum APP_TYPEEnum {  android_mobile,  android_tablet,  ipad,  iphone,  web,  web_mobile,  };

  ScheduleAppTypeMultipliers._();

  factory ScheduleAppTypeMultipliers([void updates(ScheduleAppTypeMultipliersBuilder b)]) = _$ScheduleAppTypeMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleAppTypeMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleAppTypeMultipliers> get serializer => _$ScheduleAppTypeMultipliersSerializer();
}

class _$ScheduleAppTypeMultipliersSerializer implements PrimitiveSerializer<ScheduleAppTypeMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleAppTypeMultipliers, _$ScheduleAppTypeMultipliers];

  @override
  final String wireName = r'ScheduleAppTypeMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleAppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.APP_TYPE != null) {
      yield r'APP_TYPE';
      yield serializers.serialize(
        object.APP_TYPE,
        specifiedType: const FullType(TargetingSpecAppType),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleAppTypeMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleAppTypeMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'APP_TYPE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecAppType),
          ) as TargetingSpecAppType?;
          if (valueDes == null) continue;
          result.APP_TYPE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleAppTypeMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleAppTypeMultipliersBuilder();
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

