//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionTagV3GoalMetadata {
  /// Returns a new [ConversionTagV3GoalMetadata] instance.
  ConversionTagV3GoalMetadata({
    this.attributionWindows,
    this.conversionEvent,
    this.conversionTagId,
    this.cpaGoalValueInMicroCurrency,
    this.isRoasOptimized,
    this.reportingEvent,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  AttributionWindows? attributionWindows;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ConversionEvent? conversionEvent;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? conversionTagId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? cpaGoalValueInMicroCurrency;

  /// Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when `conversion_event` is set to `\"CHECKOUT\"` and `bid_strategy_type` is set to `\"AUTOMATIC_BID\"`. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/).
  bool? isRoasOptimized;

  /// Event name for custom or standard events mapped to an oCPM model
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? reportingEvent;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionTagV3GoalMetadata &&
    other.attributionWindows == attributionWindows &&
    other.conversionEvent == conversionEvent &&
    other.conversionTagId == conversionTagId &&
    other.cpaGoalValueInMicroCurrency == cpaGoalValueInMicroCurrency &&
    other.isRoasOptimized == isRoasOptimized &&
    other.reportingEvent == reportingEvent;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributionWindows == null ? 0 : attributionWindows!.hashCode) +
    (conversionEvent == null ? 0 : conversionEvent!.hashCode) +
    (conversionTagId == null ? 0 : conversionTagId!.hashCode) +
    (cpaGoalValueInMicroCurrency == null ? 0 : cpaGoalValueInMicroCurrency!.hashCode) +
    (isRoasOptimized == null ? 0 : isRoasOptimized!.hashCode) +
    (reportingEvent == null ? 0 : reportingEvent!.hashCode);

  @override
  String toString() => 'ConversionTagV3GoalMetadata[attributionWindows=$attributionWindows, conversionEvent=$conversionEvent, conversionTagId=$conversionTagId, cpaGoalValueInMicroCurrency=$cpaGoalValueInMicroCurrency, isRoasOptimized=$isRoasOptimized, reportingEvent=$reportingEvent]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.attributionWindows != null) {
      json[r'attribution_windows'] = this.attributionWindows;
    } else {
      json[r'attribution_windows'] = null;
    }
    if (this.conversionEvent != null) {
      json[r'conversion_event'] = this.conversionEvent;
    } else {
      json[r'conversion_event'] = null;
    }
    if (this.conversionTagId != null) {
      json[r'conversion_tag_id'] = this.conversionTagId;
    } else {
      json[r'conversion_tag_id'] = null;
    }
    if (this.cpaGoalValueInMicroCurrency != null) {
      json[r'cpa_goal_value_in_micro_currency'] = this.cpaGoalValueInMicroCurrency;
    } else {
      json[r'cpa_goal_value_in_micro_currency'] = null;
    }
    if (this.isRoasOptimized != null) {
      json[r'is_roas_optimized'] = this.isRoasOptimized;
    } else {
      json[r'is_roas_optimized'] = null;
    }
    if (this.reportingEvent != null) {
      json[r'reporting_event'] = this.reportingEvent;
    } else {
      json[r'reporting_event'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionTagV3GoalMetadata] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionTagV3GoalMetadata? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return ConversionTagV3GoalMetadata(
        attributionWindows: AttributionWindows.fromJson(json[r'attribution_windows']),
        conversionEvent: ConversionEvent.fromJson(json[r'conversion_event']),
        conversionTagId: mapValueOfType<String>(json, r'conversion_tag_id'),
        cpaGoalValueInMicroCurrency: mapValueOfType<String>(json, r'cpa_goal_value_in_micro_currency'),
        isRoasOptimized: mapValueOfType<bool>(json, r'is_roas_optimized'),
        reportingEvent: mapValueOfType<String>(json, r'reporting_event'),
      );
    }
    return null;
  }

  static List<ConversionTagV3GoalMetadata> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionTagV3GoalMetadata>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionTagV3GoalMetadata.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionTagV3GoalMetadata> mapFromJson(dynamic json) {
    final map = <String, ConversionTagV3GoalMetadata>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionTagV3GoalMetadata.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionTagV3GoalMetadata-objects as value to a dart map
  static Map<String, List<ConversionTagV3GoalMetadata>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionTagV3GoalMetadata>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionTagV3GoalMetadata.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

