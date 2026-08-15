//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/paginated.dart';
import 'package:openapi/src/model/order_line.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_lines_list200_response.g.dart';

/// OrderLinesList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class OrderLinesList200Response implements Paginated, Built<OrderLinesList200Response, OrderLinesList200ResponseBuilder> {
  OrderLinesList200Response._();

  factory OrderLinesList200Response([void updates(OrderLinesList200ResponseBuilder b)]) = _$OrderLinesList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLinesList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLinesList200Response> get serializer => _$OrderLinesList200ResponseSerializer();
}

class _$OrderLinesList200ResponseSerializer implements PrimitiveSerializer<OrderLinesList200Response> {
  @override
  final Iterable<Type> types = const [OrderLinesList200Response, _$OrderLinesList200Response];

  @override
  final String wireName = r'OrderLinesList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLinesList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLinesList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLinesList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(JsonObject)]),
          ) as BuiltList<JsonObject>;
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
  OrderLinesList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLinesList200ResponseBuilder();
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

