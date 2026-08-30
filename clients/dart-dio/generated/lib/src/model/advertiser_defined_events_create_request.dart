//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/advertiser_defined_event_input.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'advertiser_defined_events_create_request.g.dart';

/// Request body for creating or updating advertiser defined events
///
/// Properties:
/// * [items] - List of advertiser defined events to create or update
@BuiltValue()
abstract class AdvertiserDefinedEventsCreateRequest implements Built<AdvertiserDefinedEventsCreateRequest, AdvertiserDefinedEventsCreateRequestBuilder> {
  /// List of advertiser defined events to create or update
  @BuiltValueField(wireName: r'items')
  BuiltList<AdvertiserDefinedEventInput> get items;

  AdvertiserDefinedEventsCreateRequest._();

  factory AdvertiserDefinedEventsCreateRequest([void updates(AdvertiserDefinedEventsCreateRequestBuilder b)]) = _$AdvertiserDefinedEventsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdvertiserDefinedEventsCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdvertiserDefinedEventsCreateRequest> get serializer => _$AdvertiserDefinedEventsCreateRequestSerializer();
}

class _$AdvertiserDefinedEventsCreateRequestSerializer implements PrimitiveSerializer<AdvertiserDefinedEventsCreateRequest> {
  @override
  final Iterable<Type> types = const [AdvertiserDefinedEventsCreateRequest, _$AdvertiserDefinedEventsCreateRequest];

  @override
  final String wireName = r'AdvertiserDefinedEventsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdvertiserDefinedEventsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEventInput)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    AdvertiserDefinedEventsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdvertiserDefinedEventsCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdvertiserDefinedEventInput)]),
          ) as BuiltList<AdvertiserDefinedEventInput>;
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
  AdvertiserDefinedEventsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdvertiserDefinedEventsCreateRequestBuilder();
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

