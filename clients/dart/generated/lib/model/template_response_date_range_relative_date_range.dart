//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TemplateResponseDateRangeRelativeDateRange {
  /// Returns a new [TemplateResponseDateRangeRelativeDateRange] instance.
  TemplateResponseDateRangeRelativeDateRange({
    this.endDaysInPast,
    this.startDaysInPast,
    this.type,
  });

  /// The end date of the date range
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? endDaysInPast;

  /// The start date of the date range
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? startDaysInPast;

  /// The date range type
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? type;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TemplateResponseDateRangeRelativeDateRange &&
    other.endDaysInPast == endDaysInPast &&
    other.startDaysInPast == startDaysInPast &&
    other.type == type;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (endDaysInPast == null ? 0 : endDaysInPast!.hashCode) +
    (startDaysInPast == null ? 0 : startDaysInPast!.hashCode) +
    (type == null ? 0 : type!.hashCode);

  @override
  String toString() => 'TemplateResponseDateRangeRelativeDateRange[endDaysInPast=$endDaysInPast, startDaysInPast=$startDaysInPast, type=$type]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.endDaysInPast != null) {
      json[r'end_days_in_past'] = this.endDaysInPast;
    } else {
      json[r'end_days_in_past'] = null;
    }
    if (this.startDaysInPast != null) {
      json[r'start_days_in_past'] = this.startDaysInPast;
    } else {
      json[r'start_days_in_past'] = null;
    }
    if (this.type != null) {
      json[r'type'] = this.type;
    } else {
      json[r'type'] = null;
    }
    return json;
  }

  /// Returns a new [TemplateResponseDateRangeRelativeDateRange] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TemplateResponseDateRangeRelativeDateRange? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TemplateResponseDateRangeRelativeDateRange[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TemplateResponseDateRangeRelativeDateRange[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TemplateResponseDateRangeRelativeDateRange(
        endDaysInPast: num.parse('${json[r'end_days_in_past']}'),
        startDaysInPast: num.parse('${json[r'start_days_in_past']}'),
        type: mapValueOfType<String>(json, r'type'),
      );
    }
    return null;
  }

  static List<TemplateResponseDateRangeRelativeDateRange> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TemplateResponseDateRangeRelativeDateRange>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TemplateResponseDateRangeRelativeDateRange.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TemplateResponseDateRangeRelativeDateRange> mapFromJson(dynamic json) {
    final map = <String, TemplateResponseDateRangeRelativeDateRange>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TemplateResponseDateRangeRelativeDateRange.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TemplateResponseDateRangeRelativeDateRange-objects as value to a dart map
  static Map<String, List<TemplateResponseDateRangeRelativeDateRange>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TemplateResponseDateRangeRelativeDateRange>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TemplateResponseDateRangeRelativeDateRange.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

