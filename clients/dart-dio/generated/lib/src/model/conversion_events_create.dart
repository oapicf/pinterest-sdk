//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_events_data_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events_create.g.dart';

/// Conversion events.
///
/// Properties:
/// * [data] - A list of events (one or more) encapsulated by a data object.
@BuiltValue()
abstract class ConversionEventsCreate implements Built<ConversionEventsCreate, ConversionEventsCreateBuilder> {
  /// A list of events (one or more) encapsulated by a data object.
  @BuiltValueField(wireName: r'data')
  BuiltList<ConversionEventsDataItems> get data;

  ConversionEventsCreate._();

  factory ConversionEventsCreate([void updates(ConversionEventsCreateBuilder b)]) = _$ConversionEventsCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionEventsCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionEventsCreate> get serializer => _$ConversionEventsCreateSerializer();
}

class _$ConversionEventsCreateSerializer implements PrimitiveSerializer<ConversionEventsCreate> {
  @override
  final Iterable<Type> types = const [ConversionEventsCreate, _$ConversionEventsCreate];

  @override
  final String wireName = r'ConversionEventsCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionEventsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'data';
    yield serializers.serialize(
      object.data,
      specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataItems)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionEventsCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionEventsCreateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionEventsDataItems)]),
          ) as BuiltList<ConversionEventsDataItems>;
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
  ConversionEventsCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionEventsCreateBuilder();
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

