//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/delivery_metrics_response_items_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'delivery_metrics_response.g.dart';

/// DeliveryMetricsResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class DeliveryMetricsResponse implements Built<DeliveryMetricsResponse, DeliveryMetricsResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<DeliveryMetricsResponseItemsInner>? get items;

  DeliveryMetricsResponse._();

  factory DeliveryMetricsResponse([void updates(DeliveryMetricsResponseBuilder b)]) = _$DeliveryMetricsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(DeliveryMetricsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<DeliveryMetricsResponse> get serializer => _$DeliveryMetricsResponseSerializer();
}

class _$DeliveryMetricsResponseSerializer implements PrimitiveSerializer<DeliveryMetricsResponse> {
  @override
  final Iterable<Type> types = const [DeliveryMetricsResponse, _$DeliveryMetricsResponse];

  @override
  final String wireName = r'DeliveryMetricsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    DeliveryMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(DeliveryMetricsResponseItemsInner)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    DeliveryMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required DeliveryMetricsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(DeliveryMetricsResponseItemsInner)]),
          ) as BuiltList<DeliveryMetricsResponseItemsInner>;
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
  DeliveryMetricsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = DeliveryMetricsResponseBuilder();
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

