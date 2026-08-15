//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/order_line.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'order_line_error.g.dart';

/// OrderLineError
///
/// Properties:
/// * [data] 
/// * [errorMessages] 
@BuiltValue()
abstract class OrderLineError implements Built<OrderLineError, OrderLineErrorBuilder> {
  @BuiltValueField(wireName: r'data')
  OrderLine? get data;

  @BuiltValueField(wireName: r'error_messages')
  BuiltList<String>? get errorMessages;

  OrderLineError._();

  factory OrderLineError([void updates(OrderLineErrorBuilder b)]) = _$OrderLineError;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrderLineErrorBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrderLineError> get serializer => _$OrderLineErrorSerializer();
}

class _$OrderLineErrorSerializer implements PrimitiveSerializer<OrderLineError> {
  @override
  final Iterable<Type> types = const [OrderLineError, _$OrderLineError];

  @override
  final String wireName = r'OrderLineError';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrderLineError object, {
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
    OrderLineError object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrderLineErrorBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(OrderLine),
          ) as OrderLine;
          result.data = valueDes;
          break;
        case r'error_messages':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
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
  OrderLineError deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrderLineErrorBuilder();
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

