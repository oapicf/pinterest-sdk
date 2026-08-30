//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/budget_type.dart';
import 'package:openapi/src/model/performance_plus_campaign_settings.dart';
import 'package:openapi/src/model/promotion_application_level.dart';
import 'package:openapi/src/model/pacing_delivery_type.dart';
import 'package:openapi/src/model/placement_traffic_type.dart';
import 'package:openapi/src/model/bid_strategy_type.dart';
import 'package:openapi/src/model/adgroup_tracking_features.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/ad_group_tracking_urls.dart';
import 'package:openapi/src/model/targeting_spec_optimal.dart';
import 'package:openapi/src/model/action_type.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:openapi/src/model/targeting_spec_operations.dart';
import 'package:openapi/src/model/nullable_optimization_goal_metadata.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_update_batch_update.g.dart';

/// AdGroupUpdateBatchUpdate
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
/// * [bidInMicroCurrency] - Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
/// * [bidMultiplier] - [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
/// * [bidStrategyType] 
/// * [billableEvent] 
/// * [budgetInMicroCurrency] - Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
/// * [budgetType] 
/// * [campaignId] - Campaign ID of the ad group.
/// * [customerSegmentId] - Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
/// * [endTime] - Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
/// * [extFeatures] 
/// * [feedProfileId] - Feed Profile ID associated to the adgroup.
/// * [id] - Ad group ID.
/// * [isCreativeOptimization] - Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
/// * [isLocalInventory] - Indicates whether the ad group should use the local inventory.
/// * [lifetimeFrequencyCap] - Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
/// * [localInventoryRadiusInMiles] - The targeting radius of the local inventory ads in miles.
/// * [name] - Ad group name.
/// * [optimizationGoalMetadata] - Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
/// * [pacingDeliveryType] 
/// * [performancePlusCampaignSettings] - Pinterest Performance+ campaign settings.
/// * [placementGroup] - [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
/// * [placementTrafficType] - A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
/// * [promotionApplicationLevel] - Specify if the promotion is applied at ad group or item level
/// * [promotionId] - Promotion ID. To clear this field, set to null.
/// * [promotionIds] - Promotion IDs list. To clear this field, set to an empty array [].
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
/// * [status] - Ad group/entity status.
/// * [targetingSpec] 
/// * [targetingSpecOperations] 
/// * [targetingTemplateIds] - Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
/// * [trackingUrls] 
@BuiltValue()
abstract class AdGroupUpdateBatchUpdate implements Built<AdGroupUpdateBatchUpdate, AdGroupUpdateBatchUpdateBuilder> {
  /// Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  @BuiltValueField(wireName: r'bid_in_micro_currency')
  int? get bidInMicroCurrency;

  /// [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
  @BuiltValueField(wireName: r'bid_multiplier')
  num? get bidMultiplier;

  @BuiltValueField(wireName: r'bid_strategy_type')
  BidStrategyType? get bidStrategyType;
  // enum bidStrategyTypeEnum {  AUTOMATIC_BID,  MAX_BID,  TARGET_AVG,  ,  };

  @BuiltValueField(wireName: r'billable_event')
  ActionType? get billableEvent;
  // enum billableEventEnum {  CLICKTHROUGH,  IMPRESSION,  VIDEO_V_50_MRC,  };

  /// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  @BuiltValueField(wireName: r'budget_in_micro_currency')
  int? get budgetInMicroCurrency;

  @BuiltValueField(wireName: r'budget_type')
  BudgetType? get budgetType;
  // enum budgetTypeEnum {  DAILY,  LIFETIME,  CBO_ADGROUP,  };

  /// Campaign ID of the ad group.
  @BuiltValueField(wireName: r'campaign_id')
  String? get campaignId;

  /// Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
  @BuiltValueField(wireName: r'customer_segment_id')
  String? get customerSegmentId;

  /// Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  @BuiltValueField(wireName: r'ext_features')
  AdgroupTrackingFeatures? get extFeatures;

  /// Feed Profile ID associated to the adgroup.
  @BuiltValueField(wireName: r'feed_profile_id')
  String? get feedProfileId;

  /// Ad group ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  /// Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  @BuiltValueField(wireName: r'is_creative_optimization')
  bool? get isCreativeOptimization;

  /// Indicates whether the ad group should use the local inventory.
  @BuiltValueField(wireName: r'is_local_inventory')
  bool? get isLocalInventory;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
  @BuiltValueField(wireName: r'lifetime_frequency_cap')
  int? get lifetimeFrequencyCap;

  /// The targeting radius of the local inventory ads in miles.
  @BuiltValueField(wireName: r'local_inventory_radius_in_miles')
  num? get localInventoryRadiusInMiles;

  /// Ad group name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  @BuiltValueField(wireName: r'optimization_goal_metadata')
  NullableOptimizationGoalMetadata? get optimizationGoalMetadata;

  @BuiltValueField(wireName: r'pacing_delivery_type')
  PacingDeliveryType? get pacingDeliveryType;
  // enum pacingDeliveryTypeEnum {  STANDARD,  ACCELERATED,  };

