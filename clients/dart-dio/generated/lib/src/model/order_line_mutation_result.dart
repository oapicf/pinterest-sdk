//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_line.dart';
import 'package:openapi/src/model/order_line_mutation_error.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_mutation_result.g.dart';

/// OrderLineMutationResult
///
/// Properties:
/// * [errors] - Error list if update(s) fail.
/// * [orderLine] - Order Line object array.
@BuiltValue()
abstract class OrderLineMutationResult implements Built<OrderLineMutationResult, OrderLineMutationResultBuilder> {
  /// Error list if update(s) fail.
  @BuiltValueField(wireName: r'errors')
  BuiltList<OrderLineMutationError>? get errors;

  /// Order Line object array.
  @BuiltValueField(wireName: r'order_line')
  BuiltList<OrderLine>? get orderLine;

  OrderLineMutationResult._();

  factory OrderLineMutationResult([void updates(OrderLineMutationResultBuilder b)]) = _$OrderLineMutationResult;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineMutationResultBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineMutationResult> get serializer => _$OrderLineMutationResultSerializer();
}

class _$OrderLineMutationResultSerializer implements PrimitiveSerializer<OrderLineMutationResult> {
  @override
  final Iterable<Type> types = const [OrderLineMutationResult, _$OrderLineMutationResult];

  @override
  final String wireName = r'OrderLineMutationResult';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineMutationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(OrderLineMutationError)]),
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
    OrderLineMutationResult object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineMutationResultBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(OrderLineMutationError)]),
          ) as BuiltList<OrderLineMutationError>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'order_line':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(OrderLine)]),
          ) as BuiltList<OrderLine>?;
          if (valueDes == null) continue;
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
  OrderLineMutationResult deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineMutationResultBuilder();
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

