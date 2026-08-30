//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/nullable_entity_status.dart';
import 'package:openapi/src/model/campaign_bid_options.dart';
import 'package:openapi/src/model/campaign_objective_type.dart';
import 'package:openapi/src/model/performance_plus_campaign_settings.dart';
import 'package:openapi/src/model/summary_status.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:openapi/src/model/intended_promotion_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_batch_response_data.g.dart';

/// Campaign data in batch response, with all fields optional to support error cases where data may be empty.
///
/// Properties:
/// * [adAccountId] - Campaign's Advertiser ID.
/// * [bidOptions] - [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
/// * [createdTime] - Campaign creation time. Unix timestamp in seconds.
/// * [dailySpendCap] - Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
/// * [defaultAdGroupBudgetInMicroCurrency] - When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
/// * [endTime] - Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [id] - Campaign ID.
/// * [intendedPromotionType] 
/// * [isAutomatedCampaign] - Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
/// * [isCampaignBudgetOptimization] - Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
/// * [isCarting] - Whether the campaign contains a carting(where-to-buy link) ad.
/// * [isFlexibleDailyBudgets] - Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
/// * [isLtvOptimized] - Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
/// * [isPerformancePlus] - Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
/// * [isTopOfSearch] - Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
/// * [lifetimeSpendCap] - Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
/// * [name] - Campaign name - 255 chars max.
/// * [objectiveType] 
/// * [orderLineId] - Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
/// * [performancePlusCampaignSettings] - Pinterest Performance+ campaign settings.
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [status] 
/// * [summaryStatus] 
/// * [trackingUrls] 
/// * [type] - Always \"campaign\".
/// * [updatedTime] - UTC timestamp. Last update time.
@BuiltValue()
abstract class CampaignBatchResponseData implements Built<CampaignBatchResponseData, CampaignBatchResponseDataBuilder> {
  /// Campaign's Advertiser ID.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
  @BuiltValueField(wireName: r'bid_options')
  CampaignBidOptions? get bidOptions;

  /// Campaign creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  @BuiltValueField(wireName: r'daily_spend_cap')
  int? get dailySpendCap;

  /// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  @BuiltValueField(wireName: r'default_ad_group_budget_in_micro_currency')
  int? get defaultAdGroupBudgetInMicroCurrency;

  /// Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Campaign ID.
  @BuiltValueField(wireName: r'id')
  String? get id;

  @BuiltValueField(wireName: r'intended_promotion_type')
  IntendedPromotionType? get intendedPromotionType;
  // enum intendedPromotionTypeEnum {  LEGACY,  STANDARD_AD,  CATALOG,  };

  /// Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
  @BuiltValueField(wireName: r'is_automated_campaign')
  bool? get isAutomatedCampaign;

  /// Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  @BuiltValueField(wireName: r'is_campaign_budget_optimization')
  bool? get isCampaignBudgetOptimization;

  /// Whether the campaign contains a carting(where-to-buy link) ad.
  @BuiltValueField(wireName: r'is_carting')
  bool? get isCarting;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  @BuiltValueField(wireName: r'is_flexible_daily_budgets')
  bool? get isFlexibleDailyBudgets;

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  @BuiltValueField(wireName: r'is_ltv_optimized')
  bool? get isLtvOptimized;

  /// Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
  @BuiltValueField(wireName: r'is_performance_plus')
  bool? get isPerformancePlus;

  /// Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
  @BuiltValueField(wireName: r'is_top_of_search')
  bool? get isTopOfSearch;

  /// Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  @BuiltValueField(wireName: r'lifetime_spend_cap')
  int? get lifetimeSpendCap;

  /// Campaign name - 255 chars max.
  @BuiltValueField(wireName: r'name')
  String? get name;

  @BuiltValueField(wireName: r'objective_type')
  CampaignObjectiveType? get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  VIDEO_VIEW,  WEB_CONVERSION,  CATALOG_SALES,  WEB_SESSIONS,  VIDEO_COMPLETION,  APP_INSTALL,  SALES,  LEADS,  CTV_CONSIDERATION,  };

  /// Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
  @BuiltValueField(wireName: r'order_line_id')
  String? get orderLineId;

  /// Pinterest Performance+ campaign settings.
  @BuiltValueField(wireName: r'performance_plus_campaign_settings')
  PerformancePlusCampaignSettings? get performancePlusCampaignSettings;

  /// Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  @BuiltValueField(wireName: r'status')
  NullableEntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  ,  };

  @BuiltValueField(wireName: r'summary_status')
  SummaryStatus? get summaryStatus;
  // enum summaryStatusEnum {  RUNNING,  PAUSED,  NOT_STARTED,  COMPLETED,  ADVERTISER_DISABLED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  /// Always \"campaign\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// UTC timestamp. Last update time.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  CampaignBatchResponseData._();

  factory CampaignBatchResponseData([void updates(CampaignBatchResponseDataBuilder b)]) = _$CampaignBatchResponseData;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignBatchResponseDataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignBatchResponseData> get serializer => _$CampaignBatchResponseDataSerializer();
}

