//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AnalyticsMetricsResponse {
  /// Returns a new [AnalyticsMetricsResponse] instance.
  AnalyticsMetricsResponse({
    this.dailyMetrics = const [],
    this.summaryMetrics = const {},
  });

  /// Array with the requested daily metric records
  List<AnalyticsDailyMetrics> dailyMetrics;

  /// The metric name and value over the requested period for each requested metric
  Map<String, num> summaryMetrics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AnalyticsMetricsResponse &&
    _deepEquality.equals(other.dailyMetrics, dailyMetrics) &&
    _deepEquality.equals(other.summaryMetrics, summaryMetrics);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dailyMetrics.hashCode) +
    (summaryMetrics.hashCode);

  @override
  String toString() => 'AnalyticsMetricsResponse[dailyMetrics=$dailyMetrics, summaryMetrics=$summaryMetrics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'daily_metrics'] = this.dailyMetrics;
      json[r'summary_metrics'] = this.summaryMetrics;
    return json;
  }

  /// Returns a new [AnalyticsMetricsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AnalyticsMetricsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AnalyticsMetricsResponse(
        dailyMetrics: AnalyticsDailyMetrics.listFromJson(json[r'daily_metrics']),
        summaryMetrics: mapCastOfType<String, num>(json, r'summary_metrics') ?? const {},
      );
    }
    return null;
  }

  static List<AnalyticsMetricsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AnalyticsMetricsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AnalyticsMetricsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AnalyticsMetricsResponse> mapFromJson(dynamic json) {
    final map = <String, AnalyticsMetricsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AnalyticsMetricsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AnalyticsMetricsResponse-objects as value to a dart map
  static Map<String, List<AnalyticsMetricsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AnalyticsMetricsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AnalyticsMetricsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

