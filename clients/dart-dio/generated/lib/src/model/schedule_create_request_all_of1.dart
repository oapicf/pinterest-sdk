//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedule_create_request_all_of1.g.dart';

/// ScheduleCreateRequestAllOf1
///
/// Properties:
/// * [entityId] 
/// * [entityType] - Entity type
@BuiltValue()
abstract class ScheduleCreateRequestAllOf1 implements Built<ScheduleCreateRequestAllOf1, ScheduleCreateRequestAllOf1Builder> {
  @BuiltValueField(wireName: r'entity_id')
  String get entityId;

  /// Entity type
  @BuiltValueField(wireName: r'entity_type')
  String get entityType;

  ScheduleCreateRequestAllOf1._();

  factory ScheduleCreateRequestAllOf1([void updates(ScheduleCreateRequestAllOf1Builder b)]) = _$ScheduleCreateRequestAllOf1;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ScheduleCreateRequestAllOf1Builder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ScheduleCreateRequestAllOf1> get serializer => _$ScheduleCreateRequestAllOf1Serializer();
}

class _$ScheduleCreateRequestAllOf1Serializer implements PrimitiveSerializer<ScheduleCreateRequestAllOf1> {
  @override
  final Iterable<Type> types = const [ScheduleCreateRequestAllOf1, _$ScheduleCreateRequestAllOf1];

  @override
  final String wireName = r'ScheduleCreateRequestAllOf1';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ScheduleCreateRequestAllOf1 object, {
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
  }

  @override
  Object serialize(
    Serializers serializers,
    ScheduleCreateRequestAllOf1 object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ScheduleCreateRequestAllOf1Builder result,
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ScheduleCreateRequestAllOf1 deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ScheduleCreateRequestAllOf1Builder();
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

