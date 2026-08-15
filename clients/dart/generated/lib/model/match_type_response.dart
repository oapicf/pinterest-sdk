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
class MatchTypeResponse {
  /// Instantiate a new enum with the provided [value].
  const MatchTypeResponse._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BROAD = MatchTypeResponse._(r'BROAD');
  static const PHRASE = MatchTypeResponse._(r'PHRASE');
  static const EXACT = MatchTypeResponse._(r'EXACT');
  static const EXACT_NEGATIVE = MatchTypeResponse._(r'EXACT_NEGATIVE');
  static const PHRASE_NEGATIVE = MatchTypeResponse._(r'PHRASE_NEGATIVE');

  /// List of all possible values in this [enum][MatchTypeResponse].
  static const values = <MatchTypeResponse>[
    BROAD,
    PHRASE,
    EXACT,
    EXACT_NEGATIVE,
    PHRASE_NEGATIVE,
  ];

  static MatchTypeResponse? fromJson(dynamic value) => MatchTypeResponseTypeTransformer().decode(value);

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

  String encode(MatchTypeResponse data) => data.value;

  /// Decodes a [dynamic value][data] to a MatchTypeResponse.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MatchTypeResponse? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [MatchTypeResponseTypeTransformer] instance.
  static MatchTypeResponseTypeTransformer? _instance;
}

