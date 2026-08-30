//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'carting_retailer.g.dart';

/// CartingRetailer
///
/// Properties:
/// * [retailerId] - Unique identifier for the retailer
/// * [retailerName] - Name of the retailer
@BuiltValue()
abstract class CartingRetailer implements Built<CartingRetailer, CartingRetailerBuilder> {
  /// Unique identifier for the retailer
  @BuiltValueField(wireName: r'retailer_id')
  String get retailerId;

  /// Name of the retailer
  @BuiltValueField(wireName: r'retailer_name')
  String get retailerName;

  CartingRetailer._();

  factory CartingRetailer([void updates(CartingRetailerBuilder b)]) = _$CartingRetailer;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CartingRetailerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CartingRetailer> get serializer => _$CartingRetailerSerializer();
}

class _$CartingRetailerSerializer implements PrimitiveSerializer<CartingRetailer> {
  @override
  final Iterable<Type> types = const [CartingRetailer, _$CartingRetailer];

  @override
  final String wireName = r'CartingRetailer';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CartingRetailer object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'retailer_id';
    yield serializers.serialize(
      object.retailerId,
      specifiedType: const FullType(String),
    );
    yield r'retailer_name';
    yield serializers.serialize(
      object.retailerName,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CartingRetailer object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CartingRetailerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'retailer_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.retailerId = valueDes;
          break;
        case r'retailer_name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.retailerName = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CartingRetailer deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CartingRetailerBuilder();
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

