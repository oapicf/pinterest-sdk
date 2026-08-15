//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RecordCounts {
  /// Returns a new [RecordCounts] instance.
  RecordCounts({
    required this.invalid,
    required this.processed,
    required this.valid,
  });

  /// Number of invalid records processed
  int invalid;

  /// Number of records processed
  int processed;

  /// Number of valid records processed
  int valid;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RecordCounts &&
    other.invalid == invalid &&
    other.processed == processed &&
    other.valid == valid;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (invalid.hashCode) +
    (processed.hashCode) +
    (valid.hashCode);

  @override
  String toString() => 'RecordCounts[invalid=$invalid, processed=$processed, valid=$valid]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'invalid'] = this.invalid;
      json[r'processed'] = this.processed;
      json[r'valid'] = this.valid;
    return json;
  }

  /// Returns a new [RecordCounts] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RecordCounts? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "RecordCounts[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "RecordCounts[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return RecordCounts(
        invalid: mapValueOfType<int>(json, r'invalid')!,
        processed: mapValueOfType<int>(json, r'processed')!,
        valid: mapValueOfType<int>(json, r'valid')!,
      );
    }
    return null;
  }

  static List<RecordCounts> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RecordCounts>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RecordCounts.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RecordCounts> mapFromJson(dynamic json) {
    final map = <String, RecordCounts>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RecordCounts.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RecordCounts-objects as value to a dart map
  static Map<String, List<RecordCounts>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RecordCounts>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RecordCounts.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'invalid',
    'processed',
    'valid',
  };
}

