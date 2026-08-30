//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/schedules_create200_response_inner_data.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'schedules_create200_response_inner.g.dart';

/// SchedulesCreate200ResponseInner
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class SchedulesCreate200ResponseInner implements Built<SchedulesCreate200ResponseInner, SchedulesCreate200ResponseInnerBuilder> {
  @BuiltValueField(wireName: r'data')
  SchedulesCreate200ResponseInnerData get data;

  SchedulesCreate200ResponseInner._();

  factory SchedulesCreate200ResponseInner([void updates(SchedulesCreate200ResponseInnerBuilder b)]) = _$SchedulesCreate200ResponseInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SchedulesCreate200ResponseInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SchedulesCreate200ResponseInner> get serializer => _$SchedulesCreate200ResponseInnerSerializer();
}

class _$SchedulesCreate200ResponseInnerSerializer implements PrimitiveSerializer<SchedulesCreate200ResponseInner> {
  @override
  final Iterable<Type> types = const [SchedulesCreate200ResponseInner, _$SchedulesCreate200ResponseInner];

  @override
  final String wireName = r'SchedulesCreate200ResponseInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SchedulesCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(SchedulesCreate200ResponseInnerData),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SchedulesCreate200ResponseInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SchedulesCreate200ResponseInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SchedulesCreate200ResponseInnerData),
          ) as SchedulesCreate200ResponseInnerData;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SchedulesCreate200ResponseInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SchedulesCreate200ResponseInnerBuilder();
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

