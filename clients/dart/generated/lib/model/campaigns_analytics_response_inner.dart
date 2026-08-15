//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignsAnalyticsResponseInner {
  /// Returns a new [CampaignsAnalyticsResponseInner] instance.
  CampaignsAnalyticsResponseInner({
    this.CAMPAIGN_ID,
    this.DATE,
  });

  /// The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? CAMPAIGN_ID;

  /// Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  DateTime? DATE;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignsAnalyticsResponseInner &&
    other.CAMPAIGN_ID == CAMPAIGN_ID &&
    other.DATE == DATE;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (CAMPAIGN_ID == null ? 0 : CAMPAIGN_ID!.hashCode) +
    (DATE == null ? 0 : DATE!.hashCode);

  @override
  String toString() => 'CampaignsAnalyticsResponseInner[CAMPAIGN_ID=$CAMPAIGN_ID, DATE=$DATE]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.CAMPAIGN_ID != null) {
      json[r'CAMPAIGN_ID'] = this.CAMPAIGN_ID;
    } else {
      json[r'CAMPAIGN_ID'] = null;
    }
    if (this.DATE != null) {
      json[r'DATE'] = _dateFormatter.format(this.DATE!.toUtc());
    } else {
      json[r'DATE'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignsAnalyticsResponseInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignsAnalyticsResponseInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CampaignsAnalyticsResponseInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CampaignsAnalyticsResponseInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CampaignsAnalyticsResponseInner(
        CAMPAIGN_ID: mapValueOfType<String>(json, r'CAMPAIGN_ID'),
        DATE: mapDateTime(json, r'DATE', r''),
      );
    }
    return null;
  }

  static List<CampaignsAnalyticsResponseInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignsAnalyticsResponseInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignsAnalyticsResponseInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignsAnalyticsResponseInner> mapFromJson(dynamic json) {
    final map = <String, CampaignsAnalyticsResponseInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignsAnalyticsResponseInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignsAnalyticsResponseInner-objects as value to a dart map
  static Map<String, List<CampaignsAnalyticsResponseInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignsAnalyticsResponseInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignsAnalyticsResponseInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

