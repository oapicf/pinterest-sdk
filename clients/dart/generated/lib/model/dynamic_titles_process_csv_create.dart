//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DynamicTitlesProcessCSVCreate {
  /// Returns a new [DynamicTitlesProcessCSVCreate] instance.
  DynamicTitlesProcessCSVCreate({
    required this.requestId,
  });

  /// The request_id returned from the GET uploads endpoint.
  String requestId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DynamicTitlesProcessCSVCreate &&
    other.requestId == requestId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (requestId.hashCode);

  @override
  String toString() => 'DynamicTitlesProcessCSVCreate[requestId=$requestId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'request_id'] = this.requestId;
    return json;
  }

  /// Returns a new [DynamicTitlesProcessCSVCreate] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DynamicTitlesProcessCSVCreate? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'request_id'), 'Required key "DynamicTitlesProcessCSVCreate[request_id]" is missing from JSON.');
        assert(json[r'request_id'] != null, 'Required key "DynamicTitlesProcessCSVCreate[request_id]" has a null value in JSON.');
        return true;
      }());

      return DynamicTitlesProcessCSVCreate(
        requestId: mapValueOfType<String>(json, r'request_id')!,
      );
    }
    return null;
  }

  static List<DynamicTitlesProcessCSVCreate> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DynamicTitlesProcessCSVCreate>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DynamicTitlesProcessCSVCreate.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DynamicTitlesProcessCSVCreate> mapFromJson(dynamic json) {
    final map = <String, DynamicTitlesProcessCSVCreate>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DynamicTitlesProcessCSVCreate.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DynamicTitlesProcessCSVCreate-objects as value to a dart map
  static Map<String, List<DynamicTitlesProcessCSVCreate>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DynamicTitlesProcessCSVCreate>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DynamicTitlesProcessCSVCreate.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'request_id',
  };
}

