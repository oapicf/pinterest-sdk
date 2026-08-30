//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingKeyword {
  /// Returns a new [TrendingKeyword] instance.
  TrendingKeyword({
    this.demographics,
    this.hasPrediction,
    this.keyword,
    this.pctGrowthMom,
    this.pctGrowthWow,
    this.pctGrowthYoy,
    this.predictedTimeSeries,
    this.timeSeries,
  });

  TrendingKeywordDemographics? demographics;

  /// Indicates whether the keyword has a prediction available for the next 90 days. This field is only applicable when `include_prediction` query parameter is set to `true`. By default, the value is `false` and no prediction data is included in the response.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? hasPrediction;

  /// The keyword that is trending.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? keyword;

  /// The month-over-month percent change in search volume for this keyword. For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthMom;

  /// The week-over-week percent change in search volume for this keyword. For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthWow;

  /// The year-over-year percent change in search volume for this keyword. For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior. **Note**: growth rates are rounded, with a maximum of +/- 10000% change. A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthYoy;

  /// A sequence of weekly observations of the predicted relative search volume for this keyword over the next 3 months. These values are normalized to a [0-100] range, and can be used to visualize the forecasted user interest in this keyword. Similar to the historical `time_series`, normalization is applied independently to the predicted time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative predicted volume between keywords.  **Note**: The cut-off date between historical and predicted time series depends on Pinterest data availability. Usually the data needs a few days to be calculated, so the predicted time series may contain some past dates compared to today.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2024-01-07` would include predicted searches for the week ending on `2024-01-07`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PredictedTimeSeries? predictedTimeSeries;

  /// A sequence of weekly observations of the relative search volume for this keyword over the past year. These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.  **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week. For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TimeSeries? timeSeries;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingKeyword &&
    other.demographics == demographics &&
    other.hasPrediction == hasPrediction &&
    other.keyword == keyword &&
    other.pctGrowthMom == pctGrowthMom &&
    other.pctGrowthWow == pctGrowthWow &&
    other.pctGrowthYoy == pctGrowthYoy &&
    other.predictedTimeSeries == predictedTimeSeries &&
    other.timeSeries == timeSeries;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (demographics == null ? 0 : demographics!.hashCode) +
    (hasPrediction == null ? 0 : hasPrediction!.hashCode) +
    (keyword == null ? 0 : keyword!.hashCode) +
    (pctGrowthMom == null ? 0 : pctGrowthMom!.hashCode) +
    (pctGrowthWow == null ? 0 : pctGrowthWow!.hashCode) +
    (pctGrowthYoy == null ? 0 : pctGrowthYoy!.hashCode) +
    (predictedTimeSeries == null ? 0 : predictedTimeSeries!.hashCode) +
    (timeSeries == null ? 0 : timeSeries!.hashCode);

  @override
  String toString() => 'TrendingKeyword[demographics=$demographics, hasPrediction=$hasPrediction, keyword=$keyword, pctGrowthMom=$pctGrowthMom, pctGrowthWow=$pctGrowthWow, pctGrowthYoy=$pctGrowthYoy, predictedTimeSeries=$predictedTimeSeries, timeSeries=$timeSeries]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.demographics != null) {
      json[r'demographics'] = this.demographics;
    } else {
      json[r'demographics'] = null;
    }
    if (this.hasPrediction != null) {
      json[r'has_prediction'] = this.hasPrediction;
    } else {
      json[r'has_prediction'] = null;
    }
    if (this.keyword != null) {
      json[r'keyword'] = this.keyword;
    } else {
      json[r'keyword'] = null;
    }
    if (this.pctGrowthMom != null) {
      json[r'pct_growth_mom'] = this.pctGrowthMom;
    } else {
      json[r'pct_growth_mom'] = null;
    }
    if (this.pctGrowthWow != null) {
      json[r'pct_growth_wow'] = this.pctGrowthWow;
    } else {
      json[r'pct_growth_wow'] = null;
    }
    if (this.pctGrowthYoy != null) {
      json[r'pct_growth_yoy'] = this.pctGrowthYoy;
    } else {
      json[r'pct_growth_yoy'] = null;
    }
    if (this.predictedTimeSeries != null) {
      json[r'predicted_time_series'] = this.predictedTimeSeries;
    } else {
      json[r'predicted_time_series'] = null;
    }
    if (this.timeSeries != null) {
      json[r'time_series'] = this.timeSeries;
    } else {
      json[r'time_series'] = null;
    }
    return json;
  }

  /// Returns a new [TrendingKeyword] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingKeyword? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TrendingKeyword(
        demographics: TrendingKeywordDemographics.fromJson(json[r'demographics']),
        hasPrediction: mapValueOfType<bool>(json, r'has_prediction'),
        keyword: mapValueOfType<String>(json, r'keyword'),
        pctGrowthMom: mapValueOfType<int>(json, r'pct_growth_mom'),
        pctGrowthWow: mapValueOfType<int>(json, r'pct_growth_wow'),
        pctGrowthYoy: mapValueOfType<int>(json, r'pct_growth_yoy'),
        predictedTimeSeries: PredictedTimeSeries.fromJson(json[r'predicted_time_series']),
        timeSeries: TimeSeries.fromJson(json[r'time_series']),
      );
    }
    return null;
  }

  static List<TrendingKeyword> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingKeyword>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingKeyword.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingKeyword> mapFromJson(dynamic json) {
    final map = <String, TrendingKeyword>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingKeyword.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingKeyword-objects as value to a dart map
  static Map<String, List<TrendingKeyword>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingKeyword>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingKeyword.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

