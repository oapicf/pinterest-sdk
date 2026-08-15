//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_type1_filter.g.dart';

/// ProductType1Filter
///
/// Properties:
/// * [pRODUCTTYPE1] 
@BuiltValue()
abstract class ProductType1Filter implements Built<ProductType1Filter, ProductType1FilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_TYPE_1')
  CatalogsProductGroupMultipleStringListCriteria get pRODUCTTYPE1;

  ProductType1Filter._();

  factory ProductType1Filter([void updates(ProductType1FilterBuilder b)]) = _$ProductType1Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductType1FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductType1Filter> get serializer => _$ProductType1FilterSerializer();
}

class _$ProductType1FilterSerializer implements PrimitiveSerializer<ProductType1Filter> {
  @override
  final Iterable<Type> types = const [ProductType1Filter, _$ProductType1Filter];

  @override
  final String wireName = r'ProductType1Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductType1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_TYPE_1';
    yield serializers.serialize(
      object.pRODUCTTYPE1,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductType1Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductType1FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_TYPE_1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.pRODUCTTYPE1 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductType1Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductType1FilterBuilder();
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

