//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupCommon {
  /// Returns a new [AdGroupCommon] instance.
  AdGroupCommon({
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
  });

  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  bool? autoTargetingEnabled;

  /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
  int? bidInMicroCurrency;

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  AdGroupCommonBidStrategyTypeEnum? bidStrategyType;

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
  AdGroupCommonPromotionApplicationLevelEnum? promotionApplicationLevel;

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

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupCommon &&
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
    other.trackingUrls == trackingUrls;

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
    (trackingUrls == null ? 0 : trackingUrls!.hashCode);

  @override
  String toString() => 'AdGroupCommon[autoTargetingEnabled=$autoTargetingEnabled, bidInMicroCurrency=$bidInMicroCurrency, bidStrategyType=$bidStrategyType, billableEvent=$billableEvent, budgetInMicroCurrency=$budgetInMicroCurrency, budgetType=$budgetType, campaignId=$campaignId, endTime=$endTime, isCreativeOptimization=$isCreativeOptimization, lifetimeFrequencyCap=$lifetimeFrequencyCap, name=$name, optimizationGoalMetadata=$optimizationGoalMetadata, pacingDeliveryType=$pacingDeliveryType, placementGroup=$placementGroup, promotionApplicationLevel=$promotionApplicationLevel, promotionId=$promotionId, startTime=$startTime, status=$status, targetingSpec=$targetingSpec, targetingTemplateIds=$targetingTemplateIds, trackingUrls=$trackingUrls]';

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
    return json;
  }

  /// Returns a new [AdGroupCommon] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupCommon? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "AdGroupCommon[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "AdGroupCommon[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return AdGroupCommon(
        autoTargetingEnabled: mapValueOfType<bool>(json, r'auto_targeting_enabled'),
        bidInMicroCurrency: mapValueOfType<int>(json, r'bid_in_micro_currency'),
        bidStrategyType: AdGroupCommonBidStrategyTypeEnum.fromJson(json[r'bid_strategy_type']),
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
        promotionApplicationLevel: AdGroupCommonPromotionApplicationLevelEnum.fromJson(json[r'promotion_application_level']),
        promotionId: mapValueOfType<String>(json, r'promotion_id') ?? '0',
        startTime: mapValueOfType<int>(json, r'start_time'),
        status: EntityStatus.fromJson(json[r'status']),
        targetingSpec: TargetingSpec.fromJson(json[r'targeting_spec']),
        targetingTemplateIds: json[r'targeting_template_ids'] is Iterable
            ? (json[r'targeting_template_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        trackingUrls: TrackingUrls.fromJson(json[r'tracking_urls']),
      );
    }
    return null;
  }

  static List<AdGroupCommon> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupCommon>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupCommon.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupCommon> mapFromJson(dynamic json) {
    final map = <String, AdGroupCommon>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupCommon.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupCommon-objects as value to a dart map
  static Map<String, List<AdGroupCommon>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupCommon>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupCommon.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
class AdGroupCommonBidStrategyTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupCommonBidStrategyTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AUTOMATIC_BID = AdGroupCommonBidStrategyTypeEnum._(r'AUTOMATIC_BID');
  static const MAX_BID = AdGroupCommonBidStrategyTypeEnum._(r'MAX_BID');
  static const TARGET_AVG = AdGroupCommonBidStrategyTypeEnum._(r'TARGET_AVG');

  /// List of all possible values in this [enum][AdGroupCommonBidStrategyTypeEnum].
  static const values = <AdGroupCommonBidStrategyTypeEnum>[
    AUTOMATIC_BID,
    MAX_BID,
    TARGET_AVG,
  ];

  static AdGroupCommonBidStrategyTypeEnum? fromJson(dynamic value) => AdGroupCommonBidStrategyTypeEnumTypeTransformer().decode(value);

  static List<AdGroupCommonBidStrategyTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupCommonBidStrategyTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupCommonBidStrategyTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupCommonBidStrategyTypeEnum] to String,
/// and [decode] dynamic data back to [AdGroupCommonBidStrategyTypeEnum].
class AdGroupCommonBidStrategyTypeEnumTypeTransformer {
  factory AdGroupCommonBidStrategyTypeEnumTypeTransformer() => _instance ??= const AdGroupCommonBidStrategyTypeEnumTypeTransformer._();

  const AdGroupCommonBidStrategyTypeEnumTypeTransformer._();

  String encode(AdGroupCommonBidStrategyTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupCommonBidStrategyTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupCommonBidStrategyTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'AUTOMATIC_BID': return AdGroupCommonBidStrategyTypeEnum.AUTOMATIC_BID;
        case r'MAX_BID': return AdGroupCommonBidStrategyTypeEnum.MAX_BID;
        case r'TARGET_AVG': return AdGroupCommonBidStrategyTypeEnum.TARGET_AVG;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupCommonBidStrategyTypeEnumTypeTransformer] instance.
  static AdGroupCommonBidStrategyTypeEnumTypeTransformer? _instance;
}


/// Specify if the promotion is applied at ad group or item level
class AdGroupCommonPromotionApplicationLevelEnum {
  /// Instantiate a new enum with the provided [value].
  const AdGroupCommonPromotionApplicationLevelEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NONE = AdGroupCommonPromotionApplicationLevelEnum._(r'NONE');
  static const ITEM = AdGroupCommonPromotionApplicationLevelEnum._(r'ITEM');
  static const AD_GROUP = AdGroupCommonPromotionApplicationLevelEnum._(r'AD_GROUP');

  /// List of all possible values in this [enum][AdGroupCommonPromotionApplicationLevelEnum].
  static const values = <AdGroupCommonPromotionApplicationLevelEnum>[
    NONE,
    ITEM,
    AD_GROUP,
  ];

  static AdGroupCommonPromotionApplicationLevelEnum? fromJson(dynamic value) => AdGroupCommonPromotionApplicationLevelEnumTypeTransformer().decode(value);

  static List<AdGroupCommonPromotionApplicationLevelEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupCommonPromotionApplicationLevelEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupCommonPromotionApplicationLevelEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupCommonPromotionApplicationLevelEnum] to String,
/// and [decode] dynamic data back to [AdGroupCommonPromotionApplicationLevelEnum].
class AdGroupCommonPromotionApplicationLevelEnumTypeTransformer {
  factory AdGroupCommonPromotionApplicationLevelEnumTypeTransformer() => _instance ??= const AdGroupCommonPromotionApplicationLevelEnumTypeTransformer._();

  const AdGroupCommonPromotionApplicationLevelEnumTypeTransformer._();

  String encode(AdGroupCommonPromotionApplicationLevelEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a AdGroupCommonPromotionApplicationLevelEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupCommonPromotionApplicationLevelEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NONE': return AdGroupCommonPromotionApplicationLevelEnum.NONE;
        case r'ITEM': return AdGroupCommonPromotionApplicationLevelEnum.ITEM;
        case r'AD_GROUP': return AdGroupCommonPromotionApplicationLevelEnum.AD_GROUP;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdGroupCommonPromotionApplicationLevelEnumTypeTransformer] instance.
  static AdGroupCommonPromotionApplicationLevelEnumTypeTransformer? _instance;
}


