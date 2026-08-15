//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The access level a member/partner has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access ad accounts you assign to them. They cannot see details about other employees, external partners or other ad accounts. <br> - BIZ_ADMIN: Have full control of roles and can add employees, external partners as well as grant ad account access.
class MemberBusinessRole {
  /// Instantiate a new enum with the provided [value].
  const MemberBusinessRole._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const EMPLOYEE = MemberBusinessRole._(r'EMPLOYEE');
  static const BIZ_ADMIN = MemberBusinessRole._(r'BIZ_ADMIN');

  /// List of all possible values in this [enum][MemberBusinessRole].
  static const values = <MemberBusinessRole>[
    EMPLOYEE,
    BIZ_ADMIN,
  ];

  static MemberBusinessRole? fromJson(dynamic value) => MemberBusinessRoleTypeTransformer().decode(value);

  static List<MemberBusinessRole> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MemberBusinessRole>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MemberBusinessRole.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MemberBusinessRole] to String,
/// and [decode] dynamic data back to [MemberBusinessRole].
class MemberBusinessRoleTypeTransformer {
  factory MemberBusinessRoleTypeTransformer() => _instance ??= const MemberBusinessRoleTypeTransformer._();

  const MemberBusinessRoleTypeTransformer._();

  String encode(MemberBusinessRole data) => data.value;

  /// Decodes a [dynamic value][data] to a MemberBusinessRole.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MemberBusinessRole? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'EMPLOYEE': return MemberBusinessRole.EMPLOYEE;
        case r'BIZ_ADMIN': return MemberBusinessRole.BIZ_ADMIN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [MemberBusinessRoleTypeTransformer] instance.
  static MemberBusinessRoleTypeTransformer? _instance;
}

