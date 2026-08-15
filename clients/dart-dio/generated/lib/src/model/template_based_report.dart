//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_reporting_job_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_based_report.g.dart';

/// TemplateBasedReport
///
/// Properties:
/// * [message] 
/// * [reportStatus] 
/// * [templateId] - Unique identifier of a template.
/// * [token] 
@BuiltValue()
abstract class TemplateBasedReport implements Built<TemplateBasedReport, TemplateBasedReportBuilder> {
  @BuiltValueField(wireName: r'message')
  String? get message;

  @BuiltValueField(wireName: r'report_status')
  BulkReportingJobStatus get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  /// Unique identifier of a template.
  @BuiltValueField(wireName: r'template_id')
  String get templateId;

  @BuiltValueField(wireName: r'token')
  String? get token;

  TemplateBasedReport._();

  factory TemplateBasedReport([void updates(TemplateBasedReportBuilder b)]) = _$TemplateBasedReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateBasedReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateBasedReport> get serializer => _$TemplateBasedReportSerializer();
}

class _$TemplateBasedReportSerializer implements PrimitiveSerializer<TemplateBasedReport> {
  @override
  final Iterable<Type> types = const [TemplateBasedReport, _$TemplateBasedReport];

  @override
  final String wireName = r'TemplateBasedReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateBasedReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    yield r'report_status';
    yield serializers.serialize(
      object.reportStatus,
      specifiedType: const FullType(BulkReportingJobStatus),
    );
    yield r'template_id';
    yield serializers.serialize(
      object.templateId,
      specifiedType: const FullType(String),
    );
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
    TemplateBasedReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateBasedReportBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'message':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.message = valueDes;
          break;
        case r'report_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BulkReportingJobStatus),
          ) as BulkReportingJobStatus;
          result.reportStatus = valueDes;
          break;
        case r'template_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.templateId = valueDes;
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
  TemplateBasedReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateBasedReportBuilder();
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

