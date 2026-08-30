//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class PinterestLibBatchItemException {
  /// Returns a new [PinterestLibBatchItemException] instance.
  PinterestLibBatchItemException({
    this.code,
    required this.message,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? code;

  String message;

  @override
  bool operator ==(Object other) => identical(this, other) || other is PinterestLibBatchItemException &&
    other.code == code &&
    other.message == message;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code == null ? 0 : code!.hashCode) +
    (message.hashCode);

  @override
  String toString() => 'PinterestLibBatchItemException[code=$code, message=$message]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
      json[r'message'] = this.message;
    return json;
  }

  /// Returns a new [PinterestLibBatchItemException] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static PinterestLibBatchItemException? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'message'), 'Required key "PinterestLibBatchItemException[message]" is missing from JSON.');
        assert(json[r'message'] != null, 'Required key "PinterestLibBatchItemException[message]" has a null value in JSON.');
        return true;
      }());

      return PinterestLibBatchItemException(
        code: mapValueOfType<int>(json, r'code'),
        message: mapValueOfType<String>(json, r'message')!,
      );
    }
    return null;
  }

  static List<PinterestLibBatchItemException> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinterestLibBatchItemException>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinterestLibBatchItemException.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, PinterestLibBatchItemException> mapFromJson(dynamic json) {
    final map = <String, PinterestLibBatchItemException>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = PinterestLibBatchItemException.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of PinterestLibBatchItemException-objects as value to a dart map
  static Map<String, List<PinterestLibBatchItemException>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<PinterestLibBatchItemException>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = PinterestLibBatchItemException.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'message',
  };
}

