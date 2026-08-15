//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_group_promotion.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_promotion_update_request.g.dart';

/// ProductGroupPromotionUpdateRequest
///
/// Properties:
/// * [adGroupId] - ID of the ad group the product group belongs to.
/// * [productGroupPromotion] 
@BuiltValue()
abstract class ProductGroupPromotionUpdateRequest implements Built<ProductGroupPromotionUpdateRequest, ProductGroupPromotionUpdateRequestBuilder> {
  /// ID of the ad group the product group belongs to.
  @BuiltValueField(wireName: r'ad_group_id')
  String get adGroupId;

  @BuiltValueField(wireName: r'product_group_promotion')
  BuiltList<ProductGroupPromotion> get productGroupPromotion;

  ProductGroupPromotionUpdateRequest._();

  factory ProductGroupPromotionUpdateRequest([void updates(ProductGroupPromotionUpdateRequestBuilder b)]) = _$ProductGroupPromotionUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupPromotionUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupPromotionUpdateRequest> get serializer => _$ProductGroupPromotionUpdateRequestSerializer();
}

class _$ProductGroupPromotionUpdateRequestSerializer implements PrimitiveSerializer<ProductGroupPromotionUpdateRequest> {
  @override
  final Iterable<Type> types = const [ProductGroupPromotionUpdateRequest, _$ProductGroupPromotionUpdateRequest];

  @override
  final String wireName = r'ProductGroupPromotionUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupPromotionUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_group_id';
    yield serializers.serialize(
      object.adGroupId,
      specifiedType: const FullType(String),
    );
    yield r'product_group_promotion';
    yield serializers.serialize(
      object.productGroupPromotion,
      specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotion)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupPromotionUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupPromotionUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adGroupId = valueDes;
          break;
        case r'product_group_promotion':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductGroupPromotion)]),
          ) as BuiltList<ProductGroupPromotion>;
          result.productGroupPromotion.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupPromotionUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupPromotionUpdateRequestBuilder();
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

