//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specifies the type of followees to be kept when filtering them.
class UserFollowingFeedType {
  /// Instantiate a new enum with the provided [value].
  const UserFollowingFeedType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALL = UserFollowingFeedType._(r'ALL');
  static const RANKED = UserFollowingFeedType._(r'RANKED');
  static const CREATOR_ONLY = UserFollowingFeedType._(r'CREATOR_ONLY');
  static const RANKED_CREATOR_ONLY = UserFollowingFeedType._(r'RANKED_CREATOR_ONLY');

  /// List of all possible values in this [enum][UserFollowingFeedType].
  static const values = <UserFollowingFeedType>[
    ALL,
    RANKED,
    CREATOR_ONLY,
    RANKED_CREATOR_ONLY,
  ];

  static UserFollowingFeedType? fromJson(dynamic value) => UserFollowingFeedTypeTypeTransformer().decode(value);

  static List<UserFollowingFeedType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <UserFollowingFeedType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = UserFollowingFeedType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [UserFollowingFeedType] to String,
/// and [decode] dynamic data back to [UserFollowingFeedType].
class UserFollowingFeedTypeTypeTransformer {
  factory UserFollowingFeedTypeTypeTransformer() => _instance ??= const UserFollowingFeedTypeTypeTransformer._();

  const UserFollowingFeedTypeTypeTransformer._();

  String encode(UserFollowingFeedType data) => data.value;

  /// Decodes a [dynamic value][data] to a UserFollowingFeedType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  UserFollowingFeedType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ALL': return UserFollowingFeedType.ALL;
        case r'RANKED': return UserFollowingFeedType.RANKED;
        case r'CREATOR_ONLY': return UserFollowingFeedType.CREATOR_ONLY;
        case r'RANKED_CREATOR_ONLY': return UserFollowingFeedType.RANKED_CREATOR_ONLY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [UserFollowingFeedTypeTypeTransformer] instance.
  static UserFollowingFeedTypeTypeTransformer? _instance;
}

