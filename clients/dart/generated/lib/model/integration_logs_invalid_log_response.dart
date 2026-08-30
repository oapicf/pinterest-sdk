//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class IntegrationLogsInvalidLogResponse {
  /// Returns a new [IntegrationLogsInvalidLogResponse] instance.
  IntegrationLogsInvalidLogResponse({
    this.rejectedLogs = const [],
  });

  List<IntegrationLogsInvalidLogResponseRejectedLogsItems> rejectedLogs;

  @override
  bool operator ==(Object other) => identical(this, other) || other is IntegrationLogsInvalidLogResponse &&
    _deepEquality.equals(other.rejectedLogs, rejectedLogs);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (rejectedLogs.hashCode);

  @override
  String toString() => 'IntegrationLogsInvalidLogResponse[rejectedLogs=$rejectedLogs]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'rejected_logs'] = this.rejectedLogs;
    return json;
  }

  /// Returns a new [IntegrationLogsInvalidLogResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static IntegrationLogsInvalidLogResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return IntegrationLogsInvalidLogResponse(
        rejectedLogs: IntegrationLogsInvalidLogResponseRejectedLogsItems.listFromJson(json[r'rejected_logs']),
      );
    }
    return null;
  }

  static List<IntegrationLogsInvalidLogResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntegrationLogsInvalidLogResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntegrationLogsInvalidLogResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, IntegrationLogsInvalidLogResponse> mapFromJson(dynamic json) {
    final map = <String, IntegrationLogsInvalidLogResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = IntegrationLogsInvalidLogResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of IntegrationLogsInvalidLogResponse-objects as value to a dart map
  static Map<String, List<IntegrationLogsInvalidLogResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<IntegrationLogsInvalidLogResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = IntegrationLogsInvalidLogResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

