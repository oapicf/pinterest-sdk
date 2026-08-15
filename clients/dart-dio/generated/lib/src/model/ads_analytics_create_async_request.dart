//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/metrics_reporting_level.dart';
import 'package:openapi/src/model/ad_group_summary_status.dart';
import 'package:openapi/src/model/reporting_column_async.dart';
import 'package:openapi/src/model/pin_promotion_summary_status.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/conversion_report_attribution_type.dart';
import 'package:openapi/src/model/conversion_attribution_window_days.dart';
import 'package:openapi/src/model/campaign_summary_status.dart';
import 'package:openapi/src/model/ads_analytics_create_async_request_all_of_custom_conversion_event_metrics.dart';
import 'package:openapi/src/model/conversion_report_time_type.dart';
import 'package:openapi/src/model/objective_type.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/data_output_format.dart';
import 'package:openapi/src/model/ads_analytics_metrics_filter.dart';
import 'package:openapi/src/model/product_group_summary_status.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_create_async_request.g.dart';

/// AdsAnalyticsCreateAsyncRequest
///
/// Properties:
/// * [attributionTypes] - List of types of attribution for the conversion report
/// * [clickWindowDays] - Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
/// * [conversionReportTime] - The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
/// * [endDate] - Metric report end date (UTC). Format: YYYY-MM-DD
/// * [engagementWindowDays] - Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
/// * [granularity] - TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
/// * [startDate] - Metric report start date (UTC). Format: YYYY-MM-DD
/// * [viewWindowDays] - Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
/// * [campaignIds] - List of campaign ids
/// * [campaignStatuses] - List of status values for filtering
/// * [campaignObjectiveTypes] - List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
/// * [campaignBrandLabel] - Campaign brand label for filtering.
/// * [adGroupIds] - List of ad group ids
/// * [adGroupStatuses] - List of values for filtering
/// * [adIds] - List of ad ids [This parameter is no supported for Product Item Level Reports]
/// * [adStatuses] - List of values for filtering [This parameter is not supported for Product Item Level Reports]
/// * [productGroupIds] - List of product group ids
/// * [productGroupStatuses] - List of values for filtering
/// * [productItemIds] - List of product item ids
/// * [targetingTypes] - List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
/// * [metricsFilters] - List of metrics filters
/// * [columns] - Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
/// * [combineTargetingTypes] - Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
/// * [customConversionEventMetrics] - List of advertiser-defined custom conversion event metrics to include in the report
/// * [endHour] - Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
/// * [level] - Level of the report
/// * [primarySort] - Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
/// * [reportFormat] - Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
/// * [reportingTimezone] - Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
/// * [startHour] - Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
@BuiltValue()
abstract class AdsAnalyticsCreateAsyncRequest implements Built<AdsAnalyticsCreateAsyncRequest, AdsAnalyticsCreateAsyncRequestBuilder> {
  /// List of types of attribution for the conversion report
  @BuiltValueField(wireName: r'attribution_types')
  BuiltList<ConversionReportAttributionType>? get attributionTypes;

