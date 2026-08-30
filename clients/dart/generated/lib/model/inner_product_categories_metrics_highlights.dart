//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InnerProductCategoriesMetricsHighlights {
  /// Returns a new [InnerProductCategoriesMetricsHighlights] instance.
  InnerProductCategoriesMetricsHighlights({
    required this.pctChangeMom,
  });

  /// Month-over-month percentage change
  num pctChangeMom;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InnerProductCategoriesMetricsHighlights &&
    other.pctChangeMom == pctChangeMom;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (pctChangeMom.hashCode);

  @override
  String toString() => 'InnerProductCategoriesMetricsHighlights[pctChangeMom=$pctChangeMom]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'pct_change_mom'] = this.pctChangeMom;
    return json;
  }

  /// Returns a new [InnerProductCategoriesMetricsHighlights] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InnerProductCategoriesMetricsHighlights? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'pct_change_mom'), 'Required key "InnerProductCategoriesMetricsHighlights[pct_change_mom]" is missing from JSON.');
        assert(json[r'pct_change_mom'] != null, 'Required key "InnerProductCategoriesMetricsHighlights[pct_change_mom]" has a null value in JSON.');
        return true;
      }());

      return InnerProductCategoriesMetricsHighlights(
        pctChangeMom: num.parse('${json[r'pct_change_mom']}'),
      );
    }
    return null;
  }

  static List<InnerProductCategoriesMetricsHighlights> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InnerProductCategoriesMetricsHighlights>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InnerProductCategoriesMetricsHighlights.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InnerProductCategoriesMetricsHighlights> mapFromJson(dynamic json) {
    final map = <String, InnerProductCategoriesMetricsHighlights>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InnerProductCategoriesMetricsHighlights.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InnerProductCategoriesMetricsHighlights-objects as value to a dart map
  static Map<String, List<InnerProductCategoriesMetricsHighlights>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InnerProductCategoriesMetricsHighlights>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InnerProductCategoriesMetricsHighlights.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'pct_change_mom',
  };
}

