//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/updatable_item_attributes.dart';
import 'package:openapi/src/model/update_mask_field_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_update_batch_record.g.dart';

/// Object describing an item batch record to update items
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
/// * [updateMask] - The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
@BuiltValue()
abstract class ItemUpdateBatchRecord implements Built<ItemUpdateBatchRecord, ItemUpdateBatchRecordBuilder> {
  @BuiltValueField(wireName: r'attributes')
  UpdatableItemAttributes? get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  /// The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
  @BuiltValueField(wireName: r'update_mask')
  BuiltList<UpdateMaskFieldType>? get updateMask;

  ItemUpdateBatchRecord._();

  factory ItemUpdateBatchRecord([void updates(ItemUpdateBatchRecordBuilder b)]) = _$ItemUpdateBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemUpdateBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemUpdateBatchRecord> get serializer => _$ItemUpdateBatchRecordSerializer();
}

class _$ItemUpdateBatchRecordSerializer implements PrimitiveSerializer<ItemUpdateBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemUpdateBatchRecord, _$ItemUpdateBatchRecord];

  @override
  final String wireName = r'ItemUpdateBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemUpdateBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(UpdatableItemAttributes),
      );
    }
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
    if (object.updateMask != null) {
      yield r'update_mask';
      yield serializers.serialize(
        object.updateMask,
        specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskFieldType)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemUpdateBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemUpdateBatchRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(UpdatableItemAttributes),
          ) as UpdatableItemAttributes?;
          if (valueDes == null) continue;
          result.attributes = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemId = valueDes;
          break;
        case r'update_mask':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(UpdateMaskFieldType)]),
          ) as BuiltList<UpdateMaskFieldType>?;
          if (valueDes == null) continue;
          result.updateMask.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemUpdateBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemUpdateBatchRecordBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