  /// Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  @BuiltValueField(wireName: r'click_window_days')
  ConversionAttributionWindowDays? get clickWindowDays;
  // enum clickWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  @BuiltValueField(wireName: r'conversion_report_time')
  ConversionReportTimeType? get conversionReportTime;
  // enum conversionReportTimeEnum {  TIME_OF_AD_ACTION,  TIME_OF_CONVERSION,  };

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'end_date')
  String get endDate;

  /// Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  @BuiltValueField(wireName: r'engagement_window_days')
  ConversionAttributionWindowDays? get engagementWindowDays;
  // enum engagementWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  @BuiltValueField(wireName: r'granularity')
  Granularity get granularity;
  // enum granularityEnum {  TOTAL,  DAY,  HOUR,  WEEK,  MONTH,  };

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  @BuiltValueField(wireName: r'start_date')
  String get startDate;

  /// Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  @BuiltValueField(wireName: r'view_window_days')
  ConversionAttributionWindowDays? get viewWindowDays;
  // enum viewWindowDaysEnum {  0,  1,  7,  14,  30,  60,  };

  /// List of campaign ids
  @BuiltValueField(wireName: r'campaign_ids')
  BuiltList<String>? get campaignIds;

  /// List of status values for filtering
  @BuiltValueField(wireName: r'campaign_statuses')
  BuiltList<CampaignSummaryStatus>? get campaignStatuses;

  /// List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  @BuiltValueField(wireName: r'campaign_objective_types')
  BuiltList<ObjectiveType>? get campaignObjectiveTypes;

  /// Campaign brand label for filtering.
  @BuiltValueField(wireName: r'campaign_brand_label')
  String? get campaignBrandLabel;

  /// List of ad group ids
  @BuiltValueField(wireName: r'ad_group_ids')
  BuiltList<String>? get adGroupIds;

  /// List of values for filtering
  @BuiltValueField(wireName: r'ad_group_statuses')
  BuiltList<AdGroupSummaryStatus>? get adGroupStatuses;

  /// List of ad ids [This parameter is no supported for Product Item Level Reports]
  @BuiltValueField(wireName: r'ad_ids')
  BuiltList<String>? get adIds;

  /// List of values for filtering [This parameter is not supported for Product Item Level Reports]
  @BuiltValueField(wireName: r'ad_statuses')
  BuiltList<PinPromotionSummaryStatus>? get adStatuses;

  /// List of product group ids
  @BuiltValueField(wireName: r'product_group_ids')
  BuiltList<String>? get productGroupIds;

  /// List of values for filtering
  @BuiltValueField(wireName: r'product_group_statuses')
  BuiltList<ProductGroupSummaryStatus>? get productGroupStatuses;

  /// List of product item ids
  @BuiltValueField(wireName: r'product_item_ids')
  BuiltList<String>? get productItemIds;

  /// List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  @BuiltValueField(wireName: r'targeting_types')
  BuiltList<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum>? get targetingTypes;
  // enum targetingTypesEnum {  KEYWORD,  APPTYPE,  GENDER,  LOCATION,  PLACEMENT,  COUNTRY,  TARGETED_INTEREST,  PINNER_INTEREST,  AUDIENCE_INCLUDE,  GEO,  AGE_BUCKET,  REGION,  MEDIA_TYPE,  AGE_BUCKET_AND_GENDER,  AUDIENCE_MULTIPLIER,  CREATIVE_ENHANCEMENTS,  LOCAL_ADS_STORE_CODE,  };

  /// List of metrics filters
  @BuiltValueField(wireName: r'metrics_filters')
  BuiltList<AdsAnalyticsMetricsFilter>? get metricsFilters;

  /// Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  @BuiltValueField(wireName: r'columns')
  BuiltList<ReportingColumnAsync> get columns;

  /// Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
  @BuiltValueField(wireName: r'combine_targeting_types')
  bool? get combineTargetingTypes;

  /// List of advertiser-defined custom conversion event metrics to include in the report
  @BuiltValueField(wireName: r'custom_conversion_event_metrics')
  BuiltList<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>? get customConversionEventMetrics;

  /// Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
  @BuiltValueField(wireName: r'end_hour')
  int? get endHour;

  /// Level of the report
  @BuiltValueField(wireName: r'level')
  MetricsReportingLevel get level;
  // enum levelEnum {  ADVERTISER,  ADVERTISER_TARGETING,  CAMPAIGN,  CAMPAIGN_TARGETING,  AD_GROUP,  AD_GROUP_TARGETING,  PIN_PROMOTION,  PIN_PROMOTION_TARGETING,  KEYWORD,  PRODUCT_GROUP,  PRODUCT_GROUP_TARGETING,  PRODUCT_ITEM,  PRODUCT_ITEM_TARGETING,  };

  /// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  @BuiltValueField(wireName: r'primary_sort')
  AdsAnalyticsCreateAsyncRequestPrimarySortEnum? get primarySort;
  // enum primarySortEnum {  BY_ID,  BY_DATE,  };

  /// Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  @BuiltValueField(wireName: r'report_format')
  DataOutputFormat? get reportFormat;
  // enum reportFormatEnum {  JSON,  CSV,  };

  /// Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  @BuiltValueField(wireName: r'reporting_timezone')
  ReportingTimeZone? get reportingTimezone;
  // enum reportingTimezoneEnum {  PINTEREST_TIME_ZONE,  AD_ACCOUNT_TIME_ZONE,  };

  /// Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
  @BuiltValueField(wireName: r'start_hour')
  int? get startHour;

  AdsAnalyticsCreateAsyncRequest._();

  factory AdsAnalyticsCreateAsyncRequest([void updates(AdsAnalyticsCreateAsyncRequestBuilder b)]) = _$AdsAnalyticsCreateAsyncRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdsAnalyticsCreateAsyncRequestBuilder b) => b
      ..clickWindowDays = ConversionAttributionWindowDays.number30
      ..conversionReportTime = 'TIME_OF_AD_ACTION'
      ..engagementWindowDays = ConversionAttributionWindowDays.number30
      ..viewWindowDays = ConversionAttributionWindowDays.number1
      ..combineTargetingTypes = false
      ..reportFormat = 'JSON';

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
    if (object.attributionTypes != null) {
      yield r'attribution_types';
      yield serializers.serialize(
        object.attributionTypes,
        specifiedType: const FullType(BuiltList, [FullType(ConversionReportAttributionType)]),
      );
    }
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
    if (object.conversionReportTime != null) {
      yield r'conversion_report_time';
      yield serializers.serialize(
        object.conversionReportTime,
        specifiedType: const FullType(ConversionReportTimeType),
      );
    }
    yield r'end_date';
    yield serializers.serialize(
      object.endDate,
      specifiedType: const FullType(String),
    );
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
    yield r'start_date';
    yield serializers.serialize(
      object.startDate,
      specifiedType: const FullType(String),
    );
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(ConversionAttributionWindowDays),
      );
    }
    if (object.campaignIds != null) {
      yield r'campaign_ids';
      yield serializers.serialize(
        object.campaignIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.campaignStatuses != null) {
      yield r'campaign_statuses';
      yield serializers.serialize(
        object.campaignStatuses,
        specifiedType: const FullType(BuiltList, [FullType(CampaignSummaryStatus)]),
      );
    }
    if (object.campaignObjectiveTypes != null) {
      yield r'campaign_objective_types';
      yield serializers.serialize(
        object.campaignObjectiveTypes,
        specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
      );
    }
    if (object.campaignBrandLabel != null) {
      yield r'campaign_brand_label';
      yield serializers.serialize(
        object.campaignBrandLabel,
        specifiedType: const FullType(String),
      );
    }
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
    if (object.targetingTypes != null) {
      yield r'targeting_types';
      yield serializers.serialize(
        object.targetingTypes,
        specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsCreateAsyncRequestTargetingTypesEnum)]),
      );
    }
    if (object.metricsFilters != null) {
      yield r'metrics_filters';
      yield serializers.serialize(
        object.metricsFilters,
        specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsMetricsFilter)]),
      );
    }
    yield r'columns';
    yield serializers.serialize(
      object.columns,
      specifiedType: const FullType(BuiltList, [FullType(ReportingColumnAsync)]),
    );
    if (object.combineTargetingTypes != null) {
      yield r'combine_targeting_types';
      yield serializers.serialize(
        object.combineTargetingTypes,
        specifiedType: const FullType(bool),
      );
    }
    if (object.customConversionEventMetrics != null) {
      yield r'custom_conversion_event_metrics';
      yield serializers.serialize(
        object.customConversionEventMetrics,
        specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics)]),
      );
    }
    if (object.endHour != null) {
      yield r'end_hour';
      yield serializers.serialize(
        object.endHour,
        specifiedType: const FullType(int),
      );
    }
    yield r'level';
    yield serializers.serialize(
      object.level,
      specifiedType: const FullType(MetricsReportingLevel),
    );
    if (object.primarySort != null) {
      yield r'primary_sort';
      yield serializers.serialize(
        object.primarySort,
        specifiedType: const FullType(AdsAnalyticsCreateAsyncRequestPrimarySortEnum),
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
    if (object.startHour != null) {
      yield r'start_hour';
      yield serializers.serialize(
        object.startHour,
        specifiedType: const FullType(int),
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
        case r'attribution_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ConversionReportAttributionType)]),
          ) as BuiltList<ConversionReportAttributionType>;
          result.attributionTypes.replace(valueDes);
          break;
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays;
          result.clickWindowDays = valueDes;
          break;
        case r'conversion_report_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionReportTimeType),
          ) as ConversionReportTimeType;
          result.conversionReportTime = valueDes;
          break;
        case r'end_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.endDate = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays;
          result.engagementWindowDays = valueDes;
          break;
        case r'granularity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Granularity),
          ) as Granularity;
          result.granularity = valueDes;
          break;
        case r'start_date':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.startDate = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ConversionAttributionWindowDays),
          ) as ConversionAttributionWindowDays;
          result.viewWindowDays = valueDes;
          break;
        case r'campaign_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.campaignIds.replace(valueDes);
          break;
        case r'campaign_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(CampaignSummaryStatus)]),
          ) as BuiltList<CampaignSummaryStatus>;
          result.campaignStatuses.replace(valueDes);
          break;
        case r'campaign_objective_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ObjectiveType)]),
          ) as BuiltList<ObjectiveType>;
          result.campaignObjectiveTypes.replace(valueDes);
          break;
        case r'campaign_brand_label':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.campaignBrandLabel = valueDes;
          break;
        case r'ad_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.adGroupIds.replace(valueDes);
          break;
        case r'ad_group_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdGroupSummaryStatus)]),
          ) as BuiltList<AdGroupSummaryStatus>;
          result.adGroupStatuses.replace(valueDes);
          break;
        case r'ad_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.adIds.replace(valueDes);
          break;
        case r'ad_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PinPromotionSummaryStatus)]),
          ) as BuiltList<PinPromotionSummaryStatus>;
          result.adStatuses.replace(valueDes);
          break;
        case r'product_group_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.productGroupIds.replace(valueDes);
          break;
        case r'product_group_statuses':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ProductGroupSummaryStatus)]),
          ) as BuiltList<ProductGroupSummaryStatus>;
          result.productGroupStatuses.replace(valueDes);
          break;
        case r'product_item_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(String)]),
          ) as BuiltList<String>;
          result.productItemIds.replace(valueDes);
          break;
        case r'targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsCreateAsyncRequestTargetingTypesEnum)]),
          ) as BuiltList<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum>;
          result.targetingTypes.replace(valueDes);
          break;
        case r'metrics_filters':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsMetricsFilter)]),
          ) as BuiltList<AdsAnalyticsMetricsFilter>;
          result.metricsFilters.replace(valueDes);
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ReportingColumnAsync)]),
          ) as BuiltList<ReportingColumnAsync>;
          result.columns.replace(valueDes);
          break;
        case r'combine_targeting_types':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.combineTargetingTypes = valueDes;
          break;
        case r'custom_conversion_event_metrics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics)]),
          ) as BuiltList<AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics>;
          result.customConversionEventMetrics.replace(valueDes);
          break;
        case r'end_hour':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.endHour = valueDes;
          break;
        case r'level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(MetricsReportingLevel),
          ) as MetricsReportingLevel;
          result.level = valueDes;
          break;
        case r'primary_sort':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdsAnalyticsCreateAsyncRequestPrimarySortEnum),
          ) as AdsAnalyticsCreateAsyncRequestPrimarySortEnum;
          result.primarySort = valueDes;
          break;
        case r'report_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(DataOutputFormat),
          ) as DataOutputFormat;
          result.reportFormat = valueDes;
          break;
        case r'reporting_timezone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ReportingTimeZone),
          ) as ReportingTimeZone;
          result.reportingTimezone = valueDes;
          break;
        case r'start_hour':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.startHour = valueDes;
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

