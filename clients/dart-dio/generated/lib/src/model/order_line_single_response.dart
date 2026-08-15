//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/order_line_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_single_response.g.dart';

/// OrderLineSingleResponse
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class OrderLineSingleResponse implements Built<OrderLineSingleResponse, OrderLineSingleResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  OrderLineResponse? get data;

  OrderLineSingleResponse._();

  factory OrderLineSingleResponse([void updates(OrderLineSingleResponseBuilder b)]) = _$OrderLineSingleResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineSingleResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineSingleResponse> get serializer => _$OrderLineSingleResponseSerializer();
}

class _$OrderLineSingleResponseSerializer implements PrimitiveSerializer<OrderLineSingleResponse> {
  @override
  final Iterable<Type> types = const [OrderLineSingleResponse, _$OrderLineSingleResponse];

  @override
  final String wireName = r'OrderLineSingleResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineSingleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(OrderLineResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLineSingleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineSingleResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OrderLineResponse),
          ) as OrderLineResponse;
          result.data = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrderLineSingleResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineSingleResponseBuilder();
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

