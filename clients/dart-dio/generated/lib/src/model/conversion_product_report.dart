//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_reporting_job_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'conversion_product_report.g.dart';

/// ConversionProductReport
///
/// Properties:
/// * [message] - Message returned from the create report request
/// * [reportStatus] - Async report status
/// * [size] - Size of the report in bytes
/// * [token] - Token returned from the create report request
/// * [url] - URL of the report
@BuiltValue()
abstract class ConversionProductReport implements Built<ConversionProductReport, ConversionProductReportBuilder> {
  /// Message returned from the create report request
  @BuiltValueField(wireName: r'message')
  String? get message;

  /// Async report status
  @BuiltValueField(wireName: r'report_status')
  BulkReportingJobStatus? get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  /// Size of the report in bytes
  @BuiltValueField(wireName: r'size')
  num? get size;

  /// Token returned from the create report request
  @BuiltValueField(wireName: r'token')
  String? get token;

  /// URL of the report
  @BuiltValueField(wireName: r'url')
  String? get url;

  ConversionProductReport._();

  factory ConversionProductReport([void updates(ConversionProductReportBuilder b)]) = _$ConversionProductReport;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ConversionProductReportBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ConversionProductReport> get serializer => _$ConversionProductReportSerializer();
}

class _$ConversionProductReportSerializer implements PrimitiveSerializer<ConversionProductReport> {
  @override
  final Iterable<Type> types = const [ConversionProductReport, _$ConversionProductReport];

  @override
  final String wireName = r'ConversionProductReport';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ConversionProductReport object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.message != null) {
      yield r'message';
      yield serializers.serialize(
        object.message,
        specifiedType: const FullType(String),
      );
    }
    if (object.reportStatus != null) {
      yield r'report_status';
      yield serializers.serialize(
        object.reportStatus,
        specifiedType: const FullType(BulkReportingJobStatus),
      );
    }
    if (object.size != null) {
      yield r'size';
      yield serializers.serialize(
        object.size,
        specifiedType: const FullType(num),
      );
    }
    if (object.token != null) {
      yield r'token';
      yield serializers.serialize(
        object.token,
        specifiedType: const FullType(String),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ConversionProductReport object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ConversionProductReportBuilder result,
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
            specifiedType: const FullType.nullable(BulkReportingJobStatus),
          ) as BulkReportingJobStatus?;
          if (valueDes == null) continue;
          result.reportStatus = valueDes;
          break;
        case r'size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.size = valueDes;
          break;
        case r'token':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.token = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ConversionProductReport deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ConversionProductReportBuilder();
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

