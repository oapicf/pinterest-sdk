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
class UserListType {
  /// Instantiate a new enum with the provided [value].
  const UserListType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const EMAIL = UserListType._(r'EMAIL');
  static const IDFA = UserListType._(r'IDFA');
  static const MAID = UserListType._(r'MAID');
  static const LR_ID = UserListType._(r'LR_ID');
  static const DLX_ID = UserListType._(r'DLX_ID');
  static const HASHED_PINNER_ID = UserListType._(r'HASHED_PINNER_ID');

  /// List of all possible values in this [enum][UserListType].
  static const values = <UserListType>[
    EMAIL,
    IDFA,
    MAID,
    LR_ID,
    DLX_ID,
    HASHED_PINNER_ID,
  ];

  static UserListType? fromJson(dynamic value) => UserListTypeTypeTransformer().decode(value);

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

  String encode(UserListType data) => data.value;

  /// Decodes a [dynamic value][data] to a UserListType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserListType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [UserListTypeTypeTransformer] instance.
  static UserListTypeTypeTransformer? _instance;
}

