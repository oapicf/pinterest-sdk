//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_tag_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_tags_response.g.dart';

/// Response containing a list of product tags for a pin.
///
/// Properties:
/// * [productTags] - List of product tags on the pin.
@BuiltValue()
abstract class ProductTagsResponse implements Built<ProductTagsResponse, ProductTagsResponseBuilder> {
  /// List of product tags on the pin.
  @BuiltValueField(wireName: r'product_tags')
  BuiltList<ProductTagItem> get productTags;

  ProductTagsResponse._();

  factory ProductTagsResponse([void updates(ProductTagsResponseBuilder b)]) = _$ProductTagsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductTagsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductTagsResponse> get serializer => _$ProductTagsResponseSerializer();
}

class _$ProductTagsResponseSerializer implements PrimitiveSerializer<ProductTagsResponse> {
  @override
  final Iterable<Type> types = const [ProductTagsResponse, _$ProductTagsResponse];

  @override
  final String wireName = r'ProductTagsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductTagsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'product_tags';
    yield serializers.serialize(
      object.productTags,
      specifiedType: const FullType(BuiltList, [FullType(ProductTagItem)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductTagsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductTagsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'product_tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductTagItem)]),
          ) as BuiltList<ProductTagItem>;
          result.productTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductTagsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductTagsResponseBuilder();
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

