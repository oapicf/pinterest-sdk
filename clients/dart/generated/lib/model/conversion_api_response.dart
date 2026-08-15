//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionApiResponse {
  /// Returns a new [ConversionApiResponse] instance.
  ConversionApiResponse({
    this.events = const [],
    required this.numEventsProcessed,
    required this.numEventsReceived,
  });

  /// Specific messages for each event received. The order will match the order in which the events were received in the request.
  List<ConversionApiResponseEventsInner> events;

  /// Number of events that were successfully processed from the events.
  int numEventsProcessed;

  /// Total number of events received in the request.
  int numEventsReceived;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionApiResponse &&
    _deepEquality.equals(other.events, events) &&
    other.numEventsProcessed == numEventsProcessed &&
    other.numEventsReceived == numEventsReceived;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (events.hashCode) +
    (numEventsProcessed.hashCode) +
    (numEventsReceived.hashCode);

  @override
  String toString() => 'ConversionApiResponse[events=$events, numEventsProcessed=$numEventsProcessed, numEventsReceived=$numEventsReceived]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'events'] = this.events;
      json[r'num_events_processed'] = this.numEventsProcessed;
      json[r'num_events_received'] = this.numEventsReceived;
    return json;
  }

  /// Returns a new [ConversionApiResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionApiResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ConversionApiResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ConversionApiResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ConversionApiResponse(
        events: ConversionApiResponseEventsInner.listFromJson(json[r'events']),
        numEventsProcessed: mapValueOfType<int>(json, r'num_events_processed')!,
        numEventsReceived: mapValueOfType<int>(json, r'num_events_received')!,
      );
    }
    return null;
  }

  static List<ConversionApiResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionApiResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionApiResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionApiResponse> mapFromJson(dynamic json) {
    final map = <String, ConversionApiResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionApiResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionApiResponse-objects as value to a dart map
  static Map<String, List<ConversionApiResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionApiResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionApiResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'events',
    'num_events_processed',
    'num_events_received',
  };
}

