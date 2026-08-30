//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/product_category_enum.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_multiple_pinterest_product_category_criteria.g.dart';

/// CatalogsProductGroupMultiplePinterestProductCategoryCriteria
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupMultiplePinterestProductCategoryCriteria implements Built<CatalogsProductGroupMultiplePinterestProductCategoryCriteria, CatalogsProductGroupMultiplePinterestProductCategoryCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  BuiltList<ProductCategoryEnum> get values;

  CatalogsProductGroupMultiplePinterestProductCategoryCriteria._();

  factory CatalogsProductGroupMultiplePinterestProductCategoryCriteria([void updates(CatalogsProductGroupMultiplePinterestProductCategoryCriteriaBuilder b)]) = _$CatalogsProductGroupMultiplePinterestProductCategoryCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupMultiplePinterestProductCategoryCriteriaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupMultiplePinterestProductCategoryCriteria> get serializer => _$CatalogsProductGroupMultiplePinterestProductCategoryCriteriaSerializer();
}

class _$CatalogsProductGroupMultiplePinterestProductCategoryCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupMultiplePinterestProductCategoryCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupMultiplePinterestProductCategoryCriteria, _$CatalogsProductGroupMultiplePinterestProductCategoryCriteria];

  @override
  final String wireName = r'CatalogsProductGroupMultiplePinterestProductCategoryCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(BuiltList, [FullType(ProductCategoryEnum)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupMultiplePinterestProductCategoryCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupMultiplePinterestProductCategoryCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.negated = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductCategoryEnum)]),
          ) as BuiltList<ProductCategoryEnum>;
          result.values.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupMultiplePinterestProductCategoryCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupMultiplePinterestProductCategoryCriteriaBuilder();
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

