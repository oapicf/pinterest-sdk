//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_string_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'product_group_reference_filter.g.dart';

/// ProductGroupReferenceFilter
///
/// Properties:
/// * [PRODUCT_GROUP] 
@BuiltValue()
abstract class ProductGroupReferenceFilter implements Built<ProductGroupReferenceFilter, ProductGroupReferenceFilterBuilder> {
  @BuiltValueField(wireName: r'PRODUCT_GROUP')
  CatalogsProductGroupMultipleStringCriteria get PRODUCT_GROUP;

  ProductGroupReferenceFilter._();

  factory ProductGroupReferenceFilter([void updates(ProductGroupReferenceFilterBuilder b)]) = _$ProductGroupReferenceFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ProductGroupReferenceFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ProductGroupReferenceFilter> get serializer => _$ProductGroupReferenceFilterSerializer();
}

class _$ProductGroupReferenceFilterSerializer implements PrimitiveSerializer<ProductGroupReferenceFilter> {
  @override
  final Iterable<Type> types = const [ProductGroupReferenceFilter, _$ProductGroupReferenceFilter];

  @override
  final String wireName = r'ProductGroupReferenceFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ProductGroupReferenceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PRODUCT_GROUP';
    yield serializers.serialize(
      object.PRODUCT_GROUP,
      specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ProductGroupReferenceFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ProductGroupReferenceFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PRODUCT_GROUP':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultipleStringCriteria),
          ) as CatalogsProductGroupMultipleStringCriteria;
          result.PRODUCT_GROUP = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ProductGroupReferenceFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ProductGroupReferenceFilterBuilder();
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

