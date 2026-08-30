//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_retail_product_group.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group.dart';
import 'package:openapi/src/model/catalogs_product_group_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_hotel_product_group_type.dart';
import 'package:openapi/src/model/catalogs_creative_assets_product_group_filters.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_product_group.g.dart';

/// CatalogsVerticalProductGroup
///
/// Properties:
/// * [catalogId] - Catalog ID pertaining to the product group.
/// * [catalogType] 
/// * [country] 
/// * [createdAt] - Unix timestamp in seconds of when catalog product group was created.
/// * [description] 
/// * [feedId] - id of the catalogs feed belonging to this catalog product group
/// * [filters] 
/// * [id] - ID of the catalog product group.
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [locale] 
/// * [name] - Name of catalog product group
/// * [status] 
/// * [type] 
/// * [updatedAt] - Unix timestamp in seconds of last time catalog product group was updated.
@BuiltValue()
abstract class CatalogsVerticalProductGroup implements Built<CatalogsVerticalProductGroup, CatalogsVerticalProductGroupBuilder> {
  /// One Of [CatalogsCreativeAssetsProductGroup], [CatalogsHotelProductGroup], [CatalogsRetailProductGroup]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsProductGroup,
    r'HOTEL': CatalogsHotelProductGroup,
    r'RETAIL': CatalogsRetailProductGroup,
  };

  CatalogsVerticalProductGroup._();

  factory CatalogsVerticalProductGroup([void updates(CatalogsVerticalProductGroupBuilder b)]) = _$CatalogsVerticalProductGroup;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalProductGroupBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalProductGroup> get serializer => _$CatalogsVerticalProductGroupSerializer();
}

extension CatalogsVerticalProductGroupDiscriminatorExt on CatalogsVerticalProductGroup {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroup) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroup) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroup) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalProductGroupBuilderDiscriminatorExt on CatalogsVerticalProductGroupBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsProductGroupBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelProductGroupBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailProductGroupBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalProductGroupSerializer implements PrimitiveSerializer<CatalogsVerticalProductGroup> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalProductGroup, _$CatalogsVerticalProductGroup];

  @override
  final String wireName = r'CatalogsVerticalProductGroup';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalProductGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalProductGroup object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalProductGroup deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalProductGroupBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalProductGroup.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsProductGroup, CatalogsHotelProductGroup, CatalogsRetailProductGroup, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsProductGroup),
        ) as CatalogsCreativeAssetsProductGroup;
        oneOfType = CatalogsCreativeAssetsProductGroup;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelProductGroup),
        ) as CatalogsHotelProductGroup;
        oneOfType = CatalogsHotelProductGroup;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailProductGroup),
        ) as CatalogsRetailProductGroup;
        oneOfType = CatalogsRetailProductGroup;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsVerticalProductGroupCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalProductGroupCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalProductGroupCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalProductGroupCatalogTypeEnum> get serializer => _$catalogsVerticalProductGroupCatalogTypeEnumSerializer;

  const CatalogsVerticalProductGroupCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalProductGroupCatalogTypeEnum> get values => _$catalogsVerticalProductGroupCatalogTypeEnumValues;
  static CatalogsVerticalProductGroupCatalogTypeEnum valueOf(String name) => _$catalogsVerticalProductGroupCatalogTypeEnumValueOf(name);
}

