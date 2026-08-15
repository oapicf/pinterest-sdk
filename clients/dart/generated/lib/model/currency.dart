//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Currency Codes from ISO 4217
class Currency {
  /// Instantiate a new enum with the provided [value].
  const Currency._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const UNK = Currency._(r'UNK');
  static const USD = Currency._(r'USD');
  static const GBP = Currency._(r'GBP');
  static const CAD = Currency._(r'CAD');
  static const EUR = Currency._(r'EUR');
  static const AUD = Currency._(r'AUD');
  static const NZD = Currency._(r'NZD');
  static const SEK = Currency._(r'SEK');
  static const ILS = Currency._(r'ILS');
  static const CHF = Currency._(r'CHF');
  static const HKD = Currency._(r'HKD');
  static const JPY = Currency._(r'JPY');
  static const SGD = Currency._(r'SGD');
  static const KRW = Currency._(r'KRW');
  static const NOK = Currency._(r'NOK');
  static const DKK = Currency._(r'DKK');
  static const PLN = Currency._(r'PLN');
  static const RON = Currency._(r'RON');
  static const HUF = Currency._(r'HUF');
  static const CZK = Currency._(r'CZK');
  static const BRL = Currency._(r'BRL');
  static const MXN = Currency._(r'MXN');
  static const ARS = Currency._(r'ARS');
  static const CLP = Currency._(r'CLP');
  static const COP = Currency._(r'COP');
  static const INR = Currency._(r'INR');
  static const TRY = Currency._(r'TRY');

  /// List of all possible values in this [enum][Currency].
  static const values = <Currency>[
    UNK,
    USD,
    GBP,
    CAD,
    EUR,
    AUD,
    NZD,
    SEK,
    ILS,
    CHF,
    HKD,
    JPY,
    SGD,
    KRW,
    NOK,
    DKK,
    PLN,
    RON,
    HUF,
    CZK,
    BRL,
    MXN,
    ARS,
    CLP,
    COP,
    INR,
    TRY,
  ];

  static Currency? fromJson(dynamic value) => CurrencyTypeTransformer().decode(value);

  static List<Currency> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Currency>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Currency.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Currency] to String,
/// and [decode] dynamic data back to [Currency].
class CurrencyTypeTransformer {
  factory CurrencyTypeTransformer() => _instance ??= const CurrencyTypeTransformer._();

  const CurrencyTypeTransformer._();

  String encode(Currency data) => data.value;

  /// Decodes a [dynamic value][data] to a Currency.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Currency? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'UNK': return Currency.UNK;
        case r'USD': return Currency.USD;
        case r'GBP': return Currency.GBP;
        case r'CAD': return Currency.CAD;
        case r'EUR': return Currency.EUR;
        case r'AUD': return Currency.AUD;
        case r'NZD': return Currency.NZD;
        case r'SEK': return Currency.SEK;
        case r'ILS': return Currency.ILS;
        case r'CHF': return Currency.CHF;
        case r'HKD': return Currency.HKD;
        case r'JPY': return Currency.JPY;
        case r'SGD': return Currency.SGD;
        case r'KRW': return Currency.KRW;
        case r'NOK': return Currency.NOK;
        case r'DKK': return Currency.DKK;
        case r'PLN': return Currency.PLN;
        case r'RON': return Currency.RON;
        case r'HUF': return Currency.HUF;
        case r'CZK': return Currency.CZK;
        case r'BRL': return Currency.BRL;
        case r'MXN': return Currency.MXN;
        case r'ARS': return Currency.ARS;
        case r'CLP': return Currency.CLP;
        case r'COP': return Currency.COP;
        case r'INR': return Currency.INR;
        case r'TRY': return Currency.TRY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CurrencyTypeTransformer] instance.
  static CurrencyTypeTransformer? _instance;
}