class _$CampaignBatchResponseDataSerializer implements PrimitiveSerializer<CampaignBatchResponseData> {
  @override
  final Iterable<Type> types = const [CampaignBatchResponseData, _$CampaignBatchResponseData];

  @override
  final String wireName = r'CampaignBatchResponseData';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignBatchResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.bidOptions != null) {
      yield r'bid_options';
      yield serializers.serialize(
        object.bidOptions,
        specifiedType: const FullType.nullable(CampaignBidOptions),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.dailySpendCap != null) {
      yield r'daily_spend_cap';
      yield serializers.serialize(
        object.dailySpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.defaultAdGroupBudgetInMicroCurrency != null) {
      yield r'default_ad_group_budget_in_micro_currency';
      yield serializers.serialize(
        object.defaultAdGroupBudgetInMicroCurrency,
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
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
        specifiedType: const FullType(String),
      );
    }
    if (object.intendedPromotionType != null) {
      yield r'intended_promotion_type';
      yield serializers.serialize(
        object.intendedPromotionType,
        specifiedType: const FullType(IntendedPromotionType),
      );
    }
    if (object.isAutomatedCampaign != null) {
      yield r'is_automated_campaign';
      yield serializers.serialize(
        object.isAutomatedCampaign,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isCampaignBudgetOptimization != null) {
      yield r'is_campaign_budget_optimization';
      yield serializers.serialize(
        object.isCampaignBudgetOptimization,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isCarting != null) {
      yield r'is_carting';
      yield serializers.serialize(
        object.isCarting,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isFlexibleDailyBudgets != null) {
      yield r'is_flexible_daily_budgets';
      yield serializers.serialize(
        object.isFlexibleDailyBudgets,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isLtvOptimized != null) {
      yield r'is_ltv_optimized';
      yield serializers.serialize(
        object.isLtvOptimized,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isPerformancePlus != null) {
      yield r'is_performance_plus';
      yield serializers.serialize(
        object.isPerformancePlus,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isTopOfSearch != null) {
      yield r'is_top_of_search';
      yield serializers.serialize(
        object.isTopOfSearch,
        specifiedType: const FullType(bool),
      );
    }
    if (object.lifetimeSpendCap != null) {
      yield r'lifetime_spend_cap';
      yield serializers.serialize(
        object.lifetimeSpendCap,
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
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType(CampaignObjectiveType),
      );
    }
    if (object.orderLineId != null) {
      yield r'order_line_id';
      yield serializers.serialize(
        object.orderLineId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.performancePlusCampaignSettings != null) {
      yield r'performance_plus_campaign_settings';
      yield serializers.serialize(
        object.performancePlusCampaignSettings,
        specifiedType: const FullType.nullable(PerformancePlusCampaignSettings),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType.nullable(NullableEntityStatus),
      );
    }
    if (object.summaryStatus != null) {
      yield r'summary_status';
      yield serializers.serialize(
        object.summaryStatus,
        specifiedType: const FullType(SummaryStatus),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignBatchResponseData object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignBatchResponseDataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBidOptions),
          ) as CampaignBidOptions?;
          if (valueDes == null) continue;
          result.bidOptions.replace(valueDes);
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'daily_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.dailySpendCap = valueDes;
          break;
        case r'default_ad_group_budget_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.defaultAdGroupBudgetInMicroCurrency = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.id = valueDes;
          break;
        case r'intended_promotion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IntendedPromotionType),
          ) as IntendedPromotionType?;
          if (valueDes == null) continue;
          result.intendedPromotionType = valueDes;
          break;
        case r'is_automated_campaign':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAutomatedCampaign = valueDes;
          break;
        case r'is_campaign_budget_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCampaignBudgetOptimization = valueDes;
          break;
        case r'is_carting':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCarting = valueDes;
          break;
        case r'is_flexible_daily_budgets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFlexibleDailyBudgets = valueDes;
          break;
        case r'is_ltv_optimized':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isLtvOptimized = valueDes;
          break;
        case r'is_performance_plus':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isPerformancePlus = valueDes;
          break;
        case r'is_top_of_search':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isTopOfSearch = valueDes;
          break;
        case r'lifetime_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeSpendCap = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignObjectiveType),
          ) as CampaignObjectiveType?;
          if (valueDes == null) continue;
          result.objectiveType = valueDes;
          break;
        case r'order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderLineId = valueDes;
          break;
        case r'performance_plus_campaign_settings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PerformancePlusCampaignSettings),
          ) as PerformancePlusCampaignSettings?;
          if (valueDes == null) continue;
          result.performancePlusCampaignSettings.replace(valueDes);
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startTime = valueDes;
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableEntityStatus),
          ) as NullableEntityStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'summary_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(SummaryStatus),
          ) as SummaryStatus?;
          if (valueDes == null) continue;
          result.summaryStatus = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignBatchResponseData deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignBatchResponseDataBuilder();
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

