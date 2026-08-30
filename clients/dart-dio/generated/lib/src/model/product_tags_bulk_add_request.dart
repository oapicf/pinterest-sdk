//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_tag_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_tags_bulk_add_request.g.dart';

/// Request body for bulk adding product tags to a pin.
///
/// Properties:
/// * [productTags] - List of product tags to add. Maximum 24 items allowed.
@BuiltValue()
abstract class ProductTagsBulkAddRequest implements Built<ProductTagsBulkAddRequest, ProductTagsBulkAddRequestBuilder> {
  /// List of product tags to add. Maximum 24 items allowed.
  @BuiltValueField(wireName: r'product_tags')
  BuiltList<ProductTagItem> get productTags;

  ProductTagsBulkAddRequest._();

  factory ProductTagsBulkAddRequest([void updates(ProductTagsBulkAddRequestBuilder b)]) = _$ProductTagsBulkAddRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductTagsBulkAddRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductTagsBulkAddRequest> get serializer => _$ProductTagsBulkAddRequestSerializer();
}

class _$ProductTagsBulkAddRequestSerializer implements PrimitiveSerializer<ProductTagsBulkAddRequest> {
  @override
  final Iterable<Type> types = const [ProductTagsBulkAddRequest, _$ProductTagsBulkAddRequest];

  @override
  final String wireName = r'ProductTagsBulkAddRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductTagsBulkAddRequest object, {
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
    ProductTagsBulkAddRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductTagsBulkAddRequestBuilder result,
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
  ProductTagsBulkAddRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductTagsBulkAddRequestBuilder();
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

