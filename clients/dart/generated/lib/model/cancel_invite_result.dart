//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CancelInviteResult {
  /// Returns a new [CancelInviteResult] instance.
  CancelInviteResult({
    this.id,
    this.inviteData,
    this.isReceivedInvite,
    this.user,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  InviteDataResponse? inviteData;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isReceivedInvite;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  CancelInviteResultUser? user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CancelInviteResult &&
    other.id == id &&
    other.inviteData == inviteData &&
    other.isReceivedInvite == isReceivedInvite &&
    other.user == user;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (inviteData == null ? 0 : inviteData!.hashCode) +
    (isReceivedInvite == null ? 0 : isReceivedInvite!.hashCode) +
    (user == null ? 0 : user!.hashCode);

  @override
  String toString() => 'CancelInviteResult[id=$id, inviteData=$inviteData, isReceivedInvite=$isReceivedInvite, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.inviteData != null) {
      json[r'invite_data'] = this.inviteData;
    } else {
      json[r'invite_data'] = null;
    }
    if (this.isReceivedInvite != null) {
      json[r'is_received_invite'] = this.isReceivedInvite;
    } else {
      json[r'is_received_invite'] = null;
    }
    if (this.user != null) {
      json[r'user'] = this.user;
    } else {
      json[r'user'] = null;
    }
    return json;
  }

  /// Returns a new [CancelInviteResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CancelInviteResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return CancelInviteResult(
        id: mapValueOfType<String>(json, r'id'),
        inviteData: InviteDataResponse.fromJson(json[r'invite_data']),
        isReceivedInvite: mapValueOfType<bool>(json, r'is_received_invite'),
        user: CancelInviteResultUser.fromJson(json[r'user']),
      );
    }
    return null;
  }

  static List<CancelInviteResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CancelInviteResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CancelInviteResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CancelInviteResult> mapFromJson(dynamic json) {
    final map = <String, CancelInviteResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CancelInviteResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CancelInviteResult-objects as value to a dart map
  static Map<String, List<CancelInviteResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CancelInviteResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CancelInviteResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

