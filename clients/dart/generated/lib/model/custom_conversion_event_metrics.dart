//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CustomConversionEventMetrics {
  /// Returns a new [CustomConversionEventMetrics] instance.
  CustomConversionEventMetrics({
    required this.customEventMetricsType,
    required this.customEventName,
  });

  AdeColumnType customEventMetricsType;

  /// Name of the advertiser-defined custom conversion event
  String customEventName;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CustomConversionEventMetrics &&
    other.customEventMetricsType == customEventMetricsType &&
    other.customEventName == customEventName;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customEventMetricsType.hashCode) +
    (customEventName.hashCode);

  @override
  String toString() => 'CustomConversionEventMetrics[customEventMetricsType=$customEventMetricsType, customEventName=$customEventName]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'custom_event_metrics_type'] = this.customEventMetricsType;
      json[r'custom_event_name'] = this.customEventName;
    return json;
  }

  /// Returns a new [CustomConversionEventMetrics] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CustomConversionEventMetrics? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'custom_event_metrics_type'), 'Required key "CustomConversionEventMetrics[custom_event_metrics_type]" is missing from JSON.');
        assert(json[r'custom_event_metrics_type'] != null, 'Required key "CustomConversionEventMetrics[custom_event_metrics_type]" has a null value in JSON.');
        assert(json.containsKey(r'custom_event_name'), 'Required key "CustomConversionEventMetrics[custom_event_name]" is missing from JSON.');
        assert(json[r'custom_event_name'] != null, 'Required key "CustomConversionEventMetrics[custom_event_name]" has a null value in JSON.');
        return true;
      }());

      return CustomConversionEventMetrics(
        customEventMetricsType: AdeColumnType.fromJson(json[r'custom_event_metrics_type'])!,
        customEventName: mapValueOfType<String>(json, r'custom_event_name')!,
      );
    }
    return null;
  }

  static List<CustomConversionEventMetrics> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomConversionEventMetrics>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomConversionEventMetrics.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CustomConversionEventMetrics> mapFromJson(dynamic json) {
    final map = <String, CustomConversionEventMetrics>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CustomConversionEventMetrics.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CustomConversionEventMetrics-objects as value to a dart map
  static Map<String, List<CustomConversionEventMetrics>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CustomConversionEventMetrics>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CustomConversionEventMetrics.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'custom_event_metrics_type',
    'custom_event_name',
  };
}

