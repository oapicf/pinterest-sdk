//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_reporting_job_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'create_mmm_report_response_data.g.dart';

/// CreateMMMReportResponseData
///
/// Properties:
/// * [message] 
/// * [reportStatus] 
/// * [status] 
/// * [token] 
@BuiltValue()
abstract class CreateMMMReportResponseData implements Built<CreateMMMReportResponseData, CreateMMMReportResponseDataBuilder> {
  @BuiltValueField(wireName: r'message')
  String? get message;

  @BuiltValueField(wireName: r'report_status')
  BulkReportingJobStatus? get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  @BuiltValueField(wireName: r'status')
  String? get status;

  @BuiltValueField(wireName: r'token')
  String? get token;

  CreateMMMReportResponseData._();

  factory CreateMMMReportResponseData([void updates(CreateMMMReportResponseDataBuilder b)]) = _$CreateMMMReportResponseData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CreateMMMReportResponseDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CreateMMMReportResponseData> get serializer => _$CreateMMMReportResponseDataSerializer();
}

class _$CreateMMMReportResponseDataSerializer implements PrimitiveSerializer<CreateMMMReportResponseData> {
  @override
  final Iterable<Type> types = const [CreateMMMReportResponseData, _$CreateMMMReportResponseData];

  @override
  final String wireName = r'CreateMMMReportResponseData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CreateMMMReportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.reportStatus != null) {
      yield r'report_status';
      yield serializers.serialize(
        object.reportStatus,
        specifiedType: const FullType(BulkReportingJobStatus),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(String),
      );
    }
    if (object.token != null) {
      yield r'token';
      yield serializers.serialize(
        object.token,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CreateMMMReportResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CreateMMMReportResponseDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.message = valueDes;
          break;
        case r'report_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkReportingJobStatus),
          ) as BulkReportingJobStatus;
          result.reportStatus = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.status = valueDes;
          break;
        case r'token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.token = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CreateMMMReportResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CreateMMMReportResponseDataBuilder();
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

