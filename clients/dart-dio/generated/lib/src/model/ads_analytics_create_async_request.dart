//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/custom_conversion_event_metrics.dart';
import 'package:openapi/src/model/campaign_objective_type.dart';
import 'package:openapi/src/model/metrics_reporting_level.dart';
import 'package:openapi/src/model/ad_group_summary_status.dart';
import 'package:openapi/src/model/reporting_column_async.dart';
import 'package:openapi/src/model/pin_promotion_summary_status.dart';
import 'package:openapi/src/model/ad_ads_analytics_async_targeting_types.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/conversion_report_attribution_type.dart';
import 'package:openapi/src/model/conversion_attribution_window_days.dart';
import 'package:openapi/src/model/campaign_summary_status.dart';
import 'package:openapi/src/model/conversion_report_time_type.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/primary_sort.dart';
import 'package:openapi/src/model/data_output_format.dart';
import 'package:openapi/src/model/ads_analytics_metrics_filter.dart';
import 'package:openapi/src/model/product_group_summary_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_create_async_request.g.dart';

/// AdsAnalyticsCreateAsyncRequest
///
/// Properties:
/// * [adGroupIds] - List of ad group ids
/// * [adGroupStatuses] - List of values for filtering
/// * [adIds] - List of ad ids. This parameter is not supported for Product Item level reports.
/// * [adStatuses] - List of values for filtering. This parameter is not supported for Product Item level reports.
/// * [attributionTypes] - List of attribution types for the conversion report.
/// * [campaignBrandLabel] - Campaign brand label for filtering.
/// * [campaignCustomLabel] - Campaign custom label for filtering.
/// * [campaignIds] - List of campaign ids
/// * [campaignObjectiveTypes] - List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
/// * [campaignStatuses] - List of status values for filtering
/// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action.
/// * [columns] - Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
/// * [combineTargetingTypes] - Determines if the targeting types included in the request should be consolidated into a single breakdown.
/// * [conversionReportTime] - Date dimension for conversion metrics.
/// * [customConversionEventMetrics] - List of advertiser-defined custom conversion event metrics to include in the report
/// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD
/// * [endHour] - Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
/// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action.
/// * [granularity] -   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
/// * [level] - Level of the report
/// * [metricsFilters] - List of metrics filters
/// * [primarySort] 
/// * [productGroupIds] - List of product group ids
/// * [productGroupStatuses] - List of values for filtering
/// * [productItemIds] - List of product item ids
/// * [reportFormat] 
/// * [reportingTimezone] - Specify the timezone to be applied for the reporting.
/// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD
/// * [startHour] - Which hour of the start date to begin the report. Only allowed for hourly reports.
/// * [targetingTypes] - List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
/// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action.
@BuiltValue()
abstract class AdsAnalyticsCreateAsyncRequest implements Built<AdsAnalyticsCreateAsyncRequest, AdsAnalyticsCreateAsyncRequestBuilder> {
  /// List of ad group ids
  @BuiltValueField(wireName: r'ad_group_ids')
  BuiltList<String>? get adGroupIds;

  /// List of values for filtering
  @BuiltValueField(wireName: r'ad_group_statuses')
  BuiltList<AdGroupSummaryStatus>? get adGroupStatuses;

  /// List of ad ids. This parameter is not supported for Product Item level reports.
  @BuiltValueField(wireName: r'ad_ids')
  BuiltList<String>? get adIds;

  /// List of values for filtering. This parameter is not supported for Product Item level reports.
  @BuiltValueField(wireName: r'ad_statuses')
  BuiltList<PinPromotionSummaryStatus>? get adStatuses;

  /// List of attribution types for the conversion report.
  @BuiltValueField(wireName: r'attribution_types')
  BuiltList<ConversionReportAttributionType>? get attributionTypes;

  /// Campaign brand label for filtering.
  @BuiltValueField(wireName: r'campaign_brand_label')
  String? get campaignBrandLabel;

  /// Campaign custom label for filtering.
  @BuiltValueField(wireName: r'campaign_custom_label')
  String? get campaignCustomLabel;

  /// List of campaign ids
  @BuiltValueField(wireName: r'campaign_ids')
  BuiltList<String>? get campaignIds;

  /// List of values for filtering. [\"WEB_SESSIONS\"] is in BETA.
  @BuiltValueField(wireName: r'campaign_objective_types')
  BuiltList<CampaignObjectiveType>? get campaignObjectiveTypes;

  /// List of status values for filtering
  @BuiltValueField(wireName: r'campaign_statuses')
  BuiltList<CampaignSummaryStatus>? get campaignStatuses;

  /// Number of days to use as the conversion attribution window for a pin click action.
  @BuiltValueField(wireName: r'click_window_days')
  ConversionAttributionWindowDays? get clickWindowDays;
  // enum clickWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports.
  @BuiltValueField(wireName: r'columns')
  BuiltList<ReportingColumnAsync>? get columns;

