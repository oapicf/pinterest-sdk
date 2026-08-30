//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionEvents {
  /// Returns a new [ConversionEvents] instance.
  ConversionEvents({
    this.events = const [],
    required this.numEventsProcessed,
    required this.numEventsReceived,
  });

  /// Specific messages for each event received. The order will match the order in which the events were received in the request.
  List<ConversionApiResponseEventsItems> events;

  /// Number of events that were successfully processed from the events.
  int numEventsProcessed;

  /// Total number of events received in the request.
  int numEventsReceived;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionEvents &&
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
  String toString() => 'ConversionEvents[events=$events, numEventsProcessed=$numEventsProcessed, numEventsReceived=$numEventsReceived]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'events'] = this.events;
      json[r'num_events_processed'] = this.numEventsProcessed;
      json[r'num_events_received'] = this.numEventsReceived;
    return json;
  }

  /// Returns a new [ConversionEvents] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionEvents? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'events'), 'Required key "ConversionEvents[events]" is missing from JSON.');
        assert(json[r'events'] != null, 'Required key "ConversionEvents[events]" has a null value in JSON.');
        assert(json.containsKey(r'num_events_processed'), 'Required key "ConversionEvents[num_events_processed]" is missing from JSON.');
        assert(json[r'num_events_processed'] != null, 'Required key "ConversionEvents[num_events_processed]" has a null value in JSON.');
        assert(json.containsKey(r'num_events_received'), 'Required key "ConversionEvents[num_events_received]" is missing from JSON.');
        assert(json[r'num_events_received'] != null, 'Required key "ConversionEvents[num_events_received]" has a null value in JSON.');
        return true;
      }());

      return ConversionEvents(
        events: ConversionApiResponseEventsItems.listFromJson(json[r'events']),
        numEventsProcessed: mapValueOfType<int>(json, r'num_events_processed')!,
        numEventsReceived: mapValueOfType<int>(json, r'num_events_received')!,
      );
    }
    return null;
  }

  static List<ConversionEvents> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEvents>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEvents.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionEvents> mapFromJson(dynamic json) {
    final map = <String, ConversionEvents>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionEvents.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionEvents-objects as value to a dart map
  static Map<String, List<ConversionEvents>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionEvents>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionEvents.listFromJson(entry.value, growable: growable,);
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

