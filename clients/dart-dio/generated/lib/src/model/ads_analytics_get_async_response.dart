//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/bulk_reporting_job_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_get_async_response.g.dart';

/// AdsAnalyticsGetAsyncResponse
///
/// Properties:
/// * [reportStatus] 
/// * [size] 
/// * [url] 
@BuiltValue()
abstract class AdsAnalyticsGetAsyncResponse implements Built<AdsAnalyticsGetAsyncResponse, AdsAnalyticsGetAsyncResponseBuilder> {
  @BuiltValueField(wireName: r'report_status')
  BulkReportingJobStatus? get reportStatus;
  // enum reportStatusEnum {  DOES_NOT_EXIST,  FINISHED,  IN_PROGRESS,  EXPIRED,  FAILED,  CANCELLED,  };

  @BuiltValueField(wireName: r'size')
  num? get size;

  @BuiltValueField(wireName: r'url')
  String? get url;

  AdsAnalyticsGetAsyncResponse._();

  factory AdsAnalyticsGetAsyncResponse([void updates(AdsAnalyticsGetAsyncResponseBuilder b)]) = _$AdsAnalyticsGetAsyncResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsGetAsyncResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsAnalyticsGetAsyncResponse> get serializer => _$AdsAnalyticsGetAsyncResponseSerializer();
}

class _$AdsAnalyticsGetAsyncResponseSerializer implements PrimitiveSerializer<AdsAnalyticsGetAsyncResponse> {
  @override
  final Iterable<Type> types = const [AdsAnalyticsGetAsyncResponse, _$AdsAnalyticsGetAsyncResponse];

  @override
  final String wireName = r'AdsAnalyticsGetAsyncResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsAnalyticsGetAsyncResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
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
        specifiedType: const FullType.nullable(num),
      );
    }
    if (object.url != null) {
      yield r'url';
      yield serializers.serialize(
        object.url,
        specifiedType: const FullType.nullable(String),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsAnalyticsGetAsyncResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsAnalyticsGetAsyncResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  AdsAnalyticsGetAsyncResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsAnalyticsGetAsyncResponseBuilder();
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

