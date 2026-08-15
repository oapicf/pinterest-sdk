//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UserBusinessRoleBinding {
  /// Returns a new [UserBusinessRoleBinding] instance.
  UserBusinessRoleBinding({
    this.assetsSummary,
    this.businessRoles = const [],
    this.createdByBusiness,
    this.createdByUser,
    this.createdTime,
    this.id,
    this.isSharedPartner,
    this.user,
  });

  BusinessMemberAssetsSummary? assetsSummary;

  /// The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER.
  List<String> businessRoles;

  /// Metadata for the business that created the business relationship.
  BusinessAccessUserSummary? createdByBusiness;

  /// Metadata for the user that created the business relationship.
  BusinessAccessUserSummary? createdByUser;

  /// The time the business relationship was created. Returned in milliseconds.
  int? createdTime;

  /// Unique identifier of the business member/business partner/employer.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? id;

  /// This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  bool? isSharedPartner;

  /// Metadata for the business member/business partner/employer.
  BusinessAccessUserSummary? user;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UserBusinessRoleBinding &&
    other.assetsSummary == assetsSummary &&
    _deepEquality.equals(other.businessRoles, businessRoles) &&
    other.createdByBusiness == createdByBusiness &&
    other.createdByUser == createdByUser &&
    other.createdTime == createdTime &&
    other.id == id &&
    other.isSharedPartner == isSharedPartner &&
    other.user == user;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (assetsSummary == null ? 0 : assetsSummary!.hashCode) +
    (businessRoles.hashCode) +
    (createdByBusiness == null ? 0 : createdByBusiness!.hashCode) +
    (createdByUser == null ? 0 : createdByUser!.hashCode) +
    (createdTime == null ? 0 : createdTime!.hashCode) +
    (id == null ? 0 : id!.hashCode) +
    (isSharedPartner == null ? 0 : isSharedPartner!.hashCode) +
    (user == null ? 0 : user!.hashCode);

  @override
  String toString() => 'UserBusinessRoleBinding[assetsSummary=$assetsSummary, businessRoles=$businessRoles, createdByBusiness=$createdByBusiness, createdByUser=$createdByUser, createdTime=$createdTime, id=$id, isSharedPartner=$isSharedPartner, user=$user]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
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
    if (this.id != null) {
      json[r'id'] = this.id;
    } else {
      json[r'id'] = null;
    }
    if (this.isSharedPartner != null) {
      json[r'is_shared_partner'] = this.isSharedPartner;
    } else {
      json[r'is_shared_partner'] = null;
    }
    if (this.user != null) {
      json[r'user'] = this.user;
    } else {
      json[r'user'] = null;
    }
    return json;
  }

  /// Returns a new [UserBusinessRoleBinding] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UserBusinessRoleBinding? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UserBusinessRoleBinding[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UserBusinessRoleBinding[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UserBusinessRoleBinding(
        assetsSummary: BusinessMemberAssetsSummary.fromJson(json[r'assets_summary']),
        businessRoles: json[r'business_roles'] is Iterable
            ? (json[r'business_roles'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        createdByBusiness: BusinessAccessUserSummary.fromJson(json[r'created_by_business']),
        createdByUser: BusinessAccessUserSummary.fromJson(json[r'created_by_user']),
        createdTime: mapValueOfType<int>(json, r'created_time'),
        id: mapValueOfType<String>(json, r'id'),
        isSharedPartner: mapValueOfType<bool>(json, r'is_shared_partner'),
        user: BusinessAccessUserSummary.fromJson(json[r'user']),
      );
    }
    return null;
  }

  static List<UserBusinessRoleBinding> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserBusinessRoleBinding>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserBusinessRoleBinding.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UserBusinessRoleBinding> mapFromJson(dynamic json) {
    final map = <String, UserBusinessRoleBinding>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UserBusinessRoleBinding.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UserBusinessRoleBinding-objects as value to a dart map
  static Map<String, List<UserBusinessRoleBinding>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UserBusinessRoleBinding>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UserBusinessRoleBinding.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

