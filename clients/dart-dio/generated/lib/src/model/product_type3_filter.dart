//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_type3_filter.g.dart';

/// ProductType3Filter
///
/// Properties:
/// * [PRODUCT_TYPE_3] 
@BuiltValue()
abstract class ProductType3Filter implements Built<ProductType3Filter, ProductType3FilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_TYPE_3')
  CatalogsProductGroupMultipleStringListCriteria get PRODUCT_TYPE_3;

  ProductType3Filter._();

  factory ProductType3Filter([void updates(ProductType3FilterBuilder b)]) = _$ProductType3Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductType3FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductType3Filter> get serializer => _$ProductType3FilterSerializer();
}

class _$ProductType3FilterSerializer implements PrimitiveSerializer<ProductType3Filter> {
  @override
  final Iterable<Type> types = const [ProductType3Filter, _$ProductType3Filter];

  @override
  final String wireName = r'ProductType3Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductType3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_TYPE_3';
    yield serializers.serialize(
      object.PRODUCT_TYPE_3,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductType3Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductType3FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_TYPE_3':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.PRODUCT_TYPE_3.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductType3Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductType3FilterBuilder();
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

