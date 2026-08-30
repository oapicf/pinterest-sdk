//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_conversion_attribution.dart';
import 'package:openapi/src/model/campaign_planning_conversion_event.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_conversion_rate.g.dart';

/// Conversion rate estimate for a specific conversion event and attribution window combination.
///
/// Properties:
/// * [attributionWindows] 
/// * [conversionEvent] 
/// * [conversionRate] - Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
@BuiltValue()
abstract class CampaignPlanningConversionRate implements Built<CampaignPlanningConversionRate, CampaignPlanningConversionRateBuilder> {
  @BuiltValueField(wireName: r'attribution_windows')
  CampaignPlanningConversionAttribution get attributionWindows;

  @BuiltValueField(wireName: r'conversion_event')
  CampaignPlanningConversionEvent get conversionEvent;
  // enum conversionEventEnum {  SIGNUP,  CHECKOUT,  ADD_TO_CART,  LEAD,  };

  /// Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
  @BuiltValueField(wireName: r'conversion_rate')
  double get conversionRate;

  CampaignPlanningConversionRate._();

  factory CampaignPlanningConversionRate([void updates(CampaignPlanningConversionRateBuilder b)]) = _$CampaignPlanningConversionRate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningConversionRateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningConversionRate> get serializer => _$CampaignPlanningConversionRateSerializer();
}

class _$CampaignPlanningConversionRateSerializer implements PrimitiveSerializer<CampaignPlanningConversionRate> {
  @override
  final Iterable<Type> types = const [CampaignPlanningConversionRate, _$CampaignPlanningConversionRate];

  @override
  final String wireName = r'CampaignPlanningConversionRate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningConversionRate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'attribution_windows';
    yield serializers.serialize(
      object.attributionWindows,
      specifiedType: const FullType(CampaignPlanningConversionAttribution),
    );
    yield r'conversion_event';
    yield serializers.serialize(
      object.conversionEvent,
      specifiedType: const FullType(CampaignPlanningConversionEvent),
    );
    yield r'conversion_rate';
    yield serializers.serialize(
      object.conversionRate,
      specifiedType: const FullType(double),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningConversionRate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningConversionRateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'attribution_windows':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignPlanningConversionAttribution),
          ) as CampaignPlanningConversionAttribution;
          result.attributionWindows.replace(valueDes);
          break;
        case r'conversion_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignPlanningConversionEvent),
          ) as CampaignPlanningConversionEvent;
          result.conversionEvent = valueDes;
          break;
        case r'conversion_rate':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(double),
          ) as double;
          result.conversionRate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningConversionRate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningConversionRateBuilder();
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

