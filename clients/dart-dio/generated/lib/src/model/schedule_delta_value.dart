//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bid_options_age_bucket_multipliers.dart';
import 'package:openapi/src/model/bid_options_audience_multipliers.dart';
import 'package:openapi/src/model/bid_options_app_type_multipliers.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/schedule_bid_multipliers.dart';
import 'package:openapi/src/model/bid_options_placement_multipliers.dart';
import 'package:openapi/src/model/bid_options_gender_multipliers.dart';
import 'dart:core';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'schedule_delta_value.g.dart';

/// The value of the scheduled adjustment.
///
/// Properties:
/// * [ageBucketMultipliers] 
/// * [appTypeMultipliers] 
/// * [audienceMultipliers] 
/// * [genderMultipliers] 
/// * [placementMultipliers] 
@BuiltValue()
abstract class ScheduleDeltaValue implements Built<ScheduleDeltaValue, ScheduleDeltaValueBuilder> {
  /// Any Of [ScheduleBidMultipliers], [String]
  AnyOf get anyOf;

  ScheduleDeltaValue._();

  factory ScheduleDeltaValue([void updates(ScheduleDeltaValueBuilder b)]) = _$ScheduleDeltaValue;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleDeltaValueBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleDeltaValue> get serializer => _$ScheduleDeltaValueSerializer();
}

class _$ScheduleDeltaValueSerializer implements PrimitiveSerializer<ScheduleDeltaValue> {
  @override
  final Iterable<Type> types = const [ScheduleDeltaValue, _$ScheduleDeltaValue];

  @override
  final String wireName = r'ScheduleDeltaValue';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleDeltaValue object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleDeltaValue object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  ScheduleDeltaValue deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleDeltaValueBuilder();
    Object? anyOfDataSrc;
    final targetType = const FullType(AnyOf, [FullType(String), FullType(ScheduleBidMultipliers), ]);
    anyOfDataSrc = serialized;
    result.anyOf = serializers.deserialize(anyOfDataSrc, specifiedType: targetType) as AnyOf;
    return result.build();
  }
}

