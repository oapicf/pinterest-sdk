//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateResponseDateRange {
  /// Returns a new [TemplateResponseDateRange] instance.
  TemplateResponseDateRange({
    this.absoluteDateRange,
    this.dynamicDateRange,
    this.relativeDateRange,
  });

  TemplateResponseDateRangeAbsoluteDateRange? absoluteDateRange;

  TemplateResponseDateRangeDynamicDateRange? dynamicDateRange;

  TemplateResponseDateRangeRelativeDateRange? relativeDateRange;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateResponseDateRange &&
    other.absoluteDateRange == absoluteDateRange &&
    other.dynamicDateRange == dynamicDateRange &&
    other.relativeDateRange == relativeDateRange;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (absoluteDateRange == null ? 0 : absoluteDateRange!.hashCode) +
    (dynamicDateRange == null ? 0 : dynamicDateRange!.hashCode) +
    (relativeDateRange == null ? 0 : relativeDateRange!.hashCode);

  @override
  String toString() => 'TemplateResponseDateRange[absoluteDateRange=$absoluteDateRange, dynamicDateRange=$dynamicDateRange, relativeDateRange=$relativeDateRange]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.absoluteDateRange != null) {
      json[r'absolute_date_range'] = this.absoluteDateRange;
    } else {
      json[r'absolute_date_range'] = null;
    }
    if (this.dynamicDateRange != null) {
      json[r'dynamic_date_range'] = this.dynamicDateRange;
    } else {
      json[r'dynamic_date_range'] = null;
    }
    if (this.relativeDateRange != null) {
      json[r'relative_date_range'] = this.relativeDateRange;
    } else {
      json[r'relative_date_range'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateResponseDateRange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateResponseDateRange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TemplateResponseDateRange[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TemplateResponseDateRange[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TemplateResponseDateRange(
        absoluteDateRange: TemplateResponseDateRangeAbsoluteDateRange.fromJson(json[r'absolute_date_range']),
        dynamicDateRange: TemplateResponseDateRangeDynamicDateRange.fromJson(json[r'dynamic_date_range']),
        relativeDateRange: TemplateResponseDateRangeRelativeDateRange.fromJson(json[r'relative_date_range']),
      );
    }
    return null;
  }

  static List<TemplateResponseDateRange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseDateRange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseDateRange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateResponseDateRange> mapFromJson(dynamic json) {
    final map = <String, TemplateResponseDateRange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateResponseDateRange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateResponseDateRange-objects as value to a dart map
  static Map<String, List<TemplateResponseDateRange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateResponseDateRange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateResponseDateRange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

