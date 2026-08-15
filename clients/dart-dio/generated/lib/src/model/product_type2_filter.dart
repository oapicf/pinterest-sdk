//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_type2_filter.g.dart';

/// ProductType2Filter
///
/// Properties:
/// * [pRODUCTTYPE2] 
@BuiltValue()
abstract class ProductType2Filter implements Built<ProductType2Filter, ProductType2FilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_TYPE_2')
  CatalogsProductGroupMultipleStringListCriteria get pRODUCTTYPE2;

  ProductType2Filter._();

  factory ProductType2Filter([void updates(ProductType2FilterBuilder b)]) = _$ProductType2Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductType2FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductType2Filter> get serializer => _$ProductType2FilterSerializer();
}

class _$ProductType2FilterSerializer implements PrimitiveSerializer<ProductType2Filter> {
  @override
  final Iterable<Type> types = const [ProductType2Filter, _$ProductType2Filter];

  @override
  final String wireName = r'ProductType2Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductType2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_TYPE_2';
    yield serializers.serialize(
      object.pRODUCTTYPE2,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductType2Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductType2FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_TYPE_2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.pRODUCTTYPE2 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductType2Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductType2FilterBuilder();
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

