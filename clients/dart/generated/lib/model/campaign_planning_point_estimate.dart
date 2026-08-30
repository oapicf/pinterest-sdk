//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CampaignPlanningPointEstimate {
  /// Returns a new [CampaignPlanningPointEstimate] instance.
  CampaignPlanningPointEstimate({
    required this.budget,
    required this.doubleY,
    required this.maxY,
    required this.minY,
    required this.y,
  });

  /// The budget value of the point.
  int budget;

  /// Y value as a decimal.
  double? doubleY;

  /// The maximum Y value of the point.
  int? maxY;

  /// The minimum Y value of the point.
  int? minY;

  /// The expected Y value of the point.
  int? y;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CampaignPlanningPointEstimate &&
    other.budget == budget &&
    other.doubleY == doubleY &&
    other.maxY == maxY &&
    other.minY == minY &&
    other.y == y;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (budget.hashCode) +
    (doubleY == null ? 0 : doubleY!.hashCode) +
    (maxY == null ? 0 : maxY!.hashCode) +
    (minY == null ? 0 : minY!.hashCode) +
    (y == null ? 0 : y!.hashCode);

  @override
  String toString() => 'CampaignPlanningPointEstimate[budget=$budget, doubleY=$doubleY, maxY=$maxY, minY=$minY, y=$y]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'budget'] = this.budget;
    if (this.doubleY != null) {
      json[r'double_y'] = this.doubleY;
    } else {
      json[r'double_y'] = null;
    }
    if (this.maxY != null) {
      json[r'max_y'] = this.maxY;
    } else {
      json[r'max_y'] = null;
    }
    if (this.minY != null) {
      json[r'min_y'] = this.minY;
    } else {
      json[r'min_y'] = null;
    }
    if (this.y != null) {
      json[r'y'] = this.y;
    } else {
      json[r'y'] = null;
    }
    return json;
  }

  /// Returns a new [CampaignPlanningPointEstimate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CampaignPlanningPointEstimate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'budget'), 'Required key "CampaignPlanningPointEstimate[budget]" is missing from JSON.');
        assert(json[r'budget'] != null, 'Required key "CampaignPlanningPointEstimate[budget]" has a null value in JSON.');
        assert(json.containsKey(r'double_y'), 'Required key "CampaignPlanningPointEstimate[double_y]" is missing from JSON.');
        assert(json.containsKey(r'max_y'), 'Required key "CampaignPlanningPointEstimate[max_y]" is missing from JSON.');
        assert(json.containsKey(r'min_y'), 'Required key "CampaignPlanningPointEstimate[min_y]" is missing from JSON.');
        assert(json.containsKey(r'y'), 'Required key "CampaignPlanningPointEstimate[y]" is missing from JSON.');
        return true;
      }());

      return CampaignPlanningPointEstimate(
        budget: mapValueOfType<int>(json, r'budget')!,
        doubleY: mapValueOfType<double>(json, r'double_y'),
        maxY: mapValueOfType<int>(json, r'max_y'),
        minY: mapValueOfType<int>(json, r'min_y'),
        y: mapValueOfType<int>(json, r'y'),
      );
    }
    return null;
  }

  static List<CampaignPlanningPointEstimate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningPointEstimate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningPointEstimate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CampaignPlanningPointEstimate> mapFromJson(dynamic json) {
    final map = <String, CampaignPlanningPointEstimate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CampaignPlanningPointEstimate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CampaignPlanningPointEstimate-objects as value to a dart map
  static Map<String, List<CampaignPlanningPointEstimate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CampaignPlanningPointEstimate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CampaignPlanningPointEstimate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'budget',
    'double_y',
    'max_y',
    'min_y',
    'y',
  };
}

