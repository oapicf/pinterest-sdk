//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_request_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'bulk_job_data.g.dart';

/// Bulk request result data.
///
/// Properties:
/// * [resultUrl] - Presigned s3 file url for the bulk request result.
/// * [status] 
/// * [workloadId] - Bulk Workload Id.
@BuiltValue()
abstract class BulkJobData implements Built<BulkJobData, BulkJobDataBuilder> {
  /// Presigned s3 file url for the bulk request result.
  @BuiltValueField(wireName: r'result_url')
  String? get resultUrl;

  @BuiltValueField(wireName: r'status')
  BulkRequestStatus get status;
  // enum statusEnum {  RUNNING,  SUCCEEDED,  FAILED,  };

  /// Bulk Workload Id.
  @BuiltValueField(wireName: r'workload_id')
  int? get workloadId;

  BulkJobData._();

  factory BulkJobData([void updates(BulkJobDataBuilder b)]) = _$BulkJobData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BulkJobDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BulkJobData> get serializer => _$BulkJobDataSerializer();
}

class _$BulkJobDataSerializer implements PrimitiveSerializer<BulkJobData> {
  @override
  final Iterable<Type> types = const [BulkJobData, _$BulkJobData];

  @override
  final String wireName = r'BulkJobData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BulkJobData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.resultUrl != null) {
      yield r'result_url';
      yield serializers.serialize(
        object.resultUrl,
        specifiedType: const FullType(String),
      );
    }
    yield r'status';
    yield serializers.serialize(
      object.status,
      specifiedType: const FullType(BulkRequestStatus),
    );
    if (object.workloadId != null) {
      yield r'workload_id';
      yield serializers.serialize(
        object.workloadId,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BulkJobData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BulkJobDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'result_url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.resultUrl = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkRequestStatus),
          ) as BulkRequestStatus;
          result.status = valueDes;
          break;
        case r'workload_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.workloadId = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BulkJobData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BulkJobDataBuilder();
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

