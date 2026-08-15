//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class FeaturedTrend {
  /// Returns a new [FeaturedTrend] instance.
  FeaturedTrend({
    required this.interest,
    this.market,
    this.trends = const [],
  });

  /// The main interest category
  InterestsEnum interest;

  /// Market code (e.g., 'US', 'UK', etc.)
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ProductCategoryRegion? market;

  /// List of trending topics within this interest category
  List<TrendingTopic> trends;

  @override
  bool operator ==(Object other) => identical(this, other) || other is FeaturedTrend &&
    other.interest == interest &&
    other.market == market &&
    _deepEquality.equals(other.trends, trends);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (interest.hashCode) +
    (market == null ? 0 : market!.hashCode) +
    (trends.hashCode);

  @override
  String toString() => 'FeaturedTrend[interest=$interest, market=$market, trends=$trends]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'interest'] = this.interest;
    if (this.market != null) {
      json[r'market'] = this.market;
    } else {
      json[r'market'] = null;
    }
      json[r'trends'] = this.trends;
    return json;
  }

  /// Returns a new [FeaturedTrend] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static FeaturedTrend? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "FeaturedTrend[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "FeaturedTrend[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return FeaturedTrend(
        interest: InterestsEnum.fromJson(json[r'interest'])!,
        market: ProductCategoryRegion.fromJson(json[r'market']),
        trends: TrendingTopic.listFromJson(json[r'trends']),
      );
    }
    return null;
  }

  static List<FeaturedTrend> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <FeaturedTrend>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = FeaturedTrend.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, FeaturedTrend> mapFromJson(dynamic json) {
    final map = <String, FeaturedTrend>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = FeaturedTrend.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of FeaturedTrend-objects as value to a dart map
  static Map<String, List<FeaturedTrend>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<FeaturedTrend>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = FeaturedTrend.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'interest',
  };
}

