//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_upsert_batch_record.g.dart';

/// Object describing an item batch record to upsert items
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
@BuiltValue()
abstract class ItemUpsertBatchRecord implements Built<ItemUpsertBatchRecord, ItemUpsertBatchRecordBuilder> {
  @BuiltValueField(wireName: r'attributes')
  ItemAttributesRequest? get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  ItemUpsertBatchRecord._();

  factory ItemUpsertBatchRecord([void updates(ItemUpsertBatchRecordBuilder b)]) = _$ItemUpsertBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemUpsertBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemUpsertBatchRecord> get serializer => _$ItemUpsertBatchRecordSerializer();
}

class _$ItemUpsertBatchRecordSerializer implements PrimitiveSerializer<ItemUpsertBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemUpsertBatchRecord, _$ItemUpsertBatchRecord];

  @override
  final String wireName = r'ItemUpsertBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemUpsertBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.attributes != null) {
      yield r'attributes';
      yield serializers.serialize(
        object.attributes,
        specifiedType: const FullType(ItemAttributesRequest),
      );
    }
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemUpsertBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemUpsertBatchRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attributes':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemAttributesRequest),
          ) as ItemAttributesRequest;
          result.attributes.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemUpsertBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemUpsertBatchRecordBuilder();
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

