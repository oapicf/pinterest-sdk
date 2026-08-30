//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedule_type.dart';
import 'package:openapi/src/model/schedule_action.dart';
import 'package:openapi/src/model/schedule_status.dart';
import 'package:openapi/src/model/schedule_common_delta_value.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_create_request.g.dart';

/// ScheduleCreateRequest
///
/// Properties:
/// * [entityId] 
/// * [entityType] - Entity type
/// * [deltaValue] 
/// * [endTimestamp] - Schedule end time. Unix timestamp in seconds.
/// * [name] 
/// * [scheduleAction] 
/// * [scheduleStatus] 
/// * [scheduleType] 
/// * [startTimestamp] - Schedule start time. Unix timestamp in seconds.
@BuiltValue()
abstract class ScheduleCreateRequest implements Built<ScheduleCreateRequest, ScheduleCreateRequestBuilder> {
  @BuiltValueField(wireName: r'entity_id')
  String get entityId;

  /// Entity type
  @BuiltValueField(wireName: r'entity_type')
  String get entityType;

  @BuiltValueField(wireName: r'delta_value')
  ScheduleCommonDeltaValue get deltaValue;

  /// Schedule end time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'end_timestamp')
  int get endTimestamp;

  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'schedule_action')
  ScheduleAction get scheduleAction;
  // enum scheduleActionEnum {  INCREASE_BY_VALUE,  INCREASE_BY_PERCENT,  };

  @BuiltValueField(wireName: r'schedule_status')
  ScheduleStatus get scheduleStatus;
  // enum scheduleStatusEnum {  DRAFT,  CREATED,  SCHEDULED,  ACTIVE,  COMPLETED,  FAILED,  CANCELED,  };

  @BuiltValueField(wireName: r'schedule_type')
  ScheduleType get scheduleType;
  // enum scheduleTypeEnum {  CAMPAIGN_BUDGET_CHANGE,  CAMPAIGN_BID_MULTIPLIERS,  };

  /// Schedule start time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'start_timestamp')
  int get startTimestamp;

  ScheduleCreateRequest._();

  factory ScheduleCreateRequest([void updates(ScheduleCreateRequestBuilder b)]) = _$ScheduleCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleCreateRequest> get serializer => _$ScheduleCreateRequestSerializer();
}

class _$ScheduleCreateRequestSerializer implements PrimitiveSerializer<ScheduleCreateRequest> {
  @override
  final Iterable<Type> types = const [ScheduleCreateRequest, _$ScheduleCreateRequest];

  @override
  final String wireName = r'ScheduleCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'entity_id';
    yield serializers.serialize(
      object.entityId,
      specifiedType: const FullType(String),
    );
    yield r'entity_type';
    yield serializers.serialize(
      object.entityType,
      specifiedType: const FullType(String),
    );
    yield r'delta_value';
    yield serializers.serialize(
      object.deltaValue,
      specifiedType: const FullType(ScheduleCommonDeltaValue),
    );
    yield r'end_timestamp';
    yield serializers.serialize(
      object.endTimestamp,
      specifiedType: const FullType(int),
    );
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'schedule_action';
    yield serializers.serialize(
      object.scheduleAction,
      specifiedType: const FullType(ScheduleAction),
    );
    yield r'schedule_status';
    yield serializers.serialize(
      object.scheduleStatus,
      specifiedType: const FullType(ScheduleStatus),
    );
    yield r'schedule_type';
    yield serializers.serialize(
      object.scheduleType,
      specifiedType: const FullType(ScheduleType),
    );
    yield r'start_timestamp';
    yield serializers.serialize(
      object.startTimestamp,
      specifiedType: const FullType(int),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
            specifiedType: const FullType(String),
          ) as String;
          result.entityType = valueDes;
          break;
        case r'delta_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ScheduleCommonDeltaValue),
          ) as ScheduleCommonDeltaValue;
          result.deltaValue.replace(valueDes);
          break;
        case r'end_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endTimestamp = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'schedule_action':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ScheduleAction),
          ) as ScheduleAction;
          result.scheduleAction = valueDes;
          break;
        case r'schedule_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ScheduleStatus),
          ) as ScheduleStatus;
          result.scheduleStatus = valueDes;
          break;
        case r'schedule_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ScheduleType),
          ) as ScheduleType;
          result.scheduleType = valueDes;
          break;
        case r'start_timestamp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
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
  ScheduleCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleCreateRequestBuilder();
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

