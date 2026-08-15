//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignResponse {
  /// Returns a new [CampaignResponse] instance.
  CampaignResponse({
    this.id,
    this.adAccountId,
    this.dailySpendCap,
    this.endTime,
    this.isAutomatedCampaign,
    this.isFlexibleDailyBudgets,
    this.lifetimeSpendCap,
    this.name,
    this.orderLineId,
    this.startTime,
    this.status,
    this.trackingUrls,
    this.bidOptions,
    this.createdTime,
    this.isCampaignBudgetOptimization,
    this.isPerformancePlus,
    this.objectiveType,
    this.summaryStatus,
    this.type,
    this.updatedTime,
  });

  /// Campaign ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  int? dailySpendCap;

  /// Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  int? endTime;

  /// Specifies whether the campaign was created in the automated campaign flow
  bool? isAutomatedCampaign;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
  bool? isFlexibleDailyBudgets;

  /// Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  int? lifetimeSpendCap;

  /// Campaign name.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? name;

  /// Order line ID that appears on the invoice.
  String? orderLineId;

  /// Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  int? startTime;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EntityStatus? status;

  TrackingUrls? trackingUrls;

  CampaignBidOptions? bidOptions;

  /// Campaign creation time. Unix timestamp in seconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  /// Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  bool? isCampaignBudgetOptimization;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isPerformancePlus;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ObjectiveType? objectiveType;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CampaignSummaryStatus? summaryStatus;

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
  bool operator ==(Object other) => identical(this, other) || other is CampaignResponse &&
    other.id == id &&
    other.adAccountId == adAccountId &&
    other.dailySpendCap == dailySpendCap &&
    other.endTime == endTime &&
    other.isAutomatedCampaign == isAutomatedCampaign &&
    other.isFlexibleDailyBudgets == isFlexibleDailyBudgets &&
    other.lifetimeSpendCap == lifetimeSpendCap &&
    other.name == name &&
    other.orderLineId == orderLineId &&
    other.startTime == startTime &&
    other.status == status &&
    other.trackingUrls == trackingUrls &&
    other.bidOptions == bidOptions &&
    other.createdTime == createdTime &&
    other.isCampaignBudgetOptimization == isCampaignBudgetOptimization &&
    other.isPerformancePlus == isPerformancePlus &&
    other.objectiveType == objectiveType &&
    other.summaryStatus == summaryStatus &&
    other.type == type &&
    other.updatedTime == updatedTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (dailySpendCap == null ? 0 : dailySpendCap!.hashCode) +
    (endTime == null ? 0 : endTime!.hashCode) +
    (isAutomatedCampaign == null ? 0 : isAutomatedCampaign!.hashCode) +
    (isFlexibleDailyBudgets == null ? 0 : isFlexibleDailyBudgets!.hashCode) +
    (lifetimeSpendCap == null ? 0 : lifetimeSpendCap!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (orderLineId == null ? 0 : orderLineId!.hashCode) +
    (startTime == null ? 0 : startTime!.hashCode) +
    (status == null ? 0 : status!.hashCode) +
    (trackingUrls == null ? 0 : trackingUrls!.hashCode) +
    (bidOptions == null ? 0 : bidOptions!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (isCampaignBudgetOptimization == null ? 0 : isCampaignBudgetOptimization!.hashCode) +
    (isPerformancePlus == null ? 0 : isPerformancePlus!.hashCode) +
    (objectiveType == null ? 0 : objectiveType!.hashCode) +
    (summaryStatus == null ? 0 : summaryStatus!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode);

  @override
  String toString() => 'CampaignResponse[id=$id, adAccountId=$adAccountId, dailySpendCap=$dailySpendCap, endTime=$endTime, isAutomatedCampaign=$isAutomatedCampaign, isFlexibleDailyBudgets=$isFlexibleDailyBudgets, lifetimeSpendCap=$lifetimeSpendCap, name=$name, orderLineId=$orderLineId, startTime=$startTime, status=$status, trackingUrls=$trackingUrls, bidOptions=$bidOptions, createdTime=$createdTime, isCampaignBudgetOptimization=$isCampaignBudgetOptimization, isPerformancePlus=$isPerformancePlus, objectiveType=$objectiveType, summaryStatus=$summaryStatus, type=$type, updatedTime=$updatedTime]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
    if (this.dailySpendCap != null) {
      json[r'daily_spend_cap'] = this.dailySpendCap;
    } else {
      json[r'daily_spend_cap'] = null;
    }
    if (this.endTime != null) {
      json[r'end_time'] = this.endTime;
    } else {
      json[r'end_time'] = null;
    }
    if (this.isAutomatedCampaign != null) {
      json[r'is_automated_campaign'] = this.isAutomatedCampaign;
    } else {
      json[r'is_automated_campaign'] = null;
    }
    if (this.isFlexibleDailyBudgets != null) {
      json[r'is_flexible_daily_budgets'] = this.isFlexibleDailyBudgets;
    } else {
      json[r'is_flexible_daily_budgets'] = null;
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
    if (this.orderLineId != null) {
      json[r'order_line_id'] = this.orderLineId;
    } else {
      json[r'order_line_id'] = null;
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
    if (this.isCampaignBudgetOptimization != null) {
      json[r'is_campaign_budget_optimization'] = this.isCampaignBudgetOptimization;
    } else {
      json[r'is_campaign_budget_optimization'] = null;
    }
    if (this.isPerformancePlus != null) {
      json[r'is_performance_plus'] = this.isPerformancePlus;
    } else {
      json[r'is_performance_plus'] = null;
    }
    if (this.objectiveType != null) {
      json[r'objective_type'] = this.objectiveType;
    } else {
      json[r'objective_type'] = null;
    }
    if (this.summaryStatus != null) {
      json[r'summary_status'] = this.summaryStatus;
    } else {
      json[r'summary_status'] = null;
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

  /// Returns a new [CampaignResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignResponse(
        id: mapValueOfType<String>(json, r'id'),
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        dailySpendCap: mapValueOfType<int>(json, r'daily_spend_cap'),
        endTime: mapValueOfType<int>(json, r'end_time'),
        isAutomatedCampaign: mapValueOfType<bool>(json, r'is_automated_campaign'),
        isFlexibleDailyBudgets: mapValueOfType<bool>(json, r'is_flexible_daily_budgets'),
        lifetimeSpendCap: mapValueOfType<int>(json, r'lifetime_spend_cap'),
        name: mapValueOfType<String>(json, r'name'),
        orderLineId: mapValueOfType<String>(json, r'order_line_id'),
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
        bidOptions: CampaignBidOptions.fromJson(json[r'bid_options']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        isCampaignBudgetOptimization: mapValueOfType<bool>(json, r'is_campaign_budget_optimization'),
        isPerformancePlus: mapValueOfType<bool>(json, r'is_performance_plus'),
        objectiveType: ObjectiveType.fromJson(json[r'objective_type']),
        summaryStatus: CampaignSummaryStatus.fromJson(json[r'summary_status']),
        type: mapValueOfType<String>(json, r'type'),
        updatedTime: mapValueOfType<int>(json, r'updated_time'),
      );
    }
    return null;
  }

  static List<CampaignResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignResponse> mapFromJson(dynamic json) {
    final map = <String, CampaignResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignResponse-objects as value to a dart map
  static Map<String, List<CampaignResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

