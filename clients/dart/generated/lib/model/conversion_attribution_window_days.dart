//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ConversionAttributionWindowDays {
  /// Instantiate a new enum with the provided [value].
  const ConversionAttributionWindowDays._(this.value);

  /// The underlying value of this enum member.
  final int value;

  @override
  String toString() => value.toString();

  int toJson() => value;

  static const number0 = ConversionAttributionWindowDays._(0);
  static const number1 = ConversionAttributionWindowDays._(1);
  static const number7 = ConversionAttributionWindowDays._(7);
  static const number14 = ConversionAttributionWindowDays._(14);
  static const number30 = ConversionAttributionWindowDays._(30);
  static const number60 = ConversionAttributionWindowDays._(60);

  /// List of all possible values in this [enum][ConversionAttributionWindowDays].
  static const values = <ConversionAttributionWindowDays>[
    number0,
    number1,
    number7,
    number14,
    number30,
    number60,
  ];

  static ConversionAttributionWindowDays? fromJson(dynamic value) => ConversionAttributionWindowDaysTypeTransformer().decode(value);

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

/// Transformation class that can [encode] an instance of [ConversionAttributionWindowDays] to int,
/// and [decode] dynamic data back to [ConversionAttributionWindowDays].
class ConversionAttributionWindowDaysTypeTransformer {
  factory ConversionAttributionWindowDaysTypeTransformer() => _instance ??= const ConversionAttributionWindowDaysTypeTransformer._();

  const ConversionAttributionWindowDaysTypeTransformer._();

  int encode(ConversionAttributionWindowDays data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionAttributionWindowDays.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionAttributionWindowDays? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case 0: return ConversionAttributionWindowDays.number0;
        case 1: return ConversionAttributionWindowDays.number1;
        case 7: return ConversionAttributionWindowDays.number7;
        case 14: return ConversionAttributionWindowDays.number14;
        case 30: return ConversionAttributionWindowDays.number30;
        case 60: return ConversionAttributionWindowDays.number60;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionAttributionWindowDaysTypeTransformer] instance.
  static ConversionAttributionWindowDaysTypeTransformer? _instance;
}

