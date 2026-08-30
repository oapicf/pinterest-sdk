//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
enum BusinessRoleForInvite {
  EMPLOYEE._(r'EMPLOYEE'),
  BIZ_ADMIN._(r'BIZ_ADMIN'),
  PARTNER._(r'PARTNER'),
  ;

  /// Instantiate a new enum with the provided value.
  const BusinessRoleForInvite._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BusinessRoleForInvite] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BusinessRoleForInvite? fromJson(dynamic value) => BusinessRoleForInviteTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BusinessRoleForInvite]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BusinessRoleForInvite> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessRoleForInvite>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessRoleForInvite.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessRoleForInvite] to String,
/// and [decode] dynamic data back to [BusinessRoleForInvite].
class BusinessRoleForInviteTypeTransformer {
  factory BusinessRoleForInviteTypeTransformer() => _instance ??= const BusinessRoleForInviteTypeTransformer._();

  const BusinessRoleForInviteTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BusinessRoleForInvite data) => data._value;

  /// Returns the instance of [BusinessRoleForInvite] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessRoleForInvite? decode(dynamic data, {bool allowNull = true}) {
    if (data is BusinessRoleForInvite) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'EMPLOYEE': return BusinessRoleForInvite.EMPLOYEE;
        case r'BIZ_ADMIN': return BusinessRoleForInvite.BIZ_ADMIN;
        case r'PARTNER': return BusinessRoleForInvite.PARTNER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BusinessRoleForInviteTypeTransformer? _instance;
}

