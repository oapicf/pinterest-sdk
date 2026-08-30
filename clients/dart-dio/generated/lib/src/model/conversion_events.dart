//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/conversion_api_response_events_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_events.g.dart';

/// Conversion events.
///
/// Properties:
/// * [events] - Specific messages for each event received. The order will match the order in which the events were received in the request.
/// * [numEventsProcessed] - Number of events that were successfully processed from the events.
/// * [numEventsReceived] - Total number of events received in the request.
@BuiltValue()
abstract class ConversionEvents implements Built<ConversionEvents, ConversionEventsBuilder> {
  /// Specific messages for each event received. The order will match the order in which the events were received in the request.
  @BuiltValueField(wireName: r'events')
  BuiltList<ConversionApiResponseEventsItems> get events;

  /// Number of events that were successfully processed from the events.
  @BuiltValueField(wireName: r'num_events_processed')
  int get numEventsProcessed;

  /// Total number of events received in the request.
  @BuiltValueField(wireName: r'num_events_received')
  int get numEventsReceived;

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
    yield r'events';
    yield serializers.serialize(
      object.events,
      specifiedType: const FullType(BuiltList, [FullType(ConversionApiResponseEventsItems)]),
    );
    yield r'num_events_processed';
    yield serializers.serialize(
      object.numEventsProcessed,
      specifiedType: const FullType(int),
    );
    yield r'num_events_received';
    yield serializers.serialize(
      object.numEventsReceived,
      specifiedType: const FullType(int),
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
        case r'events':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionApiResponseEventsItems)]),
          ) as BuiltList<ConversionApiResponseEventsItems>;
          result.events.replace(valueDes);
          break;
        case r'num_events_processed':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.numEventsProcessed = valueDes;
          break;
        case r'num_events_received':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.numEventsReceived = valueDes;
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

