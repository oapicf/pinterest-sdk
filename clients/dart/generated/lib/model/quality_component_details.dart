//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityComponentDetails {
  /// Returns a new [QualityComponentDetails] instance.
  QualityComponentDetails({
    required this.coverage,
    this.issues = const [],
    this.overlap,
  });

  /// Coverage percentage for this event type.
  num coverage;

  /// List of issues detected for this event type, if any.
  List<QualityComponentIssue> issues;

  /// Overlap percentage for this event type. Only populated for external_event_id
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? overlap;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityComponentDetails &&
    other.coverage == coverage &&
    _deepEquality.equals(other.issues, issues) &&
    other.overlap == overlap;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (coverage.hashCode) +
    (issues.hashCode) +
    (overlap == null ? 0 : overlap!.hashCode);

  @override
  String toString() => 'QualityComponentDetails[coverage=$coverage, issues=$issues, overlap=$overlap]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'coverage'] = this.coverage;
      json[r'issues'] = this.issues;
    if (this.overlap != null) {
      json[r'overlap'] = this.overlap;
    } else {
      json[r'overlap'] = null;
    }
    return json;
  }

  /// Returns a new [QualityComponentDetails] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityComponentDetails? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'coverage'), 'Required key "QualityComponentDetails[coverage]" is missing from JSON.');
        assert(json[r'coverage'] != null, 'Required key "QualityComponentDetails[coverage]" has a null value in JSON.');
        return true;
      }());

      return QualityComponentDetails(
        coverage: num.parse('${json[r'coverage']}'),
        issues: QualityComponentIssue.listFromJson(json[r'issues']),
        overlap: num.parse('${json[r'overlap']}'),
      );
    }
    return null;
  }

  static List<QualityComponentDetails> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityComponentDetails>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityComponentDetails.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityComponentDetails> mapFromJson(dynamic json) {
    final map = <String, QualityComponentDetails>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityComponentDetails.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityComponentDetails-objects as value to a dart map
  static Map<String, List<QualityComponentDetails>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityComponentDetails>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityComponentDetails.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'coverage',
  };
}

