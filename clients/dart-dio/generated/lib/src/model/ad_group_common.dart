//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/budget_type.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/targeting_spec.dart';
import 'package:openapi/src/model/optimization_goal_metadata.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/pacing_delivery_type.dart';
import 'package:openapi/src/model/action_type.dart';
import 'package:openapi/src/model/placement_group_type.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_common.g.dart';

/// AdGroupCommon
///
/// Properties:
/// * [autoTargetingEnabled] - Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
/// * [bidInMicroCurrency] - Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
/// * [bidStrategyType] - Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
/// * [billableEvent] 
/// * [budgetInMicroCurrency] - Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups.
/// * [budgetType] 
/// * [campaignId] - Campaign ID of the ad group.
/// * [endTime] - Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
/// * [isCreativeOptimization] - Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
/// * [lifetimeFrequencyCap] - Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
/// * [name] - Ad group name.
/// * [optimizationGoalMetadata] - Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
/// * [pacingDeliveryType] 
/// * [placementGroup] - <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
/// * [promotionApplicationLevel] - Specify if the promotion is applied at ad group or item level
/// * [promotionId] - Promotion ID. To clear this field, set to null.
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
/// * [status] - Ad group/entity status.
/// * [targetingSpec] 
/// * [targetingTemplateIds] - Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
/// * [trackingUrls] - Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
@BuiltValue(instantiable: false)
abstract class AdGroupCommon  {
  /// Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  @BuiltValueField(wireName: r'auto_targeting_enabled')
  bool? get autoTargetingEnabled;

  /// Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH.
  @BuiltValueField(wireName: r'bid_in_micro_currency')
  int? get bidInMicroCurrency;

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueField(wireName: r'bid_strategy_type')
  AdGroupCommonBidStrategyTypeEnum? get bidStrategyType;
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

  /// Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale.
  @BuiltValueField(wireName: r'is_creative_optimization')
  bool? get isCreativeOptimization;

  /// Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field.
  @BuiltValueField(wireName: r'lifetime_frequency_cap')
  int? get lifetimeFrequencyCap;

  /// Ad group name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Optimization goals for objective-based performance campaigns. **REQUIRED** when campaign's `objective_type` is set to `\"WEB_CONVERSION\"`.
  @BuiltValueField(wireName: r'optimization_goal_metadata')
  OptimizationGoalMetadata? get optimizationGoalMetadata;

  @BuiltValueField(wireName: r'pacing_delivery_type')
  PacingDeliveryType? get pacingDeliveryType;
  // enum pacingDeliveryTypeEnum {  STANDARD,  ACCELERATED,  };

  /// <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  @BuiltValueField(wireName: r'placement_group')
  PlacementGroupType? get placementGroup;
  // enum placementGroupEnum {  ALL,  SEARCH,  BROWSE,  OTHER,  };

  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueField(wireName: r'promotion_application_level')
  AdGroupCommonPromotionApplicationLevelEnum? get promotionApplicationLevel;
  // enum promotionApplicationLevelEnum {  NONE,  ITEM,  AD_GROUP,  ,  };

  /// Promotion ID. To clear this field, set to null.
  @BuiltValueField(wireName: r'promotion_id')
  String? get promotionId;

  /// Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  /// Ad group/entity status.
  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'targeting_spec')
  TargetingSpec? get targetingSpec;

  /// Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0'].
  @BuiltValueField(wireName: r'targeting_template_ids')
  BuiltList<String>? get targetingTemplateIds;

  /// Third-party tracking URLs.<br> JSON object with the format: {\"<a href=\"/docs/redoc/#section/Tracking-URL-event\">Tracking event enum</a>\":[URL string array],...}<br> For example: {\"impression\": [\"URL1\", \"URL2\"], \"click\": [\"URL1\", \"URL2\", \"URL3\"]}.<br>Up to three tracking URLs are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. May be null. Pass in an empty object - {} - to remove tracking URLs.<br><br> For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupCommon> get serializer => _$AdGroupCommonSerializer();
}

class _$AdGroupCommonSerializer implements PrimitiveSerializer<AdGroupCommon> {
  @override
  final Iterable<Type> types = const [AdGroupCommon];

