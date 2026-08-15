//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class Permissions {
  /// Instantiate a new enum with the provided [value].
  const Permissions._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ADMIN = Permissions._(r'ADMIN');
  static const ANALYST = Permissions._(r'ANALYST');
  static const FINANCE_MANAGER = Permissions._(r'FINANCE_MANAGER');
  static const FINANCE_EDIT = Permissions._(r'FINANCE_EDIT');
  static const FINANCE_VIEW = Permissions._(r'FINANCE_VIEW');
  static const AUDIENCE_MANAGER = Permissions._(r'AUDIENCE_MANAGER');
  static const CAMPAIGN_MANAGER = Permissions._(r'CAMPAIGN_MANAGER');
  static const CATALOGS_MANAGER = Permissions._(r'CATALOGS_MANAGER');
  static const CATALOGS_VIEWER = Permissions._(r'CATALOGS_VIEWER');
  static const PROFILE_PUBLISHER = Permissions._(r'PROFILE_PUBLISHER');
  static const CONSUMER_USER = Permissions._(r'CONSUMER_USER');

  /// List of all possible values in this [enum][Permissions].
  static const values = <Permissions>[
    ADMIN,
    ANALYST,
    FINANCE_MANAGER,
    FINANCE_EDIT,
    FINANCE_VIEW,
    AUDIENCE_MANAGER,
    CAMPAIGN_MANAGER,
    CATALOGS_MANAGER,
    CATALOGS_VIEWER,
    PROFILE_PUBLISHER,
    CONSUMER_USER,
  ];

  static Permissions? fromJson(dynamic value) => PermissionsTypeTransformer().decode(value);

  static List<Permissions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Permissions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Permissions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Permissions] to String,
/// and [decode] dynamic data back to [Permissions].
class PermissionsTypeTransformer {
  factory PermissionsTypeTransformer() => _instance ??= const PermissionsTypeTransformer._();

  const PermissionsTypeTransformer._();

  String encode(Permissions data) => data.value;

  /// Decodes a [dynamic value][data] to a Permissions.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Permissions? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ADMIN': return Permissions.ADMIN;
        case r'ANALYST': return Permissions.ANALYST;
        case r'FINANCE_MANAGER': return Permissions.FINANCE_MANAGER;
        case r'FINANCE_EDIT': return Permissions.FINANCE_EDIT;
        case r'FINANCE_VIEW': return Permissions.FINANCE_VIEW;
        case r'AUDIENCE_MANAGER': return Permissions.AUDIENCE_MANAGER;
        case r'CAMPAIGN_MANAGER': return Permissions.CAMPAIGN_MANAGER;
        case r'CATALOGS_MANAGER': return Permissions.CATALOGS_MANAGER;
        case r'CATALOGS_VIEWER': return Permissions.CATALOGS_VIEWER;
        case r'PROFILE_PUBLISHER': return Permissions.PROFILE_PUBLISHER;
        case r'CONSUMER_USER': return Permissions.CONSUMER_USER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PermissionsTypeTransformer] instance.
  static PermissionsTypeTransformer? _instance;
}

