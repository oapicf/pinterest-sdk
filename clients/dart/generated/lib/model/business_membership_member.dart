//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class BusinessMembershipMember {
  /// Returns a new [BusinessMembershipMember] instance.
  BusinessMembershipMember({
    required this.businessRole,
    required this.memberId,
  });

  BusinessRoleForMembers businessRole;

  /// Unique identifier of the member.
  String memberId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is BusinessMembershipMember &&
    other.businessRole == businessRole &&
    other.memberId == memberId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessRole.hashCode) +
    (memberId.hashCode);

  @override
  String toString() => 'BusinessMembershipMember[businessRole=$businessRole, memberId=$memberId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'business_role'] = this.businessRole;
      json[r'member_id'] = this.memberId;
    return json;
  }

  /// Returns a new [BusinessMembershipMember] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static BusinessMembershipMember? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'business_role'), 'Required key "BusinessMembershipMember[business_role]" is missing from JSON.');
        assert(json[r'business_role'] != null, 'Required key "BusinessMembershipMember[business_role]" has a null value in JSON.');
        assert(json.containsKey(r'member_id'), 'Required key "BusinessMembershipMember[member_id]" is missing from JSON.');
        assert(json[r'member_id'] != null, 'Required key "BusinessMembershipMember[member_id]" has a null value in JSON.');
        return true;
      }());

      return BusinessMembershipMember(
        businessRole: BusinessRoleForMembers.fromJson(json[r'business_role'])!,
        memberId: mapValueOfType<String>(json, r'member_id')!,
      );
    }
    return null;
  }

  static List<BusinessMembershipMember> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessMembershipMember>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessMembershipMember.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, BusinessMembershipMember> mapFromJson(dynamic json) {
    final map = <String, BusinessMembershipMember>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = BusinessMembershipMember.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of BusinessMembershipMember-objects as value to a dart map
  static Map<String, List<BusinessMembershipMember>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<BusinessMembershipMember>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = BusinessMembershipMember.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'business_role',
    'member_id',
  };
}

