//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedule_type.dart';
import 'package:openapi/src/model/schedule_delta_value.dart';
import 'package:openapi/src/model/schedule_action.dart';
import 'package:openapi/src/model/schedule_status.dart';
import 'package:openapi/src/model/ad_account_entity_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule.g.dart';

/// Schedule
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
@BuiltValue()
abstract class Schedule implements Built<Schedule, ScheduleBuilder> {
  @BuiltValueField(wireName: r'delta_value')
  ScheduleDeltaValue? get deltaValue;

  /// Schedule end time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'end_timestamp')
  int? get endTimestamp;

  /// entity ID.
  @BuiltValueField(wireName: r'entity_id')
  String get entityId;

  /// Specify the entity_type to get summary information
  @BuiltValueField(wireName: r'entity_type')
  AdAccountEntityType? get entityType;
  // enum entityTypeEnum {  ADVERTISER,  CAMPAIGN,  AD_GROUP,  AD,  };

  /// Schedule name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The schedule action.
  @BuiltValueField(wireName: r'schedule_action')
  ScheduleAction? get scheduleAction;
  // enum scheduleActionEnum {  INCREASE_BY_VALUE,  INCREASE_BY_PERCENT,  };

  /// Schedule ID.
  @BuiltValueField(wireName: r'schedule_id')
  String get scheduleId;

  /// Schedule status.
  @BuiltValueField(wireName: r'schedule_status')
  ScheduleStatus? get scheduleStatus;
  // enum scheduleStatusEnum {  DRAFT,  CREATED,  SCHEDULED,  ACTIVE,  COMPLETED,  FAILED,  CANCELED,  };

  /// The schedule type.
  @BuiltValueField(wireName: r'schedule_type')
  ScheduleType? get scheduleType;
  // enum scheduleTypeEnum {  CAMPAIGN_BUDGET_CHANGE,  CAMPAIGN_BID_MULTIPLIERS,  };

  /// Schedule start time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'start_timestamp')
  int? get startTimestamp;

  Schedule._();

  factory Schedule([void updates(ScheduleBuilder b)]) = _$Schedule;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Schedule> get serializer => _$ScheduleSerializer();
}

class _$ScheduleSerializer implements PrimitiveSerializer<Schedule> {
  @override
  final Iterable<Type> types = const [Schedule, _$Schedule];

  @override
  final String wireName = r'Schedule';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Schedule object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.deltaValue != null) {
      yield r'delta_value';
      yield serializers.serialize(
        object.deltaValue,
        specifiedType: const FullType(ScheduleDeltaValue),
      );
    }
    if (object.endTimestamp != null) {
      yield r'end_timestamp';
      yield serializers.serialize(
        object.endTimestamp,
        specifiedType: const FullType(int),
      );
    }
    yield r'entity_id';
    yield serializers.serialize(
      object.entityId,
      specifiedType: const FullType(String),
    );
    if (object.entityType != null) {
      yield r'entity_type';
      yield serializers.serialize(
        object.entityType,
        specifiedType: const FullType(AdAccountEntityType),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.scheduleAction != null) {
      yield r'schedule_action';
      yield serializers.serialize(
        object.scheduleAction,
        specifiedType: const FullType(ScheduleAction),
      );
    }
    yield r'schedule_id';
    yield serializers.serialize(
      object.scheduleId,
      specifiedType: const FullType(String),
    );
    if (object.scheduleStatus != null) {
      yield r'schedule_status';
      yield serializers.serialize(
        object.scheduleStatus,
        specifiedType: const FullType(ScheduleStatus),
      );
    }
    if (object.scheduleType != null) {
      yield r'schedule_type';
      yield serializers.serialize(
        object.scheduleType,
        specifiedType: const FullType(ScheduleType),
      );
    }
    if (object.startTimestamp != null) {
      yield r'start_timestamp';
      yield serializers.serialize(
        object.startTimestamp,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Schedule object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'delta_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleDeltaValue),
          ) as ScheduleDeltaValue?;
          if (valueDes == null) continue;
          result.deltaValue.replace(valueDes);
          break;
        case r'end_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTimestamp = valueDes;
          break;
        case r'entity_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.entityId = valueDes;
          break;
        case r'entity_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdAccountEntityType),
          ) as AdAccountEntityType?;
          if (valueDes == null) continue;
          result.entityType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'schedule_action':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleAction),
          ) as ScheduleAction?;
          if (valueDes == null) continue;
          result.scheduleAction = valueDes;
          break;
        case r'schedule_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.scheduleId = valueDes;
          break;
        case r'schedule_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleStatus),
          ) as ScheduleStatus?;
          if (valueDes == null) continue;
          result.scheduleStatus = valueDes;
          break;
        case r'schedule_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleType),
          ) as ScheduleType?;
          if (valueDes == null) continue;
          result.scheduleType = valueDes;
          break;
        case r'start_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startTimestamp = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Schedule deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleBuilder();
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

