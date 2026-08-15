//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'currency.g.dart';

class Currency extends EnumClass {

  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'UNK')
  static const Currency UNK = _$UNK;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'USD')
  static const Currency USD = _$USD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'GBP')
  static const Currency GBP = _$GBP;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'CAD')
  static const Currency CAD = _$CAD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'EUR')
  static const Currency EUR = _$EUR;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'AUD')
  static const Currency AUD = _$AUD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'NZD')
  static const Currency NZD = _$NZD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'SEK')
  static const Currency SEK = _$SEK;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'ILS')
  static const Currency ILS = _$ILS;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'CHF')
  static const Currency CHF = _$CHF;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'HKD')
  static const Currency HKD = _$HKD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'JPY')
  static const Currency JPY = _$JPY;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'SGD')
  static const Currency SGD = _$SGD;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'KRW')
  static const Currency KRW = _$KRW;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'NOK')
  static const Currency NOK = _$NOK;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'DKK')
  static const Currency DKK = _$DKK;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'PLN')
  static const Currency PLN = _$PLN;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'RON')
  static const Currency RON = _$RON;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'HUF')
  static const Currency HUF = _$HUF;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'CZK')
  static const Currency CZK = _$CZK;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'BRL')
  static const Currency BRL = _$BRL;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'MXN')
  static const Currency MXN = _$MXN;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'ARS')
  static const Currency ARS = _$ARS;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'CLP')
  static const Currency CLP = _$CLP;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'COP')
  static const Currency COP = _$COP;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'INR')
  static const Currency INR = _$INR;
  /// Currency Codes from ISO 4217
  @BuiltValueEnumConst(wireName: r'TRY')
  static const Currency TRY = _$TRY;

  static Serializer<Currency> get serializer => _$currencySerializer;

  const Currency._(String name): super(name);

  static BuiltSet<Currency> get values => _$values;
  static Currency valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class CurrencyMixin = Object with _$CurrencyMixin;

