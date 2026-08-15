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
import 'package:openapi/src/model/ad_group_common.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_group_update_request.g.dart';

/// AdGroupUpdateRequest
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
/// * [bidMultiplier] - <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
/// * [id] - Ad group ID.
@BuiltValue()
abstract class AdGroupUpdateRequest implements AdGroupCommon, Built<AdGroupUpdateRequest, AdGroupUpdateRequestBuilder> {
  /// <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>.
  @BuiltValueField(wireName: r'bid_multiplier')
  num? get bidMultiplier;

  /// Ad group ID.
  @BuiltValueField(wireName: r'id')
  String get id;

  AdGroupUpdateRequest._();

  factory AdGroupUpdateRequest([void updates(AdGroupUpdateRequestBuilder b)]) = _$AdGroupUpdateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdGroupUpdateRequestBuilder b) => b
      ..promotionId = '0';

  @BuiltValueSerializer(custom: true)
  static Serializer<AdGroupUpdateRequest> get serializer => _$AdGroupUpdateRequestSerializer();
}

class _$AdGroupUpdateRequestSerializer implements PrimitiveSerializer<AdGroupUpdateRequest> {
  @override
  final Iterable<Type> types = const [AdGroupUpdateRequest, _$AdGroupUpdateRequest];

  @override
  final String wireName = r'AdGroupUpdateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.budgetType != null) {
      yield r'budget_type';
      yield serializers.serialize(
        object.budgetType,
        specifiedType: const FullType(BudgetType),
      );
    }
    if (object.targetingTemplateIds != null) {
      yield r'targeting_template_ids';
      yield serializers.serialize(
        object.targetingTemplateIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.billableEvent != null) {
      yield r'billable_event';
      yield serializers.serialize(
        object.billableEvent,
        specifiedType: const FullType(ActionType),
      );
    }
    if (object.lifetimeFrequencyCap != null) {
      yield r'lifetime_frequency_cap';
      yield serializers.serialize(
        object.lifetimeFrequencyCap,
        specifiedType: const FullType(int),
      );
    }
    if (object.campaignId != null) {
      yield r'campaign_id';
      yield serializers.serialize(
        object.campaignId,
        specifiedType: const FullType(String),
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
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.promotionId != null) {
      yield r'promotion_id';
      yield serializers.serialize(
        object.promotionId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.autoTargetingEnabled != null) {
      yield r'auto_targeting_enabled';
      yield serializers.serialize(
        object.autoTargetingEnabled,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.pacingDeliveryType != null) {
      yield r'pacing_delivery_type';
      yield serializers.serialize(
        object.pacingDeliveryType,
        specifiedType: const FullType(PacingDeliveryType),
      );
    }
    if (object.budgetInMicroCurrency != null) {
      yield r'budget_in_micro_currency';
      yield serializers.serialize(
        object.budgetInMicroCurrency,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.optimizationGoalMetadata != null) {
      yield r'optimization_goal_metadata';
      yield serializers.serialize(
        object.optimizationGoalMetadata,
        specifiedType: const FullType.nullable(OptimizationGoalMetadata),
      );
    }
    if (object.bidStrategyType != null) {
      yield r'bid_strategy_type';
      yield serializers.serialize(
        object.bidStrategyType,
        specifiedType: const FullType.nullable(AdGroupCommonBidStrategyTypeEnum),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.placementGroup != null) {
      yield r'placement_group';
      yield serializers.serialize(
        object.placementGroup,
        specifiedType: const FullType(PlacementGroupType),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
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
    if (object.promotionApplicationLevel != null) {
      yield r'promotion_application_level';
      yield serializers.serialize(
        object.promotionApplicationLevel,
        specifiedType: const FullType.nullable(AdGroupCommonPromotionApplicationLevelEnum),
      );
    }
    if (object.targetingSpec != null) {
      yield r'targeting_spec';
      yield serializers.serialize(
        object.targetingSpec,
        specifiedType: const FullType(TargetingSpec),
      );
    }
    if (object.status != null) {
      yield r'status';
      yield serializers.serialize(
        object.status,
        specifiedType: const FullType(EntityStatus),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdGroupUpdateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdGroupUpdateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'budget_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BudgetType),
          ) as BudgetType;
          result.budgetType = valueDes;
          break;
        case r'targeting_template_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.targetingTemplateIds.replace(valueDes);
          break;
        case r'billable_event':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ActionType),
          ) as ActionType;
          result.billableEvent = valueDes;
          break;
        case r'lifetime_frequency_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.lifetimeFrequencyCap = valueDes;
          break;
        case r'campaign_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.campaignId = valueDes;
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
            specifiedType: const FullType(num),
          ) as num;
          result.bidMultiplier = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'promotion_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.promotionId = valueDes;
          break;
        case r'auto_targeting_enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.autoTargetingEnabled = valueDes;
          break;
        case r'pacing_delivery_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PacingDeliveryType),
          ) as PacingDeliveryType;
          result.pacingDeliveryType = valueDes;
          break;
        case r'budget_in_micro_currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.budgetInMicroCurrency = valueDes;
          break;
        case r'optimization_goal_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(OptimizationGoalMetadata),
          ) as OptimizationGoalMetadata?;
          if (valueDes == null) continue;
          result.optimizationGoalMetadata.replace(valueDes);
          break;
        case r'bid_strategy_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroupCommonBidStrategyTypeEnum),
          ) as AdGroupCommonBidStrategyTypeEnum?;
          if (valueDes == null) continue;
          result.bidStrategyType = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'placement_group':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PlacementGroupType),
          ) as PlacementGroupType;
          result.placementGroup = valueDes;
          break;
        case r'start_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startTime = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
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
        case r'promotion_application_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(AdGroupCommonPromotionApplicationLevelEnum),
          ) as AdGroupCommonPromotionApplicationLevelEnum?;
          if (valueDes == null) continue;
          result.promotionApplicationLevel = valueDes;
          break;
        case r'targeting_spec':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(TargetingSpec),
          ) as TargetingSpec;
          result.targetingSpec.replace(valueDes);
          break;
        case r'status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EntityStatus),
          ) as EntityStatus;
          result.status = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdGroupUpdateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdGroupUpdateRequestBuilder();
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

