//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Permission role for business access.
class BusinessAccessRole {
  /// Instantiate a new enum with the provided [value].
  const BusinessAccessRole._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const OWNER = BusinessAccessRole._(r'OWNER');
  static const ADMIN = BusinessAccessRole._(r'ADMIN');
  static const ANALYST = BusinessAccessRole._(r'ANALYST');
  static const SOS_READER = BusinessAccessRole._(r'SOS_READER');
  static const FINANCE_MANAGER = BusinessAccessRole._(r'FINANCE_MANAGER');
  static const FINANCE_VIEW = BusinessAccessRole._(r'FINANCE_VIEW');
  static const FINANCE_EDIT = BusinessAccessRole._(r'FINANCE_EDIT');
  static const AUDIENCE_MANAGER = BusinessAccessRole._(r'AUDIENCE_MANAGER');
  static const CAMPAIGN_MANAGER = BusinessAccessRole._(r'CAMPAIGN_MANAGER');
  static const CATALOGS_MANAGER = BusinessAccessRole._(r'CATALOGS_MANAGER');
  static const RESTRICTED_OWNER = BusinessAccessRole._(r'RESTRICTED_OWNER');
  static const PROFILE_MANAGER = BusinessAccessRole._(r'PROFILE_MANAGER');
  static const PROFILE_PUBLISHER = BusinessAccessRole._(r'PROFILE_PUBLISHER');
  static const RESOURCE_PINNER_LIST_OWNER = BusinessAccessRole._(r'RESOURCE_PINNER_LIST_OWNER');
  static const RESOURCE_PINNER_LIST_READER = BusinessAccessRole._(r'RESOURCE_PINNER_LIST_READER');
  static const BIZ_PINNER_LIST_SHARER = BusinessAccessRole._(r'BIZ_PINNER_LIST_SHARER');
  static const RESOURCE_CONVERSION_TAGS_READER = BusinessAccessRole._(r'RESOURCE_CONVERSION_TAGS_READER');

  /// List of all possible values in this [enum][BusinessAccessRole].
  static const values = <BusinessAccessRole>[
    OWNER,
    ADMIN,
    ANALYST,
    SOS_READER,
    FINANCE_MANAGER,
    FINANCE_VIEW,
    FINANCE_EDIT,
    AUDIENCE_MANAGER,
    CAMPAIGN_MANAGER,
    CATALOGS_MANAGER,
    RESTRICTED_OWNER,
    PROFILE_MANAGER,
    PROFILE_PUBLISHER,
    RESOURCE_PINNER_LIST_OWNER,
    RESOURCE_PINNER_LIST_READER,
    BIZ_PINNER_LIST_SHARER,
    RESOURCE_CONVERSION_TAGS_READER,
  ];

  static BusinessAccessRole? fromJson(dynamic value) => BusinessAccessRoleTypeTransformer().decode(value);

  static List<BusinessAccessRole> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BusinessAccessRole>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BusinessAccessRole.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BusinessAccessRole] to String,
/// and [decode] dynamic data back to [BusinessAccessRole].
class BusinessAccessRoleTypeTransformer {
  factory BusinessAccessRoleTypeTransformer() => _instance ??= const BusinessAccessRoleTypeTransformer._();

  const BusinessAccessRoleTypeTransformer._();

  String encode(BusinessAccessRole data) => data.value;

  /// Decodes a [dynamic value][data] to a BusinessAccessRole.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessAccessRole? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'OWNER': return BusinessAccessRole.OWNER;
        case r'ADMIN': return BusinessAccessRole.ADMIN;
        case r'ANALYST': return BusinessAccessRole.ANALYST;
        case r'SOS_READER': return BusinessAccessRole.SOS_READER;
        case r'FINANCE_MANAGER': return BusinessAccessRole.FINANCE_MANAGER;
        case r'FINANCE_VIEW': return BusinessAccessRole.FINANCE_VIEW;
        case r'FINANCE_EDIT': return BusinessAccessRole.FINANCE_EDIT;
        case r'AUDIENCE_MANAGER': return BusinessAccessRole.AUDIENCE_MANAGER;
        case r'CAMPAIGN_MANAGER': return BusinessAccessRole.CAMPAIGN_MANAGER;
        case r'CATALOGS_MANAGER': return BusinessAccessRole.CATALOGS_MANAGER;
        case r'RESTRICTED_OWNER': return BusinessAccessRole.RESTRICTED_OWNER;
        case r'PROFILE_MANAGER': return BusinessAccessRole.PROFILE_MANAGER;
        case r'PROFILE_PUBLISHER': return BusinessAccessRole.PROFILE_PUBLISHER;
        case r'RESOURCE_PINNER_LIST_OWNER': return BusinessAccessRole.RESOURCE_PINNER_LIST_OWNER;
        case r'RESOURCE_PINNER_LIST_READER': return BusinessAccessRole.RESOURCE_PINNER_LIST_READER;
        case r'BIZ_PINNER_LIST_SHARER': return BusinessAccessRole.BIZ_PINNER_LIST_SHARER;
        case r'RESOURCE_CONVERSION_TAGS_READER': return BusinessAccessRole.RESOURCE_CONVERSION_TAGS_READER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BusinessAccessRoleTypeTransformer] instance.
  static BusinessAccessRoleTypeTransformer? _instance;
}

