//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class TopVideoPinsAnalyticsResponse {
  /// Returns a new [TopVideoPinsAnalyticsResponse] instance.
  TopVideoPinsAnalyticsResponse({
    this.dateAvailability,
    this.pins = const [],
    this.sortBy,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TopVideoPinsAnalyticsResponseDateAvailability? dateAvailability;

  List<TopVideoPinsAnalyticsResponsePinsItems> pins;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TopVideoPinsSortBy? sortBy;

  @override
  bool operator ==(Object other) => identical(this, other) || other is TopVideoPinsAnalyticsResponse &&
    other.dateAvailability == dateAvailability &&
    _deepEquality.equals(other.pins, pins) &&
    other.sortBy == sortBy;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (dateAvailability == null ? 0 : dateAvailability!.hashCode) +
    (pins.hashCode) +
    (sortBy == null ? 0 : sortBy!.hashCode);

  @override
  String toString() => 'TopVideoPinsAnalyticsResponse[dateAvailability=$dateAvailability, pins=$pins, sortBy=$sortBy]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.dateAvailability != null) {
      json[r'date_availability'] = this.dateAvailability;
    } else {
      json[r'date_availability'] = null;
    }
      json[r'pins'] = this.pins;
    if (this.sortBy != null) {
      json[r'sort_by'] = this.sortBy;
    } else {
      json[r'sort_by'] = null;
    }
    return json;
  }

  /// Returns a new [TopVideoPinsAnalyticsResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static TopVideoPinsAnalyticsResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return TopVideoPinsAnalyticsResponse(
        dateAvailability: TopVideoPinsAnalyticsResponseDateAvailability.fromJson(json[r'date_availability']),
        pins: TopVideoPinsAnalyticsResponsePinsItems.listFromJson(json[r'pins']),
        sortBy: TopVideoPinsSortBy.fromJson(json[r'sort_by']),
      );
    }
    return null;
  }

  static List<TopVideoPinsAnalyticsResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopVideoPinsAnalyticsResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopVideoPinsAnalyticsResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, TopVideoPinsAnalyticsResponse> mapFromJson(dynamic json) {
    final map = <String, TopVideoPinsAnalyticsResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = TopVideoPinsAnalyticsResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of TopVideoPinsAnalyticsResponse-objects as value to a dart map
  static Map<String, List<TopVideoPinsAnalyticsResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<TopVideoPinsAnalyticsResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = TopVideoPinsAnalyticsResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

