//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ReportsStatsParametersParameter {
  /// Returns a new [ReportsStatsParametersParameter] instance.
  ReportsStatsParametersParameter({
    required this.catalogType,
    required this.report,
  });

  CatalogsType catalogType;

  CatalogsHotelReportStatsParametersReport report;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ReportsStatsParametersParameter &&
    other.catalogType == catalogType &&
    other.report == report;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogType.hashCode) +
    (report.hashCode);

  @override
  String toString() => 'ReportsStatsParametersParameter[catalogType=$catalogType, report=$report]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'catalog_type'] = this.catalogType;
      json[r'report'] = this.report;
    return json;
  }

  /// Returns a new [ReportsStatsParametersParameter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ReportsStatsParametersParameter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ReportsStatsParametersParameter[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ReportsStatsParametersParameter[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ReportsStatsParametersParameter(
        catalogType: CatalogsType.fromJson(json[r'catalog_type'])!,
        report: CatalogsHotelReportStatsParametersReport.fromJson(json[r'report'])!,
      );
    }
    return null;
  }

  static List<ReportsStatsParametersParameter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ReportsStatsParametersParameter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ReportsStatsParametersParameter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ReportsStatsParametersParameter> mapFromJson(dynamic json) {
    final map = <String, ReportsStatsParametersParameter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ReportsStatsParametersParameter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ReportsStatsParametersParameter-objects as value to a dart map
  static Map<String, List<ReportsStatsParametersParameter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ReportsStatsParametersParameter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ReportsStatsParametersParameter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'report',
  };
}

