//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormTestRequest {
  /// Returns a new [LeadFormTestRequest] instance.
  LeadFormTestRequest({
    this.answers = const [],
  });

  /// Test lead answers. Should follow the creation order.
  List<String> answers;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormTestRequest &&
    _deepEquality.equals(other.answers, answers);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (answers.hashCode);

  @override
  String toString() => 'LeadFormTestRequest[answers=$answers]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'answers'] = this.answers;
    return json;
  }

  /// Returns a new [LeadFormTestRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormTestRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadFormTestRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadFormTestRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadFormTestRequest(
        answers: json[r'answers'] is Iterable
            ? (json[r'answers'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<LeadFormTestRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormTestRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormTestRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormTestRequest> mapFromJson(dynamic json) {
    final map = <String, LeadFormTestRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormTestRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormTestRequest-objects as value to a dart map
  static Map<String, List<LeadFormTestRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormTestRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormTestRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'answers',
  };
}

