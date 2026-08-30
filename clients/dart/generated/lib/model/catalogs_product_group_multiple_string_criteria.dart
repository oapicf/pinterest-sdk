//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupMultipleStringCriteria {
  /// Returns a new [CatalogsProductGroupMultipleStringCriteria] instance.
  CatalogsProductGroupMultipleStringCriteria({
    this.negated,
    this.values = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? negated;

  List<String> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupMultipleStringCriteria &&
    other.negated == negated &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (negated == null ? 0 : negated!.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'CatalogsProductGroupMultipleStringCriteria[negated=$negated, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.negated != null) {
      json[r'negated'] = this.negated;
    } else {
      json[r'negated'] = null;
    }
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [CatalogsProductGroupMultipleStringCriteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupMultipleStringCriteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'values'), 'Required key "CatalogsProductGroupMultipleStringCriteria[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "CatalogsProductGroupMultipleStringCriteria[values]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupMultipleStringCriteria(
        negated: mapValueOfType<bool>(json, r'negated'),
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<CatalogsProductGroupMultipleStringCriteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupMultipleStringCriteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupMultipleStringCriteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupMultipleStringCriteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupMultipleStringCriteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupMultipleStringCriteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupMultipleStringCriteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupMultipleStringCriteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupMultipleStringCriteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupMultipleStringCriteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'values',
  };
}

