//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignBatchUpdateItem {
  /// Returns a new [CampaignBatchUpdateItem] instance.
  CampaignBatchUpdateItem({
    this.adAccountId,
    this.appId,
    this.appPlatform,
    this.bidOptions,
    this.dailySpendCap,
    this.defaultAdGroupBudgetInMicroCurrency,
    this.endTime,
    required this.id,
    this.intendedPromotionType,
    this.isAutomatedCampaign,
    this.isCampaignBudgetOptimization,
    this.isFlexibleDailyBudgets,
    this.isLtvOptimized,
    this.isPerformancePlus,
    this.isTopOfSearch,
    this.lifetimeSpendCap,
    this.name,
    this.objectiveType,
    this.orderLineId,
    this.performancePlusCampaignSettings,
    this.startTime,
    this.status,
    this.trackingUrls,
  });

  /// Setting this field does nothing. The ad account ID gets set from the path parameter.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? appId;

  /// [Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  Platform of the mobile app for `APP_INSTALL` campaigns.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MobileAppPlatform? appPlatform;

  /// Object describing an update to the campaign level bid multipliers.
  CampaignBidOptionsUpdate? bidOptions;

  /// Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset.
  int? dailySpendCap;

  /// Setting this field does nothing.
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

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionObjectiveType? objectiveType;

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

  TrackingUrls? trackingUrls;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignBatchUpdateItem &&
    other.adAccountId == adAccountId &&
    other.appId == appId &&
    other.appPlatform == appPlatform &&
    other.bidOptions == bidOptions &&
    other.dailySpendCap == dailySpendCap &&
    other.defaultAdGroupBudgetInMicroCurrency == defaultAdGroupBudgetInMicroCurrency &&
    other.endTime == endTime &&
    other.id == id &&
    other.intendedPromotionType == intendedPromotionType &&
    other.isAutomatedCampaign == isAutomatedCampaign &&
    other.isCampaignBudgetOptimization == isCampaignBudgetOptimization &&
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
    other.trackingUrls == trackingUrls;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (appId == null ? 0 : appId!.hashCode) +
    (appPlatform == null ? 0 : appPlatform!.hashCode) +
    (bidOptions == null ? 0 : bidOptions!.hashCode) +
    (dailySpendCap == null ? 0 : dailySpendCap!.hashCode) +
    (defaultAdGroupBudgetInMicroCurrency == null ? 0 : defaultAdGroupBudgetInMicroCurrency!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (id.hashCode) +
    (intendedPromotionType == null ? 0 : intendedPromotionType!.hashCode) +
    (isAutomatedCampaign == null ? 0 : isAutomatedCampaign!.hashCode) +
    (isCampaignBudgetOptimization == null ? 0 : isCampaignBudgetOptimization!.hashCode) +
    (isFlexibleDailyBudgets == null ? 0 : isFlexibleDailyBudgets!.hashCode) +
    (isLtvOptimized == null ? 0 : isLtvOptimized!.hashCode) +
    (isPerformancePlus == null ? 0 : isPerformancePlus!.hashCode) +
    (isTopOfSearch == null ? 0 : isTopOfSearch!.hashCode) +
    (lifetimeSpendCap == null ? 0 : lifetimeSpendCap!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (objectiveType == null ? 0 : objectiveType!.hashCode) +
    (orderLineId == null ? 0 : orderLineId!.hashCode) +
    (performancePlusCampaignSettings == null ? 0 : performancePlusCampaignSettings!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode);

  @override
  String toString() => 'CampaignBatchUpdateItem[adAccountId=$adAccountId, appId=$appId, appPlatform=$appPlatform, bidOptions=$bidOptions, dailySpendCap=$dailySpendCap, defaultAdGroupBudgetInMicroCurrency=$defaultAdGroupBudgetInMicroCurrency, endTime=$endTime, id=$id, intendedPromotionType=$intendedPromotionType, isAutomatedCampaign=$isAutomatedCampaign, isCampaignBudgetOptimization=$isCampaignBudgetOptimization, isFlexibleDailyBudgets=$isFlexibleDailyBudgets, isLtvOptimized=$isLtvOptimized, isPerformancePlus=$isPerformancePlus, isTopOfSearch=$isTopOfSearch, lifetimeSpendCap=$lifetimeSpendCap, name=$name, objectiveType=$objectiveType, orderLineId=$orderLineId, performancePlusCampaignSettings=$performancePlusCampaignSettings, startTime=$startTime, status=$status, trackingUrls=$trackingUrls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.appId != null) {
      json[r'app_id'] = this.appId;
    } else {
      json[r'app_id'] = null;
    }
    if (this.appPlatform != null) {
      json[r'app_platform'] = this.appPlatform;
    } else {
      json[r'app_platform'] = null;
    }
    if (this.bidOptions != null) {
      json[r'bid_options'] = this.bidOptions;
    } else {
      json[r'bid_options'] = null;
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
    if (this.objectiveType != null) {
      json[r'objective_type'] = this.objectiveType;
    } else {
      json[r'objective_type'] = null;
    }
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
    if (this.trackingUrls != null) {
      json[r'tracking_urls'] = this.trackingUrls;
    } else {
      json[r'tracking_urls'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignBatchUpdateItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignBatchUpdateItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "CampaignBatchUpdateItem[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "CampaignBatchUpdateItem[id]" has a null value in JSON.');
        return true;
      }());

      return CampaignBatchUpdateItem(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        appId: mapValueOfType<String>(json, r'app_id'),
        appPlatform: MobileAppPlatform.fromJson(json[r'app_platform']),
        bidOptions: CampaignBidOptionsUpdate.fromJson(json[r'bid_options']),
        dailySpendCap: mapValueOfType<int>(json, r'daily_spend_cap'),
        defaultAdGroupBudgetInMicroCurrency: mapValueOfType<int>(json, r'default_ad_group_budget_in_micro_currency'),
        endTime: mapValueOfType<int>(json, r'end_time'),
        id: mapValueOfType<String>(json, r'id')!,
        intendedPromotionType: IntendedPromotionType.fromJson(json[r'intended_promotion_type']),
        isAutomatedCampaign: mapValueOfType<bool>(json, r'is_automated_campaign'),
        isCampaignBudgetOptimization: mapValueOfType<bool>(json, r'is_campaign_budget_optimization'),
        isFlexibleDailyBudgets: mapValueOfType<bool>(json, r'is_flexible_daily_budgets'),
        isLtvOptimized: mapValueOfType<bool>(json, r'is_ltv_optimized'),
        isPerformancePlus: mapValueOfType<bool>(json, r'is_performance_plus'),
        isTopOfSearch: mapValueOfType<bool>(json, r'is_top_of_search'),
        lifetimeSpendCap: mapValueOfType<int>(json, r'lifetime_spend_cap'),
        name: mapValueOfType<String>(json, r'name'),
        objectiveType: ConversionObjectiveType.fromJson(json[r'objective_type']),
        orderLineId: mapValueOfType<String>(json, r'order_line_id'),
        performancePlusCampaignSettings: PerformancePlusCampaignSettings.fromJson(json[r'performance_plus_campaign_settings']),
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
      );
    }
    return null;
  }

  static List<CampaignBatchUpdateItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBatchUpdateItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBatchUpdateItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignBatchUpdateItem> mapFromJson(dynamic json) {
    final map = <String, CampaignBatchUpdateItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignBatchUpdateItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignBatchUpdateItem-objects as value to a dart map
  static Map<String, List<CampaignBatchUpdateItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignBatchUpdateItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignBatchUpdateItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

