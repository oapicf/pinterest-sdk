//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BaseInviteDataResponse {
  /// Returns a new [BaseInviteDataResponse] instance.
  BaseInviteDataResponse({
    this.id,
    this.inviteData,
    this.isReceivedInvite,
    this.user,
  });

  /// Unique identifier of the invite/request.
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

  /// Indicates whether the invite/request was received.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isReceivedInvite;

  /// Metadata for the member/partner that was sent the invite/request.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  BusinessAccessUserSummary? user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BaseInviteDataResponse &&
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
  String toString() => 'BaseInviteDataResponse[id=$id, inviteData=$inviteData, isReceivedInvite=$isReceivedInvite, user=$user]';

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

  /// Returns a new [BaseInviteDataResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BaseInviteDataResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return BaseInviteDataResponse(
        id: mapValueOfType<String>(json, r'id'),
        inviteData: InviteDataResponse.fromJson(json[r'invite_data']),
        isReceivedInvite: mapValueOfType<bool>(json, r'is_received_invite'),
        user: BusinessAccessUserSummary.fromJson(json[r'user']),
      );
    }
    return null;
  }

  static List<BaseInviteDataResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BaseInviteDataResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BaseInviteDataResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BaseInviteDataResponse> mapFromJson(dynamic json) {
    final map = <String, BaseInviteDataResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BaseInviteDataResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BaseInviteDataResponse-objects as value to a dart map
  static Map<String, List<BaseInviteDataResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BaseInviteDataResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BaseInviteDataResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

