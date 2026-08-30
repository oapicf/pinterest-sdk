//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedule_audience_multipliers.dart';
import 'package:openapi/src/model/schedule_bid_options.dart';
import 'package:openapi/src/model/schedule_bid_options_placement_multipliers.dart';
import 'package:openapi/src/model/schedule_age_bucket_multipliers.dart';
import 'package:openapi/src/model/schedule_app_type_multipliers.dart';
import 'package:openapi/src/model/schedule_bid_options_gender_multipliers.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'schedule_common_delta_value.g.dart';

/// ScheduleCommonDeltaValue
///
/// Properties:
/// * [ageBucketMultipliers] 
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [genderMultipliers] 
/// * [placementMultipliers] 
@BuiltValue()
abstract class ScheduleCommonDeltaValue implements Built<ScheduleCommonDeltaValue, ScheduleCommonDeltaValueBuilder> {
  /// One Of [ScheduleBidOptions], [String]
  OneOf get oneOf;

  ScheduleCommonDeltaValue._();

  factory ScheduleCommonDeltaValue([void updates(ScheduleCommonDeltaValueBuilder b)]) = _$ScheduleCommonDeltaValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleCommonDeltaValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleCommonDeltaValue> get serializer => _$ScheduleCommonDeltaValueSerializer();
}

class _$ScheduleCommonDeltaValueSerializer implements PrimitiveSerializer<ScheduleCommonDeltaValue> {
  @override
  final Iterable<Type> types = const [ScheduleCommonDeltaValue, _$ScheduleCommonDeltaValue];

  @override
  final String wireName = r'ScheduleCommonDeltaValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleCommonDeltaValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleCommonDeltaValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ScheduleCommonDeltaValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleCommonDeltaValueBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(String), FullType.nullable(ScheduleBidOptions), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

