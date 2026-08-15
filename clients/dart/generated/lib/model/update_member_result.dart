//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class UpdateMemberResult {
  /// Returns a new [UpdateMemberResult] instance.
  UpdateMemberResult({
    this.businessRole,
    this.memberId,
  });

  /// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? businessRole;

  /// Unique identifier of the business member.
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? memberId;

  @override
  bool operator ==(Object other) => identical(this, other) || other is UpdateMemberResult &&
    other.businessRole == businessRole &&
    other.memberId == memberId;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (businessRole == null ? 0 : businessRole!.hashCode) +
    (memberId == null ? 0 : memberId!.hashCode);

  @override
  String toString() => 'UpdateMemberResult[businessRole=$businessRole, memberId=$memberId]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.businessRole != null) {
      json[r'business_role'] = this.businessRole;
    } else {
      json[r'business_role'] = null;
    }
    if (this.memberId != null) {
      json[r'member_id'] = this.memberId;
    } else {
      json[r'member_id'] = null;
    }
    return json;
  }

  /// Returns a new [UpdateMemberResult] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static UpdateMemberResult? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "UpdateMemberResult[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "UpdateMemberResult[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return UpdateMemberResult(
        businessRole: mapValueOfType<String>(json, r'business_role'),
        memberId: mapValueOfType<String>(json, r'member_id'),
      );
    }
    return null;
  }

  static List<UpdateMemberResult> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UpdateMemberResult>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UpdateMemberResult.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, UpdateMemberResult> mapFromJson(dynamic json) {
    final map = <String, UpdateMemberResult>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = UpdateMemberResult.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of UpdateMemberResult-objects as value to a dart map
  static Map<String, List<UpdateMemberResult>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<UpdateMemberResult>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = UpdateMemberResult.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

