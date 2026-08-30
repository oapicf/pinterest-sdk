//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_planning_conversion_attribution_window_days.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_planning_conversion_attribution.g.dart';

/// Attribution windows for a conversion event.
///
/// Properties:
/// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action.
/// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
/// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action.
@BuiltValue()
abstract class CampaignPlanningConversionAttribution implements Built<CampaignPlanningConversionAttribution, CampaignPlanningConversionAttributionBuilder> {
  /// Number of days to use as the conversion attribution window for a pin click action.
  @BuiltValueField(wireName: r'click_window_days')
  CampaignPlanningConversionAttributionWindowDays? get clickWindowDays;
  // enum clickWindowDaysEnum {  DAYS_0,  DAYS_1,  DAYS_7,  DAYS_30,  DAYS_60,  };

  /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes.
  @BuiltValueField(wireName: r'engagement_window_days')
  CampaignPlanningConversionAttributionWindowDays? get engagementWindowDays;
  // enum engagementWindowDaysEnum {  DAYS_0,  DAYS_1,  DAYS_7,  DAYS_30,  DAYS_60,  };

  /// Number of days to use as the conversion attribution window for a view action.
  @BuiltValueField(wireName: r'view_window_days')
  CampaignPlanningConversionAttributionWindowDays? get viewWindowDays;
  // enum viewWindowDaysEnum {  DAYS_0,  DAYS_1,  DAYS_7,  DAYS_30,  DAYS_60,  };

  CampaignPlanningConversionAttribution._();

  factory CampaignPlanningConversionAttribution([void updates(CampaignPlanningConversionAttributionBuilder b)]) = _$CampaignPlanningConversionAttribution;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignPlanningConversionAttributionBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignPlanningConversionAttribution> get serializer => _$CampaignPlanningConversionAttributionSerializer();
}

class _$CampaignPlanningConversionAttributionSerializer implements PrimitiveSerializer<CampaignPlanningConversionAttribution> {
  @override
  final Iterable<Type> types = const [CampaignPlanningConversionAttribution, _$CampaignPlanningConversionAttribution];

  @override
  final String wireName = r'CampaignPlanningConversionAttribution';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignPlanningConversionAttribution object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(CampaignPlanningConversionAttributionWindowDays),
      );
    }
    if (object.engagementWindowDays != null) {
      yield r'engagement_window_days';
      yield serializers.serialize(
        object.engagementWindowDays,
        specifiedType: const FullType(CampaignPlanningConversionAttributionWindowDays),
      );
    }
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(CampaignPlanningConversionAttributionWindowDays),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignPlanningConversionAttribution object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignPlanningConversionAttributionBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningConversionAttributionWindowDays),
          ) as CampaignPlanningConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.clickWindowDays = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningConversionAttributionWindowDays),
          ) as CampaignPlanningConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.engagementWindowDays = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignPlanningConversionAttributionWindowDays),
          ) as CampaignPlanningConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.viewWindowDays = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignPlanningConversionAttribution deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignPlanningConversionAttributionBuilder();
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

