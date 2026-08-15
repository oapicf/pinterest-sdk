//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/non_nullable_catalogs_currency.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_product_group_pricing_currency_criteria.g.dart';

/// CatalogsProductGroupPricingCurrencyCriteria
///
/// Properties:
/// * [currency] 
/// * [negated] 
/// * [operator_] 
/// * [value] 
@BuiltValue()
abstract class CatalogsProductGroupPricingCurrencyCriteria implements Built<CatalogsProductGroupPricingCurrencyCriteria, CatalogsProductGroupPricingCurrencyCriteriaBuilder> {
  @BuiltValueField(wireName: r'currency')
  NonNullableCatalogsCurrency get currency;
  // enum currencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  };

  @BuiltValueField(wireName: r'negated')
  bool? get negated;

  @BuiltValueField(wireName: r'operator')
  CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum get operator_;
  // enum operator_Enum {  GREATER_THAN,  GREATER_THAN_OR_EQUALS,  LESS_THAN,  LESS_THAN_OR_EQUALS,  };

  @BuiltValueField(wireName: r'value')
  num get value;

  CatalogsProductGroupPricingCurrencyCriteria._();

  factory CatalogsProductGroupPricingCurrencyCriteria([void updates(CatalogsProductGroupPricingCurrencyCriteriaBuilder b)]) = _$CatalogsProductGroupPricingCurrencyCriteria;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsProductGroupPricingCurrencyCriteriaBuilder b) => b
      ..negated = false;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsProductGroupPricingCurrencyCriteria> get serializer => _$CatalogsProductGroupPricingCurrencyCriteriaSerializer();
}

class _$CatalogsProductGroupPricingCurrencyCriteriaSerializer implements PrimitiveSerializer<CatalogsProductGroupPricingCurrencyCriteria> {
  @override
  final Iterable<Type> types = const [CatalogsProductGroupPricingCurrencyCriteria, _$CatalogsProductGroupPricingCurrencyCriteria];

  @override
  final String wireName = r'CatalogsProductGroupPricingCurrencyCriteria';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsProductGroupPricingCurrencyCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'currency';
    yield serializers.serialize(
      object.currency,
      specifiedType: const FullType(NonNullableCatalogsCurrency),
    );
    if (object.negated != null) {
      yield r'negated';
      yield serializers.serialize(
        object.negated,
        specifiedType: const FullType(bool),
      );
    }
    yield r'operator';
    yield serializers.serialize(
      object.operator_,
      specifiedType: const FullType(CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum),
    );
    yield r'value';
    yield serializers.serialize(
      object.value,
      specifiedType: const FullType(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsProductGroupPricingCurrencyCriteria object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsProductGroupPricingCurrencyCriteriaBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(NonNullableCatalogsCurrency),
          ) as NonNullableCatalogsCurrency;
          result.currency = valueDes;
          break;
        case r'negated':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.negated = valueDes;
          break;
        case r'operator':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum),
          ) as CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum;
          result.operator_ = valueDes;
          break;
        case r'value':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.value = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsProductGroupPricingCurrencyCriteria deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsProductGroupPricingCurrencyCriteriaBuilder();
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

class CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'GREATER_THAN')
  static const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum GREATER_THAN = _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnum_GREATER_THAN;
  @BuiltValueEnumConst(wireName: r'GREATER_THAN_OR_EQUALS')
  static const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum GREATER_THAN_OR_EQUALS = _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnum_GREATER_THAN_OR_EQUALS;
  @BuiltValueEnumConst(wireName: r'LESS_THAN')
  static const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum LESS_THAN = _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnum_LESS_THAN;
  @BuiltValueEnumConst(wireName: r'LESS_THAN_OR_EQUALS')
  static const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum LESS_THAN_OR_EQUALS = _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnum_LESS_THAN_OR_EQUALS;

  static Serializer<CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum> get serializer => _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnumSerializer;

  const CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum._(String name): super(name);

  static BuiltSet<CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum> get values => _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnumValues;
  static CatalogsProductGroupPricingCurrencyCriteriaOperator_Enum valueOf(String name) => _$catalogsProductGroupPricingCurrencyCriteriaOperatorEnumValueOf(name);
}

