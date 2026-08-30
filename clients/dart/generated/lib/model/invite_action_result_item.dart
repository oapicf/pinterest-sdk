//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteActionResultItem {
  /// Returns a new [InviteActionResultItem] instance.
  InviteActionResultItem({
    this.exception,
    this.invite,
  });

  InviteExceptionResponse? exception;

  InviteBusinessRoleBinding? invite;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteActionResultItem &&
    other.exception == exception &&
    other.invite == invite;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (exception == null ? 0 : exception!.hashCode) +
    (invite == null ? 0 : invite!.hashCode);

  @override
  String toString() => 'InviteActionResultItem[exception=$exception, invite=$invite]';

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

  /// Returns a new [InviteActionResultItem] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteActionResultItem? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return InviteActionResultItem(
        exception: InviteExceptionResponse.fromJson(json[r'exception']),
        invite: InviteBusinessRoleBinding.fromJson(json[r'invite']),
      );
    }
    return null;
  }

  static List<InviteActionResultItem> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteActionResultItem>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteActionResultItem.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteActionResultItem> mapFromJson(dynamic json) {
    final map = <String, InviteActionResultItem>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteActionResultItem.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteActionResultItem-objects as value to a dart map
  static Map<String, List<InviteActionResultItem>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteActionResultItem>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteActionResultItem.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

