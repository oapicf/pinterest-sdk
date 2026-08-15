//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_edit_insertion_order_response.g.dart';

/// SSIOEditInsertionOrderResponse
///
/// Properties:
/// * [pinOrderId] - Salesforce order id
@BuiltValue()
abstract class SSIOEditInsertionOrderResponse implements Built<SSIOEditInsertionOrderResponse, SSIOEditInsertionOrderResponseBuilder> {
  /// Salesforce order id
  @BuiltValueField(wireName: r'pin_order_id')
  String? get pinOrderId;

  SSIOEditInsertionOrderResponse._();

  factory SSIOEditInsertionOrderResponse([void updates(SSIOEditInsertionOrderResponseBuilder b)]) = _$SSIOEditInsertionOrderResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOEditInsertionOrderResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOEditInsertionOrderResponse> get serializer => _$SSIOEditInsertionOrderResponseSerializer();
}

class _$SSIOEditInsertionOrderResponseSerializer implements PrimitiveSerializer<SSIOEditInsertionOrderResponse> {
  @override
  final Iterable<Type> types = const [SSIOEditInsertionOrderResponse, _$SSIOEditInsertionOrderResponse];

  @override
  final String wireName = r'SSIOEditInsertionOrderResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOEditInsertionOrderResponse object, {
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
    SSIOEditInsertionOrderResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOEditInsertionOrderResponseBuilder result,
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
  SSIOEditInsertionOrderResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOEditInsertionOrderResponseBuilder();
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

