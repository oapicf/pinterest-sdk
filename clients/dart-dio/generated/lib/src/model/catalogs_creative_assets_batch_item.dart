//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_update_creative_assets_item.dart';
import 'package:openapi/src/model/catalogs_delete_creative_assets_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_updatable_creative_assets_attributes.dart';
import 'package:openapi/src/model/catalogs_upsert_creative_assets_item.dart';
import 'package:openapi/src/model/catalogs_create_creative_assets_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_creative_assets_batch_item.g.dart';

/// Creative assets batch item
///
/// Properties:
/// * [attributes] 
/// * [creativeAssetsId] - The catalog creative assets id in the merchant namespace
/// * [operation] 
@BuiltValue()
abstract class CatalogsCreativeAssetsBatchItem implements Built<CatalogsCreativeAssetsBatchItem, CatalogsCreativeAssetsBatchItemBuilder> {
  /// Any Of [CatalogsCreateCreativeAssetsItem], [CatalogsDeleteCreativeAssetsItem], [CatalogsUpdateCreativeAssetsItem], [CatalogsUpsertCreativeAssetsItem]
  AnyOf get anyOf;

  CatalogsCreativeAssetsBatchItem._();

  factory CatalogsCreativeAssetsBatchItem([void updates(CatalogsCreativeAssetsBatchItemBuilder b)]) = _$CatalogsCreativeAssetsBatchItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsCreativeAssetsBatchItemBuilder b) => b..operation=b.discriminatorValue;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsCreativeAssetsBatchItem> get serializer => _$CatalogsCreativeAssetsBatchItemSerializer();
}

class _$CatalogsCreativeAssetsBatchItemSerializer implements PrimitiveSerializer<CatalogsCreativeAssetsBatchItem> {
  @override
  final Iterable<Type> types = const [CatalogsCreativeAssetsBatchItem, _$CatalogsCreativeAssetsBatchItem];

  @override
  final String wireName = r'CatalogsCreativeAssetsBatchItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsCreativeAssetsBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsCreativeAssetsBatchItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsCreativeAssetsBatchItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsCreativeAssetsBatchItemBuilder();
    Object? anyOfDataSrc;
    return result.build();
  }
}

class CatalogsCreativeAssetsBatchItemOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsCreativeAssetsBatchItemOperationEnum DELETE = _$catalogsCreativeAssetsBatchItemOperationEnum_DELETE;

  static Serializer<CatalogsCreativeAssetsBatchItemOperationEnum> get serializer => _$catalogsCreativeAssetsBatchItemOperationEnumSerializer;

  const CatalogsCreativeAssetsBatchItemOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsCreativeAssetsBatchItemOperationEnum> get values => _$catalogsCreativeAssetsBatchItemOperationEnumValues;
  static CatalogsCreativeAssetsBatchItemOperationEnum valueOf(String name) => _$catalogsCreativeAssetsBatchItemOperationEnumValueOf(name);
}

