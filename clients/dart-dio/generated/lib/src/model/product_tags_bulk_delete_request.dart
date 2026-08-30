//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_tag_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_tags_bulk_delete_request.g.dart';

/// Request body for bulk deleting product tags from a pin.
///
/// Properties:
/// * [productTags] - List of product tags to delete.
@BuiltValue()
abstract class ProductTagsBulkDeleteRequest implements Built<ProductTagsBulkDeleteRequest, ProductTagsBulkDeleteRequestBuilder> {
  /// List of product tags to delete.
  @BuiltValueField(wireName: r'product_tags')
  BuiltList<ProductTagItem> get productTags;

  ProductTagsBulkDeleteRequest._();

  factory ProductTagsBulkDeleteRequest([void updates(ProductTagsBulkDeleteRequestBuilder b)]) = _$ProductTagsBulkDeleteRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductTagsBulkDeleteRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductTagsBulkDeleteRequest> get serializer => _$ProductTagsBulkDeleteRequestSerializer();
}

class _$ProductTagsBulkDeleteRequestSerializer implements PrimitiveSerializer<ProductTagsBulkDeleteRequest> {
  @override
  final Iterable<Type> types = const [ProductTagsBulkDeleteRequest, _$ProductTagsBulkDeleteRequest];

  @override
  final String wireName = r'ProductTagsBulkDeleteRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductTagsBulkDeleteRequest object, {
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
    ProductTagsBulkDeleteRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductTagsBulkDeleteRequestBuilder result,
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
  ProductTagsBulkDeleteRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductTagsBulkDeleteRequestBuilder();
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

