//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class BoardUpdatePrivacy {
  /// Instantiate a new enum with the provided [value].
  const BoardUpdatePrivacy._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PUBLIC = BoardUpdatePrivacy._(r'PUBLIC');
  static const SECRET = BoardUpdatePrivacy._(r'SECRET');

  /// List of all possible values in this [enum][BoardUpdatePrivacy].
  static const values = <BoardUpdatePrivacy>[
    PUBLIC,
    SECRET,
  ];

  static BoardUpdatePrivacy? fromJson(dynamic value) => BoardUpdatePrivacyTypeTransformer().decode(value);

  static List<BoardUpdatePrivacy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BoardUpdatePrivacy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BoardUpdatePrivacy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BoardUpdatePrivacy] to String,
/// and [decode] dynamic data back to [BoardUpdatePrivacy].
class BoardUpdatePrivacyTypeTransformer {
  factory BoardUpdatePrivacyTypeTransformer() => _instance ??= const BoardUpdatePrivacyTypeTransformer._();

  const BoardUpdatePrivacyTypeTransformer._();

  String encode(BoardUpdatePrivacy data) => data.value;

  /// Decodes a [dynamic value][data] to a BoardUpdatePrivacy.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BoardUpdatePrivacy? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'PUBLIC': return BoardUpdatePrivacy.PUBLIC;
        case r'SECRET': return BoardUpdatePrivacy.SECRET;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [BoardUpdatePrivacyTypeTransformer] instance.
  static BoardUpdatePrivacyTypeTransformer? _instance;
}

