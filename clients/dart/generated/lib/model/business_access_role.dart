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
enum BusinessAccessRole {
  OWNER._(r'OWNER'),
  ADMIN._(r'ADMIN'),
  ANALYST._(r'ANALYST'),
  SOS_READER._(r'SOS_READER'),
  FINANCE_MANAGER._(r'FINANCE_MANAGER'),
  FINANCE_VIEW._(r'FINANCE_VIEW'),
  FINANCE_EDIT._(r'FINANCE_EDIT'),
  AUDIENCE_MANAGER._(r'AUDIENCE_MANAGER'),
  CAMPAIGN_MANAGER._(r'CAMPAIGN_MANAGER'),
  CATALOGS_MANAGER._(r'CATALOGS_MANAGER'),
  RESTRICTED_OWNER._(r'RESTRICTED_OWNER'),
  PROFILE_MANAGER._(r'PROFILE_MANAGER'),
  PROFILE_PUBLISHER._(r'PROFILE_PUBLISHER'),
  RESOURCE_PINNER_LIST_OWNER._(r'RESOURCE_PINNER_LIST_OWNER'),
  RESOURCE_PINNER_LIST_READER._(r'RESOURCE_PINNER_LIST_READER'),
  BIZ_PINNER_LIST_SHARER._(r'BIZ_PINNER_LIST_SHARER'),
  RESOURCE_CONVERSION_TAGS_READER._(r'RESOURCE_CONVERSION_TAGS_READER'),
  ;

  /// Instantiate a new enum with the provided value.
  const BusinessAccessRole._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BusinessAccessRole] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BusinessAccessRole? fromJson(dynamic value) => BusinessAccessRoleTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BusinessAccessRole]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(BusinessAccessRole data) => data._value;

  /// Returns the instance of [BusinessAccessRole] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BusinessAccessRole? decode(dynamic data, {bool allowNull = true}) {
    if (data is BusinessAccessRole) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static BusinessAccessRoleTypeTransformer? _instance;
}

