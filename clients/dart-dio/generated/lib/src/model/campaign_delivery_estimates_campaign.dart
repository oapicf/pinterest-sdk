//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/budget_duration_type.dart';
import 'package:openapi/src/model/ad_group_delivery_estimates.dart';
import 'package:openapi/src/model/delivery_estimate_objective_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_delivery_estimates_campaign.g.dart';

/// Campaign configuration for delivery estimates.
///
/// Properties:
/// * [adGroups] 
/// * [budgetDurationType] - Duration type of the budget
/// * [dailySpendCap] - Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
/// * [endDate] - End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
/// * [lifetimeSpendCap] - Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
/// * [objectiveType] 
/// * [startDate] - Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
@BuiltValue()
abstract class CampaignDeliveryEstimatesCampaign implements Built<CampaignDeliveryEstimatesCampaign, CampaignDeliveryEstimatesCampaignBuilder> {
  @BuiltValueField(wireName: r'ad_groups')
  BuiltList<AdGroupDeliveryEstimates> get adGroups;

  /// Duration type of the budget
  @BuiltValueField(wireName: r'budget_duration_type')
  BudgetDurationType get budgetDurationType;
  // enum budgetDurationTypeEnum {  FIXED_DAILY,  FLEXIBLE_DAILY,  LIFETIME,  };

  /// Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
  @BuiltValueField(wireName: r'daily_spend_cap')
  int? get dailySpendCap;

  /// End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
  @BuiltValueField(wireName: r'end_date')
  String? get endDate;

  /// Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
  @BuiltValueField(wireName: r'lifetime_spend_cap')
  int? get lifetimeSpendCap;

  @BuiltValueField(wireName: r'objective_type')
  DeliveryEstimateObjectiveType get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  CATALOG_SALES,  WEB_CONVERSION,  };

  /// Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  CampaignDeliveryEstimatesCampaign._();

  factory CampaignDeliveryEstimatesCampaign([void updates(CampaignDeliveryEstimatesCampaignBuilder b)]) = _$CampaignDeliveryEstimatesCampaign;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignDeliveryEstimatesCampaignBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignDeliveryEstimatesCampaign> get serializer => _$CampaignDeliveryEstimatesCampaignSerializer();
}

class _$CampaignDeliveryEstimatesCampaignSerializer implements PrimitiveSerializer<CampaignDeliveryEstimatesCampaign> {
  @override
  final Iterable<Type> types = const [CampaignDeliveryEstimatesCampaign, _$CampaignDeliveryEstimatesCampaign];

  @override
  final String wireName = r'CampaignDeliveryEstimatesCampaign';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignDeliveryEstimatesCampaign object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'ad_groups';
    yield serializers.serialize(
      object.adGroups,
      specifiedType: const FullType(BuiltList, [FullType(AdGroupDeliveryEstimates)]),
    );
    yield r'budget_duration_type';
    yield serializers.serialize(
      object.budgetDurationType,
      specifiedType: const FullType(BudgetDurationType),
    );
    if (object.dailySpendCap != null) {
      yield r'daily_spend_cap';
      yield serializers.serialize(
        object.dailySpendCap,
        specifiedType: const FullType(int),
      );
    }
    if (object.endDate != null) {
      yield r'end_date';
      yield serializers.serialize(
        object.endDate,
        specifiedType: const FullType(String),
      );
    }
    if (object.lifetimeSpendCap != null) {
      yield r'lifetime_spend_cap';
      yield serializers.serialize(
        object.lifetimeSpendCap,
        specifiedType: const FullType(int),
      );
    }
    yield r'objective_type';
    yield serializers.serialize(
      object.objectiveType,
      specifiedType: const FullType(DeliveryEstimateObjectiveType),
    );
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignDeliveryEstimatesCampaign object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignDeliveryEstimatesCampaignBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdGroupDeliveryEstimates)]),
          ) as BuiltList<AdGroupDeliveryEstimates>;
          result.adGroups.replace(valueDes);
          break;
        case r'budget_duration_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BudgetDurationType),
          ) as BudgetDurationType;
          result.budgetDurationType = valueDes;
          break;
        case r'daily_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.dailySpendCap = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.endDate = valueDes;
          break;
        case r'lifetime_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeSpendCap = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DeliveryEstimateObjectiveType),
          ) as DeliveryEstimateObjectiveType;
          result.objectiveType = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignDeliveryEstimatesCampaign deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignDeliveryEstimatesCampaignBuilder();
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

