//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/advertiser_defined_event_processing_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_events_create200_response.g.dart';

/// AdvertiserDefinedEventsCreate200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class AdvertiserDefinedEventsCreate200Response implements Built<AdvertiserDefinedEventsCreate200Response, AdvertiserDefinedEventsCreate200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvertiserDefinedEventProcessingRecord> get items;

  AdvertiserDefinedEventsCreate200Response._();

  factory AdvertiserDefinedEventsCreate200Response([void updates(AdvertiserDefinedEventsCreate200ResponseBuilder b)]) = _$AdvertiserDefinedEventsCreate200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventsCreate200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventsCreate200Response> get serializer => _$AdvertiserDefinedEventsCreate200ResponseSerializer();
}

class _$AdvertiserDefinedEventsCreate200ResponseSerializer implements PrimitiveSerializer<AdvertiserDefinedEventsCreate200Response> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventsCreate200Response, _$AdvertiserDefinedEventsCreate200Response];

  @override
  final String wireName = r'AdvertiserDefinedEventsCreate200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEventProcessingRecord)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventsCreate200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventsCreate200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEventProcessingRecord)]),
          ) as BuiltList<AdvertiserDefinedEventProcessingRecord>;
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
  AdvertiserDefinedEventsCreate200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventsCreate200ResponseBuilder();
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

