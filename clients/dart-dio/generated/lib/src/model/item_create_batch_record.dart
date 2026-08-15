//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_attributes_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_create_batch_record.g.dart';

/// Object describing an item batch record to create items
///
/// Properties:
/// * [attributes] 
/// * [itemId] - The catalog item id in the merchant namespace
@BuiltValue()
abstract class ItemCreateBatchRecord implements Built<ItemCreateBatchRecord, ItemCreateBatchRecordBuilder> {
  @BuiltValueField(wireName: r'attributes')
  ItemAttributesRequest? get attributes;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  ItemCreateBatchRecord._();

  factory ItemCreateBatchRecord([void updates(ItemCreateBatchRecordBuilder b)]) = _$ItemCreateBatchRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemCreateBatchRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemCreateBatchRecord> get serializer => _$ItemCreateBatchRecordSerializer();
}

class _$ItemCreateBatchRecordSerializer implements PrimitiveSerializer<ItemCreateBatchRecord> {
  @override
  final Iterable<Type> types = const [ItemCreateBatchRecord, _$ItemCreateBatchRecord];

  @override
  final String wireName = r'ItemCreateBatchRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemCreateBatchRecord object, {
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
    ItemCreateBatchRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemCreateBatchRecordBuilder result,
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
  ItemCreateBatchRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemCreateBatchRecordBuilder();
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

