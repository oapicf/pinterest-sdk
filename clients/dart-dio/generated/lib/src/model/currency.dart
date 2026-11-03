//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'currency.g.dart';

/// Currency Codes from ISO 4217
class Currency extends EnumClass {

  @BuiltValueEnumConst(wireName: r'UNK')
  static const Currency UNK = _$UNK;
  @BuiltValueEnumConst(wireName: r'USD')
  static const Currency USD = _$USD;
  @BuiltValueEnumConst(wireName: r'GBP')
  static const Currency GBP = _$GBP;
  @BuiltValueEnumConst(wireName: r'CAD')
  static const Currency CAD = _$CAD;
  @BuiltValueEnumConst(wireName: r'EUR')
  static const Currency EUR = _$EUR;
  @BuiltValueEnumConst(wireName: r'AUD')
  static const Currency AUD = _$AUD;
  @BuiltValueEnumConst(wireName: r'NZD')
  static const Currency NZD = _$NZD;
  @BuiltValueEnumConst(wireName: r'SEK')
  static const Currency SEK = _$SEK;
  @BuiltValueEnumConst(wireName: r'ILS')
  static const Currency ILS = _$ILS;
  @BuiltValueEnumConst(wireName: r'CHF')
  static const Currency CHF = _$CHF;
  @BuiltValueEnumConst(wireName: r'HKD')
  static const Currency HKD = _$HKD;
  @BuiltValueEnumConst(wireName: r'JPY')
  static const Currency JPY = _$JPY;
  @BuiltValueEnumConst(wireName: r'SGD')
  static const Currency SGD = _$SGD;
  @BuiltValueEnumConst(wireName: r'KRW')
  static const Currency KRW = _$KRW;
  @BuiltValueEnumConst(wireName: r'NOK')
  static const Currency NOK = _$NOK;
  @BuiltValueEnumConst(wireName: r'DKK')
  static const Currency DKK = _$DKK;
  @BuiltValueEnumConst(wireName: r'PLN')
  static const Currency PLN = _$PLN;
  @BuiltValueEnumConst(wireName: r'RON')
  static const Currency RON = _$RON;
  @BuiltValueEnumConst(wireName: r'HUF')
  static const Currency HUF = _$HUF;
  @BuiltValueEnumConst(wireName: r'CZK')
  static const Currency CZK = _$CZK;
  @BuiltValueEnumConst(wireName: r'BRL')
  static const Currency BRL = _$BRL;
  @BuiltValueEnumConst(wireName: r'MXN')
  static const Currency MXN = _$MXN;
  @BuiltValueEnumConst(wireName: r'ARS')
  static const Currency ARS = _$ARS;
  @BuiltValueEnumConst(wireName: r'CLP')
  static const Currency CLP = _$CLP;
  @BuiltValueEnumConst(wireName: r'COP')
  static const Currency COP = _$COP;
  @BuiltValueEnumConst(wireName: r'INR')
  static const Currency INR = _$INR;
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

