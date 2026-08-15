//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BoardPrivacyFilter {
  /// Instantiate a new enum with the provided [value].
  const BoardPrivacyFilter._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALL = BoardPrivacyFilter._(r'ALL');
  static const PUBLIC = BoardPrivacyFilter._(r'PUBLIC');
  static const PROTECTED = BoardPrivacyFilter._(r'PROTECTED');
  static const SECRET = BoardPrivacyFilter._(r'SECRET');
  static const PUBLIC_AND_SECRET = BoardPrivacyFilter._(r'PUBLIC_AND_SECRET');

  /// List of all possible values in this [enum][BoardPrivacyFilter].
  static const values = <BoardPrivacyFilter>[
    ALL,
    PUBLIC,
    PROTECTED,
    SECRET,
    PUBLIC_AND_SECRET,
  ];

  static BoardPrivacyFilter? fromJson(dynamic value) => BoardPrivacyFilterTypeTransformer().decode(value);

  static List<BoardPrivacyFilter> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BoardPrivacyFilter>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BoardPrivacyFilter.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BoardPrivacyFilter] to String,
/// and [decode] dynamic data back to [BoardPrivacyFilter].
class BoardPrivacyFilterTypeTransformer {
  factory BoardPrivacyFilterTypeTransformer() => _instance ??= const BoardPrivacyFilterTypeTransformer._();

  const BoardPrivacyFilterTypeTransformer._();

  String encode(BoardPrivacyFilter data) => data.value;

  /// Decodes a [dynamic value][data] to a BoardPrivacyFilter.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BoardPrivacyFilter? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ALL': return BoardPrivacyFilter.ALL;
        case r'PUBLIC': return BoardPrivacyFilter.PUBLIC;
        case r'PROTECTED': return BoardPrivacyFilter.PROTECTED;
        case r'SECRET': return BoardPrivacyFilter.SECRET;
        case r'PUBLIC_AND_SECRET': return BoardPrivacyFilter.PUBLIC_AND_SECRET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BoardPrivacyFilterTypeTransformer] instance.
  static BoardPrivacyFilterTypeTransformer? _instance;
}