  @override
  final String wireName = r'AdGroupCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupCommon object, {
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
    if (object.bidStrategyType != null) {
      yield r'bid_strategy_type';
      yield serializers.serialize(
        object.bidStrategyType,
        specifiedType: const FullType.nullable(AdGroupCommonBidStrategyTypeEnum),
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
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isCreativeOptimization != null) {
      yield r'is_creative_optimization';
      yield serializers.serialize(
        object.isCreativeOptimization,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.lifetimeFrequencyCap != null) {
      yield r'lifetime_frequency_cap';
      yield serializers.serialize(
        object.lifetimeFrequencyCap,
        specifiedType: const FullType(int),
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
        specifiedType: const FullType.nullable(OptimizationGoalMetadata),
      );
    }
    if (object.pacingDeliveryType != null) {
      yield r'pacing_delivery_type';
      yield serializers.serialize(
        object.pacingDeliveryType,
        specifiedType: const FullType(PacingDeliveryType),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.promotionApplicationLevel != null) {
      yield r'promotion_application_level';
      yield serializers.serialize(
        object.promotionApplicationLevel,
        specifiedType: const FullType.nullable(AdGroupCommonPromotionApplicationLevelEnum),
      );
    }
    if (object.promotionId != null) {
      yield r'promotion_id';
      yield serializers.serialize(
        object.promotionId,
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
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpec),
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
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  AdGroupCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($AdGroupCommon)) as $AdGroupCommon;
  }
}

/// a concrete implementation of [AdGroupCommon], since [AdGroupCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $AdGroupCommon implements AdGroupCommon, Built<$AdGroupCommon, $AdGroupCommonBuilder> {
  $AdGroupCommon._();

  factory $AdGroupCommon([void Function($AdGroupCommonBuilder)? updates]) = _$$AdGroupCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($AdGroupCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$AdGroupCommon> get serializer => _$$AdGroupCommonSerializer();
}

class _$$AdGroupCommonSerializer implements PrimitiveSerializer<$AdGroupCommon> {
  @override
  final Iterable<Type> types = const [$AdGroupCommon, _$$AdGroupCommon];

  @override
  final String wireName = r'$AdGroupCommon';

  @override
  Object serialize(
    Serializers serializers,
    $AdGroupCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(AdGroupCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupCommonBuilder result,
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
        case r'bid_strategy_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroupCommonBidStrategyTypeEnum),
          ) as AdGroupCommonBidStrategyTypeEnum?;
          if (valueDes == null) continue;
          result.bidStrategyType = valueDes;
          break;
        case r'billable_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ActionType),
          ) as ActionType;
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
            specifiedType: const FullType(BudgetType),
          ) as BudgetType;
          result.budgetType = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.campaignId = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'is_creative_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCreativeOptimization = valueDes;
          break;
        case r'lifetime_frequency_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lifetimeFrequencyCap = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'optimization_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationGoalMetadata),
          ) as OptimizationGoalMetadata?;
          if (valueDes == null) continue;
          result.optimizationGoalMetadata.replace(valueDes);
          break;
        case r'pacing_delivery_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PacingDeliveryType),
          ) as PacingDeliveryType;
          result.pacingDeliveryType = valueDes;
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PlacementGroupType),
          ) as PlacementGroupType;
          result.placementGroup = valueDes;
          break;
        case r'promotion_application_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroupCommonPromotionApplicationLevelEnum),
          ) as AdGroupCommonPromotionApplicationLevelEnum?;
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
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        case r'targeting_spec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
          result.targetingSpec.replace(valueDes);
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
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
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
  $AdGroupCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $AdGroupCommonBuilder();
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

class AdGroupCommonBidStrategyTypeEnum extends EnumClass {

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'AUTOMATIC_BID')
  static const AdGroupCommonBidStrategyTypeEnum AUTOMATIC_BID = _$adGroupCommonBidStrategyTypeEnum_AUTOMATIC_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'MAX_BID')
  static const AdGroupCommonBidStrategyTypeEnum MAX_BID = _$adGroupCommonBidStrategyTypeEnum_MAX_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'TARGET_AVG')
  static const AdGroupCommonBidStrategyTypeEnum TARGET_AVG = _$adGroupCommonBidStrategyTypeEnum_TARGET_AVG;

  static Serializer<AdGroupCommonBidStrategyTypeEnum> get serializer => _$adGroupCommonBidStrategyTypeEnumSerializer;

  const AdGroupCommonBidStrategyTypeEnum._(String name): super(name);

  static BuiltSet<AdGroupCommonBidStrategyTypeEnum> get values => _$adGroupCommonBidStrategyTypeEnumValues;
  static AdGroupCommonBidStrategyTypeEnum valueOf(String name) => _$adGroupCommonBidStrategyTypeEnumValueOf(name);
}

class AdGroupCommonPromotionApplicationLevelEnum extends EnumClass {

  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'NONE')
  static const AdGroupCommonPromotionApplicationLevelEnum NONE = _$adGroupCommonPromotionApplicationLevelEnum_NONE;
  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'ITEM')
  static const AdGroupCommonPromotionApplicationLevelEnum ITEM = _$adGroupCommonPromotionApplicationLevelEnum_ITEM;
  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const AdGroupCommonPromotionApplicationLevelEnum AD_GROUP = _$adGroupCommonPromotionApplicationLevelEnum_AD_GROUP;

  static Serializer<AdGroupCommonPromotionApplicationLevelEnum> get serializer => _$adGroupCommonPromotionApplicationLevelEnumSerializer;

  const AdGroupCommonPromotionApplicationLevelEnum._(String name): super(name);

  static BuiltSet<AdGroupCommonPromotionApplicationLevelEnum> get values => _$adGroupCommonPromotionApplicationLevelEnumValues;
  static AdGroupCommonPromotionApplicationLevelEnum valueOf(String name) => _$adGroupCommonPromotionApplicationLevelEnumValueOf(name);
}

