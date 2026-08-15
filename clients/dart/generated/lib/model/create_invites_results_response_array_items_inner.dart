//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CreateInvitesResultsResponseArrayItemsInner {
  /// Returns a new [CreateInvitesResultsResponseArrayItemsInner] instance.
  CreateInvitesResultsResponseArrayItemsInner({
    this.exception,
    this.invite,
  });

  InviteExceptionResponse? exception;

  CreateInvitesResultsResponseArrayItemsInnerInvite? invite;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CreateInvitesResultsResponseArrayItemsInner &&
    other.exception == exception &&
    other.invite == invite;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exception == null ? 0 : exception!.hashCode) +
    (invite == null ? 0 : invite!.hashCode);

  @override
  String toString() => 'CreateInvitesResultsResponseArrayItemsInner[exception=$exception, invite=$invite]';

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

  /// Returns a new [CreateInvitesResultsResponseArrayItemsInner] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CreateInvitesResultsResponseArrayItemsInner? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CreateInvitesResultsResponseArrayItemsInner[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CreateInvitesResultsResponseArrayItemsInner[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CreateInvitesResultsResponseArrayItemsInner(
        exception: InviteExceptionResponse.fromJson(json[r'exception']),
        invite: CreateInvitesResultsResponseArrayItemsInnerInvite.fromJson(json[r'invite']),
      );
    }
    return null;
  }

  static List<CreateInvitesResultsResponseArrayItemsInner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreateInvitesResultsResponseArrayItemsInner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreateInvitesResultsResponseArrayItemsInner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CreateInvitesResultsResponseArrayItemsInner> mapFromJson(dynamic json) {
    final map = <String, CreateInvitesResultsResponseArrayItemsInner>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CreateInvitesResultsResponseArrayItemsInner.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CreateInvitesResultsResponseArrayItemsInner-objects as value to a dart map
  static Map<String, List<CreateInvitesResultsResponseArrayItemsInner>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CreateInvitesResultsResponseArrayItemsInner>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CreateInvitesResultsResponseArrayItemsInner.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

