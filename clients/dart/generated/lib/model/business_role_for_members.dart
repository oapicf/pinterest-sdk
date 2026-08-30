//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The access level a member has to the business. Values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
enum BusinessRoleForMembers {
  EMPLOYEE._(r'EMPLOYEE'),
  BIZ_ADMIN._(r'BIZ_ADMIN'),
  ;

  /// Instantiate a new enum with the provided value.
  const BusinessRoleForMembers._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BusinessRoleForMembers] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BusinessRoleForMembers? fromJson(dynamic value) => BusinessRoleForMembersTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BusinessRoleForMembers]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BusinessRoleForMembers> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessRoleForMembers>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessRoleForMembers.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessRoleForMembers] to String,
/// and [decode] dynamic data back to [BusinessRoleForMembers].
class BusinessRoleForMembersTypeTransformer {
  factory BusinessRoleForMembersTypeTransformer() => _instance ??= const BusinessRoleForMembersTypeTransformer._();

  const BusinessRoleForMembersTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BusinessRoleForMembers data) => data._value;

  /// Returns the instance of [BusinessRoleForMembers] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessRoleForMembers? decode(dynamic data, {bool allowNull = true}) {
    if (data is BusinessRoleForMembers) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'EMPLOYEE': return BusinessRoleForMembers.EMPLOYEE;
        case r'BIZ_ADMIN': return BusinessRoleForMembers.BIZ_ADMIN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BusinessRoleForMembersTypeTransformer? _instance;
}

