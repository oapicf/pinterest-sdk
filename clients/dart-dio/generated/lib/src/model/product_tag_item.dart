//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_tag_item.g.dart';

/// Product tag request item containing the pin_id of the product to tag.
///
/// Properties:
/// * [pinId] - Pin ID of the product pin to tag onto the hero pin.
@BuiltValue()
abstract class ProductTagItem implements Built<ProductTagItem, ProductTagItemBuilder> {
  /// Pin ID of the product pin to tag onto the hero pin.
  @BuiltValueField(wireName: r'pin_id')
  String get pinId;

  ProductTagItem._();

  factory ProductTagItem([void updates(ProductTagItemBuilder b)]) = _$ProductTagItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductTagItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductTagItem> get serializer => _$ProductTagItemSerializer();
}

class _$ProductTagItemSerializer implements PrimitiveSerializer<ProductTagItem> {
  @override
  final Iterable<Type> types = const [ProductTagItem, _$ProductTagItem];

  @override
  final String wireName = r'ProductTagItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductTagItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pin_id';
    yield serializers.serialize(
      object.pinId,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductTagItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductTagItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pin_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.pinId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductTagItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductTagItemBuilder();
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

