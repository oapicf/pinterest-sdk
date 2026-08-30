//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Permission levels including the OWNER role.
enum PermissionsWithOwner {
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
  OWNER._(r'OWNER'),
  ;

  /// Instantiate a new enum with the provided value.
  const PermissionsWithOwner._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PermissionsWithOwner] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PermissionsWithOwner? fromJson(dynamic value) => PermissionsWithOwnerTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PermissionsWithOwner]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PermissionsWithOwner> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PermissionsWithOwner>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PermissionsWithOwner.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PermissionsWithOwner] to String,
/// and [decode] dynamic data back to [PermissionsWithOwner].
class PermissionsWithOwnerTypeTransformer {
  factory PermissionsWithOwnerTypeTransformer() => _instance ??= const PermissionsWithOwnerTypeTransformer._();

  const PermissionsWithOwnerTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PermissionsWithOwner data) => data._value;

  /// Returns the instance of [PermissionsWithOwner] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PermissionsWithOwner? decode(dynamic data, {bool allowNull = true}) {
    if (data is PermissionsWithOwner) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ADMIN': return PermissionsWithOwner.ADMIN;
        case r'ANALYST': return PermissionsWithOwner.ANALYST;
        case r'FINANCE_MANAGER': return PermissionsWithOwner.FINANCE_MANAGER;
        case r'FINANCE_EDIT': return PermissionsWithOwner.FINANCE_EDIT;
        case r'FINANCE_VIEW': return PermissionsWithOwner.FINANCE_VIEW;
        case r'AUDIENCE_MANAGER': return PermissionsWithOwner.AUDIENCE_MANAGER;
        case r'CAMPAIGN_MANAGER': return PermissionsWithOwner.CAMPAIGN_MANAGER;
        case r'CATALOGS_MANAGER': return PermissionsWithOwner.CATALOGS_MANAGER;
        case r'CATALOGS_VIEWER': return PermissionsWithOwner.CATALOGS_VIEWER;
        case r'PROFILE_PUBLISHER': return PermissionsWithOwner.PROFILE_PUBLISHER;
        case r'OWNER': return PermissionsWithOwner.OWNER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PermissionsWithOwnerTypeTransformer? _instance;
}

