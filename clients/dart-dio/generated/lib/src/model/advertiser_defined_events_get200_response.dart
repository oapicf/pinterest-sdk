//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advertiser_defined_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_events_get200_response.g.dart';

/// AdvertiserDefinedEventsGet200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdvertiserDefinedEventsGet200Response implements Built<AdvertiserDefinedEventsGet200Response, AdvertiserDefinedEventsGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvertiserDefinedEvent> get items;

  AdvertiserDefinedEventsGet200Response._();

  factory AdvertiserDefinedEventsGet200Response([void updates(AdvertiserDefinedEventsGet200ResponseBuilder b)]) = _$AdvertiserDefinedEventsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventsGet200Response> get serializer => _$AdvertiserDefinedEventsGet200ResponseSerializer();
}

class _$AdvertiserDefinedEventsGet200ResponseSerializer implements PrimitiveSerializer<AdvertiserDefinedEventsGet200Response> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventsGet200Response, _$AdvertiserDefinedEventsGet200Response];

  @override
  final String wireName = r'AdvertiserDefinedEventsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEvent)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventsGet200ResponseBuilder result,
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
  AdvertiserDefinedEventsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventsGet200ResponseBuilder();
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

