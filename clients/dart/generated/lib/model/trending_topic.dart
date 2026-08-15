//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TrendingTopic {
  /// Returns a new [TrendingTopic] instance.
  TrendingTopic({
    required this.description,
    required this.percentGrowthMom,
    this.pins = const [],
    this.relatedInterests = const [],
    this.relatedSearches = const [],
    this.timeSeries = const {},
    required this.title,
  });

  /// Description of the trending topic
  String description;

  /// Month-over-month growth percentage
  int percentGrowthMom;

  /// Array of pin images related to this trend (up to 6)
  List<TrendingPin> pins;

  /// List of related interest categories
  List<String> relatedInterests;

  /// List of related search terms
  List<String> relatedSearches;

  /// Time series data showing trend values over time, with dates as keys and values as numeric
  Map<String, num> timeSeries;

  /// Title of the trending topic
  String title;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TrendingTopic &&
    other.description == description &&
    other.percentGrowthMom == percentGrowthMom &&
    _deepEquality.equals(other.pins, pins) &&
    _deepEquality.equals(other.relatedInterests, relatedInterests) &&
    _deepEquality.equals(other.relatedSearches, relatedSearches) &&
    _deepEquality.equals(other.timeSeries, timeSeries) &&
    other.title == title;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (description.hashCode) +
    (percentGrowthMom.hashCode) +
    (pins.hashCode) +
    (relatedInterests.hashCode) +
    (relatedSearches.hashCode) +
    (timeSeries.hashCode) +
    (title.hashCode);

  @override
  String toString() => 'TrendingTopic[description=$description, percentGrowthMom=$percentGrowthMom, pins=$pins, relatedInterests=$relatedInterests, relatedSearches=$relatedSearches, timeSeries=$timeSeries, title=$title]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'description'] = this.description;
      json[r'percent_growth_mom'] = this.percentGrowthMom;
      json[r'pins'] = this.pins;
      json[r'related_interests'] = this.relatedInterests;
      json[r'related_searches'] = this.relatedSearches;
      json[r'time_series'] = this.timeSeries;
      json[r'title'] = this.title;
    return json;
  }

  /// Returns a new [TrendingTopic] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TrendingTopic? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "TrendingTopic[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "TrendingTopic[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return TrendingTopic(
        description: mapValueOfType<String>(json, r'description')!,
        percentGrowthMom: mapValueOfType<int>(json, r'percent_growth_mom')!,
        pins: TrendingPin.listFromJson(json[r'pins']),
        relatedInterests: json[r'related_interests'] is Iterable
            ? (json[r'related_interests'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        relatedSearches: json[r'related_searches'] is Iterable
            ? (json[r'related_searches'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        timeSeries: mapCastOfType<String, num>(json, r'time_series')!,
        title: mapValueOfType<String>(json, r'title')!,
      );
    }
    return null;
  }

  static List<TrendingTopic> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendingTopic>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendingTopic.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TrendingTopic> mapFromJson(dynamic json) {
    final map = <String, TrendingTopic>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TrendingTopic.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TrendingTopic-objects as value to a dart map
  static Map<String, List<TrendingTopic>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TrendingTopic>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TrendingTopic.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'description',
    'percent_growth_mom',
    'pins',
    'related_interests',
    'related_searches',
    'time_series',
    'title',
  };
}

