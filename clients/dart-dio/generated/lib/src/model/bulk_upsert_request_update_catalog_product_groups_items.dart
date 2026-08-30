//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_locale.dart';
import 'package:openapi/src/model/catalogs_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_vertical_product_group_update_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'bulk_upsert_request_update_catalog_product_groups_items.g.dart';

/// BulkUpsertRequestUpdateCatalogProductGroupsItems
///
/// Properties:
/// * [description] 
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] - Name of catalog product group
/// * [catalogType] 
/// * [country] 
/// * [locale] 
@BuiltValue()
abstract class BulkUpsertRequestUpdateCatalogProductGroupsItems implements Built<BulkUpsertRequestUpdateCatalogProductGroupsItems, BulkUpsertRequestUpdateCatalogProductGroupsItemsBuilder> {
  /// One Of [CatalogsProductGroupUpdateRequest], [CatalogsVerticalProductGroupUpdateRequest]
  OneOf get oneOf;

  BulkUpsertRequestUpdateCatalogProductGroupsItems._();

  factory BulkUpsertRequestUpdateCatalogProductGroupsItems([void updates(BulkUpsertRequestUpdateCatalogProductGroupsItemsBuilder b)]) = _$BulkUpsertRequestUpdateCatalogProductGroupsItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkUpsertRequestUpdateCatalogProductGroupsItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkUpsertRequestUpdateCatalogProductGroupsItems> get serializer => _$BulkUpsertRequestUpdateCatalogProductGroupsItemsSerializer();
}

class _$BulkUpsertRequestUpdateCatalogProductGroupsItemsSerializer implements PrimitiveSerializer<BulkUpsertRequestUpdateCatalogProductGroupsItems> {
  @override
  final Iterable<Type> types = const [BulkUpsertRequestUpdateCatalogProductGroupsItems, _$BulkUpsertRequestUpdateCatalogProductGroupsItems];

  @override
  final String wireName = r'BulkUpsertRequestUpdateCatalogProductGroupsItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkUpsertRequestUpdateCatalogProductGroupsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkUpsertRequestUpdateCatalogProductGroupsItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  BulkUpsertRequestUpdateCatalogProductGroupsItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkUpsertRequestUpdateCatalogProductGroupsItemsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupUpdateRequest), FullType(CatalogsVerticalProductGroupUpdateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum CREATIVE_ASSETS = _$bulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum> get serializer => _$bulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnumSerializer;

  const BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum> get values => _$bulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnumValues;
  static BulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnum valueOf(String name) => _$bulkUpsertRequestUpdateCatalogProductGroupsItemsCatalogTypeEnumValueOf(name);
}

