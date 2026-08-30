//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/supplemental_item_batch_operation_status.dart';
import 'package:openapi/src/model/supplemental_operation_result.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'supplemental_items_batch_response.g.dart';

/// Response model for supplemental items batch operation
///
/// Properties:
/// * [batchId] - Id of the batch operation
/// * [completedTime] - Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
/// * [createdTime] - Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
/// * [operationResults] - Array of operation results
/// * [status] - Status of the batch: PROCESSING, COMPLETED, FAILED
@BuiltValue()
abstract class SupplementalItemsBatchResponse implements Built<SupplementalItemsBatchResponse, SupplementalItemsBatchResponseBuilder> {
  /// Id of the batch operation
  @BuiltValueField(wireName: r'batch_id')
  String get batchId;

  /// Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
  @BuiltValueField(wireName: r'completed_time')
  DateTime? get completedTime;

  /// Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
  @BuiltValueField(wireName: r'created_time')
  DateTime get createdTime;

  /// Array of operation results
  @BuiltValueField(wireName: r'operation_results')
  BuiltList<SupplementalOperationResult> get operationResults;

  /// Status of the batch: PROCESSING, COMPLETED, FAILED
  @BuiltValueField(wireName: r'status')
  SupplementalItemBatchOperationStatus get status;
  // enum statusEnum {  PROCESSING,  COMPLETED,  FAILED,  };

  SupplementalItemsBatchResponse._();

  factory SupplementalItemsBatchResponse([void updates(SupplementalItemsBatchResponseBuilder b)]) = _$SupplementalItemsBatchResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(SupplementalItemsBatchResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<SupplementalItemsBatchResponse> get serializer => _$SupplementalItemsBatchResponseSerializer();
}

class _$SupplementalItemsBatchResponseSerializer implements PrimitiveSerializer<SupplementalItemsBatchResponse> {
  @override
  final Iterable<Type> types = const [SupplementalItemsBatchResponse, _$SupplementalItemsBatchResponse];

  @override
  final String wireName = r'SupplementalItemsBatchResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    SupplementalItemsBatchResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'batch_id';
    yield serializers.serialize(
      object.batchId,
      specifiedType: const FullType(String),
    );
    if (object.completedTime != null) {
      yield r'completed_time';
      yield serializers.serialize(
        object.completedTime,
        specifiedType: const FullType(DateTime),
      );
    }
    yield r'created_time';
    yield serializers.serialize(
      object.createdTime,
      specifiedType: const FullType(DateTime),
    );
    yield r'operation_results';
    yield serializers.serialize(
      object.operationResults,
      specifiedType: const FullType(BuiltList, [FullType(SupplementalOperationResult)]),
    );
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(SupplementalItemBatchOperationStatus),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    SupplementalItemsBatchResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required SupplementalItemsBatchResponseBuilder result,
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
        case r'operation_results':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(SupplementalOperationResult)]),
          ) as BuiltList<SupplementalOperationResult>;
          result.operationResults.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(SupplementalItemBatchOperationStatus),
          ) as SupplementalItemBatchOperationStatus;
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
  SupplementalItemsBatchResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = SupplementalItemsBatchResponseBuilder();
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

