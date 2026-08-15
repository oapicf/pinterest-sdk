//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_delete_discontinued_batch_record.dart';
import 'package:openapi/src/model/item_update_batch_record.dart';
import 'package:openapi/src/model/item_upsert_batch_record.dart';
import 'package:openapi/src/model/item_delete_batch_record.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/update_mask_field_type.dart';
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:openapi/src/model/item_create_batch_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'item_batch_record.g.dart';

/// Object describing an item batch record
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [updateMask] - The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
@BuiltValue()
abstract class ItemBatchRecord implements Built<ItemBatchRecord, ItemBatchRecordBuilder> {
  /// One Of [ItemCreateBatchRecord], [ItemDeleteBatchRecord], [ItemDeleteDiscontinuedBatchRecord], [ItemUpdateBatchRecord], [ItemUpsertBatchRecord]
  OneOf get oneOf;

  ItemBatchRecord._();

  factory ItemBatchRecord([void updates(ItemBatchRecordBuilder b)]) = _$ItemBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemBatchRecord> get serializer => _$ItemBatchRecordSerializer();
}

class _$ItemBatchRecordSerializer implements PrimitiveSerializer<ItemBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemBatchRecord, _$ItemBatchRecord];

  @override
  final String wireName = r'ItemBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemBatchRecordBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(ItemCreateBatchRecord), FullType(ItemDeleteDiscontinuedBatchRecord), FullType(ItemUpdateBatchRecord), FullType(ItemUpsertBatchRecord), FullType(ItemDeleteBatchRecord), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