  /// Pinterest Performance+ campaign settings.
  @BuiltValueField(wireName: r'performance_plus_campaign_settings')
  PerformancePlusCampaignSettings? get performancePlusCampaignSettings;

  /// [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  @BuiltValueField(wireName: r'placement_traffic_type')
  PlacementTrafficType? get placementTrafficType;
  // enum placementTrafficTypeEnum {  ALL,  TWO_COLUMN_FEED,  FULLSCREEN_FEED,  ,  };

  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueField(wireName: r'promotion_application_level')
  PromotionApplicationLevel? get promotionApplicationLevel;
  // enum promotionApplicationLevelEnum {  NONE,  ITEM,  AD_GROUP,  ,  };

  /// Promotion ID. To clear this field, set to null.
  @BuiltValueField(wireName: r'promotion_id')
  String? get promotionId;

  /// Promotion IDs list. To clear this field, set to an empty array [].
  @BuiltValueField(wireName: r'promotion_ids')
  BuiltList<String>? get promotionIds;

  /// Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  /// Ad group/entity status.
  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpecOptimal? get targetingSpec;

  @BuiltValueField(wireName: r'targeting_spec_operations')
  BuiltList<TargetingSpecOperations>? get targetingSpecOperations;

  /// Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  @BuiltValueField(wireName: r'targeting_template_ids')
  BuiltList<String>? get targetingTemplateIds;

  @BuiltValueField(wireName: r'tracking_urls')
  AdGroupTrackingURLs? get trackingUrls;

  AdGroupUpdateBatchUpdate._();

  factory AdGroupUpdateBatchUpdate([void updates(AdGroupUpdateBatchUpdateBuilder b)]) = _$AdGroupUpdateBatchUpdate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupUpdateBatchUpdateBuilder b) => b
      ..promotionId = '0';

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupUpdateBatchUpdate> get serializer => _$AdGroupUpdateBatchUpdateSerializer();
}

class _$AdGroupUpdateBatchUpdateSerializer implements PrimitiveSerializer<AdGroupUpdateBatchUpdate> {
  @override
  final Iterable<Type> types = const [AdGroupUpdateBatchUpdate, _$AdGroupUpdateBatchUpdate];

