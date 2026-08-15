//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/batch_operation_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/hotel_processing_record.dart';
import 'package:openapi/src/model/catalogs_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_hotel_items_batch.g.dart';

/// Object describing the catalogs hotel items batch
///
/// Properties:
/// * [batchId] - Id of the catalogs items batch
/// * [catalogType] 
/// * [completedTime] - Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
/// * [createdTime] - Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
/// * [items] - Array with the catalogs items processing records part of the catalogs items batch
/// * [status] 
@BuiltValue()
abstract class CatalogsHotelItemsBatch implements Built<CatalogsHotelItemsBatch, CatalogsHotelItemsBatchBuilder> {
  /// Id of the catalogs items batch
  @BuiltValueField(wireName: r'batch_id')
  String? get batchId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsType get catalogType;
  // enum catalogTypeEnum {  RETAIL,  HOTEL,  CREATIVE_ASSETS,  };

  /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  @BuiltValueField(wireName: r'completed_time')
  DateTime? get completedTime;

  /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  @BuiltValueField(wireName: r'created_time')
  DateTime? get createdTime;

  /// Array with the catalogs items processing records part of the catalogs items batch
  @BuiltValueField(wireName: r'items')
  BuiltList<HotelProcessingRecord>? get items;

  @BuiltValueField(wireName: r'status')
  BatchOperationStatus? get status;
  // enum statusEnum {  PROCESSING,  COMPLETED,  FAILED,  };

  CatalogsHotelItemsBatch._();

  factory CatalogsHotelItemsBatch([void updates(CatalogsHotelItemsBatchBuilder b)]) = _$CatalogsHotelItemsBatch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsHotelItemsBatchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsHotelItemsBatch> get serializer => _$CatalogsHotelItemsBatchSerializer();
}

class _$CatalogsHotelItemsBatchSerializer implements PrimitiveSerializer<CatalogsHotelItemsBatch> {
  @override
  final Iterable<Type> types = const [CatalogsHotelItemsBatch, _$CatalogsHotelItemsBatch];

  @override
  final String wireName = r'CatalogsHotelItemsBatch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsHotelItemsBatch object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.batchId != null) {
      yield r'batch_id';
      yield serializers.serialize(
        object.batchId,
        specifiedType: const FullType(String),
      );
    }
    yield r'catalog_type';
    yield serializers.serialize(
      object.catalogType,
      specifiedType: const FullType(CatalogsType),
    );
    if (object.completedTime != null) {
      yield r'completed_time';
      yield serializers.serialize(
        object.completedTime,
        specifiedType: const FullType.nullable(DateTime),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(DateTime),
      );
    }
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(HotelProcessingRecord)]),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(BatchOperationStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsHotelItemsBatch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsHotelItemsBatchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'batch_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.batchId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsType),
          ) as CatalogsType;
          result.catalogType = valueDes;
          break;
        case r'completed_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.completedTime = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DateTime),
          ) as DateTime;
          result.createdTime = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(HotelProcessingRecord)]),
          ) as BuiltList<HotelProcessingRecord>;
          result.items.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BatchOperationStatus),
          ) as BatchOperationStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsHotelItemsBatch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsHotelItemsBatchBuilder();
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

