//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_delivery_estimates_derived_metrics.g.dart';

/// Derived metrics for an ad campaign.
///
/// Properties:
/// * [cpc] - Estimated cost per click.
/// * [cpcLower] - Lower estimate of the cost per click.
/// * [cpcUpper] - Upper estimate of the cost per click.
/// * [cpm] - Estimated cost per thousand impressions.
/// * [cpmLower] - Lower estimate of cost per thousand impressions.
/// * [cpmUpper] - Upper estimate of cost per thousand impressions.
/// * [lifetimeFrequency] - Estimated lifetime frequency.
/// * [lifetimeFrequencyLower] - Lower estimate of lifetime frequency.
/// * [lifetimeFrequencyUpper] - Upper estimate of lifetime frequency.
/// * [lifetimeImpression] - Estimated lifetime impressions.
/// * [lifetimeImpressionLower] - Lower estimate of lifetime impressions.
/// * [lifetimeImpressionUpper] - Upper estimate of lifetime impressions.
/// * [lifetimeReach] - Estimated lifetime reach.
/// * [lifetimeReachLower] - Lower estimate of lifetime reach.
/// * [lifetimeReachUpper] - Upper estimate of lifetime reach.
/// * [weeklyClick] - Estimated weekly clicks.
/// * [weeklyClickLower] - Lower estimate of weekly clicks.
/// * [weeklyClickUpper] - Upper estimate of weekly clicks.
/// * [weeklyFrequency] - Estimated weekly frequency.
/// * [weeklyFrequencyLower] - Lower estimate of weekly frequency.
/// * [weeklyFrequencyUpper] - Upper estimate of weekly frequency.
/// * [weeklyImpression] - Estimated weekly impressions.
/// * [weeklyImpressionLower] - Lower estimate of weekly impressions.
/// * [weeklyImpressionUpper] - Upper estimate of weekly impressions.
/// * [weeklyReach] - Estimated weekly reach.
/// * [weeklyReachLower] - Lower estimate of weekly reach.
/// * [weeklyReachUpper] - Upper estimate of weekly reach.
@BuiltValue()
abstract class CampaignDeliveryEstimatesDerivedMetrics implements Built<CampaignDeliveryEstimatesDerivedMetrics, CampaignDeliveryEstimatesDerivedMetricsBuilder> {
  /// Estimated cost per click.
  @BuiltValueField(wireName: r'cpc')
  double? get cpc;

  /// Lower estimate of the cost per click.
  @BuiltValueField(wireName: r'cpc_lower')
  double? get cpcLower;

  /// Upper estimate of the cost per click.
  @BuiltValueField(wireName: r'cpc_upper')
  double? get cpcUpper;

  /// Estimated cost per thousand impressions.
  @BuiltValueField(wireName: r'cpm')
  double? get cpm;

  /// Lower estimate of cost per thousand impressions.
  @BuiltValueField(wireName: r'cpm_lower')
  double? get cpmLower;

  /// Upper estimate of cost per thousand impressions.
  @BuiltValueField(wireName: r'cpm_upper')
  double? get cpmUpper;

  /// Estimated lifetime frequency.
  @BuiltValueField(wireName: r'lifetime_frequency')
  double? get lifetimeFrequency;

  /// Lower estimate of lifetime frequency.
  @BuiltValueField(wireName: r'lifetime_frequency_lower')
  double? get lifetimeFrequencyLower;

  /// Upper estimate of lifetime frequency.
  @BuiltValueField(wireName: r'lifetime_frequency_upper')
  double? get lifetimeFrequencyUpper;

  /// Estimated lifetime impressions.
  @BuiltValueField(wireName: r'lifetime_impression')
  double? get lifetimeImpression;

  /// Lower estimate of lifetime impressions.
  @BuiltValueField(wireName: r'lifetime_impression_lower')
  double? get lifetimeImpressionLower;

  /// Upper estimate of lifetime impressions.
  @BuiltValueField(wireName: r'lifetime_impression_upper')
  double? get lifetimeImpressionUpper;

  /// Estimated lifetime reach.
  @BuiltValueField(wireName: r'lifetime_reach')
  double? get lifetimeReach;

  /// Lower estimate of lifetime reach.
  @BuiltValueField(wireName: r'lifetime_reach_lower')
  double? get lifetimeReachLower;

