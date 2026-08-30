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

part 'catalogs_product_groups_update_request_schema.g.dart';

/// CatalogsProductGroupsUpdateRequestSchema
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
abstract class CatalogsProductGroupsUpdateRequestSchema implements Built<CatalogsProductGroupsUpdateRequestSchema, CatalogsProductGroupsUpdateRequestSchemaBuilder> {
  /// One Of [CatalogsProductGroupUpdateRequest], [CatalogsVerticalProductGroupUpdateRequest]
  OneOf get oneOf;

  CatalogsProductGroupsUpdateRequestSchema._();

  factory CatalogsProductGroupsUpdateRequestSchema([void updates(CatalogsProductGroupsUpdateRequestSchemaBuilder b)]) = _$CatalogsProductGroupsUpdateRequestSchema;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupsUpdateRequestSchemaBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupsUpdateRequestSchema> get serializer => _$CatalogsProductGroupsUpdateRequestSchemaSerializer();
}

class _$CatalogsProductGroupsUpdateRequestSchemaSerializer implements PrimitiveSerializer<CatalogsProductGroupsUpdateRequestSchema> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupsUpdateRequestSchema, _$CatalogsProductGroupsUpdateRequestSchema];

  @override
  final String wireName = r'CatalogsProductGroupsUpdateRequestSchema';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupsUpdateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupsUpdateRequestSchema object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProductGroupsUpdateRequestSchema deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupsUpdateRequestSchemaBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupUpdateRequest), FullType(CatalogsVerticalProductGroupUpdateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum> get serializer => _$catalogsProductGroupsUpdateRequestSchemaCatalogTypeEnumSerializer;

  const CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum> get values => _$catalogsProductGroupsUpdateRequestSchemaCatalogTypeEnumValues;
  static CatalogsProductGroupsUpdateRequestSchemaCatalogTypeEnum valueOf(String name) => _$catalogsProductGroupsUpdateRequestSchemaCatalogTypeEnumValueOf(name);
}

