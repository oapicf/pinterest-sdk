//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pinterest_lib_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedules_create200_response_inner_data_one_of.g.dart';

/// SchedulesCreate200ResponseInnerDataOneOf
///
/// Properties:
/// * [id] 
/// * [scheduleId] - Schedule ID.
/// * [exceptions] 
@BuiltValue()
abstract class SchedulesCreate200ResponseInnerDataOneOf implements Built<SchedulesCreate200ResponseInnerDataOneOf, SchedulesCreate200ResponseInnerDataOneOfBuilder> {
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Schedule ID.
  @BuiltValueField(wireName: r'schedule_id')
  String get scheduleId;

  @BuiltValueField(wireName: r'exceptions')
  PinterestLibError get exceptions;

  SchedulesCreate200ResponseInnerDataOneOf._();

  factory SchedulesCreate200ResponseInnerDataOneOf([void updates(SchedulesCreate200ResponseInnerDataOneOfBuilder b)]) = _$SchedulesCreate200ResponseInnerDataOneOf;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SchedulesCreate200ResponseInnerDataOneOfBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SchedulesCreate200ResponseInnerDataOneOf> get serializer => _$SchedulesCreate200ResponseInnerDataOneOfSerializer();
}

class _$SchedulesCreate200ResponseInnerDataOneOfSerializer implements PrimitiveSerializer<SchedulesCreate200ResponseInnerDataOneOf> {
  @override
  final Iterable<Type> types = const [SchedulesCreate200ResponseInnerDataOneOf, _$SchedulesCreate200ResponseInnerDataOneOf];

  @override
  final String wireName = r'SchedulesCreate200ResponseInnerDataOneOf';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SchedulesCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    yield r'schedule_id';
    yield serializers.serialize(
      object.scheduleId,
      specifiedType: const FullType(String),
    );
    yield r'exceptions';
    yield serializers.serialize(
      object.exceptions,
      specifiedType: const FullType(PinterestLibError),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SchedulesCreate200ResponseInnerDataOneOf object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SchedulesCreate200ResponseInnerDataOneOfBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'schedule_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.scheduleId = valueDes;
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PinterestLibError),
          ) as PinterestLibError;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SchedulesCreate200ResponseInnerDataOneOf deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SchedulesCreate200ResponseInnerDataOneOfBuilder();
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

