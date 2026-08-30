//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_group_promotion_response_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_promotions.g.dart';

/// Wrapper model for ProductGroupPromotion.
///
/// Properties:
/// * [items] - Response-only: created or updated product group promotions, or exceptions.
@BuiltValue()
abstract class ProductGroupPromotions implements Built<ProductGroupPromotions, ProductGroupPromotionsBuilder> {
  /// Response-only: created or updated product group promotions, or exceptions.
  @BuiltValueField(wireName: r'items')
  BuiltList<ProductGroupPromotionResponseItem>? get items;

  ProductGroupPromotions._();

  factory ProductGroupPromotions([void updates(ProductGroupPromotionsBuilder b)]) = _$ProductGroupPromotions;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupPromotionsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupPromotions> get serializer => _$ProductGroupPromotionsSerializer();
}

class _$ProductGroupPromotionsSerializer implements PrimitiveSerializer<ProductGroupPromotions> {
  @override
  final Iterable<Type> types = const [ProductGroupPromotions, _$ProductGroupPromotions];

  @override
  final String wireName = r'ProductGroupPromotions';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupPromotions object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotionResponseItem)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupPromotions object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupPromotionsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ProductGroupPromotionResponseItem)]),
          ) as BuiltList<ProductGroupPromotionResponseItem>?;
          if (valueDes == null) continue;
          result.items.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupPromotions deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupPromotionsBuilder();
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

