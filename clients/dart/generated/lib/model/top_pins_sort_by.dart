//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Sort metric for top pins analytics.
enum TopPinsSortBy {
  ENGAGEMENT._(r'ENGAGEMENT'),
  SAVE._(r'SAVE'),
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  PIN_CLICK._(r'PIN_CLICK'),
  ;

  /// Instantiate a new enum with the provided value.
  const TopPinsSortBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TopPinsSortBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TopPinsSortBy? fromJson(dynamic value) => TopPinsSortByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TopPinsSortBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<TopPinsSortBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TopPinsSortBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TopPinsSortBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TopPinsSortBy] to String,
/// and [decode] dynamic data back to [TopPinsSortBy].
class TopPinsSortByTypeTransformer {
  factory TopPinsSortByTypeTransformer() => _instance ??= const TopPinsSortByTypeTransformer._();

  const TopPinsSortByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(TopPinsSortBy data) => data._value;

  /// Returns the instance of [TopPinsSortBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TopPinsSortBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is TopPinsSortBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ENGAGEMENT': return TopPinsSortBy.ENGAGEMENT;
        case r'SAVE': return TopPinsSortBy.SAVE;
        case r'IMPRESSION': return TopPinsSortBy.IMPRESSION;
        case r'OUTBOUND_CLICK': return TopPinsSortBy.OUTBOUND_CLICK;
        case r'PIN_CLICK': return TopPinsSortBy.PIN_CLICK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static TopPinsSortByTypeTransformer? _instance;
}

