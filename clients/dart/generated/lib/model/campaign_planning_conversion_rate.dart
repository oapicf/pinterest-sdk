//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningConversionRate {
  /// Returns a new [CampaignPlanningConversionRate] instance.
  CampaignPlanningConversionRate({
    required this.attributionWindows,
    required this.conversionEvent,
    required this.conversionRate,
  });

  CampaignPlanningConversionAttribution attributionWindows;

  CampaignPlanningConversionEvent conversionEvent;

  /// Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
  double conversionRate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningConversionRate &&
    other.attributionWindows == attributionWindows &&
    other.conversionEvent == conversionEvent &&
    other.conversionRate == conversionRate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (attributionWindows.hashCode) +
    (conversionEvent.hashCode) +
    (conversionRate.hashCode);

  @override
  String toString() => 'CampaignPlanningConversionRate[attributionWindows=$attributionWindows, conversionEvent=$conversionEvent, conversionRate=$conversionRate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'attribution_windows'] = this.attributionWindows;
      json[r'conversion_event'] = this.conversionEvent;
      json[r'conversion_rate'] = this.conversionRate;
    return json;
  }

  /// Returns a new [CampaignPlanningConversionRate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningConversionRate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'attribution_windows'), 'Required key "CampaignPlanningConversionRate[attribution_windows]" is missing from JSON.');
        assert(json[r'attribution_windows'] != null, 'Required key "CampaignPlanningConversionRate[attribution_windows]" has a null value in JSON.');
        assert(json.containsKey(r'conversion_event'), 'Required key "CampaignPlanningConversionRate[conversion_event]" is missing from JSON.');
        assert(json[r'conversion_event'] != null, 'Required key "CampaignPlanningConversionRate[conversion_event]" has a null value in JSON.');
        assert(json.containsKey(r'conversion_rate'), 'Required key "CampaignPlanningConversionRate[conversion_rate]" is missing from JSON.');
        assert(json[r'conversion_rate'] != null, 'Required key "CampaignPlanningConversionRate[conversion_rate]" has a null value in JSON.');
        return true;
      }());

      return CampaignPlanningConversionRate(
        attributionWindows: CampaignPlanningConversionAttribution.fromJson(json[r'attribution_windows'])!,
        conversionEvent: CampaignPlanningConversionEvent.fromJson(json[r'conversion_event'])!,
        conversionRate: mapValueOfType<double>(json, r'conversion_rate')!,
      );
    }
    return null;
  }

  static List<CampaignPlanningConversionRate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConversionRate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConversionRate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningConversionRate> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningConversionRate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningConversionRate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningConversionRate-objects as value to a dart map
  static Map<String, List<CampaignPlanningConversionRate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningConversionRate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningConversionRate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'attribution_windows',
    'conversion_event',
    'conversion_rate',
  };
}

