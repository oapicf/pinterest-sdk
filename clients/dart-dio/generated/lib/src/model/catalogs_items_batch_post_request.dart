//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_items_batch_request.dart';
import 'package:openapi/src/model/catalogs_vertical_batch_request.dart';
import 'package:openapi/src/model/item_delete_batch_record.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_items_batch_post_request.g.dart';

/// CatalogsItemsBatchPostRequest
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [catalogType] 
/// * [country] 
/// * [items] - Array with catalogs items
/// * [language] - We recommend using the CatalogsLocale values.
/// * [operation] 
@BuiltValue()
abstract class CatalogsItemsBatchPostRequest implements Built<CatalogsItemsBatchPostRequest, CatalogsItemsBatchPostRequestBuilder> {
  /// One Of [CatalogsItemsBatchRequest], [CatalogsVerticalBatchRequest]
  OneOf get oneOf;

  CatalogsItemsBatchPostRequest._();

  factory CatalogsItemsBatchPostRequest([void updates(CatalogsItemsBatchPostRequestBuilder b)]) = _$CatalogsItemsBatchPostRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsBatchPostRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsBatchPostRequest> get serializer => _$CatalogsItemsBatchPostRequestSerializer();
}

class _$CatalogsItemsBatchPostRequestSerializer implements PrimitiveSerializer<CatalogsItemsBatchPostRequest> {
  @override
  final Iterable<Type> types = const [CatalogsItemsBatchPostRequest, _$CatalogsItemsBatchPostRequest];

  @override
  final String wireName = r'CatalogsItemsBatchPostRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsBatchPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsBatchPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsItemsBatchPostRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsBatchPostRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalBatchRequest), FullType(CatalogsItemsBatchRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class CatalogsItemsBatchPostRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsItemsBatchPostRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsItemsBatchPostRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsItemsBatchPostRequestCatalogTypeEnum> get serializer => _$catalogsItemsBatchPostRequestCatalogTypeEnumSerializer;

  const CatalogsItemsBatchPostRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsBatchPostRequestCatalogTypeEnum> get values => _$catalogsItemsBatchPostRequestCatalogTypeEnumValues;
  static CatalogsItemsBatchPostRequestCatalogTypeEnum valueOf(String name) => _$catalogsItemsBatchPostRequestCatalogTypeEnumValueOf(name);
}

