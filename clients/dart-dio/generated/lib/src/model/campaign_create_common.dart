//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:openapi/src/model/campaign_common.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_create_common.g.dart';

/// CampaignCreateCommon
///
/// Properties:
/// * [adAccountId] - Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
/// * [dailySpendCap] - Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
/// * [endTime] - Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [isAutomatedCampaign] - Specifies whether the campaign was created in the automated campaign flow
/// * [isFlexibleDailyBudgets] - Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
/// * [lifetimeSpendCap] - Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
/// * [name] - Campaign name.
/// * [orderLineId] - Order line ID that appears on the invoice.
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [status] 
/// * [trackingUrls] 
/// * [defaultAdGroupBudgetInMicroCurrency] - When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
/// * [isCampaignBudgetOptimization] - Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
@BuiltValue(instantiable: false)
abstract class CampaignCreateCommon implements CampaignCommon {
  /// Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  @BuiltValueField(wireName: r'is_campaign_budget_optimization')
  bool? get isCampaignBudgetOptimization;

  /// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  @BuiltValueField(wireName: r'default_ad_group_budget_in_micro_currency')
  int? get defaultAdGroupBudgetInMicroCurrency;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignCreateCommon> get serializer => _$CampaignCreateCommonSerializer();
}

class _$CampaignCreateCommonSerializer implements PrimitiveSerializer<CampaignCreateCommon> {
  @override
  final Iterable<Type> types = const [CampaignCreateCommon];

  @override
  final String wireName = r'CampaignCreateCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignCreateCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.isFlexibleDailyBudgets != null) {
      yield r'is_flexible_daily_budgets';
      yield serializers.serialize(
        object.isFlexibleDailyBudgets,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.lifetimeSpendCap != null) {
      yield r'lifetime_spend_cap';
      yield serializers.serialize(
        object.lifetimeSpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isAutomatedCampaign != null) {
      yield r'is_automated_campaign';
      yield serializers.serialize(
        object.isAutomatedCampaign,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.defaultAdGroupBudgetInMicroCurrency != null) {
      yield r'default_ad_group_budget_in_micro_currency';
      yield serializers.serialize(
        object.defaultAdGroupBudgetInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.dailySpendCap != null) {
      yield r'daily_spend_cap';
      yield serializers.serialize(
        object.dailySpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.orderLineId != null) {
      yield r'order_line_id';
      yield serializers.serialize(
        object.orderLineId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.isCampaignBudgetOptimization != null) {
      yield r'is_campaign_budget_optimization';
      yield serializers.serialize(
        object.isCampaignBudgetOptimization,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignCreateCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignCreateCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignCreateCommon)) as $CampaignCreateCommon;
  }
}

/// a concrete implementation of [CampaignCreateCommon], since [CampaignCreateCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignCreateCommon implements CampaignCreateCommon, Built<$CampaignCreateCommon, $CampaignCreateCommonBuilder> {
  $CampaignCreateCommon._();

  factory $CampaignCreateCommon([void Function($CampaignCreateCommonBuilder)? updates]) = _$$CampaignCreateCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignCreateCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignCreateCommon> get serializer => _$$CampaignCreateCommonSerializer();
}

class _$$CampaignCreateCommonSerializer implements PrimitiveSerializer<$CampaignCreateCommon> {
  @override
  final Iterable<Type> types = const [$CampaignCreateCommon, _$$CampaignCreateCommon];

  @override
  final String wireName = r'$CampaignCreateCommon';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignCreateCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignCreateCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignCreateCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'is_flexible_daily_budgets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFlexibleDailyBudgets = valueDes;
          break;
        case r'lifetime_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeSpendCap = valueDes;
          break;
        case r'is_automated_campaign':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAutomatedCampaign = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'default_ad_group_budget_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.defaultAdGroupBudgetInMicroCurrency = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startTime = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'daily_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.dailySpendCap = valueDes;
          break;
        case r'order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderLineId = valueDes;
          break;
        case r'is_campaign_budget_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCampaignBudgetOptimization = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  $CampaignCreateCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignCreateCommonBuilder();
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

