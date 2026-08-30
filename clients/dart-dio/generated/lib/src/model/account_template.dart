//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/metrics_reporting_level.dart';
import 'package:openapi/src/model/conversion_report_time_type.dart';
import 'package:openapi/src/model/reporting_time_zone.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/granularity.dart';
import 'package:openapi/src/model/creation_source.dart';
import 'package:openapi/src/model/ingestion_source.dart';
import 'package:openapi/src/model/reporting_column.dart';
import 'package:openapi/src/model/data_output_format.dart';
import 'package:built_value/json_object.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'account_template.g.dart';

/// AccountTemplate
///
/// Properties:
/// * [adAccountId] - ID of the Ad Account that owns the template
/// * [adAccountIds] - IDs of the Ad Accounts that have access to this template
/// * [adeColumns] - A list of ADE columns
/// * [attributionType] - Attribution type for Brand/Category/SKU reports
/// * [clickWindowDays] - The length of the sliding window over which click conversions will be attributed
/// * [columns] - A list of columns to be included in the report
/// * [conversionReportTimeType] - Conversion report time type
/// * [creationSource] - The surface used to create this template
/// * [customColumnIds] - A list of custom column IDs
/// * [displayMetadata] - Additional metadata about this reporting template
/// * [engagementWindowDays] - The length of the sliding window over which engagement conversions will be attributed
/// * [filtersJson] - A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
/// * [granularity] 
/// * [id] - Template ID
/// * [ingestionSources] - The filter on the conversion ingestion source method for conversion metrics
/// * [isDefault] - A boolean representing if this is the default view that loads for this template type
/// * [isDeleted] - A boolean that indicates if the template has been deleted
/// * [isOwnedByUser] - A boolean value that indicates if the user owns the template
/// * [isScheduled] - A boolean value that indicates if this template has been used to create a scheduled report
/// * [name] - Template Name
/// * [reportEndRelativeDaysInPast] - The number of days prior to the day the report will be delivered at which the report will end
/// * [reportFormat] 
/// * [reportLevel] 
/// * [reportStartRelativeDaysInPast] - The number of days prior to the day the report will be delivered at which the report will start
/// * [reportingTimeZone] - Timezone for reporting data
/// * [sortBy] - Unified metric sort configuration
/// * [type] - Type of the template
/// * [updatedTime] - Time of last update in seconds since Unix epoch
/// * [userId] - ID of the user who created the template
/// * [viewWindowDays] - The length of the sliding window over which view conversions will be attributed
@BuiltValue()
abstract class AccountTemplate implements Built<AccountTemplate, AccountTemplateBuilder> {
  /// ID of the Ad Account that owns the template
  @BuiltValueField(wireName: r'ad_account_id')
  String? get adAccountId;

  /// IDs of the Ad Accounts that have access to this template
  @BuiltValueField(wireName: r'ad_account_ids')
  BuiltList<String>? get adAccountIds;

  /// A list of ADE columns
  @BuiltValueField(wireName: r'ade_columns')
  BuiltList<String>? get adeColumns;

  /// Attribution type for Brand/Category/SKU reports
  @BuiltValueField(wireName: r'attribution_type')
  JsonObject? get attributionType;

  /// The length of the sliding window over which click conversions will be attributed
  @BuiltValueField(wireName: r'click_window_days')
  num? get clickWindowDays;

  /// A list of columns to be included in the report
  @BuiltValueField(wireName: r'columns')
  BuiltList<ReportingColumn>? get columns;

  /// Conversion report time type
  @BuiltValueField(wireName: r'conversion_report_time_type')
  ConversionReportTimeType? get conversionReportTimeType;
  // enum conversionReportTimeTypeEnum {  TIME_OF_AD_ACTION,  TIME_OF_CONVERSION,  };

  /// The surface used to create this template
  @BuiltValueField(wireName: r'creation_source')
  CreationSource? get creationSource;
  // enum creationSourceEnum {  ADS_API,  ADS_MANAGER_REPORTING_PAGE,  ADS_MANAGER_REPORT_BUILDER,  };

