//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class KeywordError {
  /// Returns a new [KeywordError] instance.
  KeywordError({
    this.data,
    this.errorMessages = const [],
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  Keyword? data;

  List<String> errorMessages;

  @override
  bool operator ==(Object other) => identical(this, other) || other is KeywordError &&
    other.data == data &&
    _deepEquality.equals(other.errorMessages, errorMessages);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (data == null ? 0 : data!.hashCode) +
    (errorMessages.hashCode);

  @override
  String toString() => 'KeywordError[data=$data, errorMessages=$errorMessages]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.data != null) {
      json[r'data'] = this.data;
    } else {
      json[r'data'] = null;
    }
      json[r'error_messages'] = this.errorMessages;
    return json;
  }

  /// Returns a new [KeywordError] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static KeywordError? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "KeywordError[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "KeywordError[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return KeywordError(
        data: Keyword.fromJson(json[r'data']),
        errorMessages: json[r'error_messages'] is Iterable
            ? (json[r'error_messages'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<KeywordError> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <KeywordError>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = KeywordError.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, KeywordError> mapFromJson(dynamic json) {
    final map = <String, KeywordError>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = KeywordError.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of KeywordError-objects as value to a dart map
  static Map<String, List<KeywordError>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<KeywordError>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = KeywordError.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

