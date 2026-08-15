//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_events_data_inner.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events.g.dart';

/// A list of events (one or more) encapsulated by a data object.
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class ConversionEvents implements Built<ConversionEvents, ConversionEventsBuilder> {
  @BuiltValueField(wireName: r'data')
  BuiltList<ConversionEventsDataInner> get data;

  ConversionEvents._();

  factory ConversionEvents([void updates(ConversionEventsBuilder b)]) = _$ConversionEvents;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEvents> get serializer => _$ConversionEventsSerializer();
}

class _$ConversionEventsSerializer implements PrimitiveSerializer<ConversionEvents> {
  @override
  final Iterable<Type> types = const [ConversionEvents, _$ConversionEvents];

  @override
  final String wireName = r'ConversionEvents';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEvents object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEvents object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataInner)]),
          ) as BuiltList<ConversionEventsDataInner>;
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
  ConversionEvents deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsBuilder();
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

