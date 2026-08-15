//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateMemberBusinessRoleBody {
  /// Returns a new [UpdateMemberBusinessRoleBody] instance.
  UpdateMemberBusinessRoleBody({
    required this.businessRole,
    required this.memberId,
  });

  BusinessRoleForMembers businessRole;

  /// Unique identifier of the member
  String memberId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateMemberBusinessRoleBody &&
    other.businessRole == businessRole &&
    other.memberId == memberId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessRole.hashCode) +
    (memberId.hashCode);

  @override
  String toString() => 'UpdateMemberBusinessRoleBody[businessRole=$businessRole, memberId=$memberId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'business_role'] = this.businessRole;
      json[r'member_id'] = this.memberId;
    return json;
  }

  /// Returns a new [UpdateMemberBusinessRoleBody] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateMemberBusinessRoleBody? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateMemberBusinessRoleBody[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateMemberBusinessRoleBody[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateMemberBusinessRoleBody(
        businessRole: BusinessRoleForMembers.fromJson(json[r'business_role'])!,
        memberId: mapValueOfType<String>(json, r'member_id')!,
      );
    }
    return null;
  }

  static List<UpdateMemberBusinessRoleBody> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMemberBusinessRoleBody>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMemberBusinessRoleBody.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateMemberBusinessRoleBody> mapFromJson(dynamic json) {
    final map = <String, UpdateMemberBusinessRoleBody>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateMemberBusinessRoleBody.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateMemberBusinessRoleBody-objects as value to a dart map
  static Map<String, List<UpdateMemberBusinessRoleBody>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateMemberBusinessRoleBody>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateMemberBusinessRoleBody.listFromJson(entry.value, growable: growable,);
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

