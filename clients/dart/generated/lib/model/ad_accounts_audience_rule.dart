//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdAccountsAudienceRule {
  /// Returns a new [AdAccountsAudienceRule] instance.
  AdAccountsAudienceRule({
    this.adAccountId,
    this.adId = const [],
    this.campaignId = const [],
    this.country,
    this.customerListId,
    this.engagementDomain = const [],
    this.engagementType,
    this.engagerType,
    this.event,
    this.eventData,
    this.eventSource,
    this.ingestionSource,
    this.objectiveType = const [],
    this.percentage,
    this.pinId = const [],
    this.prefill,
    this.retentionDays,
    this.seedId = const [],
    this.url = const [],
    this.visitorSourceId,
  });

  /// Ad account ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// Ad ID for engagement audience filter.
  List<String> adId;

  /// Campaign ID for engagement audience filter.
  List<String> campaignId;

  /// Valid countries include: \"US\", \"CA\", and \"GB\".
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? country;

  /// Customer list ID. For CUSTOMER_LIST `audience_type`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? customerListId;

  /// The audience account's verified domain. **Required** for ENGAGEMENT `audience_type`.
  List<String> engagementDomain;

  /// Engagement type enum. Optional for ENGAGEMENT `audience_type`. Supported values are `click`, `save`, `closeup`, `comment` and `like`. All engagements are included if this field is not set.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? engagementType;

  /// Optional for ENGAGEMENT. Engager type value should be 1-2.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? engagerType;

  /// A Pinterest tag event. Optional for VISITOR `audience_type`. Possible values are `pagevisit`, `signup`, `checkout`, `viewcategory`, `search`, `addtocart`, `watchvideo`, `lead`, and `custom`. This field also accepts a partner-defined Pinterest tag event.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? event;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  EventData? eventData;

  /// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: web, mobile, offline
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? eventSource;

  /// Optional for VISITOR. You can use it as a {'=': [value]}. Supported values are: tag, mmp, file_upload, conversions_api
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Object? ingestionSource;

  /// Objective for engagement audience filter.
  List<AudienceObjectiveType> objectiveType;

  /// Percentage should be 1-10. The targeted audience should be this % size across Pinterest.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? percentage;

  /// IDs of engaged organic pins. Optional for ENGAGEMENT `audience_type`. For example, \"pin_id:\": [\"34567\"]
  List<String> pinId;

  /// Optional for VISITOR `audience_type`. If `true`, the specified rule on existing engagement data is applied to pre-populate the audience. If `false`, the audience is empty at creation time. The default is `true`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? prefill;

  /// Number of days a Pinterest user remains in the audience. Optional for ENGAGEMENT and VISITOR `audience_type`. Accepted range is 1-540. Defaults to 180 if not specified.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? retentionDays;

  /// Audience ID(s). For ACTALIKE `audience_type`.
  List<String> seedId;

  /// Optional for ENGAGEMENT or VISITOR `audience_type`. For ENGAGEMENT, it is the engaged pin's URL. For VISITOR, you can use it as a string or a {operator: value} object for filtering visitors based on conversion tag event URLs. Supported operators are [ =, !=, contains, not_contains]. Example 1:  \"url\": \"http://www.myonlinestore123.com/view_item/shoe\" Example 2: \"url\": {\"contains\": \"/view_item/shoe\"}
  List<String> url;

  /// The conversion tag ID, or the Pinterest tag ID, that you use on your website. For VISITOR `audience_type`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? visitorSourceId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdAccountsAudienceRule &&
    other.adAccountId == adAccountId &&
    _deepEquality.equals(other.adId, adId) &&
    _deepEquality.equals(other.campaignId, campaignId) &&
    other.country == country &&
    other.customerListId == customerListId &&
    _deepEquality.equals(other.engagementDomain, engagementDomain) &&
    other.engagementType == engagementType &&
    other.engagerType == engagerType &&
    other.event == event &&
    other.eventData == eventData &&
    other.eventSource == eventSource &&
    other.ingestionSource == ingestionSource &&
    _deepEquality.equals(other.objectiveType, objectiveType) &&
    other.percentage == percentage &&
    _deepEquality.equals(other.pinId, pinId) &&
    other.prefill == prefill &&
    other.retentionDays == retentionDays &&
    _deepEquality.equals(other.seedId, seedId) &&
    _deepEquality.equals(other.url, url) &&
    other.visitorSourceId == visitorSourceId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (adId.hashCode) +
    (campaignId.hashCode) +
    (country == null ? 0 : country!.hashCode) +
    (customerListId == null ? 0 : customerListId!.hashCode) +
    (engagementDomain.hashCode) +
    (engagementType == null ? 0 : engagementType!.hashCode) +
    (engagerType == null ? 0 : engagerType!.hashCode) +
    (event == null ? 0 : event!.hashCode) +
    (eventData == null ? 0 : eventData!.hashCode) +
    (eventSource == null ? 0 : eventSource!.hashCode) +
    (ingestionSource == null ? 0 : ingestionSource!.hashCode) +
    (objectiveType.hashCode) +
    (percentage == null ? 0 : percentage!.hashCode) +
    (pinId.hashCode) +
    (prefill == null ? 0 : prefill!.hashCode) +
    (retentionDays == null ? 0 : retentionDays!.hashCode) +
    (seedId.hashCode) +
    (url.hashCode) +
    (visitorSourceId == null ? 0 : visitorSourceId!.hashCode);

  @override
  String toString() => 'AdAccountsAudienceRule[adAccountId=$adAccountId, adId=$adId, campaignId=$campaignId, country=$country, customerListId=$customerListId, engagementDomain=$engagementDomain, engagementType=$engagementType, engagerType=$engagerType, event=$event, eventData=$eventData, eventSource=$eventSource, ingestionSource=$ingestionSource, objectiveType=$objectiveType, percentage=$percentage, pinId=$pinId, prefill=$prefill, retentionDays=$retentionDays, seedId=$seedId, url=$url, visitorSourceId=$visitorSourceId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
      json[r'ad_id'] = this.adId;
      json[r'campaign_id'] = this.campaignId;
    if (this.country != null) {
      json[r'country'] = this.country;
    } else {
      json[r'country'] = null;
    }
    if (this.customerListId != null) {
      json[r'customer_list_id'] = this.customerListId;
    } else {
      json[r'customer_list_id'] = null;
    }
      json[r'engagement_domain'] = this.engagementDomain;
    if (this.engagementType != null) {
      json[r'engagement_type'] = this.engagementType;
    } else {
      json[r'engagement_type'] = null;
    }
    if (this.engagerType != null) {
      json[r'engager_type'] = this.engagerType;
    } else {
      json[r'engager_type'] = null;
    }
    if (this.event != null) {
      json[r'event'] = this.event;
    } else {
      json[r'event'] = null;
    }
    if (this.eventData != null) {
      json[r'event_data'] = this.eventData;
    } else {
      json[r'event_data'] = null;
    }
    if (this.eventSource != null) {
      json[r'event_source'] = this.eventSource;
    } else {
      json[r'event_source'] = null;
    }
    if (this.ingestionSource != null) {
      json[r'ingestion_source'] = this.ingestionSource;
    } else {
      json[r'ingestion_source'] = null;
    }
      json[r'objective_type'] = this.objectiveType;
    if (this.percentage != null) {
      json[r'percentage'] = this.percentage;
    } else {
      json[r'percentage'] = null;
    }
      json[r'pin_id'] = this.pinId;
    if (this.prefill != null) {
      json[r'prefill'] = this.prefill;
    } else {
      json[r'prefill'] = null;
    }
    if (this.retentionDays != null) {
      json[r'retention_days'] = this.retentionDays;
    } else {
      json[r'retention_days'] = null;
    }
      json[r'seed_id'] = this.seedId;
      json[r'url'] = this.url;
    if (this.visitorSourceId != null) {
      json[r'visitor_source_id'] = this.visitorSourceId;
    } else {
      json[r'visitor_source_id'] = null;
    }
    return json;
  }

  /// Returns a new [AdAccountsAudienceRule] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdAccountsAudienceRule? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdAccountsAudienceRule(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        adId: json[r'ad_id'] is Iterable
            ? (json[r'ad_id'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        campaignId: json[r'campaign_id'] is Iterable
            ? (json[r'campaign_id'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        country: mapValueOfType<String>(json, r'country'),
        customerListId: mapValueOfType<String>(json, r'customer_list_id'),
        engagementDomain: json[r'engagement_domain'] is Iterable
            ? (json[r'engagement_domain'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        engagementType: mapValueOfType<String>(json, r'engagement_type'),
        engagerType: mapValueOfType<int>(json, r'engager_type'),
        event: mapValueOfType<String>(json, r'event'),
        eventData: EventData.fromJson(json[r'event_data']),
        eventSource: mapValueOfType<Object>(json, r'event_source'),
        ingestionSource: mapValueOfType<Object>(json, r'ingestion_source'),
        objectiveType: AudienceObjectiveType.listFromJson(json[r'objective_type']),
        percentage: mapValueOfType<int>(json, r'percentage'),
        pinId: json[r'pin_id'] is Iterable
            ? (json[r'pin_id'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        prefill: mapValueOfType<bool>(json, r'prefill'),
        retentionDays: mapValueOfType<int>(json, r'retention_days'),
        seedId: json[r'seed_id'] is Iterable
            ? (json[r'seed_id'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        url: json[r'url'] is Iterable
            ? (json[r'url'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        visitorSourceId: mapValueOfType<String>(json, r'visitor_source_id'),
      );
    }
    return null;
  }

  static List<AdAccountsAudienceRule> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountsAudienceRule>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountsAudienceRule.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdAccountsAudienceRule> mapFromJson(dynamic json) {
    final map = <String, AdAccountsAudienceRule>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdAccountsAudienceRule.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdAccountsAudienceRule-objects as value to a dart map
  static Map<String, List<AdAccountsAudienceRule>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdAccountsAudienceRule>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdAccountsAudienceRule.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

