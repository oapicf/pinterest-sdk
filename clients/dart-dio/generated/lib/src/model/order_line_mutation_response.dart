//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/order_line_mutation_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_mutation_response.g.dart';

/// OrderLineMutationResponse
///
/// Properties:
/// * [data] 
@BuiltValue()
abstract class OrderLineMutationResponse implements Built<OrderLineMutationResponse, OrderLineMutationResponseBuilder> {
  @BuiltValueField(wireName: r'data')
  OrderLineMutationResult? get data;

  OrderLineMutationResponse._();

  factory OrderLineMutationResponse([void updates(OrderLineMutationResponseBuilder b)]) = _$OrderLineMutationResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineMutationResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineMutationResponse> get serializer => _$OrderLineMutationResponseSerializer();
}

class _$OrderLineMutationResponseSerializer implements PrimitiveSerializer<OrderLineMutationResponse> {
  @override
  final Iterable<Type> types = const [OrderLineMutationResponse, _$OrderLineMutationResponse];

  @override
  final String wireName = r'OrderLineMutationResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineMutationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(OrderLineMutationResult),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLineMutationResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineMutationResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrderLineMutationResult),
          ) as OrderLineMutationResult?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrderLineMutationResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineMutationResponseBuilder();
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