  /// A list of custom column IDs
  @BuiltValueField(wireName: r'custom_column_ids')
  BuiltList<String>? get customColumnIds;

  /// Additional metadata about this reporting template
  @BuiltValueField(wireName: r'display_metadata')
  String? get displayMetadata;

  /// The length of the sliding window over which engagement conversions will be attributed
  @BuiltValueField(wireName: r'engagement_window_days')
  num? get engagementWindowDays;

  /// A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
  @BuiltValueField(wireName: r'filters_json')
  String? get filtersJson;

  @BuiltValueField(wireName: r'granularity')
  Granularity? get granularity;
  // enum granularityEnum {  TOTAL,  DAY,  HOUR,  WEEK,  MONTH,  };

  /// Template ID
  @BuiltValueField(wireName: r'id')
  String get id;

  /// The filter on the conversion ingestion source method for conversion metrics
  @BuiltValueField(wireName: r'ingestion_sources')
  BuiltList<IngestionSource>? get ingestionSources;

  /// A boolean representing if this is the default view that loads for this template type
  @BuiltValueField(wireName: r'is_default')
  bool? get isDefault;

  /// A boolean that indicates if the template has been deleted
  @BuiltValueField(wireName: r'is_deleted')
  bool? get isDeleted;

  /// A boolean value that indicates if the user owns the template
  @BuiltValueField(wireName: r'is_owned_by_user')
  bool? get isOwnedByUser;

  /// A boolean value that indicates if this template has been used to create a scheduled report
  @BuiltValueField(wireName: r'is_scheduled')
  bool? get isScheduled;

  /// Template Name
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// The number of days prior to the day the report will be delivered at which the report will end
  @BuiltValueField(wireName: r'report_end_relative_days_in_past')
  num? get reportEndRelativeDaysInPast;

  @BuiltValueField(wireName: r'report_format')
  DataOutputFormat? get reportFormat;
  // enum reportFormatEnum {  JSON,  CSV,  };

  @BuiltValueField(wireName: r'report_level')
  MetricsReportingLevel? get reportLevel;
  // enum reportLevelEnum {  ADVERTISER,  ADVERTISER_TARGETING,  CAMPAIGN,  CAMPAIGN_TARGETING,  AD_GROUP,  AD_GROUP_TARGETING,  PIN_PROMOTION,  PIN_PROMOTION_TARGETING,  KEYWORD,  PRODUCT_GROUP,  PRODUCT_GROUP_TARGETING,  PRODUCT_ITEM,  PRODUCT_ITEM_TARGETING,  };

  /// The number of days prior to the day the report will be delivered at which the report will start
  @BuiltValueField(wireName: r'report_start_relative_days_in_past')
  num? get reportStartRelativeDaysInPast;

  /// Timezone for reporting data
  @BuiltValueField(wireName: r'reporting_time_zone')
  ReportingTimeZone? get reportingTimeZone;
  // enum reportingTimeZoneEnum {  PINTEREST_TIME_ZONE,  AD_ACCOUNT_TIME_ZONE,  };

  /// Unified metric sort configuration
  @BuiltValueField(wireName: r'sort_by')
  JsonObject? get sortBy;

  /// Type of the template
  @BuiltValueField(wireName: r'type')
  String? get type;

  /// Time of last update in seconds since Unix epoch
  @BuiltValueField(wireName: r'updated_time')
  num? get updatedTime;

  /// ID of the user who created the template
  @BuiltValueField(wireName: r'user_id')
  String? get userId;

  /// The length of the sliding window over which view conversions will be attributed
  @BuiltValueField(wireName: r'view_window_days')
  num? get viewWindowDays;

  AccountTemplate._();

  factory AccountTemplate([void updates(AccountTemplateBuilder b)]) = _$AccountTemplate;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AccountTemplateBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AccountTemplate> get serializer => _$AccountTemplateSerializer();
}

class _$AccountTemplateSerializer implements PrimitiveSerializer<AccountTemplate> {
  @override
  final Iterable<Type> types = const [AccountTemplate, _$AccountTemplate];

