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

part 'catalogs_product_groups_update_request.g.dart';

/// CatalogsProductGroupsUpdateRequest
///
/// Properties:
/// * [description] 
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
/// * [catalogType] 
/// * [country] 
/// * [locale] 
@BuiltValue()
abstract class CatalogsProductGroupsUpdateRequest implements Built<CatalogsProductGroupsUpdateRequest, CatalogsProductGroupsUpdateRequestBuilder> {
  /// One Of [CatalogsProductGroupUpdateRequest], [CatalogsVerticalProductGroupUpdateRequest]
  OneOf get oneOf;

  CatalogsProductGroupsUpdateRequest._();

  factory CatalogsProductGroupsUpdateRequest([void updates(CatalogsProductGroupsUpdateRequestBuilder b)]) = _$CatalogsProductGroupsUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupsUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupsUpdateRequest> get serializer => _$CatalogsProductGroupsUpdateRequestSerializer();
}

class _$CatalogsProductGroupsUpdateRequestSerializer implements PrimitiveSerializer<CatalogsProductGroupsUpdateRequest> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupsUpdateRequest, _$CatalogsProductGroupsUpdateRequest];

  @override
  final String wireName = r'CatalogsProductGroupsUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupsUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsProductGroupsUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupsUpdateRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupUpdateRequest), FullType(CatalogsVerticalProductGroupUpdateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsProductGroupsUpdateRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsProductGroupsUpdateRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsProductGroupsUpdateRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsProductGroupsUpdateRequestCatalogTypeEnum> get serializer => _$catalogsProductGroupsUpdateRequestCatalogTypeEnumSerializer;

  const CatalogsProductGroupsUpdateRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupsUpdateRequestCatalogTypeEnum> get values => _$catalogsProductGroupsUpdateRequestCatalogTypeEnumValues;
  static CatalogsProductGroupsUpdateRequestCatalogTypeEnum valueOf(String name) => _$catalogsProductGroupsUpdateRequestCatalogTypeEnumValueOf(name);
}

