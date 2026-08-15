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

  /// Indicates whether the keyword has a prediction available for the next 90 days.<br /> This field is only applicable when `include_prediction` query parameter is set to `true`. <br /> By default, the value is `false` and no prediction data is included in the response.
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

  /// The month-over-month percent change in search volume for this keyword.<br /> For example, a value of \"400\" would represent a 400% increase in searches in the last 30 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% month-over-month growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthMom;

  /// The week-over-week percent change in search volume for this keyword.<br /> For example, a value of \"50\" would represent a 50% increase in searches in the last seven days compared to the week prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% week-over-week growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthWow;

  /// The year-over-year percent change in search volume for this keyword.<br /> For example, a value of \"-5\" would represent a 5% decrease in searches in the last 365 days compared to the month prior.<br /> **Note**: growth rates are rounded, with a maximum of +/- 10000% change.  A value of 10001 indicates that this keyword experienced > 10000% year-over-year growth.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? pctGrowthYoy;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  PredictedTimeSeries? predictedTimeSeries;

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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingKeyword[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingKeyword[$key]" has a null value in JSON.');
        });
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

