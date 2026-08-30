//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedule_type.dart';
import 'package:openapi/src/model/schedules_create200_response_inner_data_one_of.dart';
import 'package:openapi/src/model/schedule_delta_value.dart';
import 'package:openapi/src/model/schedule_action.dart';
import 'package:openapi/src/model/schedule_status.dart';
import 'package:openapi/src/model/ad_account_entity_type.dart';
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:openapi/src/model/schedule.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'schedules_create200_response_inner_data.g.dart';

/// Created/updated resource on success or error details on failure
///
/// Properties:
/// * [deltaValue] 
/// * [endTimestamp] - Schedule end time. Unix timestamp in seconds.
/// * [entityId] - entity ID.
/// * [entityType] - Specify the entity_type to get summary information
/// * [name] - Schedule name.
/// * [scheduleAction] - The schedule action.
/// * [scheduleId] - Schedule ID.
/// * [scheduleStatus] - Schedule status.
/// * [scheduleType] - The schedule type.
/// * [startTimestamp] - Schedule start time. Unix timestamp in seconds.
/// * [id] 
/// * [exceptions] 
@BuiltValue()
abstract class SchedulesCreate200ResponseInnerData implements Built<SchedulesCreate200ResponseInnerData, SchedulesCreate200ResponseInnerDataBuilder> {
  /// One Of [Schedule], [SchedulesCreate200ResponseInnerDataOneOf]
  OneOf get oneOf;

  SchedulesCreate200ResponseInnerData._();

  factory SchedulesCreate200ResponseInnerData([void updates(SchedulesCreate200ResponseInnerDataBuilder b)]) = _$SchedulesCreate200ResponseInnerData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SchedulesCreate200ResponseInnerDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SchedulesCreate200ResponseInnerData> get serializer => _$SchedulesCreate200ResponseInnerDataSerializer();
}

class _$SchedulesCreate200ResponseInnerDataSerializer implements PrimitiveSerializer<SchedulesCreate200ResponseInnerData> {
  @override
  final Iterable<Type> types = const [SchedulesCreate200ResponseInnerData, _$SchedulesCreate200ResponseInnerData];

  @override
  final String wireName = r'SchedulesCreate200ResponseInnerData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SchedulesCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    SchedulesCreate200ResponseInnerData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  SchedulesCreate200ResponseInnerData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SchedulesCreate200ResponseInnerDataBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(Schedule), FullType(SchedulesCreate200ResponseInnerDataOneOf), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

