//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteExceptionResponse {
  /// Returns a new [InviteExceptionResponse] instance.
  InviteExceptionResponse({
    this.code,
    this.inviteOrRequestId,
    this.message,
    this.usersOrPartnerIds = const [],
  });

  /// Error code associated with the error in performing the action on the invite/request.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? code;

  /// Unique identifier of the invite/request.
  String? inviteOrRequestId;

  /// Error message associated with the error in performing the action on the invite/request.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? message;

  /// A list of users' usernames or emails OR a list of partner ids that caused the error.
  List<String>? usersOrPartnerIds;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteExceptionResponse &&
    other.code == code &&
    other.inviteOrRequestId == inviteOrRequestId &&
    other.message == message &&
    _deepEquality.equals(other.usersOrPartnerIds, usersOrPartnerIds);

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (code == null ? 0 : code!.hashCode) +
    (inviteOrRequestId == null ? 0 : inviteOrRequestId!.hashCode) +
    (message == null ? 0 : message!.hashCode) +
    (usersOrPartnerIds == null ? 0 : usersOrPartnerIds!.hashCode);

  @override
  String toString() => 'InviteExceptionResponse[code=$code, inviteOrRequestId=$inviteOrRequestId, message=$message, usersOrPartnerIds=$usersOrPartnerIds]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.code != null) {
      json[r'code'] = this.code;
    } else {
      json[r'code'] = null;
    }
    if (this.inviteOrRequestId != null) {
      json[r'invite_or_request_id'] = this.inviteOrRequestId;
    } else {
      json[r'invite_or_request_id'] = null;
    }
    if (this.message != null) {
      json[r'message'] = this.message;
    } else {
      json[r'message'] = null;
    }
    if (this.usersOrPartnerIds != null) {
      json[r'users_or_partner_ids'] = this.usersOrPartnerIds;
    } else {
      json[r'users_or_partner_ids'] = null;
    }
    return json;
  }

  /// Returns a new [InviteExceptionResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteExceptionResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteExceptionResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteExceptionResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteExceptionResponse(
        code: mapValueOfType<int>(json, r'code'),
        inviteOrRequestId: mapValueOfType<String>(json, r'invite_or_request_id'),
        message: mapValueOfType<String>(json, r'message'),
        usersOrPartnerIds: json[r'users_or_partner_ids'] is Iterable
            ? (json[r'users_or_partner_ids'] as Iterable).cast<String>().toList(growable: false)
            : const [],
      );
    }
    return null;
  }

  static List<InviteExceptionResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteExceptionResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteExceptionResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteExceptionResponse> mapFromJson(dynamic json) {
    final map = <String, InviteExceptionResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteExceptionResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteExceptionResponse-objects as value to a dart map
  static Map<String, List<InviteExceptionResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteExceptionResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteExceptionResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

