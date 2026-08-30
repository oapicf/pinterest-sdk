//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AccountTemplate {
  /// Returns a new [AccountTemplate] instance.
  AccountTemplate({
    this.adAccountId,
    this.adAccountIds = const [],
    this.adeColumns = const [],
    this.attributionType,
    this.clickWindowDays,
    this.columns = const [],
    this.conversionReportTimeType,
    this.creationSource,
    this.customColumnIds = const [],
    this.displayMetadata,
    this.engagementWindowDays,
    this.filtersJson,
    this.granularity,
    required this.id,
    this.ingestionSources = const [],
    this.isDefault,
    this.isDeleted,
    this.isOwnedByUser,
    this.isScheduled,
    this.name,
    this.reportEndRelativeDaysInPast,
    this.reportFormat,
    this.reportLevel,
    this.reportStartRelativeDaysInPast,
    this.reportingTimeZone,
    this.sortBy,
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

  /// A list of ADE columns
  List<String> adeColumns;

  /// Attribution type for Brand/Category/SKU reports
  Object? attributionType;

  /// The length of the sliding window over which click conversions will be attributed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? clickWindowDays;

  /// A list of columns to be included in the report
  List<ReportingColumn> columns;

  /// Conversion report time type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionReportTimeType? conversionReportTimeType;

  /// The surface used to create this template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CreationSource? creationSource;

  /// A list of custom column IDs
  List<String>? customColumnIds;

  /// Additional metadata about this reporting template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? displayMetadata;

  /// The length of the sliding window over which engagement conversions will be attributed
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? engagementWindowDays;

  /// A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:\\ \"field\": The column name\\ \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]\\ \"value\": A single value or a list of values
  String? filtersJson;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Granularity? granularity;

  /// Template ID
  String id;

  /// The filter on the conversion ingestion source method for conversion metrics
  List<IngestionSource>? ingestionSources;

  /// A boolean representing if this is the default view that loads for this template type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isDefault;

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

  /// Timezone for reporting data
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ReportingTimeZone? reportingTimeZone;

  /// Unified metric sort configuration
  Object? sortBy;

  /// Type of the template
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

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
  bool operator ==(Object other) => identical(this, other) || other is AccountTemplate &&
    other.adAccountId == adAccountId &&
    _deepEquality.equals(other.adAccountIds, adAccountIds) &&
    _deepEquality.equals(other.adeColumns, adeColumns) &&
    other.attributionType == attributionType &&
    other.clickWindowDays == clickWindowDays &&
    _deepEquality.equals(other.columns, columns) &&
    other.conversionReportTimeType == conversionReportTimeType &&
    other.creationSource == creationSource &&
    _deepEquality.equals(other.customColumnIds, customColumnIds) &&
    other.displayMetadata == displayMetadata &&
    other.engagementWindowDays == engagementWindowDays &&
    other.filtersJson == filtersJson &&
    other.granularity == granularity &&
    other.id == id &&
    _deepEquality.equals(other.ingestionSources, ingestionSources) &&
    other.isDefault == isDefault &&
    other.isDeleted == isDeleted &&
    other.isOwnedByUser == isOwnedByUser &&
    other.isScheduled == isScheduled &&
    other.name == name &&
    other.reportEndRelativeDaysInPast == reportEndRelativeDaysInPast &&
    other.reportFormat == reportFormat &&
    other.reportLevel == reportLevel &&
    other.reportStartRelativeDaysInPast == reportStartRelativeDaysInPast &&
    other.reportingTimeZone == reportingTimeZone &&
    other.sortBy == sortBy &&
    other.type == type &&
    other.updatedTime == updatedTime &&
    other.userId == userId &&
    other.viewWindowDays == viewWindowDays;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adAccountId == null ? 0 : adAccountId!.hashCode) +
    (adAccountIds.hashCode) +
    (adeColumns.hashCode) +
    (attributionType == null ? 0 : attributionType!.hashCode) +
    (clickWindowDays == null ? 0 : clickWindowDays!.hashCode) +
    (columns.hashCode) +
    (conversionReportTimeType == null ? 0 : conversionReportTimeType!.hashCode) +
    (creationSource == null ? 0 : creationSource!.hashCode) +
    (customColumnIds == null ? 0 : customColumnIds!.hashCode) +
    (displayMetadata == null ? 0 : displayMetadata!.hashCode) +
    (engagementWindowDays == null ? 0 : engagementWindowDays!.hashCode) +
    (filtersJson == null ? 0 : filtersJson!.hashCode) +
    (granularity == null ? 0 : granularity!.hashCode) +
    (id.hashCode) +
    (ingestionSources == null ? 0 : ingestionSources!.hashCode) +
    (isDefault == null ? 0 : isDefault!.hashCode) +
    (isDeleted == null ? 0 : isDeleted!.hashCode) +
    (isOwnedByUser == null ? 0 : isOwnedByUser!.hashCode) +
    (isScheduled == null ? 0 : isScheduled!.hashCode) +
    (name == null ? 0 : name!.hashCode) +
    (reportEndRelativeDaysInPast == null ? 0 : reportEndRelativeDaysInPast!.hashCode) +
    (reportFormat == null ? 0 : reportFormat!.hashCode) +
    (reportLevel == null ? 0 : reportLevel!.hashCode) +
    (reportStartRelativeDaysInPast == null ? 0 : reportStartRelativeDaysInPast!.hashCode) +
    (reportingTimeZone == null ? 0 : reportingTimeZone!.hashCode) +
    (sortBy == null ? 0 : sortBy!.hashCode) +
    (type == null ? 0 : type!.hashCode) +
    (updatedTime == null ? 0 : updatedTime!.hashCode) +
    (userId == null ? 0 : userId!.hashCode) +
    (viewWindowDays == null ? 0 : viewWindowDays!.hashCode);

  @override
  String toString() => 'AccountTemplate[adAccountId=$adAccountId, adAccountIds=$adAccountIds, adeColumns=$adeColumns, attributionType=$attributionType, clickWindowDays=$clickWindowDays, columns=$columns, conversionReportTimeType=$conversionReportTimeType, creationSource=$creationSource, customColumnIds=$customColumnIds, displayMetadata=$displayMetadata, engagementWindowDays=$engagementWindowDays, filtersJson=$filtersJson, granularity=$granularity, id=$id, ingestionSources=$ingestionSources, isDefault=$isDefault, isDeleted=$isDeleted, isOwnedByUser=$isOwnedByUser, isScheduled=$isScheduled, name=$name, reportEndRelativeDaysInPast=$reportEndRelativeDaysInPast, reportFormat=$reportFormat, reportLevel=$reportLevel, reportStartRelativeDaysInPast=$reportStartRelativeDaysInPast, reportingTimeZone=$reportingTimeZone, sortBy=$sortBy, type=$type, updatedTime=$updatedTime, userId=$userId, viewWindowDays=$viewWindowDays]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.adAccountId != null) {
      json[r'ad_account_id'] = this.adAccountId;
    } else {
      json[r'ad_account_id'] = null;
    }
      json[r'ad_account_ids'] = this.adAccountIds;
      json[r'ade_columns'] = this.adeColumns;
    if (this.attributionType != null) {
      json[r'attribution_type'] = this.attributionType;
    } else {
      json[r'attribution_type'] = null;
    }
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
    if (this.displayMetadata != null) {
      json[r'display_metadata'] = this.displayMetadata;
    } else {
      json[r'display_metadata'] = null;
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
      json[r'id'] = this.id;
    if (this.ingestionSources != null) {
      json[r'ingestion_sources'] = this.ingestionSources;
    } else {
      json[r'ingestion_sources'] = null;
    }
    if (this.isDefault != null) {
      json[r'is_default'] = this.isDefault;
    } else {
      json[r'is_default'] = null;
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
    if (this.reportingTimeZone != null) {
      json[r'reporting_time_zone'] = this.reportingTimeZone;
    } else {
      json[r'reporting_time_zone'] = null;
    }
    if (this.sortBy != null) {
      json[r'sort_by'] = this.sortBy;
    } else {
      json[r'sort_by'] = null;
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

  /// Returns a new [AccountTemplate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AccountTemplate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "AccountTemplate[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "AccountTemplate[id]" has a null value in JSON.');
        return true;
      }());

      return AccountTemplate(
        adAccountId: mapValueOfType<String>(json, r'ad_account_id'),
        adAccountIds: json[r'ad_account_ids'] is Iterable
            ? (json[r'ad_account_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        adeColumns: json[r'ade_columns'] is Iterable
            ? (json[r'ade_columns'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        attributionType: mapValueOfType<Object>(json, r'attribution_type'),
        clickWindowDays: num.parse('${json[r'click_window_days']}'),
        columns: ReportingColumn.listFromJson(json[r'columns']),
        conversionReportTimeType: ConversionReportTimeType.fromJson(json[r'conversion_report_time_type']),
        creationSource: CreationSource.fromJson(json[r'creation_source']),
        customColumnIds: json[r'custom_column_ids'] is Iterable
            ? (json[r'custom_column_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        displayMetadata: mapValueOfType<String>(json, r'display_metadata'),
        engagementWindowDays: num.parse('${json[r'engagement_window_days']}'),
        filtersJson: mapValueOfType<String>(json, r'filters_json'),
        granularity: Granularity.fromJson(json[r'granularity']),
        id: mapValueOfType<String>(json, r'id')!,
        ingestionSources: IngestionSource.listFromJson(json[r'ingestion_sources']),
        isDefault: mapValueOfType<bool>(json, r'is_default'),
        isDeleted: mapValueOfType<bool>(json, r'is_deleted'),
        isOwnedByUser: mapValueOfType<bool>(json, r'is_owned_by_user'),
        isScheduled: mapValueOfType<bool>(json, r'is_scheduled'),
        name: mapValueOfType<String>(json, r'name'),
        reportEndRelativeDaysInPast: num.parse('${json[r'report_end_relative_days_in_past']}'),
        reportFormat: DataOutputFormat.fromJson(json[r'report_format']),
        reportLevel: MetricsReportingLevel.fromJson(json[r'report_level']),
        reportStartRelativeDaysInPast: num.parse('${json[r'report_start_relative_days_in_past']}'),
        reportingTimeZone: ReportingTimeZone.fromJson(json[r'reporting_time_zone']),
        sortBy: mapValueOfType<Object>(json, r'sort_by'),
        type: mapValueOfType<String>(json, r'type'),
        updatedTime: num.parse('${json[r'updated_time']}'),
        userId: mapValueOfType<String>(json, r'user_id'),
        viewWindowDays: num.parse('${json[r'view_window_days']}'),
      );
    }
    return null;
  }

  static List<AccountTemplate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AccountTemplate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AccountTemplate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AccountTemplate> mapFromJson(dynamic json) {
    final map = <String, AccountTemplate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AccountTemplate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AccountTemplate-objects as value to a dart map
  static Map<String, List<AccountTemplate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AccountTemplate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AccountTemplate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
  };
}

