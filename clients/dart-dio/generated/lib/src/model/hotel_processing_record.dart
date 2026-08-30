//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_processing_status.dart';
import 'package:openapi/src/model/item_validation_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'hotel_processing_record.g.dart';

/// Object describing an item processing record
///
/// Properties:
/// * [errors] - Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
/// * [hotelId] - The catalog hotel id in the merchant namespace
/// * [status] 
/// * [warnings] - Array with the validation warnings for the item processing record
@BuiltValue()
abstract class HotelProcessingRecord implements Built<HotelProcessingRecord, HotelProcessingRecordBuilder> {
  /// Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail.
  @BuiltValueField(wireName: r'errors')
  BuiltList<ItemValidationEvent>? get errors;

  /// The catalog hotel id in the merchant namespace
  @BuiltValueField(wireName: r'hotel_id')
  String? get hotelId;

  @BuiltValueField(wireName: r'status')
  ItemProcessingStatus? get status;
  // enum statusEnum {  SUCCESS,  FAILURE,  PROCESSING,  };

  /// Array with the validation warnings for the item processing record
  @BuiltValueField(wireName: r'warnings')
  BuiltList<ItemValidationEvent>? get warnings;

  HotelProcessingRecord._();

  factory HotelProcessingRecord([void updates(HotelProcessingRecordBuilder b)]) = _$HotelProcessingRecord;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(HotelProcessingRecordBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<HotelProcessingRecord> get serializer => _$HotelProcessingRecordSerializer();
}

class _$HotelProcessingRecordSerializer implements PrimitiveSerializer<HotelProcessingRecord> {
  @override
  final Iterable<Type> types = const [HotelProcessingRecord, _$HotelProcessingRecord];

  @override
  final String wireName = r'HotelProcessingRecord';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    HotelProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.errors != null) {
      yield r'errors';
      yield serializers.serialize(
        object.errors,
        specifiedType: const FullType(BuiltList, [FullType(ItemValidationEvent)]),
      );
    }
    if (object.hotelId != null) {
      yield r'hotel_id';
      yield serializers.serialize(
        object.hotelId,
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
    HotelProcessingRecord object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required HotelProcessingRecordBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'errors':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>?;
          if (valueDes == null) continue;
          result.errors.replace(valueDes);
          break;
        case r'hotel_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.hotelId = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ItemProcessingStatus),
          ) as ItemProcessingStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'warnings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ItemValidationEvent)]),
          ) as BuiltList<ItemValidationEvent>?;
          if (valueDes == null) continue;
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
  HotelProcessingRecord deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = HotelProcessingRecordBuilder();
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

