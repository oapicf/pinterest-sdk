//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/non_nullable_catalogs_currency.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_currency_criteria.g.dart';

/// A currency filter. This filter cannot be negated
///
/// Properties:
/// * [negated] 
/// * [values] 
@BuiltValue()
abstract class CatalogsProductGroupCurrencyCriteria implements Built<CatalogsProductGroupCurrencyCriteria, CatalogsProductGroupCurrencyCriteriaBuilder> {
  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'values')
  NonNullableCatalogsCurrency get values;
  // enum valuesEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  };

  CatalogsProductGroupCurrencyCriteria._();

  factory CatalogsProductGroupCurrencyCriteria([void updates(CatalogsProductGroupCurrencyCriteriaBuilder b)]) = _$CatalogsProductGroupCurrencyCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupCurrencyCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupCurrencyCriteria> get serializer => _$CatalogsProductGroupCurrencyCriteriaSerializer();
}

class _$CatalogsProductGroupCurrencyCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupCurrencyCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupCurrencyCriteria, _$CatalogsProductGroupCurrencyCriteria];

  @override
  final String wireName = r'CatalogsProductGroupCurrencyCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupCurrencyCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'values';
    yield serializers.serialize(
      object.values,
      specifiedType: const FullType(NonNullableCatalogsCurrency),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupCurrencyCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupCurrencyCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.negated = valueDes;
          break;
        case r'values':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(NonNullableCatalogsCurrency),
          ) as NonNullableCatalogsCurrency;
          result.values = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupCurrencyCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupCurrencyCriteriaBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

