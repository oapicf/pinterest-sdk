//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateResponse {
  /// Returns a new [TemplateResponse] instance.
  TemplateResponse({
    this.adAccountId,
    this.adAccountIds = const [],
    this.clickWindowDays,
    this.columns = const [],
    this.conversionReportTimeType,
    this.creationSource,
    this.customColumnIds = const [],
    this.dateRange,
    this.engagementWindowDays,
    this.filtersJson,
    this.granularity,
    this.id,
    this.ingestionSources = const [],
    this.isDeleted,
    this.isOwnedByUser,
    this.isScheduled,
    this.name,
    this.reportEndRelativeDaysInPast,
    this.reportFormat,
    this.reportLevel,
    this.reportStartRelativeDaysInPast,
    this.type,
    this.updatedTime,
    this.userId,
    this.viewWindowDays,
  });

  /// ID of the Ad Account that owns the template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? adAccountId;

  /// IDs of the Ad Accounts that have access to this template
  List<String> adAccountIds;

  /// The length of the sliding window over which click conversions will be attributed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? clickWindowDays;

  /// A list of columns to be included in the report
  List<TemplateResponseColumnsEnum> columns;

  /// Conversion report time type
  TemplateResponseConversionReportTimeTypeEnum? conversionReportTimeType;

  /// The surface used to create this template
  TemplateResponseCreationSourceEnum? creationSource;

  /// A list of custom column IDs
  List<String>? customColumnIds;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TemplateResponseDateRange? dateRange;

  /// The length of the sliding window over which engagement conversions will be attributed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? engagementWindowDays;

  /// A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
  String? filtersJson;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Granularity? granularity;

  /// Template ID
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// The filter on the conversion ingestion source method for conversion metrics
  List<TemplateResponseIngestionSourcesEnum>? ingestionSources;

  /// A boolean that indicates if the template has been deleted
  bool? isDeleted;

  /// A boolean value that indicates if the user owns the template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isOwnedByUser;

  /// A boolean value that indicates if this template has been used to create a scheduled report
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isScheduled;

  /// Template Name
  String? name;

  /// The number of days prior to the day the report will be delivered at which the report will end
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? reportEndRelativeDaysInPast;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DataOutputFormat? reportFormat;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  MetricsReportingLevel? reportLevel;

  /// The number of days prior to the day the report will be delivered at which the report will start
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? reportStartRelativeDaysInPast;

  /// Reporting template type
  TemplateResponseTypeEnum? type;

  /// Time of last update in seconds since Unix epoch
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? updatedTime;

  /// ID of the user who created the template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? userId;

  /// The length of the sliding window over which view conversions will be attributed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? viewWindowDays;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateResponse &&
    other.adAccountId == adAccountId &&
    _deepEquality.equals(other.adAccountIds, adAccountIds) &&
    other.clickWindowDays == clickWindowDays &&
    _deepEquality.equals(other.columns, columns) &&
    other.conversionReportTimeType == conversionReportTimeType &&
    other.creationSource == creationSource &&
    _deepEquality.equals(other.customColumnIds, customColumnIds) &&
    other.dateRange == dateRange &&
    other.engagementWindowDays == engagementWindowDays &&
    other.filtersJson == filtersJson &&
    other.granularity == granularity &&
    other.id == id &&
    _deepEquality.equals(other.ingestionSources, ingestionSources) &&
    other.isDeleted == isDeleted &&
    other.isOwnedByUser == isOwnedByUser &&
    other.isScheduled == isScheduled &&
    other.name == name &&
    other.reportEndRelativeDaysInPast == reportEndRelativeDaysInPast &&
    other.reportFormat == reportFormat &&
    other.reportLevel == reportLevel &&
    other.reportStartRelativeDaysInPast == reportStartRelativeDaysInPast &&
    other.type == type &&
    other.updatedTime == updatedTime &&
    other.userId == userId &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (adAccountIds.hashCode) +
    (clickWindowDays == null ? 0 : clickWindowDays!.hashCode) +
    (columns.hashCode) +
    (conversionReportTimeType == null ? 0 : conversionReportTimeType!.hashCode) +
    (creationSource == null ? 0 : creationSource!.hashCode) +
    (customColumnIds == null ? 0 : customColumnIds!.hashCode) +
    (dateRange == null ? 0 : dateRange!.hashCode) +
    (engagementWindowDays == null ? 0 : engagementWindowDays!.hashCode) +
    (filtersJson == null ? 0 : filtersJson!.hashCode) +
    (granularity == null ? 0 : granularity!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (ingestionSources == null ? 0 : ingestionSources!.hashCode) +
    (isDeleted == null ? 0 : isDeleted!.hashCode) +
    (isOwnedByUser == null ? 0 : isOwnedByUser!.hashCode) +
    (isScheduled == null ? 0 : isScheduled!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (reportEndRelativeDaysInPast == null ? 0 : reportEndRelativeDaysInPast!.hashCode) +
    (reportFormat == null ? 0 : reportFormat!.hashCode) +
    (reportLevel == null ? 0 : reportLevel!.hashCode) +
    (reportStartRelativeDaysInPast == null ? 0 : reportStartRelativeDaysInPast!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (viewWindowDays == null ? 0 : viewWindowDays!.hashCode);

  @override
  String toString() => 'TemplateResponse[adAccountId=$adAccountId, adAccountIds=$adAccountIds, clickWindowDays=$clickWindowDays, columns=$columns, conversionReportTimeType=$conversionReportTimeType, creationSource=$creationSource, customColumnIds=$customColumnIds, dateRange=$dateRange, engagementWindowDays=$engagementWindowDays, filtersJson=$filtersJson, granularity=$granularity, id=$id, ingestionSources=$ingestionSources, isDeleted=$isDeleted, isOwnedByUser=$isOwnedByUser, isScheduled=$isScheduled, name=$name, reportEndRelativeDaysInPast=$reportEndRelativeDaysInPast, reportFormat=$reportFormat, reportLevel=$reportLevel, reportStartRelativeDaysInPast=$reportStartRelativeDaysInPast, type=$type, updatedTime=$updatedTime, userId=$userId, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
      json[r'ad_account_ids'] = this.adAccountIds;
    if (this.clickWindowDays != null) {
      json[r'click_window_days'] = this.clickWindowDays;
    } else {
      json[r'click_window_days'] = null;
    }
      json[r'columns'] = this.columns;
    if (this.conversionReportTimeType != null) {
      json[r'conversion_report_time_type'] = this.conversionReportTimeType;
    } else {
      json[r'conversion_report_time_type'] = null;
    }
    if (this.creationSource != null) {
      json[r'creation_source'] = this.creationSource;
    } else {
      json[r'creation_source'] = null;
    }
    if (this.customColumnIds != null) {
      json[r'custom_column_ids'] = this.customColumnIds;
    } else {
      json[r'custom_column_ids'] = null;
    }
    if (this.dateRange != null) {
      json[r'date_range'] = this.dateRange;
    } else {
      json[r'date_range'] = null;
    }
    if (this.engagementWindowDays != null) {
      json[r'engagement_window_days'] = this.engagementWindowDays;
    } else {
      json[r'engagement_window_days'] = null;
    }
    if (this.filtersJson != null) {
      json[r'filters_json'] = this.filtersJson;
    } else {
      json[r'filters_json'] = null;
    }
    if (this.granularity != null) {
      json[r'granularity'] = this.granularity;
    } else {
      json[r'granularity'] = null;
    }
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.ingestionSources != null) {
      json[r'ingestion_sources'] = this.ingestionSources;
    } else {
      json[r'ingestion_sources'] = null;
    }
    if (this.isDeleted != null) {
      json[r'is_deleted'] = this.isDeleted;
    } else {
      json[r'is_deleted'] = null;
    }
    if (this.isOwnedByUser != null) {
      json[r'is_owned_by_user'] = this.isOwnedByUser;
    } else {
      json[r'is_owned_by_user'] = null;
    }
    if (this.isScheduled != null) {
      json[r'is_scheduled'] = this.isScheduled;
    } else {
      json[r'is_scheduled'] = null;
    }
    if (this.name != null) {
      json[r'name'] = this.name;
    } else {
      json[r'name'] = null;
    }
    if (this.reportEndRelativeDaysInPast != null) {
      json[r'report_end_relative_days_in_past'] = this.reportEndRelativeDaysInPast;
    } else {
      json[r'report_end_relative_days_in_past'] = null;
    }
    if (this.reportFormat != null) {
      json[r'report_format'] = this.reportFormat;
    } else {
      json[r'report_format'] = null;
    }
    if (this.reportLevel != null) {
      json[r'report_level'] = this.reportLevel;
    } else {
      json[r'report_level'] = null;
    }
    if (this.reportStartRelativeDaysInPast != null) {
      json[r'report_start_relative_days_in_past'] = this.reportStartRelativeDaysInPast;
    } else {
      json[r'report_start_relative_days_in_past'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    if (this.updatedTime != null) {
      json[r'updated_time'] = this.updatedTime;
    } else {
      json[r'updated_time'] = null;
    }
    if (this.userId != null) {
      json[r'user_id'] = this.userId;
    } else {
      json[r'user_id'] = null;
    }
    if (this.viewWindowDays != null) {
      json[r'view_window_days'] = this.viewWindowDays;
    } else {
      json[r'view_window_days'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TemplateResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TemplateResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TemplateResponse(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        adAccountIds: json[r'ad_account_ids'] is Iterable
            ? (json[r'ad_account_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        clickWindowDays: num.parse('${json[r'click_window_days']}'),
        columns: TemplateResponseColumnsEnum.listFromJson(json[r'columns']),
        conversionReportTimeType: TemplateResponseConversionReportTimeTypeEnum.fromJson(json[r'conversion_report_time_type']),
        creationSource: TemplateResponseCreationSourceEnum.fromJson(json[r'creation_source']),
        customColumnIds: json[r'custom_column_ids'] is Iterable
            ? (json[r'custom_column_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        dateRange: TemplateResponseDateRange.fromJson(json[r'date_range']),
        engagementWindowDays: num.parse('${json[r'engagement_window_days']}'),
        filtersJson: mapValueOfType<String>(json, r'filters_json'),
        granularity: Granularity.fromJson(json[r'granularity']),
        id: mapValueOfType<String>(json, r'id'),
        ingestionSources: TemplateResponseIngestionSourcesEnum.listFromJson(json[r'ingestion_sources']),
        isDeleted: mapValueOfType<bool>(json, r'is_deleted'),
        isOwnedByUser: mapValueOfType<bool>(json, r'is_owned_by_user'),
        isScheduled: mapValueOfType<bool>(json, r'is_scheduled'),
        name: mapValueOfType<String>(json, r'name'),
        reportEndRelativeDaysInPast: num.parse('${json[r'report_end_relative_days_in_past']}'),
        reportFormat: DataOutputFormat.fromJson(json[r'report_format']),
        reportLevel: MetricsReportingLevel.fromJson(json[r'report_level']),
        reportStartRelativeDaysInPast: num.parse('${json[r'report_start_relative_days_in_past']}'),
        type: TemplateResponseTypeEnum.fromJson(json[r'type']),
        updatedTime: num.parse('${json[r'updated_time']}'),
        userId: mapValueOfType<String>(json, r'user_id'),
        viewWindowDays: num.parse('${json[r'view_window_days']}'),
      );
    }
    return null;
  }

  static List<TemplateResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateResponse> mapFromJson(dynamic json) {
    final map = <String, TemplateResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateResponse-objects as value to a dart map
  static Map<String, List<TemplateResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

/// Reporting Columns (Internal)
class TemplateResponseColumnsEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseColumnsEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const SPEND_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'SPEND_IN_MICRO_DOLLAR');
  static const SPEND_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'SPEND_IN_MICRO_US_DOLLAR');
  static const BONUS_SPEND_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'BONUS_SPEND_IN_MICRO_DOLLAR');
  static const BONUS_SPEND_IN_DOLLAR = TemplateResponseColumnsEnum._(r'BONUS_SPEND_IN_DOLLAR');
  static const ADS_CREDIT_SPEND_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ADS_CREDIT_SPEND_IN_MICRO_DOLLAR');
  static const ADS_CREDIT_SPEND_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ADS_CREDIT_SPEND_IN_DOLLAR');
  static const PAID_IMPRESSION = TemplateResponseColumnsEnum._(r'PAID_IMPRESSION');
  static const PAID_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'PAID_CLICKTHROUGH');
  static const SPEND_IN_DOLLAR = TemplateResponseColumnsEnum._(r'SPEND_IN_DOLLAR');
  static const SPEND_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SPEND_IN_US_DOLLAR');
  static const CPC_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPC_IN_MICRO_DOLLAR');
  static const ECPC_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPC_IN_MICRO_DOLLAR');
  static const CPC_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPC_IN_DOLLAR');
  static const ECPC_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPC_IN_DOLLAR');
  static const CTR = TemplateResponseColumnsEnum._(r'CTR');
  static const ECTR = TemplateResponseColumnsEnum._(r'ECTR');
  static const OUTBOUND_CTR = TemplateResponseColumnsEnum._(r'OUTBOUND_CTR');
  static const oUTBOUNDCTR1 = TemplateResponseColumnsEnum._(r'OUTBOUND_CTR_1');
  static const CPC_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'CPC_IN_MICRO_CURRENCY');
  static const CPW_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPW_IN_MICRO_DOLLAR');
  static const CPW_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPW_IN_DOLLAR');
  static const COST_PER_OUTBOUND_CLICK = TemplateResponseColumnsEnum._(r'COST_PER_OUTBOUND_CLICK');
  static const AD_ONLY_PIN = TemplateResponseColumnsEnum._(r'AD_ONLY_PIN');
  static const CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'CAMPAIGN_NAME');
  static const CAMPAIGN_STATUS = TemplateResponseColumnsEnum._(r'CAMPAIGN_STATUS');
  static const IS_CAMPAIGN_LEARNING_PHASE = TemplateResponseColumnsEnum._(r'IS_CAMPAIGN_LEARNING_PHASE');
  static const DATE = TemplateResponseColumnsEnum._(r'DATE');
  static const DATE_AS_TIMESTAMP = TemplateResponseColumnsEnum._(r'DATE_AS_TIMESTAMP');
  static const BUDGET_IN_DOLLAR = TemplateResponseColumnsEnum._(r'BUDGET_IN_DOLLAR');
  static const AVAILABLE_BUDGET_IN_DOLLAR = TemplateResponseColumnsEnum._(r'AVAILABLE_BUDGET_IN_DOLLAR');
  static const TARGETING_TYPE = TemplateResponseColumnsEnum._(r'TARGETING_TYPE');
  static const TARGETING_VALUE = TemplateResponseColumnsEnum._(r'TARGETING_VALUE');
  static const TARGETING_VALUE_NAME = TemplateResponseColumnsEnum._(r'TARGETING_VALUE_NAME');
  static const CAMPAIGN_BRAND_LABEL = TemplateResponseColumnsEnum._(r'CAMPAIGN_BRAND_LABEL');
  static const CAMPAIGN_CUSTOM_LABELS = TemplateResponseColumnsEnum._(r'CAMPAIGN_CUSTOM_LABELS');
  static const APP_INSTALL_APP_NAME = TemplateResponseColumnsEnum._(r'APP_INSTALL_APP_NAME');
  static const PAID_EVENTS = TemplateResponseColumnsEnum._(r'PAID_EVENTS');
  static const BONUS_EVENTS = TemplateResponseColumnsEnum._(r'BONUS_EVENTS');
  static const INSERTION = TemplateResponseColumnsEnum._(r'INSERTION');
  static const LEGACY_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'LEGACY_CAMPAIGN_ID');
  static const HBASE_ID = TemplateResponseColumnsEnum._(r'HBASE_ID');
  static const PIN_DESCRIPTION = TemplateResponseColumnsEnum._(r'PIN_DESCRIPTION');
  static const CAMPAIGN_END_DATE = TemplateResponseColumnsEnum._(r'CAMPAIGN_END_DATE');
  static const PIN_PROMOTION_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_STATUS');
  static const AD_STATUS = TemplateResponseColumnsEnum._(r'AD_STATUS');
  static const PIN_ID = TemplateResponseColumnsEnum._(r'PIN_ID');
  static const CROSS_DEVICE_TYPE = TemplateResponseColumnsEnum._(r'CROSS_DEVICE_TYPE');
  static const INGESTION_SOURCE = TemplateResponseColumnsEnum._(r'INGESTION_SOURCE');
  static const SOURCE_PLATFORM = TemplateResponseColumnsEnum._(r'SOURCE_PLATFORM');
  static const PIN_PROMOTION_IS_RUNNING = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_IS_RUNNING');
  static const TOTAL_ENGAGEMENT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT');
  static const eNGAGEMENT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_1');
  static const eNGAGEMENT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_2');
  static const CPE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPE_IN_MICRO_DOLLAR');
  static const ECPE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPE_IN_MICRO_DOLLAR');
  static const CPE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPE_IN_DOLLAR');
  static const ECPE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPE_IN_DOLLAR');
  static const ENGAGEMENT_RATE = TemplateResponseColumnsEnum._(r'ENGAGEMENT_RATE');
  static const EENGAGEMENT_RATE = TemplateResponseColumnsEnum._(r'EENGAGEMENT_RATE');
  static const INTERNAL_ECPE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'INTERNAL_ECPE_IN_MICRO_DOLLAR');
  static const INTERNAL_ECPE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'INTERNAL_ECPE_IN_DOLLAR');
  static const ECPM_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPM_IN_MICRO_DOLLAR');
  static const ECPM_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPM_IN_DOLLAR');
  static const REPIN_RATE = TemplateResponseColumnsEnum._(r'REPIN_RATE');
  static const rEPINRATE2 = TemplateResponseColumnsEnum._(r'REPIN_RATE_2');
  static const cTR2 = TemplateResponseColumnsEnum._(r'CTR_2');
  static const CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'CAMPAIGN_ID');
  static const ADVERTISER_ID = TemplateResponseColumnsEnum._(r'ADVERTISER_ID');
  static const AD_ACCOUNT_ID = TemplateResponseColumnsEnum._(r'AD_ACCOUNT_ID');
  static const ADVERTISER_OWNER_USER_ID = TemplateResponseColumnsEnum._(r'ADVERTISER_OWNER_USER_ID');
  static const ADVERTISER_OWNER_USER_NAME = TemplateResponseColumnsEnum._(r'ADVERTISER_OWNER_USER_NAME');
  static const PIN_PROMOTION_ID = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_ID');
  static const AD_ID = TemplateResponseColumnsEnum._(r'AD_ID');
  static const AD_GROUP_ID = TemplateResponseColumnsEnum._(r'AD_GROUP_ID');
  static const KEYWORD_ID = TemplateResponseColumnsEnum._(r'KEYWORD_ID');
  static const KEYWORD_IS_DELETED = TemplateResponseColumnsEnum._(r'KEYWORD_IS_DELETED');
  static const BRAND_SFDC_ACCOUNT_ID = TemplateResponseColumnsEnum._(r'BRAND_SFDC_ACCOUNT_ID');
  static const APP_INSTALL_APP_ID = TemplateResponseColumnsEnum._(r'APP_INSTALL_APP_ID');
  static const CAMPAIGN_ACTION_TYPE = TemplateResponseColumnsEnum._(r'CAMPAIGN_ACTION_TYPE');
  static const CAMPAIGN_BID_TYPE = TemplateResponseColumnsEnum._(r'CAMPAIGN_BID_TYPE');
  static const CAMPAIGN_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'CAMPAIGN_ENTITY_STATUS');
  static const CAMPAIGN_MANAGED_STATUS = TemplateResponseColumnsEnum._(r'CAMPAIGN_MANAGED_STATUS');
  static const CAMPAIGN_OBJECTIVE_TYPE = TemplateResponseColumnsEnum._(r'CAMPAIGN_OBJECTIVE_TYPE');
  static const CPM_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPM_IN_MICRO_DOLLAR');
  static const CPM_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPM_IN_DOLLAR');
  static const BUDGET_TYPE = TemplateResponseColumnsEnum._(r'BUDGET_TYPE');
  static const BUDGET_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'BUDGET_IN_LOCAL_CURRENCY');
  static const AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'AD_GROUP_NAME');
  static const AD_GROUP_STATUS = TemplateResponseColumnsEnum._(r'AD_GROUP_STATUS');
  static const AD_GROUP_END_DATE = TemplateResponseColumnsEnum._(r'AD_GROUP_END_DATE');
  static const AD_GROUP_BUDGET_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_BUDGET_TYPE');
  static const AD_GROUP_BUDGET_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY');
  static const AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY');
  static const AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY');
  static const AD_GROUP_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'AD_GROUP_ENTITY_STATUS');
  static const AD_GROUP_ACTION_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_ACTION_TYPE');
  static const AD_GROUP_CONVERSION_LEARNING_MODE_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_CONVERSION_LEARNING_MODE_TYPE');
  static const AD_GROUP_TARGET_CPA = TemplateResponseColumnsEnum._(r'AD_GROUP_TARGET_CPA');
  static const AD_GROUP_BID_STRATEGY_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_BID_STRATEGY_TYPE');
  static const AD_GROUP_EXPERIMENT_NAME = TemplateResponseColumnsEnum._(r'AD_GROUP_EXPERIMENT_NAME');
  static const AD_GROUP_EXPERIMENT_CELL = TemplateResponseColumnsEnum._(r'AD_GROUP_EXPERIMENT_CELL');
  static const AD_GROUP_BID_MULTIPLIER = TemplateResponseColumnsEnum._(r'AD_GROUP_BID_MULTIPLIER');
  static const CAMPAIGN_WEB_CLOSEUP_WHITELISTED = TemplateResponseColumnsEnum._(r'CAMPAIGN_WEB_CLOSEUP_WHITELISTED');
  static const PRODUCT_GROUP_ID = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_ID');
  static const PRODUCT_GROUP_DEFINITION = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_DEFINITION');
  static const PARENT_PRODUCT_GROUP_ID = TemplateResponseColumnsEnum._(r'PARENT_PRODUCT_GROUP_ID');
  static const PRODUCT_GROUP_TYPE = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_TYPE');
  static const PRODUCT_GROUP_BID_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_BID_IN_MICRO_CURRENCY');
  static const PRODUCT_GROUP_STATUS = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_STATUS');
  static const PRODUCT_GROUP_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_ENTITY_STATUS');
  static const PRODUCT_GROUP_INCLUSION = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_INCLUSION');
  static const PRODUCT_GROUP_CREATIVE_TYPE = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CREATIVE_TYPE');
  static const PROMO_ID = TemplateResponseColumnsEnum._(r'PROMO_ID');
  static const PROMO_NAME = TemplateResponseColumnsEnum._(r'PROMO_NAME');
  static const PROMO_IDS = TemplateResponseColumnsEnum._(r'PROMO_IDS');
  static const PROMO_NAMES = TemplateResponseColumnsEnum._(r'PROMO_NAMES');
  static const ITEM_ID = TemplateResponseColumnsEnum._(r'ITEM_ID');
  static const PRODUCT_ITEM_ID = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_ID');
  static const INTERNAL_PRODUCT_ITEM_ID = TemplateResponseColumnsEnum._(r'INTERNAL_PRODUCT_ITEM_ID');
  static const INTERNAL_PRODUCT_ITEM_ID_STR = TemplateResponseColumnsEnum._(r'INTERNAL_PRODUCT_ITEM_ID_STR');
  static const PRODUCT_ITEM_NAME = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_NAME');
  static const PRODUCT_ITEM_IMAGE_URL = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_IMAGE_URL');
  static const PRODUCT_ITEM_PRICE = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_PRICE');
  static const PRODUCT_ITEM_PRODUCT_URL = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_PRODUCT_URL');
  static const PRODUCT_ITEM_PIN_URL = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_PIN_URL');
  static const PRODUCT_ITEM_BRAND = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_BRAND');
  static const PRODUCT_ITEM_DESCRIPTION = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_DESCRIPTION');
  static const PRODUCT_ITEM_SALE_PRICE = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_SALE_PRICE');
  static const PRODUCT_ITEM_PRODUCT_TYPE = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_PRODUCT_TYPE');
  static const PRODUCT_ITEM_PRODUCT_CATEGORY = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_PRODUCT_CATEGORY');
  static const PRODUCT_ITEM_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_CAMPAIGN_NAME');
  static const PRODUCT_ITEM_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_AD_GROUP_NAME');
  static const PRODUCT_ITEM_CURRENCY = TemplateResponseColumnsEnum._(r'PRODUCT_ITEM_CURRENCY');
  static const ORDER_LINE_ID = TemplateResponseColumnsEnum._(r'ORDER_LINE_ID');
  static const ORDER_LINE_NAME = TemplateResponseColumnsEnum._(r'ORDER_LINE_NAME');
  static const ORDER_LINE_PIN_REV_SHARE = TemplateResponseColumnsEnum._(r'ORDER_LINE_PIN_REV_SHARE');
  static const ORDER_LINE_PAID_TYPE = TemplateResponseColumnsEnum._(r'ORDER_LINE_PAID_TYPE');
  static const SPEND_ORDER_LINE_ID = TemplateResponseColumnsEnum._(r'SPEND_ORDER_LINE_ID');
  static const SPEND_ORDER_LINE_PAID_TYPE = TemplateResponseColumnsEnum._(r'SPEND_ORDER_LINE_PAID_TYPE');
  static const CONVERSION_PRODUCT_ID = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_ID');
  static const CONVERSION_PRODUCT_NAME = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_NAME');
  static const CONVERSION_PRODUCT_BRAND = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_BRAND');
  static const CONVERSION_PRODUCT_CATEGORY = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_CATEGORY');
  static const CONVERSION_PRODUCT_ID_GROUP = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_ID_GROUP');
  static const CARTING_TOTAL_PURCHASE_INTENT_CLICKS = TemplateResponseColumnsEnum._(r'CARTING_TOTAL_PURCHASE_INTENT_CLICKS');
  static const CARTING_TOTAL_PURCHASE_INTENT_VALUE = TemplateResponseColumnsEnum._(r'CARTING_TOTAL_PURCHASE_INTENT_VALUE');
  static const CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY');
  static const CARTING_RETAILER_NAME = TemplateResponseColumnsEnum._(r'CARTING_RETAILER_NAME');
  static const CARTING_PRODUCT_PRICE = TemplateResponseColumnsEnum._(r'CARTING_PRODUCT_PRICE');
  static const CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY');
  static const CARTING_PRODUCT_NAME = TemplateResponseColumnsEnum._(r'CARTING_PRODUCT_NAME');
  static const CARTING_PRODUCT_ID = TemplateResponseColumnsEnum._(r'CARTING_PRODUCT_ID');
  static const cLICKTHROUGH1 = TemplateResponseColumnsEnum._(r'CLICKTHROUGH_1');
  static const rEPIN1 = TemplateResponseColumnsEnum._(r'REPIN_1');
  static const iMPRESSION1 = TemplateResponseColumnsEnum._(r'IMPRESSION_1');
  static const lIKE1 = TemplateResponseColumnsEnum._(r'LIKE_1');
  static const sEND1 = TemplateResponseColumnsEnum._(r'SEND_1');
  static const fLAG1 = TemplateResponseColumnsEnum._(r'FLAG_1');
  static const hIDE1 = TemplateResponseColumnsEnum._(r'HIDE_1');
  static const iNSERTION1 = TemplateResponseColumnsEnum._(r'INSERTION_1');
  static const iMPRESSION1GROSS = TemplateResponseColumnsEnum._(r'IMPRESSION_1_GROSS');
  static const cLICKTHROUGH1GROSS = TemplateResponseColumnsEnum._(r'CLICKTHROUGH_1_GROSS');
  static const oUTBOUNDCLICK1 = TemplateResponseColumnsEnum._(r'OUTBOUND_CLICK_1');
  static const cLICKTHROUGHUSER1 = TemplateResponseColumnsEnum._(r'CLICKTHROUGH_USER_1');
  static const rEPINUSER1 = TemplateResponseColumnsEnum._(r'REPIN_USER_1');
  static const iMPRESSIONUSER1 = TemplateResponseColumnsEnum._(r'IMPRESSION_USER_1');
  static const lIKEUSER1 = TemplateResponseColumnsEnum._(r'LIKE_USER_1');
  static const sENDUSER1 = TemplateResponseColumnsEnum._(r'SEND_USER_1');
  static const fLAGUSER1 = TemplateResponseColumnsEnum._(r'FLAG_USER_1');
  static const hIDEUSER1 = TemplateResponseColumnsEnum._(r'HIDE_USER_1');
  static const iNSERTIONUSER1 = TemplateResponseColumnsEnum._(r'INSERTION_USER_1');
  static const cLICKTHROUGH2 = TemplateResponseColumnsEnum._(r'CLICKTHROUGH_2');
  static const rEPIN2 = TemplateResponseColumnsEnum._(r'REPIN_2');
  static const iMPRESSION2 = TemplateResponseColumnsEnum._(r'IMPRESSION_2');
  static const lIKE2 = TemplateResponseColumnsEnum._(r'LIKE_2');
  static const sEND2 = TemplateResponseColumnsEnum._(r'SEND_2');
  static const fLAG2 = TemplateResponseColumnsEnum._(r'FLAG_2');
  static const oUTBOUNDCLICK2 = TemplateResponseColumnsEnum._(r'OUTBOUND_CLICK_2');
  static const cLICKTHROUGHUSER2 = TemplateResponseColumnsEnum._(r'CLICKTHROUGH_USER_2');
  static const rEPINUSER2 = TemplateResponseColumnsEnum._(r'REPIN_USER_2');
  static const iMPRESSIONUSER2 = TemplateResponseColumnsEnum._(r'IMPRESSION_USER_2');
  static const lIKEUSER2 = TemplateResponseColumnsEnum._(r'LIKE_USER_2');
  static const sENDUSER2 = TemplateResponseColumnsEnum._(r'SEND_USER_2');
  static const fLAGUSER2 = TemplateResponseColumnsEnum._(r'FLAG_USER_2');
  static const TOTAL_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'TOTAL_CLICKTHROUGH');
  static const TOTAL_REPIN = TemplateResponseColumnsEnum._(r'TOTAL_REPIN');
  static const TOTAL_IMPRESSION = TemplateResponseColumnsEnum._(r'TOTAL_IMPRESSION');
  static const TOTAL_LIKE = TemplateResponseColumnsEnum._(r'TOTAL_LIKE');
  static const TOTAL_SEND = TemplateResponseColumnsEnum._(r'TOTAL_SEND');
  static const TOTAL_FLAG = TemplateResponseColumnsEnum._(r'TOTAL_FLAG');
  static const TOTAL_IMPRESSION_USER = TemplateResponseColumnsEnum._(r'TOTAL_IMPRESSION_USER');
  static const TOTAL_IMPRESSION_USER_HLL = TemplateResponseColumnsEnum._(r'TOTAL_IMPRESSION_USER_HLL');
  static const TOTAL_IMPRESSION_FREQUENCY = TemplateResponseColumnsEnum._(r'TOTAL_IMPRESSION_FREQUENCY');
  static const TOTAL_IMPRESSION_FREQUENCY_HLL = TemplateResponseColumnsEnum._(r'TOTAL_IMPRESSION_FREQUENCY_HLL');
  static const TOTAL_OUTBOUND_CLICK = TemplateResponseColumnsEnum._(r'TOTAL_OUTBOUND_CLICK');
  static const COST_PER_OUTBOUND_CLICK_IN_DOLLAR = TemplateResponseColumnsEnum._(r'COST_PER_OUTBOUND_CLICK_IN_DOLLAR');
  static const cOSTPEROUTBOUNDCLICKINDOLLAR1 = TemplateResponseColumnsEnum._(r'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1');
  static const eNGAGEMENTPAGEVISIT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_1');
  static const eNGAGEMENTSIGNUP1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_1');
  static const eNGAGEMENTCHECKOUT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_1');
  static const eNGAGEMENTCUSTOM1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_1');
  static const eNGAGEMENTADDTOCART1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_1');
  static const eNGAGEMENTLEAD1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_1');
  static const eNGAGEMENTSEARCH1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_1');
  static const eNGAGEMENTWATCHVIDEO1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_1');
  static const eNGAGEMENTVIEWCATEGORY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_1');
  static const eNGAGEMENTAPPINSTALL1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_1');
  static const eNGAGEMENTUNKNOWN1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_1');
  static const eNGAGEMENTADDPAYMENTINFO1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_1');
  static const eNGAGEMENTADDTOWISHLIST1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_1');
  static const eNGAGEMENTINITIATECHECKOUT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_1');
  static const eNGAGEMENTSUBSCRIBE1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_1');
  static const eNGAGEMENTVIEWCONTENT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_1');
  static const cLICKPAGEVISIT1 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_1');
  static const cLICKSIGNUP1 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_1');
  static const cLICKCHECKOUT1 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_1');
  static const cLICKCUSTOM1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_1');
  static const cLICKADDTOCART1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_1');
  static const cLICKLEAD1 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_1');
  static const cLICKSEARCH1 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_1');
  static const cLICKWATCHVIDEO1 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_1');
  static const cLICKVIEWCATEGORY1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_1');
  static const cLICKAPPINSTALL1 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_1');
  static const cLICKUNKNOWN1 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_1');
  static const cLICKADDPAYMENTINFO1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_1');
  static const cLICKADDTOWISHLIST1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_1');
  static const cLICKINITIATECHECKOUT1 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_1');
  static const cLICKSUBSCRIBE1 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_1');
  static const cLICKVIEWCONTENT1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_1');
  static const vIEWPAGEVISIT1 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_1');
  static const vIEWSIGNUP1 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_1');
  static const vIEWCHECKOUT1 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_1');
  static const vIEWCUSTOM1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_1');
  static const vIEWADDTOCART1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_1');
  static const vIEWLEAD1 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_1');
  static const vIEWSEARCH1 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_1');
  static const vIEWWATCHVIDEO1 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_1');
  static const vIEWVIEWCATEGORY1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_1');
  static const vIEWAPPINSTALL1 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_1');
  static const vIEWUNKNOWN1 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_1');
  static const vIEWADDPAYMENTINFO1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_1');
  static const vIEWADDTOWISHLIST1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_1');
  static const vIEWINITIATECHECKOUT1 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_1');
  static const vIEWSUBSCRIBE1 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_1');
  static const vIEWVIEWCONTENT1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_1');
  static const cONVERSIONS1 = TemplateResponseColumnsEnum._(r'CONVERSIONS_1');
  static const eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSIGNUPVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTCUSTOMVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTLEADVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSEARCHVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKPAGEVISITVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSIGNUPVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKCHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKCUSTOMVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKADDTOCARTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKLEADVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSEARCHVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKWATCHVIDEOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKVIEWCATEGORYVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKAPPINSTALLVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKUNKNOWNVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKADDPAYMENTINFOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKADDTOWISHLISTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKINITIATECHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSUBSCRIBEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKVIEWCONTENTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWPAGEVISITVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSIGNUPVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWCHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWCUSTOMVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWADDTOCARTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWLEADVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSEARCHVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWWATCHVIDEOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWVIEWCATEGORYVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWAPPINSTALLVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWUNKNOWNVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWADDPAYMENTINFOVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWADDTOWISHLISTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWINITIATECHECKOUTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSUBSCRIBEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWVIEWCONTENTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1');
  static const cONVERSIONSVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CONVERSIONS_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTPAGEVISITQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_QUANTITY_1');
  static const eNGAGEMENTSIGNUPQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_QUANTITY_1');
  static const eNGAGEMENTCHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_QUANTITY_1');
  static const eNGAGEMENTCUSTOMQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_QUANTITY_1');
  static const eNGAGEMENTADDTOCARTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_QUANTITY_1');
  static const eNGAGEMENTLEADQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_QUANTITY_1');
  static const eNGAGEMENTSEARCHQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_QUANTITY_1');
  static const eNGAGEMENTWATCHVIDEOQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_QUANTITY_1');
  static const eNGAGEMENTVIEWCATEGORYQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_QUANTITY_1');
  static const eNGAGEMENTAPPINSTALLQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_QUANTITY_1');
  static const eNGAGEMENTUNKNOWNQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_QUANTITY_1');
  static const eNGAGEMENTADDPAYMENTINFOQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_1');
  static const eNGAGEMENTADDTOWISHLISTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_1');
  static const eNGAGEMENTINITIATECHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_1');
  static const eNGAGEMENTSUBSCRIBEQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_QUANTITY_1');
  static const eNGAGEMENTVIEWCONTENTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_QUANTITY_1');
  static const cLICKPAGEVISITQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_QUANTITY_1');
  static const cLICKSIGNUPQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_QUANTITY_1');
  static const cLICKCHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_QUANTITY_1');
  static const cLICKCUSTOMQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_QUANTITY_1');
  static const cLICKADDTOCARTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_QUANTITY_1');
  static const cLICKLEADQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_QUANTITY_1');
  static const cLICKSEARCHQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_QUANTITY_1');
  static const cLICKWATCHVIDEOQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_QUANTITY_1');
  static const cLICKVIEWCATEGORYQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_QUANTITY_1');
  static const cLICKAPPINSTALLQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_QUANTITY_1');
  static const cLICKUNKNOWNQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_QUANTITY_1');
  static const cLICKADDPAYMENTINFOQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_QUANTITY_1');
  static const cLICKADDTOWISHLISTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_QUANTITY_1');
  static const cLICKINITIATECHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_QUANTITY_1');
  static const cLICKSUBSCRIBEQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_QUANTITY_1');
  static const cLICKVIEWCONTENTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_QUANTITY_1');
  static const vIEWPAGEVISITQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_QUANTITY_1');
  static const vIEWSIGNUPQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_QUANTITY_1');
  static const vIEWCHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_QUANTITY_1');
  static const vIEWCUSTOMQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_QUANTITY_1');
  static const vIEWADDTOCARTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_QUANTITY_1');
  static const vIEWLEADQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_QUANTITY_1');
  static const vIEWSEARCHQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_QUANTITY_1');
  static const vIEWWATCHVIDEOQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_QUANTITY_1');
  static const vIEWVIEWCATEGORYQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_QUANTITY_1');
  static const vIEWAPPINSTALLQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_QUANTITY_1');
  static const vIEWUNKNOWNQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_QUANTITY_1');
  static const vIEWADDPAYMENTINFOQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_QUANTITY_1');
  static const vIEWADDTOWISHLISTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_QUANTITY_1');
  static const vIEWINITIATECHECKOUTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_QUANTITY_1');
  static const vIEWSUBSCRIBEQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_QUANTITY_1');
  static const vIEWVIEWCONTENTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_QUANTITY_1');
  static const cONVERSIONSQUANTITY1 = TemplateResponseColumnsEnum._(r'CONVERSIONS_QUANTITY_1');
  static const eNGAGEMENTPAGEVISIT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_2');
  static const eNGAGEMENTSIGNUP2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_2');
  static const eNGAGEMENTCHECKOUT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_2');
  static const eNGAGEMENTCUSTOM2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_2');
  static const eNGAGEMENTADDTOCART2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_2');
  static const eNGAGEMENTLEAD2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_2');
  static const eNGAGEMENTSEARCH2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_2');
  static const eNGAGEMENTWATCHVIDEO2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_2');
  static const eNGAGEMENTVIEWCATEGORY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_2');
  static const eNGAGEMENTAPPINSTALL2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_2');
  static const eNGAGEMENTUNKNOWN2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_2');
  static const eNGAGEMENTADDPAYMENTINFO2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_2');
  static const eNGAGEMENTADDTOWISHLIST2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_2');
  static const eNGAGEMENTINITIATECHECKOUT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_2');
  static const eNGAGEMENTSUBSCRIBE2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_2');
  static const eNGAGEMENTVIEWCONTENT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_2');
  static const cLICKPAGEVISIT2 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_2');
  static const cLICKSIGNUP2 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_2');
  static const cLICKCHECKOUT2 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_2');
  static const cLICKCUSTOM2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_2');
  static const cLICKADDTOCART2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_2');
  static const cLICKLEAD2 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_2');
  static const cLICKSEARCH2 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_2');
  static const cLICKWATCHVIDEO2 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_2');
  static const cLICKVIEWCATEGORY2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_2');
  static const cLICKAPPINSTALL2 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_2');
  static const cLICKUNKNOWN2 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_2');
  static const cLICKADDPAYMENTINFO2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_2');
  static const cLICKADDTOWISHLIST2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_2');
  static const cLICKINITIATECHECKOUT2 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_2');
  static const cLICKSUBSCRIBE2 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_2');
  static const cLICKVIEWCONTENT2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_2');
  static const vIEWPAGEVISIT2 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_2');
  static const vIEWSIGNUP2 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_2');
  static const vIEWCHECKOUT2 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_2');
  static const vIEWCUSTOM2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_2');
  static const vIEWADDTOCART2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_2');
  static const vIEWLEAD2 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_2');
  static const vIEWSEARCH2 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_2');
  static const vIEWWATCHVIDEO2 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_2');
  static const vIEWVIEWCATEGORY2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_2');
  static const vIEWAPPINSTALL2 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_2');
  static const vIEWUNKNOWN2 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_2');
  static const vIEWADDPAYMENTINFO2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_2');
  static const vIEWADDTOWISHLIST2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_2');
  static const vIEWINITIATECHECKOUT2 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_2');
  static const vIEWSUBSCRIBE2 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_2');
  static const vIEWVIEWCONTENT2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_2');
  static const cONVERSIONS2 = TemplateResponseColumnsEnum._(r'CONVERSIONS_2');
  static const eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSIGNUPVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTCUSTOMVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTLEADVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSEARCHVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKPAGEVISITVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSIGNUPVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKCHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKCUSTOMVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKADDTOCARTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKLEADVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSEARCHVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKWATCHVIDEOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKVIEWCATEGORYVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKAPPINSTALLVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKUNKNOWNVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKADDPAYMENTINFOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKADDTOWISHLISTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKINITIATECHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSUBSCRIBEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKVIEWCONTENTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWPAGEVISITVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSIGNUPVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWCHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWCUSTOMVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWADDTOCARTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWLEADVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSEARCHVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWWATCHVIDEOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWVIEWCATEGORYVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWAPPINSTALLVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWUNKNOWNVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWADDPAYMENTINFOVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWADDTOWISHLISTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWINITIATECHECKOUTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSUBSCRIBEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWVIEWCONTENTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2');
  static const cONVERSIONSVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CONVERSIONS_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTPAGEVISITQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_PAGE_VISIT_QUANTITY_2');
  static const eNGAGEMENTSIGNUPQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SIGNUP_QUANTITY_2');
  static const eNGAGEMENTCHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CHECKOUT_QUANTITY_2');
  static const eNGAGEMENTCUSTOMQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOM_QUANTITY_2');
  static const eNGAGEMENTADDTOCARTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_CART_QUANTITY_2');
  static const eNGAGEMENTLEADQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_LEAD_QUANTITY_2');
  static const eNGAGEMENTSEARCHQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SEARCH_QUANTITY_2');
  static const eNGAGEMENTWATCHVIDEOQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_WATCH_VIDEO_QUANTITY_2');
  static const eNGAGEMENTVIEWCATEGORYQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CATEGORY_QUANTITY_2');
  static const eNGAGEMENTAPPINSTALLQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_INSTALL_QUANTITY_2');
  static const eNGAGEMENTUNKNOWNQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_UNKNOWN_QUANTITY_2');
  static const eNGAGEMENTADDPAYMENTINFOQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_2');
  static const eNGAGEMENTADDTOWISHLISTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_2');
  static const eNGAGEMENTINITIATECHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_2');
  static const eNGAGEMENTSUBSCRIBEQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBSCRIBE_QUANTITY_2');
  static const eNGAGEMENTVIEWCONTENTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_VIEW_CONTENT_QUANTITY_2');
  static const cLICKPAGEVISITQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_PAGE_VISIT_QUANTITY_2');
  static const cLICKSIGNUPQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_SIGNUP_QUANTITY_2');
  static const cLICKCHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_CHECKOUT_QUANTITY_2');
  static const cLICKCUSTOMQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOM_QUANTITY_2');
  static const cLICKADDTOCARTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_CART_QUANTITY_2');
  static const cLICKLEADQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_LEAD_QUANTITY_2');
  static const cLICKSEARCHQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_SEARCH_QUANTITY_2');
  static const cLICKWATCHVIDEOQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_WATCH_VIDEO_QUANTITY_2');
  static const cLICKVIEWCATEGORYQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CATEGORY_QUANTITY_2');
  static const cLICKAPPINSTALLQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_APP_INSTALL_QUANTITY_2');
  static const cLICKUNKNOWNQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_UNKNOWN_QUANTITY_2');
  static const cLICKADDPAYMENTINFOQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_PAYMENT_INFO_QUANTITY_2');
  static const cLICKADDTOWISHLISTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_ADD_TO_WISHLIST_QUANTITY_2');
  static const cLICKINITIATECHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_INITIATE_CHECKOUT_QUANTITY_2');
  static const cLICKSUBSCRIBEQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_SUBSCRIBE_QUANTITY_2');
  static const cLICKVIEWCONTENTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_VIEW_CONTENT_QUANTITY_2');
  static const vIEWPAGEVISITQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_PAGE_VISIT_QUANTITY_2');
  static const vIEWSIGNUPQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_SIGNUP_QUANTITY_2');
  static const vIEWCHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_CHECKOUT_QUANTITY_2');
  static const vIEWCUSTOMQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOM_QUANTITY_2');
  static const vIEWADDTOCARTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_CART_QUANTITY_2');
  static const vIEWLEADQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_LEAD_QUANTITY_2');
  static const vIEWSEARCHQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_SEARCH_QUANTITY_2');
  static const vIEWWATCHVIDEOQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_WATCH_VIDEO_QUANTITY_2');
  static const vIEWVIEWCATEGORYQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CATEGORY_QUANTITY_2');
  static const vIEWAPPINSTALLQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_APP_INSTALL_QUANTITY_2');
  static const vIEWUNKNOWNQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_UNKNOWN_QUANTITY_2');
  static const vIEWADDPAYMENTINFOQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_PAYMENT_INFO_QUANTITY_2');
  static const vIEWADDTOWISHLISTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_ADD_TO_WISHLIST_QUANTITY_2');
  static const vIEWINITIATECHECKOUTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_INITIATE_CHECKOUT_QUANTITY_2');
  static const vIEWSUBSCRIBEQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_SUBSCRIBE_QUANTITY_2');
  static const vIEWVIEWCONTENTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_VIEW_CONTENT_QUANTITY_2');
  static const cONVERSIONSQUANTITY2 = TemplateResponseColumnsEnum._(r'CONVERSIONS_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_PAGE_VISIT');
  static const TOTAL_ENGAGEMENT_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SIGNUP');
  static const TOTAL_ENGAGEMENT_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CHECKOUT');
  static const TOTAL_ENGAGEMENT_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOM');
  static const TOTAL_ENGAGEMENT_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_CART');
  static const TOTAL_ENGAGEMENT_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_LEAD');
  static const TOTAL_ENGAGEMENT_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SEARCH');
  static const TOTAL_ENGAGEMENT_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_WATCH_VIDEO');
  static const TOTAL_ENGAGEMENT_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CATEGORY');
  static const TOTAL_ENGAGEMENT_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_INSTALL');
  static const TOTAL_ENGAGEMENT_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_UNKNOWN');
  static const TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO');
  static const TOTAL_ENGAGEMENT_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST');
  static const TOTAL_ENGAGEMENT_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT');
  static const TOTAL_ENGAGEMENT_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBSCRIBE');
  static const TOTAL_ENGAGEMENT_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CONTENT');
  static const TOTAL_CLICK_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_PAGE_VISIT');
  static const TOTAL_CLICK_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SIGNUP');
  static const TOTAL_CLICK_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CHECKOUT');
  static const TOTAL_CLICK_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOM');
  static const TOTAL_CLICK_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_CART');
  static const TOTAL_CLICK_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_LEAD');
  static const TOTAL_CLICK_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SEARCH');
  static const TOTAL_CLICK_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_WATCH_VIDEO');
  static const TOTAL_CLICK_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CATEGORY');
  static const TOTAL_CLICK_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_INSTALL');
  static const TOTAL_CLICK_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_UNKNOWN');
  static const TOTAL_CLICK_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_PAYMENT_INFO');
  static const TOTAL_CLICK_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_WISHLIST');
  static const TOTAL_CLICK_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_INITIATE_CHECKOUT');
  static const TOTAL_CLICK_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBSCRIBE');
  static const TOTAL_CLICK_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CONTENT');
  static const TOTAL_VIEW_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_PAGE_VISIT');
  static const TOTAL_VIEW_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SIGNUP');
  static const TOTAL_VIEW_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CHECKOUT');
  static const TOTAL_VIEW_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOM');
  static const TOTAL_VIEW_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_CART');
  static const TOTAL_VIEW_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_LEAD');
  static const TOTAL_VIEW_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SEARCH');
  static const TOTAL_VIEW_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_WATCH_VIDEO');
  static const TOTAL_VIEW_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CATEGORY');
  static const TOTAL_VIEW_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_INSTALL');
  static const TOTAL_VIEW_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_UNKNOWN');
  static const TOTAL_VIEW_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_PAYMENT_INFO');
  static const TOTAL_VIEW_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_WISHLIST');
  static const TOTAL_VIEW_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_INITIATE_CHECKOUT');
  static const TOTAL_VIEW_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBSCRIBE');
  static const TOTAL_VIEW_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CONTENT');
  static const TOTAL_CONVERSIONS = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSIONS');
  static const TOTAL_WEB_CONVERSIONS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSIONS');
  static const TOTAL_INAPP_CONVERSIONS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSIONS');
  static const TOTAL_OFFLINE_CONVERSIONS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSIONS');
  static const TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CONVERSIONS_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSIONS_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY');
  static const TOTAL_ENGAGEMENT_SIGNUP_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SIGNUP_QUANTITY');
  static const TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY');
  static const TOTAL_ENGAGEMENT_CUSTOM_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOM_QUANTITY');
  static const TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY');
  static const TOTAL_ENGAGEMENT_LEAD_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_LEAD_QUANTITY');
  static const TOTAL_ENGAGEMENT_SEARCH_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SEARCH_QUANTITY');
  static const TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY');
  static const TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY');
  static const TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY');
  static const TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY');
  static const TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY');
  static const TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY');
  static const TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY');
  static const TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY');
  static const TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY');
  static const TOTAL_CLICK_PAGE_VISIT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_PAGE_VISIT_QUANTITY');
  static const TOTAL_CLICK_SIGNUP_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SIGNUP_QUANTITY');
  static const TOTAL_CLICK_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CHECKOUT_QUANTITY');
  static const TOTAL_CLICK_CUSTOM_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOM_QUANTITY');
  static const TOTAL_CLICK_ADD_TO_CART_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_CART_QUANTITY');
  static const TOTAL_CLICK_LEAD_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_LEAD_QUANTITY');
  static const TOTAL_CLICK_SEARCH_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SEARCH_QUANTITY');
  static const TOTAL_CLICK_WATCH_VIDEO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_WATCH_VIDEO_QUANTITY');
  static const TOTAL_CLICK_VIEW_CATEGORY_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CATEGORY_QUANTITY');
  static const TOTAL_CLICK_APP_INSTALL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_INSTALL_QUANTITY');
  static const TOTAL_CLICK_UNKNOWN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_UNKNOWN_QUANTITY');
  static const TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY');
  static const TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY');
  static const TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY');
  static const TOTAL_CLICK_SUBSCRIBE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBSCRIBE_QUANTITY');
  static const TOTAL_CLICK_VIEW_CONTENT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_VIEW_CONTENT_QUANTITY');
  static const TOTAL_VIEW_PAGE_VISIT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_PAGE_VISIT_QUANTITY');
  static const TOTAL_VIEW_SIGNUP_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SIGNUP_QUANTITY');
  static const TOTAL_VIEW_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CHECKOUT_QUANTITY');
  static const TOTAL_VIEW_CUSTOM_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOM_QUANTITY');
  static const TOTAL_VIEW_ADD_TO_CART_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_CART_QUANTITY');
  static const TOTAL_VIEW_LEAD_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_LEAD_QUANTITY');
  static const TOTAL_VIEW_SEARCH_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SEARCH_QUANTITY');
  static const TOTAL_VIEW_WATCH_VIDEO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_WATCH_VIDEO_QUANTITY');
  static const TOTAL_VIEW_VIEW_CATEGORY_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CATEGORY_QUANTITY');
  static const TOTAL_VIEW_APP_INSTALL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_INSTALL_QUANTITY');
  static const TOTAL_VIEW_UNKNOWN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_UNKNOWN_QUANTITY');
  static const TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY');
  static const TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY');
  static const TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY');
  static const TOTAL_VIEW_SUBSCRIBE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBSCRIBE_QUANTITY');
  static const TOTAL_VIEW_VIEW_CONTENT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_VIEW_CONTENT_QUANTITY');
  static const TOTAL_CONVERSIONS_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSIONS_QUANTITY');
  static const COST_PER_CONVERSION_IN_DOLLAR = TemplateResponseColumnsEnum._(r'COST_PER_CONVERSION_IN_DOLLAR');
  static const TOTAL_WEB_SESSIONS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SESSIONS');
  static const wEBSESSIONS1 = TemplateResponseColumnsEnum._(r'WEB_SESSIONS_1');
  static const wEBSESSIONS2 = TemplateResponseColumnsEnum._(r'WEB_SESSIONS_2');
  static const APP_INSTALLS_CPA_BILLABLE = TemplateResponseColumnsEnum._(r'APP_INSTALLS_CPA_BILLABLE');
  static const APP_INSTALLS_CLICK = TemplateResponseColumnsEnum._(r'APP_INSTALLS_CLICK');
  static const APP_INSTALLS_CLOSEUPREPIN = TemplateResponseColumnsEnum._(r'APP_INSTALLS_CLOSEUPREPIN');
  static const APP_INSTALLS_VIEW = TemplateResponseColumnsEnum._(r'APP_INSTALLS_VIEW');
  static const APP_INSTALLS = TemplateResponseColumnsEnum._(r'APP_INSTALLS');
  static const APP_INSTALLS_ENGAGEMENT = TemplateResponseColumnsEnum._(r'APP_INSTALLS_ENGAGEMENT');
  static const aPPINSTALLSCLICK1 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_CLICK_1');
  static const aPPINSTALLSCLICK2 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_CLICK_2');
  static const aPPINSTALLSVIEW1 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_VIEW_1');
  static const aPPINSTALLSVIEW2 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_VIEW_2');
  static const aPPINSTALLSENGAGEMENT1 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_ENGAGEMENT_1');
  static const aPPINSTALLSENGAGEMENT2 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_ENGAGEMENT_2');
  static const aPPINSTALLS1 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_1');
  static const aPPINSTALLS2 = TemplateResponseColumnsEnum._(r'APP_INSTALLS_2');
  static const CPI_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPI_IN_MICRO_DOLLAR');
  static const ECPI_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPI_IN_MICRO_DOLLAR');
  static const CPI_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPI_IN_DOLLAR');
  static const ECPI_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPI_IN_DOLLAR');
  static const INAPP_SKAN_APP_INSTALL = TemplateResponseColumnsEnum._(r'INAPP_SKAN_APP_INSTALL');
  static const INAPP_SKAN_ASSISTED_APP_INSTALL = TemplateResponseColumnsEnum._(r'INAPP_SKAN_ASSISTED_APP_INSTALL');
  static const INAPP_SKAN_APP_INSTALL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SKAN_APP_INSTALL_COST_PER_ACTION');
  static const INAPP_SKAN_APP_INSTALL_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'INAPP_SKAN_APP_INSTALL_CONVERSION_RATE');
  static const oNSITECHECKOUTSCPABILLABLE1 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_CPA_BILLABLE_1');
  static const oNSITECHECKOUTSCPABILLABLE2 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_CPA_BILLABLE_2');
  static const ONSITE_CHECKOUTS_CPA_BILLABLE = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_CPA_BILLABLE');
  static const oNSITECHECKOUTSVALUE1 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_1');
  static const oNSITECHECKOUTSVALUE2 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_2');
  static const ONSITE_CHECKOUTS_VALUE = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE');
  static const oNSITECHECKOUTS1 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_1');
  static const oNSITECHECKOUTS2 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_2');
  static const ONSITE_CHECKOUTS = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS');
  static const oNSITECHECKOUTSVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_1');
  static const oNSITECHECKOUTSVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_2');
  static const CONVERSION_RATE = TemplateResponseColumnsEnum._(r'CONVERSION_RATE');
  static const AVERAGE_CHECKOUT_VALUE = TemplateResponseColumnsEnum._(r'AVERAGE_CHECKOUT_VALUE');
  static const RETURN_ON_ADVERTISER_SPEND = TemplateResponseColumnsEnum._(r'RETURN_ON_ADVERTISER_SPEND');
  static const bUYBUTTONCLICKS1 = TemplateResponseColumnsEnum._(r'BUY_BUTTON_CLICKS_1');
  static const bUYBUTTONCLICKS2 = TemplateResponseColumnsEnum._(r'BUY_BUTTON_CLICKS_2');
  static const TOTAL_BUY_BUTTON_CLICKS = TemplateResponseColumnsEnum._(r'TOTAL_BUY_BUTTON_CLICKS');
  static const ORDER_DROPOFF_RATE = TemplateResponseColumnsEnum._(r'ORDER_DROPOFF_RATE');
  static const ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR');
  static const ONSITE_CHECKOUTS_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ONSITE_CHECKOUTS_VALUE_IN_DOLLAR');
  static const PIN_PROMOTION_NAME = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_NAME');
  static const AD_NAME = TemplateResponseColumnsEnum._(r'AD_NAME');
  static const lIFETIMEIMPRESSIONUSER1 = TemplateResponseColumnsEnum._(r'LIFETIME_IMPRESSION_USER_1');
  static const PIN_PROMOTION_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_ID');
  static const PIN_PROMOTION_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_NAME');
  static const PIN_PROMOTION_CAMPAIGN_ACTION_TYPE = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_ACTION_TYPE');
  static const TOTAL_LIFETIME_IMPRESSION_USER = TemplateResponseColumnsEnum._(r'TOTAL_LIFETIME_IMPRESSION_USER');
  static const PIN_PROMOTION_CAMPAIGN_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_STATUS');
  static const PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS');
  static const PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS');
  static const PIN_PROMOTION_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_AD_GROUP_ID');
  static const PIN_PROMOTION_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_AD_GROUP_NAME');
  static const PIN_PROMOTION_AD_GROUP_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_AD_GROUP_STATUS');
  static const PIN_PROMOTION_AD_GROUP_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_AD_GROUP_ENTITY_STATUS');
  static const PIN_PROMOTION_CREATIVE_TYPE = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CREATIVE_TYPE');
  static const PIN_PROMOTION_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_ENTITY_STATUS');
  static const pINPROMOTIONCREATIVETYPEV2 = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_CREATIVE_TYPE_V2');
  static const PIN_PROMOTION_REVIEW_STATUS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_REVIEW_STATUS');
  static const AD_GROUP_CAMPAIGN_ACTION_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_ACTION_TYPE');
  static const AD_GROUP_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_ID');
  static const AD_GROUP_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_NAME');
  static const AD_GROUP_CAMPAIGN_STATUS = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_STATUS');
  static const AD_GROUP_CREATIVE_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_CREATIVE_TYPE');
  static const AD_GROUP_CAMPAIGN_MANAGED_STATUS = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_MANAGED_STATUS');
  static const AD_GROUP_CAMPAIGN_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'AD_GROUP_CAMPAIGN_ENTITY_STATUS');
  static const AD_GROUP_START_DATE = TemplateResponseColumnsEnum._(r'AD_GROUP_START_DATE');
  static const CAMPAIGN_LIFETIME_SPEND_CAP = TemplateResponseColumnsEnum._(r'CAMPAIGN_LIFETIME_SPEND_CAP');
  static const AD_GROUP_BID_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'AD_GROUP_BID_IN_MICRO_CURRENCY');
  static const CAMPAIGN_AD_GROUP_START_DATE = TemplateResponseColumnsEnum._(r'CAMPAIGN_AD_GROUP_START_DATE');
  static const CAMPAIGN_AD_GROUP_END_DATE = TemplateResponseColumnsEnum._(r'CAMPAIGN_AD_GROUP_END_DATE');
  static const CAMPAIGN_NUMBER_OF_AD_GROUPS = TemplateResponseColumnsEnum._(r'CAMPAIGN_NUMBER_OF_AD_GROUPS');
  static const AD_GROUP_NUMBER_OF_PIN_PROMOTIONS = TemplateResponseColumnsEnum._(r'AD_GROUP_NUMBER_OF_PIN_PROMOTIONS');
  static const TODAY_SPEND_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'TODAY_SPEND_IN_LOCAL_CURRENCY');
  static const TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY = TemplateResponseColumnsEnum._(r'TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY');
  static const BUDGET_UTILIZATION = TemplateResponseColumnsEnum._(r'BUDGET_UTILIZATION');
  static const AD_GROUP_OPTIMIZATION = TemplateResponseColumnsEnum._(r'AD_GROUP_OPTIMIZATION');
  static const INSERTION_ORDER = TemplateResponseColumnsEnum._(r'INSERTION_ORDER');
  static const AD_GROUP_BONUS_BUDGET = TemplateResponseColumnsEnum._(r'AD_GROUP_BONUS_BUDGET');
  static const FREQUENCY = TemplateResponseColumnsEnum._(r'FREQUENCY');
  static const CAMPAIGN_DAILY_SPEND_CAP = TemplateResponseColumnsEnum._(r'CAMPAIGN_DAILY_SPEND_CAP');
  static const CAMPAIGN_CREATIVE_TYPE = TemplateResponseColumnsEnum._(r'CAMPAIGN_CREATIVE_TYPE');
  static const AD_GROUP_PLACEMENT_GROUP_TYPE = TemplateResponseColumnsEnum._(r'AD_GROUP_PLACEMENT_GROUP_TYPE');
  static const AD_GROUP_IS_PREFETCH_ENABLED = TemplateResponseColumnsEnum._(r'AD_GROUP_IS_PREFETCH_ENABLED');
  static const CAMPAIGN_BUDGET_OPTIMIZATION = TemplateResponseColumnsEnum._(r'CAMPAIGN_BUDGET_OPTIMIZATION');
  static const CAMPAIGN_START_DATE = TemplateResponseColumnsEnum._(r'CAMPAIGN_START_DATE');
  static const IS_AUTOMATED_CAMPAIGN = TemplateResponseColumnsEnum._(r'IS_AUTOMATED_CAMPAIGN');
  static const IS_PREMIERE_CAMPAIGN = TemplateResponseColumnsEnum._(r'IS_PREMIERE_CAMPAIGN');
  static const FLEXIBLE_DAILY_BUDGETS = TemplateResponseColumnsEnum._(r'FLEXIBLE_DAILY_BUDGETS');
  static const IS_PERFORMANCE_PLUS_CAMPAIGN = TemplateResponseColumnsEnum._(r'IS_PERFORMANCE_PLUS_CAMPAIGN');
  static const IS_DCO_FORMAT_ENHANCMENT = TemplateResponseColumnsEnum._(r'IS_DCO_FORMAT_ENHANCMENT');
  static const PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS = TemplateResponseColumnsEnum._(r'UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS');
  static const TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION');
  static const TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION');
  static const TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION');
  static const TOTAL_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT');
  static const TOTAL_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP');
  static const TOTAL_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT');
  static const TOTAL_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM');
  static const TOTAL_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART');
  static const TOTAL_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_LEAD');
  static const TOTAL_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH');
  static const TOTAL_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO');
  static const TOTAL_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY');
  static const TOTAL_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL');
  static const TOTAL_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN');
  static const TOTAL_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO');
  static const TOTAL_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST');
  static const TOTAL_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT');
  static const TOTAL_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE');
  static const TOTAL_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT');
  static const TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR');
  static const AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_PAGE_VISIT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_QUANTITY');
  static const TOTAL_SIGNUP_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_QUANTITY');
  static const TOTAL_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_QUANTITY');
  static const TOTAL_CUSTOM_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_QUANTITY');
  static const TOTAL_ADD_TO_CART_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_QUANTITY');
  static const TOTAL_LEAD_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_QUANTITY');
  static const TOTAL_SEARCH_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_QUANTITY');
  static const TOTAL_WATCH_VIDEO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_QUANTITY');
  static const TOTAL_VIEW_CATEGORY_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_QUANTITY');
  static const TOTAL_APP_INSTALL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_QUANTITY');
  static const TOTAL_UNKNOWN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_QUANTITY');
  static const TOTAL_ADD_PAYMENT_INFO_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_QUANTITY');
  static const TOTAL_ADD_TO_WISHLIST_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_QUANTITY');
  static const TOTAL_INITIATE_CHECKOUT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_QUANTITY');
  static const TOTAL_SUBSCRIBE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_QUANTITY');
  static const TOTAL_VIEW_CONTENT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_QUANTITY');
  static const TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_APP_INSTALL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_VALUE_IN_DOLLAR');
  static const TOTAL_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const PAGE_VISIT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'PAGE_VISIT_COST_PER_ACTION');
  static const SIGNUP_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'SIGNUP_COST_PER_ACTION');
  static const CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'CHECKOUT_COST_PER_ACTION');
  static const CUSTOM_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'CUSTOM_COST_PER_ACTION');
  static const ADD_TO_CART_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'ADD_TO_CART_COST_PER_ACTION');
  static const LEAD_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'LEAD_COST_PER_ACTION');
  static const SEARCH_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'SEARCH_COST_PER_ACTION');
  static const WATCH_VIDEO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WATCH_VIDEO_COST_PER_ACTION');
  static const VIEW_CATEGORY_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'VIEW_CATEGORY_COST_PER_ACTION');
  static const APP_INSTALL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'APP_INSTALL_COST_PER_ACTION');
  static const UNKNOWN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'UNKNOWN_COST_PER_ACTION');
  static const AD_GROUP_CPA_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'AD_GROUP_CPA_IN_MICRO_CURRENCY');
  static const ADD_PAYMENT_INFO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'ADD_PAYMENT_INFO_COST_PER_ACTION');
  static const ADD_TO_WISHLIST_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'ADD_TO_WISHLIST_COST_PER_ACTION');
  static const INITIATE_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INITIATE_CHECKOUT_COST_PER_ACTION');
  static const SUBSCRIBE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'SUBSCRIBE_COST_PER_ACTION');
  static const VIEW_CONTENT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'VIEW_CONTENT_COST_PER_ACTION');
  static const PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR');
  static const SIGNUP_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SIGNUP_COST_PER_ACTION_IN_US_DOLLAR');
  static const CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR');
  static const CUSTOM_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'CUSTOM_COST_PER_ACTION_IN_US_DOLLAR');
  static const ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR');
  static const LEAD_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'LEAD_COST_PER_ACTION_IN_US_DOLLAR');
  static const SEARCH_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SEARCH_COST_PER_ACTION_IN_US_DOLLAR');
  static const WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR');
  static const VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR');
  static const UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR');
  static const ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR');
  static const ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR');
  static const INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR');
  static const SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR');
  static const VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR');
  static const PAGE_VISIT_ROAS = TemplateResponseColumnsEnum._(r'PAGE_VISIT_ROAS');
  static const SIGNUP_ROAS = TemplateResponseColumnsEnum._(r'SIGNUP_ROAS');
  static const CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'CHECKOUT_ROAS');
  static const CUSTOM_ROAS = TemplateResponseColumnsEnum._(r'CUSTOM_ROAS');
  static const ADD_TO_CART_ROAS = TemplateResponseColumnsEnum._(r'ADD_TO_CART_ROAS');
  static const LEAD_ROAS = TemplateResponseColumnsEnum._(r'LEAD_ROAS');
  static const SEARCH_ROAS = TemplateResponseColumnsEnum._(r'SEARCH_ROAS');
  static const WATCH_VIDEO_ROAS = TemplateResponseColumnsEnum._(r'WATCH_VIDEO_ROAS');
  static const VIEW_CATEGORY_ROAS = TemplateResponseColumnsEnum._(r'VIEW_CATEGORY_ROAS');
  static const APP_INSTALL_ROAS = TemplateResponseColumnsEnum._(r'APP_INSTALL_ROAS');
  static const UNKNOWN_ROAS = TemplateResponseColumnsEnum._(r'UNKNOWN_ROAS');
  static const ROAS = TemplateResponseColumnsEnum._(r'ROAS');
  static const CLICK_ROAS = TemplateResponseColumnsEnum._(r'CLICK_ROAS');
  static const ENGAGEMENT_ROAS = TemplateResponseColumnsEnum._(r'ENGAGEMENT_ROAS');
  static const VIEW_ROAS = TemplateResponseColumnsEnum._(r'VIEW_ROAS');
  static const ADD_PAYMENT_INFO_ROAS = TemplateResponseColumnsEnum._(r'ADD_PAYMENT_INFO_ROAS');
  static const ADD_TO_WISHLIST_ROAS = TemplateResponseColumnsEnum._(r'ADD_TO_WISHLIST_ROAS');
  static const INITIATE_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'INITIATE_CHECKOUT_ROAS');
  static const SUBSCRIBE_ROAS = TemplateResponseColumnsEnum._(r'SUBSCRIBE_ROAS');
  static const VIEW_CONTENT_ROAS = TemplateResponseColumnsEnum._(r'VIEW_CONTENT_ROAS');
  static const HOUR = TemplateResponseColumnsEnum._(r'HOUR');
  static const BOARD_ENGAGEMENT = TemplateResponseColumnsEnum._(r'BOARD_ENGAGEMENT');
  static const BOARD_INSERTION = TemplateResponseColumnsEnum._(r'BOARD_INSERTION');
  static const BOARD_IMPRESSION = TemplateResponseColumnsEnum._(r'BOARD_IMPRESSION');
  static const BOARD_FOLLOW = TemplateResponseColumnsEnum._(r'BOARD_FOLLOW');
  static const BOARD_SEND = TemplateResponseColumnsEnum._(r'BOARD_SEND');
  static const BOARD_HIDE = TemplateResponseColumnsEnum._(r'BOARD_HIDE');
  static const PRODUCT_GROUP_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CAMPAIGN_ID');
  static const PRODUCT_GROUP_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CAMPAIGN_NAME');
  static const PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE');
  static const PRODUCT_GROUP_CAMPAIGN_STATUS = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CAMPAIGN_STATUS');
  static const PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS');
  static const PRODUCT_GROUP_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_AD_GROUP_ID');
  static const PRODUCT_GROUP_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_AD_GROUP_NAME');
  static const PRODUCT_GROUP_AD_GROUP_STATUS = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_AD_GROUP_STATUS');
  static const PRODUCT_GROUP_AD_IMAGE_TAG = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_AD_IMAGE_TAG');
  static const PRODUCT_GROUP_AD_VIDEO_TAG = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_AD_VIDEO_TAG');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_ID = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_ID');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_STATUS = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_STATUS');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL');
  static const PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG = TemplateResponseColumnsEnum._(r'PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG');
  static const vIDEO3SECVIEWS1 = TemplateResponseColumnsEnum._(r'VIDEO_3SEC_VIEWS_1');
  static const vIDEO15SECUNIQUEVIEWS1 = TemplateResponseColumnsEnum._(r'VIDEO_15SEC_UNIQUE_VIEWS_1');
  static const vIDEOP0COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P0_COMPLETE_1');
  static const vIDEOP25COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P25_COMPLETE_1');
  static const vIDEOP50COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P50_COMPLETE_1');
  static const vIDEOP75COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P75_COMPLETE_1');
  static const vIDEOP95COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P95_COMPLETE_1');
  static const vIDEOP97COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P97_COMPLETE_1');
  static const vIDEOP100COMPLETE1 = TemplateResponseColumnsEnum._(r'VIDEO_P100_COMPLETE_1');
  static const vIDEOP0COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P0_COMBINED_1');
  static const vIDEOP25COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P25_COMBINED_1');
  static const vIDEOP50COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P50_COMBINED_1');
  static const vIDEOP75COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P75_COMBINED_1');
  static const vIDEOP95COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P95_COMBINED_1');
  static const vIDEOP97COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P97_COMBINED_1');
  static const vIDEOP100COMBINED1 = TemplateResponseColumnsEnum._(r'VIDEO_P100_COMBINED_1');
  static const VIDEO_STARTS_PAID = TemplateResponseColumnsEnum._(r'VIDEO_STARTS_PAID');
  static const VIDEO_STARTS_EARNED = TemplateResponseColumnsEnum._(r'VIDEO_STARTS_EARNED');
  static const TOTAL_VIDEO_STARTS = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_STARTS');
  static const vIDEOAVGWATCHTIME1 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_1');
  static const vIDEOMRCVIEWS1 = TemplateResponseColumnsEnum._(r'VIDEO_MRC_VIEWS_1');
  static const vIDEOVIEWRATE1 = TemplateResponseColumnsEnum._(r'VIDEO_VIEW_RATE_1');
  static const vIDEO3SECVIEWS2 = TemplateResponseColumnsEnum._(r'VIDEO_3SEC_VIEWS_2');
  static const vIDEO15SECUNIQUEVIEWS2 = TemplateResponseColumnsEnum._(r'VIDEO_15SEC_UNIQUE_VIEWS_2');
  static const vIDEOP0COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P0_COMPLETE_2');
  static const vIDEOP25COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P25_COMPLETE_2');
  static const vIDEOP50COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P50_COMPLETE_2');
  static const vIDEOP75COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P75_COMPLETE_2');
  static const vIDEOP95COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P95_COMPLETE_2');
  static const vIDEOP97COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P97_COMPLETE_2');
  static const vIDEOP100COMPLETE2 = TemplateResponseColumnsEnum._(r'VIDEO_P100_COMPLETE_2');
  static const vIDEOP0COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P0_COMBINED_2');
  static const vIDEOP25COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P25_COMBINED_2');
  static const vIDEOP50COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P50_COMBINED_2');
  static const vIDEOP75COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P75_COMBINED_2');
  static const vIDEOP95COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P95_COMBINED_2');
  static const vIDEOP97COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P97_COMBINED_2');
  static const vIDEOP100COMBINED2 = TemplateResponseColumnsEnum._(r'VIDEO_P100_COMBINED_2');
  static const vIDEOAVGWATCHTIME2 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_2');
  static const vIDEOMRCVIEWS2 = TemplateResponseColumnsEnum._(r'VIDEO_MRC_VIEWS_2');
  static const vIDEOVIEWRATE2 = TemplateResponseColumnsEnum._(r'VIDEO_VIEW_RATE_2');
  static const PAID_VIDEO_VIEW = TemplateResponseColumnsEnum._(r'PAID_VIDEO_VIEW');
  static const PAID_VIDEO_IMPRESSION = TemplateResponseColumnsEnum._(r'PAID_VIDEO_IMPRESSION');
  static const PAID_VIDEO_VIEWABLE_RATE = TemplateResponseColumnsEnum._(r'PAID_VIDEO_VIEWABLE_RATE');
  static const VIDEO_LENGTH = TemplateResponseColumnsEnum._(r'VIDEO_LENGTH');
  static const VIDEO_SPEND_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'VIDEO_SPEND_IN_MICRO_DOLLAR');
  static const VIDEO_SPEND_IN_DOLLAR = TemplateResponseColumnsEnum._(r'VIDEO_SPEND_IN_DOLLAR');
  static const CPV_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPV_IN_MICRO_DOLLAR');
  static const CPV_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPV_IN_DOLLAR');
  static const cP3SVINMICRODOLLAR = TemplateResponseColumnsEnum._(r'CP3SV_IN_MICRO_DOLLAR');
  static const cP3SVINDOLLAR = TemplateResponseColumnsEnum._(r'CP3SV_IN_DOLLAR');
  static const ECPV_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPV_IN_MICRO_DOLLAR');
  static const ECPV_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPV_IN_DOLLAR');
  static const eCP3SVINMICRODOLLAR = TemplateResponseColumnsEnum._(r'ECP3SV_IN_MICRO_DOLLAR');
  static const eCP3SVINDOLLAR = TemplateResponseColumnsEnum._(r'ECP3SV_IN_DOLLAR');
  static const CPCV_IN_DOLLAR = TemplateResponseColumnsEnum._(r'CPCV_IN_DOLLAR');
  static const CPCV_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'CPCV_IN_MICRO_DOLLAR');
  static const ECPCV_IN_DOLLAR = TemplateResponseColumnsEnum._(r'ECPCV_IN_DOLLAR');
  static const ECPCV_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'ECPCV_IN_MICRO_DOLLAR');
  static const cPCVP95INDOLLAR = TemplateResponseColumnsEnum._(r'CPCV_P95_IN_DOLLAR');
  static const cPCVP95INMICRODOLLAR = TemplateResponseColumnsEnum._(r'CPCV_P95_IN_MICRO_DOLLAR');
  static const eCPCVP95INDOLLAR = TemplateResponseColumnsEnum._(r'ECPCV_P95_IN_DOLLAR');
  static const eCPCVP95INMICRODOLLAR = TemplateResponseColumnsEnum._(r'ECPCV_P95_IN_MICRO_DOLLAR');
  static const tOTALVIDEO3SECVIEWS = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_3SEC_VIEWS');
  static const tOTALVIDEO15SECUNIQUEVIEWS = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS');
  static const tOTALVIDEOP0COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P0_COMPLETE');
  static const tOTALVIDEOP25COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P25_COMPLETE');
  static const tOTALVIDEOP50COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P50_COMPLETE');
  static const tOTALVIDEOP75COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P75_COMPLETE');
  static const tOTALVIDEOP95COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P95_COMPLETE');
  static const tOTALVIDEOP97COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P97_COMPLETE');
  static const tOTALVIDEOP100COMPLETE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P100_COMPLETE');
  static const tOTALVIDEOP0COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P0_COMBINED');
  static const tOTALVIDEOP25COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P25_COMBINED');
  static const tOTALVIDEOP50COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P50_COMBINED');
  static const tOTALVIDEOP75COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P75_COMBINED');
  static const tOTALVIDEOP95COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P95_COMBINED');
  static const tOTALVIDEOP97COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P97_COMBINED');
  static const tOTALVIDEOP100COMBINED = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_P100_COMBINED');
  static const TOTAL_VIDEO_AVG_WATCHTIME = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_AVG_WATCHTIME');
  static const TOTAL_VIDEO_MRC_VIEWS = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_MRC_VIEWS');
  static const TOTAL_VIDEO_VIEW_RATE = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_VIEW_RATE');
  static const vIDEOV50WATCHTIME1 = TemplateResponseColumnsEnum._(r'VIDEO_V50_WATCHTIME_1');
  static const vIDEOV50WATCHTIME2 = TemplateResponseColumnsEnum._(r'VIDEO_V50_WATCHTIME_2');
  static const tOTALVIDEOV50WATCHTIME = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_V50_WATCHTIME');
  static const vIDEOSUMV50WATCHTIMEINMILLISECOND1 = TemplateResponseColumnsEnum._(r'VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_1');
  static const vIDEOSUMV50WATCHTIMEINMILLISECOND2 = TemplateResponseColumnsEnum._(r'VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_2');
  static const tOTALVIDEOSUMV50WATCHTIMEINMILLISECOND = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND');
  static const vIDEOSUMV50WATCHTIMEINSECOND1 = TemplateResponseColumnsEnum._(r'VIDEO_SUM_V50_WATCHTIME_IN_SECOND_1');
  static const vIDEOSUMV50WATCHTIMEINSECOND2 = TemplateResponseColumnsEnum._(r'VIDEO_SUM_V50_WATCHTIME_IN_SECOND_2');
  static const tOTALVIDEOSUMV50WATCHTIMEINSECOND = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_SECOND');
  static const vIDEOAVGWATCHTIMEINMILLISECOND1 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_MILLISECOND_1');
  static const vIDEOAVGWATCHTIMEINMILLISECOND2 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_MILLISECOND_2');
  static const TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND');
  static const vIDEOAVGWATCHTIMEINSECOND1 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_SECOND_1');
  static const vIDEOAVGWATCHTIMEINSECOND2 = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_SECOND_2');
  static const TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND');
  static const VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID');
  static const VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED = TemplateResponseColumnsEnum._(r'VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED');
  static const TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS = TemplateResponseColumnsEnum._(r'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS');
  static const DELIVERY_STATUS_NO_FANOUT = TemplateResponseColumnsEnum._(r'DELIVERY_STATUS_NO_FANOUT');
  static const DELIVERY_STATUS_WITH_FANOUT = TemplateResponseColumnsEnum._(r'DELIVERY_STATUS_WITH_FANOUT');
  static const KEYWORD_COMPETITION_BAND = TemplateResponseColumnsEnum._(r'KEYWORD_COMPETITION_BAND');
  static const KEYWORD_QUERY_VOLUME = TemplateResponseColumnsEnum._(r'KEYWORD_QUERY_VOLUME');
  static const KEYWORD_VALUE = TemplateResponseColumnsEnum._(r'KEYWORD_VALUE');
  static const KEYWORD_MATCH_TYPE = TemplateResponseColumnsEnum._(r'KEYWORD_MATCH_TYPE');
  static const KEYWORD_BID_IN_MICRO_CURRENCY = TemplateResponseColumnsEnum._(r'KEYWORD_BID_IN_MICRO_CURRENCY');
  static const KEYWORD_USER_QUERY = TemplateResponseColumnsEnum._(r'KEYWORD_USER_QUERY');
  static const KEYWORD_SQR_KEYWORD_VALUE = TemplateResponseColumnsEnum._(r'KEYWORD_SQR_KEYWORD_VALUE');
  static const KEYWORD_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'KEYWORD_AD_GROUP_ID');
  static const KEYWORD_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'KEYWORD_AD_GROUP_NAME');
  static const KEYWORD_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'KEYWORD_CAMPAIGN_ID');
  static const KEYWORD_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'KEYWORD_CAMPAIGN_NAME');
  static const KEYWORD_SEARCH_TERM_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'KEYWORD_SEARCH_TERM_AD_GROUP_ID');
  static const KEYWORD_SEARCH_TERM_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'KEYWORD_SEARCH_TERM_AD_GROUP_NAME');
  static const KEYWORD_SEARCH_TERM_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'KEYWORD_SEARCH_TERM_CAMPAIGN_ID');
  static const KEYWORD_SEARCH_TERM_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'KEYWORD_SEARCH_TERM_CAMPAIGN_NAME');
  static const NEGATIVE_KEYWORD_AD_GROUP_ID = TemplateResponseColumnsEnum._(r'NEGATIVE_KEYWORD_AD_GROUP_ID');
  static const NEGATIVE_KEYWORD_AD_GROUP_NAME = TemplateResponseColumnsEnum._(r'NEGATIVE_KEYWORD_AD_GROUP_NAME');
  static const NEGATIVE_KEYWORD_CAMPAIGN_ID = TemplateResponseColumnsEnum._(r'NEGATIVE_KEYWORD_CAMPAIGN_ID');
  static const NEGATIVE_KEYWORD_CAMPAIGN_NAME = TemplateResponseColumnsEnum._(r'NEGATIVE_KEYWORD_CAMPAIGN_NAME');
  static const oNETAPV2WEBSITEVIEW1 = TemplateResponseColumnsEnum._(r'ONE_TAP_V2_WEBSITE_VIEW_1');
  static const oNETAPV2WEBSITEVIEW2 = TemplateResponseColumnsEnum._(r'ONE_TAP_V2_WEBSITE_VIEW_2');
  static const tOTALONETAPV2WEBSITEVIEW = TemplateResponseColumnsEnum._(r'TOTAL_ONE_TAP_V2_WEBSITE_VIEW');
  static const oNETAPV2WEBSITEVIEWUSER1 = TemplateResponseColumnsEnum._(r'ONE_TAP_V2_WEBSITE_VIEW_USER_1');
  static const oNETAPV2WEBSITEVIEWUSER2 = TemplateResponseColumnsEnum._(r'ONE_TAP_V2_WEBSITE_VIEW_USER_2');
  static const TOTAL_LANDING_PAGE_VIEWS = TemplateResponseColumnsEnum._(r'TOTAL_LANDING_PAGE_VIEWS');
  static const lANDINGPAGEVIEWS1 = TemplateResponseColumnsEnum._(r'LANDING_PAGE_VIEWS_1');
  static const lANDINGPAGEVIEWS2 = TemplateResponseColumnsEnum._(r'LANDING_PAGE_VIEWS_2');
  static const COST_PER_LANDING_PAGE_VIEW = TemplateResponseColumnsEnum._(r'COST_PER_LANDING_PAGE_VIEW');
  static const LANDING_PAGE_VIEW_RATE = TemplateResponseColumnsEnum._(r'LANDING_PAGE_VIEW_RATE');
  static const TOTAL_DESTINATION_VIEWS = TemplateResponseColumnsEnum._(r'TOTAL_DESTINATION_VIEWS');
  static const dESTINATIONVIEWS1 = TemplateResponseColumnsEnum._(r'DESTINATION_VIEWS_1');
  static const dESTINATIONVIEWS2 = TemplateResponseColumnsEnum._(r'DESTINATION_VIEWS_2');
  static const COST_PER_DESTINATION_VIEW_IN_DOLLAR = TemplateResponseColumnsEnum._(r'COST_PER_DESTINATION_VIEW_IN_DOLLAR');
  static const COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR');
  static const DESTINATION_VIEW_RATE = TemplateResponseColumnsEnum._(r'DESTINATION_VIEW_RATE');
  static const CAROUSEL_SLOT_INDEX = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_INDEX');
  static const CAROUSEL_ID = TemplateResponseColumnsEnum._(r'CAROUSEL_ID');
  static const CAROUSEL_SLOT_PROMOTION_ID = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_PROMOTION_ID');
  static const cAROUSELSLOTIMPRESSION1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_IMPRESSION_1');
  static const cAROUSELSLOTIMPRESSION2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_IMPRESSION_2');
  static const TOTAL_CAROUSEL_SLOT_IMPRESSION = TemplateResponseColumnsEnum._(r'TOTAL_CAROUSEL_SLOT_IMPRESSION');
  static const cAROUSELSLOTIMPRESSIONUSER1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_IMPRESSION_USER_1');
  static const cAROUSELSLOTIMPRESSIONUSER2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_IMPRESSION_USER_2');
  static const cAROUSELSLOTCLICKTHROUGH1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_CLICKTHROUGH_1');
  static const cAROUSELSLOTCLICKTHROUGH2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_CLICKTHROUGH_2');
  static const TOTAL_CAROUSEL_SLOT_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'TOTAL_CAROUSEL_SLOT_CLICKTHROUGH');
  static const cAROUSELSLOTCLICKTHROUGHUSER1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_CLICKTHROUGH_USER_1');
  static const cAROUSELSLOTCLICKTHROUGHUSER2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_CLICKTHROUGH_USER_2');
  static const cAROUSELSLOTSIDESWIPE1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_SIDESWIPE_1');
  static const cAROUSELSLOTSIDESWIPE2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_SIDESWIPE_2');
  static const TOTAL_CAROUSEL_SLOT_SIDESWIPE = TemplateResponseColumnsEnum._(r'TOTAL_CAROUSEL_SLOT_SIDESWIPE');
  static const cAROUSELSLOTSIDESWIPEUSER1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_SIDESWIPE_USER_1');
  static const cAROUSELSLOTSIDESWIPEUSER2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_SIDESWIPE_USER_2');
  static const cAROUSELSLOTVIEWWEBSITE1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_VIEW_WEBSITE_1');
  static const cAROUSELSLOTVIEWWEBSITE2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_VIEW_WEBSITE_2');
  static const TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE = TemplateResponseColumnsEnum._(r'TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE');
  static const cAROUSELSLOTVIEWWEBSITEUSER1 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_VIEW_WEBSITE_USER_1');
  static const cAROUSELSLOTVIEWWEBSITEUSER2 = TemplateResponseColumnsEnum._(r'CAROUSEL_SLOT_VIEW_WEBSITE_USER_2');
  static const cOLLECTIONPINITEMIMPRESSION1 = TemplateResponseColumnsEnum._(r'COLLECTION_PIN_ITEM_IMPRESSION_1');
  static const cOLLECTIONPINITEMIMPRESSION2 = TemplateResponseColumnsEnum._(r'COLLECTION_PIN_ITEM_IMPRESSION_2');
  static const TOTAL_COLLECTION_PIN_ITEM_IMPRESSION = TemplateResponseColumnsEnum._(r'TOTAL_COLLECTION_PIN_ITEM_IMPRESSION');
  static const cOLLECTIONPINITEMCLICKTHROUGH1 = TemplateResponseColumnsEnum._(r'COLLECTION_PIN_ITEM_CLICKTHROUGH_1');
  static const cOLLECTIONPINITEMCLICKTHROUGH2 = TemplateResponseColumnsEnum._(r'COLLECTION_PIN_ITEM_CLICKTHROUGH_2');
  static const TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH');
  static const HOLDOUT_EXPERIMENT = TemplateResponseColumnsEnum._(r'HOLDOUT_EXPERIMENT');
  static const AD_GROUP_HOLDOUT_EXPERIMENT = TemplateResponseColumnsEnum._(r'AD_GROUP_HOLDOUT_EXPERIMENT');
  static const PIN_PROMOTION_HOLDOUT_EXPERIMENT = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_HOLDOUT_EXPERIMENT');
  static const PRODUCT_GROUP_HOLDOUT_EXPERIMENT = TemplateResponseColumnsEnum._(r'PRODUCT_GROUP_HOLDOUT_EXPERIMENT');
  static const MULTI_OBJECTIVE_RESULT = TemplateResponseColumnsEnum._(r'MULTI_OBJECTIVE_RESULT');
  static const MULTI_OBJECTIVE_COST = TemplateResponseColumnsEnum._(r'MULTI_OBJECTIVE_COST');
  static const MULTI_OBJECTIVE_RESULT_DESCRIPTION = TemplateResponseColumnsEnum._(r'MULTI_OBJECTIVE_RESULT_DESCRIPTION');
  static const MULTI_OBJECTIVE_COST_DESCRIPTION = TemplateResponseColumnsEnum._(r'MULTI_OBJECTIVE_COST_DESCRIPTION');
  static const DATE_RANGE = TemplateResponseColumnsEnum._(r'DATE_RANGE');
  static const DATE_RANGE_START = TemplateResponseColumnsEnum._(r'DATE_RANGE_START');
  static const DATE_RANGE_END = TemplateResponseColumnsEnum._(r'DATE_RANGE_END');
  static const REPORT_DATE_START = TemplateResponseColumnsEnum._(r'REPORT_DATE_START');
  static const REPORT_DATE_END = TemplateResponseColumnsEnum._(r'REPORT_DATE_END');
  static const PINNER_LIST_NAME = TemplateResponseColumnsEnum._(r'PINNER_LIST_NAME');
  static const PINNER_LIST_TYPE = TemplateResponseColumnsEnum._(r'PINNER_LIST_TYPE');
  static const ORDER_VALUE = TemplateResponseColumnsEnum._(r'ORDER_VALUE');
  static const ORDER_QUANTITY = TemplateResponseColumnsEnum._(r'ORDER_QUANTITY');
  static const ADVERTISER_NAME = TemplateResponseColumnsEnum._(r'ADVERTISER_NAME');
  static const ADVERTISER_CURRENCY = TemplateResponseColumnsEnum._(r'ADVERTISER_CURRENCY');
  static const TOTAL_REPIN_RATE = TemplateResponseColumnsEnum._(r'TOTAL_REPIN_RATE');
  static const SPEND_YESTERDAY_IN_DOLLAR = TemplateResponseColumnsEnum._(r'SPEND_YESTERDAY_IN_DOLLAR');
  static const PIN_PROMOTION_REJECTION_LABELS = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_REJECTION_LABELS');
  static const PIN_PROMOTION_DESTINATION_URL = TemplateResponseColumnsEnum._(r'PIN_PROMOTION_DESTINATION_URL');
  static const VIDEO_COMPLETION_RATE = TemplateResponseColumnsEnum._(r'VIDEO_COMPLETION_RATE');
  static const CAMPAIGN_BOOKING_REFERENCE = TemplateResponseColumnsEnum._(r'CAMPAIGN_BOOKING_REFERENCE');
  static const WEB_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_CHECKOUT_COST_PER_ACTION');
  static const WEB_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'WEB_CHECKOUT_ROAS');
  static const TOTAL_WEB_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT');
  static const TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CHECKOUT');
  static const TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CHECKOUT');
  static const TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CHECKOUT');
  static const TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR');
  static const INAPP_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_CHECKOUT_COST_PER_ACTION');
  static const INAPP_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'INAPP_CHECKOUT_ROAS');
  static const TOTAL_INAPP_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT');
  static const TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CHECKOUT');
  static const TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT');
  static const TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CHECKOUT');
  static const TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR');
  static const OFFLINE_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_CHECKOUT_COST_PER_ACTION');
  static const OFFLINE_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_CHECKOUT_ROAS');
  static const TOTAL_OFFLINE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT');
  static const TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CHECKOUT');
  static const TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT');
  static const TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CHECKOUT');
  static const TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR');
  static const PINTEREST_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'PINTEREST_CHECKOUT_COST_PER_ACTION');
  static const PINTEREST_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'PINTEREST_CHECKOUT_ROAS');
  static const TOTAL_PINTEREST_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_PINTEREST_CHECKOUT');
  static const TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR');
  static const WEB_ADD_TO_CART_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_ADD_TO_CART_COST_PER_ACTION');
  static const WEB_ADD_TO_CART_ROAS = TemplateResponseColumnsEnum._(r'WEB_ADD_TO_CART_ROAS');
  static const TOTAL_WEB_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART');
  static const TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_CART');
  static const TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_TO_CART');
  static const TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_CART');
  static const TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const INAPP_ADD_TO_CART_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_ADD_TO_CART_COST_PER_ACTION');
  static const INAPP_ADD_TO_CART_ROAS = TemplateResponseColumnsEnum._(r'INAPP_ADD_TO_CART_ROAS');
  static const TOTAL_INAPP_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART');
  static const TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_CART');
  static const TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_TO_CART = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_CART');
  static const TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR');
  static const WEB_PAGE_VISIT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_PAGE_VISIT_COST_PER_ACTION');
  static const WEB_PAGE_VISIT_ROAS = TemplateResponseColumnsEnum._(r'WEB_PAGE_VISIT_ROAS');
  static const TOTAL_WEB_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT');
  static const TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_PAGE_VISIT');
  static const TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT');
  static const TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_PAGE_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_PAGE_VISIT');
  static const TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR');
  static const WEB_SIGNUP_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_SIGNUP_COST_PER_ACTION');
  static const WEB_SIGNUP_ROAS = TemplateResponseColumnsEnum._(r'WEB_SIGNUP_ROAS');
  static const TOTAL_WEB_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP');
  static const TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SIGNUP');
  static const TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SIGNUP');
  static const TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SIGNUP');
  static const TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR');
  static const INAPP_SIGNUP_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SIGNUP_COST_PER_ACTION');
  static const INAPP_SIGNUP_ROAS = TemplateResponseColumnsEnum._(r'INAPP_SIGNUP_ROAS');
  static const TOTAL_INAPP_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP');
  static const TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SIGNUP');
  static const TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SIGNUP');
  static const TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SIGNUP');
  static const TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR');
  static const OFFLINE_SIGNUP_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_SIGNUP_COST_PER_ACTION');
  static const OFFLINE_SIGNUP_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_SIGNUP_ROAS');
  static const TOTAL_OFFLINE_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP');
  static const TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SIGNUP');
  static const TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP');
  static const TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SIGNUP = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SIGNUP');
  static const TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR');
  static const WEB_WATCH_VIDEO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_WATCH_VIDEO_COST_PER_ACTION');
  static const WEB_WATCH_VIDEO_ROAS = TemplateResponseColumnsEnum._(r'WEB_WATCH_VIDEO_ROAS');
  static const TOTAL_WEB_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO');
  static const TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_WATCH_VIDEO');
  static const TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO');
  static const TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_WATCH_VIDEO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_WATCH_VIDEO');
  static const TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR');
  static const WEB_LEAD_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_LEAD_COST_PER_ACTION');
  static const WEB_LEAD_ROAS = TemplateResponseColumnsEnum._(r'WEB_LEAD_ROAS');
  static const TOTAL_WEB_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD');
  static const TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_LEAD');
  static const TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_LEAD');
  static const TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_LEAD');
  static const TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR');
  static const OFFLINE_LEAD_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_LEAD_COST_PER_ACTION');
  static const OFFLINE_LEAD_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_LEAD_ROAS');
  static const TOTAL_OFFLINE_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD');
  static const TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_LEAD');
  static const TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_LEAD');
  static const TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_LEAD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_LEAD');
  static const TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR');
  static const WEB_SEARCH_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_SEARCH_COST_PER_ACTION');
  static const WEB_SEARCH_ROAS = TemplateResponseColumnsEnum._(r'WEB_SEARCH_ROAS');
  static const TOTAL_WEB_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH');
  static const TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SEARCH');
  static const TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SEARCH');
  static const TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SEARCH');
  static const TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR');
  static const INAPP_SEARCH_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SEARCH_COST_PER_ACTION');
  static const INAPP_SEARCH_ROAS = TemplateResponseColumnsEnum._(r'INAPP_SEARCH_ROAS');
  static const TOTAL_INAPP_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH');
  static const TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SEARCH');
  static const TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SEARCH');
  static const TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_SEARCH = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SEARCH');
  static const TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR');
  static const WEB_VIEW_CATEGORY_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_VIEW_CATEGORY_COST_PER_ACTION');
  static const WEB_VIEW_CATEGORY_ROAS = TemplateResponseColumnsEnum._(r'WEB_VIEW_CATEGORY_ROAS');
  static const TOTAL_WEB_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY');
  static const TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CATEGORY');
  static const TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_VIEW_CATEGORY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CATEGORY');
  static const TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR');
  static const WEB_CUSTOM_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_CUSTOM_COST_PER_ACTION');
  static const WEB_CUSTOM_ROAS = TemplateResponseColumnsEnum._(r'WEB_CUSTOM_ROAS');
  static const TOTAL_WEB_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM');
  static const TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOM');
  static const TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOM');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOM');
  static const TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR');
  static const OFFLINE_CUSTOM_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_CUSTOM_COST_PER_ACTION');
  static const OFFLINE_CUSTOM_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_CUSTOM_ROAS');
  static const TOTAL_OFFLINE_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM');
  static const TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOM');
  static const TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CUSTOM = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOM');
  static const TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR');
  static const WEB_UNKNOWN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_UNKNOWN_COST_PER_ACTION');
  static const WEB_UNKNOWN_ROAS = TemplateResponseColumnsEnum._(r'WEB_UNKNOWN_ROAS');
  static const TOTAL_WEB_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN');
  static const TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_UNKNOWN');
  static const TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_UNKNOWN');
  static const TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_UNKNOWN');
  static const TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR');
  static const INAPP_UNKNOWN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_UNKNOWN_COST_PER_ACTION');
  static const INAPP_UNKNOWN_ROAS = TemplateResponseColumnsEnum._(r'INAPP_UNKNOWN_ROAS');
  static const TOTAL_INAPP_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN');
  static const TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_UNKNOWN');
  static const TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN');
  static const TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_UNKNOWN');
  static const TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR');
  static const OFFLINE_UNKNOWN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_UNKNOWN_COST_PER_ACTION');
  static const OFFLINE_UNKNOWN_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_UNKNOWN_ROAS');
  static const TOTAL_OFFLINE_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN');
  static const TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_UNKNOWN');
  static const TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN');
  static const TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_UNKNOWN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_UNKNOWN');
  static const TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR');
  static const INAPP_APP_INSTALL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_APP_INSTALL_COST_PER_ACTION');
  static const INAPP_APP_INSTALL_ROAS = TemplateResponseColumnsEnum._(r'INAPP_APP_INSTALL_ROAS');
  static const TOTAL_INAPP_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_INSTALL');
  static const TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_INSTALL');
  static const TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL');
  static const TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_APP_INSTALL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_INSTALL');
  static const TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR');
  static const TOTAL_APP_INSTALL_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_APP_INSTALL_CONVERSION_RATE');
  static const TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE');
  static const WEB_ADD_PAYMENT_INFO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_ADD_PAYMENT_INFO_COST_PER_ACTION');
  static const WEB_ADD_PAYMENT_INFO_ROAS = TemplateResponseColumnsEnum._(r'WEB_ADD_PAYMENT_INFO_ROAS');
  static const TOTAL_WEB_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO');
  static const TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO');
  static const TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO');
  static const TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION');
  static const INAPP_ADD_PAYMENT_INFO_ROAS = TemplateResponseColumnsEnum._(r'INAPP_ADD_PAYMENT_INFO_ROAS');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO');
  static const TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO');
  static const TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION');
  static const OFFLINE_ADD_PAYMENT_INFO_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_ADD_PAYMENT_INFO_ROAS');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO');
  static const TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO');
  static const TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR');
  static const WEB_ADD_TO_WISHLIST_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_ADD_TO_WISHLIST_COST_PER_ACTION');
  static const WEB_ADD_TO_WISHLIST_ROAS = TemplateResponseColumnsEnum._(r'WEB_ADD_TO_WISHLIST_ROAS');
  static const TOTAL_WEB_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST');
  static const TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST');
  static const TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST');
  static const TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST');
  static const TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const INAPP_ADD_TO_WISHLIST_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_ADD_TO_WISHLIST_COST_PER_ACTION');
  static const INAPP_ADD_TO_WISHLIST_ROAS = TemplateResponseColumnsEnum._(r'INAPP_ADD_TO_WISHLIST_ROAS');
  static const TOTAL_INAPP_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST');
  static const TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST');
  static const TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION');
  static const OFFLINE_ADD_TO_WISHLIST_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_ADD_TO_WISHLIST_ROAS');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST');
  static const TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST');
  static const TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR');
  static const WEB_INITIATE_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_INITIATE_CHECKOUT_COST_PER_ACTION');
  static const WEB_INITIATE_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'WEB_INITIATE_CHECKOUT_ROAS');
  static const TOTAL_WEB_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT');
  static const TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT');
  static const TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT');
  static const TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT');
  static const TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const INAPP_INITIATE_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_INITIATE_CHECKOUT_COST_PER_ACTION');
  static const INAPP_INITIATE_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'INAPP_INITIATE_CHECKOUT_ROAS');
  static const TOTAL_INAPP_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT');
  static const TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT');
  static const TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT');
  static const TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION');
  static const OFFLINE_INITIATE_CHECKOUT_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_INITIATE_CHECKOUT_ROAS');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT');
  static const TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT');
  static const TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT');
  static const TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR');
  static const WEB_SUBSCRIBE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_SUBSCRIBE_COST_PER_ACTION');
  static const WEB_SUBSCRIBE_ROAS = TemplateResponseColumnsEnum._(r'WEB_SUBSCRIBE_ROAS');
  static const TOTAL_WEB_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE');
  static const TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBSCRIBE');
  static const TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE');
  static const TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBSCRIBE');
  static const TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const INAPP_SUBSCRIBE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SUBSCRIBE_COST_PER_ACTION');
  static const INAPP_SUBSCRIBE_ROAS = TemplateResponseColumnsEnum._(r'INAPP_SUBSCRIBE_ROAS');
  static const TOTAL_INAPP_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE');
  static const TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBSCRIBE');
  static const TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE');
  static const TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBSCRIBE');
  static const TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const OFFLINE_SUBSCRIBE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_SUBSCRIBE_COST_PER_ACTION');
  static const OFFLINE_SUBSCRIBE_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_SUBSCRIBE_ROAS');
  static const TOTAL_OFFLINE_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE');
  static const TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBSCRIBE');
  static const TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SUBSCRIBE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBSCRIBE');
  static const TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR');
  static const WEB_VIEW_CONTENT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_VIEW_CONTENT_COST_PER_ACTION');
  static const WEB_VIEW_CONTENT_ROAS = TemplateResponseColumnsEnum._(r'WEB_VIEW_CONTENT_ROAS');
  static const TOTAL_WEB_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT');
  static const TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CONTENT');
  static const TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CONTENT');
  static const TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const INAPP_VIEW_CONTENT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_VIEW_CONTENT_COST_PER_ACTION');
  static const INAPP_VIEW_CONTENT_ROAS = TemplateResponseColumnsEnum._(r'INAPP_VIEW_CONTENT_ROAS');
  static const TOTAL_INAPP_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT');
  static const TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_VIEW_CONTENT');
  static const TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT');
  static const TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_VIEW_CONTENT');
  static const TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const OFFLINE_VIEW_CONTENT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_VIEW_CONTENT_COST_PER_ACTION');
  static const OFFLINE_VIEW_CONTENT_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_VIEW_CONTENT_ROAS');
  static const TOTAL_OFFLINE_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT');
  static const TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT');
  static const TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT');
  static const TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_VIEW_CONTENT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT');
  static const TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR');
  static const iDEAPINPAGEFORWARD1 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PAGE_FORWARD_1');
  static const iDEAPINPAGEFORWARD2 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PAGE_FORWARD_2');
  static const iDEAPINPAGEBACKWARD1 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PAGE_BACKWARD_1');
  static const iDEAPINPAGEBACKWARD2 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PAGE_BACKWARD_2');
  static const TOTAL_IDEA_PIN_PAGE_FORWARD = TemplateResponseColumnsEnum._(r'TOTAL_IDEA_PIN_PAGE_FORWARD');
  static const TOTAL_IDEA_PIN_PAGE_BACKWARD = TemplateResponseColumnsEnum._(r'TOTAL_IDEA_PIN_PAGE_BACKWARD');
  static const iDEAPINPRODUCTTAGVISIT1 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PRODUCT_TAG_VISIT_1');
  static const iDEAPINPRODUCTTAGVISIT2 = TemplateResponseColumnsEnum._(r'IDEA_PIN_PRODUCT_TAG_VISIT_2');
  static const TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT = TemplateResponseColumnsEnum._(r'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT');
  static const CPM_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'CPM_IN_US_DOLLAR');
  static const ECPC_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'ECPC_IN_US_DOLLAR');
  static const LEADS = TemplateResponseColumnsEnum._(r'LEADS');
  static const COST_PER_LEAD = TemplateResponseColumnsEnum._(r'COST_PER_LEAD');
  static const QUIZ_STARTED = TemplateResponseColumnsEnum._(r'QUIZ_STARTED');
  static const QUIZ_COMPLETED = TemplateResponseColumnsEnum._(r'QUIZ_COMPLETED');
  static const QUIZ_PIN_RESULT_OPEN = TemplateResponseColumnsEnum._(r'QUIZ_PIN_RESULT_OPEN');
  static const QUIZ_COMPLETION_RATE = TemplateResponseColumnsEnum._(r'QUIZ_COMPLETION_RATE');
  static const SHOWCASE_PIN_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'SHOWCASE_PIN_CLICKTHROUGH');
  static const SHOWCASE_SUBPAGE_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_CLICKTHROUGH');
  static const SHOWCASE_SUBPIN_CLICKTHROUGH = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPIN_CLICKTHROUGH');
  static const SHOWCASE_SUBPAGE_IMPRESSION = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_IMPRESSION');
  static const SHOWCASE_SUBPIN_IMPRESSION = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPIN_IMPRESSION');
  static const SHOWCASE_SUBPAGE_SWIPE_LEFT = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_SWIPE_LEFT');
  static const SHOWCASE_SUBPAGE_SWIPE_RIGHT = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_SWIPE_RIGHT');
  static const SHOWCASE_SUBPIN_SWIPE_LEFT = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPIN_SWIPE_LEFT');
  static const SHOWCASE_SUBPIN_SWIPE_RIGHT = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPIN_SWIPE_RIGHT');
  static const SHOWCASE_SUBPAGE_REPIN = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_REPIN');
  static const SHOWCASE_SUBPIN_REPIN = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPIN_REPIN');
  static const SHOWCASE_SUBPAGE_CLOSEUP = TemplateResponseColumnsEnum._(r'SHOWCASE_SUBPAGE_CLOSEUP');
  static const SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD = TemplateResponseColumnsEnum._(r'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD');
  static const SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD = TemplateResponseColumnsEnum._(r'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD');
  static const SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL = TemplateResponseColumnsEnum._(r'_SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL');
  static const SHOWCASE_CARD_LANDING = TemplateResponseColumnsEnum._(r'SHOWCASE_CARD_LANDING');
  static const SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION = TemplateResponseColumnsEnum._(r'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION');
  static const TOTAL_CHECKOUT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_RATE');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_RATE');
  static const TOTAL_ADD_TO_CART_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_RATE');
  static const TOTAL_SIGNUP_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_RATE');
  static const TOTAL_PAGE_VISIT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_RATE');
  static const TOTAL_LEAD_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_RATE');
  static const TOTAL_SEARCH_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_RATE');
  static const TOTAL_WATCH_VIDEO_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_RATE');
  static const TOTAL_UNKNOWN_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_RATE');
  static const TOTAL_CUSTOM_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_RATE');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE');
  static const TOTAL_SUBSCRIBE_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_RATE');
  static const TOTAL_VIEW_CONTENT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_RATE');
  static const STANDARD_AD_FEED_ITEM_ID = TemplateResponseColumnsEnum._(r'STANDARD_AD_FEED_ITEM_ID');
  static const IS_STANDARD_FEED_AD = TemplateResponseColumnsEnum._(r'IS_STANDARD_FEED_AD');
  static const TARGETING_GENDER = TemplateResponseColumnsEnum._(r'TARGETING_GENDER');
  static const TARGETING_CREATIVE_TYPE = TemplateResponseColumnsEnum._(r'TARGETING_CREATIVE_TYPE');
  static const TARGETING_COUNTRY = TemplateResponseColumnsEnum._(r'TARGETING_COUNTRY');
  static const TARGETING_LOCATION = TemplateResponseColumnsEnum._(r'TARGETING_LOCATION');
  static const TARGETING_APPTYPE = TemplateResponseColumnsEnum._(r'TARGETING_APPTYPE');
  static const TARGETING_LOCATION_CODE = TemplateResponseColumnsEnum._(r'TARGETING_LOCATION_CODE');
  static const TARGETING_MEDIA_TYPE = TemplateResponseColumnsEnum._(r'TARGETING_MEDIA_TYPE');
  static const TARGETING_AGE_BUCKET = TemplateResponseColumnsEnum._(r'TARGETING_AGE_BUCKET');
  static const TARGETING_AUDIENCE_MULTIPLIER = TemplateResponseColumnsEnum._(r'TARGETING_AUDIENCE_MULTIPLIER');
  static const TARGETING_LOCAL_ADS_STORE_CODE = TemplateResponseColumnsEnum._(r'TARGETING_LOCAL_ADS_STORE_CODE');
  static const TARGETING_LANGUAGES_INCLUDE = TemplateResponseColumnsEnum._(r'TARGETING_LANGUAGES_INCLUDE');
  static const TARGETING_LANGUAGES_EXCLUDE = TemplateResponseColumnsEnum._(r'TARGETING_LANGUAGES_EXCLUDE');
  static const TOTAL_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const GEN_AI_IMAGE_SIGNATURE = TemplateResponseColumnsEnum._(r'GEN_AI_IMAGE_SIGNATURE');
  static const GEN_AI_IMAGE_URL = TemplateResponseColumnsEnum._(r'GEN_AI_IMAGE_URL');
  static const ORIGINAL_IMAGE_SIGNATURE = TemplateResponseColumnsEnum._(r'ORIGINAL_IMAGE_SIGNATURE');
  static const ORIGINAL_IMAGE_URL = TemplateResponseColumnsEnum._(r'ORIGINAL_IMAGE_URL');
  static const GEN_AI_GENERATION_DATE = TemplateResponseColumnsEnum._(r'GEN_AI_GENERATION_DATE');
  static const IS_REGENERATING = TemplateResponseColumnsEnum._(r'IS_REGENERATING');
  static const GEN_AI_IMAGE_COUNT = TemplateResponseColumnsEnum._(r'GEN_AI_IMAGE_COUNT');
  static const ADVERTISER_TIME_ZONE = TemplateResponseColumnsEnum._(r'ADVERTISER_TIME_ZONE');
  static const eNGAGEMENTCONTACT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_1');
  static const cLICKCONTACT1 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_1');
  static const vIEWCONTACT1 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_1');
  static const eNGAGEMENTCONTACTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKCONTACTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWCONTACTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTCONTACTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_QUANTITY_1');
  static const cLICKCONTACTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_QUANTITY_1');
  static const vIEWCONTACTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_QUANTITY_1');
  static const eNGAGEMENTCONTACT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_2');
  static const cLICKCONTACT2 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_2');
  static const vIEWCONTACT2 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_2');
  static const eNGAGEMENTCONTACTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKCONTACTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWCONTACTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTCONTACTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CONTACT_QUANTITY_2');
  static const cLICKCONTACTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_CONTACT_QUANTITY_2');
  static const vIEWCONTACTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_CONTACT_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CONTACT');
  static const TOTAL_CLICK_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CONTACT');
  static const TOTAL_VIEW_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTACT');
  static const TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_CONTACT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CONTACT_QUANTITY');
  static const TOTAL_CLICK_CONTACT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CONTACT_QUANTITY');
  static const TOTAL_VIEW_CONTACT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CONTACT_QUANTITY');
  static const TOTAL_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT');
  static const TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CONTACT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_QUANTITY');
  static const TOTAL_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_VALUE_IN_DOLLAR');
  static const CONTACT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'CONTACT_COST_PER_ACTION');
  static const CONTACT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'CONTACT_COST_PER_ACTION_IN_US_DOLLAR');
  static const CONTACT_ROAS = TemplateResponseColumnsEnum._(r'CONTACT_ROAS');
  static const TOTAL_CONTACT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_RATE');
  static const WEB_CONTACT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_CONTACT_COST_PER_ACTION');
  static const WEB_CONTACT_ROAS = TemplateResponseColumnsEnum._(r'WEB_CONTACT_ROAS');
  static const TOTAL_WEB_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT');
  static const TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CONTACT');
  static const TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CONTACT');
  static const TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTACT');
  static const TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR');
  static const INAPP_CONTACT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_CONTACT_COST_PER_ACTION');
  static const INAPP_CONTACT_ROAS = TemplateResponseColumnsEnum._(r'INAPP_CONTACT_ROAS');
  static const TOTAL_INAPP_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT');
  static const TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CONTACT');
  static const TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CONTACT');
  static const TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTACT');
  static const TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR');
  static const OFFLINE_CONTACT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_CONTACT_COST_PER_ACTION');
  static const OFFLINE_CONTACT_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_CONTACT_ROAS');
  static const TOTAL_OFFLINE_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT');
  static const TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CONTACT');
  static const TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT');
  static const TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CONTACT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTACT');
  static const TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTSCHEDULE1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_1');
  static const cLICKSCHEDULE1 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_1');
  static const vIEWSCHEDULE1 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_1');
  static const eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSCHEDULEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSCHEDULEVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSCHEDULEQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_QUANTITY_1');
  static const cLICKSCHEDULEQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_QUANTITY_1');
  static const vIEWSCHEDULEQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_QUANTITY_1');
  static const eNGAGEMENTSCHEDULE2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_2');
  static const cLICKSCHEDULE2 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_2');
  static const vIEWSCHEDULE2 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_2');
  static const eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSCHEDULEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSCHEDULEVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSCHEDULEQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SCHEDULE_QUANTITY_2');
  static const cLICKSCHEDULEQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_SCHEDULE_QUANTITY_2');
  static const vIEWSCHEDULEQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_SCHEDULE_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SCHEDULE');
  static const TOTAL_CLICK_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SCHEDULE');
  static const TOTAL_VIEW_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SCHEDULE');
  static const TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY');
  static const TOTAL_CLICK_SCHEDULE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SCHEDULE_QUANTITY');
  static const TOTAL_VIEW_SCHEDULE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SCHEDULE_QUANTITY');
  static const TOTAL_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE');
  static const TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SCHEDULE_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_QUANTITY');
  static const TOTAL_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_VALUE_IN_DOLLAR');
  static const SCHEDULE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'SCHEDULE_COST_PER_ACTION');
  static const SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR');
  static const SCHEDULE_ROAS = TemplateResponseColumnsEnum._(r'SCHEDULE_ROAS');
  static const TOTAL_SCHEDULE_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_RATE');
  static const WEB_SCHEDULE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_SCHEDULE_COST_PER_ACTION');
  static const WEB_SCHEDULE_ROAS = TemplateResponseColumnsEnum._(r'WEB_SCHEDULE_ROAS');
  static const TOTAL_WEB_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE');
  static const TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SCHEDULE');
  static const TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SCHEDULE');
  static const TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SCHEDULE');
  static const TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR');
  static const INAPP_SCHEDULE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SCHEDULE_COST_PER_ACTION');
  static const INAPP_SCHEDULE_ROAS = TemplateResponseColumnsEnum._(r'INAPP_SCHEDULE_ROAS');
  static const TOTAL_INAPP_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE');
  static const TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SCHEDULE');
  static const TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE');
  static const TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SCHEDULE');
  static const TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR');
  static const OFFLINE_SCHEDULE_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_SCHEDULE_COST_PER_ACTION');
  static const OFFLINE_SCHEDULE_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_SCHEDULE_ROAS');
  static const TOTAL_OFFLINE_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE');
  static const TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SCHEDULE');
  static const TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE');
  static const TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SCHEDULE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SCHEDULE');
  static const TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTFINDLOCATION1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_1');
  static const cLICKFINDLOCATION1 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_1');
  static const vIEWFINDLOCATION1 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_1');
  static const eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKFINDLOCATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWFINDLOCATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTFINDLOCATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_QUANTITY_1');
  static const cLICKFINDLOCATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_QUANTITY_1');
  static const vIEWFINDLOCATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_QUANTITY_1');
  static const eNGAGEMENTFINDLOCATION2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_2');
  static const cLICKFINDLOCATION2 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_2');
  static const vIEWFINDLOCATION2 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_2');
  static const eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKFINDLOCATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWFINDLOCATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTFINDLOCATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_FIND_LOCATION_QUANTITY_2');
  static const cLICKFINDLOCATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_FIND_LOCATION_QUANTITY_2');
  static const vIEWFINDLOCATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_FIND_LOCATION_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_FIND_LOCATION');
  static const TOTAL_CLICK_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_FIND_LOCATION');
  static const TOTAL_VIEW_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_FIND_LOCATION');
  static const TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY');
  static const TOTAL_CLICK_FIND_LOCATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_FIND_LOCATION_QUANTITY');
  static const TOTAL_VIEW_FIND_LOCATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_FIND_LOCATION_QUANTITY');
  static const TOTAL_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION');
  static const TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_FIND_LOCATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_QUANTITY');
  static const TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const FIND_LOCATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'FIND_LOCATION_COST_PER_ACTION');
  static const FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR');
  static const FIND_LOCATION_ROAS = TemplateResponseColumnsEnum._(r'FIND_LOCATION_ROAS');
  static const TOTAL_FIND_LOCATION_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_RATE');
  static const WEB_FIND_LOCATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_FIND_LOCATION_COST_PER_ACTION');
  static const WEB_FIND_LOCATION_ROAS = TemplateResponseColumnsEnum._(r'WEB_FIND_LOCATION_ROAS');
  static const TOTAL_WEB_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION');
  static const TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_FIND_LOCATION');
  static const TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION');
  static const TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_FIND_LOCATION');
  static const TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const INAPP_FIND_LOCATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_FIND_LOCATION_COST_PER_ACTION');
  static const INAPP_FIND_LOCATION_ROAS = TemplateResponseColumnsEnum._(r'INAPP_FIND_LOCATION_ROAS');
  static const TOTAL_INAPP_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION');
  static const TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_FIND_LOCATION');
  static const TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION');
  static const TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_FIND_LOCATION');
  static const TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const OFFLINE_FIND_LOCATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_FIND_LOCATION_COST_PER_ACTION');
  static const OFFLINE_FIND_LOCATION_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_FIND_LOCATION_ROAS');
  static const TOTAL_OFFLINE_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION');
  static const TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_FIND_LOCATION');
  static const TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION');
  static const TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_FIND_LOCATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_FIND_LOCATION');
  static const TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTCUSTOMIZEPRODUCT1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_1');
  static const cLICKCUSTOMIZEPRODUCT1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_1');
  static const vIEWCUSTOMIZEPRODUCT1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_1');
  static const eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_1');
  static const cLICKCUSTOMIZEPRODUCTQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_QUANTITY_1');
  static const vIEWCUSTOMIZEPRODUCTQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_QUANTITY_1');
  static const eNGAGEMENTCUSTOMIZEPRODUCT2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_2');
  static const cLICKCUSTOMIZEPRODUCT2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_2');
  static const vIEWCUSTOMIZEPRODUCT2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_2');
  static const eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_2');
  static const cLICKCUSTOMIZEPRODUCTQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_CUSTOMIZE_PRODUCT_QUANTITY_2');
  static const vIEWCUSTOMIZEPRODUCTQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_CUSTOMIZE_PRODUCT_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT');
  static const TOTAL_CLICK_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOMIZE_PRODUCT');
  static const TOTAL_VIEW_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOMIZE_PRODUCT');
  static const TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY');
  static const TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY');
  static const TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY');
  static const TOTAL_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT');
  static const TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_CUSTOMIZE_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_QUANTITY');
  static const TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const CUSTOMIZE_PRODUCT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'CUSTOMIZE_PRODUCT_COST_PER_ACTION');
  static const CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR');
  static const CUSTOMIZE_PRODUCT_ROAS = TemplateResponseColumnsEnum._(r'CUSTOMIZE_PRODUCT_ROAS');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE');
  static const WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION');
  static const WEB_CUSTOMIZE_PRODUCT_ROAS = TemplateResponseColumnsEnum._(r'WEB_CUSTOMIZE_PRODUCT_ROAS');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT');
  static const TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT');
  static const TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION');
  static const INAPP_CUSTOMIZE_PRODUCT_ROAS = TemplateResponseColumnsEnum._(r'INAPP_CUSTOMIZE_PRODUCT_ROAS');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT');
  static const TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT');
  static const TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT');
  static const TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION');
  static const OFFLINE_CUSTOMIZE_PRODUCT_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_CUSTOMIZE_PRODUCT_ROAS');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT');
  static const TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT');
  static const TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTSUBMITAPPLICATION1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_1');
  static const cLICKSUBMITAPPLICATION1 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_1');
  static const vIEWSUBMITAPPLICATION1 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_1');
  static const eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSUBMITAPPLICATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_1');
  static const cLICKSUBMITAPPLICATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_QUANTITY_1');
  static const vIEWSUBMITAPPLICATIONQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_QUANTITY_1');
  static const eNGAGEMENTSUBMITAPPLICATION2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_2');
  static const cLICKSUBMITAPPLICATION2 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_2');
  static const vIEWSUBMITAPPLICATION2 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_2');
  static const eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSUBMITAPPLICATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_2');
  static const cLICKSUBMITAPPLICATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_SUBMIT_APPLICATION_QUANTITY_2');
  static const vIEWSUBMITAPPLICATIONQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_SUBMIT_APPLICATION_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION');
  static const TOTAL_CLICK_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBMIT_APPLICATION');
  static const TOTAL_VIEW_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBMIT_APPLICATION');
  static const TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY');
  static const TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY');
  static const TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY');
  static const TOTAL_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION');
  static const TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_SUBMIT_APPLICATION_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_QUANTITY');
  static const TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const SUBMIT_APPLICATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'SUBMIT_APPLICATION_COST_PER_ACTION');
  static const SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR');
  static const SUBMIT_APPLICATION_ROAS = TemplateResponseColumnsEnum._(r'SUBMIT_APPLICATION_ROAS');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE');
  static const WEB_SUBMIT_APPLICATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_SUBMIT_APPLICATION_COST_PER_ACTION');
  static const WEB_SUBMIT_APPLICATION_ROAS = TemplateResponseColumnsEnum._(r'WEB_SUBMIT_APPLICATION_ROAS');
  static const TOTAL_WEB_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION');
  static const TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION');
  static const TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION');
  static const TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION');
  static const TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const INAPP_SUBMIT_APPLICATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_SUBMIT_APPLICATION_COST_PER_ACTION');
  static const INAPP_SUBMIT_APPLICATION_ROAS = TemplateResponseColumnsEnum._(r'INAPP_SUBMIT_APPLICATION_ROAS');
  static const TOTAL_INAPP_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION');
  static const TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION');
  static const TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION');
  static const TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION');
  static const OFFLINE_SUBMIT_APPLICATION_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_SUBMIT_APPLICATION_ROAS');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION');
  static const TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION');
  static const TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTSTARTTRIAL1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_1');
  static const cLICKSTARTTRIAL1 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_1');
  static const vIEWSTARTTRIAL1 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_1');
  static const eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKSTARTTRIALVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWSTARTTRIALVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTSTARTTRIALQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_QUANTITY_1');
  static const cLICKSTARTTRIALQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_QUANTITY_1');
  static const vIEWSTARTTRIALQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_QUANTITY_1');
  static const eNGAGEMENTSTARTTRIAL2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_2');
  static const cLICKSTARTTRIAL2 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_2');
  static const vIEWSTARTTRIAL2 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_2');
  static const eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKSTARTTRIALVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWSTARTTRIALVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTSTARTTRIALQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_START_TRIAL_QUANTITY_2');
  static const cLICKSTARTTRIALQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_START_TRIAL_QUANTITY_2');
  static const vIEWSTARTTRIALQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_START_TRIAL_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_START_TRIAL');
  static const TOTAL_CLICK_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_START_TRIAL');
  static const TOTAL_VIEW_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_START_TRIAL');
  static const TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY');
  static const TOTAL_CLICK_START_TRIAL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_START_TRIAL_QUANTITY');
  static const TOTAL_VIEW_START_TRIAL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_START_TRIAL_QUANTITY');
  static const TOTAL_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL');
  static const TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_START_TRIAL_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_QUANTITY');
  static const TOTAL_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_VALUE_IN_DOLLAR');
  static const START_TRIAL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'START_TRIAL_COST_PER_ACTION');
  static const START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR');
  static const START_TRIAL_ROAS = TemplateResponseColumnsEnum._(r'START_TRIAL_ROAS');
  static const TOTAL_START_TRIAL_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_RATE');
  static const WEB_START_TRIAL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_START_TRIAL_COST_PER_ACTION');
  static const WEB_START_TRIAL_ROAS = TemplateResponseColumnsEnum._(r'WEB_START_TRIAL_ROAS');
  static const TOTAL_WEB_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL');
  static const TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_START_TRIAL');
  static const TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_START_TRIAL');
  static const TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_START_TRIAL');
  static const TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR');
  static const INAPP_START_TRIAL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_START_TRIAL_COST_PER_ACTION');
  static const INAPP_START_TRIAL_ROAS = TemplateResponseColumnsEnum._(r'INAPP_START_TRIAL_ROAS');
  static const TOTAL_INAPP_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL');
  static const TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_START_TRIAL');
  static const TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL');
  static const TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_START_TRIAL');
  static const TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR');
  static const OFFLINE_START_TRIAL_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_START_TRIAL_COST_PER_ACTION');
  static const OFFLINE_START_TRIAL_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_START_TRIAL_ROAS');
  static const TOTAL_OFFLINE_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL');
  static const TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_START_TRIAL');
  static const TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL');
  static const TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_START_TRIAL = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_START_TRIAL');
  static const TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const eNGAGEMENTAPPOPEN1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_1');
  static const cLICKAPPOPEN1 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_1');
  static const vIEWAPPOPEN1 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_1');
  static const eNGAGEMENTAPPOPENVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1');
  static const cLICKAPPOPENVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1');
  static const vIEWAPPOPENVALUEINMICRODOLLAR1 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1');
  static const eNGAGEMENTAPPOPENQUANTITY1 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_QUANTITY_1');
  static const cLICKAPPOPENQUANTITY1 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_QUANTITY_1');
  static const vIEWAPPOPENQUANTITY1 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_QUANTITY_1');
  static const eNGAGEMENTAPPOPEN2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_2');
  static const cLICKAPPOPEN2 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_2');
  static const vIEWAPPOPEN2 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_2');
  static const eNGAGEMENTAPPOPENVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2');
  static const cLICKAPPOPENVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2');
  static const vIEWAPPOPENVALUEINMICRODOLLAR2 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2');
  static const eNGAGEMENTAPPOPENQUANTITY2 = TemplateResponseColumnsEnum._(r'ENGAGEMENT_APP_OPEN_QUANTITY_2');
  static const cLICKAPPOPENQUANTITY2 = TemplateResponseColumnsEnum._(r'CLICK_APP_OPEN_QUANTITY_2');
  static const vIEWAPPOPENQUANTITY2 = TemplateResponseColumnsEnum._(r'VIEW_APP_OPEN_QUANTITY_2');
  static const TOTAL_ENGAGEMENT_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_OPEN');
  static const TOTAL_CLICK_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_OPEN');
  static const TOTAL_VIEW_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_OPEN');
  static const TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY');
  static const TOTAL_CLICK_APP_OPEN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_CLICK_APP_OPEN_QUANTITY');
  static const TOTAL_VIEW_APP_OPEN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_VIEW_APP_OPEN_QUANTITY');
  static const TOTAL_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN');
  static const TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR');
  static const TOTAL_APP_OPEN_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_QUANTITY');
  static const TOTAL_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_VALUE_IN_DOLLAR');
  static const APP_OPEN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'APP_OPEN_COST_PER_ACTION');
  static const APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR = TemplateResponseColumnsEnum._(r'APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR');
  static const APP_OPEN_ROAS = TemplateResponseColumnsEnum._(r'APP_OPEN_ROAS');
  static const TOTAL_APP_OPEN_CONVERSION_RATE = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_RATE');
  static const WEB_APP_OPEN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'WEB_APP_OPEN_COST_PER_ACTION');
  static const WEB_APP_OPEN_ROAS = TemplateResponseColumnsEnum._(r'WEB_APP_OPEN_ROAS');
  static const TOTAL_WEB_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN');
  static const TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_CLICK_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_APP_OPEN');
  static const TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_APP_OPEN');
  static const TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_WEB_VIEW_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_APP_OPEN');
  static const TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR');
  static const INAPP_APP_OPEN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'INAPP_APP_OPEN_COST_PER_ACTION');
  static const INAPP_APP_OPEN_ROAS = TemplateResponseColumnsEnum._(r'INAPP_APP_OPEN_ROAS');
  static const TOTAL_INAPP_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN');
  static const TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_CLICK_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_OPEN');
  static const TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN');
  static const TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_INAPP_VIEW_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_OPEN');
  static const TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR');
  static const OFFLINE_APP_OPEN_COST_PER_ACTION = TemplateResponseColumnsEnum._(r'OFFLINE_APP_OPEN_COST_PER_ACTION');
  static const OFFLINE_APP_OPEN_ROAS = TemplateResponseColumnsEnum._(r'OFFLINE_APP_OPEN_ROAS');
  static const TOTAL_OFFLINE_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN');
  static const TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_APP_OPEN');
  static const TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN');
  static const TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_APP_OPEN = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_APP_OPEN');
  static const TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR');
  static const TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD');
  static const TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD = TemplateResponseColumnsEnum._(r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD');

  /// List of all possible values in this [enum][TemplateResponseColumnsEnum].
  static const values = <TemplateResponseColumnsEnum>[
    SPEND_IN_MICRO_DOLLAR,
    SPEND_IN_MICRO_US_DOLLAR,
    BONUS_SPEND_IN_MICRO_DOLLAR,
    BONUS_SPEND_IN_DOLLAR,
    ADS_CREDIT_SPEND_IN_MICRO_DOLLAR,
    ADS_CREDIT_SPEND_IN_DOLLAR,
    PAID_IMPRESSION,
    PAID_CLICKTHROUGH,
    SPEND_IN_DOLLAR,
    SPEND_IN_US_DOLLAR,
    CPC_IN_MICRO_DOLLAR,
    ECPC_IN_MICRO_DOLLAR,
    CPC_IN_DOLLAR,
    ECPC_IN_DOLLAR,
    CTR,
    ECTR,
    OUTBOUND_CTR,
    oUTBOUNDCTR1,
    CPC_IN_MICRO_CURRENCY,
    CPW_IN_MICRO_DOLLAR,
    CPW_IN_DOLLAR,
    COST_PER_OUTBOUND_CLICK,
    AD_ONLY_PIN,
    CAMPAIGN_NAME,
    CAMPAIGN_STATUS,
    IS_CAMPAIGN_LEARNING_PHASE,
    DATE,
    DATE_AS_TIMESTAMP,
    BUDGET_IN_DOLLAR,
    AVAILABLE_BUDGET_IN_DOLLAR,
    TARGETING_TYPE,
    TARGETING_VALUE,
    TARGETING_VALUE_NAME,
    CAMPAIGN_BRAND_LABEL,
    CAMPAIGN_CUSTOM_LABELS,
    APP_INSTALL_APP_NAME,
    PAID_EVENTS,
    BONUS_EVENTS,
    INSERTION,
    LEGACY_CAMPAIGN_ID,
    HBASE_ID,
    PIN_DESCRIPTION,
    CAMPAIGN_END_DATE,
    PIN_PROMOTION_STATUS,
    AD_STATUS,
    PIN_ID,
    CROSS_DEVICE_TYPE,
    INGESTION_SOURCE,
    SOURCE_PLATFORM,
    PIN_PROMOTION_IS_RUNNING,
    TOTAL_ENGAGEMENT,
    eNGAGEMENT1,
    eNGAGEMENT2,
    CPE_IN_MICRO_DOLLAR,
    ECPE_IN_MICRO_DOLLAR,
    CPE_IN_DOLLAR,
    ECPE_IN_DOLLAR,
    ENGAGEMENT_RATE,
    EENGAGEMENT_RATE,
    INTERNAL_ECPE_IN_MICRO_DOLLAR,
    INTERNAL_ECPE_IN_DOLLAR,
    ECPM_IN_MICRO_DOLLAR,
    ECPM_IN_DOLLAR,
    REPIN_RATE,
    rEPINRATE2,
    cTR2,
    CAMPAIGN_ID,
    ADVERTISER_ID,
    AD_ACCOUNT_ID,
    ADVERTISER_OWNER_USER_ID,
    ADVERTISER_OWNER_USER_NAME,
    PIN_PROMOTION_ID,
    AD_ID,
    AD_GROUP_ID,
    KEYWORD_ID,
    KEYWORD_IS_DELETED,
    BRAND_SFDC_ACCOUNT_ID,
    APP_INSTALL_APP_ID,
    CAMPAIGN_ACTION_TYPE,
    CAMPAIGN_BID_TYPE,
    CAMPAIGN_ENTITY_STATUS,
    CAMPAIGN_MANAGED_STATUS,
    CAMPAIGN_OBJECTIVE_TYPE,
    CPM_IN_MICRO_DOLLAR,
    CPM_IN_DOLLAR,
    BUDGET_TYPE,
    BUDGET_IN_LOCAL_CURRENCY,
    AD_GROUP_NAME,
    AD_GROUP_STATUS,
    AD_GROUP_END_DATE,
    AD_GROUP_BUDGET_TYPE,
    AD_GROUP_BUDGET_IN_LOCAL_CURRENCY,
    AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY,
    AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY,
    AD_GROUP_ENTITY_STATUS,
    AD_GROUP_ACTION_TYPE,
    AD_GROUP_CONVERSION_LEARNING_MODE_TYPE,
    AD_GROUP_TARGET_CPA,
    AD_GROUP_BID_STRATEGY_TYPE,
    AD_GROUP_EXPERIMENT_NAME,
    AD_GROUP_EXPERIMENT_CELL,
    AD_GROUP_BID_MULTIPLIER,
    CAMPAIGN_WEB_CLOSEUP_WHITELISTED,
    PRODUCT_GROUP_ID,
    PRODUCT_GROUP_DEFINITION,
    PARENT_PRODUCT_GROUP_ID,
    PRODUCT_GROUP_TYPE,
    PRODUCT_GROUP_BID_IN_MICRO_CURRENCY,
    PRODUCT_GROUP_STATUS,
    PRODUCT_GROUP_ENTITY_STATUS,
    PRODUCT_GROUP_INCLUSION,
    PRODUCT_GROUP_CREATIVE_TYPE,
    PROMO_ID,
    PROMO_NAME,
    PROMO_IDS,
    PROMO_NAMES,
    ITEM_ID,
    PRODUCT_ITEM_ID,
    INTERNAL_PRODUCT_ITEM_ID,
    INTERNAL_PRODUCT_ITEM_ID_STR,
    PRODUCT_ITEM_NAME,
    PRODUCT_ITEM_IMAGE_URL,
    PRODUCT_ITEM_PRICE,
    PRODUCT_ITEM_PRODUCT_URL,
    PRODUCT_ITEM_PIN_URL,
    PRODUCT_ITEM_BRAND,
    PRODUCT_ITEM_DESCRIPTION,
    PRODUCT_ITEM_SALE_PRICE,
    PRODUCT_ITEM_PRODUCT_TYPE,
    PRODUCT_ITEM_PRODUCT_CATEGORY,
    PRODUCT_ITEM_CAMPAIGN_NAME,
    PRODUCT_ITEM_AD_GROUP_NAME,
    PRODUCT_ITEM_CURRENCY,
    ORDER_LINE_ID,
    ORDER_LINE_NAME,
    ORDER_LINE_PIN_REV_SHARE,
    ORDER_LINE_PAID_TYPE,
    SPEND_ORDER_LINE_ID,
    SPEND_ORDER_LINE_PAID_TYPE,
    CONVERSION_PRODUCT_ID,
    CONVERSION_PRODUCT_NAME,
    CONVERSION_PRODUCT_BRAND,
    CONVERSION_PRODUCT_CATEGORY,
    CONVERSION_PRODUCT_ID_GROUP,
    CARTING_TOTAL_PURCHASE_INTENT_CLICKS,
    CARTING_TOTAL_PURCHASE_INTENT_VALUE,
    CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY,
    CARTING_RETAILER_NAME,
    CARTING_PRODUCT_PRICE,
    CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY,
    CARTING_PRODUCT_NAME,
    CARTING_PRODUCT_ID,
    cLICKTHROUGH1,
    rEPIN1,
    iMPRESSION1,
    lIKE1,
    sEND1,
    fLAG1,
    hIDE1,
    iNSERTION1,
    iMPRESSION1GROSS,
    cLICKTHROUGH1GROSS,
    oUTBOUNDCLICK1,
    cLICKTHROUGHUSER1,
    rEPINUSER1,
    iMPRESSIONUSER1,
    lIKEUSER1,
    sENDUSER1,
    fLAGUSER1,
    hIDEUSER1,
    iNSERTIONUSER1,
    cLICKTHROUGH2,
    rEPIN2,
    iMPRESSION2,
    lIKE2,
    sEND2,
    fLAG2,
    oUTBOUNDCLICK2,
    cLICKTHROUGHUSER2,
    rEPINUSER2,
    iMPRESSIONUSER2,
    lIKEUSER2,
    sENDUSER2,
    fLAGUSER2,
    TOTAL_CLICKTHROUGH,
    TOTAL_REPIN,
    TOTAL_IMPRESSION,
    TOTAL_LIKE,
    TOTAL_SEND,
    TOTAL_FLAG,
    TOTAL_IMPRESSION_USER,
    TOTAL_IMPRESSION_USER_HLL,
    TOTAL_IMPRESSION_FREQUENCY,
    TOTAL_IMPRESSION_FREQUENCY_HLL,
    TOTAL_OUTBOUND_CLICK,
    COST_PER_OUTBOUND_CLICK_IN_DOLLAR,
    cOSTPEROUTBOUNDCLICKINDOLLAR1,
    eNGAGEMENTPAGEVISIT1,
    eNGAGEMENTSIGNUP1,
    eNGAGEMENTCHECKOUT1,
    eNGAGEMENTCUSTOM1,
    eNGAGEMENTADDTOCART1,
    eNGAGEMENTLEAD1,
    eNGAGEMENTSEARCH1,
    eNGAGEMENTWATCHVIDEO1,
    eNGAGEMENTVIEWCATEGORY1,
    eNGAGEMENTAPPINSTALL1,
    eNGAGEMENTUNKNOWN1,
    eNGAGEMENTADDPAYMENTINFO1,
    eNGAGEMENTADDTOWISHLIST1,
    eNGAGEMENTINITIATECHECKOUT1,
    eNGAGEMENTSUBSCRIBE1,
    eNGAGEMENTVIEWCONTENT1,
    cLICKPAGEVISIT1,
    cLICKSIGNUP1,
    cLICKCHECKOUT1,
    cLICKCUSTOM1,
    cLICKADDTOCART1,
    cLICKLEAD1,
    cLICKSEARCH1,
    cLICKWATCHVIDEO1,
    cLICKVIEWCATEGORY1,
    cLICKAPPINSTALL1,
    cLICKUNKNOWN1,
    cLICKADDPAYMENTINFO1,
    cLICKADDTOWISHLIST1,
    cLICKINITIATECHECKOUT1,
    cLICKSUBSCRIBE1,
    cLICKVIEWCONTENT1,
    vIEWPAGEVISIT1,
    vIEWSIGNUP1,
    vIEWCHECKOUT1,
    vIEWCUSTOM1,
    vIEWADDTOCART1,
    vIEWLEAD1,
    vIEWSEARCH1,
    vIEWWATCHVIDEO1,
    vIEWVIEWCATEGORY1,
    vIEWAPPINSTALL1,
    vIEWUNKNOWN1,
    vIEWADDPAYMENTINFO1,
    vIEWADDTOWISHLIST1,
    vIEWINITIATECHECKOUT1,
    vIEWSUBSCRIBE1,
    vIEWVIEWCONTENT1,
    cONVERSIONS1,
    eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR1,
    eNGAGEMENTSIGNUPVALUEINMICRODOLLAR1,
    eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR1,
    eNGAGEMENTCUSTOMVALUEINMICRODOLLAR1,
    eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR1,
    eNGAGEMENTLEADVALUEINMICRODOLLAR1,
    eNGAGEMENTSEARCHVALUEINMICRODOLLAR1,
    eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR1,
    eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR1,
    eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR1,
    eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR1,
    eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR1,
    eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR1,
    eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR1,
    eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR1,
    eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR1,
    cLICKPAGEVISITVALUEINMICRODOLLAR1,
    cLICKSIGNUPVALUEINMICRODOLLAR1,
    cLICKCHECKOUTVALUEINMICRODOLLAR1,
    cLICKCUSTOMVALUEINMICRODOLLAR1,
    cLICKADDTOCARTVALUEINMICRODOLLAR1,
    cLICKLEADVALUEINMICRODOLLAR1,
    cLICKSEARCHVALUEINMICRODOLLAR1,
    cLICKWATCHVIDEOVALUEINMICRODOLLAR1,
    cLICKVIEWCATEGORYVALUEINMICRODOLLAR1,
    cLICKAPPINSTALLVALUEINMICRODOLLAR1,
    cLICKUNKNOWNVALUEINMICRODOLLAR1,
    cLICKADDPAYMENTINFOVALUEINMICRODOLLAR1,
    cLICKADDTOWISHLISTVALUEINMICRODOLLAR1,
    cLICKINITIATECHECKOUTVALUEINMICRODOLLAR1,
    cLICKSUBSCRIBEVALUEINMICRODOLLAR1,
    cLICKVIEWCONTENTVALUEINMICRODOLLAR1,
    vIEWPAGEVISITVALUEINMICRODOLLAR1,
    vIEWSIGNUPVALUEINMICRODOLLAR1,
    vIEWCHECKOUTVALUEINMICRODOLLAR1,
    vIEWCUSTOMVALUEINMICRODOLLAR1,
    vIEWADDTOCARTVALUEINMICRODOLLAR1,
    vIEWLEADVALUEINMICRODOLLAR1,
    vIEWSEARCHVALUEINMICRODOLLAR1,
    vIEWWATCHVIDEOVALUEINMICRODOLLAR1,
    vIEWVIEWCATEGORYVALUEINMICRODOLLAR1,
    vIEWAPPINSTALLVALUEINMICRODOLLAR1,
    vIEWUNKNOWNVALUEINMICRODOLLAR1,
    vIEWADDPAYMENTINFOVALUEINMICRODOLLAR1,
    vIEWADDTOWISHLISTVALUEINMICRODOLLAR1,
    vIEWINITIATECHECKOUTVALUEINMICRODOLLAR1,
    vIEWSUBSCRIBEVALUEINMICRODOLLAR1,
    vIEWVIEWCONTENTVALUEINMICRODOLLAR1,
    cONVERSIONSVALUEINMICRODOLLAR1,
    eNGAGEMENTPAGEVISITQUANTITY1,
    eNGAGEMENTSIGNUPQUANTITY1,
    eNGAGEMENTCHECKOUTQUANTITY1,
    eNGAGEMENTCUSTOMQUANTITY1,
    eNGAGEMENTADDTOCARTQUANTITY1,
    eNGAGEMENTLEADQUANTITY1,
    eNGAGEMENTSEARCHQUANTITY1,
    eNGAGEMENTWATCHVIDEOQUANTITY1,
    eNGAGEMENTVIEWCATEGORYQUANTITY1,
    eNGAGEMENTAPPINSTALLQUANTITY1,
    eNGAGEMENTUNKNOWNQUANTITY1,
    eNGAGEMENTADDPAYMENTINFOQUANTITY1,
    eNGAGEMENTADDTOWISHLISTQUANTITY1,
    eNGAGEMENTINITIATECHECKOUTQUANTITY1,
    eNGAGEMENTSUBSCRIBEQUANTITY1,
    eNGAGEMENTVIEWCONTENTQUANTITY1,
    cLICKPAGEVISITQUANTITY1,
    cLICKSIGNUPQUANTITY1,
    cLICKCHECKOUTQUANTITY1,
    cLICKCUSTOMQUANTITY1,
    cLICKADDTOCARTQUANTITY1,
    cLICKLEADQUANTITY1,
    cLICKSEARCHQUANTITY1,
    cLICKWATCHVIDEOQUANTITY1,
    cLICKVIEWCATEGORYQUANTITY1,
    cLICKAPPINSTALLQUANTITY1,
    cLICKUNKNOWNQUANTITY1,
    cLICKADDPAYMENTINFOQUANTITY1,
    cLICKADDTOWISHLISTQUANTITY1,
    cLICKINITIATECHECKOUTQUANTITY1,
    cLICKSUBSCRIBEQUANTITY1,
    cLICKVIEWCONTENTQUANTITY1,
    vIEWPAGEVISITQUANTITY1,
    vIEWSIGNUPQUANTITY1,
    vIEWCHECKOUTQUANTITY1,
    vIEWCUSTOMQUANTITY1,
    vIEWADDTOCARTQUANTITY1,
    vIEWLEADQUANTITY1,
    vIEWSEARCHQUANTITY1,
    vIEWWATCHVIDEOQUANTITY1,
    vIEWVIEWCATEGORYQUANTITY1,
    vIEWAPPINSTALLQUANTITY1,
    vIEWUNKNOWNQUANTITY1,
    vIEWADDPAYMENTINFOQUANTITY1,
    vIEWADDTOWISHLISTQUANTITY1,
    vIEWINITIATECHECKOUTQUANTITY1,
    vIEWSUBSCRIBEQUANTITY1,
    vIEWVIEWCONTENTQUANTITY1,
    cONVERSIONSQUANTITY1,
    eNGAGEMENTPAGEVISIT2,
    eNGAGEMENTSIGNUP2,
    eNGAGEMENTCHECKOUT2,
    eNGAGEMENTCUSTOM2,
    eNGAGEMENTADDTOCART2,
    eNGAGEMENTLEAD2,
    eNGAGEMENTSEARCH2,
    eNGAGEMENTWATCHVIDEO2,
    eNGAGEMENTVIEWCATEGORY2,
    eNGAGEMENTAPPINSTALL2,
    eNGAGEMENTUNKNOWN2,
    eNGAGEMENTADDPAYMENTINFO2,
    eNGAGEMENTADDTOWISHLIST2,
    eNGAGEMENTINITIATECHECKOUT2,
    eNGAGEMENTSUBSCRIBE2,
    eNGAGEMENTVIEWCONTENT2,
    cLICKPAGEVISIT2,
    cLICKSIGNUP2,
    cLICKCHECKOUT2,
    cLICKCUSTOM2,
    cLICKADDTOCART2,
    cLICKLEAD2,
    cLICKSEARCH2,
    cLICKWATCHVIDEO2,
    cLICKVIEWCATEGORY2,
    cLICKAPPINSTALL2,
    cLICKUNKNOWN2,
    cLICKADDPAYMENTINFO2,
    cLICKADDTOWISHLIST2,
    cLICKINITIATECHECKOUT2,
    cLICKSUBSCRIBE2,
    cLICKVIEWCONTENT2,
    vIEWPAGEVISIT2,
    vIEWSIGNUP2,
    vIEWCHECKOUT2,
    vIEWCUSTOM2,
    vIEWADDTOCART2,
    vIEWLEAD2,
    vIEWSEARCH2,
    vIEWWATCHVIDEO2,
    vIEWVIEWCATEGORY2,
    vIEWAPPINSTALL2,
    vIEWUNKNOWN2,
    vIEWADDPAYMENTINFO2,
    vIEWADDTOWISHLIST2,
    vIEWINITIATECHECKOUT2,
    vIEWSUBSCRIBE2,
    vIEWVIEWCONTENT2,
    cONVERSIONS2,
    eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR2,
    eNGAGEMENTSIGNUPVALUEINMICRODOLLAR2,
    eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR2,
    eNGAGEMENTCUSTOMVALUEINMICRODOLLAR2,
    eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR2,
    eNGAGEMENTLEADVALUEINMICRODOLLAR2,
    eNGAGEMENTSEARCHVALUEINMICRODOLLAR2,
    eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR2,
    eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR2,
    eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR2,
    eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR2,
    eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR2,
    eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR2,
    eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR2,
    eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR2,
    eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR2,
    cLICKPAGEVISITVALUEINMICRODOLLAR2,
    cLICKSIGNUPVALUEINMICRODOLLAR2,
    cLICKCHECKOUTVALUEINMICRODOLLAR2,
    cLICKCUSTOMVALUEINMICRODOLLAR2,
    cLICKADDTOCARTVALUEINMICRODOLLAR2,
    cLICKLEADVALUEINMICRODOLLAR2,
    cLICKSEARCHVALUEINMICRODOLLAR2,
    cLICKWATCHVIDEOVALUEINMICRODOLLAR2,
    cLICKVIEWCATEGORYVALUEINMICRODOLLAR2,
    cLICKAPPINSTALLVALUEINMICRODOLLAR2,
    cLICKUNKNOWNVALUEINMICRODOLLAR2,
    cLICKADDPAYMENTINFOVALUEINMICRODOLLAR2,
    cLICKADDTOWISHLISTVALUEINMICRODOLLAR2,
    cLICKINITIATECHECKOUTVALUEINMICRODOLLAR2,
    cLICKSUBSCRIBEVALUEINMICRODOLLAR2,
    cLICKVIEWCONTENTVALUEINMICRODOLLAR2,
    vIEWPAGEVISITVALUEINMICRODOLLAR2,
    vIEWSIGNUPVALUEINMICRODOLLAR2,
    vIEWCHECKOUTVALUEINMICRODOLLAR2,
    vIEWCUSTOMVALUEINMICRODOLLAR2,
    vIEWADDTOCARTVALUEINMICRODOLLAR2,
    vIEWLEADVALUEINMICRODOLLAR2,
    vIEWSEARCHVALUEINMICRODOLLAR2,
    vIEWWATCHVIDEOVALUEINMICRODOLLAR2,
    vIEWVIEWCATEGORYVALUEINMICRODOLLAR2,
    vIEWAPPINSTALLVALUEINMICRODOLLAR2,
    vIEWUNKNOWNVALUEINMICRODOLLAR2,
    vIEWADDPAYMENTINFOVALUEINMICRODOLLAR2,
    vIEWADDTOWISHLISTVALUEINMICRODOLLAR2,
    vIEWINITIATECHECKOUTVALUEINMICRODOLLAR2,
    vIEWSUBSCRIBEVALUEINMICRODOLLAR2,
    vIEWVIEWCONTENTVALUEINMICRODOLLAR2,
    cONVERSIONSVALUEINMICRODOLLAR2,
    eNGAGEMENTPAGEVISITQUANTITY2,
    eNGAGEMENTSIGNUPQUANTITY2,
    eNGAGEMENTCHECKOUTQUANTITY2,
    eNGAGEMENTCUSTOMQUANTITY2,
    eNGAGEMENTADDTOCARTQUANTITY2,
    eNGAGEMENTLEADQUANTITY2,
    eNGAGEMENTSEARCHQUANTITY2,
    eNGAGEMENTWATCHVIDEOQUANTITY2,
    eNGAGEMENTVIEWCATEGORYQUANTITY2,
    eNGAGEMENTAPPINSTALLQUANTITY2,
    eNGAGEMENTUNKNOWNQUANTITY2,
    eNGAGEMENTADDPAYMENTINFOQUANTITY2,
    eNGAGEMENTADDTOWISHLISTQUANTITY2,
    eNGAGEMENTINITIATECHECKOUTQUANTITY2,
    eNGAGEMENTSUBSCRIBEQUANTITY2,
    eNGAGEMENTVIEWCONTENTQUANTITY2,
    cLICKPAGEVISITQUANTITY2,
    cLICKSIGNUPQUANTITY2,
    cLICKCHECKOUTQUANTITY2,
    cLICKCUSTOMQUANTITY2,
    cLICKADDTOCARTQUANTITY2,
    cLICKLEADQUANTITY2,
    cLICKSEARCHQUANTITY2,
    cLICKWATCHVIDEOQUANTITY2,
    cLICKVIEWCATEGORYQUANTITY2,
    cLICKAPPINSTALLQUANTITY2,
    cLICKUNKNOWNQUANTITY2,
    cLICKADDPAYMENTINFOQUANTITY2,
    cLICKADDTOWISHLISTQUANTITY2,
    cLICKINITIATECHECKOUTQUANTITY2,
    cLICKSUBSCRIBEQUANTITY2,
    cLICKVIEWCONTENTQUANTITY2,
    vIEWPAGEVISITQUANTITY2,
    vIEWSIGNUPQUANTITY2,
    vIEWCHECKOUTQUANTITY2,
    vIEWCUSTOMQUANTITY2,
    vIEWADDTOCARTQUANTITY2,
    vIEWLEADQUANTITY2,
    vIEWSEARCHQUANTITY2,
    vIEWWATCHVIDEOQUANTITY2,
    vIEWVIEWCATEGORYQUANTITY2,
    vIEWAPPINSTALLQUANTITY2,
    vIEWUNKNOWNQUANTITY2,
    vIEWADDPAYMENTINFOQUANTITY2,
    vIEWADDTOWISHLISTQUANTITY2,
    vIEWINITIATECHECKOUTQUANTITY2,
    vIEWSUBSCRIBEQUANTITY2,
    vIEWVIEWCONTENTQUANTITY2,
    cONVERSIONSQUANTITY2,
    TOTAL_ENGAGEMENT_PAGE_VISIT,
    TOTAL_ENGAGEMENT_SIGNUP,
    TOTAL_ENGAGEMENT_CHECKOUT,
    TOTAL_ENGAGEMENT_CUSTOM,
    TOTAL_ENGAGEMENT_ADD_TO_CART,
    TOTAL_ENGAGEMENT_LEAD,
    TOTAL_ENGAGEMENT_SEARCH,
    TOTAL_ENGAGEMENT_WATCH_VIDEO,
    TOTAL_ENGAGEMENT_VIEW_CATEGORY,
    TOTAL_ENGAGEMENT_APP_INSTALL,
    TOTAL_ENGAGEMENT_UNKNOWN,
    TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO,
    TOTAL_ENGAGEMENT_ADD_TO_WISHLIST,
    TOTAL_ENGAGEMENT_INITIATE_CHECKOUT,
    TOTAL_ENGAGEMENT_SUBSCRIBE,
    TOTAL_ENGAGEMENT_VIEW_CONTENT,
    TOTAL_CLICK_PAGE_VISIT,
    TOTAL_CLICK_SIGNUP,
    TOTAL_CLICK_CHECKOUT,
    TOTAL_CLICK_CUSTOM,
    TOTAL_CLICK_ADD_TO_CART,
    TOTAL_CLICK_LEAD,
    TOTAL_CLICK_SEARCH,
    TOTAL_CLICK_WATCH_VIDEO,
    TOTAL_CLICK_VIEW_CATEGORY,
    TOTAL_CLICK_APP_INSTALL,
    TOTAL_CLICK_UNKNOWN,
    TOTAL_CLICK_ADD_PAYMENT_INFO,
    TOTAL_CLICK_ADD_TO_WISHLIST,
    TOTAL_CLICK_INITIATE_CHECKOUT,
    TOTAL_CLICK_SUBSCRIBE,
    TOTAL_CLICK_VIEW_CONTENT,
    TOTAL_VIEW_PAGE_VISIT,
    TOTAL_VIEW_SIGNUP,
    TOTAL_VIEW_CHECKOUT,
    TOTAL_VIEW_CUSTOM,
    TOTAL_VIEW_ADD_TO_CART,
    TOTAL_VIEW_LEAD,
    TOTAL_VIEW_SEARCH,
    TOTAL_VIEW_WATCH_VIDEO,
    TOTAL_VIEW_VIEW_CATEGORY,
    TOTAL_VIEW_APP_INSTALL,
    TOTAL_VIEW_UNKNOWN,
    TOTAL_VIEW_ADD_PAYMENT_INFO,
    TOTAL_VIEW_ADD_TO_WISHLIST,
    TOTAL_VIEW_INITIATE_CHECKOUT,
    TOTAL_VIEW_SUBSCRIBE,
    TOTAL_VIEW_VIEW_CONTENT,
    TOTAL_CONVERSIONS,
    TOTAL_WEB_CONVERSIONS,
    TOTAL_INAPP_CONVERSIONS,
    TOTAL_OFFLINE_CONVERSIONS,
    TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR,
    TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR,
    TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CONVERSIONS_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY,
    TOTAL_ENGAGEMENT_SIGNUP_QUANTITY,
    TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY,
    TOTAL_ENGAGEMENT_CUSTOM_QUANTITY,
    TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY,
    TOTAL_ENGAGEMENT_LEAD_QUANTITY,
    TOTAL_ENGAGEMENT_SEARCH_QUANTITY,
    TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY,
    TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY,
    TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY,
    TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY,
    TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY,
    TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY,
    TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY,
    TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY,
    TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY,
    TOTAL_CLICK_PAGE_VISIT_QUANTITY,
    TOTAL_CLICK_SIGNUP_QUANTITY,
    TOTAL_CLICK_CHECKOUT_QUANTITY,
    TOTAL_CLICK_CUSTOM_QUANTITY,
    TOTAL_CLICK_ADD_TO_CART_QUANTITY,
    TOTAL_CLICK_LEAD_QUANTITY,
    TOTAL_CLICK_SEARCH_QUANTITY,
    TOTAL_CLICK_WATCH_VIDEO_QUANTITY,
    TOTAL_CLICK_VIEW_CATEGORY_QUANTITY,
    TOTAL_CLICK_APP_INSTALL_QUANTITY,
    TOTAL_CLICK_UNKNOWN_QUANTITY,
    TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY,
    TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY,
    TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY,
    TOTAL_CLICK_SUBSCRIBE_QUANTITY,
    TOTAL_CLICK_VIEW_CONTENT_QUANTITY,
    TOTAL_VIEW_PAGE_VISIT_QUANTITY,
    TOTAL_VIEW_SIGNUP_QUANTITY,
    TOTAL_VIEW_CHECKOUT_QUANTITY,
    TOTAL_VIEW_CUSTOM_QUANTITY,
    TOTAL_VIEW_ADD_TO_CART_QUANTITY,
    TOTAL_VIEW_LEAD_QUANTITY,
    TOTAL_VIEW_SEARCH_QUANTITY,
    TOTAL_VIEW_WATCH_VIDEO_QUANTITY,
    TOTAL_VIEW_VIEW_CATEGORY_QUANTITY,
    TOTAL_VIEW_APP_INSTALL_QUANTITY,
    TOTAL_VIEW_UNKNOWN_QUANTITY,
    TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY,
    TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY,
    TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY,
    TOTAL_VIEW_SUBSCRIBE_QUANTITY,
    TOTAL_VIEW_VIEW_CONTENT_QUANTITY,
    TOTAL_CONVERSIONS_QUANTITY,
    COST_PER_CONVERSION_IN_DOLLAR,
    TOTAL_WEB_SESSIONS,
    wEBSESSIONS1,
    wEBSESSIONS2,
    APP_INSTALLS_CPA_BILLABLE,
    APP_INSTALLS_CLICK,
    APP_INSTALLS_CLOSEUPREPIN,
    APP_INSTALLS_VIEW,
    APP_INSTALLS,
    APP_INSTALLS_ENGAGEMENT,
    aPPINSTALLSCLICK1,
    aPPINSTALLSCLICK2,
    aPPINSTALLSVIEW1,
    aPPINSTALLSVIEW2,
    aPPINSTALLSENGAGEMENT1,
    aPPINSTALLSENGAGEMENT2,
    aPPINSTALLS1,
    aPPINSTALLS2,
    CPI_IN_MICRO_DOLLAR,
    ECPI_IN_MICRO_DOLLAR,
    CPI_IN_DOLLAR,
    ECPI_IN_DOLLAR,
    INAPP_SKAN_APP_INSTALL,
    INAPP_SKAN_ASSISTED_APP_INSTALL,
    INAPP_SKAN_APP_INSTALL_COST_PER_ACTION,
    INAPP_SKAN_APP_INSTALL_CONVERSION_RATE,
    oNSITECHECKOUTSCPABILLABLE1,
    oNSITECHECKOUTSCPABILLABLE2,
    ONSITE_CHECKOUTS_CPA_BILLABLE,
    oNSITECHECKOUTSVALUE1,
    oNSITECHECKOUTSVALUE2,
    ONSITE_CHECKOUTS_VALUE,
    oNSITECHECKOUTS1,
    oNSITECHECKOUTS2,
    ONSITE_CHECKOUTS,
    oNSITECHECKOUTSVALUEINMICRODOLLAR1,
    oNSITECHECKOUTSVALUEINMICRODOLLAR2,
    CONVERSION_RATE,
    AVERAGE_CHECKOUT_VALUE,
    RETURN_ON_ADVERTISER_SPEND,
    bUYBUTTONCLICKS1,
    bUYBUTTONCLICKS2,
    TOTAL_BUY_BUTTON_CLICKS,
    ORDER_DROPOFF_RATE,
    ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR,
    ONSITE_CHECKOUTS_VALUE_IN_DOLLAR,
    PIN_PROMOTION_NAME,
    AD_NAME,
    lIFETIMEIMPRESSIONUSER1,
    PIN_PROMOTION_CAMPAIGN_ID,
    PIN_PROMOTION_CAMPAIGN_NAME,
    PIN_PROMOTION_CAMPAIGN_ACTION_TYPE,
    TOTAL_LIFETIME_IMPRESSION_USER,
    PIN_PROMOTION_CAMPAIGN_STATUS,
    PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS,
    PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS,
    PIN_PROMOTION_AD_GROUP_ID,
    PIN_PROMOTION_AD_GROUP_NAME,
    PIN_PROMOTION_AD_GROUP_STATUS,
    PIN_PROMOTION_AD_GROUP_ENTITY_STATUS,
    PIN_PROMOTION_CREATIVE_TYPE,
    PIN_PROMOTION_ENTITY_STATUS,
    pINPROMOTIONCREATIVETYPEV2,
    PIN_PROMOTION_REVIEW_STATUS,
    AD_GROUP_CAMPAIGN_ACTION_TYPE,
    AD_GROUP_CAMPAIGN_ID,
    AD_GROUP_CAMPAIGN_NAME,
    AD_GROUP_CAMPAIGN_STATUS,
    AD_GROUP_CREATIVE_TYPE,
    AD_GROUP_CAMPAIGN_MANAGED_STATUS,
    AD_GROUP_CAMPAIGN_ENTITY_STATUS,
    AD_GROUP_START_DATE,
    CAMPAIGN_LIFETIME_SPEND_CAP,
    AD_GROUP_BID_IN_MICRO_CURRENCY,
    CAMPAIGN_AD_GROUP_START_DATE,
    CAMPAIGN_AD_GROUP_END_DATE,
    CAMPAIGN_NUMBER_OF_AD_GROUPS,
    AD_GROUP_NUMBER_OF_PIN_PROMOTIONS,
    TODAY_SPEND_IN_LOCAL_CURRENCY,
    TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY,
    BUDGET_UTILIZATION,
    AD_GROUP_OPTIMIZATION,
    INSERTION_ORDER,
    AD_GROUP_BONUS_BUDGET,
    FREQUENCY,
    CAMPAIGN_DAILY_SPEND_CAP,
    CAMPAIGN_CREATIVE_TYPE,
    AD_GROUP_PLACEMENT_GROUP_TYPE,
    AD_GROUP_IS_PREFETCH_ENABLED,
    CAMPAIGN_BUDGET_OPTIMIZATION,
    CAMPAIGN_START_DATE,
    IS_AUTOMATED_CAMPAIGN,
    IS_PREMIERE_CAMPAIGN,
    FLEXIBLE_DAILY_BUDGETS,
    IS_PERFORMANCE_PLUS_CAMPAIGN,
    IS_DCO_FORMAT_ENHANCMENT,
    PERCENT_CROSS_DEVICE_CONVERSIONS,
    PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS,
    SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS,
    CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS,
    CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS,
    ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS,
    LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS,
    SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS,
    WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS,
    VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS,
    APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS,
    UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS,
    TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION,
    TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION,
    TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION,
    TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION,
    TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION,
    TOTAL_PAGE_VISIT,
    TOTAL_SIGNUP,
    TOTAL_CHECKOUT,
    TOTAL_CUSTOM,
    TOTAL_ADD_TO_CART,
    TOTAL_LEAD,
    TOTAL_SEARCH,
    TOTAL_WATCH_VIDEO,
    TOTAL_VIEW_CATEGORY,
    TOTAL_APP_INSTALL,
    TOTAL_UNKNOWN,
    TOTAL_ADD_PAYMENT_INFO,
    TOTAL_ADD_TO_WISHLIST,
    TOTAL_INITIATE_CHECKOUT,
    TOTAL_SUBSCRIBE,
    TOTAL_VIEW_CONTENT,
    TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR,
    AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_PAGE_VISIT_QUANTITY,
    TOTAL_SIGNUP_QUANTITY,
    TOTAL_CHECKOUT_QUANTITY,
    TOTAL_CUSTOM_QUANTITY,
    TOTAL_ADD_TO_CART_QUANTITY,
    TOTAL_LEAD_QUANTITY,
    TOTAL_SEARCH_QUANTITY,
    TOTAL_WATCH_VIDEO_QUANTITY,
    TOTAL_VIEW_CATEGORY_QUANTITY,
    TOTAL_APP_INSTALL_QUANTITY,
    TOTAL_UNKNOWN_QUANTITY,
    TOTAL_ADD_PAYMENT_INFO_QUANTITY,
    TOTAL_ADD_TO_WISHLIST_QUANTITY,
    TOTAL_INITIATE_CHECKOUT_QUANTITY,
    TOTAL_SUBSCRIBE_QUANTITY,
    TOTAL_VIEW_CONTENT_QUANTITY,
    TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_LEAD_VALUE_IN_DOLLAR,
    TOTAL_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_APP_INSTALL_VALUE_IN_DOLLAR,
    TOTAL_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR,
    PAGE_VISIT_COST_PER_ACTION,
    SIGNUP_COST_PER_ACTION,
    CHECKOUT_COST_PER_ACTION,
    CUSTOM_COST_PER_ACTION,
    ADD_TO_CART_COST_PER_ACTION,
    LEAD_COST_PER_ACTION,
    SEARCH_COST_PER_ACTION,
    WATCH_VIDEO_COST_PER_ACTION,
    VIEW_CATEGORY_COST_PER_ACTION,
    APP_INSTALL_COST_PER_ACTION,
    UNKNOWN_COST_PER_ACTION,
    AD_GROUP_CPA_IN_MICRO_CURRENCY,
    ADD_PAYMENT_INFO_COST_PER_ACTION,
    ADD_TO_WISHLIST_COST_PER_ACTION,
    INITIATE_CHECKOUT_COST_PER_ACTION,
    SUBSCRIBE_COST_PER_ACTION,
    VIEW_CONTENT_COST_PER_ACTION,
    PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR,
    SIGNUP_COST_PER_ACTION_IN_US_DOLLAR,
    CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR,
    CUSTOM_COST_PER_ACTION_IN_US_DOLLAR,
    ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR,
    LEAD_COST_PER_ACTION_IN_US_DOLLAR,
    SEARCH_COST_PER_ACTION_IN_US_DOLLAR,
    WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR,
    VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR,
    UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR,
    ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR,
    ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR,
    INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR,
    SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR,
    VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR,
    PAGE_VISIT_ROAS,
    SIGNUP_ROAS,
    CHECKOUT_ROAS,
    CUSTOM_ROAS,
    ADD_TO_CART_ROAS,
    LEAD_ROAS,
    SEARCH_ROAS,
    WATCH_VIDEO_ROAS,
    VIEW_CATEGORY_ROAS,
    APP_INSTALL_ROAS,
    UNKNOWN_ROAS,
    ROAS,
    CLICK_ROAS,
    ENGAGEMENT_ROAS,
    VIEW_ROAS,
    ADD_PAYMENT_INFO_ROAS,
    ADD_TO_WISHLIST_ROAS,
    INITIATE_CHECKOUT_ROAS,
    SUBSCRIBE_ROAS,
    VIEW_CONTENT_ROAS,
    HOUR,
    BOARD_ENGAGEMENT,
    BOARD_INSERTION,
    BOARD_IMPRESSION,
    BOARD_FOLLOW,
    BOARD_SEND,
    BOARD_HIDE,
    PRODUCT_GROUP_CAMPAIGN_ID,
    PRODUCT_GROUP_CAMPAIGN_NAME,
    PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE,
    PRODUCT_GROUP_CAMPAIGN_STATUS,
    PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS,
    PRODUCT_GROUP_AD_GROUP_ID,
    PRODUCT_GROUP_AD_GROUP_NAME,
    PRODUCT_GROUP_AD_GROUP_STATUS,
    PRODUCT_GROUP_AD_IMAGE_TAG,
    PRODUCT_GROUP_AD_VIDEO_TAG,
    PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID,
    PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME,
    PROMOTED_CATALOG_PRODUCT_GROUP_ID,
    PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY,
    PROMOTED_CATALOG_PRODUCT_GROUP_STATUS,
    PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS,
    PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID,
    PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME,
    PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE,
    PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS,
    PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS,
    PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID,
    PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME,
    PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS,
    PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL,
    PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG,
    vIDEO3SECVIEWS1,
    vIDEO15SECUNIQUEVIEWS1,
    vIDEOP0COMPLETE1,
    vIDEOP25COMPLETE1,
    vIDEOP50COMPLETE1,
    vIDEOP75COMPLETE1,
    vIDEOP95COMPLETE1,
    vIDEOP97COMPLETE1,
    vIDEOP100COMPLETE1,
    vIDEOP0COMBINED1,
    vIDEOP25COMBINED1,
    vIDEOP50COMBINED1,
    vIDEOP75COMBINED1,
    vIDEOP95COMBINED1,
    vIDEOP97COMBINED1,
    vIDEOP100COMBINED1,
    VIDEO_STARTS_PAID,
    VIDEO_STARTS_EARNED,
    TOTAL_VIDEO_STARTS,
    vIDEOAVGWATCHTIME1,
    vIDEOMRCVIEWS1,
    vIDEOVIEWRATE1,
    vIDEO3SECVIEWS2,
    vIDEO15SECUNIQUEVIEWS2,
    vIDEOP0COMPLETE2,
    vIDEOP25COMPLETE2,
    vIDEOP50COMPLETE2,
    vIDEOP75COMPLETE2,
    vIDEOP95COMPLETE2,
    vIDEOP97COMPLETE2,
    vIDEOP100COMPLETE2,
    vIDEOP0COMBINED2,
    vIDEOP25COMBINED2,
    vIDEOP50COMBINED2,
    vIDEOP75COMBINED2,
    vIDEOP95COMBINED2,
    vIDEOP97COMBINED2,
    vIDEOP100COMBINED2,
    vIDEOAVGWATCHTIME2,
    vIDEOMRCVIEWS2,
    vIDEOVIEWRATE2,
    PAID_VIDEO_VIEW,
    PAID_VIDEO_IMPRESSION,
    PAID_VIDEO_VIEWABLE_RATE,
    VIDEO_LENGTH,
    VIDEO_SPEND_IN_MICRO_DOLLAR,
    VIDEO_SPEND_IN_DOLLAR,
    CPV_IN_MICRO_DOLLAR,
    CPV_IN_DOLLAR,
    cP3SVINMICRODOLLAR,
    cP3SVINDOLLAR,
    ECPV_IN_MICRO_DOLLAR,
    ECPV_IN_DOLLAR,
    eCP3SVINMICRODOLLAR,
    eCP3SVINDOLLAR,
    CPCV_IN_DOLLAR,
    CPCV_IN_MICRO_DOLLAR,
    ECPCV_IN_DOLLAR,
    ECPCV_IN_MICRO_DOLLAR,
    cPCVP95INDOLLAR,
    cPCVP95INMICRODOLLAR,
    eCPCVP95INDOLLAR,
    eCPCVP95INMICRODOLLAR,
    tOTALVIDEO3SECVIEWS,
    tOTALVIDEO15SECUNIQUEVIEWS,
    tOTALVIDEOP0COMPLETE,
    tOTALVIDEOP25COMPLETE,
    tOTALVIDEOP50COMPLETE,
    tOTALVIDEOP75COMPLETE,
    tOTALVIDEOP95COMPLETE,
    tOTALVIDEOP97COMPLETE,
    tOTALVIDEOP100COMPLETE,
    tOTALVIDEOP0COMBINED,
    tOTALVIDEOP25COMBINED,
    tOTALVIDEOP50COMBINED,
    tOTALVIDEOP75COMBINED,
    tOTALVIDEOP95COMBINED,
    tOTALVIDEOP97COMBINED,
    tOTALVIDEOP100COMBINED,
    TOTAL_VIDEO_AVG_WATCHTIME,
    TOTAL_VIDEO_MRC_VIEWS,
    TOTAL_VIDEO_VIEW_RATE,
    vIDEOV50WATCHTIME1,
    vIDEOV50WATCHTIME2,
    tOTALVIDEOV50WATCHTIME,
    vIDEOSUMV50WATCHTIMEINMILLISECOND1,
    vIDEOSUMV50WATCHTIMEINMILLISECOND2,
    tOTALVIDEOSUMV50WATCHTIMEINMILLISECOND,
    vIDEOSUMV50WATCHTIMEINSECOND1,
    vIDEOSUMV50WATCHTIMEINSECOND2,
    tOTALVIDEOSUMV50WATCHTIMEINSECOND,
    vIDEOAVGWATCHTIMEINMILLISECOND1,
    vIDEOAVGWATCHTIMEINMILLISECOND2,
    TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND,
    vIDEOAVGWATCHTIMEINSECOND1,
    vIDEOAVGWATCHTIMEINSECOND2,
    TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND,
    VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID,
    VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED,
    TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS,
    DELIVERY_STATUS_NO_FANOUT,
    DELIVERY_STATUS_WITH_FANOUT,
    KEYWORD_COMPETITION_BAND,
    KEYWORD_QUERY_VOLUME,
    KEYWORD_VALUE,
    KEYWORD_MATCH_TYPE,
    KEYWORD_BID_IN_MICRO_CURRENCY,
    KEYWORD_USER_QUERY,
    KEYWORD_SQR_KEYWORD_VALUE,
    KEYWORD_AD_GROUP_ID,
    KEYWORD_AD_GROUP_NAME,
    KEYWORD_CAMPAIGN_ID,
    KEYWORD_CAMPAIGN_NAME,
    KEYWORD_SEARCH_TERM_AD_GROUP_ID,
    KEYWORD_SEARCH_TERM_AD_GROUP_NAME,
    KEYWORD_SEARCH_TERM_CAMPAIGN_ID,
    KEYWORD_SEARCH_TERM_CAMPAIGN_NAME,
    NEGATIVE_KEYWORD_AD_GROUP_ID,
    NEGATIVE_KEYWORD_AD_GROUP_NAME,
    NEGATIVE_KEYWORD_CAMPAIGN_ID,
    NEGATIVE_KEYWORD_CAMPAIGN_NAME,
    oNETAPV2WEBSITEVIEW1,
    oNETAPV2WEBSITEVIEW2,
    tOTALONETAPV2WEBSITEVIEW,
    oNETAPV2WEBSITEVIEWUSER1,
    oNETAPV2WEBSITEVIEWUSER2,
    TOTAL_LANDING_PAGE_VIEWS,
    lANDINGPAGEVIEWS1,
    lANDINGPAGEVIEWS2,
    COST_PER_LANDING_PAGE_VIEW,
    LANDING_PAGE_VIEW_RATE,
    TOTAL_DESTINATION_VIEWS,
    dESTINATIONVIEWS1,
    dESTINATIONVIEWS2,
    COST_PER_DESTINATION_VIEW_IN_DOLLAR,
    COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR,
    DESTINATION_VIEW_RATE,
    CAROUSEL_SLOT_INDEX,
    CAROUSEL_ID,
    CAROUSEL_SLOT_PROMOTION_ID,
    cAROUSELSLOTIMPRESSION1,
    cAROUSELSLOTIMPRESSION2,
    TOTAL_CAROUSEL_SLOT_IMPRESSION,
    cAROUSELSLOTIMPRESSIONUSER1,
    cAROUSELSLOTIMPRESSIONUSER2,
    cAROUSELSLOTCLICKTHROUGH1,
    cAROUSELSLOTCLICKTHROUGH2,
    TOTAL_CAROUSEL_SLOT_CLICKTHROUGH,
    cAROUSELSLOTCLICKTHROUGHUSER1,
    cAROUSELSLOTCLICKTHROUGHUSER2,
    cAROUSELSLOTSIDESWIPE1,
    cAROUSELSLOTSIDESWIPE2,
    TOTAL_CAROUSEL_SLOT_SIDESWIPE,
    cAROUSELSLOTSIDESWIPEUSER1,
    cAROUSELSLOTSIDESWIPEUSER2,
    cAROUSELSLOTVIEWWEBSITE1,
    cAROUSELSLOTVIEWWEBSITE2,
    TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE,
    cAROUSELSLOTVIEWWEBSITEUSER1,
    cAROUSELSLOTVIEWWEBSITEUSER2,
    cOLLECTIONPINITEMIMPRESSION1,
    cOLLECTIONPINITEMIMPRESSION2,
    TOTAL_COLLECTION_PIN_ITEM_IMPRESSION,
    cOLLECTIONPINITEMCLICKTHROUGH1,
    cOLLECTIONPINITEMCLICKTHROUGH2,
    TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH,
    HOLDOUT_EXPERIMENT,
    AD_GROUP_HOLDOUT_EXPERIMENT,
    PIN_PROMOTION_HOLDOUT_EXPERIMENT,
    PRODUCT_GROUP_HOLDOUT_EXPERIMENT,
    MULTI_OBJECTIVE_RESULT,
    MULTI_OBJECTIVE_COST,
    MULTI_OBJECTIVE_RESULT_DESCRIPTION,
    MULTI_OBJECTIVE_COST_DESCRIPTION,
    DATE_RANGE,
    DATE_RANGE_START,
    DATE_RANGE_END,
    REPORT_DATE_START,
    REPORT_DATE_END,
    PINNER_LIST_NAME,
    PINNER_LIST_TYPE,
    ORDER_VALUE,
    ORDER_QUANTITY,
    ADVERTISER_NAME,
    ADVERTISER_CURRENCY,
    TOTAL_REPIN_RATE,
    SPEND_YESTERDAY_IN_DOLLAR,
    PIN_PROMOTION_REJECTION_LABELS,
    PIN_PROMOTION_DESTINATION_URL,
    VIDEO_COMPLETION_RATE,
    CAMPAIGN_BOOKING_REFERENCE,
    WEB_CHECKOUT_COST_PER_ACTION,
    WEB_CHECKOUT_ROAS,
    TOTAL_WEB_CHECKOUT,
    TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_CHECKOUT,
    TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CHECKOUT,
    TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_CHECKOUT,
    TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR,
    INAPP_CHECKOUT_COST_PER_ACTION,
    INAPP_CHECKOUT_ROAS,
    TOTAL_INAPP_CHECKOUT,
    TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_CHECKOUT,
    TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CHECKOUT,
    TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_CHECKOUT,
    TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR,
    OFFLINE_CHECKOUT_COST_PER_ACTION,
    OFFLINE_CHECKOUT_ROAS,
    TOTAL_OFFLINE_CHECKOUT,
    TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_CHECKOUT,
    TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT,
    TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_CHECKOUT,
    TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR,
    PINTEREST_CHECKOUT_COST_PER_ACTION,
    PINTEREST_CHECKOUT_ROAS,
    TOTAL_PINTEREST_CHECKOUT,
    TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR,
    WEB_ADD_TO_CART_COST_PER_ACTION,
    WEB_ADD_TO_CART_ROAS,
    TOTAL_WEB_ADD_TO_CART,
    TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_ADD_TO_CART,
    TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_ADD_TO_CART,
    TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_ADD_TO_CART,
    TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR,
    INAPP_ADD_TO_CART_COST_PER_ACTION,
    INAPP_ADD_TO_CART_ROAS,
    TOTAL_INAPP_ADD_TO_CART,
    TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_TO_CART,
    TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_TO_CART,
    TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR,
    WEB_PAGE_VISIT_COST_PER_ACTION,
    WEB_PAGE_VISIT_ROAS,
    TOTAL_WEB_PAGE_VISIT,
    TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_PAGE_VISIT,
    TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_PAGE_VISIT,
    TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_PAGE_VISIT,
    TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR,
    WEB_SIGNUP_COST_PER_ACTION,
    WEB_SIGNUP_ROAS,
    TOTAL_WEB_SIGNUP,
    TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_SIGNUP,
    TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SIGNUP,
    TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_SIGNUP,
    TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR,
    INAPP_SIGNUP_COST_PER_ACTION,
    INAPP_SIGNUP_ROAS,
    TOTAL_INAPP_SIGNUP,
    TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_SIGNUP,
    TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SIGNUP,
    TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_SIGNUP,
    TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR,
    OFFLINE_SIGNUP_COST_PER_ACTION,
    OFFLINE_SIGNUP_ROAS,
    TOTAL_OFFLINE_SIGNUP,
    TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_SIGNUP,
    TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SIGNUP,
    TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_SIGNUP,
    TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR,
    WEB_WATCH_VIDEO_COST_PER_ACTION,
    WEB_WATCH_VIDEO_ROAS,
    TOTAL_WEB_WATCH_VIDEO,
    TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_WATCH_VIDEO,
    TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO,
    TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_WATCH_VIDEO,
    TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR,
    WEB_LEAD_COST_PER_ACTION,
    WEB_LEAD_ROAS,
    TOTAL_WEB_LEAD,
    TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_LEAD_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_LEAD,
    TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_LEAD,
    TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_LEAD,
    TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR,
    OFFLINE_LEAD_COST_PER_ACTION,
    OFFLINE_LEAD_ROAS,
    TOTAL_OFFLINE_LEAD,
    TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_LEAD,
    TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_LEAD,
    TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_LEAD,
    TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR,
    WEB_SEARCH_COST_PER_ACTION,
    WEB_SEARCH_ROAS,
    TOTAL_WEB_SEARCH,
    TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_SEARCH,
    TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SEARCH,
    TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_SEARCH,
    TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR,
    INAPP_SEARCH_COST_PER_ACTION,
    INAPP_SEARCH_ROAS,
    TOTAL_INAPP_SEARCH,
    TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_SEARCH,
    TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SEARCH,
    TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_SEARCH,
    TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR,
    WEB_VIEW_CATEGORY_COST_PER_ACTION,
    WEB_VIEW_CATEGORY_ROAS,
    TOTAL_WEB_VIEW_CATEGORY,
    TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_VIEW_CATEGORY,
    TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY,
    TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_VIEW_CATEGORY,
    TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR,
    WEB_CUSTOM_COST_PER_ACTION,
    WEB_CUSTOM_ROAS,
    TOTAL_WEB_CUSTOM,
    TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_CUSTOM,
    TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CUSTOM,
    TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_CUSTOM,
    TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR,
    OFFLINE_CUSTOM_COST_PER_ACTION,
    OFFLINE_CUSTOM_ROAS,
    TOTAL_OFFLINE_CUSTOM,
    TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_CUSTOM,
    TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOM,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_CUSTOM,
    TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR,
    WEB_UNKNOWN_COST_PER_ACTION,
    WEB_UNKNOWN_ROAS,
    TOTAL_WEB_UNKNOWN,
    TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_UNKNOWN,
    TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_UNKNOWN,
    TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_UNKNOWN,
    TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR,
    INAPP_UNKNOWN_COST_PER_ACTION,
    INAPP_UNKNOWN_ROAS,
    TOTAL_INAPP_UNKNOWN,
    TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_UNKNOWN,
    TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_UNKNOWN,
    TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_UNKNOWN,
    TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR,
    OFFLINE_UNKNOWN_COST_PER_ACTION,
    OFFLINE_UNKNOWN_ROAS,
    TOTAL_OFFLINE_UNKNOWN,
    TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_UNKNOWN,
    TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN,
    TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_UNKNOWN,
    TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR,
    INAPP_APP_INSTALL_COST_PER_ACTION,
    INAPP_APP_INSTALL_ROAS,
    TOTAL_INAPP_APP_INSTALL,
    TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_APP_INSTALL,
    TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_APP_INSTALL,
    TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_APP_INSTALL,
    TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR,
    TOTAL_APP_INSTALL_CONVERSION_RATE,
    TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE,
    WEB_ADD_PAYMENT_INFO_COST_PER_ACTION,
    WEB_ADD_PAYMENT_INFO_ROAS,
    TOTAL_WEB_ADD_PAYMENT_INFO,
    TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_ADD_PAYMENT_INFO,
    TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO,
    TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_ADD_PAYMENT_INFO,
    TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION,
    INAPP_ADD_PAYMENT_INFO_ROAS,
    TOTAL_INAPP_ADD_PAYMENT_INFO,
    TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO,
    TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO,
    TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO,
    TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION,
    OFFLINE_ADD_PAYMENT_INFO_ROAS,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO,
    TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO,
    TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR,
    WEB_ADD_TO_WISHLIST_COST_PER_ACTION,
    WEB_ADD_TO_WISHLIST_ROAS,
    TOTAL_WEB_ADD_TO_WISHLIST,
    TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_ADD_TO_WISHLIST,
    TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST,
    TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_ADD_TO_WISHLIST,
    TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    INAPP_ADD_TO_WISHLIST_COST_PER_ACTION,
    INAPP_ADD_TO_WISHLIST_ROAS,
    TOTAL_INAPP_ADD_TO_WISHLIST,
    TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_TO_WISHLIST,
    TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_TO_WISHLIST,
    TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION,
    OFFLINE_ADD_TO_WISHLIST_ROAS,
    TOTAL_OFFLINE_ADD_TO_WISHLIST,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST,
    TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST,
    TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR,
    WEB_INITIATE_CHECKOUT_COST_PER_ACTION,
    WEB_INITIATE_CHECKOUT_ROAS,
    TOTAL_WEB_INITIATE_CHECKOUT,
    TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_INITIATE_CHECKOUT,
    TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT,
    TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_INITIATE_CHECKOUT,
    TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    INAPP_INITIATE_CHECKOUT_COST_PER_ACTION,
    INAPP_INITIATE_CHECKOUT_ROAS,
    TOTAL_INAPP_INITIATE_CHECKOUT,
    TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_INITIATE_CHECKOUT,
    TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT,
    TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_INITIATE_CHECKOUT,
    TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION,
    OFFLINE_INITIATE_CHECKOUT_ROAS,
    TOTAL_OFFLINE_INITIATE_CHECKOUT,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT,
    TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT,
    TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT,
    TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR,
    WEB_SUBSCRIBE_COST_PER_ACTION,
    WEB_SUBSCRIBE_ROAS,
    TOTAL_WEB_SUBSCRIBE,
    TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_SUBSCRIBE,
    TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SUBSCRIBE,
    TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_SUBSCRIBE,
    TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR,
    INAPP_SUBSCRIBE_COST_PER_ACTION,
    INAPP_SUBSCRIBE_ROAS,
    TOTAL_INAPP_SUBSCRIBE,
    TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_SUBSCRIBE,
    TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE,
    TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_SUBSCRIBE,
    TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR,
    OFFLINE_SUBSCRIBE_COST_PER_ACTION,
    OFFLINE_SUBSCRIBE_ROAS,
    TOTAL_OFFLINE_SUBSCRIBE,
    TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_SUBSCRIBE,
    TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE,
    TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_SUBSCRIBE,
    TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR,
    WEB_VIEW_CONTENT_COST_PER_ACTION,
    WEB_VIEW_CONTENT_ROAS,
    TOTAL_WEB_VIEW_CONTENT,
    TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_VIEW_CONTENT,
    TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT,
    TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_VIEW_CONTENT,
    TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR,
    INAPP_VIEW_CONTENT_COST_PER_ACTION,
    INAPP_VIEW_CONTENT_ROAS,
    TOTAL_INAPP_VIEW_CONTENT,
    TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_VIEW_CONTENT,
    TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT,
    TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_VIEW_CONTENT,
    TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR,
    OFFLINE_VIEW_CONTENT_COST_PER_ACTION,
    OFFLINE_VIEW_CONTENT_ROAS,
    TOTAL_OFFLINE_VIEW_CONTENT,
    TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_VIEW_CONTENT,
    TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT,
    TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_VIEW_CONTENT,
    TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR,
    iDEAPINPAGEFORWARD1,
    iDEAPINPAGEFORWARD2,
    iDEAPINPAGEBACKWARD1,
    iDEAPINPAGEBACKWARD2,
    TOTAL_IDEA_PIN_PAGE_FORWARD,
    TOTAL_IDEA_PIN_PAGE_BACKWARD,
    iDEAPINPRODUCTTAGVISIT1,
    iDEAPINPRODUCTTAGVISIT2,
    TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT,
    CPM_IN_US_DOLLAR,
    ECPC_IN_US_DOLLAR,
    LEADS,
    COST_PER_LEAD,
    QUIZ_STARTED,
    QUIZ_COMPLETED,
    QUIZ_PIN_RESULT_OPEN,
    QUIZ_COMPLETION_RATE,
    SHOWCASE_PIN_CLICKTHROUGH,
    SHOWCASE_SUBPAGE_CLICKTHROUGH,
    SHOWCASE_SUBPIN_CLICKTHROUGH,
    SHOWCASE_SUBPAGE_IMPRESSION,
    SHOWCASE_SUBPIN_IMPRESSION,
    SHOWCASE_SUBPAGE_SWIPE_LEFT,
    SHOWCASE_SUBPAGE_SWIPE_RIGHT,
    SHOWCASE_SUBPIN_SWIPE_LEFT,
    SHOWCASE_SUBPIN_SWIPE_RIGHT,
    SHOWCASE_SUBPAGE_REPIN,
    SHOWCASE_SUBPIN_REPIN,
    SHOWCASE_SUBPAGE_CLOSEUP,
    SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD,
    SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD,
    SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL,
    SHOWCASE_CARD_LANDING,
    SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION,
    TOTAL_CHECKOUT_CONVERSION_RATE,
    TOTAL_VIEW_CATEGORY_CONVERSION_RATE,
    TOTAL_ADD_TO_CART_CONVERSION_RATE,
    TOTAL_SIGNUP_CONVERSION_RATE,
    TOTAL_PAGE_VISIT_CONVERSION_RATE,
    TOTAL_LEAD_CONVERSION_RATE,
    TOTAL_SEARCH_CONVERSION_RATE,
    TOTAL_WATCH_VIDEO_CONVERSION_RATE,
    TOTAL_UNKNOWN_CONVERSION_RATE,
    TOTAL_CUSTOM_CONVERSION_RATE,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE,
    TOTAL_SUBSCRIBE_CONVERSION_RATE,
    TOTAL_VIEW_CONTENT_CONVERSION_RATE,
    STANDARD_AD_FEED_ITEM_ID,
    IS_STANDARD_FEED_AD,
    TARGETING_GENDER,
    TARGETING_CREATIVE_TYPE,
    TARGETING_COUNTRY,
    TARGETING_LOCATION,
    TARGETING_APPTYPE,
    TARGETING_LOCATION_CODE,
    TARGETING_MEDIA_TYPE,
    TARGETING_AGE_BUCKET,
    TARGETING_AUDIENCE_MULTIPLIER,
    TARGETING_LOCAL_ADS_STORE_CODE,
    TARGETING_LANGUAGES_INCLUDE,
    TARGETING_LANGUAGES_EXCLUDE,
    TOTAL_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE,
    TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_LEAD_CONVERSION_PRODUCT_VALUE,
    TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE,
    TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    GEN_AI_IMAGE_SIGNATURE,
    GEN_AI_IMAGE_URL,
    ORIGINAL_IMAGE_SIGNATURE,
    ORIGINAL_IMAGE_URL,
    GEN_AI_GENERATION_DATE,
    IS_REGENERATING,
    GEN_AI_IMAGE_COUNT,
    ADVERTISER_TIME_ZONE,
    eNGAGEMENTCONTACT1,
    cLICKCONTACT1,
    vIEWCONTACT1,
    eNGAGEMENTCONTACTVALUEINMICRODOLLAR1,
    cLICKCONTACTVALUEINMICRODOLLAR1,
    vIEWCONTACTVALUEINMICRODOLLAR1,
    eNGAGEMENTCONTACTQUANTITY1,
    cLICKCONTACTQUANTITY1,
    vIEWCONTACTQUANTITY1,
    eNGAGEMENTCONTACT2,
    cLICKCONTACT2,
    vIEWCONTACT2,
    eNGAGEMENTCONTACTVALUEINMICRODOLLAR2,
    cLICKCONTACTVALUEINMICRODOLLAR2,
    vIEWCONTACTVALUEINMICRODOLLAR2,
    eNGAGEMENTCONTACTQUANTITY2,
    cLICKCONTACTQUANTITY2,
    vIEWCONTACTQUANTITY2,
    TOTAL_ENGAGEMENT_CONTACT,
    TOTAL_CLICK_CONTACT,
    TOTAL_VIEW_CONTACT,
    TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_CONTACT_QUANTITY,
    TOTAL_CLICK_CONTACT_QUANTITY,
    TOTAL_VIEW_CONTACT_QUANTITY,
    TOTAL_CONTACT,
    TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CONTACT_QUANTITY,
    TOTAL_CONTACT_VALUE_IN_DOLLAR,
    CONTACT_COST_PER_ACTION,
    CONTACT_COST_PER_ACTION_IN_US_DOLLAR,
    CONTACT_ROAS,
    TOTAL_CONTACT_CONVERSION_RATE,
    WEB_CONTACT_COST_PER_ACTION,
    WEB_CONTACT_ROAS,
    TOTAL_WEB_CONTACT,
    TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_CONTACT,
    TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CONTACT,
    TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_CONTACT,
    TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR,
    INAPP_CONTACT_COST_PER_ACTION,
    INAPP_CONTACT_ROAS,
    TOTAL_INAPP_CONTACT,
    TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_CONTACT,
    TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CONTACT,
    TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_CONTACT,
    TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR,
    OFFLINE_CONTACT_COST_PER_ACTION,
    OFFLINE_CONTACT_ROAS,
    TOTAL_OFFLINE_CONTACT,
    TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_CONTACT,
    TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CONTACT,
    TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_CONTACT,
    TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR,
    TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE,
    TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTSCHEDULE1,
    cLICKSCHEDULE1,
    vIEWSCHEDULE1,
    eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR1,
    cLICKSCHEDULEVALUEINMICRODOLLAR1,
    vIEWSCHEDULEVALUEINMICRODOLLAR1,
    eNGAGEMENTSCHEDULEQUANTITY1,
    cLICKSCHEDULEQUANTITY1,
    vIEWSCHEDULEQUANTITY1,
    eNGAGEMENTSCHEDULE2,
    cLICKSCHEDULE2,
    vIEWSCHEDULE2,
    eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR2,
    cLICKSCHEDULEVALUEINMICRODOLLAR2,
    vIEWSCHEDULEVALUEINMICRODOLLAR2,
    eNGAGEMENTSCHEDULEQUANTITY2,
    cLICKSCHEDULEQUANTITY2,
    vIEWSCHEDULEQUANTITY2,
    TOTAL_ENGAGEMENT_SCHEDULE,
    TOTAL_CLICK_SCHEDULE,
    TOTAL_VIEW_SCHEDULE,
    TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY,
    TOTAL_CLICK_SCHEDULE_QUANTITY,
    TOTAL_VIEW_SCHEDULE_QUANTITY,
    TOTAL_SCHEDULE,
    TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SCHEDULE_QUANTITY,
    TOTAL_SCHEDULE_VALUE_IN_DOLLAR,
    SCHEDULE_COST_PER_ACTION,
    SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR,
    SCHEDULE_ROAS,
    TOTAL_SCHEDULE_CONVERSION_RATE,
    WEB_SCHEDULE_COST_PER_ACTION,
    WEB_SCHEDULE_ROAS,
    TOTAL_WEB_SCHEDULE,
    TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_SCHEDULE,
    TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SCHEDULE,
    TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_SCHEDULE,
    TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR,
    INAPP_SCHEDULE_COST_PER_ACTION,
    INAPP_SCHEDULE_ROAS,
    TOTAL_INAPP_SCHEDULE,
    TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_SCHEDULE,
    TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SCHEDULE,
    TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_SCHEDULE,
    TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR,
    OFFLINE_SCHEDULE_COST_PER_ACTION,
    OFFLINE_SCHEDULE_ROAS,
    TOTAL_OFFLINE_SCHEDULE,
    TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_SCHEDULE,
    TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE,
    TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_SCHEDULE,
    TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTFINDLOCATION1,
    cLICKFINDLOCATION1,
    vIEWFINDLOCATION1,
    eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR1,
    cLICKFINDLOCATIONVALUEINMICRODOLLAR1,
    vIEWFINDLOCATIONVALUEINMICRODOLLAR1,
    eNGAGEMENTFINDLOCATIONQUANTITY1,
    cLICKFINDLOCATIONQUANTITY1,
    vIEWFINDLOCATIONQUANTITY1,
    eNGAGEMENTFINDLOCATION2,
    cLICKFINDLOCATION2,
    vIEWFINDLOCATION2,
    eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR2,
    cLICKFINDLOCATIONVALUEINMICRODOLLAR2,
    vIEWFINDLOCATIONVALUEINMICRODOLLAR2,
    eNGAGEMENTFINDLOCATIONQUANTITY2,
    cLICKFINDLOCATIONQUANTITY2,
    vIEWFINDLOCATIONQUANTITY2,
    TOTAL_ENGAGEMENT_FIND_LOCATION,
    TOTAL_CLICK_FIND_LOCATION,
    TOTAL_VIEW_FIND_LOCATION,
    TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY,
    TOTAL_CLICK_FIND_LOCATION_QUANTITY,
    TOTAL_VIEW_FIND_LOCATION_QUANTITY,
    TOTAL_FIND_LOCATION,
    TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_FIND_LOCATION_QUANTITY,
    TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR,
    FIND_LOCATION_COST_PER_ACTION,
    FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR,
    FIND_LOCATION_ROAS,
    TOTAL_FIND_LOCATION_CONVERSION_RATE,
    WEB_FIND_LOCATION_COST_PER_ACTION,
    WEB_FIND_LOCATION_ROAS,
    TOTAL_WEB_FIND_LOCATION,
    TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_FIND_LOCATION,
    TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_FIND_LOCATION,
    TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_FIND_LOCATION,
    TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR,
    INAPP_FIND_LOCATION_COST_PER_ACTION,
    INAPP_FIND_LOCATION_ROAS,
    TOTAL_INAPP_FIND_LOCATION,
    TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_FIND_LOCATION,
    TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION,
    TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_FIND_LOCATION,
    TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR,
    OFFLINE_FIND_LOCATION_COST_PER_ACTION,
    OFFLINE_FIND_LOCATION_ROAS,
    TOTAL_OFFLINE_FIND_LOCATION,
    TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_FIND_LOCATION,
    TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION,
    TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_FIND_LOCATION,
    TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTCUSTOMIZEPRODUCT1,
    cLICKCUSTOMIZEPRODUCT1,
    vIEWCUSTOMIZEPRODUCT1,
    eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1,
    cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1,
    vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1,
    eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY1,
    cLICKCUSTOMIZEPRODUCTQUANTITY1,
    vIEWCUSTOMIZEPRODUCTQUANTITY1,
    eNGAGEMENTCUSTOMIZEPRODUCT2,
    cLICKCUSTOMIZEPRODUCT2,
    vIEWCUSTOMIZEPRODUCT2,
    eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2,
    cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2,
    vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2,
    eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY2,
    cLICKCUSTOMIZEPRODUCTQUANTITY2,
    vIEWCUSTOMIZEPRODUCTQUANTITY2,
    TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT,
    TOTAL_CLICK_CUSTOMIZE_PRODUCT,
    TOTAL_VIEW_CUSTOMIZE_PRODUCT,
    TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY,
    TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY,
    TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY,
    TOTAL_CUSTOMIZE_PRODUCT,
    TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_CUSTOMIZE_PRODUCT_QUANTITY,
    TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    CUSTOMIZE_PRODUCT_COST_PER_ACTION,
    CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR,
    CUSTOMIZE_PRODUCT_ROAS,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE,
    WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION,
    WEB_CUSTOMIZE_PRODUCT_ROAS,
    TOTAL_WEB_CUSTOMIZE_PRODUCT,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT,
    TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT,
    TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT,
    TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION,
    INAPP_CUSTOMIZE_PRODUCT_ROAS,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT,
    TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT,
    TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT,
    TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION,
    OFFLINE_CUSTOMIZE_PRODUCT_ROAS,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT,
    TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT,
    TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTSUBMITAPPLICATION1,
    cLICKSUBMITAPPLICATION1,
    vIEWSUBMITAPPLICATION1,
    eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR1,
    cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR1,
    vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR1,
    eNGAGEMENTSUBMITAPPLICATIONQUANTITY1,
    cLICKSUBMITAPPLICATIONQUANTITY1,
    vIEWSUBMITAPPLICATIONQUANTITY1,
    eNGAGEMENTSUBMITAPPLICATION2,
    cLICKSUBMITAPPLICATION2,
    vIEWSUBMITAPPLICATION2,
    eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR2,
    cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR2,
    vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR2,
    eNGAGEMENTSUBMITAPPLICATIONQUANTITY2,
    cLICKSUBMITAPPLICATIONQUANTITY2,
    vIEWSUBMITAPPLICATIONQUANTITY2,
    TOTAL_ENGAGEMENT_SUBMIT_APPLICATION,
    TOTAL_CLICK_SUBMIT_APPLICATION,
    TOTAL_VIEW_SUBMIT_APPLICATION,
    TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY,
    TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY,
    TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY,
    TOTAL_SUBMIT_APPLICATION,
    TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_SUBMIT_APPLICATION_QUANTITY,
    TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    SUBMIT_APPLICATION_COST_PER_ACTION,
    SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR,
    SUBMIT_APPLICATION_ROAS,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE,
    WEB_SUBMIT_APPLICATION_COST_PER_ACTION,
    WEB_SUBMIT_APPLICATION_ROAS,
    TOTAL_WEB_SUBMIT_APPLICATION,
    TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_SUBMIT_APPLICATION,
    TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION,
    TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_SUBMIT_APPLICATION,
    TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    INAPP_SUBMIT_APPLICATION_COST_PER_ACTION,
    INAPP_SUBMIT_APPLICATION_ROAS,
    TOTAL_INAPP_SUBMIT_APPLICATION,
    TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_SUBMIT_APPLICATION,
    TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION,
    TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_SUBMIT_APPLICATION,
    TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION,
    OFFLINE_SUBMIT_APPLICATION_ROAS,
    TOTAL_OFFLINE_SUBMIT_APPLICATION,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION,
    TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION,
    TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION,
    TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTSTARTTRIAL1,
    cLICKSTARTTRIAL1,
    vIEWSTARTTRIAL1,
    eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR1,
    cLICKSTARTTRIALVALUEINMICRODOLLAR1,
    vIEWSTARTTRIALVALUEINMICRODOLLAR1,
    eNGAGEMENTSTARTTRIALQUANTITY1,
    cLICKSTARTTRIALQUANTITY1,
    vIEWSTARTTRIALQUANTITY1,
    eNGAGEMENTSTARTTRIAL2,
    cLICKSTARTTRIAL2,
    vIEWSTARTTRIAL2,
    eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR2,
    cLICKSTARTTRIALVALUEINMICRODOLLAR2,
    vIEWSTARTTRIALVALUEINMICRODOLLAR2,
    eNGAGEMENTSTARTTRIALQUANTITY2,
    cLICKSTARTTRIALQUANTITY2,
    vIEWSTARTTRIALQUANTITY2,
    TOTAL_ENGAGEMENT_START_TRIAL,
    TOTAL_CLICK_START_TRIAL,
    TOTAL_VIEW_START_TRIAL,
    TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY,
    TOTAL_CLICK_START_TRIAL_QUANTITY,
    TOTAL_VIEW_START_TRIAL_QUANTITY,
    TOTAL_START_TRIAL,
    TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_START_TRIAL_QUANTITY,
    TOTAL_START_TRIAL_VALUE_IN_DOLLAR,
    START_TRIAL_COST_PER_ACTION,
    START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR,
    START_TRIAL_ROAS,
    TOTAL_START_TRIAL_CONVERSION_RATE,
    WEB_START_TRIAL_COST_PER_ACTION,
    WEB_START_TRIAL_ROAS,
    TOTAL_WEB_START_TRIAL,
    TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_START_TRIAL,
    TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_START_TRIAL,
    TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_START_TRIAL,
    TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR,
    INAPP_START_TRIAL_COST_PER_ACTION,
    INAPP_START_TRIAL_ROAS,
    TOTAL_INAPP_START_TRIAL,
    TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_START_TRIAL,
    TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_START_TRIAL,
    TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_START_TRIAL,
    TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR,
    OFFLINE_START_TRIAL_COST_PER_ACTION,
    OFFLINE_START_TRIAL_ROAS,
    TOTAL_OFFLINE_START_TRIAL,
    TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_START_TRIAL,
    TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL,
    TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_START_TRIAL,
    TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    eNGAGEMENTAPPOPEN1,
    cLICKAPPOPEN1,
    vIEWAPPOPEN1,
    eNGAGEMENTAPPOPENVALUEINMICRODOLLAR1,
    cLICKAPPOPENVALUEINMICRODOLLAR1,
    vIEWAPPOPENVALUEINMICRODOLLAR1,
    eNGAGEMENTAPPOPENQUANTITY1,
    cLICKAPPOPENQUANTITY1,
    vIEWAPPOPENQUANTITY1,
    eNGAGEMENTAPPOPEN2,
    cLICKAPPOPEN2,
    vIEWAPPOPEN2,
    eNGAGEMENTAPPOPENVALUEINMICRODOLLAR2,
    cLICKAPPOPENVALUEINMICRODOLLAR2,
    vIEWAPPOPENVALUEINMICRODOLLAR2,
    eNGAGEMENTAPPOPENQUANTITY2,
    cLICKAPPOPENQUANTITY2,
    vIEWAPPOPENQUANTITY2,
    TOTAL_ENGAGEMENT_APP_OPEN,
    TOTAL_CLICK_APP_OPEN,
    TOTAL_VIEW_APP_OPEN,
    TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY,
    TOTAL_CLICK_APP_OPEN_QUANTITY,
    TOTAL_VIEW_APP_OPEN_QUANTITY,
    TOTAL_APP_OPEN,
    TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR,
    TOTAL_APP_OPEN_QUANTITY,
    TOTAL_APP_OPEN_VALUE_IN_DOLLAR,
    APP_OPEN_COST_PER_ACTION,
    APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR,
    APP_OPEN_ROAS,
    TOTAL_APP_OPEN_CONVERSION_RATE,
    WEB_APP_OPEN_COST_PER_ACTION,
    WEB_APP_OPEN_ROAS,
    TOTAL_WEB_APP_OPEN,
    TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_WEB_CLICK_APP_OPEN,
    TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_APP_OPEN,
    TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_WEB_VIEW_APP_OPEN,
    TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR,
    INAPP_APP_OPEN_COST_PER_ACTION,
    INAPP_APP_OPEN_ROAS,
    TOTAL_INAPP_APP_OPEN,
    TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_CLICK_APP_OPEN,
    TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_APP_OPEN,
    TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_INAPP_VIEW_APP_OPEN,
    TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR,
    OFFLINE_APP_OPEN_COST_PER_ACTION,
    OFFLINE_APP_OPEN_ROAS,
    TOTAL_OFFLINE_APP_OPEN,
    TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_CLICK_APP_OPEN,
    TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN,
    TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_OFFLINE_VIEW_APP_OPEN,
    TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR,
    TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD,
    TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD,
  ];

  static TemplateResponseColumnsEnum? fromJson(dynamic value) => TemplateResponseColumnsEnumTypeTransformer().decode(value);

  static List<TemplateResponseColumnsEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseColumnsEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseColumnsEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseColumnsEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseColumnsEnum].
class TemplateResponseColumnsEnumTypeTransformer {
  factory TemplateResponseColumnsEnumTypeTransformer() => _instance ??= const TemplateResponseColumnsEnumTypeTransformer._();

  const TemplateResponseColumnsEnumTypeTransformer._();

  String encode(TemplateResponseColumnsEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseColumnsEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseColumnsEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'SPEND_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.SPEND_IN_MICRO_DOLLAR;
        case r'SPEND_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.SPEND_IN_MICRO_US_DOLLAR;
        case r'BONUS_SPEND_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.BONUS_SPEND_IN_MICRO_DOLLAR;
        case r'BONUS_SPEND_IN_DOLLAR': return TemplateResponseColumnsEnum.BONUS_SPEND_IN_DOLLAR;
        case r'ADS_CREDIT_SPEND_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ADS_CREDIT_SPEND_IN_MICRO_DOLLAR;
        case r'ADS_CREDIT_SPEND_IN_DOLLAR': return TemplateResponseColumnsEnum.ADS_CREDIT_SPEND_IN_DOLLAR;
        case r'PAID_IMPRESSION': return TemplateResponseColumnsEnum.PAID_IMPRESSION;
        case r'PAID_CLICKTHROUGH': return TemplateResponseColumnsEnum.PAID_CLICKTHROUGH;
        case r'SPEND_IN_DOLLAR': return TemplateResponseColumnsEnum.SPEND_IN_DOLLAR;
        case r'SPEND_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SPEND_IN_US_DOLLAR;
        case r'CPC_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPC_IN_MICRO_DOLLAR;
        case r'ECPC_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPC_IN_MICRO_DOLLAR;
        case r'CPC_IN_DOLLAR': return TemplateResponseColumnsEnum.CPC_IN_DOLLAR;
        case r'ECPC_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPC_IN_DOLLAR;
        case r'CTR': return TemplateResponseColumnsEnum.CTR;
        case r'ECTR': return TemplateResponseColumnsEnum.ECTR;
        case r'OUTBOUND_CTR': return TemplateResponseColumnsEnum.OUTBOUND_CTR;
        case r'OUTBOUND_CTR_1': return TemplateResponseColumnsEnum.oUTBOUNDCTR1;
        case r'CPC_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.CPC_IN_MICRO_CURRENCY;
        case r'CPW_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPW_IN_MICRO_DOLLAR;
        case r'CPW_IN_DOLLAR': return TemplateResponseColumnsEnum.CPW_IN_DOLLAR;
        case r'COST_PER_OUTBOUND_CLICK': return TemplateResponseColumnsEnum.COST_PER_OUTBOUND_CLICK;
        case r'AD_ONLY_PIN': return TemplateResponseColumnsEnum.AD_ONLY_PIN;
        case r'CAMPAIGN_NAME': return TemplateResponseColumnsEnum.CAMPAIGN_NAME;
        case r'CAMPAIGN_STATUS': return TemplateResponseColumnsEnum.CAMPAIGN_STATUS;
        case r'IS_CAMPAIGN_LEARNING_PHASE': return TemplateResponseColumnsEnum.IS_CAMPAIGN_LEARNING_PHASE;
        case r'DATE': return TemplateResponseColumnsEnum.DATE;
        case r'DATE_AS_TIMESTAMP': return TemplateResponseColumnsEnum.DATE_AS_TIMESTAMP;
        case r'BUDGET_IN_DOLLAR': return TemplateResponseColumnsEnum.BUDGET_IN_DOLLAR;
        case r'AVAILABLE_BUDGET_IN_DOLLAR': return TemplateResponseColumnsEnum.AVAILABLE_BUDGET_IN_DOLLAR;
        case r'TARGETING_TYPE': return TemplateResponseColumnsEnum.TARGETING_TYPE;
        case r'TARGETING_VALUE': return TemplateResponseColumnsEnum.TARGETING_VALUE;
        case r'TARGETING_VALUE_NAME': return TemplateResponseColumnsEnum.TARGETING_VALUE_NAME;
        case r'CAMPAIGN_BRAND_LABEL': return TemplateResponseColumnsEnum.CAMPAIGN_BRAND_LABEL;
        case r'CAMPAIGN_CUSTOM_LABELS': return TemplateResponseColumnsEnum.CAMPAIGN_CUSTOM_LABELS;
        case r'APP_INSTALL_APP_NAME': return TemplateResponseColumnsEnum.APP_INSTALL_APP_NAME;
        case r'PAID_EVENTS': return TemplateResponseColumnsEnum.PAID_EVENTS;
        case r'BONUS_EVENTS': return TemplateResponseColumnsEnum.BONUS_EVENTS;
        case r'INSERTION': return TemplateResponseColumnsEnum.INSERTION;
        case r'LEGACY_CAMPAIGN_ID': return TemplateResponseColumnsEnum.LEGACY_CAMPAIGN_ID;
        case r'HBASE_ID': return TemplateResponseColumnsEnum.HBASE_ID;
        case r'PIN_DESCRIPTION': return TemplateResponseColumnsEnum.PIN_DESCRIPTION;
        case r'CAMPAIGN_END_DATE': return TemplateResponseColumnsEnum.CAMPAIGN_END_DATE;
        case r'PIN_PROMOTION_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_STATUS;
        case r'AD_STATUS': return TemplateResponseColumnsEnum.AD_STATUS;
        case r'PIN_ID': return TemplateResponseColumnsEnum.PIN_ID;
        case r'CROSS_DEVICE_TYPE': return TemplateResponseColumnsEnum.CROSS_DEVICE_TYPE;
        case r'INGESTION_SOURCE': return TemplateResponseColumnsEnum.INGESTION_SOURCE;
        case r'SOURCE_PLATFORM': return TemplateResponseColumnsEnum.SOURCE_PLATFORM;
        case r'PIN_PROMOTION_IS_RUNNING': return TemplateResponseColumnsEnum.PIN_PROMOTION_IS_RUNNING;
        case r'TOTAL_ENGAGEMENT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT;
        case r'ENGAGEMENT_1': return TemplateResponseColumnsEnum.eNGAGEMENT1;
        case r'ENGAGEMENT_2': return TemplateResponseColumnsEnum.eNGAGEMENT2;
        case r'CPE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPE_IN_MICRO_DOLLAR;
        case r'ECPE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPE_IN_MICRO_DOLLAR;
        case r'CPE_IN_DOLLAR': return TemplateResponseColumnsEnum.CPE_IN_DOLLAR;
        case r'ECPE_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPE_IN_DOLLAR;
        case r'ENGAGEMENT_RATE': return TemplateResponseColumnsEnum.ENGAGEMENT_RATE;
        case r'EENGAGEMENT_RATE': return TemplateResponseColumnsEnum.EENGAGEMENT_RATE;
        case r'INTERNAL_ECPE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.INTERNAL_ECPE_IN_MICRO_DOLLAR;
        case r'INTERNAL_ECPE_IN_DOLLAR': return TemplateResponseColumnsEnum.INTERNAL_ECPE_IN_DOLLAR;
        case r'ECPM_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPM_IN_MICRO_DOLLAR;
        case r'ECPM_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPM_IN_DOLLAR;
        case r'REPIN_RATE': return TemplateResponseColumnsEnum.REPIN_RATE;
        case r'REPIN_RATE_2': return TemplateResponseColumnsEnum.rEPINRATE2;
        case r'CTR_2': return TemplateResponseColumnsEnum.cTR2;
        case r'CAMPAIGN_ID': return TemplateResponseColumnsEnum.CAMPAIGN_ID;
        case r'ADVERTISER_ID': return TemplateResponseColumnsEnum.ADVERTISER_ID;
        case r'AD_ACCOUNT_ID': return TemplateResponseColumnsEnum.AD_ACCOUNT_ID;
        case r'ADVERTISER_OWNER_USER_ID': return TemplateResponseColumnsEnum.ADVERTISER_OWNER_USER_ID;
        case r'ADVERTISER_OWNER_USER_NAME': return TemplateResponseColumnsEnum.ADVERTISER_OWNER_USER_NAME;
        case r'PIN_PROMOTION_ID': return TemplateResponseColumnsEnum.PIN_PROMOTION_ID;
        case r'AD_ID': return TemplateResponseColumnsEnum.AD_ID;
        case r'AD_GROUP_ID': return TemplateResponseColumnsEnum.AD_GROUP_ID;
        case r'KEYWORD_ID': return TemplateResponseColumnsEnum.KEYWORD_ID;
        case r'KEYWORD_IS_DELETED': return TemplateResponseColumnsEnum.KEYWORD_IS_DELETED;
        case r'BRAND_SFDC_ACCOUNT_ID': return TemplateResponseColumnsEnum.BRAND_SFDC_ACCOUNT_ID;
        case r'APP_INSTALL_APP_ID': return TemplateResponseColumnsEnum.APP_INSTALL_APP_ID;
        case r'CAMPAIGN_ACTION_TYPE': return TemplateResponseColumnsEnum.CAMPAIGN_ACTION_TYPE;
        case r'CAMPAIGN_BID_TYPE': return TemplateResponseColumnsEnum.CAMPAIGN_BID_TYPE;
        case r'CAMPAIGN_ENTITY_STATUS': return TemplateResponseColumnsEnum.CAMPAIGN_ENTITY_STATUS;
        case r'CAMPAIGN_MANAGED_STATUS': return TemplateResponseColumnsEnum.CAMPAIGN_MANAGED_STATUS;
        case r'CAMPAIGN_OBJECTIVE_TYPE': return TemplateResponseColumnsEnum.CAMPAIGN_OBJECTIVE_TYPE;
        case r'CPM_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPM_IN_MICRO_DOLLAR;
        case r'CPM_IN_DOLLAR': return TemplateResponseColumnsEnum.CPM_IN_DOLLAR;
        case r'BUDGET_TYPE': return TemplateResponseColumnsEnum.BUDGET_TYPE;
        case r'BUDGET_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.BUDGET_IN_LOCAL_CURRENCY;
        case r'AD_GROUP_NAME': return TemplateResponseColumnsEnum.AD_GROUP_NAME;
        case r'AD_GROUP_STATUS': return TemplateResponseColumnsEnum.AD_GROUP_STATUS;
        case r'AD_GROUP_END_DATE': return TemplateResponseColumnsEnum.AD_GROUP_END_DATE;
        case r'AD_GROUP_BUDGET_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_BUDGET_TYPE;
        case r'AD_GROUP_BUDGET_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.AD_GROUP_BUDGET_IN_LOCAL_CURRENCY;
        case r'AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.AD_GROUP_SUGGESTED_BUDGET_IN_LOCAL_CURRENCY;
        case r'AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.AD_GROUP_SUGGESTED_BONUS_BUDGET_IN_LOCAL_CURRENCY;
        case r'AD_GROUP_ENTITY_STATUS': return TemplateResponseColumnsEnum.AD_GROUP_ENTITY_STATUS;
        case r'AD_GROUP_ACTION_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_ACTION_TYPE;
        case r'AD_GROUP_CONVERSION_LEARNING_MODE_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_CONVERSION_LEARNING_MODE_TYPE;
        case r'AD_GROUP_TARGET_CPA': return TemplateResponseColumnsEnum.AD_GROUP_TARGET_CPA;
        case r'AD_GROUP_BID_STRATEGY_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_BID_STRATEGY_TYPE;
        case r'AD_GROUP_EXPERIMENT_NAME': return TemplateResponseColumnsEnum.AD_GROUP_EXPERIMENT_NAME;
        case r'AD_GROUP_EXPERIMENT_CELL': return TemplateResponseColumnsEnum.AD_GROUP_EXPERIMENT_CELL;
        case r'AD_GROUP_BID_MULTIPLIER': return TemplateResponseColumnsEnum.AD_GROUP_BID_MULTIPLIER;
        case r'CAMPAIGN_WEB_CLOSEUP_WHITELISTED': return TemplateResponseColumnsEnum.CAMPAIGN_WEB_CLOSEUP_WHITELISTED;
        case r'PRODUCT_GROUP_ID': return TemplateResponseColumnsEnum.PRODUCT_GROUP_ID;
        case r'PRODUCT_GROUP_DEFINITION': return TemplateResponseColumnsEnum.PRODUCT_GROUP_DEFINITION;
        case r'PARENT_PRODUCT_GROUP_ID': return TemplateResponseColumnsEnum.PARENT_PRODUCT_GROUP_ID;
        case r'PRODUCT_GROUP_TYPE': return TemplateResponseColumnsEnum.PRODUCT_GROUP_TYPE;
        case r'PRODUCT_GROUP_BID_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.PRODUCT_GROUP_BID_IN_MICRO_CURRENCY;
        case r'PRODUCT_GROUP_STATUS': return TemplateResponseColumnsEnum.PRODUCT_GROUP_STATUS;
        case r'PRODUCT_GROUP_ENTITY_STATUS': return TemplateResponseColumnsEnum.PRODUCT_GROUP_ENTITY_STATUS;
        case r'PRODUCT_GROUP_INCLUSION': return TemplateResponseColumnsEnum.PRODUCT_GROUP_INCLUSION;
        case r'PRODUCT_GROUP_CREATIVE_TYPE': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CREATIVE_TYPE;
        case r'PROMO_ID': return TemplateResponseColumnsEnum.PROMO_ID;
        case r'PROMO_NAME': return TemplateResponseColumnsEnum.PROMO_NAME;
        case r'PROMO_IDS': return TemplateResponseColumnsEnum.PROMO_IDS;
        case r'PROMO_NAMES': return TemplateResponseColumnsEnum.PROMO_NAMES;
        case r'ITEM_ID': return TemplateResponseColumnsEnum.ITEM_ID;
        case r'PRODUCT_ITEM_ID': return TemplateResponseColumnsEnum.PRODUCT_ITEM_ID;
        case r'INTERNAL_PRODUCT_ITEM_ID': return TemplateResponseColumnsEnum.INTERNAL_PRODUCT_ITEM_ID;
        case r'INTERNAL_PRODUCT_ITEM_ID_STR': return TemplateResponseColumnsEnum.INTERNAL_PRODUCT_ITEM_ID_STR;
        case r'PRODUCT_ITEM_NAME': return TemplateResponseColumnsEnum.PRODUCT_ITEM_NAME;
        case r'PRODUCT_ITEM_IMAGE_URL': return TemplateResponseColumnsEnum.PRODUCT_ITEM_IMAGE_URL;
        case r'PRODUCT_ITEM_PRICE': return TemplateResponseColumnsEnum.PRODUCT_ITEM_PRICE;
        case r'PRODUCT_ITEM_PRODUCT_URL': return TemplateResponseColumnsEnum.PRODUCT_ITEM_PRODUCT_URL;
        case r'PRODUCT_ITEM_PIN_URL': return TemplateResponseColumnsEnum.PRODUCT_ITEM_PIN_URL;
        case r'PRODUCT_ITEM_BRAND': return TemplateResponseColumnsEnum.PRODUCT_ITEM_BRAND;
        case r'PRODUCT_ITEM_DESCRIPTION': return TemplateResponseColumnsEnum.PRODUCT_ITEM_DESCRIPTION;
        case r'PRODUCT_ITEM_SALE_PRICE': return TemplateResponseColumnsEnum.PRODUCT_ITEM_SALE_PRICE;
        case r'PRODUCT_ITEM_PRODUCT_TYPE': return TemplateResponseColumnsEnum.PRODUCT_ITEM_PRODUCT_TYPE;
        case r'PRODUCT_ITEM_PRODUCT_CATEGORY': return TemplateResponseColumnsEnum.PRODUCT_ITEM_PRODUCT_CATEGORY;
        case r'PRODUCT_ITEM_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.PRODUCT_ITEM_CAMPAIGN_NAME;
        case r'PRODUCT_ITEM_AD_GROUP_NAME': return TemplateResponseColumnsEnum.PRODUCT_ITEM_AD_GROUP_NAME;
        case r'PRODUCT_ITEM_CURRENCY': return TemplateResponseColumnsEnum.PRODUCT_ITEM_CURRENCY;
        case r'ORDER_LINE_ID': return TemplateResponseColumnsEnum.ORDER_LINE_ID;
        case r'ORDER_LINE_NAME': return TemplateResponseColumnsEnum.ORDER_LINE_NAME;
        case r'ORDER_LINE_PIN_REV_SHARE': return TemplateResponseColumnsEnum.ORDER_LINE_PIN_REV_SHARE;
        case r'ORDER_LINE_PAID_TYPE': return TemplateResponseColumnsEnum.ORDER_LINE_PAID_TYPE;
        case r'SPEND_ORDER_LINE_ID': return TemplateResponseColumnsEnum.SPEND_ORDER_LINE_ID;
        case r'SPEND_ORDER_LINE_PAID_TYPE': return TemplateResponseColumnsEnum.SPEND_ORDER_LINE_PAID_TYPE;
        case r'CONVERSION_PRODUCT_ID': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_ID;
        case r'CONVERSION_PRODUCT_NAME': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_NAME;
        case r'CONVERSION_PRODUCT_BRAND': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_BRAND;
        case r'CONVERSION_PRODUCT_CATEGORY': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_CATEGORY;
        case r'CONVERSION_PRODUCT_ID_GROUP': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_ID_GROUP;
        case r'CARTING_TOTAL_PURCHASE_INTENT_CLICKS': return TemplateResponseColumnsEnum.CARTING_TOTAL_PURCHASE_INTENT_CLICKS;
        case r'CARTING_TOTAL_PURCHASE_INTENT_VALUE': return TemplateResponseColumnsEnum.CARTING_TOTAL_PURCHASE_INTENT_VALUE;
        case r'CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.CARTING_TOTAL_PURCHASE_INTENT_VALUE_IN_MICRO_CURRENCY;
        case r'CARTING_RETAILER_NAME': return TemplateResponseColumnsEnum.CARTING_RETAILER_NAME;
        case r'CARTING_PRODUCT_PRICE': return TemplateResponseColumnsEnum.CARTING_PRODUCT_PRICE;
        case r'CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.CARTING_PRODUCT_PRICE_IN_MICRO_CURRENCY;
        case r'CARTING_PRODUCT_NAME': return TemplateResponseColumnsEnum.CARTING_PRODUCT_NAME;
        case r'CARTING_PRODUCT_ID': return TemplateResponseColumnsEnum.CARTING_PRODUCT_ID;
        case r'CLICKTHROUGH_1': return TemplateResponseColumnsEnum.cLICKTHROUGH1;
        case r'REPIN_1': return TemplateResponseColumnsEnum.rEPIN1;
        case r'IMPRESSION_1': return TemplateResponseColumnsEnum.iMPRESSION1;
        case r'LIKE_1': return TemplateResponseColumnsEnum.lIKE1;
        case r'SEND_1': return TemplateResponseColumnsEnum.sEND1;
        case r'FLAG_1': return TemplateResponseColumnsEnum.fLAG1;
        case r'HIDE_1': return TemplateResponseColumnsEnum.hIDE1;
        case r'INSERTION_1': return TemplateResponseColumnsEnum.iNSERTION1;
        case r'IMPRESSION_1_GROSS': return TemplateResponseColumnsEnum.iMPRESSION1GROSS;
        case r'CLICKTHROUGH_1_GROSS': return TemplateResponseColumnsEnum.cLICKTHROUGH1GROSS;
        case r'OUTBOUND_CLICK_1': return TemplateResponseColumnsEnum.oUTBOUNDCLICK1;
        case r'CLICKTHROUGH_USER_1': return TemplateResponseColumnsEnum.cLICKTHROUGHUSER1;
        case r'REPIN_USER_1': return TemplateResponseColumnsEnum.rEPINUSER1;
        case r'IMPRESSION_USER_1': return TemplateResponseColumnsEnum.iMPRESSIONUSER1;
        case r'LIKE_USER_1': return TemplateResponseColumnsEnum.lIKEUSER1;
        case r'SEND_USER_1': return TemplateResponseColumnsEnum.sENDUSER1;
        case r'FLAG_USER_1': return TemplateResponseColumnsEnum.fLAGUSER1;
        case r'HIDE_USER_1': return TemplateResponseColumnsEnum.hIDEUSER1;
        case r'INSERTION_USER_1': return TemplateResponseColumnsEnum.iNSERTIONUSER1;
        case r'CLICKTHROUGH_2': return TemplateResponseColumnsEnum.cLICKTHROUGH2;
        case r'REPIN_2': return TemplateResponseColumnsEnum.rEPIN2;
        case r'IMPRESSION_2': return TemplateResponseColumnsEnum.iMPRESSION2;
        case r'LIKE_2': return TemplateResponseColumnsEnum.lIKE2;
        case r'SEND_2': return TemplateResponseColumnsEnum.sEND2;
        case r'FLAG_2': return TemplateResponseColumnsEnum.fLAG2;
        case r'OUTBOUND_CLICK_2': return TemplateResponseColumnsEnum.oUTBOUNDCLICK2;
        case r'CLICKTHROUGH_USER_2': return TemplateResponseColumnsEnum.cLICKTHROUGHUSER2;
        case r'REPIN_USER_2': return TemplateResponseColumnsEnum.rEPINUSER2;
        case r'IMPRESSION_USER_2': return TemplateResponseColumnsEnum.iMPRESSIONUSER2;
        case r'LIKE_USER_2': return TemplateResponseColumnsEnum.lIKEUSER2;
        case r'SEND_USER_2': return TemplateResponseColumnsEnum.sENDUSER2;
        case r'FLAG_USER_2': return TemplateResponseColumnsEnum.fLAGUSER2;
        case r'TOTAL_CLICKTHROUGH': return TemplateResponseColumnsEnum.TOTAL_CLICKTHROUGH;
        case r'TOTAL_REPIN': return TemplateResponseColumnsEnum.TOTAL_REPIN;
        case r'TOTAL_IMPRESSION': return TemplateResponseColumnsEnum.TOTAL_IMPRESSION;
        case r'TOTAL_LIKE': return TemplateResponseColumnsEnum.TOTAL_LIKE;
        case r'TOTAL_SEND': return TemplateResponseColumnsEnum.TOTAL_SEND;
        case r'TOTAL_FLAG': return TemplateResponseColumnsEnum.TOTAL_FLAG;
        case r'TOTAL_IMPRESSION_USER': return TemplateResponseColumnsEnum.TOTAL_IMPRESSION_USER;
        case r'TOTAL_IMPRESSION_USER_HLL': return TemplateResponseColumnsEnum.TOTAL_IMPRESSION_USER_HLL;
        case r'TOTAL_IMPRESSION_FREQUENCY': return TemplateResponseColumnsEnum.TOTAL_IMPRESSION_FREQUENCY;
        case r'TOTAL_IMPRESSION_FREQUENCY_HLL': return TemplateResponseColumnsEnum.TOTAL_IMPRESSION_FREQUENCY_HLL;
        case r'TOTAL_OUTBOUND_CLICK': return TemplateResponseColumnsEnum.TOTAL_OUTBOUND_CLICK;
        case r'COST_PER_OUTBOUND_CLICK_IN_DOLLAR': return TemplateResponseColumnsEnum.COST_PER_OUTBOUND_CLICK_IN_DOLLAR;
        case r'COST_PER_OUTBOUND_CLICK_IN_DOLLAR_1': return TemplateResponseColumnsEnum.cOSTPEROUTBOUNDCLICKINDOLLAR1;
        case r'ENGAGEMENT_PAGE_VISIT_1': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISIT1;
        case r'ENGAGEMENT_SIGNUP_1': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUP1;
        case r'ENGAGEMENT_CHECKOUT_1': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUT1;
        case r'ENGAGEMENT_CUSTOM_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOM1;
        case r'ENGAGEMENT_ADD_TO_CART_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCART1;
        case r'ENGAGEMENT_LEAD_1': return TemplateResponseColumnsEnum.eNGAGEMENTLEAD1;
        case r'ENGAGEMENT_SEARCH_1': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCH1;
        case r'ENGAGEMENT_WATCH_VIDEO_1': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEO1;
        case r'ENGAGEMENT_VIEW_CATEGORY_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORY1;
        case r'ENGAGEMENT_APP_INSTALL_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALL1;
        case r'ENGAGEMENT_UNKNOWN_1': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWN1;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFO1;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLIST1;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_1': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUT1;
        case r'ENGAGEMENT_SUBSCRIBE_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBE1;
        case r'ENGAGEMENT_VIEW_CONTENT_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENT1;
        case r'CLICK_PAGE_VISIT_1': return TemplateResponseColumnsEnum.cLICKPAGEVISIT1;
        case r'CLICK_SIGNUP_1': return TemplateResponseColumnsEnum.cLICKSIGNUP1;
        case r'CLICK_CHECKOUT_1': return TemplateResponseColumnsEnum.cLICKCHECKOUT1;
        case r'CLICK_CUSTOM_1': return TemplateResponseColumnsEnum.cLICKCUSTOM1;
        case r'CLICK_ADD_TO_CART_1': return TemplateResponseColumnsEnum.cLICKADDTOCART1;
        case r'CLICK_LEAD_1': return TemplateResponseColumnsEnum.cLICKLEAD1;
        case r'CLICK_SEARCH_1': return TemplateResponseColumnsEnum.cLICKSEARCH1;
        case r'CLICK_WATCH_VIDEO_1': return TemplateResponseColumnsEnum.cLICKWATCHVIDEO1;
        case r'CLICK_VIEW_CATEGORY_1': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORY1;
        case r'CLICK_APP_INSTALL_1': return TemplateResponseColumnsEnum.cLICKAPPINSTALL1;
        case r'CLICK_UNKNOWN_1': return TemplateResponseColumnsEnum.cLICKUNKNOWN1;
        case r'CLICK_ADD_PAYMENT_INFO_1': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFO1;
        case r'CLICK_ADD_TO_WISHLIST_1': return TemplateResponseColumnsEnum.cLICKADDTOWISHLIST1;
        case r'CLICK_INITIATE_CHECKOUT_1': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUT1;
        case r'CLICK_SUBSCRIBE_1': return TemplateResponseColumnsEnum.cLICKSUBSCRIBE1;
        case r'CLICK_VIEW_CONTENT_1': return TemplateResponseColumnsEnum.cLICKVIEWCONTENT1;
        case r'VIEW_PAGE_VISIT_1': return TemplateResponseColumnsEnum.vIEWPAGEVISIT1;
        case r'VIEW_SIGNUP_1': return TemplateResponseColumnsEnum.vIEWSIGNUP1;
        case r'VIEW_CHECKOUT_1': return TemplateResponseColumnsEnum.vIEWCHECKOUT1;
        case r'VIEW_CUSTOM_1': return TemplateResponseColumnsEnum.vIEWCUSTOM1;
        case r'VIEW_ADD_TO_CART_1': return TemplateResponseColumnsEnum.vIEWADDTOCART1;
        case r'VIEW_LEAD_1': return TemplateResponseColumnsEnum.vIEWLEAD1;
        case r'VIEW_SEARCH_1': return TemplateResponseColumnsEnum.vIEWSEARCH1;
        case r'VIEW_WATCH_VIDEO_1': return TemplateResponseColumnsEnum.vIEWWATCHVIDEO1;
        case r'VIEW_VIEW_CATEGORY_1': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORY1;
        case r'VIEW_APP_INSTALL_1': return TemplateResponseColumnsEnum.vIEWAPPINSTALL1;
        case r'VIEW_UNKNOWN_1': return TemplateResponseColumnsEnum.vIEWUNKNOWN1;
        case r'VIEW_ADD_PAYMENT_INFO_1': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFO1;
        case r'VIEW_ADD_TO_WISHLIST_1': return TemplateResponseColumnsEnum.vIEWADDTOWISHLIST1;
        case r'VIEW_INITIATE_CHECKOUT_1': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUT1;
        case r'VIEW_SUBSCRIBE_1': return TemplateResponseColumnsEnum.vIEWSUBSCRIBE1;
        case r'VIEW_VIEW_CONTENT_1': return TemplateResponseColumnsEnum.vIEWVIEWCONTENT1;
        case r'CONVERSIONS_1': return TemplateResponseColumnsEnum.cONVERSIONS1;
        case r'ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUPVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTLEADVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCHVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR1;
        case r'CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKPAGEVISITVALUEINMICRODOLLAR1;
        case r'CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSIGNUPVALUEINMICRODOLLAR1;
        case r'CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKCHECKOUTVALUEINMICRODOLLAR1;
        case r'CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKCUSTOMVALUEINMICRODOLLAR1;
        case r'CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKADDTOCARTVALUEINMICRODOLLAR1;
        case r'CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKLEADVALUEINMICRODOLLAR1;
        case r'CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSEARCHVALUEINMICRODOLLAR1;
        case r'CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKWATCHVIDEOVALUEINMICRODOLLAR1;
        case r'CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORYVALUEINMICRODOLLAR1;
        case r'CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKAPPINSTALLVALUEINMICRODOLLAR1;
        case r'CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKUNKNOWNVALUEINMICRODOLLAR1;
        case r'CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFOVALUEINMICRODOLLAR1;
        case r'CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKADDTOWISHLISTVALUEINMICRODOLLAR1;
        case r'CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUTVALUEINMICRODOLLAR1;
        case r'CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSUBSCRIBEVALUEINMICRODOLLAR1;
        case r'CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKVIEWCONTENTVALUEINMICRODOLLAR1;
        case r'VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWPAGEVISITVALUEINMICRODOLLAR1;
        case r'VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSIGNUPVALUEINMICRODOLLAR1;
        case r'VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWCHECKOUTVALUEINMICRODOLLAR1;
        case r'VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWCUSTOMVALUEINMICRODOLLAR1;
        case r'VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWADDTOCARTVALUEINMICRODOLLAR1;
        case r'VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWLEADVALUEINMICRODOLLAR1;
        case r'VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSEARCHVALUEINMICRODOLLAR1;
        case r'VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWWATCHVIDEOVALUEINMICRODOLLAR1;
        case r'VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORYVALUEINMICRODOLLAR1;
        case r'VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWAPPINSTALLVALUEINMICRODOLLAR1;
        case r'VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWUNKNOWNVALUEINMICRODOLLAR1;
        case r'VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFOVALUEINMICRODOLLAR1;
        case r'VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWADDTOWISHLISTVALUEINMICRODOLLAR1;
        case r'VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUTVALUEINMICRODOLLAR1;
        case r'VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSUBSCRIBEVALUEINMICRODOLLAR1;
        case r'VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWVIEWCONTENTVALUEINMICRODOLLAR1;
        case r'CONVERSIONS_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cONVERSIONSVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_PAGE_VISIT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISITQUANTITY1;
        case r'ENGAGEMENT_SIGNUP_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUPQUANTITY1;
        case r'ENGAGEMENT_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUTQUANTITY1;
        case r'ENGAGEMENT_CUSTOM_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMQUANTITY1;
        case r'ENGAGEMENT_ADD_TO_CART_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCARTQUANTITY1;
        case r'ENGAGEMENT_LEAD_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTLEADQUANTITY1;
        case r'ENGAGEMENT_SEARCH_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCHQUANTITY1;
        case r'ENGAGEMENT_WATCH_VIDEO_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEOQUANTITY1;
        case r'ENGAGEMENT_VIEW_CATEGORY_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORYQUANTITY1;
        case r'ENGAGEMENT_APP_INSTALL_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALLQUANTITY1;
        case r'ENGAGEMENT_UNKNOWN_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWNQUANTITY1;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFOQUANTITY1;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLISTQUANTITY1;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUTQUANTITY1;
        case r'ENGAGEMENT_SUBSCRIBE_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBEQUANTITY1;
        case r'ENGAGEMENT_VIEW_CONTENT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENTQUANTITY1;
        case r'CLICK_PAGE_VISIT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKPAGEVISITQUANTITY1;
        case r'CLICK_SIGNUP_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSIGNUPQUANTITY1;
        case r'CLICK_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKCHECKOUTQUANTITY1;
        case r'CLICK_CUSTOM_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKCUSTOMQUANTITY1;
        case r'CLICK_ADD_TO_CART_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKADDTOCARTQUANTITY1;
        case r'CLICK_LEAD_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKLEADQUANTITY1;
        case r'CLICK_SEARCH_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSEARCHQUANTITY1;
        case r'CLICK_WATCH_VIDEO_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKWATCHVIDEOQUANTITY1;
        case r'CLICK_VIEW_CATEGORY_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORYQUANTITY1;
        case r'CLICK_APP_INSTALL_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKAPPINSTALLQUANTITY1;
        case r'CLICK_UNKNOWN_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKUNKNOWNQUANTITY1;
        case r'CLICK_ADD_PAYMENT_INFO_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFOQUANTITY1;
        case r'CLICK_ADD_TO_WISHLIST_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKADDTOWISHLISTQUANTITY1;
        case r'CLICK_INITIATE_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUTQUANTITY1;
        case r'CLICK_SUBSCRIBE_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSUBSCRIBEQUANTITY1;
        case r'CLICK_VIEW_CONTENT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKVIEWCONTENTQUANTITY1;
        case r'VIEW_PAGE_VISIT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWPAGEVISITQUANTITY1;
        case r'VIEW_SIGNUP_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSIGNUPQUANTITY1;
        case r'VIEW_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWCHECKOUTQUANTITY1;
        case r'VIEW_CUSTOM_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWCUSTOMQUANTITY1;
        case r'VIEW_ADD_TO_CART_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWADDTOCARTQUANTITY1;
        case r'VIEW_LEAD_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWLEADQUANTITY1;
        case r'VIEW_SEARCH_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSEARCHQUANTITY1;
        case r'VIEW_WATCH_VIDEO_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWWATCHVIDEOQUANTITY1;
        case r'VIEW_VIEW_CATEGORY_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORYQUANTITY1;
        case r'VIEW_APP_INSTALL_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWAPPINSTALLQUANTITY1;
        case r'VIEW_UNKNOWN_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWUNKNOWNQUANTITY1;
        case r'VIEW_ADD_PAYMENT_INFO_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFOQUANTITY1;
        case r'VIEW_ADD_TO_WISHLIST_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWADDTOWISHLISTQUANTITY1;
        case r'VIEW_INITIATE_CHECKOUT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUTQUANTITY1;
        case r'VIEW_SUBSCRIBE_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSUBSCRIBEQUANTITY1;
        case r'VIEW_VIEW_CONTENT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWVIEWCONTENTQUANTITY1;
        case r'CONVERSIONS_QUANTITY_1': return TemplateResponseColumnsEnum.cONVERSIONSQUANTITY1;
        case r'ENGAGEMENT_PAGE_VISIT_2': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISIT2;
        case r'ENGAGEMENT_SIGNUP_2': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUP2;
        case r'ENGAGEMENT_CHECKOUT_2': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUT2;
        case r'ENGAGEMENT_CUSTOM_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOM2;
        case r'ENGAGEMENT_ADD_TO_CART_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCART2;
        case r'ENGAGEMENT_LEAD_2': return TemplateResponseColumnsEnum.eNGAGEMENTLEAD2;
        case r'ENGAGEMENT_SEARCH_2': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCH2;
        case r'ENGAGEMENT_WATCH_VIDEO_2': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEO2;
        case r'ENGAGEMENT_VIEW_CATEGORY_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORY2;
        case r'ENGAGEMENT_APP_INSTALL_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALL2;
        case r'ENGAGEMENT_UNKNOWN_2': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWN2;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFO2;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLIST2;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_2': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUT2;
        case r'ENGAGEMENT_SUBSCRIBE_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBE2;
        case r'ENGAGEMENT_VIEW_CONTENT_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENT2;
        case r'CLICK_PAGE_VISIT_2': return TemplateResponseColumnsEnum.cLICKPAGEVISIT2;
        case r'CLICK_SIGNUP_2': return TemplateResponseColumnsEnum.cLICKSIGNUP2;
        case r'CLICK_CHECKOUT_2': return TemplateResponseColumnsEnum.cLICKCHECKOUT2;
        case r'CLICK_CUSTOM_2': return TemplateResponseColumnsEnum.cLICKCUSTOM2;
        case r'CLICK_ADD_TO_CART_2': return TemplateResponseColumnsEnum.cLICKADDTOCART2;
        case r'CLICK_LEAD_2': return TemplateResponseColumnsEnum.cLICKLEAD2;
        case r'CLICK_SEARCH_2': return TemplateResponseColumnsEnum.cLICKSEARCH2;
        case r'CLICK_WATCH_VIDEO_2': return TemplateResponseColumnsEnum.cLICKWATCHVIDEO2;
        case r'CLICK_VIEW_CATEGORY_2': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORY2;
        case r'CLICK_APP_INSTALL_2': return TemplateResponseColumnsEnum.cLICKAPPINSTALL2;
        case r'CLICK_UNKNOWN_2': return TemplateResponseColumnsEnum.cLICKUNKNOWN2;
        case r'CLICK_ADD_PAYMENT_INFO_2': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFO2;
        case r'CLICK_ADD_TO_WISHLIST_2': return TemplateResponseColumnsEnum.cLICKADDTOWISHLIST2;
        case r'CLICK_INITIATE_CHECKOUT_2': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUT2;
        case r'CLICK_SUBSCRIBE_2': return TemplateResponseColumnsEnum.cLICKSUBSCRIBE2;
        case r'CLICK_VIEW_CONTENT_2': return TemplateResponseColumnsEnum.cLICKVIEWCONTENT2;
        case r'VIEW_PAGE_VISIT_2': return TemplateResponseColumnsEnum.vIEWPAGEVISIT2;
        case r'VIEW_SIGNUP_2': return TemplateResponseColumnsEnum.vIEWSIGNUP2;
        case r'VIEW_CHECKOUT_2': return TemplateResponseColumnsEnum.vIEWCHECKOUT2;
        case r'VIEW_CUSTOM_2': return TemplateResponseColumnsEnum.vIEWCUSTOM2;
        case r'VIEW_ADD_TO_CART_2': return TemplateResponseColumnsEnum.vIEWADDTOCART2;
        case r'VIEW_LEAD_2': return TemplateResponseColumnsEnum.vIEWLEAD2;
        case r'VIEW_SEARCH_2': return TemplateResponseColumnsEnum.vIEWSEARCH2;
        case r'VIEW_WATCH_VIDEO_2': return TemplateResponseColumnsEnum.vIEWWATCHVIDEO2;
        case r'VIEW_VIEW_CATEGORY_2': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORY2;
        case r'VIEW_APP_INSTALL_2': return TemplateResponseColumnsEnum.vIEWAPPINSTALL2;
        case r'VIEW_UNKNOWN_2': return TemplateResponseColumnsEnum.vIEWUNKNOWN2;
        case r'VIEW_ADD_PAYMENT_INFO_2': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFO2;
        case r'VIEW_ADD_TO_WISHLIST_2': return TemplateResponseColumnsEnum.vIEWADDTOWISHLIST2;
        case r'VIEW_INITIATE_CHECKOUT_2': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUT2;
        case r'VIEW_SUBSCRIBE_2': return TemplateResponseColumnsEnum.vIEWSUBSCRIBE2;
        case r'VIEW_VIEW_CONTENT_2': return TemplateResponseColumnsEnum.vIEWVIEWCONTENT2;
        case r'CONVERSIONS_2': return TemplateResponseColumnsEnum.cONVERSIONS2;
        case r'ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISITVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUPVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCARTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTLEADVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCHVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEOVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORYVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALLVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWNVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFOVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLISTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBEVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENTVALUEINMICRODOLLAR2;
        case r'CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKPAGEVISITVALUEINMICRODOLLAR2;
        case r'CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSIGNUPVALUEINMICRODOLLAR2;
        case r'CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKCHECKOUTVALUEINMICRODOLLAR2;
        case r'CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKCUSTOMVALUEINMICRODOLLAR2;
        case r'CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKADDTOCARTVALUEINMICRODOLLAR2;
        case r'CLICK_LEAD_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKLEADVALUEINMICRODOLLAR2;
        case r'CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSEARCHVALUEINMICRODOLLAR2;
        case r'CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKWATCHVIDEOVALUEINMICRODOLLAR2;
        case r'CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORYVALUEINMICRODOLLAR2;
        case r'CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKAPPINSTALLVALUEINMICRODOLLAR2;
        case r'CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKUNKNOWNVALUEINMICRODOLLAR2;
        case r'CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFOVALUEINMICRODOLLAR2;
        case r'CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKADDTOWISHLISTVALUEINMICRODOLLAR2;
        case r'CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUTVALUEINMICRODOLLAR2;
        case r'CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSUBSCRIBEVALUEINMICRODOLLAR2;
        case r'CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKVIEWCONTENTVALUEINMICRODOLLAR2;
        case r'VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWPAGEVISITVALUEINMICRODOLLAR2;
        case r'VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSIGNUPVALUEINMICRODOLLAR2;
        case r'VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWCHECKOUTVALUEINMICRODOLLAR2;
        case r'VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWCUSTOMVALUEINMICRODOLLAR2;
        case r'VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWADDTOCARTVALUEINMICRODOLLAR2;
        case r'VIEW_LEAD_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWLEADVALUEINMICRODOLLAR2;
        case r'VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSEARCHVALUEINMICRODOLLAR2;
        case r'VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWWATCHVIDEOVALUEINMICRODOLLAR2;
        case r'VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORYVALUEINMICRODOLLAR2;
        case r'VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWAPPINSTALLVALUEINMICRODOLLAR2;
        case r'VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWUNKNOWNVALUEINMICRODOLLAR2;
        case r'VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFOVALUEINMICRODOLLAR2;
        case r'VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWADDTOWISHLISTVALUEINMICRODOLLAR2;
        case r'VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUTVALUEINMICRODOLLAR2;
        case r'VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSUBSCRIBEVALUEINMICRODOLLAR2;
        case r'VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWVIEWCONTENTVALUEINMICRODOLLAR2;
        case r'CONVERSIONS_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cONVERSIONSVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_PAGE_VISIT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTPAGEVISITQUANTITY2;
        case r'ENGAGEMENT_SIGNUP_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSIGNUPQUANTITY2;
        case r'ENGAGEMENT_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTCHECKOUTQUANTITY2;
        case r'ENGAGEMENT_CUSTOM_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMQUANTITY2;
        case r'ENGAGEMENT_ADD_TO_CART_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOCARTQUANTITY2;
        case r'ENGAGEMENT_LEAD_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTLEADQUANTITY2;
        case r'ENGAGEMENT_SEARCH_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSEARCHQUANTITY2;
        case r'ENGAGEMENT_WATCH_VIDEO_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTWATCHVIDEOQUANTITY2;
        case r'ENGAGEMENT_VIEW_CATEGORY_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCATEGORYQUANTITY2;
        case r'ENGAGEMENT_APP_INSTALL_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPINSTALLQUANTITY2;
        case r'ENGAGEMENT_UNKNOWN_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTUNKNOWNQUANTITY2;
        case r'ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDPAYMENTINFOQUANTITY2;
        case r'ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTADDTOWISHLISTQUANTITY2;
        case r'ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTINITIATECHECKOUTQUANTITY2;
        case r'ENGAGEMENT_SUBSCRIBE_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBSCRIBEQUANTITY2;
        case r'ENGAGEMENT_VIEW_CONTENT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTVIEWCONTENTQUANTITY2;
        case r'CLICK_PAGE_VISIT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKPAGEVISITQUANTITY2;
        case r'CLICK_SIGNUP_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSIGNUPQUANTITY2;
        case r'CLICK_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKCHECKOUTQUANTITY2;
        case r'CLICK_CUSTOM_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKCUSTOMQUANTITY2;
        case r'CLICK_ADD_TO_CART_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKADDTOCARTQUANTITY2;
        case r'CLICK_LEAD_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKLEADQUANTITY2;
        case r'CLICK_SEARCH_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSEARCHQUANTITY2;
        case r'CLICK_WATCH_VIDEO_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKWATCHVIDEOQUANTITY2;
        case r'CLICK_VIEW_CATEGORY_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKVIEWCATEGORYQUANTITY2;
        case r'CLICK_APP_INSTALL_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKAPPINSTALLQUANTITY2;
        case r'CLICK_UNKNOWN_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKUNKNOWNQUANTITY2;
        case r'CLICK_ADD_PAYMENT_INFO_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKADDPAYMENTINFOQUANTITY2;
        case r'CLICK_ADD_TO_WISHLIST_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKADDTOWISHLISTQUANTITY2;
        case r'CLICK_INITIATE_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKINITIATECHECKOUTQUANTITY2;
        case r'CLICK_SUBSCRIBE_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSUBSCRIBEQUANTITY2;
        case r'CLICK_VIEW_CONTENT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKVIEWCONTENTQUANTITY2;
        case r'VIEW_PAGE_VISIT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWPAGEVISITQUANTITY2;
        case r'VIEW_SIGNUP_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSIGNUPQUANTITY2;
        case r'VIEW_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWCHECKOUTQUANTITY2;
        case r'VIEW_CUSTOM_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWCUSTOMQUANTITY2;
        case r'VIEW_ADD_TO_CART_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWADDTOCARTQUANTITY2;
        case r'VIEW_LEAD_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWLEADQUANTITY2;
        case r'VIEW_SEARCH_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSEARCHQUANTITY2;
        case r'VIEW_WATCH_VIDEO_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWWATCHVIDEOQUANTITY2;
        case r'VIEW_VIEW_CATEGORY_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWVIEWCATEGORYQUANTITY2;
        case r'VIEW_APP_INSTALL_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWAPPINSTALLQUANTITY2;
        case r'VIEW_UNKNOWN_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWUNKNOWNQUANTITY2;
        case r'VIEW_ADD_PAYMENT_INFO_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWADDPAYMENTINFOQUANTITY2;
        case r'VIEW_ADD_TO_WISHLIST_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWADDTOWISHLISTQUANTITY2;
        case r'VIEW_INITIATE_CHECKOUT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWINITIATECHECKOUTQUANTITY2;
        case r'VIEW_SUBSCRIBE_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSUBSCRIBEQUANTITY2;
        case r'VIEW_VIEW_CONTENT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWVIEWCONTENTQUANTITY2;
        case r'CONVERSIONS_QUANTITY_2': return TemplateResponseColumnsEnum.cONVERSIONSQUANTITY2;
        case r'TOTAL_ENGAGEMENT_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_PAGE_VISIT;
        case r'TOTAL_ENGAGEMENT_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SIGNUP;
        case r'TOTAL_ENGAGEMENT_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CHECKOUT;
        case r'TOTAL_ENGAGEMENT_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOM;
        case r'TOTAL_ENGAGEMENT_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_CART;
        case r'TOTAL_ENGAGEMENT_LEAD': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_LEAD;
        case r'TOTAL_ENGAGEMENT_SEARCH': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SEARCH;
        case r'TOTAL_ENGAGEMENT_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_WATCH_VIDEO;
        case r'TOTAL_ENGAGEMENT_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CATEGORY;
        case r'TOTAL_ENGAGEMENT_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_INSTALL;
        case r'TOTAL_ENGAGEMENT_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_UNKNOWN;
        case r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO;
        case r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_WISHLIST;
        case r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_INITIATE_CHECKOUT;
        case r'TOTAL_ENGAGEMENT_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBSCRIBE;
        case r'TOTAL_ENGAGEMENT_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CONTENT;
        case r'TOTAL_CLICK_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_CLICK_PAGE_VISIT;
        case r'TOTAL_CLICK_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_CLICK_SIGNUP;
        case r'TOTAL_CLICK_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_CLICK_CHECKOUT;
        case r'TOTAL_CLICK_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOM;
        case r'TOTAL_CLICK_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_CART;
        case r'TOTAL_CLICK_LEAD': return TemplateResponseColumnsEnum.TOTAL_CLICK_LEAD;
        case r'TOTAL_CLICK_SEARCH': return TemplateResponseColumnsEnum.TOTAL_CLICK_SEARCH;
        case r'TOTAL_CLICK_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_CLICK_WATCH_VIDEO;
        case r'TOTAL_CLICK_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CATEGORY;
        case r'TOTAL_CLICK_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_INSTALL;
        case r'TOTAL_CLICK_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_CLICK_UNKNOWN;
        case r'TOTAL_CLICK_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_PAYMENT_INFO;
        case r'TOTAL_CLICK_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_WISHLIST;
        case r'TOTAL_CLICK_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_CLICK_INITIATE_CHECKOUT;
        case r'TOTAL_CLICK_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBSCRIBE;
        case r'TOTAL_CLICK_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CONTENT;
        case r'TOTAL_VIEW_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_VIEW_PAGE_VISIT;
        case r'TOTAL_VIEW_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_VIEW_SIGNUP;
        case r'TOTAL_VIEW_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_VIEW_CHECKOUT;
        case r'TOTAL_VIEW_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOM;
        case r'TOTAL_VIEW_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_CART;
        case r'TOTAL_VIEW_LEAD': return TemplateResponseColumnsEnum.TOTAL_VIEW_LEAD;
        case r'TOTAL_VIEW_SEARCH': return TemplateResponseColumnsEnum.TOTAL_VIEW_SEARCH;
        case r'TOTAL_VIEW_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_VIEW_WATCH_VIDEO;
        case r'TOTAL_VIEW_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CATEGORY;
        case r'TOTAL_VIEW_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_INSTALL;
        case r'TOTAL_VIEW_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_VIEW_UNKNOWN;
        case r'TOTAL_VIEW_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_PAYMENT_INFO;
        case r'TOTAL_VIEW_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_WISHLIST;
        case r'TOTAL_VIEW_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_VIEW_INITIATE_CHECKOUT;
        case r'TOTAL_VIEW_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBSCRIBE;
        case r'TOTAL_VIEW_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CONTENT;
        case r'TOTAL_CONVERSIONS': return TemplateResponseColumnsEnum.TOTAL_CONVERSIONS;
        case r'TOTAL_WEB_CONVERSIONS': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSIONS;
        case r'TOTAL_INAPP_CONVERSIONS': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSIONS;
        case r'TOTAL_OFFLINE_CONVERSIONS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSIONS;
        case r'TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CONVERSIONS_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CONVERSIONS_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CONVERSIONS_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_PAGE_VISIT_QUANTITY;
        case r'TOTAL_ENGAGEMENT_SIGNUP_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SIGNUP_QUANTITY;
        case r'TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CHECKOUT_QUANTITY;
        case r'TOTAL_ENGAGEMENT_CUSTOM_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOM_QUANTITY;
        case r'TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_CART_QUANTITY;
        case r'TOTAL_ENGAGEMENT_LEAD_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_LEAD_QUANTITY;
        case r'TOTAL_ENGAGEMENT_SEARCH_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SEARCH_QUANTITY;
        case r'TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_WATCH_VIDEO_QUANTITY;
        case r'TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CATEGORY_QUANTITY;
        case r'TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_INSTALL_QUANTITY;
        case r'TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_UNKNOWN_QUANTITY;
        case r'TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_PAYMENT_INFO_QUANTITY;
        case r'TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_ADD_TO_WISHLIST_QUANTITY;
        case r'TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_INITIATE_CHECKOUT_QUANTITY;
        case r'TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBSCRIBE_QUANTITY;
        case r'TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_VIEW_CONTENT_QUANTITY;
        case r'TOTAL_CLICK_PAGE_VISIT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_PAGE_VISIT_QUANTITY;
        case r'TOTAL_CLICK_SIGNUP_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_SIGNUP_QUANTITY;
        case r'TOTAL_CLICK_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_CHECKOUT_QUANTITY;
        case r'TOTAL_CLICK_CUSTOM_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOM_QUANTITY;
        case r'TOTAL_CLICK_ADD_TO_CART_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_CART_QUANTITY;
        case r'TOTAL_CLICK_LEAD_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_LEAD_QUANTITY;
        case r'TOTAL_CLICK_SEARCH_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_SEARCH_QUANTITY;
        case r'TOTAL_CLICK_WATCH_VIDEO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_WATCH_VIDEO_QUANTITY;
        case r'TOTAL_CLICK_VIEW_CATEGORY_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CATEGORY_QUANTITY;
        case r'TOTAL_CLICK_APP_INSTALL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_INSTALL_QUANTITY;
        case r'TOTAL_CLICK_UNKNOWN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_UNKNOWN_QUANTITY;
        case r'TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_PAYMENT_INFO_QUANTITY;
        case r'TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_ADD_TO_WISHLIST_QUANTITY;
        case r'TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_INITIATE_CHECKOUT_QUANTITY;
        case r'TOTAL_CLICK_SUBSCRIBE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBSCRIBE_QUANTITY;
        case r'TOTAL_CLICK_VIEW_CONTENT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_VIEW_CONTENT_QUANTITY;
        case r'TOTAL_VIEW_PAGE_VISIT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_PAGE_VISIT_QUANTITY;
        case r'TOTAL_VIEW_SIGNUP_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_SIGNUP_QUANTITY;
        case r'TOTAL_VIEW_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CHECKOUT_QUANTITY;
        case r'TOTAL_VIEW_CUSTOM_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOM_QUANTITY;
        case r'TOTAL_VIEW_ADD_TO_CART_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_CART_QUANTITY;
        case r'TOTAL_VIEW_LEAD_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_LEAD_QUANTITY;
        case r'TOTAL_VIEW_SEARCH_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_SEARCH_QUANTITY;
        case r'TOTAL_VIEW_WATCH_VIDEO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_WATCH_VIDEO_QUANTITY;
        case r'TOTAL_VIEW_VIEW_CATEGORY_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CATEGORY_QUANTITY;
        case r'TOTAL_VIEW_APP_INSTALL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_INSTALL_QUANTITY;
        case r'TOTAL_VIEW_UNKNOWN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_UNKNOWN_QUANTITY;
        case r'TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_PAYMENT_INFO_QUANTITY;
        case r'TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_ADD_TO_WISHLIST_QUANTITY;
        case r'TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_INITIATE_CHECKOUT_QUANTITY;
        case r'TOTAL_VIEW_SUBSCRIBE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBSCRIBE_QUANTITY;
        case r'TOTAL_VIEW_VIEW_CONTENT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_VIEW_CONTENT_QUANTITY;
        case r'TOTAL_CONVERSIONS_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CONVERSIONS_QUANTITY;
        case r'COST_PER_CONVERSION_IN_DOLLAR': return TemplateResponseColumnsEnum.COST_PER_CONVERSION_IN_DOLLAR;
        case r'TOTAL_WEB_SESSIONS': return TemplateResponseColumnsEnum.TOTAL_WEB_SESSIONS;
        case r'WEB_SESSIONS_1': return TemplateResponseColumnsEnum.wEBSESSIONS1;
        case r'WEB_SESSIONS_2': return TemplateResponseColumnsEnum.wEBSESSIONS2;
        case r'APP_INSTALLS_CPA_BILLABLE': return TemplateResponseColumnsEnum.APP_INSTALLS_CPA_BILLABLE;
        case r'APP_INSTALLS_CLICK': return TemplateResponseColumnsEnum.APP_INSTALLS_CLICK;
        case r'APP_INSTALLS_CLOSEUPREPIN': return TemplateResponseColumnsEnum.APP_INSTALLS_CLOSEUPREPIN;
        case r'APP_INSTALLS_VIEW': return TemplateResponseColumnsEnum.APP_INSTALLS_VIEW;
        case r'APP_INSTALLS': return TemplateResponseColumnsEnum.APP_INSTALLS;
        case r'APP_INSTALLS_ENGAGEMENT': return TemplateResponseColumnsEnum.APP_INSTALLS_ENGAGEMENT;
        case r'APP_INSTALLS_CLICK_1': return TemplateResponseColumnsEnum.aPPINSTALLSCLICK1;
        case r'APP_INSTALLS_CLICK_2': return TemplateResponseColumnsEnum.aPPINSTALLSCLICK2;
        case r'APP_INSTALLS_VIEW_1': return TemplateResponseColumnsEnum.aPPINSTALLSVIEW1;
        case r'APP_INSTALLS_VIEW_2': return TemplateResponseColumnsEnum.aPPINSTALLSVIEW2;
        case r'APP_INSTALLS_ENGAGEMENT_1': return TemplateResponseColumnsEnum.aPPINSTALLSENGAGEMENT1;
        case r'APP_INSTALLS_ENGAGEMENT_2': return TemplateResponseColumnsEnum.aPPINSTALLSENGAGEMENT2;
        case r'APP_INSTALLS_1': return TemplateResponseColumnsEnum.aPPINSTALLS1;
        case r'APP_INSTALLS_2': return TemplateResponseColumnsEnum.aPPINSTALLS2;
        case r'CPI_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPI_IN_MICRO_DOLLAR;
        case r'ECPI_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPI_IN_MICRO_DOLLAR;
        case r'CPI_IN_DOLLAR': return TemplateResponseColumnsEnum.CPI_IN_DOLLAR;
        case r'ECPI_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPI_IN_DOLLAR;
        case r'INAPP_SKAN_APP_INSTALL': return TemplateResponseColumnsEnum.INAPP_SKAN_APP_INSTALL;
        case r'INAPP_SKAN_ASSISTED_APP_INSTALL': return TemplateResponseColumnsEnum.INAPP_SKAN_ASSISTED_APP_INSTALL;
        case r'INAPP_SKAN_APP_INSTALL_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SKAN_APP_INSTALL_COST_PER_ACTION;
        case r'INAPP_SKAN_APP_INSTALL_CONVERSION_RATE': return TemplateResponseColumnsEnum.INAPP_SKAN_APP_INSTALL_CONVERSION_RATE;
        case r'ONSITE_CHECKOUTS_CPA_BILLABLE_1': return TemplateResponseColumnsEnum.oNSITECHECKOUTSCPABILLABLE1;
        case r'ONSITE_CHECKOUTS_CPA_BILLABLE_2': return TemplateResponseColumnsEnum.oNSITECHECKOUTSCPABILLABLE2;
        case r'ONSITE_CHECKOUTS_CPA_BILLABLE': return TemplateResponseColumnsEnum.ONSITE_CHECKOUTS_CPA_BILLABLE;
        case r'ONSITE_CHECKOUTS_VALUE_1': return TemplateResponseColumnsEnum.oNSITECHECKOUTSVALUE1;
        case r'ONSITE_CHECKOUTS_VALUE_2': return TemplateResponseColumnsEnum.oNSITECHECKOUTSVALUE2;
        case r'ONSITE_CHECKOUTS_VALUE': return TemplateResponseColumnsEnum.ONSITE_CHECKOUTS_VALUE;
        case r'ONSITE_CHECKOUTS_1': return TemplateResponseColumnsEnum.oNSITECHECKOUTS1;
        case r'ONSITE_CHECKOUTS_2': return TemplateResponseColumnsEnum.oNSITECHECKOUTS2;
        case r'ONSITE_CHECKOUTS': return TemplateResponseColumnsEnum.ONSITE_CHECKOUTS;
        case r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.oNSITECHECKOUTSVALUEINMICRODOLLAR1;
        case r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.oNSITECHECKOUTSVALUEINMICRODOLLAR2;
        case r'CONVERSION_RATE': return TemplateResponseColumnsEnum.CONVERSION_RATE;
        case r'AVERAGE_CHECKOUT_VALUE': return TemplateResponseColumnsEnum.AVERAGE_CHECKOUT_VALUE;
        case r'RETURN_ON_ADVERTISER_SPEND': return TemplateResponseColumnsEnum.RETURN_ON_ADVERTISER_SPEND;
        case r'BUY_BUTTON_CLICKS_1': return TemplateResponseColumnsEnum.bUYBUTTONCLICKS1;
        case r'BUY_BUTTON_CLICKS_2': return TemplateResponseColumnsEnum.bUYBUTTONCLICKS2;
        case r'TOTAL_BUY_BUTTON_CLICKS': return TemplateResponseColumnsEnum.TOTAL_BUY_BUTTON_CLICKS;
        case r'ORDER_DROPOFF_RATE': return TemplateResponseColumnsEnum.ORDER_DROPOFF_RATE;
        case r'ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ONSITE_CHECKOUTS_VALUE_IN_MICRO_DOLLAR;
        case r'ONSITE_CHECKOUTS_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.ONSITE_CHECKOUTS_VALUE_IN_DOLLAR;
        case r'PIN_PROMOTION_NAME': return TemplateResponseColumnsEnum.PIN_PROMOTION_NAME;
        case r'AD_NAME': return TemplateResponseColumnsEnum.AD_NAME;
        case r'LIFETIME_IMPRESSION_USER_1': return TemplateResponseColumnsEnum.lIFETIMEIMPRESSIONUSER1;
        case r'PIN_PROMOTION_CAMPAIGN_ID': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_ID;
        case r'PIN_PROMOTION_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_NAME;
        case r'PIN_PROMOTION_CAMPAIGN_ACTION_TYPE': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_ACTION_TYPE;
        case r'TOTAL_LIFETIME_IMPRESSION_USER': return TemplateResponseColumnsEnum.TOTAL_LIFETIME_IMPRESSION_USER;
        case r'PIN_PROMOTION_CAMPAIGN_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_STATUS;
        case r'PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_MANAGED_STATUS;
        case r'PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_CAMPAIGN_ENTITY_STATUS;
        case r'PIN_PROMOTION_AD_GROUP_ID': return TemplateResponseColumnsEnum.PIN_PROMOTION_AD_GROUP_ID;
        case r'PIN_PROMOTION_AD_GROUP_NAME': return TemplateResponseColumnsEnum.PIN_PROMOTION_AD_GROUP_NAME;
        case r'PIN_PROMOTION_AD_GROUP_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_AD_GROUP_STATUS;
        case r'PIN_PROMOTION_AD_GROUP_ENTITY_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_AD_GROUP_ENTITY_STATUS;
        case r'PIN_PROMOTION_CREATIVE_TYPE': return TemplateResponseColumnsEnum.PIN_PROMOTION_CREATIVE_TYPE;
        case r'PIN_PROMOTION_ENTITY_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_ENTITY_STATUS;
        case r'PIN_PROMOTION_CREATIVE_TYPE_V2': return TemplateResponseColumnsEnum.pINPROMOTIONCREATIVETYPEV2;
        case r'PIN_PROMOTION_REVIEW_STATUS': return TemplateResponseColumnsEnum.PIN_PROMOTION_REVIEW_STATUS;
        case r'AD_GROUP_CAMPAIGN_ACTION_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_ACTION_TYPE;
        case r'AD_GROUP_CAMPAIGN_ID': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_ID;
        case r'AD_GROUP_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_NAME;
        case r'AD_GROUP_CAMPAIGN_STATUS': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_STATUS;
        case r'AD_GROUP_CREATIVE_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_CREATIVE_TYPE;
        case r'AD_GROUP_CAMPAIGN_MANAGED_STATUS': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_MANAGED_STATUS;
        case r'AD_GROUP_CAMPAIGN_ENTITY_STATUS': return TemplateResponseColumnsEnum.AD_GROUP_CAMPAIGN_ENTITY_STATUS;
        case r'AD_GROUP_START_DATE': return TemplateResponseColumnsEnum.AD_GROUP_START_DATE;
        case r'CAMPAIGN_LIFETIME_SPEND_CAP': return TemplateResponseColumnsEnum.CAMPAIGN_LIFETIME_SPEND_CAP;
        case r'AD_GROUP_BID_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.AD_GROUP_BID_IN_MICRO_CURRENCY;
        case r'CAMPAIGN_AD_GROUP_START_DATE': return TemplateResponseColumnsEnum.CAMPAIGN_AD_GROUP_START_DATE;
        case r'CAMPAIGN_AD_GROUP_END_DATE': return TemplateResponseColumnsEnum.CAMPAIGN_AD_GROUP_END_DATE;
        case r'CAMPAIGN_NUMBER_OF_AD_GROUPS': return TemplateResponseColumnsEnum.CAMPAIGN_NUMBER_OF_AD_GROUPS;
        case r'AD_GROUP_NUMBER_OF_PIN_PROMOTIONS': return TemplateResponseColumnsEnum.AD_GROUP_NUMBER_OF_PIN_PROMOTIONS;
        case r'TODAY_SPEND_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.TODAY_SPEND_IN_LOCAL_CURRENCY;
        case r'TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY': return TemplateResponseColumnsEnum.TOTAL_LIFETIME_SPEND_IN_LOCAL_CURRENCY;
        case r'BUDGET_UTILIZATION': return TemplateResponseColumnsEnum.BUDGET_UTILIZATION;
        case r'AD_GROUP_OPTIMIZATION': return TemplateResponseColumnsEnum.AD_GROUP_OPTIMIZATION;
        case r'INSERTION_ORDER': return TemplateResponseColumnsEnum.INSERTION_ORDER;
        case r'AD_GROUP_BONUS_BUDGET': return TemplateResponseColumnsEnum.AD_GROUP_BONUS_BUDGET;
        case r'FREQUENCY': return TemplateResponseColumnsEnum.FREQUENCY;
        case r'CAMPAIGN_DAILY_SPEND_CAP': return TemplateResponseColumnsEnum.CAMPAIGN_DAILY_SPEND_CAP;
        case r'CAMPAIGN_CREATIVE_TYPE': return TemplateResponseColumnsEnum.CAMPAIGN_CREATIVE_TYPE;
        case r'AD_GROUP_PLACEMENT_GROUP_TYPE': return TemplateResponseColumnsEnum.AD_GROUP_PLACEMENT_GROUP_TYPE;
        case r'AD_GROUP_IS_PREFETCH_ENABLED': return TemplateResponseColumnsEnum.AD_GROUP_IS_PREFETCH_ENABLED;
        case r'CAMPAIGN_BUDGET_OPTIMIZATION': return TemplateResponseColumnsEnum.CAMPAIGN_BUDGET_OPTIMIZATION;
        case r'CAMPAIGN_START_DATE': return TemplateResponseColumnsEnum.CAMPAIGN_START_DATE;
        case r'IS_AUTOMATED_CAMPAIGN': return TemplateResponseColumnsEnum.IS_AUTOMATED_CAMPAIGN;
        case r'IS_PREMIERE_CAMPAIGN': return TemplateResponseColumnsEnum.IS_PREMIERE_CAMPAIGN;
        case r'FLEXIBLE_DAILY_BUDGETS': return TemplateResponseColumnsEnum.FLEXIBLE_DAILY_BUDGETS;
        case r'IS_PERFORMANCE_PLUS_CAMPAIGN': return TemplateResponseColumnsEnum.IS_PERFORMANCE_PLUS_CAMPAIGN;
        case r'IS_DCO_FORMAT_ENHANCMENT': return TemplateResponseColumnsEnum.IS_DCO_FORMAT_ENHANCMENT;
        case r'PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.PAGE_VISIT_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.SIGNUP_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.CHECKOUT_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.CUSTOM_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.ADD_TO_CART_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.LEAD_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.SEARCH_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.WATCH_VIDEO_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.VIEW_CATEGORY_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.APP_INSTALL_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS': return TemplateResponseColumnsEnum.UNKNOWN_PERCENT_CROSS_DEVICE_CONVERSIONS;
        case r'TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_LEAD_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_SEARCH_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_DESKTOP_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_DESKTOP_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_DESKTOP_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_MOBILE_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_MOBILE_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_MOBILE_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_TABLET_ACTION_TO_DESKTOP_CONVERSION;
        case r'TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_TABLET_ACTION_TO_MOBILE_CONVERSION;
        case r'TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_TABLET_ACTION_TO_TABLET_CONVERSION;
        case r'TOTAL_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT;
        case r'TOTAL_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_SIGNUP;
        case r'TOTAL_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT;
        case r'TOTAL_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_CUSTOM;
        case r'TOTAL_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART;
        case r'TOTAL_LEAD': return TemplateResponseColumnsEnum.TOTAL_LEAD;
        case r'TOTAL_SEARCH': return TemplateResponseColumnsEnum.TOTAL_SEARCH;
        case r'TOTAL_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO;
        case r'TOTAL_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY;
        case r'TOTAL_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL;
        case r'TOTAL_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN;
        case r'TOTAL_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO;
        case r'TOTAL_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST;
        case r'TOTAL_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT;
        case r'TOTAL_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE;
        case r'TOTAL_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT;
        case r'TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SIGNUP_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CUSTOM_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_LEAD_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SEARCH_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR;
        case r'AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_LEAD_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SEARCH_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_PAGE_VISIT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_QUANTITY;
        case r'TOTAL_SIGNUP_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_QUANTITY;
        case r'TOTAL_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_QUANTITY;
        case r'TOTAL_CUSTOM_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_QUANTITY;
        case r'TOTAL_ADD_TO_CART_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_QUANTITY;
        case r'TOTAL_LEAD_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_LEAD_QUANTITY;
        case r'TOTAL_SEARCH_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SEARCH_QUANTITY;
        case r'TOTAL_WATCH_VIDEO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_QUANTITY;
        case r'TOTAL_VIEW_CATEGORY_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_QUANTITY;
        case r'TOTAL_APP_INSTALL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_QUANTITY;
        case r'TOTAL_UNKNOWN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_QUANTITY;
        case r'TOTAL_ADD_PAYMENT_INFO_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_QUANTITY;
        case r'TOTAL_ADD_TO_WISHLIST_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_QUANTITY;
        case r'TOTAL_INITIATE_CHECKOUT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_QUANTITY;
        case r'TOTAL_SUBSCRIBE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_QUANTITY;
        case r'TOTAL_VIEW_CONTENT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_QUANTITY;
        case r'TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_APP_INSTALL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_VALUE_IN_DOLLAR;
        case r'TOTAL_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'PAGE_VISIT_COST_PER_ACTION': return TemplateResponseColumnsEnum.PAGE_VISIT_COST_PER_ACTION;
        case r'SIGNUP_COST_PER_ACTION': return TemplateResponseColumnsEnum.SIGNUP_COST_PER_ACTION;
        case r'CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.CHECKOUT_COST_PER_ACTION;
        case r'CUSTOM_COST_PER_ACTION': return TemplateResponseColumnsEnum.CUSTOM_COST_PER_ACTION;
        case r'ADD_TO_CART_COST_PER_ACTION': return TemplateResponseColumnsEnum.ADD_TO_CART_COST_PER_ACTION;
        case r'LEAD_COST_PER_ACTION': return TemplateResponseColumnsEnum.LEAD_COST_PER_ACTION;
        case r'SEARCH_COST_PER_ACTION': return TemplateResponseColumnsEnum.SEARCH_COST_PER_ACTION;
        case r'WATCH_VIDEO_COST_PER_ACTION': return TemplateResponseColumnsEnum.WATCH_VIDEO_COST_PER_ACTION;
        case r'VIEW_CATEGORY_COST_PER_ACTION': return TemplateResponseColumnsEnum.VIEW_CATEGORY_COST_PER_ACTION;
        case r'APP_INSTALL_COST_PER_ACTION': return TemplateResponseColumnsEnum.APP_INSTALL_COST_PER_ACTION;
        case r'UNKNOWN_COST_PER_ACTION': return TemplateResponseColumnsEnum.UNKNOWN_COST_PER_ACTION;
        case r'AD_GROUP_CPA_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.AD_GROUP_CPA_IN_MICRO_CURRENCY;
        case r'ADD_PAYMENT_INFO_COST_PER_ACTION': return TemplateResponseColumnsEnum.ADD_PAYMENT_INFO_COST_PER_ACTION;
        case r'ADD_TO_WISHLIST_COST_PER_ACTION': return TemplateResponseColumnsEnum.ADD_TO_WISHLIST_COST_PER_ACTION;
        case r'INITIATE_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INITIATE_CHECKOUT_COST_PER_ACTION;
        case r'SUBSCRIBE_COST_PER_ACTION': return TemplateResponseColumnsEnum.SUBSCRIBE_COST_PER_ACTION;
        case r'VIEW_CONTENT_COST_PER_ACTION': return TemplateResponseColumnsEnum.VIEW_CONTENT_COST_PER_ACTION;
        case r'PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.PAGE_VISIT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'SIGNUP_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SIGNUP_COST_PER_ACTION_IN_US_DOLLAR;
        case r'CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'CUSTOM_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.CUSTOM_COST_PER_ACTION_IN_US_DOLLAR;
        case r'ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.ADD_TO_CART_COST_PER_ACTION_IN_US_DOLLAR;
        case r'LEAD_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.LEAD_COST_PER_ACTION_IN_US_DOLLAR;
        case r'SEARCH_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SEARCH_COST_PER_ACTION_IN_US_DOLLAR;
        case r'WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.WATCH_VIDEO_COST_PER_ACTION_IN_US_DOLLAR;
        case r'VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.VIEW_CATEGORY_COST_PER_ACTION_IN_US_DOLLAR;
        case r'UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.UNKNOWN_COST_PER_ACTION_IN_US_DOLLAR;
        case r'ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.ADD_PAYMENT_INFO_COST_PER_ACTION_IN_US_DOLLAR;
        case r'ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.ADD_TO_WISHLIST_COST_PER_ACTION_IN_US_DOLLAR;
        case r'INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.INITIATE_CHECKOUT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SUBSCRIBE_COST_PER_ACTION_IN_US_DOLLAR;
        case r'VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.VIEW_CONTENT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'PAGE_VISIT_ROAS': return TemplateResponseColumnsEnum.PAGE_VISIT_ROAS;
        case r'SIGNUP_ROAS': return TemplateResponseColumnsEnum.SIGNUP_ROAS;
        case r'CHECKOUT_ROAS': return TemplateResponseColumnsEnum.CHECKOUT_ROAS;
        case r'CUSTOM_ROAS': return TemplateResponseColumnsEnum.CUSTOM_ROAS;
        case r'ADD_TO_CART_ROAS': return TemplateResponseColumnsEnum.ADD_TO_CART_ROAS;
        case r'LEAD_ROAS': return TemplateResponseColumnsEnum.LEAD_ROAS;
        case r'SEARCH_ROAS': return TemplateResponseColumnsEnum.SEARCH_ROAS;
        case r'WATCH_VIDEO_ROAS': return TemplateResponseColumnsEnum.WATCH_VIDEO_ROAS;
        case r'VIEW_CATEGORY_ROAS': return TemplateResponseColumnsEnum.VIEW_CATEGORY_ROAS;
        case r'APP_INSTALL_ROAS': return TemplateResponseColumnsEnum.APP_INSTALL_ROAS;
        case r'UNKNOWN_ROAS': return TemplateResponseColumnsEnum.UNKNOWN_ROAS;
        case r'ROAS': return TemplateResponseColumnsEnum.ROAS;
        case r'CLICK_ROAS': return TemplateResponseColumnsEnum.CLICK_ROAS;
        case r'ENGAGEMENT_ROAS': return TemplateResponseColumnsEnum.ENGAGEMENT_ROAS;
        case r'VIEW_ROAS': return TemplateResponseColumnsEnum.VIEW_ROAS;
        case r'ADD_PAYMENT_INFO_ROAS': return TemplateResponseColumnsEnum.ADD_PAYMENT_INFO_ROAS;
        case r'ADD_TO_WISHLIST_ROAS': return TemplateResponseColumnsEnum.ADD_TO_WISHLIST_ROAS;
        case r'INITIATE_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.INITIATE_CHECKOUT_ROAS;
        case r'SUBSCRIBE_ROAS': return TemplateResponseColumnsEnum.SUBSCRIBE_ROAS;
        case r'VIEW_CONTENT_ROAS': return TemplateResponseColumnsEnum.VIEW_CONTENT_ROAS;
        case r'HOUR': return TemplateResponseColumnsEnum.HOUR;
        case r'BOARD_ENGAGEMENT': return TemplateResponseColumnsEnum.BOARD_ENGAGEMENT;
        case r'BOARD_INSERTION': return TemplateResponseColumnsEnum.BOARD_INSERTION;
        case r'BOARD_IMPRESSION': return TemplateResponseColumnsEnum.BOARD_IMPRESSION;
        case r'BOARD_FOLLOW': return TemplateResponseColumnsEnum.BOARD_FOLLOW;
        case r'BOARD_SEND': return TemplateResponseColumnsEnum.BOARD_SEND;
        case r'BOARD_HIDE': return TemplateResponseColumnsEnum.BOARD_HIDE;
        case r'PRODUCT_GROUP_CAMPAIGN_ID': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CAMPAIGN_ID;
        case r'PRODUCT_GROUP_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CAMPAIGN_NAME;
        case r'PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE;
        case r'PRODUCT_GROUP_CAMPAIGN_STATUS': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CAMPAIGN_STATUS;
        case r'PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS': return TemplateResponseColumnsEnum.PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS;
        case r'PRODUCT_GROUP_AD_GROUP_ID': return TemplateResponseColumnsEnum.PRODUCT_GROUP_AD_GROUP_ID;
        case r'PRODUCT_GROUP_AD_GROUP_NAME': return TemplateResponseColumnsEnum.PRODUCT_GROUP_AD_GROUP_NAME;
        case r'PRODUCT_GROUP_AD_GROUP_STATUS': return TemplateResponseColumnsEnum.PRODUCT_GROUP_AD_GROUP_STATUS;
        case r'PRODUCT_GROUP_AD_IMAGE_TAG': return TemplateResponseColumnsEnum.PRODUCT_GROUP_AD_IMAGE_TAG;
        case r'PRODUCT_GROUP_AD_VIDEO_TAG': return TemplateResponseColumnsEnum.PRODUCT_GROUP_AD_VIDEO_TAG;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_ID;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_REFERENCE_NAME;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_ID': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_ID;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_BID_IN_MICRO_CURRENCY;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_STATUS': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_STATUS;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_ENTITY_STATUS;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ID;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_NAME;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_ACTION_TYPE;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_STATUS;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_CAMPAIGN_MANAGED_STATUS;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_ID;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_NAME;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_AD_GROUP_STATUS;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_TRACKING_TEMPLATE_URL;
        case r'PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG': return TemplateResponseColumnsEnum.PROMOTED_CATALOG_PRODUCT_GROUP_SELECTED_IMAGE_TAG;
        case r'VIDEO_3SEC_VIEWS_1': return TemplateResponseColumnsEnum.vIDEO3SECVIEWS1;
        case r'VIDEO_15SEC_UNIQUE_VIEWS_1': return TemplateResponseColumnsEnum.vIDEO15SECUNIQUEVIEWS1;
        case r'VIDEO_P0_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP0COMPLETE1;
        case r'VIDEO_P25_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP25COMPLETE1;
        case r'VIDEO_P50_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP50COMPLETE1;
        case r'VIDEO_P75_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP75COMPLETE1;
        case r'VIDEO_P95_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP95COMPLETE1;
        case r'VIDEO_P97_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP97COMPLETE1;
        case r'VIDEO_P100_COMPLETE_1': return TemplateResponseColumnsEnum.vIDEOP100COMPLETE1;
        case r'VIDEO_P0_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP0COMBINED1;
        case r'VIDEO_P25_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP25COMBINED1;
        case r'VIDEO_P50_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP50COMBINED1;
        case r'VIDEO_P75_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP75COMBINED1;
        case r'VIDEO_P95_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP95COMBINED1;
        case r'VIDEO_P97_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP97COMBINED1;
        case r'VIDEO_P100_COMBINED_1': return TemplateResponseColumnsEnum.vIDEOP100COMBINED1;
        case r'VIDEO_STARTS_PAID': return TemplateResponseColumnsEnum.VIDEO_STARTS_PAID;
        case r'VIDEO_STARTS_EARNED': return TemplateResponseColumnsEnum.VIDEO_STARTS_EARNED;
        case r'TOTAL_VIDEO_STARTS': return TemplateResponseColumnsEnum.TOTAL_VIDEO_STARTS;
        case r'VIDEO_AVG_WATCHTIME_1': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIME1;
        case r'VIDEO_MRC_VIEWS_1': return TemplateResponseColumnsEnum.vIDEOMRCVIEWS1;
        case r'VIDEO_VIEW_RATE_1': return TemplateResponseColumnsEnum.vIDEOVIEWRATE1;
        case r'VIDEO_3SEC_VIEWS_2': return TemplateResponseColumnsEnum.vIDEO3SECVIEWS2;
        case r'VIDEO_15SEC_UNIQUE_VIEWS_2': return TemplateResponseColumnsEnum.vIDEO15SECUNIQUEVIEWS2;
        case r'VIDEO_P0_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP0COMPLETE2;
        case r'VIDEO_P25_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP25COMPLETE2;
        case r'VIDEO_P50_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP50COMPLETE2;
        case r'VIDEO_P75_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP75COMPLETE2;
        case r'VIDEO_P95_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP95COMPLETE2;
        case r'VIDEO_P97_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP97COMPLETE2;
        case r'VIDEO_P100_COMPLETE_2': return TemplateResponseColumnsEnum.vIDEOP100COMPLETE2;
        case r'VIDEO_P0_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP0COMBINED2;
        case r'VIDEO_P25_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP25COMBINED2;
        case r'VIDEO_P50_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP50COMBINED2;
        case r'VIDEO_P75_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP75COMBINED2;
        case r'VIDEO_P95_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP95COMBINED2;
        case r'VIDEO_P97_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP97COMBINED2;
        case r'VIDEO_P100_COMBINED_2': return TemplateResponseColumnsEnum.vIDEOP100COMBINED2;
        case r'VIDEO_AVG_WATCHTIME_2': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIME2;
        case r'VIDEO_MRC_VIEWS_2': return TemplateResponseColumnsEnum.vIDEOMRCVIEWS2;
        case r'VIDEO_VIEW_RATE_2': return TemplateResponseColumnsEnum.vIDEOVIEWRATE2;
        case r'PAID_VIDEO_VIEW': return TemplateResponseColumnsEnum.PAID_VIDEO_VIEW;
        case r'PAID_VIDEO_IMPRESSION': return TemplateResponseColumnsEnum.PAID_VIDEO_IMPRESSION;
        case r'PAID_VIDEO_VIEWABLE_RATE': return TemplateResponseColumnsEnum.PAID_VIDEO_VIEWABLE_RATE;
        case r'VIDEO_LENGTH': return TemplateResponseColumnsEnum.VIDEO_LENGTH;
        case r'VIDEO_SPEND_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.VIDEO_SPEND_IN_MICRO_DOLLAR;
        case r'VIDEO_SPEND_IN_DOLLAR': return TemplateResponseColumnsEnum.VIDEO_SPEND_IN_DOLLAR;
        case r'CPV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPV_IN_MICRO_DOLLAR;
        case r'CPV_IN_DOLLAR': return TemplateResponseColumnsEnum.CPV_IN_DOLLAR;
        case r'CP3SV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.cP3SVINMICRODOLLAR;
        case r'CP3SV_IN_DOLLAR': return TemplateResponseColumnsEnum.cP3SVINDOLLAR;
        case r'ECPV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPV_IN_MICRO_DOLLAR;
        case r'ECPV_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPV_IN_DOLLAR;
        case r'ECP3SV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.eCP3SVINMICRODOLLAR;
        case r'ECP3SV_IN_DOLLAR': return TemplateResponseColumnsEnum.eCP3SVINDOLLAR;
        case r'CPCV_IN_DOLLAR': return TemplateResponseColumnsEnum.CPCV_IN_DOLLAR;
        case r'CPCV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.CPCV_IN_MICRO_DOLLAR;
        case r'ECPCV_IN_DOLLAR': return TemplateResponseColumnsEnum.ECPCV_IN_DOLLAR;
        case r'ECPCV_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.ECPCV_IN_MICRO_DOLLAR;
        case r'CPCV_P95_IN_DOLLAR': return TemplateResponseColumnsEnum.cPCVP95INDOLLAR;
        case r'CPCV_P95_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.cPCVP95INMICRODOLLAR;
        case r'ECPCV_P95_IN_DOLLAR': return TemplateResponseColumnsEnum.eCPCVP95INDOLLAR;
        case r'ECPCV_P95_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.eCPCVP95INMICRODOLLAR;
        case r'TOTAL_VIDEO_3SEC_VIEWS': return TemplateResponseColumnsEnum.tOTALVIDEO3SECVIEWS;
        case r'TOTAL_VIDEO_15SEC_UNIQUE_VIEWS': return TemplateResponseColumnsEnum.tOTALVIDEO15SECUNIQUEVIEWS;
        case r'TOTAL_VIDEO_P0_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP0COMPLETE;
        case r'TOTAL_VIDEO_P25_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP25COMPLETE;
        case r'TOTAL_VIDEO_P50_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP50COMPLETE;
        case r'TOTAL_VIDEO_P75_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP75COMPLETE;
        case r'TOTAL_VIDEO_P95_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP95COMPLETE;
        case r'TOTAL_VIDEO_P97_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP97COMPLETE;
        case r'TOTAL_VIDEO_P100_COMPLETE': return TemplateResponseColumnsEnum.tOTALVIDEOP100COMPLETE;
        case r'TOTAL_VIDEO_P0_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP0COMBINED;
        case r'TOTAL_VIDEO_P25_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP25COMBINED;
        case r'TOTAL_VIDEO_P50_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP50COMBINED;
        case r'TOTAL_VIDEO_P75_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP75COMBINED;
        case r'TOTAL_VIDEO_P95_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP95COMBINED;
        case r'TOTAL_VIDEO_P97_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP97COMBINED;
        case r'TOTAL_VIDEO_P100_COMBINED': return TemplateResponseColumnsEnum.tOTALVIDEOP100COMBINED;
        case r'TOTAL_VIDEO_AVG_WATCHTIME': return TemplateResponseColumnsEnum.TOTAL_VIDEO_AVG_WATCHTIME;
        case r'TOTAL_VIDEO_MRC_VIEWS': return TemplateResponseColumnsEnum.TOTAL_VIDEO_MRC_VIEWS;
        case r'TOTAL_VIDEO_VIEW_RATE': return TemplateResponseColumnsEnum.TOTAL_VIDEO_VIEW_RATE;
        case r'VIDEO_V50_WATCHTIME_1': return TemplateResponseColumnsEnum.vIDEOV50WATCHTIME1;
        case r'VIDEO_V50_WATCHTIME_2': return TemplateResponseColumnsEnum.vIDEOV50WATCHTIME2;
        case r'TOTAL_VIDEO_V50_WATCHTIME': return TemplateResponseColumnsEnum.tOTALVIDEOV50WATCHTIME;
        case r'VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_1': return TemplateResponseColumnsEnum.vIDEOSUMV50WATCHTIMEINMILLISECOND1;
        case r'VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND_2': return TemplateResponseColumnsEnum.vIDEOSUMV50WATCHTIMEINMILLISECOND2;
        case r'TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_MILLISECOND': return TemplateResponseColumnsEnum.tOTALVIDEOSUMV50WATCHTIMEINMILLISECOND;
        case r'VIDEO_SUM_V50_WATCHTIME_IN_SECOND_1': return TemplateResponseColumnsEnum.vIDEOSUMV50WATCHTIMEINSECOND1;
        case r'VIDEO_SUM_V50_WATCHTIME_IN_SECOND_2': return TemplateResponseColumnsEnum.vIDEOSUMV50WATCHTIMEINSECOND2;
        case r'TOTAL_VIDEO_SUM_V50_WATCHTIME_IN_SECOND': return TemplateResponseColumnsEnum.tOTALVIDEOSUMV50WATCHTIMEINSECOND;
        case r'VIDEO_AVG_WATCHTIME_IN_MILLISECOND_1': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIMEINMILLISECOND1;
        case r'VIDEO_AVG_WATCHTIME_IN_MILLISECOND_2': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIMEINMILLISECOND2;
        case r'TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND': return TemplateResponseColumnsEnum.TOTAL_VIDEO_AVG_WATCHTIME_IN_MILLISECOND;
        case r'VIDEO_AVG_WATCHTIME_IN_SECOND_1': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIMEINSECOND1;
        case r'VIDEO_AVG_WATCHTIME_IN_SECOND_2': return TemplateResponseColumnsEnum.vIDEOAVGWATCHTIMEINSECOND2;
        case r'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND': return TemplateResponseColumnsEnum.TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND;
        case r'VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID': return TemplateResponseColumnsEnum.VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_PAID;
        case r'VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED': return TemplateResponseColumnsEnum.VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS_EARNED;
        case r'TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS': return TemplateResponseColumnsEnum.TOTAL_VIDEO_AVG_WATCHTIME_IN_SECOND_VIDEO_STARTS;
        case r'DELIVERY_STATUS_NO_FANOUT': return TemplateResponseColumnsEnum.DELIVERY_STATUS_NO_FANOUT;
        case r'DELIVERY_STATUS_WITH_FANOUT': return TemplateResponseColumnsEnum.DELIVERY_STATUS_WITH_FANOUT;
        case r'KEYWORD_COMPETITION_BAND': return TemplateResponseColumnsEnum.KEYWORD_COMPETITION_BAND;
        case r'KEYWORD_QUERY_VOLUME': return TemplateResponseColumnsEnum.KEYWORD_QUERY_VOLUME;
        case r'KEYWORD_VALUE': return TemplateResponseColumnsEnum.KEYWORD_VALUE;
        case r'KEYWORD_MATCH_TYPE': return TemplateResponseColumnsEnum.KEYWORD_MATCH_TYPE;
        case r'KEYWORD_BID_IN_MICRO_CURRENCY': return TemplateResponseColumnsEnum.KEYWORD_BID_IN_MICRO_CURRENCY;
        case r'KEYWORD_USER_QUERY': return TemplateResponseColumnsEnum.KEYWORD_USER_QUERY;
        case r'KEYWORD_SQR_KEYWORD_VALUE': return TemplateResponseColumnsEnum.KEYWORD_SQR_KEYWORD_VALUE;
        case r'KEYWORD_AD_GROUP_ID': return TemplateResponseColumnsEnum.KEYWORD_AD_GROUP_ID;
        case r'KEYWORD_AD_GROUP_NAME': return TemplateResponseColumnsEnum.KEYWORD_AD_GROUP_NAME;
        case r'KEYWORD_CAMPAIGN_ID': return TemplateResponseColumnsEnum.KEYWORD_CAMPAIGN_ID;
        case r'KEYWORD_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.KEYWORD_CAMPAIGN_NAME;
        case r'KEYWORD_SEARCH_TERM_AD_GROUP_ID': return TemplateResponseColumnsEnum.KEYWORD_SEARCH_TERM_AD_GROUP_ID;
        case r'KEYWORD_SEARCH_TERM_AD_GROUP_NAME': return TemplateResponseColumnsEnum.KEYWORD_SEARCH_TERM_AD_GROUP_NAME;
        case r'KEYWORD_SEARCH_TERM_CAMPAIGN_ID': return TemplateResponseColumnsEnum.KEYWORD_SEARCH_TERM_CAMPAIGN_ID;
        case r'KEYWORD_SEARCH_TERM_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.KEYWORD_SEARCH_TERM_CAMPAIGN_NAME;
        case r'NEGATIVE_KEYWORD_AD_GROUP_ID': return TemplateResponseColumnsEnum.NEGATIVE_KEYWORD_AD_GROUP_ID;
        case r'NEGATIVE_KEYWORD_AD_GROUP_NAME': return TemplateResponseColumnsEnum.NEGATIVE_KEYWORD_AD_GROUP_NAME;
        case r'NEGATIVE_KEYWORD_CAMPAIGN_ID': return TemplateResponseColumnsEnum.NEGATIVE_KEYWORD_CAMPAIGN_ID;
        case r'NEGATIVE_KEYWORD_CAMPAIGN_NAME': return TemplateResponseColumnsEnum.NEGATIVE_KEYWORD_CAMPAIGN_NAME;
        case r'ONE_TAP_V2_WEBSITE_VIEW_1': return TemplateResponseColumnsEnum.oNETAPV2WEBSITEVIEW1;
        case r'ONE_TAP_V2_WEBSITE_VIEW_2': return TemplateResponseColumnsEnum.oNETAPV2WEBSITEVIEW2;
        case r'TOTAL_ONE_TAP_V2_WEBSITE_VIEW': return TemplateResponseColumnsEnum.tOTALONETAPV2WEBSITEVIEW;
        case r'ONE_TAP_V2_WEBSITE_VIEW_USER_1': return TemplateResponseColumnsEnum.oNETAPV2WEBSITEVIEWUSER1;
        case r'ONE_TAP_V2_WEBSITE_VIEW_USER_2': return TemplateResponseColumnsEnum.oNETAPV2WEBSITEVIEWUSER2;
        case r'TOTAL_LANDING_PAGE_VIEWS': return TemplateResponseColumnsEnum.TOTAL_LANDING_PAGE_VIEWS;
        case r'LANDING_PAGE_VIEWS_1': return TemplateResponseColumnsEnum.lANDINGPAGEVIEWS1;
        case r'LANDING_PAGE_VIEWS_2': return TemplateResponseColumnsEnum.lANDINGPAGEVIEWS2;
        case r'COST_PER_LANDING_PAGE_VIEW': return TemplateResponseColumnsEnum.COST_PER_LANDING_PAGE_VIEW;
        case r'LANDING_PAGE_VIEW_RATE': return TemplateResponseColumnsEnum.LANDING_PAGE_VIEW_RATE;
        case r'TOTAL_DESTINATION_VIEWS': return TemplateResponseColumnsEnum.TOTAL_DESTINATION_VIEWS;
        case r'DESTINATION_VIEWS_1': return TemplateResponseColumnsEnum.dESTINATIONVIEWS1;
        case r'DESTINATION_VIEWS_2': return TemplateResponseColumnsEnum.dESTINATIONVIEWS2;
        case r'COST_PER_DESTINATION_VIEW_IN_DOLLAR': return TemplateResponseColumnsEnum.COST_PER_DESTINATION_VIEW_IN_DOLLAR;
        case r'COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.COST_PER_DESTINATION_VIEW_IN_MICRO_DOLLAR;
        case r'DESTINATION_VIEW_RATE': return TemplateResponseColumnsEnum.DESTINATION_VIEW_RATE;
        case r'CAROUSEL_SLOT_INDEX': return TemplateResponseColumnsEnum.CAROUSEL_SLOT_INDEX;
        case r'CAROUSEL_ID': return TemplateResponseColumnsEnum.CAROUSEL_ID;
        case r'CAROUSEL_SLOT_PROMOTION_ID': return TemplateResponseColumnsEnum.CAROUSEL_SLOT_PROMOTION_ID;
        case r'CAROUSEL_SLOT_IMPRESSION_1': return TemplateResponseColumnsEnum.cAROUSELSLOTIMPRESSION1;
        case r'CAROUSEL_SLOT_IMPRESSION_2': return TemplateResponseColumnsEnum.cAROUSELSLOTIMPRESSION2;
        case r'TOTAL_CAROUSEL_SLOT_IMPRESSION': return TemplateResponseColumnsEnum.TOTAL_CAROUSEL_SLOT_IMPRESSION;
        case r'CAROUSEL_SLOT_IMPRESSION_USER_1': return TemplateResponseColumnsEnum.cAROUSELSLOTIMPRESSIONUSER1;
        case r'CAROUSEL_SLOT_IMPRESSION_USER_2': return TemplateResponseColumnsEnum.cAROUSELSLOTIMPRESSIONUSER2;
        case r'CAROUSEL_SLOT_CLICKTHROUGH_1': return TemplateResponseColumnsEnum.cAROUSELSLOTCLICKTHROUGH1;
        case r'CAROUSEL_SLOT_CLICKTHROUGH_2': return TemplateResponseColumnsEnum.cAROUSELSLOTCLICKTHROUGH2;
        case r'TOTAL_CAROUSEL_SLOT_CLICKTHROUGH': return TemplateResponseColumnsEnum.TOTAL_CAROUSEL_SLOT_CLICKTHROUGH;
        case r'CAROUSEL_SLOT_CLICKTHROUGH_USER_1': return TemplateResponseColumnsEnum.cAROUSELSLOTCLICKTHROUGHUSER1;
        case r'CAROUSEL_SLOT_CLICKTHROUGH_USER_2': return TemplateResponseColumnsEnum.cAROUSELSLOTCLICKTHROUGHUSER2;
        case r'CAROUSEL_SLOT_SIDESWIPE_1': return TemplateResponseColumnsEnum.cAROUSELSLOTSIDESWIPE1;
        case r'CAROUSEL_SLOT_SIDESWIPE_2': return TemplateResponseColumnsEnum.cAROUSELSLOTSIDESWIPE2;
        case r'TOTAL_CAROUSEL_SLOT_SIDESWIPE': return TemplateResponseColumnsEnum.TOTAL_CAROUSEL_SLOT_SIDESWIPE;
        case r'CAROUSEL_SLOT_SIDESWIPE_USER_1': return TemplateResponseColumnsEnum.cAROUSELSLOTSIDESWIPEUSER1;
        case r'CAROUSEL_SLOT_SIDESWIPE_USER_2': return TemplateResponseColumnsEnum.cAROUSELSLOTSIDESWIPEUSER2;
        case r'CAROUSEL_SLOT_VIEW_WEBSITE_1': return TemplateResponseColumnsEnum.cAROUSELSLOTVIEWWEBSITE1;
        case r'CAROUSEL_SLOT_VIEW_WEBSITE_2': return TemplateResponseColumnsEnum.cAROUSELSLOTVIEWWEBSITE2;
        case r'TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE': return TemplateResponseColumnsEnum.TOTAL_CAROUSEL_SLOT_VIEW_WEBSITE;
        case r'CAROUSEL_SLOT_VIEW_WEBSITE_USER_1': return TemplateResponseColumnsEnum.cAROUSELSLOTVIEWWEBSITEUSER1;
        case r'CAROUSEL_SLOT_VIEW_WEBSITE_USER_2': return TemplateResponseColumnsEnum.cAROUSELSLOTVIEWWEBSITEUSER2;
        case r'COLLECTION_PIN_ITEM_IMPRESSION_1': return TemplateResponseColumnsEnum.cOLLECTIONPINITEMIMPRESSION1;
        case r'COLLECTION_PIN_ITEM_IMPRESSION_2': return TemplateResponseColumnsEnum.cOLLECTIONPINITEMIMPRESSION2;
        case r'TOTAL_COLLECTION_PIN_ITEM_IMPRESSION': return TemplateResponseColumnsEnum.TOTAL_COLLECTION_PIN_ITEM_IMPRESSION;
        case r'COLLECTION_PIN_ITEM_CLICKTHROUGH_1': return TemplateResponseColumnsEnum.cOLLECTIONPINITEMCLICKTHROUGH1;
        case r'COLLECTION_PIN_ITEM_CLICKTHROUGH_2': return TemplateResponseColumnsEnum.cOLLECTIONPINITEMCLICKTHROUGH2;
        case r'TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH': return TemplateResponseColumnsEnum.TOTAL_COLLECTION_PIN_ITEM_CLICKTHROUGH;
        case r'HOLDOUT_EXPERIMENT': return TemplateResponseColumnsEnum.HOLDOUT_EXPERIMENT;
        case r'AD_GROUP_HOLDOUT_EXPERIMENT': return TemplateResponseColumnsEnum.AD_GROUP_HOLDOUT_EXPERIMENT;
        case r'PIN_PROMOTION_HOLDOUT_EXPERIMENT': return TemplateResponseColumnsEnum.PIN_PROMOTION_HOLDOUT_EXPERIMENT;
        case r'PRODUCT_GROUP_HOLDOUT_EXPERIMENT': return TemplateResponseColumnsEnum.PRODUCT_GROUP_HOLDOUT_EXPERIMENT;
        case r'MULTI_OBJECTIVE_RESULT': return TemplateResponseColumnsEnum.MULTI_OBJECTIVE_RESULT;
        case r'MULTI_OBJECTIVE_COST': return TemplateResponseColumnsEnum.MULTI_OBJECTIVE_COST;
        case r'MULTI_OBJECTIVE_RESULT_DESCRIPTION': return TemplateResponseColumnsEnum.MULTI_OBJECTIVE_RESULT_DESCRIPTION;
        case r'MULTI_OBJECTIVE_COST_DESCRIPTION': return TemplateResponseColumnsEnum.MULTI_OBJECTIVE_COST_DESCRIPTION;
        case r'DATE_RANGE': return TemplateResponseColumnsEnum.DATE_RANGE;
        case r'DATE_RANGE_START': return TemplateResponseColumnsEnum.DATE_RANGE_START;
        case r'DATE_RANGE_END': return TemplateResponseColumnsEnum.DATE_RANGE_END;
        case r'REPORT_DATE_START': return TemplateResponseColumnsEnum.REPORT_DATE_START;
        case r'REPORT_DATE_END': return TemplateResponseColumnsEnum.REPORT_DATE_END;
        case r'PINNER_LIST_NAME': return TemplateResponseColumnsEnum.PINNER_LIST_NAME;
        case r'PINNER_LIST_TYPE': return TemplateResponseColumnsEnum.PINNER_LIST_TYPE;
        case r'ORDER_VALUE': return TemplateResponseColumnsEnum.ORDER_VALUE;
        case r'ORDER_QUANTITY': return TemplateResponseColumnsEnum.ORDER_QUANTITY;
        case r'ADVERTISER_NAME': return TemplateResponseColumnsEnum.ADVERTISER_NAME;
        case r'ADVERTISER_CURRENCY': return TemplateResponseColumnsEnum.ADVERTISER_CURRENCY;
        case r'TOTAL_REPIN_RATE': return TemplateResponseColumnsEnum.TOTAL_REPIN_RATE;
        case r'SPEND_YESTERDAY_IN_DOLLAR': return TemplateResponseColumnsEnum.SPEND_YESTERDAY_IN_DOLLAR;
        case r'PIN_PROMOTION_REJECTION_LABELS': return TemplateResponseColumnsEnum.PIN_PROMOTION_REJECTION_LABELS;
        case r'PIN_PROMOTION_DESTINATION_URL': return TemplateResponseColumnsEnum.PIN_PROMOTION_DESTINATION_URL;
        case r'VIDEO_COMPLETION_RATE': return TemplateResponseColumnsEnum.VIDEO_COMPLETION_RATE;
        case r'CAMPAIGN_BOOKING_REFERENCE': return TemplateResponseColumnsEnum.CAMPAIGN_BOOKING_REFERENCE;
        case r'WEB_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_CHECKOUT_COST_PER_ACTION;
        case r'WEB_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.WEB_CHECKOUT_ROAS;
        case r'TOTAL_WEB_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT;
        case r'TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CHECKOUT;
        case r'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CHECKOUT;
        case r'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CHECKOUT;
        case r'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CHECKOUT_VALUE_IN_DOLLAR;
        case r'INAPP_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_CHECKOUT_COST_PER_ACTION;
        case r'INAPP_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.INAPP_CHECKOUT_ROAS;
        case r'TOTAL_INAPP_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT;
        case r'TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CHECKOUT;
        case r'TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CHECKOUT;
        case r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CHECKOUT;
        case r'TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CHECKOUT_VALUE_IN_DOLLAR;
        case r'OFFLINE_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_CHECKOUT_COST_PER_ACTION;
        case r'OFFLINE_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.OFFLINE_CHECKOUT_ROAS;
        case r'TOTAL_OFFLINE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT;
        case r'TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CHECKOUT;
        case r'TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CHECKOUT;
        case r'TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CHECKOUT_VALUE_IN_DOLLAR;
        case r'PINTEREST_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.PINTEREST_CHECKOUT_COST_PER_ACTION;
        case r'PINTEREST_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.PINTEREST_CHECKOUT_ROAS;
        case r'TOTAL_PINTEREST_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_PINTEREST_CHECKOUT;
        case r'TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_PINTEREST_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_PINTEREST_CHECKOUT_VALUE_IN_DOLLAR;
        case r'WEB_ADD_TO_CART_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_ADD_TO_CART_COST_PER_ACTION;
        case r'WEB_ADD_TO_CART_ROAS': return TemplateResponseColumnsEnum.WEB_ADD_TO_CART_ROAS;
        case r'TOTAL_WEB_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART;
        case r'TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_CART;
        case r'TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_TO_CART;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_CART;
        case r'TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'INAPP_ADD_TO_CART_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_ADD_TO_CART_COST_PER_ACTION;
        case r'INAPP_ADD_TO_CART_ROAS': return TemplateResponseColumnsEnum.INAPP_ADD_TO_CART_ROAS;
        case r'TOTAL_INAPP_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART;
        case r'TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_CART;
        case r'TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_TO_CART': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_CART;
        case r'TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_CART_VALUE_IN_DOLLAR;
        case r'WEB_PAGE_VISIT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_PAGE_VISIT_COST_PER_ACTION;
        case r'WEB_PAGE_VISIT_ROAS': return TemplateResponseColumnsEnum.WEB_PAGE_VISIT_ROAS;
        case r'TOTAL_WEB_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT;
        case r'TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_PAGE_VISIT;
        case r'TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_PAGE_VISIT;
        case r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_PAGE_VISIT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_PAGE_VISIT;
        case r'TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_PAGE_VISIT_VALUE_IN_DOLLAR;
        case r'WEB_SIGNUP_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_SIGNUP_COST_PER_ACTION;
        case r'WEB_SIGNUP_ROAS': return TemplateResponseColumnsEnum.WEB_SIGNUP_ROAS;
        case r'TOTAL_WEB_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP;
        case r'TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SIGNUP;
        case r'TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SIGNUP;
        case r'TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SIGNUP;
        case r'TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SIGNUP_VALUE_IN_DOLLAR;
        case r'INAPP_SIGNUP_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SIGNUP_COST_PER_ACTION;
        case r'INAPP_SIGNUP_ROAS': return TemplateResponseColumnsEnum.INAPP_SIGNUP_ROAS;
        case r'TOTAL_INAPP_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP;
        case r'TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SIGNUP;
        case r'TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SIGNUP;
        case r'TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SIGNUP;
        case r'TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SIGNUP_VALUE_IN_DOLLAR;
        case r'OFFLINE_SIGNUP_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_SIGNUP_COST_PER_ACTION;
        case r'OFFLINE_SIGNUP_ROAS': return TemplateResponseColumnsEnum.OFFLINE_SIGNUP_ROAS;
        case r'TOTAL_OFFLINE_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP;
        case r'TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SIGNUP;
        case r'TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SIGNUP;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SIGNUP_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SIGNUP': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SIGNUP;
        case r'TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SIGNUP_VALUE_IN_DOLLAR;
        case r'WEB_WATCH_VIDEO_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_WATCH_VIDEO_COST_PER_ACTION;
        case r'WEB_WATCH_VIDEO_ROAS': return TemplateResponseColumnsEnum.WEB_WATCH_VIDEO_ROAS;
        case r'TOTAL_WEB_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO;
        case r'TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_WATCH_VIDEO;
        case r'TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO;
        case r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_WATCH_VIDEO': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_WATCH_VIDEO;
        case r'TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_WATCH_VIDEO_VALUE_IN_DOLLAR;
        case r'WEB_LEAD_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_LEAD_COST_PER_ACTION;
        case r'WEB_LEAD_ROAS': return TemplateResponseColumnsEnum.WEB_LEAD_ROAS;
        case r'TOTAL_WEB_LEAD': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD;
        case r'TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_LEAD': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_LEAD;
        case r'TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_LEAD': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_LEAD;
        case r'TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_LEAD': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_LEAD;
        case r'TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_LEAD_VALUE_IN_DOLLAR;
        case r'OFFLINE_LEAD_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_LEAD_COST_PER_ACTION;
        case r'OFFLINE_LEAD_ROAS': return TemplateResponseColumnsEnum.OFFLINE_LEAD_ROAS;
        case r'TOTAL_OFFLINE_LEAD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD;
        case r'TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_LEAD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_LEAD;
        case r'TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_LEAD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_LEAD;
        case r'TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_LEAD_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_LEAD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_LEAD;
        case r'TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_LEAD_VALUE_IN_DOLLAR;
        case r'WEB_SEARCH_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_SEARCH_COST_PER_ACTION;
        case r'WEB_SEARCH_ROAS': return TemplateResponseColumnsEnum.WEB_SEARCH_ROAS;
        case r'TOTAL_WEB_SEARCH': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH;
        case r'TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_SEARCH': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SEARCH;
        case r'TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SEARCH': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SEARCH;
        case r'TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_SEARCH': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SEARCH;
        case r'TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SEARCH_VALUE_IN_DOLLAR;
        case r'INAPP_SEARCH_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SEARCH_COST_PER_ACTION;
        case r'INAPP_SEARCH_ROAS': return TemplateResponseColumnsEnum.INAPP_SEARCH_ROAS;
        case r'TOTAL_INAPP_SEARCH': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH;
        case r'TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SEARCH': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SEARCH;
        case r'TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SEARCH': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SEARCH;
        case r'TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SEARCH_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SEARCH': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SEARCH;
        case r'TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SEARCH_VALUE_IN_DOLLAR;
        case r'WEB_VIEW_CATEGORY_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_VIEW_CATEGORY_COST_PER_ACTION;
        case r'WEB_VIEW_CATEGORY_ROAS': return TemplateResponseColumnsEnum.WEB_VIEW_CATEGORY_ROAS;
        case r'TOTAL_WEB_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY;
        case r'TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CATEGORY;
        case r'TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_VIEW_CATEGORY': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CATEGORY;
        case r'TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CATEGORY_VALUE_IN_DOLLAR;
        case r'WEB_CUSTOM_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_CUSTOM_COST_PER_ACTION;
        case r'WEB_CUSTOM_ROAS': return TemplateResponseColumnsEnum.WEB_CUSTOM_ROAS;
        case r'TOTAL_WEB_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM;
        case r'TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOM;
        case r'TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOM;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOM;
        case r'TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOM_VALUE_IN_DOLLAR;
        case r'OFFLINE_CUSTOM_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_CUSTOM_COST_PER_ACTION;
        case r'OFFLINE_CUSTOM_ROAS': return TemplateResponseColumnsEnum.OFFLINE_CUSTOM_ROAS;
        case r'TOTAL_OFFLINE_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM;
        case r'TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOM;
        case r'TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOM;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOM_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CUSTOM': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOM;
        case r'TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOM_VALUE_IN_DOLLAR;
        case r'WEB_UNKNOWN_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_UNKNOWN_COST_PER_ACTION;
        case r'WEB_UNKNOWN_ROAS': return TemplateResponseColumnsEnum.WEB_UNKNOWN_ROAS;
        case r'TOTAL_WEB_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN;
        case r'TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_UNKNOWN;
        case r'TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_UNKNOWN;
        case r'TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_UNKNOWN;
        case r'TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_UNKNOWN_VALUE_IN_DOLLAR;
        case r'INAPP_UNKNOWN_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_UNKNOWN_COST_PER_ACTION;
        case r'INAPP_UNKNOWN_ROAS': return TemplateResponseColumnsEnum.INAPP_UNKNOWN_ROAS;
        case r'TOTAL_INAPP_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN;
        case r'TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_UNKNOWN;
        case r'TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_UNKNOWN;
        case r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_UNKNOWN;
        case r'TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_UNKNOWN_VALUE_IN_DOLLAR;
        case r'OFFLINE_UNKNOWN_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_UNKNOWN_COST_PER_ACTION;
        case r'OFFLINE_UNKNOWN_ROAS': return TemplateResponseColumnsEnum.OFFLINE_UNKNOWN_ROAS;
        case r'TOTAL_OFFLINE_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN;
        case r'TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_UNKNOWN;
        case r'TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN;
        case r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_UNKNOWN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_UNKNOWN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_UNKNOWN;
        case r'TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_UNKNOWN_VALUE_IN_DOLLAR;
        case r'INAPP_APP_INSTALL_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_APP_INSTALL_COST_PER_ACTION;
        case r'INAPP_APP_INSTALL_ROAS': return TemplateResponseColumnsEnum.INAPP_APP_INSTALL_ROAS;
        case r'TOTAL_INAPP_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_INSTALL;
        case r'TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_INSTALL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_INSTALL;
        case r'TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_INSTALL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_INSTALL;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_INSTALL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_APP_INSTALL': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_INSTALL;
        case r'TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_INSTALL_VALUE_IN_DOLLAR;
        case r'TOTAL_APP_INSTALL_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_APP_INSTALL_CONVERSION_RATE;
        case r'TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_INSTALL_CONVERSION_RATE;
        case r'WEB_ADD_PAYMENT_INFO_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_ADD_PAYMENT_INFO_COST_PER_ACTION;
        case r'WEB_ADD_PAYMENT_INFO_ROAS': return TemplateResponseColumnsEnum.WEB_ADD_PAYMENT_INFO_ROAS;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_PAYMENT_INFO;
        case r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_PAYMENT_INFO;
        case r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_ADD_PAYMENT_INFO_COST_PER_ACTION;
        case r'INAPP_ADD_PAYMENT_INFO_ROAS': return TemplateResponseColumnsEnum.INAPP_ADD_PAYMENT_INFO_ROAS;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO;
        case r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO;
        case r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_ADD_PAYMENT_INFO_COST_PER_ACTION;
        case r'OFFLINE_ADD_PAYMENT_INFO_ROAS': return TemplateResponseColumnsEnum.OFFLINE_ADD_PAYMENT_INFO_ROAS;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO;
        case r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO;
        case r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_PAYMENT_INFO_VALUE_IN_DOLLAR;
        case r'WEB_ADD_TO_WISHLIST_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_ADD_TO_WISHLIST_COST_PER_ACTION;
        case r'WEB_ADD_TO_WISHLIST_ROAS': return TemplateResponseColumnsEnum.WEB_ADD_TO_WISHLIST_ROAS;
        case r'TOTAL_WEB_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_WISHLIST;
        case r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_WISHLIST;
        case r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'INAPP_ADD_TO_WISHLIST_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_ADD_TO_WISHLIST_COST_PER_ACTION;
        case r'INAPP_ADD_TO_WISHLIST_ROAS': return TemplateResponseColumnsEnum.INAPP_ADD_TO_WISHLIST_ROAS;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_WISHLIST;
        case r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_WISHLIST;
        case r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_ADD_TO_WISHLIST_COST_PER_ACTION;
        case r'OFFLINE_ADD_TO_WISHLIST_ROAS': return TemplateResponseColumnsEnum.OFFLINE_ADD_TO_WISHLIST_ROAS;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST;
        case r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST;
        case r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_ADD_TO_WISHLIST_VALUE_IN_DOLLAR;
        case r'WEB_INITIATE_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_INITIATE_CHECKOUT_COST_PER_ACTION;
        case r'WEB_INITIATE_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.WEB_INITIATE_CHECKOUT_ROAS;
        case r'TOTAL_WEB_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_INITIATE_CHECKOUT;
        case r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT;
        case r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_INITIATE_CHECKOUT;
        case r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'INAPP_INITIATE_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_INITIATE_CHECKOUT_COST_PER_ACTION;
        case r'INAPP_INITIATE_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.INAPP_INITIATE_CHECKOUT_ROAS;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_INITIATE_CHECKOUT;
        case r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT;
        case r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_INITIATE_CHECKOUT;
        case r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_INITIATE_CHECKOUT_COST_PER_ACTION;
        case r'OFFLINE_INITIATE_CHECKOUT_ROAS': return TemplateResponseColumnsEnum.OFFLINE_INITIATE_CHECKOUT_ROAS;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT;
        case r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT;
        case r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT;
        case r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_INITIATE_CHECKOUT_VALUE_IN_DOLLAR;
        case r'WEB_SUBSCRIBE_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_SUBSCRIBE_COST_PER_ACTION;
        case r'WEB_SUBSCRIBE_ROAS': return TemplateResponseColumnsEnum.WEB_SUBSCRIBE_ROAS;
        case r'TOTAL_WEB_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE;
        case r'TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBSCRIBE;
        case r'TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBSCRIBE;
        case r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBSCRIBE;
        case r'TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'INAPP_SUBSCRIBE_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SUBSCRIBE_COST_PER_ACTION;
        case r'INAPP_SUBSCRIBE_ROAS': return TemplateResponseColumnsEnum.INAPP_SUBSCRIBE_ROAS;
        case r'TOTAL_INAPP_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE;
        case r'TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBSCRIBE;
        case r'TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBSCRIBE;
        case r'TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'OFFLINE_SUBSCRIBE_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_SUBSCRIBE_COST_PER_ACTION;
        case r'OFFLINE_SUBSCRIBE_ROAS': return TemplateResponseColumnsEnum.OFFLINE_SUBSCRIBE_ROAS;
        case r'TOTAL_OFFLINE_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE;
        case r'TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBSCRIBE;
        case r'TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SUBSCRIBE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBSCRIBE;
        case r'TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBSCRIBE_VALUE_IN_DOLLAR;
        case r'WEB_VIEW_CONTENT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_VIEW_CONTENT_COST_PER_ACTION;
        case r'WEB_VIEW_CONTENT_ROAS': return TemplateResponseColumnsEnum.WEB_VIEW_CONTENT_ROAS;
        case r'TOTAL_WEB_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT;
        case r'TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CONTENT;
        case r'TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CONTENT;
        case r'TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'INAPP_VIEW_CONTENT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_VIEW_CONTENT_COST_PER_ACTION;
        case r'INAPP_VIEW_CONTENT_ROAS': return TemplateResponseColumnsEnum.INAPP_VIEW_CONTENT_ROAS;
        case r'TOTAL_INAPP_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT;
        case r'TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_VIEW_CONTENT;
        case r'TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT;
        case r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_VIEW_CONTENT;
        case r'TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'OFFLINE_VIEW_CONTENT_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_VIEW_CONTENT_COST_PER_ACTION;
        case r'OFFLINE_VIEW_CONTENT_ROAS': return TemplateResponseColumnsEnum.OFFLINE_VIEW_CONTENT_ROAS;
        case r'TOTAL_OFFLINE_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_VIEW_CONTENT;
        case r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT;
        case r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_VIEW_CONTENT;
        case r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_VIEW_CONTENT_VALUE_IN_DOLLAR;
        case r'IDEA_PIN_PAGE_FORWARD_1': return TemplateResponseColumnsEnum.iDEAPINPAGEFORWARD1;
        case r'IDEA_PIN_PAGE_FORWARD_2': return TemplateResponseColumnsEnum.iDEAPINPAGEFORWARD2;
        case r'IDEA_PIN_PAGE_BACKWARD_1': return TemplateResponseColumnsEnum.iDEAPINPAGEBACKWARD1;
        case r'IDEA_PIN_PAGE_BACKWARD_2': return TemplateResponseColumnsEnum.iDEAPINPAGEBACKWARD2;
        case r'TOTAL_IDEA_PIN_PAGE_FORWARD': return TemplateResponseColumnsEnum.TOTAL_IDEA_PIN_PAGE_FORWARD;
        case r'TOTAL_IDEA_PIN_PAGE_BACKWARD': return TemplateResponseColumnsEnum.TOTAL_IDEA_PIN_PAGE_BACKWARD;
        case r'IDEA_PIN_PRODUCT_TAG_VISIT_1': return TemplateResponseColumnsEnum.iDEAPINPRODUCTTAGVISIT1;
        case r'IDEA_PIN_PRODUCT_TAG_VISIT_2': return TemplateResponseColumnsEnum.iDEAPINPRODUCTTAGVISIT2;
        case r'TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT': return TemplateResponseColumnsEnum.TOTAL_IDEA_PIN_PRODUCT_TAG_VISIT;
        case r'CPM_IN_US_DOLLAR': return TemplateResponseColumnsEnum.CPM_IN_US_DOLLAR;
        case r'ECPC_IN_US_DOLLAR': return TemplateResponseColumnsEnum.ECPC_IN_US_DOLLAR;
        case r'LEADS': return TemplateResponseColumnsEnum.LEADS;
        case r'COST_PER_LEAD': return TemplateResponseColumnsEnum.COST_PER_LEAD;
        case r'QUIZ_STARTED': return TemplateResponseColumnsEnum.QUIZ_STARTED;
        case r'QUIZ_COMPLETED': return TemplateResponseColumnsEnum.QUIZ_COMPLETED;
        case r'QUIZ_PIN_RESULT_OPEN': return TemplateResponseColumnsEnum.QUIZ_PIN_RESULT_OPEN;
        case r'QUIZ_COMPLETION_RATE': return TemplateResponseColumnsEnum.QUIZ_COMPLETION_RATE;
        case r'SHOWCASE_PIN_CLICKTHROUGH': return TemplateResponseColumnsEnum.SHOWCASE_PIN_CLICKTHROUGH;
        case r'SHOWCASE_SUBPAGE_CLICKTHROUGH': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_CLICKTHROUGH;
        case r'SHOWCASE_SUBPIN_CLICKTHROUGH': return TemplateResponseColumnsEnum.SHOWCASE_SUBPIN_CLICKTHROUGH;
        case r'SHOWCASE_SUBPAGE_IMPRESSION': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_IMPRESSION;
        case r'SHOWCASE_SUBPIN_IMPRESSION': return TemplateResponseColumnsEnum.SHOWCASE_SUBPIN_IMPRESSION;
        case r'SHOWCASE_SUBPAGE_SWIPE_LEFT': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_SWIPE_LEFT;
        case r'SHOWCASE_SUBPAGE_SWIPE_RIGHT': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_SWIPE_RIGHT;
        case r'SHOWCASE_SUBPIN_SWIPE_LEFT': return TemplateResponseColumnsEnum.SHOWCASE_SUBPIN_SWIPE_LEFT;
        case r'SHOWCASE_SUBPIN_SWIPE_RIGHT': return TemplateResponseColumnsEnum.SHOWCASE_SUBPIN_SWIPE_RIGHT;
        case r'SHOWCASE_SUBPAGE_REPIN': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_REPIN;
        case r'SHOWCASE_SUBPIN_REPIN': return TemplateResponseColumnsEnum.SHOWCASE_SUBPIN_REPIN;
        case r'SHOWCASE_SUBPAGE_CLOSEUP': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_CLOSEUP;
        case r'SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD': return TemplateResponseColumnsEnum.SHOWCASE_CARD_THUMBNAIL_SWIPE_FORWARD;
        case r'SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD': return TemplateResponseColumnsEnum.SHOWCASE_CARD_THUMBNAIL_SWIPE_BACKWARD;
        case r'_SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL': return TemplateResponseColumnsEnum.SHOWCASE_SUBPAGE_CLOSEUP_INTERNAL;
        case r'SHOWCASE_CARD_LANDING': return TemplateResponseColumnsEnum.SHOWCASE_CARD_LANDING;
        case r'SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION': return TemplateResponseColumnsEnum.SHOWCASE_AVERAGE_SUBPAGE_CLOSEUP_PER_SESSION;
        case r'TOTAL_CHECKOUT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_RATE;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_RATE;
        case r'TOTAL_ADD_TO_CART_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_RATE;
        case r'TOTAL_SIGNUP_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_RATE;
        case r'TOTAL_PAGE_VISIT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_RATE;
        case r'TOTAL_LEAD_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_RATE;
        case r'TOTAL_SEARCH_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_RATE;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_RATE;
        case r'TOTAL_UNKNOWN_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_RATE;
        case r'TOTAL_CUSTOM_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_RATE;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_RATE;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_RATE;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_RATE;
        case r'TOTAL_SUBSCRIBE_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_RATE;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_RATE;
        case r'STANDARD_AD_FEED_ITEM_ID': return TemplateResponseColumnsEnum.STANDARD_AD_FEED_ITEM_ID;
        case r'IS_STANDARD_FEED_AD': return TemplateResponseColumnsEnum.IS_STANDARD_FEED_AD;
        case r'TARGETING_GENDER': return TemplateResponseColumnsEnum.TARGETING_GENDER;
        case r'TARGETING_CREATIVE_TYPE': return TemplateResponseColumnsEnum.TARGETING_CREATIVE_TYPE;
        case r'TARGETING_COUNTRY': return TemplateResponseColumnsEnum.TARGETING_COUNTRY;
        case r'TARGETING_LOCATION': return TemplateResponseColumnsEnum.TARGETING_LOCATION;
        case r'TARGETING_APPTYPE': return TemplateResponseColumnsEnum.TARGETING_APPTYPE;
        case r'TARGETING_LOCATION_CODE': return TemplateResponseColumnsEnum.TARGETING_LOCATION_CODE;
        case r'TARGETING_MEDIA_TYPE': return TemplateResponseColumnsEnum.TARGETING_MEDIA_TYPE;
        case r'TARGETING_AGE_BUCKET': return TemplateResponseColumnsEnum.TARGETING_AGE_BUCKET;
        case r'TARGETING_AUDIENCE_MULTIPLIER': return TemplateResponseColumnsEnum.TARGETING_AUDIENCE_MULTIPLIER;
        case r'TARGETING_LOCAL_ADS_STORE_CODE': return TemplateResponseColumnsEnum.TARGETING_LOCAL_ADS_STORE_CODE;
        case r'TARGETING_LANGUAGES_INCLUDE': return TemplateResponseColumnsEnum.TARGETING_LANGUAGES_INCLUDE;
        case r'TARGETING_LANGUAGES_EXCLUDE': return TemplateResponseColumnsEnum.TARGETING_LANGUAGES_EXCLUDE;
        case r'TOTAL_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_CART_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_PAGE_VISIT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SIGNUP_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_WATCH_VIDEO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_LEAD_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SEARCH_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CATEGORY_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOM_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_UNKNOWN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_PAYMENT_INFO_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ADD_TO_WISHLIST_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_INITIATE_CHECKOUT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBSCRIBE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTENT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'GEN_AI_IMAGE_SIGNATURE': return TemplateResponseColumnsEnum.GEN_AI_IMAGE_SIGNATURE;
        case r'GEN_AI_IMAGE_URL': return TemplateResponseColumnsEnum.GEN_AI_IMAGE_URL;
        case r'ORIGINAL_IMAGE_SIGNATURE': return TemplateResponseColumnsEnum.ORIGINAL_IMAGE_SIGNATURE;
        case r'ORIGINAL_IMAGE_URL': return TemplateResponseColumnsEnum.ORIGINAL_IMAGE_URL;
        case r'GEN_AI_GENERATION_DATE': return TemplateResponseColumnsEnum.GEN_AI_GENERATION_DATE;
        case r'IS_REGENERATING': return TemplateResponseColumnsEnum.IS_REGENERATING;
        case r'GEN_AI_IMAGE_COUNT': return TemplateResponseColumnsEnum.GEN_AI_IMAGE_COUNT;
        case r'ADVERTISER_TIME_ZONE': return TemplateResponseColumnsEnum.ADVERTISER_TIME_ZONE;
        case r'ENGAGEMENT_CONTACT_1': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACT1;
        case r'CLICK_CONTACT_1': return TemplateResponseColumnsEnum.cLICKCONTACT1;
        case r'VIEW_CONTACT_1': return TemplateResponseColumnsEnum.vIEWCONTACT1;
        case r'ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACTVALUEINMICRODOLLAR1;
        case r'CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKCONTACTVALUEINMICRODOLLAR1;
        case r'VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWCONTACTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_CONTACT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACTQUANTITY1;
        case r'CLICK_CONTACT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKCONTACTQUANTITY1;
        case r'VIEW_CONTACT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWCONTACTQUANTITY1;
        case r'ENGAGEMENT_CONTACT_2': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACT2;
        case r'CLICK_CONTACT_2': return TemplateResponseColumnsEnum.cLICKCONTACT2;
        case r'VIEW_CONTACT_2': return TemplateResponseColumnsEnum.vIEWCONTACT2;
        case r'ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACTVALUEINMICRODOLLAR2;
        case r'CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKCONTACTVALUEINMICRODOLLAR2;
        case r'VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWCONTACTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_CONTACT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTCONTACTQUANTITY2;
        case r'CLICK_CONTACT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKCONTACTQUANTITY2;
        case r'VIEW_CONTACT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWCONTACTQUANTITY2;
        case r'TOTAL_ENGAGEMENT_CONTACT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CONTACT;
        case r'TOTAL_CLICK_CONTACT': return TemplateResponseColumnsEnum.TOTAL_CLICK_CONTACT;
        case r'TOTAL_VIEW_CONTACT': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTACT;
        case r'TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CONTACT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CONTACT_QUANTITY;
        case r'TOTAL_CLICK_CONTACT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_CONTACT_QUANTITY;
        case r'TOTAL_VIEW_CONTACT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CONTACT_QUANTITY;
        case r'TOTAL_CONTACT': return TemplateResponseColumnsEnum.TOTAL_CONTACT;
        case r'TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CONTACT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CONTACT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CONTACT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CONTACT_QUANTITY;
        case r'TOTAL_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CONTACT_VALUE_IN_DOLLAR;
        case r'CONTACT_COST_PER_ACTION': return TemplateResponseColumnsEnum.CONTACT_COST_PER_ACTION;
        case r'CONTACT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.CONTACT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'CONTACT_ROAS': return TemplateResponseColumnsEnum.CONTACT_ROAS;
        case r'TOTAL_CONTACT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_RATE;
        case r'WEB_CONTACT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_CONTACT_COST_PER_ACTION;
        case r'WEB_CONTACT_ROAS': return TemplateResponseColumnsEnum.WEB_CONTACT_ROAS;
        case r'TOTAL_WEB_CONTACT': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT;
        case r'TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_CONTACT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CONTACT;
        case r'TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CONTACT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CONTACT;
        case r'TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_CONTACT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTACT;
        case r'TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CONTACT_VALUE_IN_DOLLAR;
        case r'INAPP_CONTACT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_CONTACT_COST_PER_ACTION;
        case r'INAPP_CONTACT_ROAS': return TemplateResponseColumnsEnum.INAPP_CONTACT_ROAS;
        case r'TOTAL_INAPP_CONTACT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT;
        case r'TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CONTACT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CONTACT;
        case r'TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CONTACT': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CONTACT;
        case r'TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CONTACT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTACT;
        case r'TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CONTACT_VALUE_IN_DOLLAR;
        case r'OFFLINE_CONTACT_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_CONTACT_COST_PER_ACTION;
        case r'OFFLINE_CONTACT_ROAS': return TemplateResponseColumnsEnum.OFFLINE_CONTACT_ROAS;
        case r'TOTAL_OFFLINE_CONTACT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT;
        case r'TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CONTACT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CONTACT;
        case r'TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CONTACT;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CONTACT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTACT;
        case r'TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CONTACT_VALUE_IN_DOLLAR;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CONTACT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_SCHEDULE_1': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULE1;
        case r'CLICK_SCHEDULE_1': return TemplateResponseColumnsEnum.cLICKSCHEDULE1;
        case r'VIEW_SCHEDULE_1': return TemplateResponseColumnsEnum.vIEWSCHEDULE1;
        case r'ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR1;
        case r'CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSCHEDULEVALUEINMICRODOLLAR1;
        case r'VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSCHEDULEVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_SCHEDULE_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULEQUANTITY1;
        case r'CLICK_SCHEDULE_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSCHEDULEQUANTITY1;
        case r'VIEW_SCHEDULE_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSCHEDULEQUANTITY1;
        case r'ENGAGEMENT_SCHEDULE_2': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULE2;
        case r'CLICK_SCHEDULE_2': return TemplateResponseColumnsEnum.cLICKSCHEDULE2;
        case r'VIEW_SCHEDULE_2': return TemplateResponseColumnsEnum.vIEWSCHEDULE2;
        case r'ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULEVALUEINMICRODOLLAR2;
        case r'CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSCHEDULEVALUEINMICRODOLLAR2;
        case r'VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSCHEDULEVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_SCHEDULE_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSCHEDULEQUANTITY2;
        case r'CLICK_SCHEDULE_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSCHEDULEQUANTITY2;
        case r'VIEW_SCHEDULE_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSCHEDULEQUANTITY2;
        case r'TOTAL_ENGAGEMENT_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SCHEDULE;
        case r'TOTAL_CLICK_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_CLICK_SCHEDULE;
        case r'TOTAL_VIEW_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_VIEW_SCHEDULE;
        case r'TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SCHEDULE_QUANTITY;
        case r'TOTAL_CLICK_SCHEDULE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_SCHEDULE_QUANTITY;
        case r'TOTAL_VIEW_SCHEDULE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_SCHEDULE_QUANTITY;
        case r'TOTAL_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE;
        case r'TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SCHEDULE_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_QUANTITY;
        case r'TOTAL_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_VALUE_IN_DOLLAR;
        case r'SCHEDULE_COST_PER_ACTION': return TemplateResponseColumnsEnum.SCHEDULE_COST_PER_ACTION;
        case r'SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SCHEDULE_COST_PER_ACTION_IN_US_DOLLAR;
        case r'SCHEDULE_ROAS': return TemplateResponseColumnsEnum.SCHEDULE_ROAS;
        case r'TOTAL_SCHEDULE_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_RATE;
        case r'WEB_SCHEDULE_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_SCHEDULE_COST_PER_ACTION;
        case r'WEB_SCHEDULE_ROAS': return TemplateResponseColumnsEnum.WEB_SCHEDULE_ROAS;
        case r'TOTAL_WEB_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE;
        case r'TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SCHEDULE;
        case r'TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SCHEDULE;
        case r'TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SCHEDULE;
        case r'TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SCHEDULE_VALUE_IN_DOLLAR;
        case r'INAPP_SCHEDULE_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SCHEDULE_COST_PER_ACTION;
        case r'INAPP_SCHEDULE_ROAS': return TemplateResponseColumnsEnum.INAPP_SCHEDULE_ROAS;
        case r'TOTAL_INAPP_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE;
        case r'TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SCHEDULE;
        case r'TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SCHEDULE;
        case r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SCHEDULE;
        case r'TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SCHEDULE_VALUE_IN_DOLLAR;
        case r'OFFLINE_SCHEDULE_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_SCHEDULE_COST_PER_ACTION;
        case r'OFFLINE_SCHEDULE_ROAS': return TemplateResponseColumnsEnum.OFFLINE_SCHEDULE_ROAS;
        case r'TOTAL_OFFLINE_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE;
        case r'TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SCHEDULE;
        case r'TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SCHEDULE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SCHEDULE;
        case r'TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SCHEDULE_VALUE_IN_DOLLAR;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SCHEDULE_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_FIND_LOCATION_1': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATION1;
        case r'CLICK_FIND_LOCATION_1': return TemplateResponseColumnsEnum.cLICKFINDLOCATION1;
        case r'VIEW_FIND_LOCATION_1': return TemplateResponseColumnsEnum.vIEWFINDLOCATION1;
        case r'ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR1;
        case r'CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKFINDLOCATIONVALUEINMICRODOLLAR1;
        case r'VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWFINDLOCATIONVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_FIND_LOCATION_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATIONQUANTITY1;
        case r'CLICK_FIND_LOCATION_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKFINDLOCATIONQUANTITY1;
        case r'VIEW_FIND_LOCATION_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWFINDLOCATIONQUANTITY1;
        case r'ENGAGEMENT_FIND_LOCATION_2': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATION2;
        case r'CLICK_FIND_LOCATION_2': return TemplateResponseColumnsEnum.cLICKFINDLOCATION2;
        case r'VIEW_FIND_LOCATION_2': return TemplateResponseColumnsEnum.vIEWFINDLOCATION2;
        case r'ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATIONVALUEINMICRODOLLAR2;
        case r'CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKFINDLOCATIONVALUEINMICRODOLLAR2;
        case r'VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWFINDLOCATIONVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_FIND_LOCATION_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTFINDLOCATIONQUANTITY2;
        case r'CLICK_FIND_LOCATION_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKFINDLOCATIONQUANTITY2;
        case r'VIEW_FIND_LOCATION_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWFINDLOCATIONQUANTITY2;
        case r'TOTAL_ENGAGEMENT_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_FIND_LOCATION;
        case r'TOTAL_CLICK_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_CLICK_FIND_LOCATION;
        case r'TOTAL_VIEW_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_VIEW_FIND_LOCATION;
        case r'TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_FIND_LOCATION_QUANTITY;
        case r'TOTAL_CLICK_FIND_LOCATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_FIND_LOCATION_QUANTITY;
        case r'TOTAL_VIEW_FIND_LOCATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_FIND_LOCATION_QUANTITY;
        case r'TOTAL_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION;
        case r'TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_FIND_LOCATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_QUANTITY;
        case r'TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'FIND_LOCATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.FIND_LOCATION_COST_PER_ACTION;
        case r'FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.FIND_LOCATION_COST_PER_ACTION_IN_US_DOLLAR;
        case r'FIND_LOCATION_ROAS': return TemplateResponseColumnsEnum.FIND_LOCATION_ROAS;
        case r'TOTAL_FIND_LOCATION_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_RATE;
        case r'WEB_FIND_LOCATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_FIND_LOCATION_COST_PER_ACTION;
        case r'WEB_FIND_LOCATION_ROAS': return TemplateResponseColumnsEnum.WEB_FIND_LOCATION_ROAS;
        case r'TOTAL_WEB_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION;
        case r'TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_FIND_LOCATION;
        case r'TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_FIND_LOCATION;
        case r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_FIND_LOCATION;
        case r'TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'INAPP_FIND_LOCATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_FIND_LOCATION_COST_PER_ACTION;
        case r'INAPP_FIND_LOCATION_ROAS': return TemplateResponseColumnsEnum.INAPP_FIND_LOCATION_ROAS;
        case r'TOTAL_INAPP_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION;
        case r'TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_FIND_LOCATION;
        case r'TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION;
        case r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_FIND_LOCATION;
        case r'TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'OFFLINE_FIND_LOCATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_FIND_LOCATION_COST_PER_ACTION;
        case r'OFFLINE_FIND_LOCATION_ROAS': return TemplateResponseColumnsEnum.OFFLINE_FIND_LOCATION_ROAS;
        case r'TOTAL_OFFLINE_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION;
        case r'TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_FIND_LOCATION;
        case r'TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION;
        case r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_FIND_LOCATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_FIND_LOCATION;
        case r'TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_FIND_LOCATION_VALUE_IN_DOLLAR;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_FIND_LOCATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCT1;
        case r'CLICK_CUSTOMIZE_PRODUCT_1': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCT1;
        case r'VIEW_CUSTOMIZE_PRODUCT_1': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCT1;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1;
        case r'CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1;
        case r'VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY1;
        case r'CLICK_CUSTOMIZE_PRODUCT_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCTQUANTITY1;
        case r'VIEW_CUSTOMIZE_PRODUCT_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCTQUANTITY1;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCT2;
        case r'CLICK_CUSTOMIZE_PRODUCT_2': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCT2;
        case r'VIEW_CUSTOMIZE_PRODUCT_2': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCT2;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2;
        case r'CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2;
        case r'VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCTVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTCUSTOMIZEPRODUCTQUANTITY2;
        case r'CLICK_CUSTOMIZE_PRODUCT_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKCUSTOMIZEPRODUCTQUANTITY2;
        case r'VIEW_CUSTOMIZE_PRODUCT_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWCUSTOMIZEPRODUCTQUANTITY2;
        case r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT;
        case r'TOTAL_CLICK_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOMIZE_PRODUCT;
        case r'TOTAL_VIEW_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOMIZE_PRODUCT;
        case r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_CUSTOMIZE_PRODUCT_QUANTITY;
        case r'TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_CUSTOMIZE_PRODUCT_QUANTITY;
        case r'TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_CUSTOMIZE_PRODUCT_QUANTITY;
        case r'TOTAL_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT;
        case r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_CUSTOMIZE_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_QUANTITY;
        case r'TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'CUSTOMIZE_PRODUCT_COST_PER_ACTION': return TemplateResponseColumnsEnum.CUSTOMIZE_PRODUCT_COST_PER_ACTION;
        case r'CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.CUSTOMIZE_PRODUCT_COST_PER_ACTION_IN_US_DOLLAR;
        case r'CUSTOMIZE_PRODUCT_ROAS': return TemplateResponseColumnsEnum.CUSTOMIZE_PRODUCT_ROAS;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_RATE;
        case r'WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_CUSTOMIZE_PRODUCT_COST_PER_ACTION;
        case r'WEB_CUSTOMIZE_PRODUCT_ROAS': return TemplateResponseColumnsEnum.WEB_CUSTOMIZE_PRODUCT_ROAS;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT;
        case r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT;
        case r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_CUSTOMIZE_PRODUCT_COST_PER_ACTION;
        case r'INAPP_CUSTOMIZE_PRODUCT_ROAS': return TemplateResponseColumnsEnum.INAPP_CUSTOMIZE_PRODUCT_ROAS;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT;
        case r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT;
        case r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT;
        case r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_CUSTOMIZE_PRODUCT_COST_PER_ACTION;
        case r'OFFLINE_CUSTOMIZE_PRODUCT_ROAS': return TemplateResponseColumnsEnum.OFFLINE_CUSTOMIZE_PRODUCT_ROAS;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT;
        case r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT;
        case r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_CUSTOMIZE_PRODUCT_VALUE_IN_DOLLAR;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CUSTOMIZE_PRODUCT_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATION1;
        case r'CLICK_SUBMIT_APPLICATION_1': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATION1;
        case r'VIEW_SUBMIT_APPLICATION_1': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATION1;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR1;
        case r'CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR1;
        case r'VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATIONQUANTITY1;
        case r'CLICK_SUBMIT_APPLICATION_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATIONQUANTITY1;
        case r'VIEW_SUBMIT_APPLICATION_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATIONQUANTITY1;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATION2;
        case r'CLICK_SUBMIT_APPLICATION_2': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATION2;
        case r'VIEW_SUBMIT_APPLICATION_2': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATION2;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATIONVALUEINMICRODOLLAR2;
        case r'CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATIONVALUEINMICRODOLLAR2;
        case r'VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATIONVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSUBMITAPPLICATIONQUANTITY2;
        case r'CLICK_SUBMIT_APPLICATION_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSUBMITAPPLICATIONQUANTITY2;
        case r'VIEW_SUBMIT_APPLICATION_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSUBMITAPPLICATIONQUANTITY2;
        case r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBMIT_APPLICATION;
        case r'TOTAL_CLICK_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBMIT_APPLICATION;
        case r'TOTAL_VIEW_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBMIT_APPLICATION;
        case r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_SUBMIT_APPLICATION_QUANTITY;
        case r'TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_SUBMIT_APPLICATION_QUANTITY;
        case r'TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_SUBMIT_APPLICATION_QUANTITY;
        case r'TOTAL_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION;
        case r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_SUBMIT_APPLICATION_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_QUANTITY;
        case r'TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'SUBMIT_APPLICATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.SUBMIT_APPLICATION_COST_PER_ACTION;
        case r'SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.SUBMIT_APPLICATION_COST_PER_ACTION_IN_US_DOLLAR;
        case r'SUBMIT_APPLICATION_ROAS': return TemplateResponseColumnsEnum.SUBMIT_APPLICATION_ROAS;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_RATE;
        case r'WEB_SUBMIT_APPLICATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_SUBMIT_APPLICATION_COST_PER_ACTION;
        case r'WEB_SUBMIT_APPLICATION_ROAS': return TemplateResponseColumnsEnum.WEB_SUBMIT_APPLICATION_ROAS;
        case r'TOTAL_WEB_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBMIT_APPLICATION;
        case r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION;
        case r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBMIT_APPLICATION;
        case r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'INAPP_SUBMIT_APPLICATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_SUBMIT_APPLICATION_COST_PER_ACTION;
        case r'INAPP_SUBMIT_APPLICATION_ROAS': return TemplateResponseColumnsEnum.INAPP_SUBMIT_APPLICATION_ROAS;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBMIT_APPLICATION;
        case r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBMIT_APPLICATION;
        case r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_SUBMIT_APPLICATION_COST_PER_ACTION;
        case r'OFFLINE_SUBMIT_APPLICATION_ROAS': return TemplateResponseColumnsEnum.OFFLINE_SUBMIT_APPLICATION_ROAS;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION;
        case r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION;
        case r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_SUBMIT_APPLICATION_VALUE_IN_DOLLAR;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_SUBMIT_APPLICATION_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_START_TRIAL_1': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIAL1;
        case r'CLICK_START_TRIAL_1': return TemplateResponseColumnsEnum.cLICKSTARTTRIAL1;
        case r'VIEW_START_TRIAL_1': return TemplateResponseColumnsEnum.vIEWSTARTTRIAL1;
        case r'ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR1;
        case r'CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKSTARTTRIALVALUEINMICRODOLLAR1;
        case r'VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWSTARTTRIALVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_START_TRIAL_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIALQUANTITY1;
        case r'CLICK_START_TRIAL_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKSTARTTRIALQUANTITY1;
        case r'VIEW_START_TRIAL_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWSTARTTRIALQUANTITY1;
        case r'ENGAGEMENT_START_TRIAL_2': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIAL2;
        case r'CLICK_START_TRIAL_2': return TemplateResponseColumnsEnum.cLICKSTARTTRIAL2;
        case r'VIEW_START_TRIAL_2': return TemplateResponseColumnsEnum.vIEWSTARTTRIAL2;
        case r'ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIALVALUEINMICRODOLLAR2;
        case r'CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKSTARTTRIALVALUEINMICRODOLLAR2;
        case r'VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWSTARTTRIALVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_START_TRIAL_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTSTARTTRIALQUANTITY2;
        case r'CLICK_START_TRIAL_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKSTARTTRIALQUANTITY2;
        case r'VIEW_START_TRIAL_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWSTARTTRIALQUANTITY2;
        case r'TOTAL_ENGAGEMENT_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_START_TRIAL;
        case r'TOTAL_CLICK_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_CLICK_START_TRIAL;
        case r'TOTAL_VIEW_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_VIEW_START_TRIAL;
        case r'TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_START_TRIAL_QUANTITY;
        case r'TOTAL_CLICK_START_TRIAL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_START_TRIAL_QUANTITY;
        case r'TOTAL_VIEW_START_TRIAL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_START_TRIAL_QUANTITY;
        case r'TOTAL_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL;
        case r'TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_START_TRIAL_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_QUANTITY;
        case r'TOTAL_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_VALUE_IN_DOLLAR;
        case r'START_TRIAL_COST_PER_ACTION': return TemplateResponseColumnsEnum.START_TRIAL_COST_PER_ACTION;
        case r'START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.START_TRIAL_COST_PER_ACTION_IN_US_DOLLAR;
        case r'START_TRIAL_ROAS': return TemplateResponseColumnsEnum.START_TRIAL_ROAS;
        case r'TOTAL_START_TRIAL_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_RATE;
        case r'WEB_START_TRIAL_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_START_TRIAL_COST_PER_ACTION;
        case r'WEB_START_TRIAL_ROAS': return TemplateResponseColumnsEnum.WEB_START_TRIAL_ROAS;
        case r'TOTAL_WEB_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL;
        case r'TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_START_TRIAL;
        case r'TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_START_TRIAL;
        case r'TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_START_TRIAL;
        case r'TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_START_TRIAL_VALUE_IN_DOLLAR;
        case r'INAPP_START_TRIAL_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_START_TRIAL_COST_PER_ACTION;
        case r'INAPP_START_TRIAL_ROAS': return TemplateResponseColumnsEnum.INAPP_START_TRIAL_ROAS;
        case r'TOTAL_INAPP_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL;
        case r'TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_START_TRIAL;
        case r'TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_START_TRIAL;
        case r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_START_TRIAL;
        case r'TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_START_TRIAL_VALUE_IN_DOLLAR;
        case r'OFFLINE_START_TRIAL_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_START_TRIAL_COST_PER_ACTION;
        case r'OFFLINE_START_TRIAL_ROAS': return TemplateResponseColumnsEnum.OFFLINE_START_TRIAL_ROAS;
        case r'TOTAL_OFFLINE_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL;
        case r'TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_START_TRIAL;
        case r'TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL;
        case r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_START_TRIAL': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_START_TRIAL;
        case r'TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_START_TRIAL_VALUE_IN_DOLLAR;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_START_TRIAL_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'ENGAGEMENT_APP_OPEN_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPEN1;
        case r'CLICK_APP_OPEN_1': return TemplateResponseColumnsEnum.cLICKAPPOPEN1;
        case r'VIEW_APP_OPEN_1': return TemplateResponseColumnsEnum.vIEWAPPOPEN1;
        case r'ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPENVALUEINMICRODOLLAR1;
        case r'CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.cLICKAPPOPENVALUEINMICRODOLLAR1;
        case r'VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_1': return TemplateResponseColumnsEnum.vIEWAPPOPENVALUEINMICRODOLLAR1;
        case r'ENGAGEMENT_APP_OPEN_QUANTITY_1': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPENQUANTITY1;
        case r'CLICK_APP_OPEN_QUANTITY_1': return TemplateResponseColumnsEnum.cLICKAPPOPENQUANTITY1;
        case r'VIEW_APP_OPEN_QUANTITY_1': return TemplateResponseColumnsEnum.vIEWAPPOPENQUANTITY1;
        case r'ENGAGEMENT_APP_OPEN_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPEN2;
        case r'CLICK_APP_OPEN_2': return TemplateResponseColumnsEnum.cLICKAPPOPEN2;
        case r'VIEW_APP_OPEN_2': return TemplateResponseColumnsEnum.vIEWAPPOPEN2;
        case r'ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPENVALUEINMICRODOLLAR2;
        case r'CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.cLICKAPPOPENVALUEINMICRODOLLAR2;
        case r'VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR_2': return TemplateResponseColumnsEnum.vIEWAPPOPENVALUEINMICRODOLLAR2;
        case r'ENGAGEMENT_APP_OPEN_QUANTITY_2': return TemplateResponseColumnsEnum.eNGAGEMENTAPPOPENQUANTITY2;
        case r'CLICK_APP_OPEN_QUANTITY_2': return TemplateResponseColumnsEnum.cLICKAPPOPENQUANTITY2;
        case r'VIEW_APP_OPEN_QUANTITY_2': return TemplateResponseColumnsEnum.vIEWAPPOPENQUANTITY2;
        case r'TOTAL_ENGAGEMENT_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_OPEN;
        case r'TOTAL_CLICK_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_OPEN;
        case r'TOTAL_VIEW_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_OPEN;
        case r'TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_ENGAGEMENT_APP_OPEN_QUANTITY;
        case r'TOTAL_CLICK_APP_OPEN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_CLICK_APP_OPEN_QUANTITY;
        case r'TOTAL_VIEW_APP_OPEN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_VIEW_APP_OPEN_QUANTITY;
        case r'TOTAL_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN;
        case r'TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.AVERAGE_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_VALUE_IN_MICRO_US_DOLLAR;
        case r'TOTAL_APP_OPEN_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_QUANTITY;
        case r'TOTAL_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_VALUE_IN_DOLLAR;
        case r'APP_OPEN_COST_PER_ACTION': return TemplateResponseColumnsEnum.APP_OPEN_COST_PER_ACTION;
        case r'APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR': return TemplateResponseColumnsEnum.APP_OPEN_COST_PER_ACTION_IN_US_DOLLAR;
        case r'APP_OPEN_ROAS': return TemplateResponseColumnsEnum.APP_OPEN_ROAS;
        case r'TOTAL_APP_OPEN_CONVERSION_RATE': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_RATE;
        case r'WEB_APP_OPEN_COST_PER_ACTION': return TemplateResponseColumnsEnum.WEB_APP_OPEN_COST_PER_ACTION;
        case r'WEB_APP_OPEN_ROAS': return TemplateResponseColumnsEnum.WEB_APP_OPEN_ROAS;
        case r'TOTAL_WEB_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN;
        case r'TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_CLICK_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_APP_OPEN;
        case r'TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_CLICK_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_APP_OPEN;
        case r'TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_WEB_VIEW_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_APP_OPEN;
        case r'TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_WEB_VIEW_APP_OPEN_VALUE_IN_DOLLAR;
        case r'INAPP_APP_OPEN_COST_PER_ACTION': return TemplateResponseColumnsEnum.INAPP_APP_OPEN_COST_PER_ACTION;
        case r'INAPP_APP_OPEN_ROAS': return TemplateResponseColumnsEnum.INAPP_APP_OPEN_ROAS;
        case r'TOTAL_INAPP_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN;
        case r'TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_CLICK_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_OPEN;
        case r'TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_CLICK_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_OPEN;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_INAPP_VIEW_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_OPEN;
        case r'TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_INAPP_VIEW_APP_OPEN_VALUE_IN_DOLLAR;
        case r'OFFLINE_APP_OPEN_COST_PER_ACTION': return TemplateResponseColumnsEnum.OFFLINE_APP_OPEN_COST_PER_ACTION;
        case r'OFFLINE_APP_OPEN_ROAS': return TemplateResponseColumnsEnum.OFFLINE_APP_OPEN_ROAS;
        case r'TOTAL_OFFLINE_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN;
        case r'TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_APP_OPEN;
        case r'TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_CLICK_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN;
        case r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_ENGAGEMENT_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_APP_OPEN': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_APP_OPEN;
        case r'TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_MICRO_DOLLAR;
        case r'TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_VIEW_APP_OPEN_VALUE_IN_DOLLAR;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_COUNT_UNIQUE;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_WEB_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_INAPP_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_QUANTITY;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_UNITS;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_USD;
        case r'TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD': return TemplateResponseColumnsEnum.TOTAL_OFFLINE_APP_OPEN_CONVERSION_PRODUCT_VALUE_IN_MICRO_USD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseColumnsEnumTypeTransformer] instance.
  static TemplateResponseColumnsEnumTypeTransformer? _instance;
}


/// Conversion report time type
class TemplateResponseConversionReportTimeTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseConversionReportTimeTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TIME_OF_AD_ACTION = TemplateResponseConversionReportTimeTypeEnum._(r'TIME_OF_AD_ACTION');
  static const TIME_OF_CONVERSION = TemplateResponseConversionReportTimeTypeEnum._(r'TIME_OF_CONVERSION');

  /// List of all possible values in this [enum][TemplateResponseConversionReportTimeTypeEnum].
  static const values = <TemplateResponseConversionReportTimeTypeEnum>[
    TIME_OF_AD_ACTION,
    TIME_OF_CONVERSION,
  ];

  static TemplateResponseConversionReportTimeTypeEnum? fromJson(dynamic value) => TemplateResponseConversionReportTimeTypeEnumTypeTransformer().decode(value);

  static List<TemplateResponseConversionReportTimeTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseConversionReportTimeTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseConversionReportTimeTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseConversionReportTimeTypeEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseConversionReportTimeTypeEnum].
class TemplateResponseConversionReportTimeTypeEnumTypeTransformer {
  factory TemplateResponseConversionReportTimeTypeEnumTypeTransformer() => _instance ??= const TemplateResponseConversionReportTimeTypeEnumTypeTransformer._();

  const TemplateResponseConversionReportTimeTypeEnumTypeTransformer._();

  String encode(TemplateResponseConversionReportTimeTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseConversionReportTimeTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseConversionReportTimeTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'TIME_OF_AD_ACTION': return TemplateResponseConversionReportTimeTypeEnum.TIME_OF_AD_ACTION;
        case r'TIME_OF_CONVERSION': return TemplateResponseConversionReportTimeTypeEnum.TIME_OF_CONVERSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseConversionReportTimeTypeEnumTypeTransformer] instance.
  static TemplateResponseConversionReportTimeTypeEnumTypeTransformer? _instance;
}


/// The surface used to create this template
class TemplateResponseCreationSourceEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseCreationSourceEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADS_API = TemplateResponseCreationSourceEnum._(r'ADS_API');
  static const ADS_MANAGER_REPORTING_PAGE = TemplateResponseCreationSourceEnum._(r'ADS_MANAGER_REPORTING_PAGE');
  static const ADS_MANAGER_REPORT_BUILDER = TemplateResponseCreationSourceEnum._(r'ADS_MANAGER_REPORT_BUILDER');

  /// List of all possible values in this [enum][TemplateResponseCreationSourceEnum].
  static const values = <TemplateResponseCreationSourceEnum>[
    ADS_API,
    ADS_MANAGER_REPORTING_PAGE,
    ADS_MANAGER_REPORT_BUILDER,
  ];

  static TemplateResponseCreationSourceEnum? fromJson(dynamic value) => TemplateResponseCreationSourceEnumTypeTransformer().decode(value);

  static List<TemplateResponseCreationSourceEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseCreationSourceEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseCreationSourceEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseCreationSourceEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseCreationSourceEnum].
class TemplateResponseCreationSourceEnumTypeTransformer {
  factory TemplateResponseCreationSourceEnumTypeTransformer() => _instance ??= const TemplateResponseCreationSourceEnumTypeTransformer._();

  const TemplateResponseCreationSourceEnumTypeTransformer._();

  String encode(TemplateResponseCreationSourceEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseCreationSourceEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseCreationSourceEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ADS_API': return TemplateResponseCreationSourceEnum.ADS_API;
        case r'ADS_MANAGER_REPORTING_PAGE': return TemplateResponseCreationSourceEnum.ADS_MANAGER_REPORTING_PAGE;
        case r'ADS_MANAGER_REPORT_BUILDER': return TemplateResponseCreationSourceEnum.ADS_MANAGER_REPORT_BUILDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseCreationSourceEnumTypeTransformer] instance.
  static TemplateResponseCreationSourceEnumTypeTransformer? _instance;
}


/// The source of conversion events ingestion
class TemplateResponseIngestionSourcesEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseIngestionSourcesEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TAG = TemplateResponseIngestionSourcesEnum._(r'TAG');
  static const MMP = TemplateResponseIngestionSourcesEnum._(r'MMP');
  static const FILE_UPLOAD = TemplateResponseIngestionSourcesEnum._(r'FILE_UPLOAD');
  static const CONVERSIONS_API = TemplateResponseIngestionSourcesEnum._(r'CONVERSIONS_API');
  static const NATIVE = TemplateResponseIngestionSourcesEnum._(r'NATIVE');

  /// List of all possible values in this [enum][TemplateResponseIngestionSourcesEnum].
  static const values = <TemplateResponseIngestionSourcesEnum>[
    TAG,
    MMP,
    FILE_UPLOAD,
    CONVERSIONS_API,
    NATIVE,
  ];

  static TemplateResponseIngestionSourcesEnum? fromJson(dynamic value) => TemplateResponseIngestionSourcesEnumTypeTransformer().decode(value);

  static List<TemplateResponseIngestionSourcesEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseIngestionSourcesEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseIngestionSourcesEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseIngestionSourcesEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseIngestionSourcesEnum].
class TemplateResponseIngestionSourcesEnumTypeTransformer {
  factory TemplateResponseIngestionSourcesEnumTypeTransformer() => _instance ??= const TemplateResponseIngestionSourcesEnumTypeTransformer._();

  const TemplateResponseIngestionSourcesEnumTypeTransformer._();

  String encode(TemplateResponseIngestionSourcesEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseIngestionSourcesEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseIngestionSourcesEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'TAG': return TemplateResponseIngestionSourcesEnum.TAG;
        case r'MMP': return TemplateResponseIngestionSourcesEnum.MMP;
        case r'FILE_UPLOAD': return TemplateResponseIngestionSourcesEnum.FILE_UPLOAD;
        case r'CONVERSIONS_API': return TemplateResponseIngestionSourcesEnum.CONVERSIONS_API;
        case r'NATIVE': return TemplateResponseIngestionSourcesEnum.NATIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseIngestionSourcesEnumTypeTransformer] instance.
  static TemplateResponseIngestionSourcesEnumTypeTransformer? _instance;
}


/// Reporting template type
class TemplateResponseTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const TemplateResponseTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNSPECIFIED = TemplateResponseTypeEnum._(r'UNSPECIFIED');
  static const BULK = TemplateResponseTypeEnum._(r'BULK');
  static const OVERVIEW = TemplateResponseTypeEnum._(r'OVERVIEW');
  static const TABLE = TemplateResponseTypeEnum._(r'TABLE');

  /// List of all possible values in this [enum][TemplateResponseTypeEnum].
  static const values = <TemplateResponseTypeEnum>[
    UNSPECIFIED,
    BULK,
    OVERVIEW,
    TABLE,
  ];

  static TemplateResponseTypeEnum? fromJson(dynamic value) => TemplateResponseTypeEnumTypeTransformer().decode(value);

  static List<TemplateResponseTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TemplateResponseTypeEnum] to String,
/// and [decode] dynamic data back to [TemplateResponseTypeEnum].
class TemplateResponseTypeEnumTypeTransformer {
  factory TemplateResponseTypeEnumTypeTransformer() => _instance ??= const TemplateResponseTypeEnumTypeTransformer._();

  const TemplateResponseTypeEnumTypeTransformer._();

  String encode(TemplateResponseTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a TemplateResponseTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TemplateResponseTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNSPECIFIED': return TemplateResponseTypeEnum.UNSPECIFIED;
        case r'BULK': return TemplateResponseTypeEnum.BULK;
        case r'OVERVIEW': return TemplateResponseTypeEnum.OVERVIEW;
        case r'TABLE': return TemplateResponseTypeEnum.TABLE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TemplateResponseTypeEnumTypeTransformer] instance.
  static TemplateResponseTypeEnumTypeTransformer? _instance;
}


