//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BookClosed {
  /// Returns a new [BookClosed] instance.
  BookClosed({
    required this.conversionMetricsReady,
    required this.nonConversionMetricsReady,
  });

  /// Are conversion metrics ready?
  bool conversionMetricsReady;

  /// Are non-conversion metrics ready?
  bool nonConversionMetricsReady;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BookClosed &&
    other.conversionMetricsReady == conversionMetricsReady &&
    other.nonConversionMetricsReady == nonConversionMetricsReady;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (conversionMetricsReady.hashCode) +
    (nonConversionMetricsReady.hashCode);

  @override
  String toString() => 'BookClosed[conversionMetricsReady=$conversionMetricsReady, nonConversionMetricsReady=$nonConversionMetricsReady]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'conversion_metrics_ready'] = this.conversionMetricsReady;
      json[r'non_conversion_metrics_ready'] = this.nonConversionMetricsReady;
    return json;
  }

  /// Returns a new [BookClosed] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BookClosed? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'conversion_metrics_ready'), 'Required key "BookClosed[conversion_metrics_ready]" is missing from JSON.');
        assert(json[r'conversion_metrics_ready'] != null, 'Required key "BookClosed[conversion_metrics_ready]" has a null value in JSON.');
        assert(json.containsKey(r'non_conversion_metrics_ready'), 'Required key "BookClosed[non_conversion_metrics_ready]" is missing from JSON.');
        assert(json[r'non_conversion_metrics_ready'] != null, 'Required key "BookClosed[non_conversion_metrics_ready]" has a null value in JSON.');
        return true;
      }());

      return BookClosed(
        conversionMetricsReady: mapValueOfType<bool>(json, r'conversion_metrics_ready')!,
        nonConversionMetricsReady: mapValueOfType<bool>(json, r'non_conversion_metrics_ready')!,
      );
    }
    return null;
  }

  static List<BookClosed> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BookClosed>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BookClosed.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BookClosed> mapFromJson(dynamic json) {
    final map = <String, BookClosed>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BookClosed.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BookClosed-objects as value to a dart map
  static Map<String, List<BookClosed>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BookClosed>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BookClosed.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'conversion_metrics_ready',
    'non_conversion_metrics_ready',
  };
}

