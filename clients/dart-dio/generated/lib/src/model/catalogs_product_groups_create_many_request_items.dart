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

part 'catalogs_product_groups_create_many_request_items.g.dart';

/// CatalogsProductGroupsCreateManyRequestItems
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
abstract class CatalogsProductGroupsCreateManyRequestItems implements Built<CatalogsProductGroupsCreateManyRequestItems, CatalogsProductGroupsCreateManyRequestItemsBuilder> {
  /// One Of [CatalogsProductGroupCreateRequest], [CatalogsVerticalProductGroupCreateRequest]
  OneOf get oneOf;

  CatalogsProductGroupsCreateManyRequestItems._();

  factory CatalogsProductGroupsCreateManyRequestItems([void updates(CatalogsProductGroupsCreateManyRequestItemsBuilder b)]) = _$CatalogsProductGroupsCreateManyRequestItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupsCreateManyRequestItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupsCreateManyRequestItems> get serializer => _$CatalogsProductGroupsCreateManyRequestItemsSerializer();
}

class _$CatalogsProductGroupsCreateManyRequestItemsSerializer implements PrimitiveSerializer<CatalogsProductGroupsCreateManyRequestItems> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupsCreateManyRequestItems, _$CatalogsProductGroupsCreateManyRequestItems];

  @override
  final String wireName = r'CatalogsProductGroupsCreateManyRequestItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupsCreateManyRequestItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupsCreateManyRequestItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProductGroupsCreateManyRequestItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupsCreateManyRequestItemsBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupCreateRequest), FullType(CatalogsVerticalProductGroupCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum> get serializer => _$catalogsProductGroupsCreateManyRequestItemsCatalogTypeEnumSerializer;

  const CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum> get values => _$catalogsProductGroupsCreateManyRequestItemsCatalogTypeEnumValues;
  static CatalogsProductGroupsCreateManyRequestItemsCatalogTypeEnum valueOf(String name) => _$catalogsProductGroupsCreateManyRequestItemsCatalogTypeEnumValueOf(name);
}

