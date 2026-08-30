//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ConversionApiResponseEventsItems {
  /// Returns a new [ConversionApiResponseEventsItems] instance.
  ConversionApiResponseEventsItems({
    this.errorMessage,
    required this.status,
    this.warningMessage,
  });

  /// Error message containing more information about why the event failed to be processed.
  String? errorMessage;

  /// Whether the event was processed successfully.
  EventProcessingStatus status;

  /// Warning messages about any fields in the event which are not standard. These are not critical to event processing.
  String? warningMessage;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ConversionApiResponseEventsItems &&
    other.errorMessage == errorMessage &&
    other.status == status &&
    other.warningMessage == warningMessage;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (errorMessage == null ? 0 : errorMessage!.hashCode) +
    (status.hashCode) +
    (warningMessage == null ? 0 : warningMessage!.hashCode);

  @override
  String toString() => 'ConversionApiResponseEventsItems[errorMessage=$errorMessage, status=$status, warningMessage=$warningMessage]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.errorMessage != null) {
      json[r'error_message'] = this.errorMessage;
    } else {
      json[r'error_message'] = null;
    }
      json[r'status'] = this.status;
    if (this.warningMessage != null) {
      json[r'warning_message'] = this.warningMessage;
    } else {
      json[r'warning_message'] = null;
    }
    return json;
  }

  /// Returns a new [ConversionApiResponseEventsItems] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ConversionApiResponseEventsItems? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'status'), 'Required key "ConversionApiResponseEventsItems[status]" is missing from JSON.');
        assert(json[r'status'] != null, 'Required key "ConversionApiResponseEventsItems[status]" has a null value in JSON.');
        return true;
      }());

      return ConversionApiResponseEventsItems(
        errorMessage: mapValueOfType<String>(json, r'error_message'),
        status: EventProcessingStatus.fromJson(json[r'status'])!,
        warningMessage: mapValueOfType<String>(json, r'warning_message'),
      );
    }
    return null;
  }

  static List<ConversionApiResponseEventsItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionApiResponseEventsItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionApiResponseEventsItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ConversionApiResponseEventsItems> mapFromJson(dynamic json) {
    final map = <String, ConversionApiResponseEventsItems>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ConversionApiResponseEventsItems.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ConversionApiResponseEventsItems-objects as value to a dart map
  static Map<String, List<ConversionApiResponseEventsItems>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ConversionApiResponseEventsItems>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ConversionApiResponseEventsItems.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'status',
  };
}

