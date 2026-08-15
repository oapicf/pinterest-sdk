//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_creative_assets_list_products_by_catalog_based_filter_request.g.dart';

/// Request object to list products for a given creative assets catalog_id and product group filter.
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets product group.
/// * [catalogType] 
/// * [filters] 
@BuiltValue()
abstract class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest implements Built<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder> {
  /// Catalog id pertaining to the creative assets product group.
  @BuiltValueField(wireName: r'catalog_id')
  String get catalogId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  CREATIVE_ASSETS,  };

  @BuiltValueField(wireName: r'filters')
  CatalogsCreativeAssetsProductGroupFilters get filters;

  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest._();

  factory CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest([void updates(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder b)]) = _$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest> get serializer => _$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestSerializer();
}

class _$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest, _$CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest];

  @override
  final String wireName = r'CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'catalog_id';
    yield serializers.serialize(
      object.catalogId,
      specifiedType: const FullType(String),
    );
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
    );
    yield r'filters';
    yield serializers.serialize(
      object.filters,
      specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'catalog_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.catalogId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum),
          ) as CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum;
          result.catalogType = valueDes;
          break;
        case r'filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsCreativeAssetsProductGroupFilters),
          ) as CatalogsCreativeAssetsProductGroupFilters;
          result.filters.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestBuilder();
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

class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get serializer => _$catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumSerializer;

  const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum> get values => _$catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumValues;
  static CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnum valueOf(String name) => _$catalogsCreativeAssetsListProductsByCatalogBasedFilterRequestCatalogTypeEnumValueOf(name);
}

