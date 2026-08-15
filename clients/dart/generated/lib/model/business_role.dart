//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. <br> - PARTNER: Can only view and access assets you assign them to/or they assign to you.
class BusinessRole {
  /// Instantiate a new enum with the provided [value].
  const BusinessRole._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const EMPLOYEE = BusinessRole._(r'EMPLOYEE');
  static const BIZ_ADMIN = BusinessRole._(r'BIZ_ADMIN');
  static const PARTNER = BusinessRole._(r'PARTNER');

  /// List of all possible values in this [enum][BusinessRole].
  static const values = <BusinessRole>[
    EMPLOYEE,
    BIZ_ADMIN,
    PARTNER,
  ];

  static BusinessRole? fromJson(dynamic value) => BusinessRoleTypeTransformer().decode(value);

  static List<BusinessRole> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessRole>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessRole.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessRole] to String,
/// and [decode] dynamic data back to [BusinessRole].
class BusinessRoleTypeTransformer {
  factory BusinessRoleTypeTransformer() => _instance ??= const BusinessRoleTypeTransformer._();

  const BusinessRoleTypeTransformer._();

  String encode(BusinessRole data) => data.value;

  /// Decodes a [dynamic value][data] to a BusinessRole.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessRole? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'EMPLOYEE': return BusinessRole.EMPLOYEE;
        case r'BIZ_ADMIN': return BusinessRole.BIZ_ADMIN;
        case r'PARTNER': return BusinessRole.PARTNER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BusinessRoleTypeTransformer] instance.
  static BusinessRoleTypeTransformer? _instance;
}

