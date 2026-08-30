//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_list_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_type0_filter.g.dart';

/// ProductType0Filter
///
/// Properties:
/// * [PRODUCT_TYPE_0] 
@BuiltValue()
abstract class ProductType0Filter implements Built<ProductType0Filter, ProductType0FilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_TYPE_0')
  CatalogsProductGroupMultipleStringListCriteria get PRODUCT_TYPE_0;

  ProductType0Filter._();

  factory ProductType0Filter([void updates(ProductType0FilterBuilder b)]) = _$ProductType0Filter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductType0FilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductType0Filter> get serializer => _$ProductType0FilterSerializer();
}

class _$ProductType0FilterSerializer implements PrimitiveSerializer<ProductType0Filter> {
  @override
  final Iterable<Type> types = const [ProductType0Filter, _$ProductType0Filter];

  @override
  final String wireName = r'ProductType0Filter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductType0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_TYPE_0';
    yield serializers.serialize(
      object.PRODUCT_TYPE_0,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductType0Filter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductType0FilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_TYPE_0':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringListCriteria),
          ) as CatalogsProductGroupMultipleStringListCriteria;
          result.PRODUCT_TYPE_0.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductType0Filter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductType0FilterBuilder();
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