class CatalogsItemsBatchPostRequestLanguageEnum extends EnumClass {

  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const CatalogsItemsBatchPostRequestLanguageEnum afZA = _$catalogsItemsBatchPostRequestLanguageEnum_afZA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const CatalogsItemsBatchPostRequestLanguageEnum arSA = _$catalogsItemsBatchPostRequestLanguageEnum_arSA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const CatalogsItemsBatchPostRequestLanguageEnum bgBG = _$catalogsItemsBatchPostRequestLanguageEnum_bgBG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum bnIN = _$catalogsItemsBatchPostRequestLanguageEnum_bnIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum csCZ = _$catalogsItemsBatchPostRequestLanguageEnum_csCZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const CatalogsItemsBatchPostRequestLanguageEnum daDK = _$catalogsItemsBatchPostRequestLanguageEnum_daDK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'de')
  static const CatalogsItemsBatchPostRequestLanguageEnum de = _$catalogsItemsBatchPostRequestLanguageEnum_de;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const CatalogsItemsBatchPostRequestLanguageEnum elGR = _$catalogsItemsBatchPostRequestLanguageEnum_elGR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const CatalogsItemsBatchPostRequestLanguageEnum enAU = _$catalogsItemsBatchPostRequestLanguageEnum_enAU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum enCA = _$catalogsItemsBatchPostRequestLanguageEnum_enCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const CatalogsItemsBatchPostRequestLanguageEnum enGB = _$catalogsItemsBatchPostRequestLanguageEnum_enGB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum enIN = _$catalogsItemsBatchPostRequestLanguageEnum_enIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-US')
  static const CatalogsItemsBatchPostRequestLanguageEnum enUS = _$catalogsItemsBatchPostRequestLanguageEnum_enUS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-419')
  static const CatalogsItemsBatchPostRequestLanguageEnum es419 = _$catalogsItemsBatchPostRequestLanguageEnum_es419;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const CatalogsItemsBatchPostRequestLanguageEnum esAR = _$catalogsItemsBatchPostRequestLanguageEnum_esAR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const CatalogsItemsBatchPostRequestLanguageEnum esES = _$catalogsItemsBatchPostRequestLanguageEnum_esES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const CatalogsItemsBatchPostRequestLanguageEnum esMX = _$catalogsItemsBatchPostRequestLanguageEnum_esMX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const CatalogsItemsBatchPostRequestLanguageEnum fiFI = _$catalogsItemsBatchPostRequestLanguageEnum_fiFI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr')
  static const CatalogsItemsBatchPostRequestLanguageEnum fr = _$catalogsItemsBatchPostRequestLanguageEnum_fr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum frCA = _$catalogsItemsBatchPostRequestLanguageEnum_frCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const CatalogsItemsBatchPostRequestLanguageEnum heIL = _$catalogsItemsBatchPostRequestLanguageEnum_heIL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum hiIN = _$catalogsItemsBatchPostRequestLanguageEnum_hiIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const CatalogsItemsBatchPostRequestLanguageEnum hrHR = _$catalogsItemsBatchPostRequestLanguageEnum_hrHR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const CatalogsItemsBatchPostRequestLanguageEnum huHU = _$catalogsItemsBatchPostRequestLanguageEnum_huHU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const CatalogsItemsBatchPostRequestLanguageEnum idID = _$catalogsItemsBatchPostRequestLanguageEnum_idID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'it')
  static const CatalogsItemsBatchPostRequestLanguageEnum it = _$catalogsItemsBatchPostRequestLanguageEnum_it;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ja')
  static const CatalogsItemsBatchPostRequestLanguageEnum ja = _$catalogsItemsBatchPostRequestLanguageEnum_ja;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const CatalogsItemsBatchPostRequestLanguageEnum koKR = _$catalogsItemsBatchPostRequestLanguageEnum_koKR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const CatalogsItemsBatchPostRequestLanguageEnum msMY = _$catalogsItemsBatchPostRequestLanguageEnum_msMY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const CatalogsItemsBatchPostRequestLanguageEnum nbNO = _$catalogsItemsBatchPostRequestLanguageEnum_nbNO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nl')
  static const CatalogsItemsBatchPostRequestLanguageEnum nl = _$catalogsItemsBatchPostRequestLanguageEnum_nl;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const CatalogsItemsBatchPostRequestLanguageEnum plPL = _$catalogsItemsBatchPostRequestLanguageEnum_plPL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const CatalogsItemsBatchPostRequestLanguageEnum ptBR = _$catalogsItemsBatchPostRequestLanguageEnum_ptBR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const CatalogsItemsBatchPostRequestLanguageEnum ptPT = _$catalogsItemsBatchPostRequestLanguageEnum_ptPT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const CatalogsItemsBatchPostRequestLanguageEnum roRO = _$catalogsItemsBatchPostRequestLanguageEnum_roRO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const CatalogsItemsBatchPostRequestLanguageEnum ruRU = _$catalogsItemsBatchPostRequestLanguageEnum_ruRU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const CatalogsItemsBatchPostRequestLanguageEnum skSK = _$catalogsItemsBatchPostRequestLanguageEnum_skSK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const CatalogsItemsBatchPostRequestLanguageEnum svSE = _$catalogsItemsBatchPostRequestLanguageEnum_svSE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum teIN = _$catalogsItemsBatchPostRequestLanguageEnum_teIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const CatalogsItemsBatchPostRequestLanguageEnum thTH = _$catalogsItemsBatchPostRequestLanguageEnum_thTH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const CatalogsItemsBatchPostRequestLanguageEnum tlPH = _$catalogsItemsBatchPostRequestLanguageEnum_tlPH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tr')
  static const CatalogsItemsBatchPostRequestLanguageEnum tr = _$catalogsItemsBatchPostRequestLanguageEnum_tr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const CatalogsItemsBatchPostRequestLanguageEnum ukUA = _$catalogsItemsBatchPostRequestLanguageEnum_ukUA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const CatalogsItemsBatchPostRequestLanguageEnum viVN = _$catalogsItemsBatchPostRequestLanguageEnum_viVN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const CatalogsItemsBatchPostRequestLanguageEnum zhCN = _$catalogsItemsBatchPostRequestLanguageEnum_zhCN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const CatalogsItemsBatchPostRequestLanguageEnum zhTW = _$catalogsItemsBatchPostRequestLanguageEnum_zhTW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AM')
  static const CatalogsItemsBatchPostRequestLanguageEnum AM = _$catalogsItemsBatchPostRequestLanguageEnum_AM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AR')
  static const CatalogsItemsBatchPostRequestLanguageEnum AR = _$catalogsItemsBatchPostRequestLanguageEnum_AR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum AZ = _$catalogsItemsBatchPostRequestLanguageEnum_AZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BG')
  static const CatalogsItemsBatchPostRequestLanguageEnum BG = _$catalogsItemsBatchPostRequestLanguageEnum_BG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BN')
  static const CatalogsItemsBatchPostRequestLanguageEnum BN = _$catalogsItemsBatchPostRequestLanguageEnum_BN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BS')
  static const CatalogsItemsBatchPostRequestLanguageEnum BS = _$catalogsItemsBatchPostRequestLanguageEnum_BS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum CA = _$catalogsItemsBatchPostRequestLanguageEnum_CA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CS')
  static const CatalogsItemsBatchPostRequestLanguageEnum CS = _$catalogsItemsBatchPostRequestLanguageEnum_CS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DA')
  static const CatalogsItemsBatchPostRequestLanguageEnum DA = _$catalogsItemsBatchPostRequestLanguageEnum_DA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DV')
  static const CatalogsItemsBatchPostRequestLanguageEnum DV = _$catalogsItemsBatchPostRequestLanguageEnum_DV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum DZ = _$catalogsItemsBatchPostRequestLanguageEnum_DZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DE')
  static const CatalogsItemsBatchPostRequestLanguageEnum DE = _$catalogsItemsBatchPostRequestLanguageEnum_DE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EL')
  static const CatalogsItemsBatchPostRequestLanguageEnum EL = _$catalogsItemsBatchPostRequestLanguageEnum_EL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EN')
  static const CatalogsItemsBatchPostRequestLanguageEnum EN = _$catalogsItemsBatchPostRequestLanguageEnum_EN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ES')
  static const CatalogsItemsBatchPostRequestLanguageEnum ES = _$catalogsItemsBatchPostRequestLanguageEnum_ES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ET')
  static const CatalogsItemsBatchPostRequestLanguageEnum ET = _$catalogsItemsBatchPostRequestLanguageEnum_ET;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FA')
  static const CatalogsItemsBatchPostRequestLanguageEnum FA = _$catalogsItemsBatchPostRequestLanguageEnum_FA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FI')
  static const CatalogsItemsBatchPostRequestLanguageEnum FI = _$catalogsItemsBatchPostRequestLanguageEnum_FI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FR')
  static const CatalogsItemsBatchPostRequestLanguageEnum FR = _$catalogsItemsBatchPostRequestLanguageEnum_FR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HE')
  static const CatalogsItemsBatchPostRequestLanguageEnum HE = _$catalogsItemsBatchPostRequestLanguageEnum_HE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HI')
  static const CatalogsItemsBatchPostRequestLanguageEnum HI = _$catalogsItemsBatchPostRequestLanguageEnum_HI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HR')
  static const CatalogsItemsBatchPostRequestLanguageEnum HR = _$catalogsItemsBatchPostRequestLanguageEnum_HR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HU')
  static const CatalogsItemsBatchPostRequestLanguageEnum HU = _$catalogsItemsBatchPostRequestLanguageEnum_HU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HY')
  static const CatalogsItemsBatchPostRequestLanguageEnum HY = _$catalogsItemsBatchPostRequestLanguageEnum_HY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ID')
  static const CatalogsItemsBatchPostRequestLanguageEnum ID = _$catalogsItemsBatchPostRequestLanguageEnum_ID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum IN = _$catalogsItemsBatchPostRequestLanguageEnum_IN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IS')
  static const CatalogsItemsBatchPostRequestLanguageEnum IS = _$catalogsItemsBatchPostRequestLanguageEnum_IS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IT')
  static const CatalogsItemsBatchPostRequestLanguageEnum IT = _$catalogsItemsBatchPostRequestLanguageEnum_IT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IW')
  static const CatalogsItemsBatchPostRequestLanguageEnum IW = _$catalogsItemsBatchPostRequestLanguageEnum_IW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'JA')
  static const CatalogsItemsBatchPostRequestLanguageEnum JA = _$catalogsItemsBatchPostRequestLanguageEnum_JA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KA')
  static const CatalogsItemsBatchPostRequestLanguageEnum KA = _$catalogsItemsBatchPostRequestLanguageEnum_KA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KM')
  static const CatalogsItemsBatchPostRequestLanguageEnum KM = _$catalogsItemsBatchPostRequestLanguageEnum_KM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KO')
  static const CatalogsItemsBatchPostRequestLanguageEnum KO = _$catalogsItemsBatchPostRequestLanguageEnum_KO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LO')
  static const CatalogsItemsBatchPostRequestLanguageEnum LO = _$catalogsItemsBatchPostRequestLanguageEnum_LO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LT')
  static const CatalogsItemsBatchPostRequestLanguageEnum LT = _$catalogsItemsBatchPostRequestLanguageEnum_LT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LV')
  static const CatalogsItemsBatchPostRequestLanguageEnum LV = _$catalogsItemsBatchPostRequestLanguageEnum_LV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MK')
  static const CatalogsItemsBatchPostRequestLanguageEnum MK = _$catalogsItemsBatchPostRequestLanguageEnum_MK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MN')
  static const CatalogsItemsBatchPostRequestLanguageEnum MN = _$catalogsItemsBatchPostRequestLanguageEnum_MN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MS')
  static const CatalogsItemsBatchPostRequestLanguageEnum MS = _$catalogsItemsBatchPostRequestLanguageEnum_MS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MY')
  static const CatalogsItemsBatchPostRequestLanguageEnum MY = _$catalogsItemsBatchPostRequestLanguageEnum_MY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NB')
  static const CatalogsItemsBatchPostRequestLanguageEnum NB = _$catalogsItemsBatchPostRequestLanguageEnum_NB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NE')
  static const CatalogsItemsBatchPostRequestLanguageEnum NE = _$catalogsItemsBatchPostRequestLanguageEnum_NE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NL')
  static const CatalogsItemsBatchPostRequestLanguageEnum NL = _$catalogsItemsBatchPostRequestLanguageEnum_NL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'false')
  static const CatalogsItemsBatchPostRequestLanguageEnum false_ = _$catalogsItemsBatchPostRequestLanguageEnum_false_;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PL')
  static const CatalogsItemsBatchPostRequestLanguageEnum PL = _$catalogsItemsBatchPostRequestLanguageEnum_PL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PT')
  static const CatalogsItemsBatchPostRequestLanguageEnum PT = _$catalogsItemsBatchPostRequestLanguageEnum_PT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RO')
  static const CatalogsItemsBatchPostRequestLanguageEnum RO = _$catalogsItemsBatchPostRequestLanguageEnum_RO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RU')
  static const CatalogsItemsBatchPostRequestLanguageEnum RU = _$catalogsItemsBatchPostRequestLanguageEnum_RU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SK')
  static const CatalogsItemsBatchPostRequestLanguageEnum SK = _$catalogsItemsBatchPostRequestLanguageEnum_SK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SL')
  static const CatalogsItemsBatchPostRequestLanguageEnum SL = _$catalogsItemsBatchPostRequestLanguageEnum_SL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SQ')
  static const CatalogsItemsBatchPostRequestLanguageEnum SQ = _$catalogsItemsBatchPostRequestLanguageEnum_SQ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SR')
  static const CatalogsItemsBatchPostRequestLanguageEnum SR = _$catalogsItemsBatchPostRequestLanguageEnum_SR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SV')
  static const CatalogsItemsBatchPostRequestLanguageEnum SV = _$catalogsItemsBatchPostRequestLanguageEnum_SV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TL')
  static const CatalogsItemsBatchPostRequestLanguageEnum TL = _$catalogsItemsBatchPostRequestLanguageEnum_TL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'UK')
  static const CatalogsItemsBatchPostRequestLanguageEnum UK = _$catalogsItemsBatchPostRequestLanguageEnum_UK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'VI')
  static const CatalogsItemsBatchPostRequestLanguageEnum VI = _$catalogsItemsBatchPostRequestLanguageEnum_VI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TE')
  static const CatalogsItemsBatchPostRequestLanguageEnum TE = _$catalogsItemsBatchPostRequestLanguageEnum_TE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TH')
  static const CatalogsItemsBatchPostRequestLanguageEnum TH = _$catalogsItemsBatchPostRequestLanguageEnum_TH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TR')
  static const CatalogsItemsBatchPostRequestLanguageEnum TR = _$catalogsItemsBatchPostRequestLanguageEnum_TR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'XX')
  static const CatalogsItemsBatchPostRequestLanguageEnum XX = _$catalogsItemsBatchPostRequestLanguageEnum_XX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ZH')
  static const CatalogsItemsBatchPostRequestLanguageEnum ZH = _$catalogsItemsBatchPostRequestLanguageEnum_ZH;

  static Serializer<CatalogsItemsBatchPostRequestLanguageEnum> get serializer => _$catalogsItemsBatchPostRequestLanguageEnumSerializer;

  const CatalogsItemsBatchPostRequestLanguageEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsBatchPostRequestLanguageEnum> get values => _$catalogsItemsBatchPostRequestLanguageEnumValues;
  static CatalogsItemsBatchPostRequestLanguageEnum valueOf(String name) => _$catalogsItemsBatchPostRequestLanguageEnumValueOf(name);
}

class CatalogsItemsBatchPostRequestOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsItemsBatchPostRequestOperationEnum DELETE = _$catalogsItemsBatchPostRequestOperationEnum_DELETE;

  static Serializer<CatalogsItemsBatchPostRequestOperationEnum> get serializer => _$catalogsItemsBatchPostRequestOperationEnumSerializer;

  const CatalogsItemsBatchPostRequestOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsBatchPostRequestOperationEnum> get values => _$catalogsItemsBatchPostRequestOperationEnumValues;
  static CatalogsItemsBatchPostRequestOperationEnum valueOf(String name) => _$catalogsItemsBatchPostRequestOperationEnumValueOf(name);
}

