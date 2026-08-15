//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormTestResponse {
  /// Returns a new [LeadFormTestResponse] instance.
  LeadFormTestResponse({
    this.subscriptionId,
  });

  /// Subscription ID.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? subscriptionId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormTestResponse &&
    other.subscriptionId == subscriptionId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (subscriptionId == null ? 0 : subscriptionId!.hashCode);

  @override
  String toString() => 'LeadFormTestResponse[subscriptionId=$subscriptionId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.subscriptionId != null) {
      json[r'subscription_id'] = this.subscriptionId;
    } else {
      json[r'subscription_id'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormTestResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormTestResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadFormTestResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadFormTestResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadFormTestResponse(
        subscriptionId: mapValueOfType<String>(json, r'subscription_id'),
      );
    }
    return null;
  }

  static List<LeadFormTestResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormTestResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormTestResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormTestResponse> mapFromJson(dynamic json) {
    final map = <String, LeadFormTestResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormTestResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormTestResponse-objects as value to a dart map
  static Map<String, List<LeadFormTestResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormTestResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormTestResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

