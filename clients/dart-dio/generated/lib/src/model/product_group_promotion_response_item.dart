//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_group_promotion.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/exception.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_promotion_response_item.g.dart';

/// ProductGroupPromotionResponseItem
///
/// Properties:
/// * [data] 
/// * [exceptions] 
@BuiltValue()
abstract class ProductGroupPromotionResponseItem implements Built<ProductGroupPromotionResponseItem, ProductGroupPromotionResponseItemBuilder> {
  @BuiltValueField(wireName: r'data')
  ProductGroupPromotion? get data;

  @BuiltValueField(wireName: r'exceptions')
  BuiltList<Exception>? get exceptions;

  ProductGroupPromotionResponseItem._();

  factory ProductGroupPromotionResponseItem([void updates(ProductGroupPromotionResponseItemBuilder b)]) = _$ProductGroupPromotionResponseItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupPromotionResponseItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupPromotionResponseItem> get serializer => _$ProductGroupPromotionResponseItemSerializer();
}

class _$ProductGroupPromotionResponseItemSerializer implements PrimitiveSerializer<ProductGroupPromotionResponseItem> {
  @override
  final Iterable<Type> types = const [ProductGroupPromotionResponseItem, _$ProductGroupPromotionResponseItem];

  @override
  final String wireName = r'ProductGroupPromotionResponseItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupPromotionResponseItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.data != null) {
      yield r'data';
      yield serializers.serialize(
        object.data,
        specifiedType: const FullType(ProductGroupPromotion),
      );
    }
    if (object.exceptions != null) {
      yield r'exceptions';
      yield serializers.serialize(
        object.exceptions,
        specifiedType: const FullType(BuiltList, [FullType(Exception)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupPromotionResponseItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupPromotionResponseItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ProductGroupPromotion),
          ) as ProductGroupPromotion?;
          if (valueDes == null) continue;
          result.data.replace(valueDes);
          break;
        case r'exceptions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(Exception)]),
          ) as BuiltList<Exception>?;
          if (valueDes == null) continue;
          result.exceptions.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupPromotionResponseItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupPromotionResponseItemBuilder();
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

