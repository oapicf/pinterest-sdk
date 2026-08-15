//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/analytics_daily_metrics.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'analytics_metrics_response.g.dart';

/// AnalyticsMetricsResponse
///
/// Properties:
/// * [dailyMetrics] - Array with the requested daily metric records
/// * [summaryMetrics] - The metric name and value over the requested period for each requested metric
@BuiltValue()
abstract class AnalyticsMetricsResponse implements Built<AnalyticsMetricsResponse, AnalyticsMetricsResponseBuilder> {
  /// Array with the requested daily metric records
  @BuiltValueField(wireName: r'daily_metrics')
  BuiltList<AnalyticsDailyMetrics>? get dailyMetrics;

  /// The metric name and value over the requested period for each requested metric
  @BuiltValueField(wireName: r'summary_metrics')
  BuiltMap<String, num>? get summaryMetrics;

  AnalyticsMetricsResponse._();

  factory AnalyticsMetricsResponse([void updates(AnalyticsMetricsResponseBuilder b)]) = _$AnalyticsMetricsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AnalyticsMetricsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AnalyticsMetricsResponse> get serializer => _$AnalyticsMetricsResponseSerializer();
}

class _$AnalyticsMetricsResponseSerializer implements PrimitiveSerializer<AnalyticsMetricsResponse> {
  @override
  final Iterable<Type> types = const [AnalyticsMetricsResponse, _$AnalyticsMetricsResponse];

  @override
  final String wireName = r'AnalyticsMetricsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AnalyticsMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dailyMetrics != null) {
      yield r'daily_metrics';
      yield serializers.serialize(
        object.dailyMetrics,
        specifiedType: const FullType(BuiltList, [FullType(AnalyticsDailyMetrics)]),
      );
    }
    if (object.summaryMetrics != null) {
      yield r'summary_metrics';
      yield serializers.serialize(
        object.summaryMetrics,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AnalyticsMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AnalyticsMetricsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'daily_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AnalyticsDailyMetrics)]),
          ) as BuiltList<AnalyticsDailyMetrics>;
          result.dailyMetrics.replace(valueDes);
          break;
        case r'summary_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>;
          result.summaryMetrics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AnalyticsMetricsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AnalyticsMetricsResponseBuilder();
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