  /// Determines if the targeting types included in the request should be consolidated into a single breakdown.
  @BuiltValueField(wireName: r'combine_targeting_types')
  bool? get combineTargetingTypes;

  /// Date dimension for conversion metrics.
  @BuiltValueField(wireName: r'conversion_report_time')
  ConversionReportTimeType? get conversionReportTime;
  // enum conversionReportTimeEnum {  TIME_OF_AD_ACTION,  TIME_OF_CONVERSION,  };

  /// List of advertiser-defined custom conversion event metrics to include in the report
  @BuiltValueField(wireName: r'custom_conversion_event_metrics')
  BuiltList<CustomConversionEventMetrics>? get customConversionEventMetrics;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports.
  @BuiltValueField(wireName: r'end_hour')
  int? get endHour;

  /// Number of days to use as the conversion attribution window for an engagement action.
  @BuiltValueField(wireName: r'engagement_window_days')
  ConversionAttributionWindowDays? get engagementWindowDays;
  // enum engagementWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  ///   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly.
  @BuiltValueField(wireName: r'granularity')
  Granularity get granularity;
  // enum granularityEnum {  TOTAL,  DAY,  HOUR,  WEEK,  MONTH,  };

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  MetricsReportingLevel? get level;
  // enum levelEnum {  ADVERTISER,  ADVERTISER_TARGETING,  CAMPAIGN,  CAMPAIGN_TARGETING,  AD_GROUP,  AD_GROUP_TARGETING,  PIN_PROMOTION,  PIN_PROMOTION_TARGETING,  KEYWORD,  PRODUCT_GROUP,  PRODUCT_GROUP_TARGETING,  PRODUCT_ITEM,  PRODUCT_ITEM_TARGETING,  };

  /// List of metrics filters
  @BuiltValueField(wireName: r'metrics_filters')
  BuiltList<AdsAnalyticsMetricsFilter>? get metricsFilters;

  @BuiltValueField(wireName: r'primary_sort')
  PrimarySort? get primarySort;
  // enum primarySortEnum {  BY_ID,  BY_DATE,  };

  /// List of product group ids
  @BuiltValueField(wireName: r'product_group_ids')
  BuiltList<String>? get productGroupIds;

  /// List of values for filtering
  @BuiltValueField(wireName: r'product_group_statuses')
  BuiltList<ProductGroupSummaryStatus>? get productGroupStatuses;

  /// List of product item ids
  @BuiltValueField(wireName: r'product_item_ids')
  BuiltList<String>? get productItemIds;

  @BuiltValueField(wireName: r'report_format')
  DataOutputFormat? get reportFormat;
  // enum reportFormatEnum {  JSON,  CSV,  };

