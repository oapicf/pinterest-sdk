//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order.g.dart';

/// An SSIO insertion order.
///
/// Properties:
/// * [pinOrderId] - Salesforce order id
@BuiltValue()
abstract class SSIOInsertionOrder implements Built<SSIOInsertionOrder, SSIOInsertionOrderBuilder> {
  /// Salesforce order id
  @BuiltValueField(wireName: r'pin_order_id')
  String? get pinOrderId;

  SSIOInsertionOrder._();

  factory SSIOInsertionOrder([void updates(SSIOInsertionOrderBuilder b)]) = _$SSIOInsertionOrder;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SSIOInsertionOrderBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrder> get serializer => _$SSIOInsertionOrderSerializer();
}

class _$SSIOInsertionOrderSerializer implements PrimitiveSerializer<SSIOInsertionOrder> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrder, _$SSIOInsertionOrder];

  @override
  final String wireName = r'SSIOInsertionOrder';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrder object, {
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
    SSIOInsertionOrder object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pin_order_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  SSIOInsertionOrder deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SSIOInsertionOrderBuilder();
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

