//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// User list type
enum UserListType {
  EMAIL._(r'EMAIL'),
  IDFA._(r'IDFA'),
  MAID._(r'MAID'),
  LR_ID._(r'LR_ID'),
  DLX_ID._(r'DLX_ID'),
  HASHED_PINNER_ID._(r'HASHED_PINNER_ID'),
  ;

  /// Instantiate a new enum with the provided value.
  const UserListType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [UserListType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static UserListType? fromJson(dynamic value) => UserListTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [UserListType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<UserListType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserListType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserListType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserListType] to String,
/// and [decode] dynamic data back to [UserListType].
class UserListTypeTypeTransformer {
  factory UserListTypeTypeTransformer() => _instance ??= const UserListTypeTypeTransformer._();

  const UserListTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(UserListType data) => data._value;

  /// Returns the instance of [UserListType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserListType? decode(dynamic data, {bool allowNull = true}) {
    if (data is UserListType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'EMAIL': return UserListType.EMAIL;
        case r'IDFA': return UserListType.IDFA;
        case r'MAID': return UserListType.MAID;
        case r'LR_ID': return UserListType.LR_ID;
        case r'DLX_ID': return UserListType.DLX_ID;
        case r'HASHED_PINNER_ID': return UserListType.HASHED_PINNER_ID;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static UserListTypeTypeTransformer? _instance;
}

