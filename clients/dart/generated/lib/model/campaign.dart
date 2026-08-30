//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class Campaign {
  /// Returns a new [Campaign] instance.
  Campaign({
    this.adAccountId,
    this.bidOptions,
    this.createdTime,
    this.dailySpendCap,
    this.defaultAdGroupBudgetInMicroCurrency,
    this.endTime,
    required this.id,
    this.intendedPromotionType,
    this.isAutomatedCampaign,
    this.isCampaignBudgetOptimization,
    this.isCarting,
    this.isFlexibleDailyBudgets,
    this.isLtvOptimized,
    this.isPerformancePlus,
    this.isTopOfSearch,
    this.lifetimeSpendCap,
    this.name,
    required this.objectiveType,
    this.orderLineId,
    this.performancePlusCampaignSettings,
    this.startTime,
    this.status,
    this.summaryStatus,
    this.trackingUrls,
    this.type,
    this.updatedTime,
  });

  /// Campaign's Advertiser ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Object describing the campaign level bid multipliers.
  CampaignBidOptions? bidOptions;

  /// Campaign creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  int? dailySpendCap;

  /// When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
  int? defaultAdGroupBudgetInMicroCurrency;

  /// Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  int? endTime;

  /// Campaign ID, must be associated with the ad account ID provided in the path.
  String id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  IntendedPromotionType? intendedPromotionType;

  /// Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES
  bool? isAutomatedCampaign;

  /// Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
  bool? isCampaignBudgetOptimization;

  /// Whether the campaign contains a carting(where-to-buy link) ad.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isCarting;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
  bool? isFlexibleDailyBudgets;

  /// Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isLtvOptimized;

  /// Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isPerformancePlus;

  /// Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isTopOfSearch;

  /// Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  int? lifetimeSpendCap;

  /// Campaign name - 255 chars max.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  CampaignObjectiveType objectiveType;

  /// Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired.
  String? orderLineId;

  /// Pinterest Performance+ campaign settings.
  PerformancePlusCampaignSettings? performancePlusCampaignSettings;

  /// Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  int? startTime;

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
  SummaryStatus? summaryStatus;

  TrackingUrls? trackingUrls;

  /// Always \"campaign\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  /// UTC timestamp. Last update time.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? updatedTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is Campaign &&
    other.adAccountId == adAccountId &&
    other.bidOptions == bidOptions &&
    other.createdTime == createdTime &&
    other.dailySpendCap == dailySpendCap &&
    other.defaultAdGroupBudgetInMicroCurrency == defaultAdGroupBudgetInMicroCurrency &&
    other.endTime == endTime &&
    other.id == id &&
    other.intendedPromotionType == intendedPromotionType &&
    other.isAutomatedCampaign == isAutomatedCampaign &&
    other.isCampaignBudgetOptimization == isCampaignBudgetOptimization &&
    other.isCarting == isCarting &&
    other.isFlexibleDailyBudgets == isFlexibleDailyBudgets &&
    other.isLtvOptimized == isLtvOptimized &&
    other.isPerformancePlus == isPerformancePlus &&
    other.isTopOfSearch == isTopOfSearch &&
    other.lifetimeSpendCap == lifetimeSpendCap &&
    other.name == name &&
    other.objectiveType == objectiveType &&
    other.orderLineId == orderLineId &&
    other.performancePlusCampaignSettings == performancePlusCampaignSettings &&
    other.startTime == startTime &&
    other.status == status &&
    other.summaryStatus == summaryStatus &&
    other.trackingUrls == trackingUrls &&
    other.type == type &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (bidOptions == null ? 0 : bidOptions!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (dailySpendCap == null ? 0 : dailySpendCap!.hashCode) +
    (defaultAdGroupBudgetInMicroCurrency == null ? 0 : defaultAdGroupBudgetInMicroCurrency!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (id.hashCode) +
    (intendedPromotionType == null ? 0 : intendedPromotionType!.hashCode) +
    (isAutomatedCampaign == null ? 0 : isAutomatedCampaign!.hashCode) +
    (isCampaignBudgetOptimization == null ? 0 : isCampaignBudgetOptimization!.hashCode) +
    (isCarting == null ? 0 : isCarting!.hashCode) +
    (isFlexibleDailyBudgets == null ? 0 : isFlexibleDailyBudgets!.hashCode) +
    (isLtvOptimized == null ? 0 : isLtvOptimized!.hashCode) +
    (isPerformancePlus == null ? 0 : isPerformancePlus!.hashCode) +
    (isTopOfSearch == null ? 0 : isTopOfSearch!.hashCode) +
    (lifetimeSpendCap == null ? 0 : lifetimeSpendCap!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (objectiveType.hashCode) +
    (orderLineId == null ? 0 : orderLineId!.hashCode) +
    (performancePlusCampaignSettings == null ? 0 : performancePlusCampaignSettings!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (summaryStatus == null ? 0 : summaryStatus!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'Campaign[adAccountId=$adAccountId, bidOptions=$bidOptions, createdTime=$createdTime, dailySpendCap=$dailySpendCap, defaultAdGroupBudgetInMicroCurrency=$defaultAdGroupBudgetInMicroCurrency, endTime=$endTime, id=$id, intendedPromotionType=$intendedPromotionType, isAutomatedCampaign=$isAutomatedCampaign, isCampaignBudgetOptimization=$isCampaignBudgetOptimization, isCarting=$isCarting, isFlexibleDailyBudgets=$isFlexibleDailyBudgets, isLtvOptimized=$isLtvOptimized, isPerformancePlus=$isPerformancePlus, isTopOfSearch=$isTopOfSearch, lifetimeSpendCap=$lifetimeSpendCap, name=$name, objectiveType=$objectiveType, orderLineId=$orderLineId, performancePlusCampaignSettings=$performancePlusCampaignSettings, startTime=$startTime, status=$status, summaryStatus=$summaryStatus, trackingUrls=$trackingUrls, type=$type, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.bidOptions != null) {
      json[r'bid_options'] = this.bidOptions;
    } else {
      json[r'bid_options'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    if (this.dailySpendCap != null) {
      json[r'daily_spend_cap'] = this.dailySpendCap;
    } else {
      json[r'daily_spend_cap'] = null;
    }
    if (this.defaultAdGroupBudgetInMicroCurrency != null) {
      json[r'default_ad_group_budget_in_micro_currency'] = this.defaultAdGroupBudgetInMicroCurrency;
    } else {
      json[r'default_ad_group_budget_in_micro_currency'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
      json[r'id'] = this.id;
    if (this.intendedPromotionType != null) {
      json[r'intended_promotion_type'] = this.intendedPromotionType;
    } else {
      json[r'intended_promotion_type'] = null;
    }
    if (this.isAutomatedCampaign != null) {
      json[r'is_automated_campaign'] = this.isAutomatedCampaign;
    } else {
      json[r'is_automated_campaign'] = null;
    }
    if (this.isCampaignBudgetOptimization != null) {
      json[r'is_campaign_budget_optimization'] = this.isCampaignBudgetOptimization;
    } else {
      json[r'is_campaign_budget_optimization'] = null;
    }
    if (this.isCarting != null) {
      json[r'is_carting'] = this.isCarting;
    } else {
      json[r'is_carting'] = null;
    }
    if (this.isFlexibleDailyBudgets != null) {
      json[r'is_flexible_daily_budgets'] = this.isFlexibleDailyBudgets;
    } else {
      json[r'is_flexible_daily_budgets'] = null;
    }
    if (this.isLtvOptimized != null) {
      json[r'is_ltv_optimized'] = this.isLtvOptimized;
    } else {
      json[r'is_ltv_optimized'] = null;
    }
    if (this.isPerformancePlus != null) {
      json[r'is_performance_plus'] = this.isPerformancePlus;
    } else {
      json[r'is_performance_plus'] = null;
    }
    if (this.isTopOfSearch != null) {
      json[r'is_top_of_search'] = this.isTopOfSearch;
    } else {
      json[r'is_top_of_search'] = null;
    }
    if (this.lifetimeSpendCap != null) {
      json[r'lifetime_spend_cap'] = this.lifetimeSpendCap;
    } else {
      json[r'lifetime_spend_cap'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
      json[r'objective_type'] = this.objectiveType;
    if (this.orderLineId != null) {
      json[r'order_line_id'] = this.orderLineId;
    } else {
      json[r'order_line_id'] = null;
    }
    if (this.performancePlusCampaignSettings != null) {
      json[r'performance_plus_campaign_settings'] = this.performancePlusCampaignSettings;
    } else {
      json[r'performance_plus_campaign_settings'] = null;
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
    if (this.summaryStatus != null) {
      json[r'summary_status'] = this.summaryStatus;
    } else {
      json[r'summary_status'] = null;
    }
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    return json;
  }

  /// Returns a new [Campaign] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static Campaign? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "Campaign[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "Campaign[id]" has a null value in JSON.');
        assert(json.containsKey(r'objective_type'), 'Required key "Campaign[objective_type]" is missing from JSON.');
        assert(json[r'objective_type'] != null, 'Required key "Campaign[objective_type]" has a null value in JSON.');
        return true;
      }());

      return Campaign(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        bidOptions: CampaignBidOptions.fromJson(json[r'bid_options']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        dailySpendCap: mapValueOfType<int>(json, r'daily_spend_cap'),
        defaultAdGroupBudgetInMicroCurrency: mapValueOfType<int>(json, r'default_ad_group_budget_in_micro_currency'),
        endTime: mapValueOfType<int>(json, r'end_time'),
        id: mapValueOfType<String>(json, r'id')!,
        intendedPromotionType: IntendedPromotionType.fromJson(json[r'intended_promotion_type']),
        isAutomatedCampaign: mapValueOfType<bool>(json, r'is_automated_campaign'),
        isCampaignBudgetOptimization: mapValueOfType<bool>(json, r'is_campaign_budget_optimization'),
        isCarting: mapValueOfType<bool>(json, r'is_carting'),
        isFlexibleDailyBudgets: mapValueOfType<bool>(json, r'is_flexible_daily_budgets'),
        isLtvOptimized: mapValueOfType<bool>(json, r'is_ltv_optimized'),
        isPerformancePlus: mapValueOfType<bool>(json, r'is_performance_plus'),
        isTopOfSearch: mapValueOfType<bool>(json, r'is_top_of_search'),
        lifetimeSpendCap: mapValueOfType<int>(json, r'lifetime_spend_cap'),
        name: mapValueOfType<String>(json, r'name'),
        objectiveType: CampaignObjectiveType.fromJson(json[r'objective_type'])!,
        orderLineId: mapValueOfType<String>(json, r'order_line_id'),
        performancePlusCampaignSettings: PerformancePlusCampaignSettings.fromJson(json[r'performance_plus_campaign_settings']),
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        summaryStatus: SummaryStatus.fromJson(json[r'summary_status']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        type: mapValueOfType<String>(json, r'type'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<Campaign> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Campaign>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Campaign.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, Campaign> mapFromJson(dynamic json) {
    final map = <String, Campaign>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = Campaign.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of Campaign-objects as value to a dart map
  static Map<String, List<Campaign>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<Campaign>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = Campaign.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'objective_type',
  };
}

