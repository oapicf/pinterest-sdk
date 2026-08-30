//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_group_promotion.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_promotions_list200_response.g.dart';

/// ProductGroupPromotionsList200Response
///
/// Properties:
/// * [bookmark] 
/// * [items] 
@BuiltValue()
abstract class ProductGroupPromotionsList200Response implements Built<ProductGroupPromotionsList200Response, ProductGroupPromotionsList200ResponseBuilder> {
  @BuiltValueField(wireName: r'bookmark')
  String? get bookmark;

  @BuiltValueField(wireName: r'items')
  BuiltList<ProductGroupPromotion> get items;

  ProductGroupPromotionsList200Response._();

  factory ProductGroupPromotionsList200Response([void updates(ProductGroupPromotionsList200ResponseBuilder b)]) = _$ProductGroupPromotionsList200Response;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupPromotionsList200ResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupPromotionsList200Response> get serializer => _$ProductGroupPromotionsList200ResponseSerializer();
}

class _$ProductGroupPromotionsList200ResponseSerializer implements PrimitiveSerializer<ProductGroupPromotionsList200Response> {
  @override
  final Iterable<Type> types = const [ProductGroupPromotionsList200Response, _$ProductGroupPromotionsList200Response];

  @override
  final String wireName = r'ProductGroupPromotionsList200Response';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupPromotionsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bookmark != null) {
      yield r'bookmark';
      yield serializers.serialize(
        object.bookmark,
        specifiedType: const FullType.nullable(String),
      );
    }
    yield r'items';
    yield serializers.serialize(
      object.items,
      specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotion)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupPromotionsList200Response object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupPromotionsList200ResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bookmark':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.bookmark = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotion)]),
          ) as BuiltList<ProductGroupPromotion>;
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
  ProductGroupPromotionsList200Response deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupPromotionsList200ResponseBuilder();
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

