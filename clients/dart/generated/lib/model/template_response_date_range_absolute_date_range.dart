//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateResponseDateRangeAbsoluteDateRange {
  /// Returns a new [TemplateResponseDateRangeAbsoluteDateRange] instance.
  TemplateResponseDateRangeAbsoluteDateRange({
    this.endDate,
    this.startDate,
    this.type,
  });

  /// The end date of the date range
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? endDate;

  /// The start date of the date range
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? startDate;

  /// The date range type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateResponseDateRangeAbsoluteDateRange &&
    other.endDate == endDate &&
    other.startDate == startDate &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (endDate == null ? 0 : endDate!.hashCode) +
    (startDate == null ? 0 : startDate!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'TemplateResponseDateRangeAbsoluteDateRange[endDate=$endDate, startDate=$startDate, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.endDate != null) {
      json[r'end_date'] = this.endDate;
    } else {
      json[r'end_date'] = null;
    }
    if (this.startDate != null) {
      json[r'start_date'] = this.startDate;
    } else {
      json[r'start_date'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateResponseDateRangeAbsoluteDateRange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateResponseDateRangeAbsoluteDateRange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TemplateResponseDateRangeAbsoluteDateRange[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TemplateResponseDateRangeAbsoluteDateRange[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TemplateResponseDateRangeAbsoluteDateRange(
        endDate: num.parse('${json[r'end_date']}'),
        startDate: num.parse('${json[r'start_date']}'),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<TemplateResponseDateRangeAbsoluteDateRange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseDateRangeAbsoluteDateRange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseDateRangeAbsoluteDateRange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateResponseDateRangeAbsoluteDateRange> mapFromJson(dynamic json) {
    final map = <String, TemplateResponseDateRangeAbsoluteDateRange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateResponseDateRangeAbsoluteDateRange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateResponseDateRangeAbsoluteDateRange-objects as value to a dart map
  static Map<String, List<TemplateResponseDateRangeAbsoluteDateRange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateResponseDateRangeAbsoluteDateRange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateResponseDateRangeAbsoluteDateRange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

