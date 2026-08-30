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

part 'catalogs_product_groups_create_request_schema.g.dart';

/// CatalogsProductGroupsCreateRequestSchema
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
abstract class CatalogsProductGroupsCreateRequestSchema implements Built<CatalogsProductGroupsCreateRequestSchema, CatalogsProductGroupsCreateRequestSchemaBuilder> {
  /// One Of [CatalogsProductGroupCreateRequest], [CatalogsVerticalProductGroupCreateRequest]
  OneOf get oneOf;

  CatalogsProductGroupsCreateRequestSchema._();

  factory CatalogsProductGroupsCreateRequestSchema([void updates(CatalogsProductGroupsCreateRequestSchemaBuilder b)]) = _$CatalogsProductGroupsCreateRequestSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupsCreateRequestSchemaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupsCreateRequestSchema> get serializer => _$CatalogsProductGroupsCreateRequestSchemaSerializer();
}

class _$CatalogsProductGroupsCreateRequestSchemaSerializer implements PrimitiveSerializer<CatalogsProductGroupsCreateRequestSchema> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupsCreateRequestSchema, _$CatalogsProductGroupsCreateRequestSchema];

  @override
  final String wireName = r'CatalogsProductGroupsCreateRequestSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupsCreateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupsCreateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProductGroupsCreateRequestSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupsCreateRequestSchemaBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupCreateRequest), FullType(CatalogsVerticalProductGroupCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductGroupsCreateRequestSchemaCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum> get serializer => _$catalogsProductGroupsCreateRequestSchemaCatalogTypeEnumSerializer;

  const CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum> get values => _$catalogsProductGroupsCreateRequestSchemaCatalogTypeEnumValues;
  static CatalogsProductGroupsCreateRequestSchemaCatalogTypeEnum valueOf(String name) => _$catalogsProductGroupsCreateRequestSchemaCatalogTypeEnumValueOf(name);
}

