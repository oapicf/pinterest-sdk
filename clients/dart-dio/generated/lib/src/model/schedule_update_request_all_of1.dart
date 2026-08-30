//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_update_request_all_of1.g.dart';

/// ScheduleUpdateRequestAllOf1
///
/// Properties:
/// * [entityId] 
/// * [entityType] - Entity type
/// * [id] - Schedule ID.
@BuiltValue()
abstract class ScheduleUpdateRequestAllOf1 implements Built<ScheduleUpdateRequestAllOf1, ScheduleUpdateRequestAllOf1Builder> {
  @BuiltValueField(wireName: r'entity_id')
  String? get entityId;

  /// Entity type
  @BuiltValueField(wireName: r'entity_type')
  String? get entityType;

  /// Schedule ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  ScheduleUpdateRequestAllOf1._();

  factory ScheduleUpdateRequestAllOf1([void updates(ScheduleUpdateRequestAllOf1Builder b)]) = _$ScheduleUpdateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleUpdateRequestAllOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleUpdateRequestAllOf1> get serializer => _$ScheduleUpdateRequestAllOf1Serializer();
}

class _$ScheduleUpdateRequestAllOf1Serializer implements PrimitiveSerializer<ScheduleUpdateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [ScheduleUpdateRequestAllOf1, _$ScheduleUpdateRequestAllOf1];

  @override
  final String wireName = r'ScheduleUpdateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleUpdateRequestAllOf1 object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleUpdateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleUpdateRequestAllOf1Builder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleUpdateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleUpdateRequestAllOf1Builder();
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

