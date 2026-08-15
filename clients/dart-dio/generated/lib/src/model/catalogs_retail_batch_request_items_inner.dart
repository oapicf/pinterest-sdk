//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_create_retail_item.dart';
import 'package:openapi/src/model/catalogs_upsert_retail_item.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_mask_field_type.dart';
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:openapi/src/model/catalogs_update_retail_item.dart';
import 'package:openapi/src/model/catalogs_delete_retail_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/any_of.dart';

part 'catalogs_retail_batch_request_items_inner.g.dart';

/// CatalogsRetailBatchRequestItemsInner
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [operation] 
/// * [updateMask] - The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
/// * [lastUpdatedTime] - The millisecond timestamp when the item was lastly modified by the merchant.
@BuiltValue()
abstract class CatalogsRetailBatchRequestItemsInner implements Built<CatalogsRetailBatchRequestItemsInner, CatalogsRetailBatchRequestItemsInnerBuilder> {
  /// Any Of [CatalogsCreateRetailItem], [CatalogsDeleteRetailItem], [CatalogsUpdateRetailItem], [CatalogsUpsertRetailItem]
  AnyOf get anyOf;

  CatalogsRetailBatchRequestItemsInner._();

  factory CatalogsRetailBatchRequestItemsInner([void updates(CatalogsRetailBatchRequestItemsInnerBuilder b)]) = _$CatalogsRetailBatchRequestItemsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailBatchRequestItemsInnerBuilder b) => b..operation=b.discriminatorValue;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailBatchRequestItemsInner> get serializer => _$CatalogsRetailBatchRequestItemsInnerSerializer();
}

class _$CatalogsRetailBatchRequestItemsInnerSerializer implements PrimitiveSerializer<CatalogsRetailBatchRequestItemsInner> {
  @override
  final Iterable<Type> types = const [CatalogsRetailBatchRequestItemsInner, _$CatalogsRetailBatchRequestItemsInner];

  @override
  final String wireName = r'CatalogsRetailBatchRequestItemsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailBatchRequestItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailBatchRequestItemsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final anyOf = object.anyOf;
    return serializers.serialize(anyOf, specifiedType: FullType(AnyOf, anyOf.valueTypes.map((type) => FullType(type)).toList()))!;
  }

  @override
  CatalogsRetailBatchRequestItemsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailBatchRequestItemsInnerBuilder();
    Object? anyOfDataSrc;
    return result.build();
  }
}

class CatalogsRetailBatchRequestItemsInnerOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsRetailBatchRequestItemsInnerOperationEnum DELETE = _$catalogsRetailBatchRequestItemsInnerOperationEnum_DELETE;

  static Serializer<CatalogsRetailBatchRequestItemsInnerOperationEnum> get serializer => _$catalogsRetailBatchRequestItemsInnerOperationEnumSerializer;

  const CatalogsRetailBatchRequestItemsInnerOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailBatchRequestItemsInnerOperationEnum> get values => _$catalogsRetailBatchRequestItemsInnerOperationEnumValues;
  static CatalogsRetailBatchRequestItemsInnerOperationEnum valueOf(String name) => _$catalogsRetailBatchRequestItemsInnerOperationEnumValueOf(name);
}

