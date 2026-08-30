//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroup {
  /// Returns a new [AdGroup] instance.
  AdGroup({
    this.adAccountId,
    this.bidInMicroCurrency,
    this.bidStrategyType,
    required this.billableEvent,
    this.budgetInMicroCurrency,
    required this.campaignId,
    required this.conversionLearningModeType,
    required this.createdTime,
    this.customerSegmentId,
    this.dcaAssets,
    this.endTime,
    this.extFeatures,
    this.feedProfileId,
    required this.id,
    this.isCreativeOptimization,
    this.isLocalInventory,
    this.lifetimeFrequencyCap,
    this.localInventoryRadiusInMiles,
    required this.name,
    this.optimizationGoalMetadata,
    this.performancePlusCampaignSettings,
    this.placementGroup,
    this.placementTrafficType,
    this.promotionApplicationLevel,
    this.promotionId = '0',
    this.promotionIds = const [],
    this.startTime,
    this.status,
    required this.summaryStatus,
    this.targetingSpec,
    this.targetingTemplateIds = const [],
    this.trackingUrls,
    this.type = 'adgroup',
    required this.updatedTime,
    this.autoTargetingEnabled,
    this.bidMultiplier,
    this.budgetType,
    this.pacingDeliveryType,
  });

  /// Advertiser ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC.
  int? bidInMicroCurrency;

  BidStrategyType? bidStrategyType;

  ActionType billableEvent;

  /// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  int? budgetInMicroCurrency;

  /// Campaign ID of the ad group.
  String campaignId;

  /// oCPM learn mode
  ConversionLearningModeType? conversionLearningModeType;

  /// Ad group creation time. Unix timestamp in seconds.
  int createdTime;

  /// Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customerSegmentId;

  /// [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  Object? dcaAssets;

  /// Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO.
  int? endTime;

  AdgroupTrackingFeatures? extFeatures;

  /// Feed Profile ID associated to the adgroup.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? feedProfileId;

  /// Ad group ID.
  String id;

  /// Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  bool? isCreativeOptimization;

  /// Indicates whether the ad group should use the local inventory.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isLocalInventory;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifetimeFrequencyCap;

  /// The targeting radius of the local inventory ads in miles.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? localInventoryRadiusInMiles;

  /// Ad group name.
  String name;

  /// Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  NullableOptimizationGoalMetadata? optimizationGoalMetadata;

  /// Pinterest Performance+ campaign settings.
  PerformancePlusCampaignSettings? performancePlusCampaignSettings;

  /// [Placement group](https://help.pinterest.com/en/business/article/placement-groups).
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementGroupType? placementGroup;

  /// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both
  PlacementTrafficType? placementTrafficType;

  /// Specify if the promotion is applied at ad group or item level
  PromotionApplicationLevel? promotionApplicationLevel;

  /// Promotion ID. To clear this field, set to null.
  String? promotionId;

  /// Promotion IDs list. To clear this field, set to an empty array [].
  List<String> promotionIds;

  /// Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  int? startTime;

  /// Ad group/entity status.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  SummaryStatus summaryStatus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpecOptimal? targetingSpec;

  /// Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  List<String>? targetingTemplateIds;

  AdGroupTrackingURLs? trackingUrls;

  /// Always \"adgroup\".
  String type;

  /// Ad group last update time. Unix timestamp in seconds.
  int updatedTime;

  /// Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting).
  bool? autoTargetingEnabled;

  /// [Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns).
  ///
  /// Minimum value: 0
  /// Maximum value: 10
  num? bidMultiplier;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BudgetType? budgetType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PacingDeliveryType? pacingDeliveryType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroup &&
    other.adAccountId == adAccountId &&
    other.bidInMicroCurrency == bidInMicroCurrency &&
    other.bidStrategyType == bidStrategyType &&
    other.billableEvent == billableEvent &&
    other.budgetInMicroCurrency == budgetInMicroCurrency &&
    other.campaignId == campaignId &&
    other.conversionLearningModeType == conversionLearningModeType &&
    other.createdTime == createdTime &&
    other.customerSegmentId == customerSegmentId &&
    other.dcaAssets == dcaAssets &&
    other.endTime == endTime &&
    other.extFeatures == extFeatures &&
    other.feedProfileId == feedProfileId &&
    other.id == id &&
    other.isCreativeOptimization == isCreativeOptimization &&
    other.isLocalInventory == isLocalInventory &&
    other.lifetimeFrequencyCap == lifetimeFrequencyCap &&
    other.localInventoryRadiusInMiles == localInventoryRadiusInMiles &&
    other.name == name &&
    other.optimizationGoalMetadata == optimizationGoalMetadata &&
    other.performancePlusCampaignSettings == performancePlusCampaignSettings &&
    other.placementGroup == placementGroup &&
    other.placementTrafficType == placementTrafficType &&
    other.promotionApplicationLevel == promotionApplicationLevel &&
    other.promotionId == promotionId &&
    _deepEquality.equals(other.promotionIds, promotionIds) &&
    other.startTime == startTime &&
    other.status == status &&
    other.summaryStatus == summaryStatus &&
    other.targetingSpec == targetingSpec &&
    _deepEquality.equals(other.targetingTemplateIds, targetingTemplateIds) &&
    other.trackingUrls == trackingUrls &&
    other.type == type &&
    other.updatedTime == updatedTime &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    other.bidMultiplier == bidMultiplier &&
    other.budgetType == budgetType &&
    other.pacingDeliveryType == pacingDeliveryType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (bidInMicroCurrency == null ? 0 : bidInMicroCurrency!.hashCode) +
    (bidStrategyType == null ? 0 : bidStrategyType!.hashCode) +
    (billableEvent.hashCode) +
    (budgetInMicroCurrency == null ? 0 : budgetInMicroCurrency!.hashCode) +
    (campaignId.hashCode) +
    (conversionLearningModeType == null ? 0 : conversionLearningModeType!.hashCode) +
    (createdTime.hashCode) +
    (customerSegmentId == null ? 0 : customerSegmentId!.hashCode) +
    (dcaAssets == null ? 0 : dcaAssets!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (extFeatures == null ? 0 : extFeatures!.hashCode) +
    (feedProfileId == null ? 0 : feedProfileId!.hashCode) +
    (id.hashCode) +
    (isCreativeOptimization == null ? 0 : isCreativeOptimization!.hashCode) +
    (isLocalInventory == null ? 0 : isLocalInventory!.hashCode) +
    (lifetimeFrequencyCap == null ? 0 : lifetimeFrequencyCap!.hashCode) +
    (localInventoryRadiusInMiles == null ? 0 : localInventoryRadiusInMiles!.hashCode) +
    (name.hashCode) +
    (optimizationGoalMetadata == null ? 0 : optimizationGoalMetadata!.hashCode) +
    (performancePlusCampaignSettings == null ? 0 : performancePlusCampaignSettings!.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (placementTrafficType == null ? 0 : placementTrafficType!.hashCode) +
    (promotionApplicationLevel == null ? 0 : promotionApplicationLevel!.hashCode) +
    (promotionId == null ? 0 : promotionId!.hashCode) +
    (promotionIds.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (summaryStatus.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode) +
    (targetingTemplateIds == null ? 0 : targetingTemplateIds!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (type.hashCode) +
    (updatedTime.hashCode) +
    (autoTargetingEnabled == null ? 0 : autoTargetingEnabled!.hashCode) +
    (bidMultiplier == null ? 0 : bidMultiplier!.hashCode) +
    (budgetType == null ? 0 : budgetType!.hashCode) +
    (pacingDeliveryType == null ? 0 : pacingDeliveryType!.hashCode);

  @override
  String toString() => 'AdGroup[adAccountId=$adAccountId, bidInMicroCurrency=$bidInMicroCurrency, bidStrategyType=$bidStrategyType, billableEvent=$billableEvent, budgetInMicroCurrency=$budgetInMicroCurrency, campaignId=$campaignId, conversionLearningModeType=$conversionLearningModeType, createdTime=$createdTime, customerSegmentId=$customerSegmentId, dcaAssets=$dcaAssets, endTime=$endTime, extFeatures=$extFeatures, feedProfileId=$feedProfileId, id=$id, isCreativeOptimization=$isCreativeOptimization, isLocalInventory=$isLocalInventory, lifetimeFrequencyCap=$lifetimeFrequencyCap, localInventoryRadiusInMiles=$localInventoryRadiusInMiles, name=$name, optimizationGoalMetadata=$optimizationGoalMetadata, performancePlusCampaignSettings=$performancePlusCampaignSettings, placementGroup=$placementGroup, placementTrafficType=$placementTrafficType, promotionApplicationLevel=$promotionApplicationLevel, promotionId=$promotionId, promotionIds=$promotionIds, startTime=$startTime, status=$status, summaryStatus=$summaryStatus, targetingSpec=$targetingSpec, targetingTemplateIds=$targetingTemplateIds, trackingUrls=$trackingUrls, type=$type, updatedTime=$updatedTime, autoTargetingEnabled=$autoTargetingEnabled, bidMultiplier=$bidMultiplier, budgetType=$budgetType, pacingDeliveryType=$pacingDeliveryType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.bidInMicroCurrency != null) {
      json[r'bid_in_micro_currency'] = this.bidInMicroCurrency;
    } else {
      json[r'bid_in_micro_currency'] = null;
    }
    if (this.bidStrategyType != null) {
      json[r'bid_strategy_type'] = this.bidStrategyType;
    } else {
      json[r'bid_strategy_type'] = null;
    }
      json[r'billable_event'] = this.billableEvent;
    if (this.budgetInMicroCurrency != null) {
      json[r'budget_in_micro_currency'] = this.budgetInMicroCurrency;
    } else {
      json[r'budget_in_micro_currency'] = null;
    }
      json[r'campaign_id'] = this.campaignId;
    if (this.conversionLearningModeType != null) {
      json[r'conversion_learning_mode_type'] = this.conversionLearningModeType;
    } else {
      json[r'conversion_learning_mode_type'] = null;
    }
      json[r'created_time'] = this.createdTime;
    if (this.customerSegmentId != null) {
      json[r'customer_segment_id'] = this.customerSegmentId;
    } else {
      json[r'customer_segment_id'] = null;
    }
    if (this.dcaAssets != null) {
      json[r'dca_assets'] = this.dcaAssets;
    } else {
      json[r'dca_assets'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
    if (this.extFeatures != null) {
      json[r'ext_features'] = this.extFeatures;
    } else {
      json[r'ext_features'] = null;
    }
    if (this.feedProfileId != null) {
      json[r'feed_profile_id'] = this.feedProfileId;
    } else {
      json[r'feed_profile_id'] = null;
    }
      json[r'id'] = this.id;
    if (this.isCreativeOptimization != null) {
      json[r'is_creative_optimization'] = this.isCreativeOptimization;
    } else {
      json[r'is_creative_optimization'] = null;
    }
    if (this.isLocalInventory != null) {
      json[r'is_local_inventory'] = this.isLocalInventory;
    } else {
      json[r'is_local_inventory'] = null;
    }
    if (this.lifetimeFrequencyCap != null) {
      json[r'lifetime_frequency_cap'] = this.lifetimeFrequencyCap;
    } else {
      json[r'lifetime_frequency_cap'] = null;
    }
    if (this.localInventoryRadiusInMiles != null) {
      json[r'local_inventory_radius_in_miles'] = this.localInventoryRadiusInMiles;
    } else {
      json[r'local_inventory_radius_in_miles'] = null;
    }
      json[r'name'] = this.name;
    if (this.optimizationGoalMetadata != null) {
      json[r'optimization_goal_metadata'] = this.optimizationGoalMetadata;
    } else {
      json[r'optimization_goal_metadata'] = null;
    }
    if (this.performancePlusCampaignSettings != null) {
      json[r'performance_plus_campaign_settings'] = this.performancePlusCampaignSettings;
    } else {
      json[r'performance_plus_campaign_settings'] = null;
    }
    if (this.placementGroup != null) {
      json[r'placement_group'] = this.placementGroup;
    } else {
      json[r'placement_group'] = null;
    }
    if (this.placementTrafficType != null) {
      json[r'placement_traffic_type'] = this.placementTrafficType;
    } else {
      json[r'placement_traffic_type'] = null;
    }
    if (this.promotionApplicationLevel != null) {
      json[r'promotion_application_level'] = this.promotionApplicationLevel;
    } else {
      json[r'promotion_application_level'] = null;
    }
    if (this.promotionId != null) {
      json[r'promotion_id'] = this.promotionId;
    } else {
      json[r'promotion_id'] = null;
    }
      json[r'promotion_ids'] = this.promotionIds;
    if (this.startTime != null) {
      json[r'start_time'] = this.startTime;
    } else {
      json[r'start_time'] = null;
    }
    if (this.status != null) {
      json[r'status'] = this.status;
    } else {
      json[r'status'] = null;
    }
      json[r'summary_status'] = this.summaryStatus;
    if (this.targetingSpec != null) {
      json[r'targeting_spec'] = this.targetingSpec;
    } else {
      json[r'targeting_spec'] = null;
    }
    if (this.targetingTemplateIds != null) {
      json[r'targeting_template_ids'] = this.targetingTemplateIds;
    } else {
      json[r'targeting_template_ids'] = null;
    }
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
      json[r'type'] = this.type;
      json[r'updated_time'] = this.updatedTime;
    if (this.autoTargetingEnabled != null) {
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    } else {
      json[r'auto_targeting_enabled'] = null;
    }
    if (this.bidMultiplier != null) {
      json[r'bid_multiplier'] = this.bidMultiplier;
    } else {
      json[r'bid_multiplier'] = null;
    }
    if (this.budgetType != null) {
      json[r'budget_type'] = this.budgetType;
    } else {
      json[r'budget_type'] = null;
    }
    if (this.pacingDeliveryType != null) {
      json[r'pacing_delivery_type'] = this.pacingDeliveryType;
    } else {
      json[r'pacing_delivery_type'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroup] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroup? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'billable_event'), 'Required key "AdGroup[billable_event]" is missing from JSON.');
        assert(json[r'billable_event'] != null, 'Required key "AdGroup[billable_event]" has a null value in JSON.');
        assert(json.containsKey(r'campaign_id'), 'Required key "AdGroup[campaign_id]" is missing from JSON.');
        assert(json[r'campaign_id'] != null, 'Required key "AdGroup[campaign_id]" has a null value in JSON.');
        assert(json.containsKey(r'conversion_learning_mode_type'), 'Required key "AdGroup[conversion_learning_mode_type]" is missing from JSON.');
        assert(json.containsKey(r'created_time'), 'Required key "AdGroup[created_time]" is missing from JSON.');
        assert(json[r'created_time'] != null, 'Required key "AdGroup[created_time]" has a null value in JSON.');
        assert(json.containsKey(r'id'), 'Required key "AdGroup[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AdGroup[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "AdGroup[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "AdGroup[name]" has a null value in JSON.');
        assert(json.containsKey(r'summary_status'), 'Required key "AdGroup[summary_status]" is missing from JSON.');
        assert(json[r'summary_status'] != null, 'Required key "AdGroup[summary_status]" has a null value in JSON.');
        assert(json.containsKey(r'type'), 'Required key "AdGroup[type]" is missing from JSON.');
        assert(json[r'type'] != null, 'Required key "AdGroup[type]" has a null value in JSON.');
        assert(json.containsKey(r'updated_time'), 'Required key "AdGroup[updated_time]" is missing from JSON.');
        assert(json[r'updated_time'] != null, 'Required key "AdGroup[updated_time]" has a null value in JSON.');
        return true;
      }());

      return AdGroup(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        bidStrategyType: BidStrategyType.fromJson(json[r'bid_strategy_type']),
        billableEvent: ActionType.fromJson(json[r'billable_event'])!,
        budgetInMicroCurrency: mapValueOfType<int>(json, r'budget_in_micro_currency'),
        campaignId: mapValueOfType<String>(json, r'campaign_id')!,
        conversionLearningModeType: ConversionLearningModeType.fromJson(json[r'conversion_learning_mode_type']),
        createdTime: mapValueOfType<int>(json, r'created_time')!,
        customerSegmentId: mapValueOfType<String>(json, r'customer_segment_id'),
        dcaAssets: mapValueOfType<Object>(json, r'dca_assets'),
        endTime: mapValueOfType<int>(json, r'end_time'),
        extFeatures: AdgroupTrackingFeatures.fromJson(json[r'ext_features']),
        feedProfileId: mapValueOfType<String>(json, r'feed_profile_id'),
        id: mapValueOfType<String>(json, r'id')!,
        isCreativeOptimization: mapValueOfType<bool>(json, r'is_creative_optimization'),
        isLocalInventory: mapValueOfType<bool>(json, r'is_local_inventory'),
        lifetimeFrequencyCap: mapValueOfType<int>(json, r'lifetime_frequency_cap'),
        localInventoryRadiusInMiles: num.parse('${json[r'local_inventory_radius_in_miles']}'),
        name: mapValueOfType<String>(json, r'name')!,
        optimizationGoalMetadata: NullableOptimizationGoalMetadata.fromJson(json[r'optimization_goal_metadata']),
        performancePlusCampaignSettings: PerformancePlusCampaignSettings.fromJson(json[r'performance_plus_campaign_settings']),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        placementTrafficType: PlacementTrafficType.fromJson(json[r'placement_traffic_type']),
        promotionApplicationLevel: PromotionApplicationLevel.fromJson(json[r'promotion_application_level']),
        promotionId: mapValueOfType<String>(json, r'promotion_id') ?? '0',
        promotionIds: json[r'promotion_ids'] is Iterable
            ? (json[r'promotion_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        summaryStatus: SummaryStatus.fromJson(json[r'summary_status'])!,
        targetingSpec: TargetingSpecOptimal.fromJson(json[r'targeting_spec']),
        targetingTemplateIds: json[r'targeting_template_ids'] is Iterable
            ? (json[r'targeting_template_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        trackingUrls: AdGroupTrackingURLs.fromJson(json[r'tracking_urls']),
        type: mapValueOfType<String>(json, r'type')!,
        updatedTime: mapValueOfType<int>(json, r'updated_time')!,
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled'),
        bidMultiplier: json[r'bid_multiplier'] == null
            ? null
            : num.parse('${json[r'bid_multiplier']}'),
        budgetType: BudgetType.fromJson(json[r'budget_type']),
        pacingDeliveryType: PacingDeliveryType.fromJson(json[r'pacing_delivery_type']),
      );
    }
    return null;
  }

  static List<AdGroup> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroup>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroup.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroup> mapFromJson(dynamic json) {
    final map = <String, AdGroup>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroup.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroup-objects as value to a dart map
  static Map<String, List<AdGroup>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroup>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroup.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'billable_event',
    'campaign_id',
    'conversion_learning_mode_type',
    'created_time',
    'id',
    'name',
    'summary_status',
    'type',
    'updated_time',
  };
}

