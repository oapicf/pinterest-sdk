//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_type4_filter.g.dart';

/// ProductType4Filter
///
/// Properties:
/// * [pRODUCTTYPE4] 
@BuiltValue()
abstract class ProductType4Filter implements Built<ProductType4Filter, ProductType4FilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_TYPE_4')
  CatalogsProductGroupMultipleStringListCriteria get pRODUCTTYPE4;

  ProductType4Filter._();

  factory ProductType4Filter([void updates(ProductType4FilterBuilder b)]) = _$ProductType4Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductType4FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductType4Filter> get serializer => _$ProductType4FilterSerializer();
}

class _$ProductType4FilterSerializer implements PrimitiveSerializer<ProductType4Filter> {
  @override
  final Iterable<Type> types = const [ProductType4Filter, _$ProductType4Filter];

  @override
  final String wireName = r'ProductType4Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductType4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_TYPE_4';
    yield serializers.serialize(
      object.pRODUCTTYPE4,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductType4Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductType4FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_TYPE_4':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.pRODUCTTYPE4 = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductType4Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductType4FilterBuilder();
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

