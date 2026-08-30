//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum ConversionAttributionWindowDays {
  n0._('0'),
  n1._('1'),
  n7._('7'),
  n14._('14'),
  n30._('30'),
  n60._('60'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionAttributionWindowDays._(this._value);

  /// The underlying value of this enum member.
  final num _value;

  @override
  String toString() => _value.toString();

  /// Encodes this enum as a value suitable for JSON.
  num toJson() => _value;

  /// Returns the instance of [ConversionAttributionWindowDays] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionAttributionWindowDays? fromJson(dynamic value) => ConversionAttributionWindowDaysTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionAttributionWindowDays]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionAttributionWindowDays> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionAttributionWindowDays>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionAttributionWindowDays.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionAttributionWindowDays] to num,
/// and [decode] dynamic data back to [ConversionAttributionWindowDays].
class ConversionAttributionWindowDaysTypeTransformer {
  factory ConversionAttributionWindowDaysTypeTransformer() => _instance ??= const ConversionAttributionWindowDaysTypeTransformer._();

  const ConversionAttributionWindowDaysTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  num encode(ConversionAttributionWindowDays data) => data._value;

  /// Returns the instance of [ConversionAttributionWindowDays] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionAttributionWindowDays? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionAttributionWindowDays) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case '0': return ConversionAttributionWindowDays.n0;
        case '1': return ConversionAttributionWindowDays.n1;
        case '7': return ConversionAttributionWindowDays.n7;
        case '14': return ConversionAttributionWindowDays.n14;
        case '30': return ConversionAttributionWindowDays.n30;
        case '60': return ConversionAttributionWindowDays.n60;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionAttributionWindowDaysTypeTransformer? _instance;
}

