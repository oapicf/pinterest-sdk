//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_line.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_mutation_error.g.dart';

/// OrderLineMutationError
///
/// Properties:
/// * [data] 
/// * [errorMessages] - Error messages.
@BuiltValue()
abstract class OrderLineMutationError implements Built<OrderLineMutationError, OrderLineMutationErrorBuilder> {
  @BuiltValueField(wireName: r'data')
  OrderLine? get data;

  /// Error messages.
  @BuiltValueField(wireName: r'error_messages')
  BuiltList<String>? get errorMessages;

  OrderLineMutationError._();

  factory OrderLineMutationError([void updates(OrderLineMutationErrorBuilder b)]) = _$OrderLineMutationError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineMutationErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineMutationError> get serializer => _$OrderLineMutationErrorSerializer();
}

class _$OrderLineMutationErrorSerializer implements PrimitiveSerializer<OrderLineMutationError> {
  @override
  final Iterable<Type> types = const [OrderLineMutationError, _$OrderLineMutationError];

  @override
  final String wireName = r'OrderLineMutationError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineMutationError object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(OrderLine),
      );
    }
    if (object.errorMessages != null) {
      yield r'error_messages';
      yield serializers.serialize(
        object.errorMessages,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrderLineMutationError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineMutationErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OrderLine),
          ) as OrderLine?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'error_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.errorMessages.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrderLineMutationError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineMutationErrorBuilder();
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

