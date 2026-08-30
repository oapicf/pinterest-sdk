//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Keyword match type
enum MatchType {
  BROAD._(r'BROAD'),
  PHRASE._(r'PHRASE'),
  EXACT._(r'EXACT'),
  EXACT_NEGATIVE._(r'EXACT_NEGATIVE'),
  PHRASE_NEGATIVE._(r'PHRASE_NEGATIVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const MatchType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MatchType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MatchType? fromJson(dynamic value) => MatchTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MatchType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MatchType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MatchType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MatchType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MatchType] to String,
/// and [decode] dynamic data back to [MatchType].
class MatchTypeTypeTransformer {
  factory MatchTypeTypeTransformer() => _instance ??= const MatchTypeTypeTransformer._();

  const MatchTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MatchType data) => data._value;

  /// Returns the instance of [MatchType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MatchType? decode(dynamic data, {bool allowNull = true}) {
    if (data is MatchType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'BROAD': return MatchType.BROAD;
        case r'PHRASE': return MatchType.PHRASE;
        case r'EXACT': return MatchType.EXACT;
        case r'EXACT_NEGATIVE': return MatchType.EXACT_NEGATIVE;
        case r'PHRASE_NEGATIVE': return MatchType.PHRASE_NEGATIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MatchTypeTypeTransformer? _instance;
}

