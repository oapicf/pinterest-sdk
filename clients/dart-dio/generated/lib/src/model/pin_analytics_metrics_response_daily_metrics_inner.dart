//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/data_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_analytics_metrics_response_daily_metrics_inner.g.dart';

/// PinAnalyticsMetricsResponseDailyMetricsInner
///
/// Properties:
/// * [dataStatus] 
/// * [date] - Metrics date (UTC): YYYY-MM-DD.
/// * [metrics] - The metric name and daily value for each requested metric
@BuiltValue()
abstract class PinAnalyticsMetricsResponseDailyMetricsInner implements Built<PinAnalyticsMetricsResponseDailyMetricsInner, PinAnalyticsMetricsResponseDailyMetricsInnerBuilder> {
  @BuiltValueField(wireName: r'data_status')
  DataStatus? get dataStatus;
  // enum dataStatusEnum {  PROCESSING,  READY,  ESTIMATE,  BEFORE_BUSINESS_CREATED,  BEFORE_DATA_RETENTION_PERIOD,  BEFORE_PIN_DATA_RETENTION_PERIOD,  BEFORE_METRIC_START_DATE,  BEFORE_CORE_METRIC_START_DATE,  BEFORE_PIN_FORMAT_METRIC_START_DATE,  BEFORE_AUDIENCE_METRIC_START_DATE,  BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE,  BEFORE_VIDEO_METRIC_START_DATE,  BEFORE_CONVERSION_METRIC_START_DATE,  PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD,  IN_BAD_TAG_DATE,  BEFORE_PUBLISHED_METRIC_START_DATE,  BEFORE_ASSIST_METRIC_START_DATE,  BEFORE_PIN_CREATED,  BEFORE_ACCOUNT_CLAIMED,  BEFORE_DEMOGRAPHIC_FILTERS_START_DATE,  AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD,  AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD,  BEFORE_PRODUCT_GROUP_FILTER_START_DATE,  };

  /// Metrics date (UTC): YYYY-MM-DD.
  @BuiltValueField(wireName: r'date')
  String? get date;

  /// The metric name and daily value for each requested metric
  @BuiltValueField(wireName: r'metrics')
  BuiltMap<String, num>? get metrics;

  PinAnalyticsMetricsResponseDailyMetricsInner._();

  factory PinAnalyticsMetricsResponseDailyMetricsInner([void updates(PinAnalyticsMetricsResponseDailyMetricsInnerBuilder b)]) = _$PinAnalyticsMetricsResponseDailyMetricsInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinAnalyticsMetricsResponseDailyMetricsInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinAnalyticsMetricsResponseDailyMetricsInner> get serializer => _$PinAnalyticsMetricsResponseDailyMetricsInnerSerializer();
}

class _$PinAnalyticsMetricsResponseDailyMetricsInnerSerializer implements PrimitiveSerializer<PinAnalyticsMetricsResponseDailyMetricsInner> {
  @override
  final Iterable<Type> types = const [PinAnalyticsMetricsResponseDailyMetricsInner, _$PinAnalyticsMetricsResponseDailyMetricsInner];

  @override
  final String wireName = r'PinAnalyticsMetricsResponseDailyMetricsInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinAnalyticsMetricsResponseDailyMetricsInner object, {
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
    PinAnalyticsMetricsResponseDailyMetricsInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinAnalyticsMetricsResponseDailyMetricsInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'data_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DataStatus),
          ) as DataStatus;
          result.dataStatus = valueDes;
          break;
        case r'date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.date = valueDes;
          break;
        case r'metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
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
  PinAnalyticsMetricsResponseDailyMetricsInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinAnalyticsMetricsResponseDailyMetricsInnerBuilder();
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

