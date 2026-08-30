//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QualityComponentIssue {
  /// Returns a new [QualityComponentIssue] instance.
  QualityComponentIssue({
    required this.id,
    required this.name,
    required this.reason,
  });

  /// Unique identifier for the issue check.
  String id;

  /// Human-readable name of the issue.
  String name;

  /// Detailed reason for the issue.
  String reason;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QualityComponentIssue &&
    other.id == id &&
    other.name == name &&
    other.reason == reason;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id.hashCode) +
    (name.hashCode) +
    (reason.hashCode);

  @override
  String toString() => 'QualityComponentIssue[id=$id, name=$name, reason=$reason]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'id'] = this.id;
      json[r'name'] = this.name;
      json[r'reason'] = this.reason;
    return json;
  }

  /// Returns a new [QualityComponentIssue] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QualityComponentIssue? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'id'), 'Required key "QualityComponentIssue[id]" is missing from JSON.');
        assert(json[r'id'] != null, 'Required key "QualityComponentIssue[id]" has a null value in JSON.');
        assert(json.containsKey(r'name'), 'Required key "QualityComponentIssue[name]" is missing from JSON.');
        assert(json[r'name'] != null, 'Required key "QualityComponentIssue[name]" has a null value in JSON.');
        assert(json.containsKey(r'reason'), 'Required key "QualityComponentIssue[reason]" is missing from JSON.');
        assert(json[r'reason'] != null, 'Required key "QualityComponentIssue[reason]" has a null value in JSON.');
        return true;
      }());

      return QualityComponentIssue(
        id: mapValueOfType<String>(json, r'id')!,
        name: mapValueOfType<String>(json, r'name')!,
        reason: mapValueOfType<String>(json, r'reason')!,
      );
    }
    return null;
  }

  static List<QualityComponentIssue> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QualityComponentIssue>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QualityComponentIssue.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QualityComponentIssue> mapFromJson(dynamic json) {
    final map = <String, QualityComponentIssue>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QualityComponentIssue.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QualityComponentIssue-objects as value to a dart map
  static Map<String, List<QualityComponentIssue>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QualityComponentIssue>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QualityComponentIssue.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'id',
    'name',
    'reason',
  };
}

