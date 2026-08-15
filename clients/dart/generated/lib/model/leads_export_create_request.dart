//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadsExportCreateRequest {
  /// Returns a new [LeadsExportCreateRequest] instance.
  LeadsExportCreateRequest({
    required this.adId,
    required this.endDate,
    required this.startDate,
  });

  /// ID for the ad collecting leads
  String adId;

  /// Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
  String endDate;

  /// Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
  String startDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadsExportCreateRequest &&
    other.adId == adId &&
    other.endDate == endDate &&
    other.startDate == startDate;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (adId.hashCode) +
    (endDate.hashCode) +
    (startDate.hashCode);

  @override
  String toString() => 'LeadsExportCreateRequest[adId=$adId, endDate=$endDate, startDate=$startDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_id'] = this.adId;
      json[r'end_date'] = this.endDate;
      json[r'start_date'] = this.startDate;
    return json;
  }

  /// Returns a new [LeadsExportCreateRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadsExportCreateRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadsExportCreateRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadsExportCreateRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadsExportCreateRequest(
        adId: mapValueOfType<String>(json, r'ad_id')!,
        endDate: mapValueOfType<String>(json, r'end_date')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
      );
    }
    return null;
  }

  static List<LeadsExportCreateRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadsExportCreateRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadsExportCreateRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadsExportCreateRequest> mapFromJson(dynamic json) {
    final map = <String, LeadsExportCreateRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadsExportCreateRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadsExportCreateRequest-objects as value to a dart map
  static Map<String, List<LeadsExportCreateRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadsExportCreateRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadsExportCreateRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ad_id',
    'end_date',
    'start_date',
  };
}

