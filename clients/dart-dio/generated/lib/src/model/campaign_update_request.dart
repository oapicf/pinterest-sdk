//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/objective_type.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/intended_promotion_type.dart';
import 'package:openapi/src/model/campaign_bid_options_update.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_update_request.g.dart';

/// CampaignUpdateRequest
///
/// Properties:
/// * [bidOptions] 
/// * [intendedPromotionType] 
/// * [isLtvOptimized] - Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
/// * [isPerformancePlus] - Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
/// * [isTopOfSearch] - Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
/// * [objectiveType] 
/// * [adAccountId] - Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
/// * [dailySpendCap] - Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
/// * [defaultAdGroupBudgetInMicroCurrency] - When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
/// * [endTime] - Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [id] - Campaign ID.
/// * [isAutomatedCampaign] - Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
/// * [isCampaignBudgetOptimization] - Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
/// * [isFlexibleDailyBudgets] - Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
/// * [lifetimeSpendCap] - Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
/// * [name] - Campaign name.
/// * [orderLineId] - Order line ID that appears on the invoice.
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [status] 
/// * [trackingUrls] 
@BuiltValue()
abstract class CampaignUpdateRequest implements Built<CampaignUpdateRequest, CampaignUpdateRequestBuilder> {
  @BuiltValueField(wireName: r'bid_options')
  CampaignBidOptionsUpdate? get bidOptions;

  @BuiltValueField(wireName: r'intended_promotion_type')
  IntendedPromotionType? get intendedPromotionType;
  // enum intendedPromotionTypeEnum {  LEGACY,  STANDARD_AD,  CATALOG,  };

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  @BuiltValueField(wireName: r'is_ltv_optimized')
  bool? get isLtvOptimized;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
  @BuiltValueField(wireName: r'is_performance_plus')
  bool? get isPerformancePlus;

  /// Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
  @BuiltValueField(wireName: r'is_top_of_search')
  bool? get isTopOfSearch;

  @BuiltValueField(wireName: r'objective_type')
  ObjectiveType? get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  WEB_CONVERSION,  CATALOG_SALES,  VIDEO_COMPLETION,  SALES,  APP_INSTALL,  CTV_CONSIDERATION,  };

  /// Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  @BuiltValueField(wireName: r'ad_account_id')
  String get adAccountId;

  /// Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  @BuiltValueField(wireName: r'daily_spend_cap')
  int? get dailySpendCap;

  /// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  @BuiltValueField(wireName: r'default_ad_group_budget_in_micro_currency')
  int? get defaultAdGroupBudgetInMicroCurrency;

  /// Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Campaign ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
  @BuiltValueField(wireName: r'is_automated_campaign')
  bool? get isAutomatedCampaign;

  /// Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  @BuiltValueField(wireName: r'is_campaign_budget_optimization')
  bool? get isCampaignBudgetOptimization;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  @BuiltValueField(wireName: r'is_flexible_daily_budgets')
  bool? get isFlexibleDailyBudgets;

  /// Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  @BuiltValueField(wireName: r'lifetime_spend_cap')
  int? get lifetimeSpendCap;

  /// Campaign name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Order line ID that appears on the invoice.
  @BuiltValueField(wireName: r'order_line_id')
  String? get orderLineId;

  /// Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'tracking_urls')
  JsonObject? get trackingUrls;

  CampaignUpdateRequest._();

  factory CampaignUpdateRequest([void updates(CampaignUpdateRequestBuilder b)]) = _$CampaignUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CampaignUpdateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignUpdateRequest> get serializer => _$CampaignUpdateRequestSerializer();
}

class _$CampaignUpdateRequestSerializer implements PrimitiveSerializer<CampaignUpdateRequest> {
  @override
  final Iterable<Type> types = const [CampaignUpdateRequest, _$CampaignUpdateRequest];

  @override
  final String wireName = r'CampaignUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.bidOptions != null) {
      yield r'bid_options';
      yield serializers.serialize(
        object.bidOptions,
        specifiedType: const FullType.nullable(CampaignBidOptionsUpdate),
      );
    }
    if (object.intendedPromotionType != null) {
      yield r'intended_promotion_type';
      yield serializers.serialize(
        object.intendedPromotionType,
        specifiedType: const FullType(IntendedPromotionType),
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
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType.nullable(ObjectiveType),
      );
    }
    yield r'ad_account_id';
    yield serializers.serialize(
      object.adAccountId,
      specifiedType: const FullType(String),
    );
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
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
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
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.orderLineId != null) {
      yield r'order_line_id';
      yield serializers.serialize(
        object.orderLineId,
        specifiedType: const FullType.nullable(String),
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
        specifiedType: const FullType(EntityStatus),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    CampaignUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBidOptionsUpdate),
          ) as CampaignBidOptionsUpdate?;
          if (valueDes == null) continue;
          result.bidOptions.replace(valueDes);
          break;
        case r'intended_promotion_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(IntendedPromotionType),
          ) as IntendedPromotionType?;
          if (valueDes == null) continue;
          result.intendedPromotionType = valueDes;
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
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ObjectiveType),
          ) as ObjectiveType?;
          if (valueDes == null) continue;
          result.objectiveType = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
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
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderLineId = valueDes;
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
            specifiedType: const FullType.nullable(EntityStatus),
          ) as EntityStatus?;
          if (valueDes == null) continue;
          result.status = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.trackingUrls = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CampaignUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CampaignUpdateRequestBuilder();
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

