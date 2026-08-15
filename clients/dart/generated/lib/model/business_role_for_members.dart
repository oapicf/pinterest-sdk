//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
class BusinessRoleForMembers {
  /// Instantiate a new enum with the provided [value].
  const BusinessRoleForMembers._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const EMPLOYEE = BusinessRoleForMembers._(r'EMPLOYEE');
  static const BIZ_ADMIN = BusinessRoleForMembers._(r'BIZ_ADMIN');

  /// List of all possible values in this [enum][BusinessRoleForMembers].
  static const values = <BusinessRoleForMembers>[
    EMPLOYEE,
    BIZ_ADMIN,
  ];

  static BusinessRoleForMembers? fromJson(dynamic value) => BusinessRoleForMembersTypeTransformer().decode(value);

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

  String encode(BusinessRoleForMembers data) => data.value;

  /// Decodes a [dynamic value][data] to a BusinessRoleForMembers.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessRoleForMembers? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [BusinessRoleForMembersTypeTransformer] instance.
  static BusinessRoleForMembersTypeTransformer? _instance;
}

