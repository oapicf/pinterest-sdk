//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum BoardUpdatePrivacy {
  PUBLIC._(r'PUBLIC'),
  SECRET._(r'SECRET'),
  ;

  /// Instantiate a new enum with the provided value.
  const BoardUpdatePrivacy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BoardUpdatePrivacy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BoardUpdatePrivacy? fromJson(dynamic value) => BoardUpdatePrivacyTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BoardUpdatePrivacy]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(BoardUpdatePrivacy data) => data._value;

  /// Returns the instance of [BoardUpdatePrivacy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BoardUpdatePrivacy? decode(dynamic data, {bool allowNull = true}) {
    if (data is BoardUpdatePrivacy) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static BoardUpdatePrivacyTypeTransformer? _instance;
}

