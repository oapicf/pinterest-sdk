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

part 'schedule_update_request.g.dart';

/// ScheduleUpdateRequest
///
/// Properties:
/// * [entityId] 
/// * [entityType] - Entity type
/// * [id] - Schedule ID.
/// * [deltaValue] 
/// * [endTimestamp] - Schedule end time. Unix timestamp in seconds.
/// * [name] 
/// * [scheduleAction] 
/// * [scheduleStatus] 
/// * [scheduleType] 
/// * [startTimestamp] - Schedule start time. Unix timestamp in seconds.
@BuiltValue()
abstract class ScheduleUpdateRequest implements Built<ScheduleUpdateRequest, ScheduleUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'entity_id')
  String? get entityId;

  /// Entity type
  @BuiltValueField(wireName: r'entity_type')
  String? get entityType;

  /// Schedule ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  @BuiltValueField(wireName: r'delta_value')
  ScheduleCommonDeltaValue? get deltaValue;

  /// Schedule end time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'end_timestamp')
  int? get endTimestamp;

  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'schedule_action')
  ScheduleAction? get scheduleAction;
  // enum scheduleActionEnum {  INCREASE_BY_VALUE,  INCREASE_BY_PERCENT,  };

  @BuiltValueField(wireName: r'schedule_status')
  ScheduleStatus? get scheduleStatus;
  // enum scheduleStatusEnum {  DRAFT,  CREATED,  SCHEDULED,  ACTIVE,  COMPLETED,  FAILED,  CANCELED,  };

  @BuiltValueField(wireName: r'schedule_type')
  ScheduleType? get scheduleType;
  // enum scheduleTypeEnum {  CAMPAIGN_BUDGET_CHANGE,  CAMPAIGN_BID_MULTIPLIERS,  };

  /// Schedule start time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'start_timestamp')
  int? get startTimestamp;

  ScheduleUpdateRequest._();

  factory ScheduleUpdateRequest([void updates(ScheduleUpdateRequestBuilder b)]) = _$ScheduleUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleUpdateRequest> get serializer => _$ScheduleUpdateRequestSerializer();
}

class _$ScheduleUpdateRequestSerializer implements PrimitiveSerializer<ScheduleUpdateRequest> {
  @override
  final Iterable<Type> types = const [ScheduleUpdateRequest, _$ScheduleUpdateRequest];

  @override
  final String wireName = r'ScheduleUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.entityId != null) {
      yield r'entity_id';
      yield serializers.serialize(
        object.entityId,
        specifiedType: const FullType(String),
      );
    }
    if (object.entityType != null) {
      yield r'entity_type';
      yield serializers.serialize(
        object.entityType,
        specifiedType: const FullType(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.deltaValue != null) {
      yield r'delta_value';
      yield serializers.serialize(
        object.deltaValue,
        specifiedType: const FullType(ScheduleCommonDeltaValue),
      );
    }
    if (object.endTimestamp != null) {
      yield r'end_timestamp';
      yield serializers.serialize(
        object.endTimestamp,
        specifiedType: const FullType(int),
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
    ScheduleUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'entity_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.entityId = valueDes;
          break;
        case r'entity_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.entityType = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'delta_value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ScheduleCommonDeltaValue),
          ) as ScheduleCommonDeltaValue?;
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
  ScheduleUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleUpdateRequestBuilder();
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