  @override
  final String wireName = r'AccountTemplate';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AccountTemplate object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.adAccountId != null) {
      yield r'ad_account_id';
      yield serializers.serialize(
        object.adAccountId,
        specifiedType: const FullType(String),
      );
    }
    if (object.adAccountIds != null) {
      yield r'ad_account_ids';
      yield serializers.serialize(
        object.adAccountIds,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.adeColumns != null) {
      yield r'ade_columns';
      yield serializers.serialize(
        object.adeColumns,
        specifiedType: const FullType(BuiltList, [FullType(String)]),
      );
    }
    if (object.attributionType != null) {
      yield r'attribution_type';
      yield serializers.serialize(
        object.attributionType,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.clickWindowDays != null) {
      yield r'click_window_days';
      yield serializers.serialize(
        object.clickWindowDays,
        specifiedType: const FullType(num),
      );
    }
    if (object.columns != null) {
      yield r'columns';
      yield serializers.serialize(
        object.columns,
        specifiedType: const FullType(BuiltList, [FullType(ReportingColumn)]),
      );
    }
    if (object.conversionReportTimeType != null) {
      yield r'conversion_report_time_type';
      yield serializers.serialize(
        object.conversionReportTimeType,
        specifiedType: const FullType(ConversionReportTimeType),
      );
    }
    if (object.creationSource != null) {
      yield r'creation_source';
      yield serializers.serialize(
        object.creationSource,
        specifiedType: const FullType(CreationSource),
      );
    }
    if (object.customColumnIds != null) {
      yield r'custom_column_ids';
      yield serializers.serialize(
        object.customColumnIds,
        specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
      );
    }
    if (object.displayMetadata != null) {
      yield r'display_metadata';
      yield serializers.serialize(
        object.displayMetadata,
        specifiedType: const FullType(String),
      );
    }
    if (object.engagementWindowDays != null) {
      yield r'engagement_window_days';
      yield serializers.serialize(
        object.engagementWindowDays,
        specifiedType: const FullType(num),
      );
    }
    if (object.filtersJson != null) {
      yield r'filters_json';
      yield serializers.serialize(
        object.filtersJson,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.granularity != null) {
      yield r'granularity';
      yield serializers.serialize(
        object.granularity,
        specifiedType: const FullType(Granularity),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.ingestionSources != null) {
      yield r'ingestion_sources';
      yield serializers.serialize(
        object.ingestionSources,
        specifiedType: const FullType.nullable(BuiltList, [FullType(IngestionSource)]),
      );
    }
    if (object.isDefault != null) {
      yield r'is_default';
      yield serializers.serialize(
        object.isDefault,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isDeleted != null) {
      yield r'is_deleted';
      yield serializers.serialize(
        object.isDeleted,
        specifiedType: const FullType.nullable(bool),
      );
    }
    if (object.isOwnedByUser != null) {
      yield r'is_owned_by_user';
      yield serializers.serialize(
        object.isOwnedByUser,
        specifiedType: const FullType(bool),
      );
    }
    if (object.isScheduled != null) {
      yield r'is_scheduled';
      yield serializers.serialize(
        object.isScheduled,
        specifiedType: const FullType(bool),
      );
    }
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType.nullable(String),
      );
    }
    if (object.reportEndRelativeDaysInPast != null) {
      yield r'report_end_relative_days_in_past';
      yield serializers.serialize(
        object.reportEndRelativeDaysInPast,
        specifiedType: const FullType(num),
      );
    }
    if (object.reportFormat != null) {
      yield r'report_format';
      yield serializers.serialize(
        object.reportFormat,
        specifiedType: const FullType(DataOutputFormat),
      );
    }
    if (object.reportLevel != null) {
      yield r'report_level';
      yield serializers.serialize(
        object.reportLevel,
        specifiedType: const FullType(MetricsReportingLevel),
      );
    }
    if (object.reportStartRelativeDaysInPast != null) {
      yield r'report_start_relative_days_in_past';
      yield serializers.serialize(
        object.reportStartRelativeDaysInPast,
        specifiedType: const FullType(num),
      );
    }
    if (object.reportingTimeZone != null) {
      yield r'reporting_time_zone';
      yield serializers.serialize(
        object.reportingTimeZone,
        specifiedType: const FullType(ReportingTimeZone),
      );
    }
    if (object.sortBy != null) {
      yield r'sort_by';
      yield serializers.serialize(
        object.sortBy,
        specifiedType: const FullType.nullable(JsonObject),
      );
    }
    if (object.type != null) {
      yield r'type';
      yield serializers.serialize(
        object.type,
        specifiedType: const FullType(String),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType(num),
      );
    }
    if (object.userId != null) {
      yield r'user_id';
      yield serializers.serialize(
        object.userId,
        specifiedType: const FullType(String),
      );
    }
    if (object.viewWindowDays != null) {
      yield r'view_window_days';
      yield serializers.serialize(
        object.viewWindowDays,
        specifiedType: const FullType(num),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AccountTemplate object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AccountTemplateBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ad_account_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.adAccountId = valueDes;
          break;
        case r'ad_account_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adAccountIds.replace(valueDes);
          break;
        case r'ade_columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.adeColumns.replace(valueDes);
          break;
        case r'attribution_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.attributionType = valueDes;
          break;
        case r'click_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.clickWindowDays = valueDes;
          break;
        case r'columns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(ReportingColumn)]),
          ) as BuiltList<ReportingColumn>?;
          if (valueDes == null) continue;
          result.columns.replace(valueDes);
          break;
        case r'conversion_report_time_type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConversionReportTimeType),
          ) as ConversionReportTimeType?;
          if (valueDes == null) continue;
          result.conversionReportTimeType = valueDes;
          break;
        case r'creation_source':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(CreationSource),
          ) as CreationSource?;
          if (valueDes == null) continue;
          result.creationSource = valueDes;
          break;
        case r'custom_column_ids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(String)]),
          ) as BuiltList<String>?;
          if (valueDes == null) continue;
          result.customColumnIds.replace(valueDes);
          break;
        case r'display_metadata':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.displayMetadata = valueDes;
          break;
        case r'engagement_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.engagementWindowDays = valueDes;
          break;
        case r'filters_json':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.filtersJson = valueDes;
          break;
        case r'granularity':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(Granularity),
          ) as Granularity?;
          if (valueDes == null) continue;
          result.granularity = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'ingestion_sources':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(BuiltList, [FullType(IngestionSource)]),
          ) as BuiltList<IngestionSource>?;
          if (valueDes == null) continue;
          result.ingestionSources.replace(valueDes);
          break;
        case r'is_default':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isDefault = valueDes;
          break;
        case r'is_deleted':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isDeleted = valueDes;
          break;
        case r'is_owned_by_user':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isOwnedByUser = valueDes;
          break;
        case r'is_scheduled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(bool),
          ) as bool?;
          if (valueDes == null) continue;
          result.isScheduled = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.name = valueDes;
          break;
        case r'report_end_relative_days_in_past':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.reportEndRelativeDaysInPast = valueDes;
          break;
        case r'report_format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(DataOutputFormat),
          ) as DataOutputFormat?;
          if (valueDes == null) continue;
          result.reportFormat = valueDes;
          break;
        case r'report_level':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(MetricsReportingLevel),
          ) as MetricsReportingLevel?;
          if (valueDes == null) continue;
          result.reportLevel = valueDes;
          break;
        case r'report_start_relative_days_in_past':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.reportStartRelativeDaysInPast = valueDes;
          break;
        case r'reporting_time_zone':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ReportingTimeZone),
          ) as ReportingTimeZone?;
          if (valueDes == null) continue;
          result.reportingTimeZone = valueDes;
          break;
        case r'sort_by':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(JsonObject),
          ) as JsonObject?;
          if (valueDes == null) continue;
          result.sortBy = valueDes;
          break;
        case r'type':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.type = valueDes;
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        case r'user_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.userId = valueDes;
          break;
        case r'view_window_days':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
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
  AccountTemplate deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AccountTemplateBuilder();
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

