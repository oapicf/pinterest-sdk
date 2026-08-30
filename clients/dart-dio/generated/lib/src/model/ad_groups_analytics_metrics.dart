//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/date.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_groups_analytics_metrics.g.dart';

/// AdGroupsAnalyticsMetrics
///
/// Properties:
/// * [AD_GROUP_ID] - The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
/// * [DATE] - Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
@BuiltValue()
abstract class AdGroupsAnalyticsMetrics implements Built<AdGroupsAnalyticsMetrics, AdGroupsAnalyticsMetricsBuilder> {
  /// The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  @BuiltValueField(wireName: r'AD_GROUP_ID')
  String? get AD_GROUP_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  @BuiltValueField(wireName: r'DATE')
  Date? get DATE;

  AdGroupsAnalyticsMetrics._();

  factory AdGroupsAnalyticsMetrics([void updates(AdGroupsAnalyticsMetricsBuilder b)]) = _$AdGroupsAnalyticsMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupsAnalyticsMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupsAnalyticsMetrics> get serializer => _$AdGroupsAnalyticsMetricsSerializer();
}

class _$AdGroupsAnalyticsMetricsSerializer implements PrimitiveSerializer<AdGroupsAnalyticsMetrics> {
  @override
  final Iterable<Type> types = const [AdGroupsAnalyticsMetrics, _$AdGroupsAnalyticsMetrics];

  @override
  final String wireName = r'AdGroupsAnalyticsMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupsAnalyticsMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.AD_GROUP_ID != null) {
      yield r'AD_GROUP_ID';
      yield serializers.serialize(
        object.AD_GROUP_ID,
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
    AdGroupsAnalyticsMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupsAnalyticsMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'AD_GROUP_ID':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.AD_GROUP_ID = valueDes;
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
  AdGroupsAnalyticsMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupsAnalyticsMetricsBuilder();
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

