//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_product_group_product_counts.g.dart';

/// Product counts for a Retail CatalogsProductGroup
///
/// Properties:
/// * [catalogType] 
/// * [inStock] 
/// * [outOfStock] 
/// * [preorder] 
/// * [total] 
/// * [videos] 
@BuiltValue()
abstract class CatalogsRetailProductGroupProductCounts implements Built<CatalogsRetailProductGroupProductCounts, CatalogsRetailProductGroupProductCountsBuilder> {
  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailProductGroupProductCountsCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  @BuiltValueField(wireName: r'in_stock')
  num get inStock;

  @BuiltValueField(wireName: r'out_of_stock')
  num get outOfStock;

  @BuiltValueField(wireName: r'preorder')
  num get preorder;

  @BuiltValueField(wireName: r'total')
  num get total;

  @BuiltValueField(wireName: r'videos')
  num? get videos;

  CatalogsRetailProductGroupProductCounts._();

  factory CatalogsRetailProductGroupProductCounts([void updates(CatalogsRetailProductGroupProductCountsBuilder b)]) = _$CatalogsRetailProductGroupProductCounts;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailProductGroupProductCountsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailProductGroupProductCounts> get serializer => _$CatalogsRetailProductGroupProductCountsSerializer();
}

class _$CatalogsRetailProductGroupProductCountsSerializer implements PrimitiveSerializer<CatalogsRetailProductGroupProductCounts> {
  @override
  final Iterable<Type> types = const [CatalogsRetailProductGroupProductCounts, _$CatalogsRetailProductGroupProductCounts];

  @override
  final String wireName = r'CatalogsRetailProductGroupProductCounts';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsRetailProductGroupProductCountsCatalogTypeEnum),
    );
    yield r'in_stock';
    yield serializers.serialize(
      object.inStock,
      specifiedType: const FullType(num),
    );
    yield r'out_of_stock';
    yield serializers.serialize(
      object.outOfStock,
      specifiedType: const FullType(num),
    );
    yield r'preorder';
    yield serializers.serialize(
      object.preorder,
      specifiedType: const FullType(num),
    );
    yield r'total';
    yield serializers.serialize(
      object.total,
      specifiedType: const FullType(num),
    );
    if (object.videos != null) {
      yield r'videos';
      yield serializers.serialize(
        object.videos,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailProductGroupProductCounts object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailProductGroupProductCountsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailProductGroupProductCountsCatalogTypeEnum),
          ) as CatalogsRetailProductGroupProductCountsCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'in_stock':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.inStock = valueDes;
          break;
        case r'out_of_stock':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.outOfStock = valueDes;
          break;
        case r'preorder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.preorder = valueDes;
          break;
        case r'total':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.total = valueDes;
          break;
        case r'videos':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.videos = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailProductGroupProductCounts deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailProductGroupProductCountsBuilder();
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

class CatalogsRetailProductGroupProductCountsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailProductGroupProductCountsCatalogTypeEnum RETAIL = _$catalogsRetailProductGroupProductCountsCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailProductGroupProductCountsCatalogTypeEnum> get serializer => _$catalogsRetailProductGroupProductCountsCatalogTypeEnumSerializer;

  const CatalogsRetailProductGroupProductCountsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailProductGroupProductCountsCatalogTypeEnum> get values => _$catalogsRetailProductGroupProductCountsCatalogTypeEnumValues;
  static CatalogsRetailProductGroupProductCountsCatalogTypeEnum valueOf(String name) => _$catalogsRetailProductGroupProductCountsCatalogTypeEnumValueOf(name);
}