  /// Upper estimate of lifetime reach.
  @BuiltValueField(wireName: r'lifetime_reach_upper')
  double? get lifetimeReachUpper;

  /// Estimated weekly clicks.
  @BuiltValueField(wireName: r'weekly_click')
  double? get weeklyClick;

  /// Lower estimate of weekly clicks.
  @BuiltValueField(wireName: r'weekly_click_lower')
  double? get weeklyClickLower;

  /// Upper estimate of weekly clicks.
  @BuiltValueField(wireName: r'weekly_click_upper')
  double? get weeklyClickUpper;

  /// Estimated weekly frequency.
  @BuiltValueField(wireName: r'weekly_frequency')
  double? get weeklyFrequency;

  /// Lower estimate of weekly frequency.
  @BuiltValueField(wireName: r'weekly_frequency_lower')
  double? get weeklyFrequencyLower;

  /// Upper estimate of weekly frequency.
  @BuiltValueField(wireName: r'weekly_frequency_upper')
  double? get weeklyFrequencyUpper;

  /// Estimated weekly impressions.
  @BuiltValueField(wireName: r'weekly_impression')
  double? get weeklyImpression;

  /// Lower estimate of weekly impressions.
  @BuiltValueField(wireName: r'weekly_impression_lower')
  double? get weeklyImpressionLower;

  /// Upper estimate of weekly impressions.
  @BuiltValueField(wireName: r'weekly_impression_upper')
  double? get weeklyImpressionUpper;

  /// Estimated weekly reach.
  @BuiltValueField(wireName: r'weekly_reach')
  double? get weeklyReach;

  /// Lower estimate of weekly reach.
  @BuiltValueField(wireName: r'weekly_reach_lower')
  double? get weeklyReachLower;

  /// Upper estimate of weekly reach.
  @BuiltValueField(wireName: r'weekly_reach_upper')
  double? get weeklyReachUpper;

  CampaignDeliveryEstimatesDerivedMetrics._();

  factory CampaignDeliveryEstimatesDerivedMetrics([void updates(CampaignDeliveryEstimatesDerivedMetricsBuilder b)]) = _$CampaignDeliveryEstimatesDerivedMetrics;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignDeliveryEstimatesDerivedMetricsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignDeliveryEstimatesDerivedMetrics> get serializer => _$CampaignDeliveryEstimatesDerivedMetricsSerializer();
}

class _$CampaignDeliveryEstimatesDerivedMetricsSerializer implements PrimitiveSerializer<CampaignDeliveryEstimatesDerivedMetrics> {
  @override
  final Iterable<Type> types = const [CampaignDeliveryEstimatesDerivedMetrics, _$CampaignDeliveryEstimatesDerivedMetrics];

