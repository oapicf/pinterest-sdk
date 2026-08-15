//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advertiser_defined_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_events_response.g.dart';

/// AdvertiserDefinedEventsResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdvertiserDefinedEventsResponse implements Built<AdvertiserDefinedEventsResponse, AdvertiserDefinedEventsResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvertiserDefinedEvent>? get items;

  AdvertiserDefinedEventsResponse._();

  factory AdvertiserDefinedEventsResponse([void updates(AdvertiserDefinedEventsResponseBuilder b)]) = _$AdvertiserDefinedEventsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventsResponse> get serializer => _$AdvertiserDefinedEventsResponseSerializer();
}

class _$AdvertiserDefinedEventsResponseSerializer implements PrimitiveSerializer<AdvertiserDefinedEventsResponse> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventsResponse, _$AdvertiserDefinedEventsResponse];

  @override
  final String wireName = r'AdvertiserDefinedEventsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEvent)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEvent)]),
          ) as BuiltList<AdvertiserDefinedEvent>;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdvertiserDefinedEventsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventsResponseBuilder();
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

