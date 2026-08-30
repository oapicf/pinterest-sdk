//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/delivery_metrics_response_items_items.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delivery_metrics_get200_response.g.dart';

/// DeliveryMetricsGet200Response
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class DeliveryMetricsGet200Response implements Built<DeliveryMetricsGet200Response, DeliveryMetricsGet200ResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<DeliveryMetricsResponseItemsItems> get items;

  DeliveryMetricsGet200Response._();

  factory DeliveryMetricsGet200Response([void updates(DeliveryMetricsGet200ResponseBuilder b)]) = _$DeliveryMetricsGet200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeliveryMetricsGet200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeliveryMetricsGet200Response> get serializer => _$DeliveryMetricsGet200ResponseSerializer();
}

class _$DeliveryMetricsGet200ResponseSerializer implements PrimitiveSerializer<DeliveryMetricsGet200Response> {
  @override
  final Iterable<Type> types = const [DeliveryMetricsGet200Response, _$DeliveryMetricsGet200Response];

  @override
  final String wireName = r'DeliveryMetricsGet200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeliveryMetricsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(DeliveryMetricsResponseItemsItems)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    DeliveryMetricsGet200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeliveryMetricsGet200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeliveryMetricsResponseItemsItems)]),
          ) as BuiltList<DeliveryMetricsResponseItemsItems>;
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
  DeliveryMetricsGet200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeliveryMetricsGet200ResponseBuilder();
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

