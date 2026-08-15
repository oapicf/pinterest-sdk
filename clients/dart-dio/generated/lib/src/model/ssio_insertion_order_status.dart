//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ssio_insertion_order_status.g.dart';

/// SSIOInsertionOrderStatus
///
/// Properties:
/// * [creationTime] - Salesforce insertion order creation time
/// * [pinOrderId] - Salesforce order id
/// * [status] - Salesforce insertion order status
@BuiltValue(instantiable: false)
abstract class SSIOInsertionOrderStatus  {
  /// Salesforce insertion order creation time
  @BuiltValueField(wireName: r'creation_time')
  String? get creationTime;

  /// Salesforce order id
  @BuiltValueField(wireName: r'pin_order_id')
  String? get pinOrderId;

  /// Salesforce insertion order status
  @BuiltValueField(wireName: r'status')
  String? get status;

  @BuiltValueSerializer(custom: true)
  static Serializer<SSIOInsertionOrderStatus> get serializer => _$SSIOInsertionOrderStatusSerializer();
}

class _$SSIOInsertionOrderStatusSerializer implements PrimitiveSerializer<SSIOInsertionOrderStatus> {
  @override
  final Iterable<Type> types = const [SSIOInsertionOrderStatus];

  @override
  final String wireName = r'SSIOInsertionOrderStatus';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SSIOInsertionOrderStatus object, {
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
    SSIOInsertionOrderStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  SSIOInsertionOrderStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($SSIOInsertionOrderStatus)) as $SSIOInsertionOrderStatus;
  }
}

/// a concrete implementation of [SSIOInsertionOrderStatus], since [SSIOInsertionOrderStatus] is not instantiable
@BuiltValue(instantiable: true)
abstract class $SSIOInsertionOrderStatus implements SSIOInsertionOrderStatus, Built<$SSIOInsertionOrderStatus, $SSIOInsertionOrderStatusBuilder> {
  $SSIOInsertionOrderStatus._();

  factory $SSIOInsertionOrderStatus([void Function($SSIOInsertionOrderStatusBuilder)? updates]) = _$$SSIOInsertionOrderStatus;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($SSIOInsertionOrderStatusBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$SSIOInsertionOrderStatus> get serializer => _$$SSIOInsertionOrderStatusSerializer();
}

class _$$SSIOInsertionOrderStatusSerializer implements PrimitiveSerializer<$SSIOInsertionOrderStatus> {
  @override
  final Iterable<Type> types = const [$SSIOInsertionOrderStatus, _$$SSIOInsertionOrderStatus];

  @override
  final String wireName = r'$SSIOInsertionOrderStatus';

  @override
  Object serialize(
    Serializers serializers,
    $SSIOInsertionOrderStatus object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(SSIOInsertionOrderStatus))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SSIOInsertionOrderStatusBuilder result,
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
            specifiedType: const FullType(String),
          ) as String;
          result.pinOrderId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
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
  $SSIOInsertionOrderStatus deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $SSIOInsertionOrderStatusBuilder();
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

