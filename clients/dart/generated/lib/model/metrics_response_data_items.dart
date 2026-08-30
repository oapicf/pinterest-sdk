//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class MetricsResponseDataItems {
  /// Returns a new [MetricsResponseDataItems] instance.
  MetricsResponseDataItems({
    required this.metrics,
    required this.targetingType,
    required this.targetingValue,
  });

  /// Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers).
  Object metrics;

  /// The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER)
  String targetingType;

  /// The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female')
  String targetingValue;

  @override
  bool operator ==(Object other) => identical(this, other) || other is MetricsResponseDataItems &&
    other.metrics == metrics &&
    other.targetingType == targetingType &&
    other.targetingValue == targetingValue;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (metrics.hashCode) +
    (targetingType.hashCode) +
    (targetingValue.hashCode);

  @override
  String toString() => 'MetricsResponseDataItems[metrics=$metrics, targetingType=$targetingType, targetingValue=$targetingValue]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'metrics'] = this.metrics;
      json[r'targeting_type'] = this.targetingType;
      json[r'targeting_value'] = this.targetingValue;
    return json;
  }

  /// Returns a new [MetricsResponseDataItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static MetricsResponseDataItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'metrics'), 'Required key "MetricsResponseDataItems[metrics]" is missing from JSON.');
        assert(json[r'metrics'] != null, 'Required key "MetricsResponseDataItems[metrics]" has a null value in JSON.');
        assert(json.containsKey(r'targeting_type'), 'Required key "MetricsResponseDataItems[targeting_type]" is missing from JSON.');
        assert(json[r'targeting_type'] != null, 'Required key "MetricsResponseDataItems[targeting_type]" has a null value in JSON.');
        assert(json.containsKey(r'targeting_value'), 'Required key "MetricsResponseDataItems[targeting_value]" is missing from JSON.');
        assert(json[r'targeting_value'] != null, 'Required key "MetricsResponseDataItems[targeting_value]" has a null value in JSON.');
        return true;
      }());

      return MetricsResponseDataItems(
        metrics: mapValueOfType<Object>(json, r'metrics')!,
        targetingType: mapValueOfType<String>(json, r'targeting_type')!,
        targetingValue: mapValueOfType<String>(json, r'targeting_value')!,
      );
    }
    return null;
  }

  static List<MetricsResponseDataItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MetricsResponseDataItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MetricsResponseDataItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, MetricsResponseDataItems> mapFromJson(dynamic json) {
    final map = <String, MetricsResponseDataItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = MetricsResponseDataItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of MetricsResponseDataItems-objects as value to a dart map
  static Map<String, List<MetricsResponseDataItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<MetricsResponseDataItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = MetricsResponseDataItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'metrics',
    'targeting_type',
    'targeting_value',
  };
}

