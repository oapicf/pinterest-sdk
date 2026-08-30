//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum UserAccountType {
  PINNER._(r'PINNER'),
  BUSINESS._(r'BUSINESS'),
  ;

  /// Instantiate a new enum with the provided value.
  const UserAccountType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UserAccountType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UserAccountType? fromJson(dynamic value) => UserAccountTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UserAccountType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UserAccountType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserAccountType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserAccountType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserAccountType] to String,
/// and [decode] dynamic data back to [UserAccountType].
class UserAccountTypeTypeTransformer {
  factory UserAccountTypeTypeTransformer() => _instance ??= const UserAccountTypeTypeTransformer._();

  const UserAccountTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(UserAccountType data) => data._value;

  /// Returns the instance of [UserAccountType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserAccountType? decode(dynamic data, {bool allowNull = true}) {
    if (data is UserAccountType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PINNER': return UserAccountType.PINNER;
        case r'BUSINESS': return UserAccountType.BUSINESS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UserAccountTypeTypeTransformer? _instance;
}

