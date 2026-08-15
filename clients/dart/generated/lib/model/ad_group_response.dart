//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupResponse {
  /// Returns a new [AdGroupResponse] instance.
  AdGroupResponse({
    this.autoTargetingEnabled,
    this.bidInMicroCurrency,
    this.bidStrategyType,
    this.billableEvent,
    this.budgetInMicroCurrency,
    this.budgetType,
    this.campaignId,
    this.endTime,
    this.isCreativeOptimization,
    this.lifetimeFrequencyCap,
    this.name,
    this.optimizationGoalMetadata,
    this.pacingDeliveryType,
    this.placementGroup,
    this.promotionApplicationLevel,
    this.promotionId = '0',
    this.startTime,
    this.status,
    this.targetingSpec,
    this.targetingTemplateIds = const [],
    this.trackingUrls,
    this.adAccountId,
    this.bidMultiplier,
    this.conversionLearningModeType,
    this.createdTime,
    this.dcaAssets,
    this.feedProfileId,
    this.id,
    this.summaryStatus,
    this.type = 'adgroup',
    this.updatedTime,
  });

  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  bool? autoTargetingEnabled;

  /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
  int? bidInMicroCurrency;

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  AdGroupResponseBidStrategyTypeEnum? bidStrategyType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ActionType? billableEvent;

  /// Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
  int? budgetInMicroCurrency;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BudgetType? budgetType;

  /// Campaign ID of the ad group.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? campaignId;

  /// Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  int? endTime;

  /// Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  bool? isCreativeOptimization;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lifetimeFrequencyCap;

  /// Ad group name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  OptimizationGoalMetadata? optimizationGoalMetadata;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PacingDeliveryType? pacingDeliveryType;

  /// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PlacementGroupType? placementGroup;

  /// Specify if the promotion is applied at ad group or item level
  AdGroupResponsePromotionApplicationLevelEnum? promotionApplicationLevel;

  /// Promotion ID. To clear this field, set to null.
  String? promotionId;

  /// Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  int? startTime;

  /// Ad group/entity status.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TargetingSpec? targetingSpec;

  /// Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  List<String>? targetingTemplateIds;

  /// Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  TrackingUrls? trackingUrls;

  /// Advertiser ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  ///
  /// Minimum value: 0
  /// Maximum value: 10
  num? bidMultiplier;

  /// oCPM learn mode
  AdGroupResponseConversionLearningModeTypeEnum? conversionLearningModeType;

  /// Ad group creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// [DCA] The Dynamic creative assets to use for DCA. Dynamic Creative Assembly (DCA) accepts basic creative assets of an ad (image, video, title, call to action, logo etc). Then it automatically generates optimized ad combinations based on these assets.
  Object? dcaAssets;

  /// Feed Profile ID associated to the adgroup.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? feedProfileId;

  /// Ad group ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Ad group summary status.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AdGroupSummaryStatus? summaryStatus;

  /// Always \"adgroup\".
  String type;

  /// Ad group last update time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupResponse &&
    other.autoTargetingEnabled == autoTargetingEnabled &&
    other.bidInMicroCurrency == bidInMicroCurrency &&
    other.bidStrategyType == bidStrategyType &&
    other.billableEvent == billableEvent &&
    other.budgetInMicroCurrency == budgetInMicroCurrency &&
    other.budgetType == budgetType &&
    other.campaignId == campaignId &&
    other.endTime == endTime &&
    other.isCreativeOptimization == isCreativeOptimization &&
    other.lifetimeFrequencyCap == lifetimeFrequencyCap &&
    other.name == name &&
    other.optimizationGoalMetadata == optimizationGoalMetadata &&
    other.pacingDeliveryType == pacingDeliveryType &&
    other.placementGroup == placementGroup &&
    other.promotionApplicationLevel == promotionApplicationLevel &&
    other.promotionId == promotionId &&
    other.startTime == startTime &&
    other.status == status &&
    other.targetingSpec == targetingSpec &&
    _deepEquality.equals(other.targetingTemplateIds, targetingTemplateIds) &&
    other.trackingUrls == trackingUrls &&
    other.adAccountId == adAccountId &&
    other.bidMultiplier == bidMultiplier &&
    other.conversionLearningModeType == conversionLearningModeType &&
    other.createdTime == createdTime &&
    other.dcaAssets == dcaAssets &&
    other.feedProfileId == feedProfileId &&
    other.id == id &&
    other.summaryStatus == summaryStatus &&
    other.type == type &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (autoTargetingEnabled == null ? 0 : autoTargetingEnabled!.hashCode) +
    (bidInMicroCurrency == null ? 0 : bidInMicroCurrency!.hashCode) +
    (bidStrategyType == null ? 0 : bidStrategyType!.hashCode) +
    (billableEvent == null ? 0 : billableEvent!.hashCode) +
    (budgetInMicroCurrency == null ? 0 : budgetInMicroCurrency!.hashCode) +
    (budgetType == null ? 0 : budgetType!.hashCode) +
    (campaignId == null ? 0 : campaignId!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (isCreativeOptimization == null ? 0 : isCreativeOptimization!.hashCode) +
    (lifetimeFrequencyCap == null ? 0 : lifetimeFrequencyCap!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (optimizationGoalMetadata == null ? 0 : optimizationGoalMetadata!.hashCode) +
    (pacingDeliveryType == null ? 0 : pacingDeliveryType!.hashCode) +
    (placementGroup == null ? 0 : placementGroup!.hashCode) +
    (promotionApplicationLevel == null ? 0 : promotionApplicationLevel!.hashCode) +
    (promotionId == null ? 0 : promotionId!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (targetingSpec == null ? 0 : targetingSpec!.hashCode) +
    (targetingTemplateIds == null ? 0 : targetingTemplateIds!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (bidMultiplier == null ? 0 : bidMultiplier!.hashCode) +
    (conversionLearningModeType == null ? 0 : conversionLearningModeType!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (dcaAssets == null ? 0 : dcaAssets!.hashCode) +
    (feedProfileId == null ? 0 : feedProfileId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (summaryStatus == null ? 0 : summaryStatus!.hashCode) +
    (type.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'AdGroupResponse[autoTargetingEnabled=$autoTargetingEnabled, bidInMicroCurrency=$bidInMicroCurrency, bidStrategyType=$bidStrategyType, billableEvent=$billableEvent, budgetInMicroCurrency=$budgetInMicroCurrency, budgetType=$budgetType, campaignId=$campaignId, endTime=$endTime, isCreativeOptimization=$isCreativeOptimization, lifetimeFrequencyCap=$lifetimeFrequencyCap, name=$name, optimizationGoalMetadata=$optimizationGoalMetadata, pacingDeliveryType=$pacingDeliveryType, placementGroup=$placementGroup, promotionApplicationLevel=$promotionApplicationLevel, promotionId=$promotionId, startTime=$startTime, status=$status, targetingSpec=$targetingSpec, targetingTemplateIds=$targetingTemplateIds, trackingUrls=$trackingUrls, adAccountId=$adAccountId, bidMultiplier=$bidMultiplier, conversionLearningModeType=$conversionLearningModeType, createdTime=$createdTime, dcaAssets=$dcaAssets, feedProfileId=$feedProfileId, id=$id, summaryStatus=$summaryStatus, type=$type, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.autoTargetingEnabled != null) {
      json[r'auto_targeting_enabled'] = this.autoTargetingEnabled;
    } else {
      json[r'auto_targeting_enabled'] = null;
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
    if (this.billableEvent != null) {
      json[r'billable_event'] = this.billableEvent;
    } else {
      json[r'billable_event'] = null;
    }
    if (this.budgetInMicroCurrency != null) {
      json[r'budget_in_micro_currency'] = this.budgetInMicroCurrency;
    } else {
      json[r'budget_in_micro_currency'] = null;
    }
    if (this.budgetType != null) {
      json[r'budget_type'] = this.budgetType;
    } else {
      json[r'budget_type'] = null;
    }
    if (this.campaignId != null) {
      json[r'campaign_id'] = this.campaignId;
    } else {
      json[r'campaign_id'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
    if (this.isCreativeOptimization != null) {
      json[r'is_creative_optimization'] = this.isCreativeOptimization;
    } else {
      json[r'is_creative_optimization'] = null;
    }
    if (this.lifetimeFrequencyCap != null) {
      json[r'lifetime_frequency_cap'] = this.lifetimeFrequencyCap;
    } else {
      json[r'lifetime_frequency_cap'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.optimizationGoalMetadata != null) {
      json[r'optimization_goal_metadata'] = this.optimizationGoalMetadata;
    } else {
      json[r'optimization_goal_metadata'] = null;
    }
    if (this.pacingDeliveryType != null) {
      json[r'pacing_delivery_type'] = this.pacingDeliveryType;
    } else {
      json[r'pacing_delivery_type'] = null;
    }
    if (this.placementGroup != null) {
      json[r'placement_group'] = this.placementGroup;
    } else {
      json[r'placement_group'] = null;
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
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.bidMultiplier != null) {
      json[r'bid_multiplier'] = this.bidMultiplier;
    } else {
      json[r'bid_multiplier'] = null;
    }
    if (this.conversionLearningModeType != null) {
      json[r'conversion_learning_mode_type'] = this.conversionLearningModeType;
    } else {
      json[r'conversion_learning_mode_type'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.dcaAssets != null) {
      json[r'dca_assets'] = this.dcaAssets;
    } else {
      json[r'dca_assets'] = null;
    }
    if (this.feedProfileId != null) {
      json[r'feed_profile_id'] = this.feedProfileId;
    } else {
      json[r'feed_profile_id'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.summaryStatus != null) {
      json[r'summary_status'] = this.summaryStatus;
    } else {
      json[r'summary_status'] = null;
    }
      json[r'type'] = this.type;
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdGroupResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdGroupResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdGroupResponse(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled'),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        bidStrategyType: AdGroupResponseBidStrategyTypeEnum.fromJson(json[r'bid_strategy_type']),
        billableEvent: ActionType.fromJson(json[r'billable_event']),
        budgetInMicroCurrency: mapValueOfType<int>(json, r'budget_in_micro_currency'),
        budgetType: BudgetType.fromJson(json[r'budget_type']),
        campaignId: mapValueOfType<String>(json, r'campaign_id'),
        endTime: mapValueOfType<int>(json, r'end_time'),
        isCreativeOptimization: mapValueOfType<bool>(json, r'is_creative_optimization'),
        lifetimeFrequencyCap: mapValueOfType<int>(json, r'lifetime_frequency_cap'),
        name: mapValueOfType<String>(json, r'name'),
        optimizationGoalMetadata: OptimizationGoalMetadata.fromJson(json[r'optimization_goal_metadata']),
        pacingDeliveryType: PacingDeliveryType.fromJson(json[r'pacing_delivery_type']),
        placementGroup: PlacementGroupType.fromJson(json[r'placement_group']),
        promotionApplicationLevel: AdGroupResponsePromotionApplicationLevelEnum.fromJson(json[r'promotion_application_level']),
        promotionId: mapValueOfType<String>(json, r'promotion_id') ?? '0',
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        targetingSpec: TargetingSpec.fromJson(json[r'targeting_spec']),
        targetingTemplateIds: json[r'targeting_template_ids'] is Iterable
            ? (json[r'targeting_template_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        bidMultiplier: json[r'bid_multiplier'] == null
            ? null
            : num.parse('${json[r'bid_multiplier']}'),
        conversionLearningModeType: AdGroupResponseConversionLearningModeTypeEnum.fromJson(json[r'conversion_learning_mode_type']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        dcaAssets: mapValueOfType<Object>(json, r'dca_assets'),
        feedProfileId: mapValueOfType<String>(json, r'feed_profile_id'),
        id: mapValueOfType<String>(json, r'id'),
        summaryStatus: AdGroupSummaryStatus.fromJson(json[r'summary_status']),
        type: mapValueOfType<String>(json, r'type') ?? 'adgroup',
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<AdGroupResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupResponse> mapFromJson(dynamic json) {
    final map = <String, AdGroupResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupResponse-objects as value to a dart map
  static Map<String, List<AdGroupResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
class AdGroupResponseBidStrategyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupResponseBidStrategyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AUTOMATIC_BID = AdGroupResponseBidStrategyTypeEnum._(r'AUTOMATIC_BID');
  static const MAX_BID = AdGroupResponseBidStrategyTypeEnum._(r'MAX_BID');
  static const TARGET_AVG = AdGroupResponseBidStrategyTypeEnum._(r'TARGET_AVG');

  /// List of all possible values in this [enum][AdGroupResponseBidStrategyTypeEnum].
  static const values = <AdGroupResponseBidStrategyTypeEnum>[
    AUTOMATIC_BID,
    MAX_BID,
    TARGET_AVG,
  ];

  static AdGroupResponseBidStrategyTypeEnum? fromJson(dynamic value) => AdGroupResponseBidStrategyTypeEnumTypeTransformer().decode(value);

  static List<AdGroupResponseBidStrategyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupResponseBidStrategyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupResponseBidStrategyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupResponseBidStrategyTypeEnum] to String,
/// and [decode] dynamic data back to [AdGroupResponseBidStrategyTypeEnum].
class AdGroupResponseBidStrategyTypeEnumTypeTransformer {
  factory AdGroupResponseBidStrategyTypeEnumTypeTransformer() => _instance ??= const AdGroupResponseBidStrategyTypeEnumTypeTransformer._();

  const AdGroupResponseBidStrategyTypeEnumTypeTransformer._();

  String encode(AdGroupResponseBidStrategyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupResponseBidStrategyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupResponseBidStrategyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AUTOMATIC_BID': return AdGroupResponseBidStrategyTypeEnum.AUTOMATIC_BID;
        case r'MAX_BID': return AdGroupResponseBidStrategyTypeEnum.MAX_BID;
        case r'TARGET_AVG': return AdGroupResponseBidStrategyTypeEnum.TARGET_AVG;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupResponseBidStrategyTypeEnumTypeTransformer] instance.
  static AdGroupResponseBidStrategyTypeEnumTypeTransformer? _instance;
}


/// Specify if the promotion is applied at ad group or item level
class AdGroupResponsePromotionApplicationLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupResponsePromotionApplicationLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NONE = AdGroupResponsePromotionApplicationLevelEnum._(r'NONE');
  static const ITEM = AdGroupResponsePromotionApplicationLevelEnum._(r'ITEM');
  static const AD_GROUP = AdGroupResponsePromotionApplicationLevelEnum._(r'AD_GROUP');

  /// List of all possible values in this [enum][AdGroupResponsePromotionApplicationLevelEnum].
  static const values = <AdGroupResponsePromotionApplicationLevelEnum>[
    NONE,
    ITEM,
    AD_GROUP,
  ];

  static AdGroupResponsePromotionApplicationLevelEnum? fromJson(dynamic value) => AdGroupResponsePromotionApplicationLevelEnumTypeTransformer().decode(value);

  static List<AdGroupResponsePromotionApplicationLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupResponsePromotionApplicationLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupResponsePromotionApplicationLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupResponsePromotionApplicationLevelEnum] to String,
/// and [decode] dynamic data back to [AdGroupResponsePromotionApplicationLevelEnum].
class AdGroupResponsePromotionApplicationLevelEnumTypeTransformer {
  factory AdGroupResponsePromotionApplicationLevelEnumTypeTransformer() => _instance ??= const AdGroupResponsePromotionApplicationLevelEnumTypeTransformer._();

  const AdGroupResponsePromotionApplicationLevelEnumTypeTransformer._();

  String encode(AdGroupResponsePromotionApplicationLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupResponsePromotionApplicationLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupResponsePromotionApplicationLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NONE': return AdGroupResponsePromotionApplicationLevelEnum.NONE;
        case r'ITEM': return AdGroupResponsePromotionApplicationLevelEnum.ITEM;
        case r'AD_GROUP': return AdGroupResponsePromotionApplicationLevelEnum.AD_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupResponsePromotionApplicationLevelEnumTypeTransformer] instance.
  static AdGroupResponsePromotionApplicationLevelEnumTypeTransformer? _instance;
}


/// oCPM learn mode
class AdGroupResponseConversionLearningModeTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupResponseConversionLearningModeTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NOT_ACTIVE = AdGroupResponseConversionLearningModeTypeEnum._(r'NOT_ACTIVE');
  static const ACTIVE = AdGroupResponseConversionLearningModeTypeEnum._(r'ACTIVE');

  /// List of all possible values in this [enum][AdGroupResponseConversionLearningModeTypeEnum].
  static const values = <AdGroupResponseConversionLearningModeTypeEnum>[
    NOT_ACTIVE,
    ACTIVE,
  ];

  static AdGroupResponseConversionLearningModeTypeEnum? fromJson(dynamic value) => AdGroupResponseConversionLearningModeTypeEnumTypeTransformer().decode(value);

  static List<AdGroupResponseConversionLearningModeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupResponseConversionLearningModeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupResponseConversionLearningModeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupResponseConversionLearningModeTypeEnum] to String,
/// and [decode] dynamic data back to [AdGroupResponseConversionLearningModeTypeEnum].
class AdGroupResponseConversionLearningModeTypeEnumTypeTransformer {
  factory AdGroupResponseConversionLearningModeTypeEnumTypeTransformer() => _instance ??= const AdGroupResponseConversionLearningModeTypeEnumTypeTransformer._();

  const AdGroupResponseConversionLearningModeTypeEnumTypeTransformer._();

  String encode(AdGroupResponseConversionLearningModeTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupResponseConversionLearningModeTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupResponseConversionLearningModeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NOT_ACTIVE': return AdGroupResponseConversionLearningModeTypeEnum.NOT_ACTIVE;
        case r'ACTIVE': return AdGroupResponseConversionLearningModeTypeEnum.ACTIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupResponseConversionLearningModeTypeEnumTypeTransformer] instance.
  static AdGroupResponseConversionLearningModeTypeEnumTypeTransformer? _instance;
}


