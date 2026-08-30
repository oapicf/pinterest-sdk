//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsHotelGuestRatings {
  /// Returns a new [CatalogsHotelGuestRatings] instance.
  CatalogsHotelGuestRatings({
    this.maxScore,
    this.numberOfReviewers,
    this.ratingSystem,
    this.score,
  });

  /// Max value for the hotel rating score.
  num? maxScore;

  /// Total number of people who have rated this hotel.
  int? numberOfReviewers;

  /// System you use for guest reviews.
  String? ratingSystem;

  /// Your hotel's rating.
  num? score;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsHotelGuestRatings &&
    other.maxScore == maxScore &&
    other.numberOfReviewers == numberOfReviewers &&
    other.ratingSystem == ratingSystem &&
    other.score == score;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (maxScore == null ? 0 : maxScore!.hashCode) +
    (numberOfReviewers == null ? 0 : numberOfReviewers!.hashCode) +
    (ratingSystem == null ? 0 : ratingSystem!.hashCode) +
    (score == null ? 0 : score!.hashCode);

  @override
  String toString() => 'CatalogsHotelGuestRatings[maxScore=$maxScore, numberOfReviewers=$numberOfReviewers, ratingSystem=$ratingSystem, score=$score]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.maxScore != null) {
      json[r'max_score'] = this.maxScore;
    } else {
      json[r'max_score'] = null;
    }
    if (this.numberOfReviewers != null) {
      json[r'number_of_reviewers'] = this.numberOfReviewers;
    } else {
      json[r'number_of_reviewers'] = null;
    }
    if (this.ratingSystem != null) {
      json[r'rating_system'] = this.ratingSystem;
    } else {
      json[r'rating_system'] = null;
    }
    if (this.score != null) {
      json[r'score'] = this.score;
    } else {
      json[r'score'] = null;
    }
    return json;
  }

  /// Returns a new [CatalogsHotelGuestRatings] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsHotelGuestRatings? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CatalogsHotelGuestRatings(
        maxScore: json[r'max_score'] == null
            ? null
            : num.parse('${json[r'max_score']}'),
        numberOfReviewers: mapValueOfType<int>(json, r'number_of_reviewers'),
        ratingSystem: mapValueOfType<String>(json, r'rating_system'),
        score: json[r'score'] == null
            ? null
            : num.parse('${json[r'score']}'),
      );
    }
    return null;
  }

  static List<CatalogsHotelGuestRatings> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelGuestRatings>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelGuestRatings.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsHotelGuestRatings> mapFromJson(dynamic json) {
    final map = <String, CatalogsHotelGuestRatings>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsHotelGuestRatings.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsHotelGuestRatings-objects as value to a dart map
  static Map<String, List<CatalogsHotelGuestRatings>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsHotelGuestRatings>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsHotelGuestRatings.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

