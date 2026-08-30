//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_reporting_job_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'template_based_report_create.g.dart';

/// Resource create operation model.
///
/// Properties:
/// * [message] 
/// * [reportStatus] 
/// * [token] 
@BuiltValue()
abstract class TemplateBasedReportCreate implements Built<TemplateBasedReportCreate, TemplateBasedReportCreateBuilder> {
  @BuiltValueField(wireName: r'message')
  String? get message;

  @BuiltValueField(wireName: r'report_status')
  BulkReportingJobStatus get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  @BuiltValueField(wireName: r'token')
  String? get token;

  TemplateBasedReportCreate._();

  factory TemplateBasedReportCreate([void updates(TemplateBasedReportCreateBuilder b)]) = _$TemplateBasedReportCreate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(TemplateBasedReportCreateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<TemplateBasedReportCreate> get serializer => _$TemplateBasedReportCreateSerializer();
}

class _$TemplateBasedReportCreateSerializer implements PrimitiveSerializer<TemplateBasedReportCreate> {
  @override
  final Iterable<Type> types = const [TemplateBasedReportCreate, _$TemplateBasedReportCreate];

  @override
  final String wireName = r'TemplateBasedReportCreate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    TemplateBasedReportCreate object, {
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
    TemplateBasedReportCreate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required TemplateBasedReportCreateBuilder result,
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
        case r'token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
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
  TemplateBasedReportCreate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = TemplateBasedReportCreateBuilder();
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

