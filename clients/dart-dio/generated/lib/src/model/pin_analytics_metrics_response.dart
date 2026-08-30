//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pin_analytics_daily_metrics.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pin_analytics_metrics_response.g.dart';

/// PinAnalyticsMetricsResponse
///
/// Properties:
/// * [dailyMetrics] - Array with the requested daily metric records
/// * [lifetimeMetrics] - The lifetime metric name and value.
/// * [summaryMetrics] - The metric name and value over the requested period for each requested metric
@BuiltValue()
abstract class PinAnalyticsMetricsResponse implements Built<PinAnalyticsMetricsResponse, PinAnalyticsMetricsResponseBuilder> {
  /// Array with the requested daily metric records
  @BuiltValueField(wireName: r'daily_metrics')
  BuiltList<PinAnalyticsDailyMetrics>? get dailyMetrics;

  /// The lifetime metric name and value.
  @BuiltValueField(wireName: r'lifetime_metrics')
  BuiltMap<String, int>? get lifetimeMetrics;

  /// The metric name and value over the requested period for each requested metric
  @BuiltValueField(wireName: r'summary_metrics')
  BuiltMap<String, num>? get summaryMetrics;

  PinAnalyticsMetricsResponse._();

  factory PinAnalyticsMetricsResponse([void updates(PinAnalyticsMetricsResponseBuilder b)]) = _$PinAnalyticsMetricsResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PinAnalyticsMetricsResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PinAnalyticsMetricsResponse> get serializer => _$PinAnalyticsMetricsResponseSerializer();
}

class _$PinAnalyticsMetricsResponseSerializer implements PrimitiveSerializer<PinAnalyticsMetricsResponse> {
  @override
  final Iterable<Type> types = const [PinAnalyticsMetricsResponse, _$PinAnalyticsMetricsResponse];

  @override
  final String wireName = r'PinAnalyticsMetricsResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PinAnalyticsMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.dailyMetrics != null) {
      yield r'daily_metrics';
      yield serializers.serialize(
        object.dailyMetrics,
        specifiedType: const FullType(BuiltList, [FullType(PinAnalyticsDailyMetrics)]),
      );
    }
    if (object.lifetimeMetrics != null) {
      yield r'lifetime_metrics';
      yield serializers.serialize(
        object.lifetimeMetrics,
        specifiedType: const FullType(BuiltMap, [FullType(String), FullType(int)]),
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
    PinAnalyticsMetricsResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PinAnalyticsMetricsResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'daily_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PinAnalyticsDailyMetrics)]),
          ) as BuiltList<PinAnalyticsDailyMetrics>?;
          if (valueDes == null) continue;
          result.dailyMetrics.replace(valueDes);
          break;
        case r'lifetime_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(int)]),
          ) as BuiltMap<String, int>?;
          if (valueDes == null) continue;
          result.lifetimeMetrics.replace(valueDes);
          break;
        case r'summary_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltMap, [FullType(String), FullType(num)]),
          ) as BuiltMap<String, num>?;
          if (valueDes == null) continue;
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
  PinAnalyticsMetricsResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PinAnalyticsMetricsResponseBuilder();
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

