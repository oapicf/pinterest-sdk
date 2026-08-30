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
enum Currency {
  UNK._(r'UNK'),
  USD._(r'USD'),
  GBP._(r'GBP'),
  CAD._(r'CAD'),
  EUR._(r'EUR'),
  AUD._(r'AUD'),
  NZD._(r'NZD'),
  SEK._(r'SEK'),
  ILS._(r'ILS'),
  CHF._(r'CHF'),
  HKD._(r'HKD'),
  JPY._(r'JPY'),
  SGD._(r'SGD'),
  KRW._(r'KRW'),
  NOK._(r'NOK'),
  DKK._(r'DKK'),
  PLN._(r'PLN'),
  RON._(r'RON'),
  HUF._(r'HUF'),
  CZK._(r'CZK'),
  BRL._(r'BRL'),
  MXN._(r'MXN'),
  ARS._(r'ARS'),
  CLP._(r'CLP'),
  COP._(r'COP'),
  INR._(r'INR'),
  TRY._(r'TRY'),
  ;

  /// Instantiate a new enum with the provided value.
  const Currency._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [Currency] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static Currency? fromJson(dynamic value) => CurrencyTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [Currency]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(Currency data) => data._value;

  /// Returns the instance of [Currency] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Currency? decode(dynamic data, {bool allowNull = true}) {
    if (data is Currency) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static CurrencyTypeTransformer? _instance;
}

