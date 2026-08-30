//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinAnalyticsMetricsResponse {
  /// Returns a new [PinAnalyticsMetricsResponse] instance.
  PinAnalyticsMetricsResponse({
    this.dailyMetrics = const [],
    this.lifetimeMetrics = const {},
    this.summaryMetrics = const {},
  });

  /// Array with the requested daily metric records
  List<PinAnalyticsDailyMetrics> dailyMetrics;

  /// The lifetime metric name and value.
  Map<String, int> lifetimeMetrics;

  /// The metric name and value over the requested period for each requested metric
  Map<String, num> summaryMetrics;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinAnalyticsMetricsResponse &&
    _deepEquality.equals(other.dailyMetrics, dailyMetrics) &&
    _deepEquality.equals(other.lifetimeMetrics, lifetimeMetrics) &&
    _deepEquality.equals(other.summaryMetrics, summaryMetrics);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dailyMetrics.hashCode) +
    (lifetimeMetrics.hashCode) +
    (summaryMetrics.hashCode);

  @override
  String toString() => 'PinAnalyticsMetricsResponse[dailyMetrics=$dailyMetrics, lifetimeMetrics=$lifetimeMetrics, summaryMetrics=$summaryMetrics]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'daily_metrics'] = this.dailyMetrics;
      json[r'lifetime_metrics'] = this.lifetimeMetrics;
      json[r'summary_metrics'] = this.summaryMetrics;
    return json;
  }

  /// Returns a new [PinAnalyticsMetricsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinAnalyticsMetricsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return PinAnalyticsMetricsResponse(
        dailyMetrics: PinAnalyticsDailyMetrics.listFromJson(json[r'daily_metrics']),
        lifetimeMetrics: mapCastOfType<String, int>(json, r'lifetime_metrics') ?? const {},
        summaryMetrics: mapCastOfType<String, num>(json, r'summary_metrics') ?? const {},
      );
    }
    return null;
  }

  static List<PinAnalyticsMetricsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinAnalyticsMetricsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinAnalyticsMetricsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinAnalyticsMetricsResponse> mapFromJson(dynamic json) {
    final map = <String, PinAnalyticsMetricsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinAnalyticsMetricsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinAnalyticsMetricsResponse-objects as value to a dart map
  static Map<String, List<PinAnalyticsMetricsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinAnalyticsMetricsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinAnalyticsMetricsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