class AdsAnalyticsCreateAsyncRequestTargetingTypesEnum extends EnumClass {

  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum KEYWORD = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_KEYWORD;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum APPTYPE = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_APPTYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum GENDER = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum LOCATION = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_LOCATION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum PLACEMENT = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_PLACEMENT;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum COUNTRY = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_COUNTRY;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum TARGETED_INTEREST = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_TARGETED_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum PINNER_INTEREST = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_PINNER_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum AUDIENCE_INCLUDE = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_AUDIENCE_INCLUDE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum GEO = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_GEO;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum AGE_BUCKET = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_AGE_BUCKET;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum REGION = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_REGION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'MEDIA_TYPE')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum MEDIA_TYPE = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_MEDIA_TYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum AGE_BUCKET_AND_GENDER = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_AGE_BUCKET_AND_GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_MULTIPLIER')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum AUDIENCE_MULTIPLIER = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_AUDIENCE_MULTIPLIER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'CREATIVE_ENHANCEMENTS')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum CREATIVE_ENHANCEMENTS = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_CREATIVE_ENHANCEMENTS;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCAL_ADS_STORE_CODE')
  static const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum LOCAL_ADS_STORE_CODE = _$adsAnalyticsCreateAsyncRequestTargetingTypesEnum_LOCAL_ADS_STORE_CODE;

  static Serializer<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum> get serializer => _$adsAnalyticsCreateAsyncRequestTargetingTypesEnumSerializer;

  const AdsAnalyticsCreateAsyncRequestTargetingTypesEnum._(String name): super(name);

  static BuiltSet<AdsAnalyticsCreateAsyncRequestTargetingTypesEnum> get values => _$adsAnalyticsCreateAsyncRequestTargetingTypesEnumValues;
  static AdsAnalyticsCreateAsyncRequestTargetingTypesEnum valueOf(String name) => _$adsAnalyticsCreateAsyncRequestTargetingTypesEnumValueOf(name);
}

