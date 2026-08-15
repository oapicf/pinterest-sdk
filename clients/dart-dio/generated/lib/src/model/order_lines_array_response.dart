//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_lines.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_lines_array_response.g.dart';

/// OrderLinesArrayResponse
///
/// Properties:
/// * [items] 
@BuiltValue()
abstract class OrderLinesArrayResponse implements Built<OrderLinesArrayResponse, OrderLinesArrayResponseBuilder> {
  @BuiltValueField(wireName: r'items')
  BuiltList<OrderLines>? get items;

  OrderLinesArrayResponse._();

  factory OrderLinesArrayResponse([void updates(OrderLinesArrayResponseBuilder b)]) = _$OrderLinesArrayResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLinesArrayResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLinesArrayResponse> get serializer => _$OrderLinesArrayResponseSerializer();
}

class _$OrderLinesArrayResponseSerializer implements PrimitiveSerializer<OrderLinesArrayResponse> {
  @override
  final Iterable<Type> types = const [OrderLinesArrayResponse, _$OrderLinesArrayResponse];

  @override
  final String wireName = r'OrderLinesArrayResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLinesArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(OrderLines)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLinesArrayResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLinesArrayResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(OrderLines)]),
          ) as BuiltList<OrderLines>;
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
  OrderLinesArrayResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLinesArrayResponseBuilder();
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

