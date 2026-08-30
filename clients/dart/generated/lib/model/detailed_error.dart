//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DetailedError {
  /// Returns a new [DetailedError] instance.
  DetailedError({
    required this.code,
    required this.details,
    required this.message,
  });

  int code;

  Object details;

  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DetailedError &&
    other.code == code &&
    other.details == details &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code.hashCode) +
    (details.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'DetailedError[code=$code, details=$details, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'code'] = this.code;
      json[r'details'] = this.details;
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [DetailedError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DetailedError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'code'), 'Required key "DetailedError[code]" is missing from JSON.');
        assert(json[r'code'] != null, 'Required key "DetailedError[code]" has a null value in JSON.');
        assert(json.containsKey(r'details'), 'Required key "DetailedError[details]" is missing from JSON.');
        assert(json[r'details'] != null, 'Required key "DetailedError[details]" has a null value in JSON.');
        assert(json.containsKey(r'message'), 'Required key "DetailedError[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "DetailedError[message]" has a null value in JSON.');
        return true;
      }());

      return DetailedError(
        code: mapValueOfType<int>(json, r'code')!,
        details: mapValueOfType<Object>(json, r'details')!,
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<DetailedError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DetailedError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DetailedError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DetailedError> mapFromJson(dynamic json) {
    final map = <String, DetailedError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DetailedError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DetailedError-objects as value to a dart map
  static Map<String, List<DetailedError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DetailedError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DetailedError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'code',
    'details',
    'message',
  };
}

