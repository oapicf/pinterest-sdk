//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_line.dart';
import 'package:openapi/src/model/order_line_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_response.g.dart';

/// OrderLineResponse
///
/// Properties:
/// * [errors] - Error list if update(s) fail.
/// * [orderLine] - Order Line object array.
@BuiltValue()
abstract class OrderLineResponse implements Built<OrderLineResponse, OrderLineResponseBuilder> {
  /// Error list if update(s) fail.
  @BuiltValueField(wireName: r'errors')
  BuiltList<OrderLineError>? get errors;

  /// Order Line object array.
  @BuiltValueField(wireName: r'order_line')
  BuiltList<OrderLine>? get orderLine;

  OrderLineResponse._();

  factory OrderLineResponse([void updates(OrderLineResponseBuilder b)]) = _$OrderLineResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineResponse> get serializer => _$OrderLineResponseSerializer();
}

class _$OrderLineResponseSerializer implements PrimitiveSerializer<OrderLineResponse> {
  @override
  final Iterable<Type> types = const [OrderLineResponse, _$OrderLineResponse];

  @override
  final String wireName = r'OrderLineResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(OrderLineError)]),
      );
    }
    if (object.orderLine != null) {
      yield r'order_line';
      yield serializers.serialize(
        object.orderLine,
        specifiedType: const FullType(BuiltList, [FullType(OrderLine)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLineResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(OrderLineError)]),
          ) as BuiltList<OrderLineError>;
          result.errors.replace(valueDes);
          break;
        case r'order_line':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(OrderLine)]),
          ) as BuiltList<OrderLine>;
          result.orderLine.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrderLineResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineResponseBuilder();
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

