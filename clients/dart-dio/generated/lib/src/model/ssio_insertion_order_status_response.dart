//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ssio_insertion_order_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order_status_response.g.dart';

/// SSIO insertion order status response for a single pin order id lookup.
///
/// Properties:
/// * [creationTime] - Salesforce insertion order creation time
/// * [pinOrderId] - Salesforce order id
/// * [status] - Salesforce insertion order status
@BuiltValue()
abstract class SSIOInsertionOrderStatusResponse implements SSIOInsertionOrderStatus, Built<SSIOInsertionOrderStatusResponse, SSIOInsertionOrderStatusResponseBuilder> {
  SSIOInsertionOrderStatusResponse._();

  factory SSIOInsertionOrderStatusResponse([void updates(SSIOInsertionOrderStatusResponseBuilder b)]) = _$SSIOInsertionOrderStatusResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOInsertionOrderStatusResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrderStatusResponse> get serializer => _$SSIOInsertionOrderStatusResponseSerializer();
}

class _$SSIOInsertionOrderStatusResponseSerializer implements PrimitiveSerializer<SSIOInsertionOrderStatusResponse> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrderStatusResponse, _$SSIOInsertionOrderStatusResponse];

  @override
  final String wireName = r'SSIOInsertionOrderStatusResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrderStatusResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.creationTime != null) {
      yield r'creation_time';
      yield serializers.serialize(
        object.creationTime,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.pinOrderId != null) {
      yield r'pin_order_id';
      yield serializers.serialize(
        object.pinOrderId,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    SSIOInsertionOrderStatusResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderStatusResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'creation_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.creationTime = valueDes;
          break;
        case r'pin_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.pinOrderId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  SSIOInsertionOrderStatusResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOInsertionOrderStatusResponseBuilder();
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

