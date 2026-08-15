//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignCommon {
  /// Returns a new [CampaignCommon] instance.
  CampaignCommon({
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
  });

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignCommon &&
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
    other.trackingUrls == trackingUrls;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
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
    (trackingUrls == null ? 0 : trackingUrls!.hashCode);

  @override
  String toString() => 'CampaignCommon[adAccountId=$adAccountId, dailySpendCap=$dailySpendCap, endTime=$endTime, isAutomatedCampaign=$isAutomatedCampaign, isFlexibleDailyBudgets=$isFlexibleDailyBudgets, lifetimeSpendCap=$lifetimeSpendCap, name=$name, orderLineId=$orderLineId, startTime=$startTime, status=$status, trackingUrls=$trackingUrls]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    return json;
  }

  /// Returns a new [CampaignCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignCommon(
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
      );
    }
    return null;
  }

  static List<CampaignCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignCommon> mapFromJson(dynamic json) {
    final map = <String, CampaignCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignCommon-objects as value to a dart map
  static Map<String, List<CampaignCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