  @override
  final String wireName = r'AdGroupUpdateBatchUpdate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupUpdateBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.bidInMicroCurrency != null) {
      yield r'bid_in_micro_currency';
      yield serializers.serialize(
        object.bidInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.bidMultiplier != null) {
      yield r'bid_multiplier';
      yield serializers.serialize(
        object.bidMultiplier,
        specifiedType: const FullType(num),
      );
    }
    if (object.bidStrategyType != null) {
      yield r'bid_strategy_type';
      yield serializers.serialize(
        object.bidStrategyType,
        specifiedType: const FullType.nullable(BidStrategyType),
      );
    }
    if (object.billableEvent != null) {
      yield r'billable_event';
      yield serializers.serialize(
        object.billableEvent,
        specifiedType: const FullType(ActionType),
      );
    }
    if (object.budgetInMicroCurrency != null) {
      yield r'budget_in_micro_currency';
      yield serializers.serialize(
        object.budgetInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.budgetType != null) {
      yield r'budget_type';
      yield serializers.serialize(
        object.budgetType,
        specifiedType: const FullType(BudgetType),
      );
    }
    if (object.campaignId != null) {
      yield r'campaign_id';
      yield serializers.serialize(
        object.campaignId,
        specifiedType: const FullType(String),
      );
    }
    if (object.customerSegmentId != null) {
      yield r'customer_segment_id';
      yield serializers.serialize(
        object.customerSegmentId,
        specifiedType: const FullType(String),
      );
    }
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.extFeatures != null) {
      yield r'ext_features';
      yield serializers.serialize(
        object.extFeatures,
        specifiedType: const FullType.nullable(AdgroupTrackingFeatures),
      );
    }
    if (object.feedProfileId != null) {
      yield r'feed_profile_id';
      yield serializers.serialize(
        object.feedProfileId,
        specifiedType: const FullType(String),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.isCreativeOptimization != null) {
      yield r'is_creative_optimization';
      yield serializers.serialize(
        object.isCreativeOptimization,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isLocalInventory != null) {
      yield r'is_local_inventory';
      yield serializers.serialize(
        object.isLocalInventory,
        specifiedType: const FullType(bool),
      );
    }
    if (object.lifetimeFrequencyCap != null) {
      yield r'lifetime_frequency_cap';
      yield serializers.serialize(
        object.lifetimeFrequencyCap,
        specifiedType: const FullType(int),
      );
    }
    if (object.localInventoryRadiusInMiles != null) {
      yield r'local_inventory_radius_in_miles';
      yield serializers.serialize(
        object.localInventoryRadiusInMiles,
        specifiedType: const FullType(num),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.optimizationGoalMetadata != null) {
      yield r'optimization_goal_metadata';
      yield serializers.serialize(
        object.optimizationGoalMetadata,
        specifiedType: const FullType.nullable(NullableOptimizationGoalMetadata),
      );
    }
    if (object.pacingDeliveryType != null) {
      yield r'pacing_delivery_type';
      yield serializers.serialize(
        object.pacingDeliveryType,
        specifiedType: const FullType(PacingDeliveryType),
      );
    }
    if (object.performancePlusCampaignSettings != null) {
      yield r'performance_plus_campaign_settings';
      yield serializers.serialize(
        object.performancePlusCampaignSettings,
        specifiedType: const FullType.nullable(PerformancePlusCampaignSettings),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.placementTrafficType != null) {
      yield r'placement_traffic_type';
      yield serializers.serialize(
        object.placementTrafficType,
        specifiedType: const FullType.nullable(PlacementTrafficType),
      );
    }
    if (object.promotionApplicationLevel != null) {
      yield r'promotion_application_level';
      yield serializers.serialize(
        object.promotionApplicationLevel,
        specifiedType: const FullType.nullable(PromotionApplicationLevel),
      );
    }
    if (object.promotionId != null) {
      yield r'promotion_id';
      yield serializers.serialize(
        object.promotionId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.promotionIds != null) {
      yield r'promotion_ids';
      yield serializers.serialize(
        object.promotionIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
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
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpecOptimal),
      );
    }
    if (object.targetingSpecOperations != null) {
      yield r'targeting_spec_operations';
      yield serializers.serialize(
        object.targetingSpecOperations,
        specifiedType: const FullType(BuiltList, [FullType(TargetingSpecOperations)]),
      );
    }
    if (object.targetingTemplateIds != null) {
      yield r'targeting_template_ids';
      yield serializers.serialize(
        object.targetingTemplateIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(AdGroupTrackingURLs),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupUpdateBatchUpdate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupUpdateBatchUpdateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'bid_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.bidInMicroCurrency = valueDes;
          break;
        case r'bid_multiplier':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.bidMultiplier = valueDes;
          break;
        case r'bid_strategy_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BidStrategyType),
          ) as BidStrategyType?;
          if (valueDes == null) continue;
          result.bidStrategyType = valueDes;
          break;
        case r'billable_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ActionType),
          ) as ActionType?;
          if (valueDes == null) continue;
          result.billableEvent = valueDes;
          break;
        case r'budget_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.budgetInMicroCurrency = valueDes;
          break;
        case r'budget_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BudgetType),
          ) as BudgetType?;
          if (valueDes == null) continue;
          result.budgetType = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.campaignId = valueDes;
          break;
        case r'customer_segment_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.customerSegmentId = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'ext_features':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdgroupTrackingFeatures),
          ) as AdgroupTrackingFeatures?;
          if (valueDes == null) continue;
          result.extFeatures.replace(valueDes);
          break;
        case r'feed_profile_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.feedProfileId = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'is_creative_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCreativeOptimization = valueDes;
          break;
        case r'is_local_inventory':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isLocalInventory = valueDes;
          break;
        case r'lifetime_frequency_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeFrequencyCap = valueDes;
          break;
        case r'local_inventory_radius_in_miles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.localInventoryRadiusInMiles = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'optimization_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(NullableOptimizationGoalMetadata),
          ) as NullableOptimizationGoalMetadata?;
          if (valueDes == null) continue;
          result.optimizationGoalMetadata.replace(valueDes);
          break;
        case r'pacing_delivery_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PacingDeliveryType),
          ) as PacingDeliveryType?;
          if (valueDes == null) continue;
          result.pacingDeliveryType = valueDes;
          break;
        case r'performance_plus_campaign_settings':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PerformancePlusCampaignSettings),
          ) as PerformancePlusCampaignSettings?;
          if (valueDes == null) continue;
          result.performancePlusCampaignSettings.replace(valueDes);
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementGroupType),
          ) as PlacementGroupType?;
          if (valueDes == null) continue;
          result.placementGroup = valueDes;
          break;
        case r'placement_traffic_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PlacementTrafficType),
          ) as PlacementTrafficType?;
          if (valueDes == null) continue;
          result.placementTrafficType = valueDes;
          break;
        case r'promotion_application_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PromotionApplicationLevel),
          ) as PromotionApplicationLevel?;
          if (valueDes == null) continue;
          result.promotionApplicationLevel = valueDes;
          break;
        case r'promotion_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.promotionId = valueDes;
          break;
        case r'promotion_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.promotionIds.replace(valueDes);
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
        case r'targeting_spec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TargetingSpecOptimal),
          ) as TargetingSpecOptimal?;
          if (valueDes == null) continue;
          result.targetingSpec.replace(valueDes);
          break;
        case r'targeting_spec_operations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(TargetingSpecOperations)]),
          ) as BuiltList<TargetingSpecOperations>?;
          if (valueDes == null) continue;
          result.targetingSpecOperations.replace(valueDes);
          break;
        case r'targeting_template_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.targetingTemplateIds.replace(valueDes);
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroupTrackingURLs),
          ) as AdGroupTrackingURLs?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupUpdateBatchUpdate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupUpdateBatchUpdateBuilder();
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

