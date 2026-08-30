//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormTest {
  /// Returns a new [LeadFormTest] instance.
  LeadFormTest({
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
  bool operator ==(Object other) => identical(this, other) || other is LeadFormTest &&
    other.subscriptionId == subscriptionId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (subscriptionId == null ? 0 : subscriptionId!.hashCode);

  @override
  String toString() => 'LeadFormTest[subscriptionId=$subscriptionId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.subscriptionId != null) {
      json[r'subscription_id'] = this.subscriptionId;
    } else {
      json[r'subscription_id'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormTest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormTest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return LeadFormTest(
        subscriptionId: mapValueOfType<String>(json, r'subscription_id'),
      );
    }
    return null;
  }

  static List<LeadFormTest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormTest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormTest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormTest> mapFromJson(dynamic json) {
    final map = <String, LeadFormTest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormTest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormTest-objects as value to a dart map
  static Map<String, List<LeadFormTest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormTest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormTest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

