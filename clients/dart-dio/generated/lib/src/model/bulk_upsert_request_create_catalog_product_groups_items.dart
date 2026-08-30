//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_vertical_product_group_create_request.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_product_group_create_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'bulk_upsert_request_create_catalog_product_groups_items.g.dart';

/// BulkUpsertRequestCreateCatalogProductGroupsItems
///
/// Properties:
/// * [description] 
/// * [feedId] - Catalog Feed id pertaining to the catalog product group.
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [locale] 
@BuiltValue()
abstract class BulkUpsertRequestCreateCatalogProductGroupsItems implements Built<BulkUpsertRequestCreateCatalogProductGroupsItems, BulkUpsertRequestCreateCatalogProductGroupsItemsBuilder> {
  /// One Of [CatalogsProductGroupCreateRequest], [CatalogsVerticalProductGroupCreateRequest]
  OneOf get oneOf;

  BulkUpsertRequestCreateCatalogProductGroupsItems._();

  factory BulkUpsertRequestCreateCatalogProductGroupsItems([void updates(BulkUpsertRequestCreateCatalogProductGroupsItemsBuilder b)]) = _$BulkUpsertRequestCreateCatalogProductGroupsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertRequestCreateCatalogProductGroupsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertRequestCreateCatalogProductGroupsItems> get serializer => _$BulkUpsertRequestCreateCatalogProductGroupsItemsSerializer();
}

class _$BulkUpsertRequestCreateCatalogProductGroupsItemsSerializer implements PrimitiveSerializer<BulkUpsertRequestCreateCatalogProductGroupsItems> {
  @override
  final Iterable<Type> types = const [BulkUpsertRequestCreateCatalogProductGroupsItems, _$BulkUpsertRequestCreateCatalogProductGroupsItems];

  @override
  final String wireName = r'BulkUpsertRequestCreateCatalogProductGroupsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertRequestCreateCatalogProductGroupsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertRequestCreateCatalogProductGroupsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  BulkUpsertRequestCreateCatalogProductGroupsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertRequestCreateCatalogProductGroupsItemsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupCreateRequest), FullType(CatalogsVerticalProductGroupCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum CREATIVE_ASSETS = _$bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum> get serializer => _$bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumSerializer;

  const BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum> get values => _$bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumValues;
  static BulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnum valueOf(String name) => _$bulkUpsertRequestCreateCatalogProductGroupsItemsCatalogTypeEnumValueOf(name);
}

