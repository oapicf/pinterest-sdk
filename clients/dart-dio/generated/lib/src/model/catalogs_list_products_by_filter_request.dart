//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_verticals_list_products_by_catalog_based_filter_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_list_products_by_feed_based_filter.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_list_products_by_filter_request.g.dart';

/// Request object to list products for a given product group filter.
///
/// Properties:
/// * [feedId] - Catalog Feed id pertaining to the catalog product group filter.
/// * [filters] 
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [locale] 
@BuiltValue()
abstract class CatalogsListProductsByFilterRequest implements Built<CatalogsListProductsByFilterRequest, CatalogsListProductsByFilterRequestBuilder> {
  /// One Of [CatalogsListProductsByFeedBasedFilter], [CatalogsVerticalsListProductsByCatalogBasedFilterRequest]
  OneOf get oneOf;

  CatalogsListProductsByFilterRequest._();

  factory CatalogsListProductsByFilterRequest([void updates(CatalogsListProductsByFilterRequestBuilder b)]) = _$CatalogsListProductsByFilterRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsListProductsByFilterRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsListProductsByFilterRequest> get serializer => _$CatalogsListProductsByFilterRequestSerializer();
}

class _$CatalogsListProductsByFilterRequestSerializer implements PrimitiveSerializer<CatalogsListProductsByFilterRequest> {
  @override
  final Iterable<Type> types = const [CatalogsListProductsByFilterRequest, _$CatalogsListProductsByFilterRequest];

  @override
  final String wireName = r'CatalogsListProductsByFilterRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsListProductsByFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsListProductsByFilterRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsListProductsByFilterRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsListProductsByFilterRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsListProductsByFeedBasedFilter), FullType(CatalogsVerticalsListProductsByCatalogBasedFilterRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsListProductsByFilterRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsListProductsByFilterRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsListProductsByFilterRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsListProductsByFilterRequestCatalogTypeEnum> get serializer => _$catalogsListProductsByFilterRequestCatalogTypeEnumSerializer;

  const CatalogsListProductsByFilterRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsListProductsByFilterRequestCatalogTypeEnum> get values => _$catalogsListProductsByFilterRequestCatalogTypeEnumValues;
  static CatalogsListProductsByFilterRequestCatalogTypeEnum valueOf(String name) => _$catalogsListProductsByFilterRequestCatalogTypeEnumValueOf(name);
}

