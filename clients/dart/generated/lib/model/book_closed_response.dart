//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BookClosedResponse {
  /// Returns a new [BookClosedResponse] instance.
  BookClosedResponse({
    this.conversionMetricsReady,
    this.nonConversionMetricsReady,
  });

  /// Are conversion metrics ready?
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? conversionMetricsReady;

  /// Are non-conversion metrics ready?
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? nonConversionMetricsReady;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BookClosedResponse &&
    other.conversionMetricsReady == conversionMetricsReady &&
    other.nonConversionMetricsReady == nonConversionMetricsReady;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (conversionMetricsReady == null ? 0 : conversionMetricsReady!.hashCode) +
    (nonConversionMetricsReady == null ? 0 : nonConversionMetricsReady!.hashCode);

  @override
  String toString() => 'BookClosedResponse[conversionMetricsReady=$conversionMetricsReady, nonConversionMetricsReady=$nonConversionMetricsReady]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.conversionMetricsReady != null) {
      json[r'conversion_metrics_ready'] = this.conversionMetricsReady;
    } else {
      json[r'conversion_metrics_ready'] = null;
    }
    if (this.nonConversionMetricsReady != null) {
      json[r'non_conversion_metrics_ready'] = this.nonConversionMetricsReady;
    } else {
      json[r'non_conversion_metrics_ready'] = null;
    }
    return json;
  }

  /// Returns a new [BookClosedResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BookClosedResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "BookClosedResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "BookClosedResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return BookClosedResponse(
        conversionMetricsReady: mapValueOfType<bool>(json, r'conversion_metrics_ready'),
        nonConversionMetricsReady: mapValueOfType<bool>(json, r'non_conversion_metrics_ready'),
      );
    }
    return null;
  }

  static List<BookClosedResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BookClosedResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BookClosedResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BookClosedResponse> mapFromJson(dynamic json) {
    final map = <String, BookClosedResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BookClosedResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BookClosedResponse-objects as value to a dart map
  static Map<String, List<BookClosedResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BookClosedResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BookClosedResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

