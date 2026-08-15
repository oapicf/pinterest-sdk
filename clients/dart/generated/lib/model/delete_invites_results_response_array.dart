//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class DeleteInvitesResultsResponseArray {
  /// Returns a new [DeleteInvitesResultsResponseArray] instance.
  DeleteInvitesResultsResponseArray({
    this.items = const [],
  });

  /// List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
  List<DeleteInvitesResultsResponseArrayItemsInner> items;

  @override
  bool operator ==(Object other) => identical(this, other) || other is DeleteInvitesResultsResponseArray &&
    _deepEquality.equals(other.items, items);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (items.hashCode);

  @override
  String toString() => 'DeleteInvitesResultsResponseArray[items=$items]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'items'] = this.items;
    return json;
  }

  /// Returns a new [DeleteInvitesResultsResponseArray] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static DeleteInvitesResultsResponseArray? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "DeleteInvitesResultsResponseArray[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "DeleteInvitesResultsResponseArray[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return DeleteInvitesResultsResponseArray(
        items: DeleteInvitesResultsResponseArrayItemsInner.listFromJson(json[r'items']),
      );
    }
    return null;
  }

  static List<DeleteInvitesResultsResponseArray> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeleteInvitesResultsResponseArray>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeleteInvitesResultsResponseArray.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, DeleteInvitesResultsResponseArray> mapFromJson(dynamic json) {
    final map = <String, DeleteInvitesResultsResponseArray>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = DeleteInvitesResultsResponseArray.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of DeleteInvitesResultsResponseArray-objects as value to a dart map
  static Map<String, List<DeleteInvitesResultsResponseArray>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<DeleteInvitesResultsResponseArray>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = DeleteInvitesResultsResponseArray.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