class AdsAnalyticsCreateAsyncRequestPrimarySortEnum extends EnumClass {

  /// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  @BuiltValueEnumConst(wireName: r'BY_ID')
  static const AdsAnalyticsCreateAsyncRequestPrimarySortEnum BY_ID = _$adsAnalyticsCreateAsyncRequestPrimarySortEnum_BY_ID;
  /// Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  @BuiltValueEnumConst(wireName: r'BY_DATE')
  static const AdsAnalyticsCreateAsyncRequestPrimarySortEnum BY_DATE = _$adsAnalyticsCreateAsyncRequestPrimarySortEnum_BY_DATE;

  static Serializer<AdsAnalyticsCreateAsyncRequestPrimarySortEnum> get serializer => _$adsAnalyticsCreateAsyncRequestPrimarySortEnumSerializer;

  const AdsAnalyticsCreateAsyncRequestPrimarySortEnum._(String name): super(name);

  static BuiltSet<AdsAnalyticsCreateAsyncRequestPrimarySortEnum> get values => _$adsAnalyticsCreateAsyncRequestPrimarySortEnumValues;
  static AdsAnalyticsCreateAsyncRequestPrimarySortEnum valueOf(String name) => _$adsAnalyticsCreateAsyncRequestPrimarySortEnumValueOf(name);
}

