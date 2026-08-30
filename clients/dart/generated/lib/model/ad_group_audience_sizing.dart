//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdGroupAudienceSizing {
  /// Returns a new [AdGroupAudienceSizing] instance.
  AdGroupAudienceSizing({
    this.audienceSizeLowerBound,
    this.audienceSizeUpperBound,
  });

  /// The lower confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? audienceSizeLowerBound;

  /// The upper confidence bound of the estimated potential audience size. \"Potential audience size\" estimates the number of people you may be able to reach per month with your campaign. It is based on historical advertising data and the targeting criteria you select. It does not guarantee results or take into account factors such as bid, budget, schedule, seasonality or product experiments.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? audienceSizeUpperBound;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdGroupAudienceSizing &&
    other.audienceSizeLowerBound == audienceSizeLowerBound &&
    other.audienceSizeUpperBound == audienceSizeUpperBound;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (audienceSizeLowerBound == null ? 0 : audienceSizeLowerBound!.hashCode) +
    (audienceSizeUpperBound == null ? 0 : audienceSizeUpperBound!.hashCode);

  @override
  String toString() => 'AdGroupAudienceSizing[audienceSizeLowerBound=$audienceSizeLowerBound, audienceSizeUpperBound=$audienceSizeUpperBound]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.audienceSizeLowerBound != null) {
      json[r'audience_size_lower_bound'] = this.audienceSizeLowerBound;
    } else {
      json[r'audience_size_lower_bound'] = null;
    }
    if (this.audienceSizeUpperBound != null) {
      json[r'audience_size_upper_bound'] = this.audienceSizeUpperBound;
    } else {
      json[r'audience_size_upper_bound'] = null;
    }
    return json;
  }

  /// Returns a new [AdGroupAudienceSizing] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdGroupAudienceSizing? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return AdGroupAudienceSizing(
        audienceSizeLowerBound: num.parse('${json[r'audience_size_lower_bound']}'),
        audienceSizeUpperBound: num.parse('${json[r'audience_size_upper_bound']}'),
      );
    }
    return null;
  }

  static List<AdGroupAudienceSizing> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizing>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizing.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdGroupAudienceSizing> mapFromJson(dynamic json) {
    final map = <String, AdGroupAudienceSizing>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdGroupAudienceSizing.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdGroupAudienceSizing-objects as value to a dart map
  static Map<String, List<AdGroupAudienceSizing>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdGroupAudienceSizing>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdGroupAudienceSizing.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

