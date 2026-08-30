//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteBusinessRoleBinding {
  /// Returns a new [InviteBusinessRoleBinding] instance.
  InviteBusinessRoleBinding({
    this.createdByBusinessId,
    this.createdByUserId,
    this.id,
    this.inviteData,
    this.isReceivedInvite,
    this.user,
  });

  /// Unique identifier for the business that created the invite/request.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? createdByBusinessId;

  /// Unique identifier for the user that created the invite/request.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? createdByUserId;

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
  bool operator ==(Object other) => identical(this, other) || other is InviteBusinessRoleBinding &&
    other.createdByBusinessId == createdByBusinessId &&
    other.createdByUserId == createdByUserId &&
    other.id == id &&
    other.inviteData == inviteData &&
    other.isReceivedInvite == isReceivedInvite &&
    other.user == user;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (createdByBusinessId == null ? 0 : createdByBusinessId!.hashCode) +
    (createdByUserId == null ? 0 : createdByUserId!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (inviteData == null ? 0 : inviteData!.hashCode) +
    (isReceivedInvite == null ? 0 : isReceivedInvite!.hashCode) +
    (user == null ? 0 : user!.hashCode);

  @override
  String toString() => 'InviteBusinessRoleBinding[createdByBusinessId=$createdByBusinessId, createdByUserId=$createdByUserId, id=$id, inviteData=$inviteData, isReceivedInvite=$isReceivedInvite, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.createdByBusinessId != null) {
      json[r'created_by_business_id'] = this.createdByBusinessId;
    } else {
      json[r'created_by_business_id'] = null;
    }
    if (this.createdByUserId != null) {
      json[r'created_by_user_id'] = this.createdByUserId;
    } else {
      json[r'created_by_user_id'] = null;
    }
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

  /// Returns a new [InviteBusinessRoleBinding] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteBusinessRoleBinding? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return InviteBusinessRoleBinding(
        createdByBusinessId: mapValueOfType<String>(json, r'created_by_business_id'),
        createdByUserId: mapValueOfType<String>(json, r'created_by_user_id'),
        id: mapValueOfType<String>(json, r'id'),
        inviteData: InviteDataResponse.fromJson(json[r'invite_data']),
        isReceivedInvite: mapValueOfType<bool>(json, r'is_received_invite'),
        user: BusinessAccessUserSummary.fromJson(json[r'user']),
      );
    }
    return null;
  }

  static List<InviteBusinessRoleBinding> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteBusinessRoleBinding>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteBusinessRoleBinding.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteBusinessRoleBinding> mapFromJson(dynamic json) {
    final map = <String, InviteBusinessRoleBinding>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteBusinessRoleBinding.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteBusinessRoleBinding-objects as value to a dart map
  static Map<String, List<InviteBusinessRoleBinding>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteBusinessRoleBinding>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteBusinessRoleBinding.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

