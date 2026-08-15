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
class MatchType {
  /// Instantiate a new enum with the provided [value].
  const MatchType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BROAD = MatchType._(r'BROAD');
  static const PHRASE = MatchType._(r'PHRASE');
  static const EXACT = MatchType._(r'EXACT');
  static const EXACT_NEGATIVE = MatchType._(r'EXACT_NEGATIVE');
  static const PHRASE_NEGATIVE = MatchType._(r'PHRASE_NEGATIVE');

  /// List of all possible values in this [enum][MatchType].
  static const values = <MatchType>[
    BROAD,
    PHRASE,
    EXACT,
    EXACT_NEGATIVE,
    PHRASE_NEGATIVE,
  ];

  static MatchType? fromJson(dynamic value) => MatchTypeTypeTransformer().decode(value);

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

  String encode(MatchType data) => data.value;

  /// Decodes a [dynamic value][data] to a MatchType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  MatchType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [MatchTypeTypeTransformer] instance.
  static MatchTypeTypeTransformer? _instance;
}

