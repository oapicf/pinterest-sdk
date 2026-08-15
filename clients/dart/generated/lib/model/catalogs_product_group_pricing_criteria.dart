//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsProductGroupPricingCriteria {
  /// Returns a new [CatalogsProductGroupPricingCriteria] instance.
  CatalogsProductGroupPricingCriteria({
    this.inclusion = true,
    this.negated = false,
    required this.values,
  });

  bool inclusion;

  bool negated;

  /// Minimum value: 0
  num values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsProductGroupPricingCriteria &&
    other.inclusion == inclusion &&
    other.negated == negated &&
    other.values == values;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inclusion.hashCode) +
    (negated.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'CatalogsProductGroupPricingCriteria[inclusion=$inclusion, negated=$negated, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'inclusion'] = this.inclusion;
      json[r'negated'] = this.negated;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [CatalogsProductGroupPricingCriteria] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsProductGroupPricingCriteria? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsProductGroupPricingCriteria[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsProductGroupPricingCriteria[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsProductGroupPricingCriteria(
        inclusion: mapValueOfType<bool>(json, r'inclusion') ?? true,
        negated: mapValueOfType<bool>(json, r'negated') ?? false,
        values: num.parse('${json[r'values']}'),
      );
    }
    return null;
  }

  static List<CatalogsProductGroupPricingCriteria> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupPricingCriteria>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupPricingCriteria.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsProductGroupPricingCriteria> mapFromJson(dynamic json) {
    final map = <String, CatalogsProductGroupPricingCriteria>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsProductGroupPricingCriteria.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsProductGroupPricingCriteria-objects as value to a dart map
  static Map<String, List<CatalogsProductGroupPricingCriteria>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsProductGroupPricingCriteria>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsProductGroupPricingCriteria.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'values',
  };
}

