//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadsExportsCreate {
  /// Returns a new [LeadsExportsCreate] instance.
  LeadsExportsCreate({
    required this.adId,
    required this.endDate,
    required this.startDate,
  });

  /// ID for the ad collecting leads.
  String adId;

  /// Export leads collected on and before end date (UTC). Format: YYYY-MM-DD.
  String endDate;

  /// Export leads collected on and after start date (UTC). Format: YYYY-MM-DD.
  String startDate;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadsExportsCreate &&
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
  String toString() => 'LeadsExportsCreate[adId=$adId, endDate=$endDate, startDate=$startDate]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ad_id'] = this.adId;
      json[r'end_date'] = this.endDate;
      json[r'start_date'] = this.startDate;
    return json;
  }

  /// Returns a new [LeadsExportsCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadsExportsCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'ad_id'), 'Required key "LeadsExportsCreate[ad_id]" is missing from JSON.');
        assert(json[r'ad_id'] != null, 'Required key "LeadsExportsCreate[ad_id]" has a null value in JSON.');
        assert(json.containsKey(r'end_date'), 'Required key "LeadsExportsCreate[end_date]" is missing from JSON.');
        assert(json[r'end_date'] != null, 'Required key "LeadsExportsCreate[end_date]" has a null value in JSON.');
        assert(json.containsKey(r'start_date'), 'Required key "LeadsExportsCreate[start_date]" is missing from JSON.');
        assert(json[r'start_date'] != null, 'Required key "LeadsExportsCreate[start_date]" has a null value in JSON.');
        return true;
      }());

      return LeadsExportsCreate(
        adId: mapValueOfType<String>(json, r'ad_id')!,
        endDate: mapValueOfType<String>(json, r'end_date')!,
        startDate: mapValueOfType<String>(json, r'start_date')!,
      );
    }
    return null;
  }

  static List<LeadsExportsCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadsExportsCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadsExportsCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadsExportsCreate> mapFromJson(dynamic json) {
    final map = <String, LeadsExportsCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadsExportsCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadsExportsCreate-objects as value to a dart map
  static Map<String, List<LeadsExportsCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadsExportsCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadsExportsCreate.listFromJson(entry.value, growable: growable,);
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

