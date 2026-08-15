//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateInvitesResultsResponseArray {
  /// Returns a new [CreateInvitesResultsResponseArray] instance.
  CreateInvitesResultsResponseArray({
    this.items = const [],
  });

  /// List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned.
  List<CreateInvitesResultsResponseArrayItemsInner> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateInvitesResultsResponseArray &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode);

  @override
  String toString() => 'CreateInvitesResultsResponseArray[items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [CreateInvitesResultsResponseArray] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateInvitesResultsResponseArray? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateInvitesResultsResponseArray[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateInvitesResultsResponseArray[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateInvitesResultsResponseArray(
        items: CreateInvitesResultsResponseArrayItemsInner.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<CreateInvitesResultsResponseArray> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateInvitesResultsResponseArray>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateInvitesResultsResponseArray.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateInvitesResultsResponseArray> mapFromJson(dynamic json) {
    final map = <String, CreateInvitesResultsResponseArray>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateInvitesResultsResponseArray.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateInvitesResultsResponseArray-objects as value to a dart map
  static Map<String, List<CreateInvitesResultsResponseArray>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateInvitesResultsResponseArray>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateInvitesResultsResponseArray.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

