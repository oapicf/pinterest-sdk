//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class InviteResponse {
  /// Returns a new [InviteResponse] instance.
  InviteResponse({
    this.id,
    this.inviteData,
    this.isReceivedInvite,
    this.user,
    this.assetsSummary,
    this.businessRoles = const [],
    this.createdByBusiness,
    this.createdByUser,
    this.createdTime,
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
  BaseInviteDataResponseInviteData? inviteData;

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

  InviteAssetsSummary? assetsSummary;

  /// The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  List<String> businessRoles;

  /// Metadata for the business that created the invite/request.
  Object? createdByBusiness;

  /// Metadata for the user that created the invite/request.
  Object? createdByUser;

  /// The time the invite/request was created. Returned in milliseconds.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  int? createdTime;

  @override
  bool operator ==(Object other) => identical(this, other) || other is InviteResponse &&
    other.id == id &&
    other.inviteData == inviteData &&
    other.isReceivedInvite == isReceivedInvite &&
    other.user == user &&
    other.assetsSummary == assetsSummary &&
    _deepEquality.equals(other.businessRoles, businessRoles) &&
    other.createdByBusiness == createdByBusiness &&
    other.createdByUser == createdByUser &&
    other.createdTime == createdTime;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (id == null ? 0 : id!.hashCode) +
    (inviteData == null ? 0 : inviteData!.hashCode) +
    (isReceivedInvite == null ? 0 : isReceivedInvite!.hashCode) +
    (user == null ? 0 : user!.hashCode) +
    (assetsSummary == null ? 0 : assetsSummary!.hashCode) +
    (businessRoles.hashCode) +
    (createdByBusiness == null ? 0 : createdByBusiness!.hashCode) +
    (createdByUser == null ? 0 : createdByUser!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode);

  @override
  String toString() => 'InviteResponse[id=$id, inviteData=$inviteData, isReceivedInvite=$isReceivedInvite, user=$user, assetsSummary=$assetsSummary, businessRoles=$businessRoles, createdByBusiness=$createdByBusiness, createdByUser=$createdByUser, createdTime=$createdTime]';

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
    if (this.assetsSummary != null) {
      json[r'assets_summary'] = this.assetsSummary;
    } else {
      json[r'assets_summary'] = null;
    }
      json[r'business_roles'] = this.businessRoles;
    if (this.createdByBusiness != null) {
      json[r'created_by_business'] = this.createdByBusiness;
    } else {
      json[r'created_by_business'] = null;
    }
    if (this.createdByUser != null) {
      json[r'created_by_user'] = this.createdByUser;
    } else {
      json[r'created_by_user'] = null;
    }
    if (this.createdTime != null) {
      json[r'created_time'] = this.createdTime;
    } else {
      json[r'created_time'] = null;
    }
    return json;
  }

  /// Returns a new [InviteResponse] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static InviteResponse? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "InviteResponse[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "InviteResponse[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return InviteResponse(
        id: mapValueOfType<String>(json, r'id'),
        inviteData: BaseInviteDataResponseInviteData.fromJson(json[r'invite_data']),
        isReceivedInvite: mapValueOfType<bool>(json, r'is_received_invite'),
        user: BusinessAccessUserSummary.fromJson(json[r'user']),
        assetsSummary: InviteAssetsSummary.fromJson(json[r'assets_summary']),
        businessRoles: json[r'business_roles'] is Iterable
            ? (json[r'business_roles'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        createdByBusiness: mapValueOfType<Object>(json, r'created_by_business'),
        createdByUser: mapValueOfType<Object>(json, r'created_by_user'),
        createdTime: mapValueOfType<int>(json, r'created_time'),
      );
    }
    return null;
  }

  static List<InviteResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <InviteResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = InviteResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, InviteResponse> mapFromJson(dynamic json) {
    final map = <String, InviteResponse>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = InviteResponse.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of InviteResponse-objects as value to a dart map
  static Map<String, List<InviteResponse>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<InviteResponse>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = InviteResponse.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

