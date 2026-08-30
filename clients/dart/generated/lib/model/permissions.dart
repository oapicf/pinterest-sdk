//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Permission levels available on a business asset.
enum Permissions {
  ADMIN._(r'ADMIN'),
  ANALYST._(r'ANALYST'),
  FINANCE_MANAGER._(r'FINANCE_MANAGER'),
  FINANCE_EDIT._(r'FINANCE_EDIT'),
  FINANCE_VIEW._(r'FINANCE_VIEW'),
  AUDIENCE_MANAGER._(r'AUDIENCE_MANAGER'),
  CAMPAIGN_MANAGER._(r'CAMPAIGN_MANAGER'),
  CATALOGS_MANAGER._(r'CATALOGS_MANAGER'),
  CATALOGS_VIEWER._(r'CATALOGS_VIEWER'),
  PROFILE_PUBLISHER._(r'PROFILE_PUBLISHER'),
  CONSUMER_USER._(r'CONSUMER_USER'),
  BIZ_PINNER_LIST_SHARER._(r'BIZ_PINNER_LIST_SHARER'),
  ;

  /// Instantiate a new enum with the provided value.
  const Permissions._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [Permissions] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static Permissions? fromJson(dynamic value) => PermissionsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [Permissions]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(Permissions data) => data._value;

  /// Returns the instance of [Permissions] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Permissions? decode(dynamic data, {bool allowNull = true}) {
    if (data is Permissions) {
      return data;
    }
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
        case r'BIZ_PINNER_LIST_SHARER': return Permissions.BIZ_PINNER_LIST_SHARER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PermissionsTypeTransformer? _instance;
}

