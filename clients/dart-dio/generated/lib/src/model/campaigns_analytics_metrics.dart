//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaigns_analytics_metrics.g.dart';

/// CampaignsAnalyticsMetrics
///
/// Properties:
/// * [CAMPAIGN_ID] - The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
@BuiltValue()
abstract class CampaignsAnalyticsMetrics implements Built<CampaignsAnalyticsMetrics, CampaignsAnalyticsMetricsBuilder> {
  /// The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  @BuiltValueField(wireName: r'CAMPAIGN_ID')
  String? get CAMPAIGN_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  CampaignsAnalyticsMetrics._();

  factory CampaignsAnalyticsMetrics([void updates(CampaignsAnalyticsMetricsBuilder b)]) = _$CampaignsAnalyticsMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignsAnalyticsMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignsAnalyticsMetrics> get serializer => _$CampaignsAnalyticsMetricsSerializer();
}

class _$CampaignsAnalyticsMetricsSerializer implements PrimitiveSerializer<CampaignsAnalyticsMetrics> {
  @override
  final Iterable<Type> types = const [CampaignsAnalyticsMetrics, _$CampaignsAnalyticsMetrics];

  @override
  final String wireName = r'CampaignsAnalyticsMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignsAnalyticsMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.CAMPAIGN_ID != null) {
      yield r'CAMPAIGN_ID';
      yield serializers.serialize(
        object.CAMPAIGN_ID,
        specifiedType: const FullType(String),
      );
    }
    if (object.DATE != null) {
      yield r'DATE';
      yield serializers.serialize(
        object.DATE,
        specifiedType: const FullType(Date),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignsAnalyticsMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignsAnalyticsMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'CAMPAIGN_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.CAMPAIGN_ID = valueDes;
          break;
        case r'DATE':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Date),
          ) as Date?;
          if (valueDes == null) continue;
          result.DATE = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignsAnalyticsMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignsAnalyticsMetricsBuilder();
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

