//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BoardPrivacy {
  /// Instantiate a new enum with the provided [value].
  const BoardPrivacy._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PUBLIC = BoardPrivacy._(r'PUBLIC');
  static const PROTECTED = BoardPrivacy._(r'PROTECTED');
  static const SECRET = BoardPrivacy._(r'SECRET');

  /// List of all possible values in this [enum][BoardPrivacy].
  static const values = <BoardPrivacy>[
    PUBLIC,
    PROTECTED,
    SECRET,
  ];

  static BoardPrivacy? fromJson(dynamic value) => BoardPrivacyTypeTransformer().decode(value);

  static List<BoardPrivacy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BoardPrivacy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BoardPrivacy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BoardPrivacy] to String,
/// and [decode] dynamic data back to [BoardPrivacy].
class BoardPrivacyTypeTransformer {
  factory BoardPrivacyTypeTransformer() => _instance ??= const BoardPrivacyTypeTransformer._();

  const BoardPrivacyTypeTransformer._();

  String encode(BoardPrivacy data) => data.value;

  /// Decodes a [dynamic value][data] to a BoardPrivacy.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BoardPrivacy? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PUBLIC': return BoardPrivacy.PUBLIC;
        case r'PROTECTED': return BoardPrivacy.PROTECTED;
        case r'SECRET': return BoardPrivacy.SECRET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BoardPrivacyTypeTransformer] instance.
  static BoardPrivacyTypeTransformer? _instance;
}

