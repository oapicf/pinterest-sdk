//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/batch_operation_status.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/item_processing_record.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_items_batch.g.dart';

/// Object describing the catalogs retail items batch
///
/// Properties:
/// * [batchId] - Id of the catalogs items batch
/// * [catalogType] 
/// * [completedTime] - Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
/// * [createdTime] - Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
/// * [items] - Array with the catalogs items processing records part of the catalogs items batch
/// * [status] 
@BuiltValue()
abstract class CatalogsRetailItemsBatch implements Built<CatalogsRetailItemsBatch, CatalogsRetailItemsBatchBuilder> {
  /// Id of the catalogs items batch
  @BuiltValueField(wireName: r'batch_id')
  String? get batchId;

  @BuiltValueField(wireName: r'catalog_type')
  CatalogsRetailItemsBatchCatalogTypeEnum get catalogType;
  // enum catalogTypeEnum {  RETAIL,  };

  /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  @BuiltValueField(wireName: r'completed_time')
  DateTime? get completedTime;

  /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
  @BuiltValueField(wireName: r'created_time')
  DateTime? get createdTime;

  /// Array with the catalogs items processing records part of the catalogs items batch
  @BuiltValueField(wireName: r'items')
  BuiltList<ItemProcessingRecord>? get items;

  @BuiltValueField(wireName: r'status')
  BatchOperationStatus? get status;
  // enum statusEnum {  PROCESSING,  COMPLETED,  FAILED,  };

  CatalogsRetailItemsBatch._();

  factory CatalogsRetailItemsBatch([void updates(CatalogsRetailItemsBatchBuilder b)]) = _$CatalogsRetailItemsBatch;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailItemsBatchBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailItemsBatch> get serializer => _$CatalogsRetailItemsBatchSerializer();
}

class _$CatalogsRetailItemsBatchSerializer implements PrimitiveSerializer<CatalogsRetailItemsBatch> {
  @override
  final Iterable<Type> types = const [CatalogsRetailItemsBatch, _$CatalogsRetailItemsBatch];

  @override
  final String wireName = r'CatalogsRetailItemsBatch';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailItemsBatch object, {
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
      specifiedType: const FullType(CatalogsRetailItemsBatchCatalogTypeEnum),
    );
    if (object.completedTime != null) {
      yield r'completed_time';
      yield serializers.serialize(
        object.completedTime,
        specifiedType: const FullType.nullable(DateTime),
      );
    }
    yield r'created_time';
    yield object.createdTime == null ? null : serializers.serialize(
      object.createdTime,
      specifiedType: const FullType.nullable(DateTime),
    );
    if (object.items != null) {
      yield r'items';
      yield serializers.serialize(
        object.items,
        specifiedType: const FullType(BuiltList, [FullType(ItemProcessingRecord)]),
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
    CatalogsRetailItemsBatch object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailItemsBatchBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'batch_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.batchId = valueDes;
          break;
        case r'catalog_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsRetailItemsBatchCatalogTypeEnum),
          ) as CatalogsRetailItemsBatchCatalogTypeEnum;
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
            specifiedType: const FullType.nullable(DateTime),
          ) as DateTime?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'items':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ItemProcessingRecord)]),
          ) as BuiltList<ItemProcessingRecord>?;
          if (valueDes == null) continue;
          result.items.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BatchOperationStatus),
          ) as BatchOperationStatus?;
          if (valueDes == null) continue;
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
  CatalogsRetailItemsBatch deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailItemsBatchBuilder();
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

class CatalogsRetailItemsBatchCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'RETAIL')
  static const CatalogsRetailItemsBatchCatalogTypeEnum RETAIL = _$catalogsRetailItemsBatchCatalogTypeEnum_RETAIL;

  static Serializer<CatalogsRetailItemsBatchCatalogTypeEnum> get serializer => _$catalogsRetailItemsBatchCatalogTypeEnumSerializer;

  const CatalogsRetailItemsBatchCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsRetailItemsBatchCatalogTypeEnum> get values => _$catalogsRetailItemsBatchCatalogTypeEnumValues;
  static CatalogsRetailItemsBatchCatalogTypeEnum valueOf(String name) => _$catalogsRetailItemsBatchCatalogTypeEnumValueOf(name);
}

