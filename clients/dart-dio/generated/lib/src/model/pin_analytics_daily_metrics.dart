//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/data_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_analytics_daily_metrics.g.dart';

/// PinAnalyticsDailyMetrics
///
/// Properties:
/// * [dataStatus] 
/// * [date] - Metrics date (UTC): YYYY-MM-DD.
/// * [metrics] 
@BuiltValue()
abstract class PinAnalyticsDailyMetrics implements Built<PinAnalyticsDailyMetrics, PinAnalyticsDailyMetricsBuilder> {
  @BuiltValueField(wireName: r'data_status')
  DataStatus? get dataStatus;
  // enum dataStatusEnum {  PROCESSING,  READY,  ESTIMATE,  BEFORE_BUSINESS_CREATED,  BEFORE_DATA_RETENTION_PERIOD,  BEFORE_PIN_DATA_RETENTION_PERIOD,  BEFORE_METRIC_START_DATE,  BEFORE_CORE_METRIC_START_DATE,  BEFORE_PIN_FORMAT_METRIC_START_DATE,  BEFORE_AUDIENCE_METRIC_START_DATE,  BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE,  BEFORE_VIDEO_METRIC_START_DATE,  BEFORE_CONVERSION_METRIC_START_DATE,  PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD,  IN_BAD_TAG_DATE,  BEFORE_PUBLISHED_METRIC_START_DATE,  BEFORE_ASSIST_METRIC_START_DATE,  BEFORE_PIN_CREATED,  BEFORE_ACCOUNT_CLAIMED,  BEFORE_DEMOGRAPHIC_FILTERS_START_DATE,  AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD,  AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD,  BEFORE_PRODUCT_GROUP_FILTER_START_DATE,  };

  /// Metrics date (UTC): YYYY-MM-DD.
  @BuiltValueField(wireName: r'date')
  String? get date;

  @BuiltValueField(wireName: r'metrics')
  BuiltMap<String, num>? get metrics;

  PinAnalyticsDailyMetrics._();

  factory PinAnalyticsDailyMetrics([void updates(PinAnalyticsDailyMetricsBuilder b)]) = _$PinAnalyticsDailyMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinAnalyticsDailyMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinAnalyticsDailyMetrics> get serializer => _$PinAnalyticsDailyMetricsSerializer();
}

class _$PinAnalyticsDailyMetricsSerializer implements PrimitiveSerializer<PinAnalyticsDailyMetrics> {
  @override
  final Iterable<Type> types = const [PinAnalyticsDailyMetrics, _$PinAnalyticsDailyMetrics];

  @override
  final String wireName = r'PinAnalyticsDailyMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinAnalyticsDailyMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dataStatus != null) {
      yield r'data_status';
      yield serializers.serialize(
        object.dataStatus,
        specifiedType: const FullType(DataStatus),
      );
    }
    if (object.date != null) {
      yield r'date';
      yield serializers.serialize(
        object.date,
        specifiedType: const FullType(String),
      );
    }
    if (object.metrics != null) {
      yield r'metrics';
      yield serializers.serialize(
        object.metrics,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    PinAnalyticsDailyMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinAnalyticsDailyMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DataStatus),
          ) as DataStatus?;
          if (valueDes == null) continue;
          result.dataStatus = valueDes;
          break;
        case r'date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.date = valueDes;
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>?;
          if (valueDes == null) continue;
          result.metrics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PinAnalyticsDailyMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinAnalyticsDailyMetricsBuilder();
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

