//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_delete_discontinued_batch_record.g.dart';

/// Object describing an item batch record to discontinue items
///
/// Properties:
/// * [itemId] - The catalog item id in the merchant namespace
@BuiltValue()
abstract class ItemDeleteDiscontinuedBatchRecord implements Built<ItemDeleteDiscontinuedBatchRecord, ItemDeleteDiscontinuedBatchRecordBuilder> {
  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  ItemDeleteDiscontinuedBatchRecord._();

  factory ItemDeleteDiscontinuedBatchRecord([void updates(ItemDeleteDiscontinuedBatchRecordBuilder b)]) = _$ItemDeleteDiscontinuedBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDeleteDiscontinuedBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDeleteDiscontinuedBatchRecord> get serializer => _$ItemDeleteDiscontinuedBatchRecordSerializer();
}

class _$ItemDeleteDiscontinuedBatchRecordSerializer implements PrimitiveSerializer<ItemDeleteDiscontinuedBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemDeleteDiscontinuedBatchRecord, _$ItemDeleteDiscontinuedBatchRecord];

  @override
  final String wireName = r'ItemDeleteDiscontinuedBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDeleteDiscontinuedBatchRecord object, {
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
    ItemDeleteDiscontinuedBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDeleteDiscontinuedBatchRecordBuilder result,
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
  ItemDeleteDiscontinuedBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDeleteDiscontinuedBatchRecordBuilder();
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

