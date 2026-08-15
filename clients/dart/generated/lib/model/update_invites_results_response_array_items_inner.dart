//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateInvitesResultsResponseArrayItemsInner {
  /// Returns a new [UpdateInvitesResultsResponseArrayItemsInner] instance.
  UpdateInvitesResultsResponseArrayItemsInner({
    this.exception,
    this.invite,
  });

  InviteExceptionResponse? exception;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  InviteBusinessRoleBinding? invite;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateInvitesResultsResponseArrayItemsInner &&
    other.exception == exception &&
    other.invite == invite;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exception == null ? 0 : exception!.hashCode) +
    (invite == null ? 0 : invite!.hashCode);

  @override
  String toString() => 'UpdateInvitesResultsResponseArrayItemsInner[exception=$exception, invite=$invite]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.exception != null) {
      json[r'exception'] = this.exception;
    } else {
      json[r'exception'] = null;
    }
    if (this.invite != null) {
      json[r'invite'] = this.invite;
    } else {
      json[r'invite'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateInvitesResultsResponseArrayItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateInvitesResultsResponseArrayItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateInvitesResultsResponseArrayItemsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateInvitesResultsResponseArrayItemsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateInvitesResultsResponseArrayItemsInner(
        exception: InviteExceptionResponse.fromJson(json[r'exception']),
        invite: InviteBusinessRoleBinding.fromJson(json[r'invite']),
      );
    }
    return null;
  }

  static List<UpdateInvitesResultsResponseArrayItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateInvitesResultsResponseArrayItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateInvitesResultsResponseArrayItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateInvitesResultsResponseArrayItemsInner> mapFromJson(dynamic json) {
    final map = <String, UpdateInvitesResultsResponseArrayItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateInvitesResultsResponseArrayItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateInvitesResultsResponseArrayItemsInner-objects as value to a dart map
  static Map<String, List<UpdateInvitesResultsResponseArrayItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateInvitesResultsResponseArrayItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateInvitesResultsResponseArrayItemsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

