//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_product_group_multiple_pinterest_product_category_criteria.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pinterest_product_categories_filter.g.dart';

/// PinterestProductCategoriesFilter
///
/// Properties:
/// * [PINTEREST_PRODUCT_CATEGORIES] 
@BuiltValue()
abstract class PinterestProductCategoriesFilter implements Built<PinterestProductCategoriesFilter, PinterestProductCategoriesFilterBuilder> {
  @BuiltValueField(wireName: r'PINTEREST_PRODUCT_CATEGORIES')
  CatalogsProductGroupMultiplePinterestProductCategoryCriteria get PINTEREST_PRODUCT_CATEGORIES;

  PinterestProductCategoriesFilter._();

  factory PinterestProductCategoriesFilter([void updates(PinterestProductCategoriesFilterBuilder b)]) = _$PinterestProductCategoriesFilter;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinterestProductCategoriesFilterBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinterestProductCategoriesFilter> get serializer => _$PinterestProductCategoriesFilterSerializer();
}

class _$PinterestProductCategoriesFilterSerializer implements PrimitiveSerializer<PinterestProductCategoriesFilter> {
  @override
  final Iterable<Type> types = const [PinterestProductCategoriesFilter, _$PinterestProductCategoriesFilter];

  @override
  final String wireName = r'PinterestProductCategoriesFilter';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinterestProductCategoriesFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'PINTEREST_PRODUCT_CATEGORIES';
    yield serializers.serialize(
      object.PINTEREST_PRODUCT_CATEGORIES,
      specifiedType: const FullType(CatalogsProductGroupMultiplePinterestProductCategoryCriteria),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PinterestProductCategoriesFilter object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinterestProductCategoriesFilterBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'PINTEREST_PRODUCT_CATEGORIES':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupMultiplePinterestProductCategoryCriteria),
          ) as CatalogsProductGroupMultiplePinterestProductCategoryCriteria;
          result.PINTEREST_PRODUCT_CATEGORIES.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinterestProductCategoriesFilter deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinterestProductCategoriesFilterBuilder();
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

