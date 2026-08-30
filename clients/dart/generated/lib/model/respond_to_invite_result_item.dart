//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class RespondToInviteResultItem {
  /// Returns a new [RespondToInviteResultItem] instance.
  RespondToInviteResultItem({
    this.exception,
    this.invite,
  });

  InviteExceptionResponse? exception;

  /// An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
  BaseInviteDataResponse? invite;

  @override
  bool operator ==(Object other) => identical(this, other) || other is RespondToInviteResultItem &&
    other.exception == exception &&
    other.invite == invite;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exception == null ? 0 : exception!.hashCode) +
    (invite == null ? 0 : invite!.hashCode);

  @override
  String toString() => 'RespondToInviteResultItem[exception=$exception, invite=$invite]';

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

  /// Returns a new [RespondToInviteResultItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static RespondToInviteResultItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return RespondToInviteResultItem(
        exception: InviteExceptionResponse.fromJson(json[r'exception']),
        invite: BaseInviteDataResponse.fromJson(json[r'invite']),
      );
    }
    return null;
  }

  static List<RespondToInviteResultItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <RespondToInviteResultItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = RespondToInviteResultItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, RespondToInviteResultItem> mapFromJson(dynamic json) {
    final map = <String, RespondToInviteResultItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = RespondToInviteResultItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of RespondToInviteResultItem-objects as value to a dart map
  static Map<String, List<RespondToInviteResultItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<RespondToInviteResultItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = RespondToInviteResultItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

