//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_processing_status.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_processing_record.g.dart';

/// Object describing an item processing record
///
/// Properties:
/// * [errors] - Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
/// * [itemId] - The catalog item id in the merchant namespace
/// * [status] 
/// * [warnings] - Array with the validation warnings for the item processing record
@BuiltValue()
abstract class ItemProcessingRecord implements Built<ItemProcessingRecord, ItemProcessingRecordBuilder> {
  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  @BuiltValueField(wireName: r'errors')
  BuiltList<ItemValidationEvent>? get errors;

  /// The catalog item id in the merchant namespace
  @BuiltValueField(wireName: r'item_id')
  String? get itemId;

  @BuiltValueField(wireName: r'status')
  ItemProcessingStatus? get status;
  // enum statusEnum {  SUCCESS,  FAILURE,  PROCESSING,  };

  /// Array with the validation warnings for the item processing record
  @BuiltValueField(wireName: r'warnings')
  BuiltList<ItemValidationEvent>? get warnings;

  ItemProcessingRecord._();

  factory ItemProcessingRecord([void updates(ItemProcessingRecordBuilder b)]) = _$ItemProcessingRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemProcessingRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemProcessingRecord> get serializer => _$ItemProcessingRecordSerializer();
}

class _$ItemProcessingRecordSerializer implements PrimitiveSerializer<ItemProcessingRecord> {
  @override
  final Iterable<Type> types = const [ItemProcessingRecord, _$ItemProcessingRecord];

  @override
  final String wireName = r'ItemProcessingRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
      );
    }
    if (object.itemId != null) {
      yield r'item_id';
      yield serializers.serialize(
        object.itemId,
        specifiedType: const FullType(String),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(ItemProcessingStatus),
      );
    }
    if (object.warnings != null) {
      yield r'warnings';
      yield serializers.serialize(
        object.warnings,
        specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemProcessingRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>;
          result.errors.replace(valueDes);
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemProcessingStatus),
          ) as ItemProcessingStatus;
          result.status = valueDes;
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>;
          result.warnings.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ItemProcessingRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemProcessingRecordBuilder();
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

