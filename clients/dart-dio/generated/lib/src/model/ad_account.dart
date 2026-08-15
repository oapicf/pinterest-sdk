//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/ad_account_owner.dart';
import 'package:openapi/src/model/currency.dart';
import 'package:openapi/src/model/business_access_role.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ad_account.g.dart';

/// AdAccount
///
/// Properties:
/// * [country] 
/// * [createdTime] -  Creation time. Unix timestamp in seconds.
/// * [currency] 
/// * [id] 
/// * [name] - Ad account name.
/// * [owner] - Ad account owner
/// * [permissions] 
/// * [updatedTime] 
@BuiltValue()
abstract class AdAccount implements Built<AdAccount, AdAccountBuilder> {
  @BuiltValueField(wireName: r'country')
  Country? get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  NO,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  ///  Creation time. Unix timestamp in seconds.
  @BuiltValueField(wireName: r'created_time')
  int? get createdTime;

  @BuiltValueField(wireName: r'currency')
  Currency? get currency;
  // enum currencyEnum {  UNK,  USD,  GBP,  CAD,  EUR,  AUD,  NZD,  SEK,  ILS,  CHF,  HKD,  JPY,  SGD,  KRW,  NOK,  DKK,  PLN,  RON,  HUF,  CZK,  BRL,  MXN,  ARS,  CLP,  COP,  INR,  TRY,  };

  @BuiltValueField(wireName: r'id')
  String get id;

  /// Ad account name.
  @BuiltValueField(wireName: r'name')
  String? get name;

  /// Ad account owner
  @BuiltValueField(wireName: r'owner')
  AdAccountOwner? get owner;

  @BuiltValueField(wireName: r'permissions')
  BuiltList<BusinessAccessRole>? get permissions;

  @BuiltValueField(wireName: r'updated_time')
  int? get updatedTime;

  AdAccount._();

  factory AdAccount([void updates(AdAccountBuilder b)]) = _$AdAccount;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AdAccountBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AdAccount> get serializer => _$AdAccountSerializer();
}

class _$AdAccountSerializer implements PrimitiveSerializer<AdAccount> {
  @override
  final Iterable<Type> types = const [AdAccount, _$AdAccount];

  @override
  final String wireName = r'AdAccount';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AdAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.country != null) {
      yield r'country';
      yield serializers.serialize(
        object.country,
        specifiedType: const FullType(Country),
      );
    }
    if (object.createdTime != null) {
      yield r'created_time';
      yield serializers.serialize(
        object.createdTime,
        specifiedType: const FullType.nullable(int),
      );
    }
    if (object.currency != null) {
      yield r'currency';
      yield serializers.serialize(
        object.currency,
        specifiedType: const FullType(Currency),
      );
    }
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(String),
    );
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(String),
      );
    }
    if (object.owner != null) {
      yield r'owner';
      yield serializers.serialize(
        object.owner,
        specifiedType: const FullType(AdAccountOwner),
      );
    }
    if (object.permissions != null) {
      yield r'permissions';
      yield serializers.serialize(
        object.permissions,
        specifiedType: const FullType(BuiltList, [FullType(BusinessAccessRole)]),
      );
    }
    if (object.updatedTime != null) {
      yield r'updated_time';
      yield serializers.serialize(
        object.updatedTime,
        specifiedType: const FullType.nullable(int),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AdAccount object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AdAccountBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'created_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.createdTime = valueDes;
          break;
        case r'currency':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Currency),
          ) as Currency;
          result.currency = valueDes;
          break;
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.id = valueDes;
          break;
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'owner':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AdAccountOwner),
          ) as AdAccountOwner;
          result.owner.replace(valueDes);
          break;
        case r'permissions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(BusinessAccessRole)]),
          ) as BuiltList<BusinessAccessRole>;
          result.permissions.replace(valueDes);
          break;
        case r'updated_time':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(int),
          ) as int?;
          if (valueDes == null) continue;
          result.updatedTime = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AdAccount deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AdAccountBuilder();
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

