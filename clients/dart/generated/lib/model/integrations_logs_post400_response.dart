//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationsLogsPost400Response {
  /// Returns a new [IntegrationsLogsPost400Response] instance.
  IntegrationsLogsPost400Response({
    required this.code,
    required this.message,
    required this.details,
  });

  int code;

  String message;

  Object details;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationsLogsPost400Response &&
    other.code == code &&
    other.message == message &&
    other.details == details;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (message.hashCode) +
    (details.hashCode);

  @override
  String toString() => 'IntegrationsLogsPost400Response[code=$code, message=$message, details=$details]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'message'] = this.message;
      json[r'details'] = this.details;
    return json;
  }

  /// Returns a new [IntegrationsLogsPost400Response] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationsLogsPost400Response? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "IntegrationsLogsPost400Response[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "IntegrationsLogsPost400Response[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return IntegrationsLogsPost400Response(
        code: mapValueOfType<int>(json, r'code')!,
        message: mapValueOfType<String>(json, r'message')!,
        details: mapValueOfType<Object>(json, r'details')!,
      );
    }
    return null;
  }

  static List<IntegrationsLogsPost400Response> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationsLogsPost400Response>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationsLogsPost400Response.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationsLogsPost400Response> mapFromJson(dynamic json) {
    final map = <String, IntegrationsLogsPost400Response>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationsLogsPost400Response.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationsLogsPost400Response-objects as value to a dart map
  static Map<String, List<IntegrationsLogsPost400Response>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationsLogsPost400Response>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationsLogsPost400Response.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'message',
    'details',
  };
}

