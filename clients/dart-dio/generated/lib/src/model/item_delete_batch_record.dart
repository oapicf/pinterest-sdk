//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_delete_batch_record.g.dart';

/// Object describing an item batch record to delete items
///
/// Properties:
/// * [itemId] - The catalog item id in the merchant namespace
@BuiltValue()
abstract class ItemDeleteBatchRecord implements Built<ItemDeleteBatchRecord, ItemDeleteBatchRecordBuilder> {
  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  ItemDeleteBatchRecord._();

  factory ItemDeleteBatchRecord([void updates(ItemDeleteBatchRecordBuilder b)]) = _$ItemDeleteBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDeleteBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDeleteBatchRecord> get serializer => _$ItemDeleteBatchRecordSerializer();
}

class _$ItemDeleteBatchRecordSerializer implements PrimitiveSerializer<ItemDeleteBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemDeleteBatchRecord, _$ItemDeleteBatchRecord];

  @override
  final String wireName = r'ItemDeleteBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDeleteBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
    ItemDeleteBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDeleteBatchRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  ItemDeleteBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDeleteBatchRecordBuilder();
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

