//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedule_audience_multipliers.dart';
import 'package:openapi/src/model/schedule_bid_options_placement_multipliers.dart';
import 'package:openapi/src/model/schedule_age_bucket_multipliers.dart';
import 'package:openapi/src/model/schedule_app_type_multipliers.dart';
import 'package:openapi/src/model/schedule_bid_options_gender_multipliers.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_bid_options.g.dart';

/// Object describing the schedule level bid level changes.
///
/// Properties:
/// * [ageBucketMultipliers] 
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [genderMultipliers] 
/// * [placementMultipliers] 
@BuiltValue()
abstract class ScheduleBidOptions implements Built<ScheduleBidOptions, ScheduleBidOptionsBuilder> {
  @BuiltValueField(wireName: r'age_bucket_multipliers')
  ScheduleAgeBucketMultipliers? get ageBucketMultipliers;

  @BuiltValueField(wireName: r'app_type_multipliers')
  ScheduleAppTypeMultipliers? get appTypeMultipliers;

  @BuiltValueField(wireName: r'audience_multipliers')
  ScheduleAudienceMultipliers? get audienceMultipliers;

  @BuiltValueField(wireName: r'gender_multipliers')
  ScheduleBidOptionsGenderMultipliers? get genderMultipliers;

  @BuiltValueField(wireName: r'placement_multipliers')
  ScheduleBidOptionsPlacementMultipliers? get placementMultipliers;

  ScheduleBidOptions._();

  factory ScheduleBidOptions([void updates(ScheduleBidOptionsBuilder b)]) = _$ScheduleBidOptions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleBidOptionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleBidOptions> get serializer => _$ScheduleBidOptionsSerializer();
}

class _$ScheduleBidOptionsSerializer implements PrimitiveSerializer<ScheduleBidOptions> {
  @override
  final Iterable<Type> types = const [ScheduleBidOptions, _$ScheduleBidOptions];

  @override
  final String wireName = r'ScheduleBidOptions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ageBucketMultipliers != null) {
      yield r'age_bucket_multipliers';
      yield serializers.serialize(
        object.ageBucketMultipliers,
        specifiedType: const FullType.nullable(ScheduleAgeBucketMultipliers),
      );
    }
    if (object.appTypeMultipliers != null) {
      yield r'app_type_multipliers';
      yield serializers.serialize(
        object.appTypeMultipliers,
        specifiedType: const FullType.nullable(ScheduleAppTypeMultipliers),
      );
    }
    if (object.audienceMultipliers != null) {
      yield r'audience_multipliers';
      yield serializers.serialize(
        object.audienceMultipliers,
        specifiedType: const FullType(ScheduleAudienceMultipliers),
      );
    }
    if (object.genderMultipliers != null) {
      yield r'gender_multipliers';
      yield serializers.serialize(
        object.genderMultipliers,
        specifiedType: const FullType.nullable(ScheduleBidOptionsGenderMultipliers),
      );
    }
    if (object.placementMultipliers != null) {
      yield r'placement_multipliers';
      yield serializers.serialize(
        object.placementMultipliers,
        specifiedType: const FullType.nullable(ScheduleBidOptionsPlacementMultipliers),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleBidOptions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleBidOptionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'age_bucket_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleAgeBucketMultipliers),
          ) as ScheduleAgeBucketMultipliers?;
          if (valueDes == null) continue;
          result.ageBucketMultipliers = valueDes;
          break;
        case r'app_type_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleAppTypeMultipliers),
          ) as ScheduleAppTypeMultipliers?;
          if (valueDes == null) continue;
          result.appTypeMultipliers = valueDes;
          break;
        case r'audience_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleAudienceMultipliers),
          ) as ScheduleAudienceMultipliers?;
          if (valueDes == null) continue;
          result.audienceMultipliers = valueDes;
          break;
        case r'gender_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleBidOptionsGenderMultipliers),
          ) as ScheduleBidOptionsGenderMultipliers?;
          if (valueDes == null) continue;
          result.genderMultipliers = valueDes;
          break;
        case r'placement_multipliers':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleBidOptionsPlacementMultipliers),
          ) as ScheduleBidOptionsPlacementMultipliers?;
          if (valueDes == null) continue;
          result.placementMultipliers.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleBidOptions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleBidOptionsBuilder();
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

