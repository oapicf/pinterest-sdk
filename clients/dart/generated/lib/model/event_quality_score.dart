//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class EventQualityScore {
  /// Returns a new [EventQualityScore] instance.
  EventQualityScore({
    required this.ingestionSource,
    required this.lookbackPeriod,
    required this.overallStatus,
    required this.qualityComponents,
    required this.sourcePlatform,
  });

  IngestionSourceOptions ingestionSource;

  LookbackPeriodOptions lookbackPeriod;

  OverallStatusOptions overallStatus;

  QualityComponents qualityComponents;

  SourcePlatformOptions sourcePlatform;

  @override
  bool operator ==(Object other) => identical(this, other) || other is EventQualityScore &&
    other.ingestionSource == ingestionSource &&
    other.lookbackPeriod == lookbackPeriod &&
    other.overallStatus == overallStatus &&
    other.qualityComponents == qualityComponents &&
    other.sourcePlatform == sourcePlatform;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (ingestionSource.hashCode) +
    (lookbackPeriod.hashCode) +
    (overallStatus.hashCode) +
    (qualityComponents.hashCode) +
    (sourcePlatform.hashCode);

  @override
  String toString() => 'EventQualityScore[ingestionSource=$ingestionSource, lookbackPeriod=$lookbackPeriod, overallStatus=$overallStatus, qualityComponents=$qualityComponents, sourcePlatform=$sourcePlatform]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'ingestion_source'] = this.ingestionSource;
      json[r'lookback_period'] = this.lookbackPeriod;
      json[r'overall_status'] = this.overallStatus;
      json[r'quality_components'] = this.qualityComponents;
      json[r'source_platform'] = this.sourcePlatform;
    return json;
  }

  /// Returns a new [EventQualityScore] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static EventQualityScore? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "EventQualityScore[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "EventQualityScore[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return EventQualityScore(
        ingestionSource: IngestionSourceOptions.fromJson(json[r'ingestion_source'])!,
        lookbackPeriod: LookbackPeriodOptions.fromJson(json[r'lookback_period'])!,
        overallStatus: OverallStatusOptions.fromJson(json[r'overall_status'])!,
        qualityComponents: QualityComponents.fromJson(json[r'quality_components'])!,
        sourcePlatform: SourcePlatformOptions.fromJson(json[r'source_platform'])!,
      );
    }
    return null;
  }

  static List<EventQualityScore> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <EventQualityScore>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = EventQualityScore.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, EventQualityScore> mapFromJson(dynamic json) {
    final map = <String, EventQualityScore>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = EventQualityScore.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of EventQualityScore-objects as value to a dart map
  static Map<String, List<EventQualityScore>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<EventQualityScore>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = EventQualityScore.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'ingestion_source',
    'lookback_period',
    'overall_status',
    'quality_components',
    'source_platform',
  };
}

