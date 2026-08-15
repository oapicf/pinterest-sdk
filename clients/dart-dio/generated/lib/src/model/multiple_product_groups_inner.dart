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

part 'multiple_product_groups_inner.g.dart';

/// MultipleProductGroupsInner
///
/// Properties:
/// * [description] 
/// * [feedId] - Catalog Feed id pertaining to the catalog product group.
/// * [filters] 
/// * [isFeatured] - boolean indicator of whether the product group is being featured or not
/// * [name] 
/// * [catalogId] - Catalog id pertaining to the creative assets product group.
/// * [catalogType] 
/// * [country] 
/// * [locale] 
@BuiltValue()
abstract class MultipleProductGroupsInner implements Built<MultipleProductGroupsInner, MultipleProductGroupsInnerBuilder> {
  /// One Of [CatalogsProductGroupCreateRequest], [CatalogsVerticalProductGroupCreateRequest]
  OneOf get oneOf;

  MultipleProductGroupsInner._();

  factory MultipleProductGroupsInner([void updates(MultipleProductGroupsInnerBuilder b)]) = _$MultipleProductGroupsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MultipleProductGroupsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MultipleProductGroupsInner> get serializer => _$MultipleProductGroupsInnerSerializer();
}

class _$MultipleProductGroupsInnerSerializer implements PrimitiveSerializer<MultipleProductGroupsInner> {
  @override
  final Iterable<Type> types = const [MultipleProductGroupsInner, _$MultipleProductGroupsInner];

  @override
  final String wireName = r'MultipleProductGroupsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MultipleProductGroupsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    MultipleProductGroupsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  MultipleProductGroupsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MultipleProductGroupsInnerBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsProductGroupCreateRequest), FullType(CatalogsVerticalProductGroupCreateRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class MultipleProductGroupsInnerCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const MultipleProductGroupsInnerCatalogTypeEnum CREATIVE_ASSETS = _$multipleProductGroupsInnerCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<MultipleProductGroupsInnerCatalogTypeEnum> get serializer => _$multipleProductGroupsInnerCatalogTypeEnumSerializer;

  const MultipleProductGroupsInnerCatalogTypeEnum._(String name): super(name);

  static BuiltSet<MultipleProductGroupsInnerCatalogTypeEnum> get values => _$multipleProductGroupsInnerCatalogTypeEnumValues;
  static MultipleProductGroupsInnerCatalogTypeEnum valueOf(String name) => _$multipleProductGroupsInnerCatalogTypeEnumValueOf(name);
}

