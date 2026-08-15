//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// An internal role type used on business access, EMPLOYEE, ADMIN.
class Role {
  /// Instantiate a new enum with the provided [value].
  const Role._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNKNOWN = Role._(r'UNKNOWN');
  static const OWNER = Role._(r'OWNER');
  static const ADMIN = Role._(r'ADMIN');
  static const ANALYST = Role._(r'ANALYST');
  static const SOS_READER = Role._(r'SOS_READER');
  static const FINANCE_MANAGER = Role._(r'FINANCE_MANAGER');
  static const FINANCE_EDIT = Role._(r'FINANCE_EDIT');
  static const FINANCE_VIEW = Role._(r'FINANCE_VIEW');
  static const AUDIENCE_MANAGER = Role._(r'AUDIENCE_MANAGER');
  static const CAMPAIGN_MANAGER = Role._(r'CAMPAIGN_MANAGER');
  static const CATALOGS_MANAGER = Role._(r'CATALOGS_MANAGER');
  static const CATALOGS_VIEWER = Role._(r'CATALOGS_VIEWER');
  static const RESTRICTED_OWNER = Role._(r'RESTRICTED_OWNER');
  static const PROFILE_MANAGER = Role._(r'PROFILE_MANAGER');
  static const PROFILE_PUBLISHER = Role._(r'PROFILE_PUBLISHER');
  static const RESOURCE_PINNER_LIST_OWNER = Role._(r'RESOURCE_PINNER_LIST_OWNER');
  static const RESOURCE_PINNER_LIST_READER = Role._(r'RESOURCE_PINNER_LIST_READER');
  static const BIZ_PINNER_LIST_SHARER = Role._(r'BIZ_PINNER_LIST_SHARER');
  static const RESOURCE_CONVERSION_TAGS_READER = Role._(r'RESOURCE_CONVERSION_TAGS_READER');

  /// List of all possible values in this [enum][Role].
  static const values = <Role>[
    UNKNOWN,
    OWNER,
    ADMIN,
    ANALYST,
    SOS_READER,
    FINANCE_MANAGER,
    FINANCE_EDIT,
    FINANCE_VIEW,
    AUDIENCE_MANAGER,
    CAMPAIGN_MANAGER,
    CATALOGS_MANAGER,
    CATALOGS_VIEWER,
    RESTRICTED_OWNER,
    PROFILE_MANAGER,
    PROFILE_PUBLISHER,
    RESOURCE_PINNER_LIST_OWNER,
    RESOURCE_PINNER_LIST_READER,
    BIZ_PINNER_LIST_SHARER,
    RESOURCE_CONVERSION_TAGS_READER,
  ];

  static Role? fromJson(dynamic value) => RoleTypeTransformer().decode(value);

  static List<Role> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Role>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Role.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Role] to String,
/// and [decode] dynamic data back to [Role].
class RoleTypeTransformer {
  factory RoleTypeTransformer() => _instance ??= const RoleTypeTransformer._();

  const RoleTypeTransformer._();

  String encode(Role data) => data.value;

  /// Decodes a [dynamic value][data] to a Role.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Role? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return Role.UNKNOWN;
        case r'OWNER': return Role.OWNER;
        case r'ADMIN': return Role.ADMIN;
        case r'ANALYST': return Role.ANALYST;
        case r'SOS_READER': return Role.SOS_READER;
        case r'FINANCE_MANAGER': return Role.FINANCE_MANAGER;
        case r'FINANCE_EDIT': return Role.FINANCE_EDIT;
        case r'FINANCE_VIEW': return Role.FINANCE_VIEW;
        case r'AUDIENCE_MANAGER': return Role.AUDIENCE_MANAGER;
        case r'CAMPAIGN_MANAGER': return Role.CAMPAIGN_MANAGER;
        case r'CATALOGS_MANAGER': return Role.CATALOGS_MANAGER;
        case r'CATALOGS_VIEWER': return Role.CATALOGS_VIEWER;
        case r'RESTRICTED_OWNER': return Role.RESTRICTED_OWNER;
        case r'PROFILE_MANAGER': return Role.PROFILE_MANAGER;
        case r'PROFILE_PUBLISHER': return Role.PROFILE_PUBLISHER;
        case r'RESOURCE_PINNER_LIST_OWNER': return Role.RESOURCE_PINNER_LIST_OWNER;
        case r'RESOURCE_PINNER_LIST_READER': return Role.RESOURCE_PINNER_LIST_READER;
        case r'BIZ_PINNER_LIST_SHARER': return Role.BIZ_PINNER_LIST_SHARER;
        case r'RESOURCE_CONVERSION_TAGS_READER': return Role.RESOURCE_CONVERSION_TAGS_READER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [RoleTypeTransformer] instance.
  static RoleTypeTransformer? _instance;
}

