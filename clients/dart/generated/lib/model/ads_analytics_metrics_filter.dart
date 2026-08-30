//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class AdsAnalyticsMetricsFilter {
  /// Returns a new [AdsAnalyticsMetricsFilter] instance.
  AdsAnalyticsMetricsFilter({
    required this.field,
    required this.operator_,
    this.values = const [],
  });

  AdsAnalyticsFilterColumn field;

  AdsAnalyticsFilterOperator operator_;

  /// List of values for filtering
  List<num> values;

  @override
  bool operator ==(Object other) => identical(this, other) || other is AdsAnalyticsMetricsFilter &&
    other.field == field &&
    other.operator_ == operator_ &&
    _deepEquality.equals(other.values, values);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (field.hashCode) +
    (operator_.hashCode) +
    (values.hashCode);

  @override
  String toString() => 'AdsAnalyticsMetricsFilter[field=$field, operator_=$operator_, values=$values]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'field'] = this.field;
      json[r'operator'] = this.operator_;
      json[r'values'] = this.values;
    return json;
  }

  /// Returns a new [AdsAnalyticsMetricsFilter] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static AdsAnalyticsMetricsFilter? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'field'), 'Required key "AdsAnalyticsMetricsFilter[field]" is missing from JSON.');
        assert(json[r'field'] != null, 'Required key "AdsAnalyticsMetricsFilter[field]" has a null value in JSON.');
        assert(json.containsKey(r'operator'), 'Required key "AdsAnalyticsMetricsFilter[operator]" is missing from JSON.');
        assert(json[r'operator'] != null, 'Required key "AdsAnalyticsMetricsFilter[operator]" has a null value in JSON.');
        assert(json.containsKey(r'values'), 'Required key "AdsAnalyticsMetricsFilter[values]" is missing from JSON.');
        assert(json[r'values'] != null, 'Required key "AdsAnalyticsMetricsFilter[values]" has a null value in JSON.');
        return true;
      }());

      return AdsAnalyticsMetricsFilter(
        field: AdsAnalyticsFilterColumn.fromJson(json[r'field'])!,
        operator_: AdsAnalyticsFilterOperator.fromJson(json[r'operator'])!,
        values: json[r'values'] is Iterable
            ? (json[r'values'] as Iterable).cast<num>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<AdsAnalyticsMetricsFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsMetricsFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsMetricsFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, AdsAnalyticsMetricsFilter> mapFromJson(dynamic json) {
    final map = <String, AdsAnalyticsMetricsFilter>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = AdsAnalyticsMetricsFilter.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of AdsAnalyticsMetricsFilter-objects as value to a dart map
  static Map<String, List<AdsAnalyticsMetricsFilter>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<AdsAnalyticsMetricsFilter>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = AdsAnalyticsMetricsFilter.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'field',
    'operator',
    'values',
  };
}

