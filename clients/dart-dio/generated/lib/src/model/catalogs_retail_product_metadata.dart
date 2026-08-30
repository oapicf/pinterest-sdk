//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/product_availability.dart';
import 'package:openapi/src/model/non_nullable_catalogs_currency.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'catalogs_retail_product_metadata.g.dart';

/// Retail product metadata entity
///
/// Properties:
/// * [availability] 
/// * [currency] 
/// * [itemGroupId] - The parent ID of the product.
/// * [itemId] - The user-created unique ID that represents the product.
/// * [price] - The price of the product.
/// * [salePrice] - The discounted price of the product.
@BuiltValue()
abstract class CatalogsRetailProductMetadata implements Built<CatalogsRetailProductMetadata, CatalogsRetailProductMetadataBuilder> {
  @BuiltValueField(wireName: r'availability')
  ProductAvailability get availability;
  // enum availabilityEnum {  IN_STOCK,  OUT_OF_STOCK,  PREORDER,  };

  @BuiltValueField(wireName: r'currency')
  NonNullableCatalogsCurrency get currency;
  // enum currencyEnum {  AED,  AFN,  ALL,  AMD,  ANG,  AOA,  ARS,  AUD,  AWG,  AZN,  BAM,  BBD,  BDT,  BGN,  BHD,  BIF,  BMD,  BND,  BOB,  BRL,  BSD,  BTN,  BWP,  BYN,  BYR,  BZD,  CAD,  CDF,  CHF,  CLP,  CNY,  COP,  CRC,  CUC,  CUP,  CVE,  CZK,  DJF,  DKK,  DOP,  DZD,  EGP,  ERN,  ETB,  EUR,  FJD,  FKP,  GBP,  GEL,  GGP,  GHS,  GIP,  GMD,  GNF,  GTQ,  GYD,  HKD,  HNL,  HRK,  HTG,  HUF,  IDR,  ILS,  IMP,  INR,  IQD,  IRR,  ISK,  JEP,  JMD,  JOD,  JPY,  KES,  KGS,  KHR,  KMF,  KPW,  KRW,  KWD,  KYD,  KZT,  LAK,  LBP,  LKR,  LRD,  LSL,  LYD,  MAD,  MDL,  MGA,  MKD,  MMK,  MNT,  MOP,  MRO,  MUR,  MVR,  MWK,  MXN,  MYR,  MZN,  NAD,  NGN,  NIO,  NOK,  NPR,  NZD,  OMR,  PAB,  PEN,  PGK,  PHP,  PKR,  PLN,  PYG,  QAR,  RON,  RSD,  RUB,  RWF,  SAR,  SBD,  SCR,  SDG,  SEK,  SGD,  SHP,  SLL,  SOS,  SPL,  SRD,  STD,  SVC,  SYP,  SZL,  THB,  TJS,  TMT,  TND,  TOP,  TRY,  TTD,  TVD,  TWD,  TZS,  UAH,  UGX,  USD,  UYU,  UZS,  VEF,  VND,  VUV,  WST,  XAF,  XCD,  XDR,  XOF,  XPF,  YER,  ZAR,  ZMW,  ZWD,  };

  /// The parent ID of the product.
  @BuiltValueField(wireName: r'item_group_id')
  String? get itemGroupId;

  /// The user-created unique ID that represents the product.
  @BuiltValueField(wireName: r'item_id')
  String get itemId;

  /// The price of the product.
  @BuiltValueField(wireName: r'price')
  num get price;

  /// The discounted price of the product.
  @BuiltValueField(wireName: r'sale_price')
  num? get salePrice;

  CatalogsRetailProductMetadata._();

  factory CatalogsRetailProductMetadata([void updates(CatalogsRetailProductMetadataBuilder b)]) = _$CatalogsRetailProductMetadata;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsRetailProductMetadataBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsRetailProductMetadata> get serializer => _$CatalogsRetailProductMetadataSerializer();
}

class _$CatalogsRetailProductMetadataSerializer implements PrimitiveSerializer<CatalogsRetailProductMetadata> {
  @override
  final Iterable<Type> types = const [CatalogsRetailProductMetadata, _$CatalogsRetailProductMetadata];

  @override
  final String wireName = r'CatalogsRetailProductMetadata';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsRetailProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'availability';
    yield serializers.serialize(
      object.availability,
      specifiedType: const FullType(ProductAvailability),
    );
    yield r'currency';
    yield serializers.serialize(
      object.currency,
      specifiedType: const FullType(NonNullableCatalogsCurrency),
    );
    yield r'item_group_id';
    yield object.itemGroupId == null ? null : serializers.serialize(
      object.itemGroupId,
      specifiedType: const FullType.nullable(String),
    );
    yield r'item_id';
    yield serializers.serialize(
      object.itemId,
      specifiedType: const FullType(String),
    );
    yield r'price';
    yield serializers.serialize(
      object.price,
      specifiedType: const FullType(num),
    );
    yield r'sale_price';
    yield object.salePrice == null ? null : serializers.serialize(
      object.salePrice,
      specifiedType: const FullType.nullable(num),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsRetailProductMetadata object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required CatalogsRetailProductMetadataBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'availability':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ProductAvailability),
          ) as ProductAvailability;
          result.availability = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(NonNullableCatalogsCurrency),
          ) as NonNullableCatalogsCurrency;
          result.currency = valueDes;
          break;
        case r'item_group_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(String),
          ) as String?;
          if (valueDes == null) continue;
          result.itemGroupId = valueDes;
          break;
        case r'item_id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.itemId = valueDes;
          break;
        case r'price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(num),
          ) as num;
          result.price = valueDes;
          break;
        case r'sale_price':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(num),
          ) as num?;
          if (valueDes == null) continue;
          result.salePrice = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  CatalogsRetailProductMetadata deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsRetailProductMetadataBuilder();
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

