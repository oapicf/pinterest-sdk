//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/image_base64.dart';
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'brand_accounts_create_request.g.dart';

/// BrandAccountsCreateRequest
///
/// Properties:
/// * [name] - Brand Account name
/// * [username] - Brand Account username
/// * [country] 
/// * [about] - Brand Account about information
/// * [website] - Brand Account website
/// * [profileImage] 
@BuiltValue()
abstract class BrandAccountsCreateRequest implements Built<BrandAccountsCreateRequest, BrandAccountsCreateRequestBuilder> {
  /// Brand Account name
  @BuiltValueField(wireName: r'name')
  String get name;

  /// Brand Account username
  @BuiltValueField(wireName: r'username')
  String get username;

  @BuiltValueField(wireName: r'country')
  Country get country;
  // enum countryEnum {  AD,  AE,  AF,  AG,  AI,  AL,  AM,  AO,  AQ,  AR,  AS,  AT,  AU,  AW,  AX,  AZ,  BA,  BB,  BD,  BE,  BF,  BG,  BH,  BI,  BJ,  BL,  BM,  BN,  BO,  BQ,  BR,  BS,  BT,  BV,  BW,  BY,  BZ,  CA,  CC,  CD,  CF,  CG,  CH,  CI,  CK,  CL,  CM,  CN,  CO,  CR,  CU,  CV,  CW,  CX,  CY,  CZ,  DE,  DJ,  DK,  DM,  DO,  DZ,  EC,  EE,  EG,  EH,  ER,  ES,  ET,  FI,  FJ,  FK,  FM,  FO,  FR,  GA,  GB,  GD,  GE,  GF,  GG,  GH,  GI,  GL,  GM,  GN,  GP,  GQ,  GR,  GS,  GT,  GU,  GW,  GY,  HK,  HM,  HN,  HR,  HT,  HU,  ID,  IE,  IL,  IM,  IN,  IO,  IQ,  IR,  IS,  IT,  JE,  JM,  JO,  JP,  KE,  KG,  KH,  KI,  KM,  KN,  KR,  KW,  KY,  KZ,  LA,  LB,  LC,  LI,  LK,  LR,  LS,  LT,  LU,  LV,  LY,  MA,  MC,  MD,  ME,  MF,  MG,  MH,  MK,  ML,  MM,  MN,  MO,  MP,  MQ,  MR,  MS,  MT,  MU,  MV,  MW,  MX,  MY,  MZ,  NA,  NC,  NE,  NF,  NG,  NI,  NL,  NO,  NP,  NR,  NU,  NZ,  OM,  PA,  PE,  PF,  PG,  PH,  PK,  PL,  PM,  PN,  PR,  PS,  PT,  PW,  PY,  QA,  RE,  RO,  RS,  RU,  RW,  SA,  SB,  SC,  SD,  SE,  SG,  SH,  SI,  SJ,  SK,  SL,  SM,  SN,  SO,  SR,  SS,  ST,  SV,  SX,  SY,  SZ,  TC,  TD,  TF,  TG,  TH,  TJ,  TK,  TL,  TM,  TN,  TO,  TR,  TT,  TV,  TW,  TZ,  UA,  UG,  UM,  US,  UY,  UZ,  VA,  VC,  VE,  VG,  VI,  VN,  VU,  WF,  WS,  YE,  YT,  ZA,  ZM,  ZW,  };

  /// Brand Account about information
  @BuiltValueField(wireName: r'about')
  String? get about;

  /// Brand Account website
  @BuiltValueField(wireName: r'website')
  String? get website;

  @BuiltValueField(wireName: r'profile_image')
  ImageBase64? get profileImage;

  BrandAccountsCreateRequest._();

  factory BrandAccountsCreateRequest([void updates(BrandAccountsCreateRequestBuilder b)]) = _$BrandAccountsCreateRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(BrandAccountsCreateRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<BrandAccountsCreateRequest> get serializer => _$BrandAccountsCreateRequestSerializer();
}

class _$BrandAccountsCreateRequestSerializer implements PrimitiveSerializer<BrandAccountsCreateRequest> {
  @override
  final Iterable<Type> types = const [BrandAccountsCreateRequest, _$BrandAccountsCreateRequest];

  @override
  final String wireName = r'BrandAccountsCreateRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    BrandAccountsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'username';
    yield serializers.serialize(
      object.username,
      specifiedType: const FullType(String),
    );
    yield r'country';
    yield serializers.serialize(
      object.country,
      specifiedType: const FullType(Country),
    );
    if (object.about != null) {
      yield r'about';
      yield serializers.serialize(
        object.about,
        specifiedType: const FullType(String),
      );
    }
    if (object.website != null) {
      yield r'website';
      yield serializers.serialize(
        object.website,
        specifiedType: const FullType(String),
      );
    }
    if (object.profileImage != null) {
      yield r'profile_image';
      yield serializers.serialize(
        object.profileImage,
        specifiedType: const FullType(ImageBase64),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    BrandAccountsCreateRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required BrandAccountsCreateRequestBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'username':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.username = valueDes;
          break;
        case r'country':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Country),
          ) as Country;
          result.country = valueDes;
          break;
        case r'about':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.about = valueDes;
          break;
        case r'website':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.website = valueDes;
          break;
        case r'profile_image':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ImageBase64),
          ) as ImageBase64;
          result.profileImage.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  BrandAccountsCreateRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = BrandAccountsCreateRequestBuilder();
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

