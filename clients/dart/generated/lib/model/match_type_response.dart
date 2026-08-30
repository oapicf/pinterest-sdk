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
enum MatchTypeResponse {
  BROAD._(r'BROAD'),
  PHRASE._(r'PHRASE'),
  EXACT._(r'EXACT'),
  EXACT_NEGATIVE._(r'EXACT_NEGATIVE'),
  PHRASE_NEGATIVE._(r'PHRASE_NEGATIVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const MatchTypeResponse._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [MatchTypeResponse] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static MatchTypeResponse? fromJson(dynamic value) => MatchTypeResponseTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [MatchTypeResponse]
  /// that were successfully decoded from the passed [JSON][json].
  static List<MatchTypeResponse> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <MatchTypeResponse>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = MatchTypeResponse.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [MatchTypeResponse] to String,
/// and [decode] dynamic data back to [MatchTypeResponse].
class MatchTypeResponseTypeTransformer {
  factory MatchTypeResponseTypeTransformer() => _instance ??= const MatchTypeResponseTypeTransformer._();

  const MatchTypeResponseTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(MatchTypeResponse data) => data._value;

  /// Returns the instance of [MatchTypeResponse] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MatchTypeResponse? decode(dynamic data, {bool allowNull = true}) {
    if (data is MatchTypeResponse) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'BROAD': return MatchTypeResponse.BROAD;
        case r'PHRASE': return MatchTypeResponse.PHRASE;
        case r'EXACT': return MatchTypeResponse.EXACT;
        case r'EXACT_NEGATIVE': return MatchTypeResponse.EXACT_NEGATIVE;
        case r'PHRASE_NEGATIVE': return MatchTypeResponse.PHRASE_NEGATIVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static MatchTypeResponseTypeTransformer? _instance;
}

