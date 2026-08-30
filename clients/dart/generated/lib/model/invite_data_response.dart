//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteDataResponse {
  /// Returns a new [InviteDataResponse] instance.
  InviteDataResponse({
    this.inviteExpiration,
    this.inviteStatus,
    this.inviteType,
    this.lastUpdatedTime,
    this.sentAt,
  });

  /// The date and time when the invite/request will expire. Returned in milliseconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? inviteExpiration;

  /// The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? inviteStatus;

  /// The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? inviteType;

  /// The date and time the invite/request was last updated. Returned in milliseconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? lastUpdatedTime;

  /// The date and time the invite/request was sent/created. Returned in milliseconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? sentAt;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteDataResponse &&
    other.inviteExpiration == inviteExpiration &&
    other.inviteStatus == inviteStatus &&
    other.inviteType == inviteType &&
    other.lastUpdatedTime == lastUpdatedTime &&
    other.sentAt == sentAt;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (inviteExpiration == null ? 0 : inviteExpiration!.hashCode) +
    (inviteStatus == null ? 0 : inviteStatus!.hashCode) +
    (inviteType == null ? 0 : inviteType!.hashCode) +
    (lastUpdatedTime == null ? 0 : lastUpdatedTime!.hashCode) +
    (sentAt == null ? 0 : sentAt!.hashCode);

  @override
  String toString() => 'InviteDataResponse[inviteExpiration=$inviteExpiration, inviteStatus=$inviteStatus, inviteType=$inviteType, lastUpdatedTime=$lastUpdatedTime, sentAt=$sentAt]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.inviteExpiration != null) {
      json[r'invite_expiration'] = this.inviteExpiration;
    } else {
      json[r'invite_expiration'] = null;
    }
    if (this.inviteStatus != null) {
      json[r'invite_status'] = this.inviteStatus;
    } else {
      json[r'invite_status'] = null;
    }
    if (this.inviteType != null) {
      json[r'invite_type'] = this.inviteType;
    } else {
      json[r'invite_type'] = null;
    }
    if (this.lastUpdatedTime != null) {
      json[r'last_updated_time'] = this.lastUpdatedTime;
    } else {
      json[r'last_updated_time'] = null;
    }
    if (this.sentAt != null) {
      json[r'sent_at'] = this.sentAt;
    } else {
      json[r'sent_at'] = null;
    }
    return json;
  }

  /// Returns a new [InviteDataResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteDataResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return InviteDataResponse(
        inviteExpiration: mapValueOfType<int>(json, r'invite_expiration'),
        inviteStatus: mapValueOfType<String>(json, r'invite_status'),
        inviteType: mapValueOfType<String>(json, r'invite_type'),
        lastUpdatedTime: mapValueOfType<int>(json, r'last_updated_time'),
        sentAt: mapValueOfType<int>(json, r'sent_at'),
      );
    }
    return null;
  }

  static List<InviteDataResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteDataResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteDataResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteDataResponse> mapFromJson(dynamic json) {
    final map = <String, InviteDataResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteDataResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteDataResponse-objects as value to a dart map
  static Map<String, List<InviteDataResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteDataResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteDataResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