class AdGroupUpdateRequestBidStrategyTypeEnum extends EnumClass {

  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'AUTOMATIC_BID')
  static const AdGroupUpdateRequestBidStrategyTypeEnum AUTOMATIC_BID = _$adGroupUpdateRequestBidStrategyTypeEnum_AUTOMATIC_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'MAX_BID')
  static const AdGroupUpdateRequestBidStrategyTypeEnum MAX_BID = _$adGroupUpdateRequestBidStrategyTypeEnum_MAX_BID;
  /// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
  @BuiltValueEnumConst(wireName: r'TARGET_AVG')
  static const AdGroupUpdateRequestBidStrategyTypeEnum TARGET_AVG = _$adGroupUpdateRequestBidStrategyTypeEnum_TARGET_AVG;

  static Serializer<AdGroupUpdateRequestBidStrategyTypeEnum> get serializer => _$adGroupUpdateRequestBidStrategyTypeEnumSerializer;

  const AdGroupUpdateRequestBidStrategyTypeEnum._(String name): super(name);

  static BuiltSet<AdGroupUpdateRequestBidStrategyTypeEnum> get values => _$adGroupUpdateRequestBidStrategyTypeEnumValues;
  static AdGroupUpdateRequestBidStrategyTypeEnum valueOf(String name) => _$adGroupUpdateRequestBidStrategyTypeEnumValueOf(name);
}

class AdGroupUpdateRequestPromotionApplicationLevelEnum extends EnumClass {

  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'NONE')
  static const AdGroupUpdateRequestPromotionApplicationLevelEnum NONE = _$adGroupUpdateRequestPromotionApplicationLevelEnum_NONE;
  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'ITEM')
  static const AdGroupUpdateRequestPromotionApplicationLevelEnum ITEM = _$adGroupUpdateRequestPromotionApplicationLevelEnum_ITEM;
  /// Specify if the promotion is applied at ad group or item level
  @BuiltValueEnumConst(wireName: r'AD_GROUP')
  static const AdGroupUpdateRequestPromotionApplicationLevelEnum AD_GROUP = _$adGroupUpdateRequestPromotionApplicationLevelEnum_AD_GROUP;

  static Serializer<AdGroupUpdateRequestPromotionApplicationLevelEnum> get serializer => _$adGroupUpdateRequestPromotionApplicationLevelEnumSerializer;

  const AdGroupUpdateRequestPromotionApplicationLevelEnum._(String name): super(name);

  static BuiltSet<AdGroupUpdateRequestPromotionApplicationLevelEnum> get values => _$adGroupUpdateRequestPromotionApplicationLevelEnumValues;
  static AdGroupUpdateRequestPromotionApplicationLevelEnum valueOf(String name) => _$adGroupUpdateRequestPromotionApplicationLevelEnumValueOf(name);
}