  @override
  final String wireName = r'CampaignDeliveryEstimatesDerivedMetrics';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignDeliveryEstimatesDerivedMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cpc != null) {
      yield r'cpc';
      yield serializers.serialize(
        object.cpc,
        specifiedType: const FullType(double),
      );
    }
    if (object.cpcLower != null) {
      yield r'cpc_lower';
      yield serializers.serialize(
        object.cpcLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.cpcUpper != null) {
      yield r'cpc_upper';
      yield serializers.serialize(
        object.cpcUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.cpm != null) {
      yield r'cpm';
      yield serializers.serialize(
        object.cpm,
        specifiedType: const FullType(double),
      );
    }
    if (object.cpmLower != null) {
      yield r'cpm_lower';
      yield serializers.serialize(
        object.cpmLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.cpmUpper != null) {
      yield r'cpm_upper';
      yield serializers.serialize(
        object.cpmUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeFrequency != null) {
      yield r'lifetime_frequency';
      yield serializers.serialize(
        object.lifetimeFrequency,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeFrequencyLower != null) {
      yield r'lifetime_frequency_lower';
      yield serializers.serialize(
        object.lifetimeFrequencyLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeFrequencyUpper != null) {
      yield r'lifetime_frequency_upper';
      yield serializers.serialize(
        object.lifetimeFrequencyUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeImpression != null) {
      yield r'lifetime_impression';
      yield serializers.serialize(
        object.lifetimeImpression,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeImpressionLower != null) {
      yield r'lifetime_impression_lower';
      yield serializers.serialize(
        object.lifetimeImpressionLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeImpressionUpper != null) {
      yield r'lifetime_impression_upper';
      yield serializers.serialize(
        object.lifetimeImpressionUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeReach != null) {
      yield r'lifetime_reach';
      yield serializers.serialize(
        object.lifetimeReach,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeReachLower != null) {
      yield r'lifetime_reach_lower';
      yield serializers.serialize(
        object.lifetimeReachLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.lifetimeReachUpper != null) {
      yield r'lifetime_reach_upper';
      yield serializers.serialize(
        object.lifetimeReachUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyClick != null) {
      yield r'weekly_click';
      yield serializers.serialize(
        object.weeklyClick,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyClickLower != null) {
      yield r'weekly_click_lower';
      yield serializers.serialize(
        object.weeklyClickLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyClickUpper != null) {
      yield r'weekly_click_upper';
      yield serializers.serialize(
        object.weeklyClickUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyFrequency != null) {
      yield r'weekly_frequency';
      yield serializers.serialize(
        object.weeklyFrequency,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyFrequencyLower != null) {
      yield r'weekly_frequency_lower';
      yield serializers.serialize(
        object.weeklyFrequencyLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyFrequencyUpper != null) {
      yield r'weekly_frequency_upper';
      yield serializers.serialize(
        object.weeklyFrequencyUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyImpression != null) {
      yield r'weekly_impression';
      yield serializers.serialize(
        object.weeklyImpression,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyImpressionLower != null) {
      yield r'weekly_impression_lower';
      yield serializers.serialize(
        object.weeklyImpressionLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyImpressionUpper != null) {
      yield r'weekly_impression_upper';
      yield serializers.serialize(
        object.weeklyImpressionUpper,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyReach != null) {
      yield r'weekly_reach';
      yield serializers.serialize(
        object.weeklyReach,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyReachLower != null) {
      yield r'weekly_reach_lower';
      yield serializers.serialize(
        object.weeklyReachLower,
        specifiedType: const FullType(double),
      );
    }
    if (object.weeklyReachUpper != null) {
      yield r'weekly_reach_upper';
      yield serializers.serialize(
        object.weeklyReachUpper,
        specifiedType: const FullType(double),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignDeliveryEstimatesDerivedMetrics object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignDeliveryEstimatesDerivedMetricsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cpc':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpc = valueDes;
          break;
        case r'cpc_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpcLower = valueDes;
          break;
        case r'cpc_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpcUpper = valueDes;
          break;
        case r'cpm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpm = valueDes;
          break;
        case r'cpm_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpmLower = valueDes;
          break;
        case r'cpm_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.cpmUpper = valueDes;
          break;
        case r'lifetime_frequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeFrequency = valueDes;
          break;
        case r'lifetime_frequency_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeFrequencyLower = valueDes;
          break;
        case r'lifetime_frequency_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeFrequencyUpper = valueDes;
          break;
        case r'lifetime_impression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeImpression = valueDes;
          break;
        case r'lifetime_impression_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeImpressionLower = valueDes;
          break;
        case r'lifetime_impression_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeImpressionUpper = valueDes;
          break;
        case r'lifetime_reach':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeReach = valueDes;
          break;
        case r'lifetime_reach_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeReachLower = valueDes;
          break;
        case r'lifetime_reach_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.lifetimeReachUpper = valueDes;
          break;
        case r'weekly_click':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyClick = valueDes;
          break;
        case r'weekly_click_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyClickLower = valueDes;
          break;
        case r'weekly_click_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyClickUpper = valueDes;
          break;
        case r'weekly_frequency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyFrequency = valueDes;
          break;
        case r'weekly_frequency_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyFrequencyLower = valueDes;
          break;
        case r'weekly_frequency_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyFrequencyUpper = valueDes;
          break;
        case r'weekly_impression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyImpression = valueDes;
          break;
        case r'weekly_impression_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyImpressionLower = valueDes;
          break;
        case r'weekly_impression_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyImpressionUpper = valueDes;
          break;
        case r'weekly_reach':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyReach = valueDes;
          break;
        case r'weekly_reach_lower':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyReachLower = valueDes;
          break;
        case r'weekly_reach_upper':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(double),
          ) as double?;
          if (valueDes == null) continue;
          result.weeklyReachUpper = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignDeliveryEstimatesDerivedMetrics deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignDeliveryEstimatesDerivedMetricsBuilder();
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