  /// Specify the timezone to be applied for the reporting.
  @BuiltValueField(wireName: r'reporting_timezone')
  ReportingTimeZone? get reportingTimezone;
  // enum reportingTimezoneEnum {  PINTEREST_TIME_ZONE,  AD_ACCOUNT_TIME_ZONE,  };

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// Which hour of the start date to begin the report. Only allowed for hourly reports.
  @BuiltValueField(wireName: r'start_hour')
  int? get startHour;

  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`.
  @BuiltValueField(wireName: r'targeting_types')
  BuiltList<AdAdsAnalyticsAsyncTargetingTypes>? get targetingTypes;

  /// Number of days to use as the conversion attribution window for a view action.
  @BuiltValueField(wireName: r'view_window_days')
  ConversionAttributionWindowDays? get viewWindowDays;
  // enum viewWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  AdsAnalyticsCreateAsyncRequest._();

  factory AdsAnalyticsCreateAsyncRequest([void updates(AdsAnalyticsCreateAsyncRequestBuilder b)]) = _$AdsAnalyticsCreateAsyncRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsCreateAsyncRequestBuilder b) => b
      ..clickWindowDays = 30
      ..combineTargetingTypes = false
      ..conversionReportTime = ConversionReportTimeType.TIME_OF_AD_ACTION
      ..engagementWindowDays = 30
      ..primarySort = PrimarySort.BY_ID
      ..reportFormat = DataOutputFormat.JSON
      ..viewWindowDays = 1;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdsAnalyticsCreateAsyncRequest> get serializer => _$AdsAnalyticsCreateAsyncRequestSerializer();
}

class _$AdsAnalyticsCreateAsyncRequestSerializer implements PrimitiveSerializer<AdsAnalyticsCreateAsyncRequest> {
  @override
  final Iterable<Type> types = const [AdsAnalyticsCreateAsyncRequest, _$AdsAnalyticsCreateAsyncRequest];

  @override
  final String wireName = r'AdsAnalyticsCreateAsyncRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdsAnalyticsCreateAsyncRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adGroupIds != null) {
      yield r'ad_group_ids';
      yield serializers.serialize(
        object.adGroupIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.adGroupStatuses != null) {
      yield r'ad_group_statuses';
      yield serializers.serialize(
        object.adGroupStatuses,
        specifiedType: const FullType(BuiltList, [FullType(AdGroupSummaryStatus)]),
      );
    }
    if (object.adIds != null) {
      yield r'ad_ids';
      yield serializers.serialize(
        object.adIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.adStatuses != null) {
      yield r'ad_statuses';
      yield serializers.serialize(
        object.adStatuses,
        specifiedType: const FullType(BuiltList, [FullType(PinPromotionSummaryStatus)]),
      );
    }
    if (object.attributionTypes != null) {
      yield r'attribution_types';
      yield serializers.serialize(
        object.attributionTypes,
        specifiedType: const FullType(BuiltList, [FullType(ConversionReportAttributionType)]),
      );
    }
    if (object.campaignBrandLabel != null) {
      yield r'campaign_brand_label';
      yield serializers.serialize(
        object.campaignBrandLabel,
        specifiedType: const FullType(String),
      );
    }
    if (object.campaignCustomLabel != null) {
      yield r'campaign_custom_label';
      yield serializers.serialize(
        object.campaignCustomLabel,
        specifiedType: const FullType(String),
      );
    }
    if (object.campaignIds != null) {
      yield r'campaign_ids';
      yield serializers.serialize(
        object.campaignIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.campaignObjectiveTypes != null) {
      yield r'campaign_objective_types';
      yield serializers.serialize(
        object.campaignObjectiveTypes,
        specifiedType: const FullType(BuiltList, [FullType(CampaignObjectiveType)]),
      );
    }
    if (object.campaignStatuses != null) {
      yield r'campaign_statuses';
      yield serializers.serialize(
        object.campaignStatuses,
        specifiedType: const FullType(BuiltList, [FullType(CampaignSummaryStatus)]),
      );
    }
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
    if (object.columns != null) {
      yield r'columns';
      yield serializers.serialize(
        object.columns,
        specifiedType: const FullType(BuiltList, [FullType(ReportingColumnAsync)]),
      );
    }
    if (object.combineTargetingTypes != null) {
      yield r'combine_targeting_types';
      yield serializers.serialize(
        object.combineTargetingTypes,
        specifiedType: const FullType(bool),
      );
    }
    if (object.conversionReportTime != null) {
      yield r'conversion_report_time';
      yield serializers.serialize(
        object.conversionReportTime,
        specifiedType: const FullType(ConversionReportTimeType),
      );
    }
    if (object.customConversionEventMetrics != null) {
      yield r'custom_conversion_event_metrics';
      yield serializers.serialize(
        object.customConversionEventMetrics,
        specifiedType: const FullType(BuiltList, [FullType(CustomConversionEventMetrics)]),
      );
    }
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
    if (object.endHour != null) {
      yield r'end_hour';
      yield serializers.serialize(
        object.endHour,
        specifiedType: const FullType(int),
      );
    }
    if (object.engagementWindowDays != null) {
      yield r'engagement_window_days';
      yield serializers.serialize(
        object.engagementWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
    yield r'granularity';
    yield serializers.serialize(
      object.granularity,
      specifiedType: const FullType(Granularity),
    );
    if (object.level != null) {
      yield r'level';
      yield serializers.serialize(
        object.level,
        specifiedType: const FullType(MetricsReportingLevel),
      );
    }
    if (object.metricsFilters != null) {
      yield r'metrics_filters';
      yield serializers.serialize(
        object.metricsFilters,
        specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsMetricsFilter)]),
      );
    }
    if (object.primarySort != null) {
      yield r'primary_sort';
      yield serializers.serialize(
        object.primarySort,
        specifiedType: const FullType(PrimarySort),
      );
    }
    if (object.productGroupIds != null) {
      yield r'product_group_ids';
      yield serializers.serialize(
        object.productGroupIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.productGroupStatuses != null) {
      yield r'product_group_statuses';
      yield serializers.serialize(
        object.productGroupStatuses,
        specifiedType: const FullType(BuiltList, [FullType(ProductGroupSummaryStatus)]),
      );
    }
    if (object.productItemIds != null) {
      yield r'product_item_ids';
      yield serializers.serialize(
        object.productItemIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.reportFormat != null) {
      yield r'report_format';
      yield serializers.serialize(
        object.reportFormat,
        specifiedType: const FullType(DataOutputFormat),
      );
    }
    if (object.reportingTimezone != null) {
      yield r'reporting_timezone';
      yield serializers.serialize(
        object.reportingTimezone,
        specifiedType: const FullType(ReportingTimeZone),
      );
    }
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
    if (object.startHour != null) {
      yield r'start_hour';
      yield serializers.serialize(
        object.startHour,
        specifiedType: const FullType(int),
      );
    }
    if (object.targetingTypes != null) {
      yield r'targeting_types';
      yield serializers.serialize(
        object.targetingTypes,
        specifiedType: const FullType(BuiltList, [FullType(AdAdsAnalyticsAsyncTargetingTypes)]),
      );
    }
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdsAnalyticsCreateAsyncRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdsAnalyticsCreateAsyncRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adGroupIds.replace(valueDes);
          break;
        case r'ad_group_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdGroupSummaryStatus)]),
          ) as BuiltList<AdGroupSummaryStatus>?;
          if (valueDes == null) continue;
          result.adGroupStatuses.replace(valueDes);
          break;
        case r'ad_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adIds.replace(valueDes);
          break;
        case r'ad_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(PinPromotionSummaryStatus)]),
          ) as BuiltList<PinPromotionSummaryStatus>?;
          if (valueDes == null) continue;
          result.adStatuses.replace(valueDes);
          break;
        case r'attribution_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ConversionReportAttributionType)]),
          ) as BuiltList<ConversionReportAttributionType>?;
          if (valueDes == null) continue;
          result.attributionTypes.replace(valueDes);
          break;
        case r'campaign_brand_label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.campaignBrandLabel = valueDes;
          break;
        case r'campaign_custom_label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.campaignCustomLabel = valueDes;
          break;
        case r'campaign_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.campaignIds.replace(valueDes);
          break;
        case r'campaign_objective_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignObjectiveType)]),
          ) as BuiltList<CampaignObjectiveType>?;
          if (valueDes == null) continue;
          result.campaignObjectiveTypes.replace(valueDes);
          break;
        case r'campaign_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CampaignSummaryStatus)]),
          ) as BuiltList<CampaignSummaryStatus>?;
          if (valueDes == null) continue;
          result.campaignStatuses.replace(valueDes);
          break;
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.clickWindowDays = valueDes;
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ReportingColumnAsync)]),
          ) as BuiltList<ReportingColumnAsync>?;
          if (valueDes == null) continue;
          result.columns.replace(valueDes);
          break;
        case r'combine_targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.combineTargetingTypes = valueDes;
          break;
        case r'conversion_report_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionReportTimeType),
          ) as ConversionReportTimeType?;
          if (valueDes == null) continue;
          result.conversionReportTime = valueDes;
          break;
        case r'custom_conversion_event_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(CustomConversionEventMetrics)]),
          ) as BuiltList<CustomConversionEventMetrics>?;
          if (valueDes == null) continue;
          result.customConversionEventMetrics.replace(valueDes);
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'end_hour':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.endHour = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.engagementWindowDays = valueDes;
          break;
        case r'granularity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Granularity),
          ) as Granularity;
          result.granularity = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MetricsReportingLevel),
          ) as MetricsReportingLevel?;
          if (valueDes == null) continue;
          result.level = valueDes;
          break;
        case r'metrics_filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdsAnalyticsMetricsFilter)]),
          ) as BuiltList<AdsAnalyticsMetricsFilter>?;
          if (valueDes == null) continue;
          result.metricsFilters.replace(valueDes);
          break;
        case r'primary_sort':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(PrimarySort),
          ) as PrimarySort?;
          if (valueDes == null) continue;
          result.primarySort = valueDes;
          break;
        case r'product_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productGroupIds.replace(valueDes);
          break;
        case r'product_group_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ProductGroupSummaryStatus)]),
          ) as BuiltList<ProductGroupSummaryStatus>?;
          if (valueDes == null) continue;
          result.productGroupStatuses.replace(valueDes);
          break;
        case r'product_item_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.productItemIds.replace(valueDes);
          break;
        case r'report_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DataOutputFormat),
          ) as DataOutputFormat?;
          if (valueDes == null) continue;
          result.reportFormat = valueDes;
          break;
        case r'reporting_timezone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ReportingTimeZone),
          ) as ReportingTimeZone?;
          if (valueDes == null) continue;
          result.reportingTimezone = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        case r'start_hour':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.startHour = valueDes;
          break;
        case r'targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(AdAdsAnalyticsAsyncTargetingTypes)]),
          ) as BuiltList<AdAdsAnalyticsAsyncTargetingTypes>?;
          if (valueDes == null) continue;
          result.targetingTypes.replace(valueDes);
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays?;
          if (valueDes == null) continue;
          result.viewWindowDays = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdsAnalyticsCreateAsyncRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdsAnalyticsCreateAsyncRequestBuilder();
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

