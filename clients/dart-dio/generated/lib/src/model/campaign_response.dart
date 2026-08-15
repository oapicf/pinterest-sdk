//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/campaign_bid_options.dart';
import 'package:openapi/src/model/campaign_summary_status.dart';
import 'package:openapi/src/model/objective_type.dart';
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:openapi/src/model/campaign_common.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:openapi/src/model/campaign_id.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_response.g.dart';

/// CampaignResponse
///
/// Properties:
/// * [id] - Campaign ID.
/// * [adAccountId] - Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
/// * [dailySpendCap] - Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
/// * [endTime] - Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [isAutomatedCampaign] - Specifies whether the campaign was created in the automated campaign flow
/// * [isFlexibleDailyBudgets] - Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
/// * [lifetimeSpendCap] - Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
/// * [name] - Campaign name.
/// * [orderLineId] - Order line ID that appears on the invoice.
/// * [startTime] - Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
/// * [status] 
/// * [trackingUrls] 
/// * [bidOptions] 
/// * [createdTime] - Campaign creation time. Unix timestamp in seconds.
/// * [isCampaignBudgetOptimization] - Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
/// * [isPerformancePlus] - Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
/// * [objectiveType] 
/// * [summaryStatus] 
/// * [type] - Always \"campaign\".
/// * [updatedTime] - UTC timestamp. Last update time.
@BuiltValue(instantiable: false)
abstract class CampaignResponse implements CampaignCommon, CampaignId {
  /// UTC timestamp. Last update time.
  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  @BuiltValueField(wireName: r'bid_options')
  CampaignBidOptions? get bidOptions;

  @BuiltValueField(wireName: r'summary_status')
  CampaignSummaryStatus? get summaryStatus;
  // enum summaryStatusEnum {  RUNNING,  PAUSED,  NOT_STARTED,  COMPLETED,  ADVERTISER_DISABLED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  /// Campaign creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  /// Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>.
  @BuiltValueField(wireName: r'is_performance_plus')
  bool? get isPerformancePlus;

  /// Always \"campaign\".
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
  @BuiltValueField(wireName: r'is_campaign_budget_optimization')
  bool? get isCampaignBudgetOptimization;

  @BuiltValueField(wireName: r'objective_type')
  ObjectiveType? get objectiveType;
  // enum objectiveTypeEnum {  AWARENESS,  CONSIDERATION,  WEB_CONVERSION,  CATALOG_SALES,  VIDEO_COMPLETION,  };

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignResponse> get serializer => _$CampaignResponseSerializer();
}

class _$CampaignResponseSerializer implements PrimitiveSerializer<CampaignResponse> {
  @override
  final Iterable<Type> types = const [CampaignResponse];

  @override
  final String wireName = r'CampaignResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.bidOptions != null) {
      yield r'bid_options';
      yield serializers.serialize(
        object.bidOptions,
        specifiedType: const FullType.nullable(CampaignBidOptions),
      );
    }
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.isFlexibleDailyBudgets != null) {
      yield r'is_flexible_daily_budgets';
      yield serializers.serialize(
        object.isFlexibleDailyBudgets,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.lifetimeSpendCap != null) {
      yield r'lifetime_spend_cap';
      yield serializers.serialize(
        object.lifetimeSpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.isAutomatedCampaign != null) {
      yield r'is_automated_campaign';
      yield serializers.serialize(
        object.isAutomatedCampaign,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isPerformancePlus != null) {
      yield r'is_performance_plus';
      yield serializers.serialize(
        object.isPerformancePlus,
        specifiedType: const FullType(bool),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.trackingUrls != null) {
      yield r'tracking_urls';
      yield serializers.serialize(
        object.trackingUrls,
        specifiedType: const FullType.nullable(TrackingUrls),
      );
    }
    if (object.objectiveType != null) {
      yield r'objective_type';
      yield serializers.serialize(
        object.objectiveType,
        specifiedType: const FullType(ObjectiveType),
      );
    }
    if (object.summaryStatus != null) {
      yield r'summary_status';
      yield serializers.serialize(
        object.summaryStatus,
        specifiedType: const FullType(CampaignSummaryStatus),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType(int),
      );
    }
    if (object.startTime != null) {
      yield r'start_time';
      yield serializers.serialize(
        object.startTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.id != null) {
      yield r'id';
      yield serializers.serialize(
        object.id,
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
    if (object.dailySpendCap != null) {
      yield r'daily_spend_cap';
      yield serializers.serialize(
        object.dailySpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.orderLineId != null) {
      yield r'order_line_id';
      yield serializers.serialize(
        object.orderLineId,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.isCampaignBudgetOptimization != null) {
      yield r'is_campaign_budget_optimization';
      yield serializers.serialize(
        object.isCampaignBudgetOptimization,
        specifiedType: const FullType.nullable(bool),
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
    CampaignResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignResponse)) as $CampaignResponse;
  }
}

/// a concrete implementation of [CampaignResponse], since [CampaignResponse] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignResponse implements CampaignResponse, Built<$CampaignResponse, $CampaignResponseBuilder> {
  $CampaignResponse._();

  factory $CampaignResponse([void Function($CampaignResponseBuilder)? updates]) = _$$CampaignResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignResponse> get serializer => _$$CampaignResponseSerializer();
}

class _$$CampaignResponseSerializer implements PrimitiveSerializer<$CampaignResponse> {
  @override
  final Iterable<Type> types = const [$CampaignResponse, _$$CampaignResponse];

  @override
  final String wireName = r'$CampaignResponse';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignResponse))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.updatedTime = valueDes;
          break;
        case r'bid_options':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CampaignBidOptions),
          ) as CampaignBidOptions?;
          if (valueDes == null) continue;
          result.bidOptions = valueDes;
          break;
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'is_flexible_daily_budgets':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isFlexibleDailyBudgets = valueDes;
          break;
        case r'lifetime_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.lifetimeSpendCap = valueDes;
          break;
        case r'is_automated_campaign':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAutomatedCampaign = valueDes;
          break;
        case r'is_performance_plus':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.isPerformancePlus = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.type = valueDes;
          break;
        case r'tracking_urls':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(TrackingUrls),
          ) as TrackingUrls?;
          if (valueDes == null) continue;
          result.trackingUrls.replace(valueDes);
          break;
        case r'objective_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ObjectiveType),
          ) as ObjectiveType;
          result.objectiveType = valueDes;
          break;
        case r'summary_status':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CampaignSummaryStatus),
          ) as CampaignSummaryStatus;
          result.summaryStatus = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.createdTime = valueDes;
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
        case r'daily_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.dailySpendCap = valueDes;
          break;
        case r'order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderLineId = valueDes;
          break;
        case r'is_campaign_budget_optimization':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isCampaignBudgetOptimization = valueDes;
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
  $CampaignResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignResponseBuilder();
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

