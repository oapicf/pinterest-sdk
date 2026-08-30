//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_audience_multipliers.g.dart';

/// This represents a mapping from Audience ID to a bid price change value. This is paired with the bid_multipliers schedule type. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All audience multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
///
/// Properties:
/// * [AUDIENCE_ID] 
@BuiltValue()
abstract class ScheduleAudienceMultipliers implements Built<ScheduleAudienceMultipliers, ScheduleAudienceMultipliersBuilder> {
  @BuiltValueField(wireName: r'AUDIENCE_ID')
  String? get AUDIENCE_ID;

  ScheduleAudienceMultipliers._();

  factory ScheduleAudienceMultipliers([void updates(ScheduleAudienceMultipliersBuilder b)]) = _$ScheduleAudienceMultipliers;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleAudienceMultipliersBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleAudienceMultipliers> get serializer => _$ScheduleAudienceMultipliersSerializer();
}

class _$ScheduleAudienceMultipliersSerializer implements PrimitiveSerializer<ScheduleAudienceMultipliers> {
  @override
  final Iterable<Type> types = const [ScheduleAudienceMultipliers, _$ScheduleAudienceMultipliers];

  @override
  final String wireName = r'ScheduleAudienceMultipliers';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AUDIENCE_ID != null) {
      yield r'AUDIENCE_ID';
      yield serializers.serialize(
        object.AUDIENCE_ID,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleAudienceMultipliers object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleAudienceMultipliersBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AUDIENCE_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.AUDIENCE_ID = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleAudienceMultipliers deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleAudienceMultipliersBuilder();
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

