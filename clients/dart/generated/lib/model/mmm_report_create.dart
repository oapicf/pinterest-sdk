//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MMMReportCreate {
  /// Returns a new [MMMReportCreate] instance.
  MMMReportCreate({
    this.advertiserIds = const [],
    this.columns = const [],
    this.countries = const [],
    this.customColumnIds = const [],
    required this.endDate,
    required this.granularity,
    required this.level,
    required this.reportName,
    required this.startDate,
    this.targetingTypes = const [],
  });

  /// Advertiser IDs for multi-advertiser report
  List<String> advertiserIds;

  /// Metric and entity columns
  List<MMMReportingColumn> columns;

  /// A List of countries for filtering
  List<TargetingAdvertiserCountry> countries;

  /// List of custom column IDs
  List<String> customColumnIds;

  /// Metric report end date (UTC). Format: YYYY-MM-DD
  String endDate;

  ///   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly.
  MMMReportGranularity granularity;

  /// Level of the report
  MMMReportLevel level;

  /// Name of the Marketing Mix Modeling (MMM) report
  String reportName;

  /// Metric report start date (UTC). Format: YYYY-MM-DD
  String startDate;

  /// List of targeting types
  List<MMMReportingTargetingType> targetingTypes;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MMMReportCreate &&
    _deepEquality.equals(other.advertiserIds, advertiserIds) &&
    _deepEquality.equals(other.columns, columns) &&
    _deepEquality.equals(other.countries, countries) &&
    _deepEquality.equals(other.customColumnIds, customColumnIds) &&
    other.endDate == endDate &&
    other.granularity == granularity &&
    other.level == level &&
    other.reportName == reportName &&
    other.startDate == startDate &&
    _deepEquality.equals(other.targetingTypes, targetingTypes);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (advertiserIds.hashCode) +
    (columns.hashCode) +
    (countries.hashCode) +
    (customColumnIds.hashCode) +
    (endDate.hashCode) +
    (granularity.hashCode) +
    (level.hashCode) +
    (reportName.hashCode) +
    (startDate.hashCode) +
    (targetingTypes.hashCode);

  @override
  String toString() => 'MMMReportCreate[advertiserIds=$advertiserIds, columns=$columns, countries=$countries, customColumnIds=$customColumnIds, endDate=$endDate, granularity=$granularity, level=$level, reportName=$reportName, startDate=$startDate, targetingTypes=$targetingTypes]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'advertiser_ids'] = this.advertiserIds;
      json[r'columns'] = this.columns;
      json[r'countries'] = this.countries;
      json[r'custom_column_ids'] = this.customColumnIds;
      json[r'end_date'] = this.endDate;
      json[r'granularity'] = this.granularity;
      json[r'level'] = this.level;
      json[r'report_name'] = this.reportName;
      json[r'start_date'] = this.startDate;
      json[r'targeting_types'] = this.targetingTypes;
    return json;
  }

  /// Returns a new [MMMReportCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MMMReportCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'columns'), 'Required key "MMMReportCreate[columns]" is missing from JSON.');
        assert(json[r'columns'] != null, 'Required key "MMMReportCreate[columns]" has a null value in JSON.');
        assert(json.containsKey(r'end_date'), 'Required key "MMMReportCreate[end_date]" is missing from JSON.');
        assert(json[r'end_date'] != null, 'Required key "MMMReportCreate[end_date]" has a null value in JSON.');
        assert(json.containsKey(r'granularity'), 'Required key "MMMReportCreate[granularity]" is missing from JSON.');
        assert(json[r'granularity'] != null, 'Required key "MMMReportCreate[granularity]" has a null value in JSON.');
        assert(json.containsKey(r'level'), 'Required key "MMMReportCreate[level]" is missing from JSON.');
        assert(json[r'level'] != null, 'Required key "MMMReportCreate[level]" has a null value in JSON.');
        assert(json.containsKey(r'report_name'), 'Required key "MMMReportCreate[report_name]" is missing from JSON.');
        assert(json[r'report_name'] != null, 'Required key "MMMReportCreate[report_name]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "MMMReportCreate[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "MMMReportCreate[start_date]" has a null value in JSON.');
        assert(json.containsKey(r'targeting_types'), 'Required key "MMMReportCreate[targeting_types]" is missing from JSON.');
        assert(json[r'targeting_types'] != null, 'Required key "MMMReportCreate[targeting_types]" has a null value in JSON.');
        return true;
      }());

      return MMMReportCreate(
        advertiserIds: json[r'advertiser_ids'] is Iterable
            ? (json[r'advertiser_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        columns: MMMReportingColumn.listFromJson(json[r'columns']),
        countries: TargetingAdvertiserCountry.listFromJson(json[r'countries']),
        customColumnIds: json[r'custom_column_ids'] is Iterable
            ? (json[r'custom_column_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        endDate: mapValueOfType<String>(json, r'end_date')!,
        granularity: MMMReportGranularity.fromJson(json[r'granularity'])!,
        level: MMMReportLevel.fromJson(json[r'level'])!,
        reportName: mapValueOfType<String>(json, r'report_name')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
        targetingTypes: MMMReportingTargetingType.listFromJson(json[r'targeting_types']),
      );
    }
    return null;
  }

  static List<MMMReportCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MMMReportCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MMMReportCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MMMReportCreate> mapFromJson(dynamic json) {
    final map = <String, MMMReportCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MMMReportCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MMMReportCreate-objects as value to a dart map
  static Map<String, List<MMMReportCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MMMReportCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MMMReportCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'columns',
    'end_date',
    'granularity',
    'level',
    'report_name',
    'start_date',
    'targeting_types',
  };
}

