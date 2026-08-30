//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupUint32Criteria {
  /// Returns a new [CatalogsProductGroupUint32Criteria] instance.
  CatalogsProductGroupUint32Criteria({
    this.negated,
    required this.operator_,
    required this.value,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? negated;

  NumericFilterOperatorType operator_;

  /// Minimum value: 0
  /// Maximum value: 4294967295
  int value;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupUint32Criteria &&
    other.negated == negated &&
    other.operator_ == operator_ &&
    other.value == value;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (negated == null ? 0 : negated!.hashCode) +
    (operator_.hashCode) +
    (value.hashCode);

  @override
  String toString() => 'CatalogsProductGroupUint32Criteria[negated=$negated, operator_=$operator_, value=$value]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.negated != null) {
      json[r'negated'] = this.negated;
    } else {
      json[r'negated'] = null;
    }
      json[r'operator'] = this.operator_;
      json[r'value'] = this.value;
    return json;
  }

  /// Returns a new [CatalogsProductGroupUint32Criteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupUint32Criteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'operator'), 'Required key "CatalogsProductGroupUint32Criteria[operator]" is missing from JSON.');
        assert(json[r'operator'] != null, 'Required key "CatalogsProductGroupUint32Criteria[operator]" has a null value in JSON.');
        assert(json.containsKey(r'value'), 'Required key "CatalogsProductGroupUint32Criteria[value]" is missing from JSON.');
        assert(json[r'value'] != null, 'Required key "CatalogsProductGroupUint32Criteria[value]" has a null value in JSON.');
        return true;
      }());

      return CatalogsProductGroupUint32Criteria(
        negated: mapValueOfType<bool>(json, r'negated'),
        operator_: NumericFilterOperatorType.fromJson(json[r'operator'])!,
        value: mapValueOfType<int>(json, r'value')!,
      );
    }
    return null;
  }

  static List<CatalogsProductGroupUint32Criteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupUint32Criteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupUint32Criteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupUint32Criteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupUint32Criteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupUint32Criteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupUint32Criteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupUint32Criteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupUint32Criteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupUint32Criteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'operator',
    'value',
  };
}

