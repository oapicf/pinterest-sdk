//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_create_insertion_order_response.g.dart';

/// SSIOCreateInsertionOrderResponse
///
/// Properties:
/// * [pinOrderId] - Salesforce order id
@BuiltValue()
abstract class SSIOCreateInsertionOrderResponse implements Built<SSIOCreateInsertionOrderResponse, SSIOCreateInsertionOrderResponseBuilder> {
  /// Salesforce order id
  @BuiltValueField(wireName: r'pin_order_id')
  String? get pinOrderId;

  SSIOCreateInsertionOrderResponse._();

  factory SSIOCreateInsertionOrderResponse([void updates(SSIOCreateInsertionOrderResponseBuilder b)]) = _$SSIOCreateInsertionOrderResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOCreateInsertionOrderResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOCreateInsertionOrderResponse> get serializer => _$SSIOCreateInsertionOrderResponseSerializer();
}

class _$SSIOCreateInsertionOrderResponseSerializer implements PrimitiveSerializer<SSIOCreateInsertionOrderResponse> {
  @override
  final Iterable<Type> types = const [SSIOCreateInsertionOrderResponse, _$SSIOCreateInsertionOrderResponse];

  @override
  final String wireName = r'SSIOCreateInsertionOrderResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOCreateInsertionOrderResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pinOrderId != null) {
      yield r'pin_order_id';
      yield serializers.serialize(
        object.pinOrderId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOCreateInsertionOrderResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOCreateInsertionOrderResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pin_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinOrderId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOCreateInsertionOrderResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOCreateInsertionOrderResponseBuilder();
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

