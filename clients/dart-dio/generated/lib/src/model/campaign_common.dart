//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/tracking_urls.dart';
import 'package:openapi/src/model/entity_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'campaign_common.g.dart';

/// Campaign Data
///
/// Properties:
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
@BuiltValue(instantiable: false)
abstract class CampaignCommon  {
  /// Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
  @BuiltValueField(wireName: r'daily_spend_cap')
  int? get dailySpendCap;

  /// Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'end_time')
  int? get endTime;

  /// Specifies whether the campaign was created in the automated campaign flow
  @BuiltValueField(wireName: r'is_automated_campaign')
  bool? get isAutomatedCampaign;

  /// Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\".
  @BuiltValueField(wireName: r'is_flexible_daily_budgets')
  bool? get isFlexibleDailyBudgets;

  /// Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
  @BuiltValueField(wireName: r'lifetime_spend_cap')
  int? get lifetimeSpendCap;

  /// Campaign name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Order line ID that appears on the invoice.
  @BuiltValueField(wireName: r'order_line_id')
  String? get orderLineId;

  /// Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
  @BuiltValueField(wireName: r'start_time')
  int? get startTime;

  @BuiltValueField(wireName: r'status')
  EntityStatus? get status;
  // enum statusEnum {  ACTIVE,  PAUSED,  ARCHIVED,  DRAFT,  DELETED_DRAFT,  };

  @BuiltValueField(wireName: r'tracking_urls')
  TrackingUrls? get trackingUrls;

  @BuiltValueSerializer(custom: true)
  static Serializer<CampaignCommon> get serializer => _$CampaignCommonSerializer();
}

class _$CampaignCommonSerializer implements PrimitiveSerializer<CampaignCommon> {
  @override
  final Iterable<Type> types = const [CampaignCommon];

  @override
  final String wireName = r'CampaignCommon';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CampaignCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.dailySpendCap != null) {
      yield r'daily_spend_cap';
      yield serializers.serialize(
        object.dailySpendCap,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.endTime != null) {
      yield r'end_time';
      yield serializers.serialize(
        object.endTime,
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
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.orderLineId != null) {
      yield r'order_line_id';
      yield serializers.serialize(
        object.orderLineId,
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
    CampaignCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  @override
  CampaignCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.deserialize(serialized, specifiedType: FullType($CampaignCommon)) as $CampaignCommon;
  }
}

/// a concrete implementation of [CampaignCommon], since [CampaignCommon] is not instantiable
@BuiltValue(instantiable: true)
abstract class $CampaignCommon implements CampaignCommon, Built<$CampaignCommon, $CampaignCommonBuilder> {
  $CampaignCommon._();

  factory $CampaignCommon([void Function($CampaignCommonBuilder)? updates]) = _$$CampaignCommon;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults($CampaignCommonBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<$CampaignCommon> get serializer => _$$CampaignCommonSerializer();
}

class _$$CampaignCommonSerializer implements PrimitiveSerializer<$CampaignCommon> {
  @override
  final Iterable<Type> types = const [$CampaignCommon, _$$CampaignCommon];

  @override
  final String wireName = r'$CampaignCommon';

  @override
  Object serialize(
    Serializers serializers,
    $CampaignCommon object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return serializers.serialize(object, specifiedType: FullType(CampaignCommon))!;
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CampaignCommonBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.adAccountId = valueDes;
          break;
        case r'daily_spend_cap':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.dailySpendCap = valueDes;
          break;
        case r'end_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endTime = valueDes;
          break;
        case r'is_automated_campaign':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isAutomatedCampaign = valueDes;
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
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'order_line_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.orderLineId = valueDes;
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
  $CampaignCommon deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = $CampaignCommonBuilder();
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

