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

/// We recommend using the CatalogsLocale values.
class CatalogsItemsBatchPostRequestLanguageEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const CatalogsItemsBatchPostRequestLanguageEnum afZA = _$catalogsItemsBatchPostRequestLanguageEnum_afZA;
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const CatalogsItemsBatchPostRequestLanguageEnum arSA = _$catalogsItemsBatchPostRequestLanguageEnum_arSA;
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const CatalogsItemsBatchPostRequestLanguageEnum bgBG = _$catalogsItemsBatchPostRequestLanguageEnum_bgBG;
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum bnIN = _$catalogsItemsBatchPostRequestLanguageEnum_bnIN;
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum csCZ = _$catalogsItemsBatchPostRequestLanguageEnum_csCZ;
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const CatalogsItemsBatchPostRequestLanguageEnum daDK = _$catalogsItemsBatchPostRequestLanguageEnum_daDK;
  @BuiltValueEnumConst(wireName: r'de')
  static const CatalogsItemsBatchPostRequestLanguageEnum de = _$catalogsItemsBatchPostRequestLanguageEnum_de;
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const CatalogsItemsBatchPostRequestLanguageEnum elGR = _$catalogsItemsBatchPostRequestLanguageEnum_elGR;
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const CatalogsItemsBatchPostRequestLanguageEnum enAU = _$catalogsItemsBatchPostRequestLanguageEnum_enAU;
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum enCA = _$catalogsItemsBatchPostRequestLanguageEnum_enCA;
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const CatalogsItemsBatchPostRequestLanguageEnum enGB = _$catalogsItemsBatchPostRequestLanguageEnum_enGB;
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum enIN = _$catalogsItemsBatchPostRequestLanguageEnum_enIN;
  @BuiltValueEnumConst(wireName: r'en-US')
  static const CatalogsItemsBatchPostRequestLanguageEnum enUS = _$catalogsItemsBatchPostRequestLanguageEnum_enUS;
  @BuiltValueEnumConst(wireName: r'es-419')
  static const CatalogsItemsBatchPostRequestLanguageEnum es419 = _$catalogsItemsBatchPostRequestLanguageEnum_es419;
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const CatalogsItemsBatchPostRequestLanguageEnum esAR = _$catalogsItemsBatchPostRequestLanguageEnum_esAR;
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const CatalogsItemsBatchPostRequestLanguageEnum esES = _$catalogsItemsBatchPostRequestLanguageEnum_esES;
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const CatalogsItemsBatchPostRequestLanguageEnum esMX = _$catalogsItemsBatchPostRequestLanguageEnum_esMX;
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const CatalogsItemsBatchPostRequestLanguageEnum fiFI = _$catalogsItemsBatchPostRequestLanguageEnum_fiFI;
  @BuiltValueEnumConst(wireName: r'fr')
  static const CatalogsItemsBatchPostRequestLanguageEnum fr = _$catalogsItemsBatchPostRequestLanguageEnum_fr;
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum frCA = _$catalogsItemsBatchPostRequestLanguageEnum_frCA;
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const CatalogsItemsBatchPostRequestLanguageEnum heIL = _$catalogsItemsBatchPostRequestLanguageEnum_heIL;
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum hiIN = _$catalogsItemsBatchPostRequestLanguageEnum_hiIN;
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const CatalogsItemsBatchPostRequestLanguageEnum hrHR = _$catalogsItemsBatchPostRequestLanguageEnum_hrHR;
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const CatalogsItemsBatchPostRequestLanguageEnum huHU = _$catalogsItemsBatchPostRequestLanguageEnum_huHU;
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const CatalogsItemsBatchPostRequestLanguageEnum idID = _$catalogsItemsBatchPostRequestLanguageEnum_idID;
  @BuiltValueEnumConst(wireName: r'it')
  static const CatalogsItemsBatchPostRequestLanguageEnum it = _$catalogsItemsBatchPostRequestLanguageEnum_it;
  @BuiltValueEnumConst(wireName: r'ja')
  static const CatalogsItemsBatchPostRequestLanguageEnum ja = _$catalogsItemsBatchPostRequestLanguageEnum_ja;
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const CatalogsItemsBatchPostRequestLanguageEnum koKR = _$catalogsItemsBatchPostRequestLanguageEnum_koKR;
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const CatalogsItemsBatchPostRequestLanguageEnum msMY = _$catalogsItemsBatchPostRequestLanguageEnum_msMY;
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const CatalogsItemsBatchPostRequestLanguageEnum nbNO = _$catalogsItemsBatchPostRequestLanguageEnum_nbNO;
  @BuiltValueEnumConst(wireName: r'nl')
  static const CatalogsItemsBatchPostRequestLanguageEnum nl = _$catalogsItemsBatchPostRequestLanguageEnum_nl;
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const CatalogsItemsBatchPostRequestLanguageEnum plPL = _$catalogsItemsBatchPostRequestLanguageEnum_plPL;
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const CatalogsItemsBatchPostRequestLanguageEnum ptBR = _$catalogsItemsBatchPostRequestLanguageEnum_ptBR;
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const CatalogsItemsBatchPostRequestLanguageEnum ptPT = _$catalogsItemsBatchPostRequestLanguageEnum_ptPT;
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const CatalogsItemsBatchPostRequestLanguageEnum roRO = _$catalogsItemsBatchPostRequestLanguageEnum_roRO;
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const CatalogsItemsBatchPostRequestLanguageEnum ruRU = _$catalogsItemsBatchPostRequestLanguageEnum_ruRU;
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const CatalogsItemsBatchPostRequestLanguageEnum skSK = _$catalogsItemsBatchPostRequestLanguageEnum_skSK;
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const CatalogsItemsBatchPostRequestLanguageEnum svSE = _$catalogsItemsBatchPostRequestLanguageEnum_svSE;
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum teIN = _$catalogsItemsBatchPostRequestLanguageEnum_teIN;
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const CatalogsItemsBatchPostRequestLanguageEnum thTH = _$catalogsItemsBatchPostRequestLanguageEnum_thTH;
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const CatalogsItemsBatchPostRequestLanguageEnum tlPH = _$catalogsItemsBatchPostRequestLanguageEnum_tlPH;
  @BuiltValueEnumConst(wireName: r'tr')
  static const CatalogsItemsBatchPostRequestLanguageEnum tr = _$catalogsItemsBatchPostRequestLanguageEnum_tr;
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const CatalogsItemsBatchPostRequestLanguageEnum ukUA = _$catalogsItemsBatchPostRequestLanguageEnum_ukUA;
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const CatalogsItemsBatchPostRequestLanguageEnum viVN = _$catalogsItemsBatchPostRequestLanguageEnum_viVN;
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const CatalogsItemsBatchPostRequestLanguageEnum zhCN = _$catalogsItemsBatchPostRequestLanguageEnum_zhCN;
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const CatalogsItemsBatchPostRequestLanguageEnum zhTW = _$catalogsItemsBatchPostRequestLanguageEnum_zhTW;
  @BuiltValueEnumConst(wireName: r'AM')
  static const CatalogsItemsBatchPostRequestLanguageEnum AM = _$catalogsItemsBatchPostRequestLanguageEnum_AM;
  @BuiltValueEnumConst(wireName: r'AR')
  static const CatalogsItemsBatchPostRequestLanguageEnum AR = _$catalogsItemsBatchPostRequestLanguageEnum_AR;
  @BuiltValueEnumConst(wireName: r'AZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum AZ = _$catalogsItemsBatchPostRequestLanguageEnum_AZ;
  @BuiltValueEnumConst(wireName: r'BG')
  static const CatalogsItemsBatchPostRequestLanguageEnum BG = _$catalogsItemsBatchPostRequestLanguageEnum_BG;
  @BuiltValueEnumConst(wireName: r'BN')
  static const CatalogsItemsBatchPostRequestLanguageEnum BN = _$catalogsItemsBatchPostRequestLanguageEnum_BN;
  @BuiltValueEnumConst(wireName: r'BS')
  static const CatalogsItemsBatchPostRequestLanguageEnum BS = _$catalogsItemsBatchPostRequestLanguageEnum_BS;
  @BuiltValueEnumConst(wireName: r'CA')
  static const CatalogsItemsBatchPostRequestLanguageEnum CA = _$catalogsItemsBatchPostRequestLanguageEnum_CA;
  @BuiltValueEnumConst(wireName: r'CS')
  static const CatalogsItemsBatchPostRequestLanguageEnum CS = _$catalogsItemsBatchPostRequestLanguageEnum_CS;
  @BuiltValueEnumConst(wireName: r'DA')
  static const CatalogsItemsBatchPostRequestLanguageEnum DA = _$catalogsItemsBatchPostRequestLanguageEnum_DA;
  @BuiltValueEnumConst(wireName: r'DV')
  static const CatalogsItemsBatchPostRequestLanguageEnum DV = _$catalogsItemsBatchPostRequestLanguageEnum_DV;
  @BuiltValueEnumConst(wireName: r'DZ')
  static const CatalogsItemsBatchPostRequestLanguageEnum DZ = _$catalogsItemsBatchPostRequestLanguageEnum_DZ;
  @BuiltValueEnumConst(wireName: r'DE')
  static const CatalogsItemsBatchPostRequestLanguageEnum DE = _$catalogsItemsBatchPostRequestLanguageEnum_DE;
  @BuiltValueEnumConst(wireName: r'EL')
  static const CatalogsItemsBatchPostRequestLanguageEnum EL = _$catalogsItemsBatchPostRequestLanguageEnum_EL;
  @BuiltValueEnumConst(wireName: r'EN')
  static const CatalogsItemsBatchPostRequestLanguageEnum EN = _$catalogsItemsBatchPostRequestLanguageEnum_EN;
  @BuiltValueEnumConst(wireName: r'ES')
  static const CatalogsItemsBatchPostRequestLanguageEnum ES = _$catalogsItemsBatchPostRequestLanguageEnum_ES;
  @BuiltValueEnumConst(wireName: r'ET')
  static const CatalogsItemsBatchPostRequestLanguageEnum ET = _$catalogsItemsBatchPostRequestLanguageEnum_ET;
  @BuiltValueEnumConst(wireName: r'FA')
  static const CatalogsItemsBatchPostRequestLanguageEnum FA = _$catalogsItemsBatchPostRequestLanguageEnum_FA;
  @BuiltValueEnumConst(wireName: r'FI')
  static const CatalogsItemsBatchPostRequestLanguageEnum FI = _$catalogsItemsBatchPostRequestLanguageEnum_FI;
  @BuiltValueEnumConst(wireName: r'FR')
  static const CatalogsItemsBatchPostRequestLanguageEnum FR = _$catalogsItemsBatchPostRequestLanguageEnum_FR;
  @BuiltValueEnumConst(wireName: r'HE')
  static const CatalogsItemsBatchPostRequestLanguageEnum HE = _$catalogsItemsBatchPostRequestLanguageEnum_HE;
  @BuiltValueEnumConst(wireName: r'HI')
  static const CatalogsItemsBatchPostRequestLanguageEnum HI = _$catalogsItemsBatchPostRequestLanguageEnum_HI;
  @BuiltValueEnumConst(wireName: r'HR')
  static const CatalogsItemsBatchPostRequestLanguageEnum HR = _$catalogsItemsBatchPostRequestLanguageEnum_HR;
  @BuiltValueEnumConst(wireName: r'HU')
  static const CatalogsItemsBatchPostRequestLanguageEnum HU = _$catalogsItemsBatchPostRequestLanguageEnum_HU;
  @BuiltValueEnumConst(wireName: r'HY')
  static const CatalogsItemsBatchPostRequestLanguageEnum HY = _$catalogsItemsBatchPostRequestLanguageEnum_HY;
  @BuiltValueEnumConst(wireName: r'ID')
  static const CatalogsItemsBatchPostRequestLanguageEnum ID = _$catalogsItemsBatchPostRequestLanguageEnum_ID;
  @BuiltValueEnumConst(wireName: r'IN')
  static const CatalogsItemsBatchPostRequestLanguageEnum IN = _$catalogsItemsBatchPostRequestLanguageEnum_IN;
  @BuiltValueEnumConst(wireName: r'IS')
  static const CatalogsItemsBatchPostRequestLanguageEnum IS = _$catalogsItemsBatchPostRequestLanguageEnum_IS;
  @BuiltValueEnumConst(wireName: r'IT')
  static const CatalogsItemsBatchPostRequestLanguageEnum IT = _$catalogsItemsBatchPostRequestLanguageEnum_IT;
  @BuiltValueEnumConst(wireName: r'IW')
  static const CatalogsItemsBatchPostRequestLanguageEnum IW = _$catalogsItemsBatchPostRequestLanguageEnum_IW;
  @BuiltValueEnumConst(wireName: r'JA')
  static const CatalogsItemsBatchPostRequestLanguageEnum JA = _$catalogsItemsBatchPostRequestLanguageEnum_JA;
  @BuiltValueEnumConst(wireName: r'KA')
  static const CatalogsItemsBatchPostRequestLanguageEnum KA = _$catalogsItemsBatchPostRequestLanguageEnum_KA;
  @BuiltValueEnumConst(wireName: r'KM')
  static const CatalogsItemsBatchPostRequestLanguageEnum KM = _$catalogsItemsBatchPostRequestLanguageEnum_KM;
  @BuiltValueEnumConst(wireName: r'KO')
  static const CatalogsItemsBatchPostRequestLanguageEnum KO = _$catalogsItemsBatchPostRequestLanguageEnum_KO;
  @BuiltValueEnumConst(wireName: r'LO')
  static const CatalogsItemsBatchPostRequestLanguageEnum LO = _$catalogsItemsBatchPostRequestLanguageEnum_LO;
  @BuiltValueEnumConst(wireName: r'LT')
  static const CatalogsItemsBatchPostRequestLanguageEnum LT = _$catalogsItemsBatchPostRequestLanguageEnum_LT;
  @BuiltValueEnumConst(wireName: r'LV')
  static const CatalogsItemsBatchPostRequestLanguageEnum LV = _$catalogsItemsBatchPostRequestLanguageEnum_LV;
  @BuiltValueEnumConst(wireName: r'MK')
  static const CatalogsItemsBatchPostRequestLanguageEnum MK = _$catalogsItemsBatchPostRequestLanguageEnum_MK;
  @BuiltValueEnumConst(wireName: r'MN')
  static const CatalogsItemsBatchPostRequestLanguageEnum MN = _$catalogsItemsBatchPostRequestLanguageEnum_MN;
  @BuiltValueEnumConst(wireName: r'MS')
  static const CatalogsItemsBatchPostRequestLanguageEnum MS = _$catalogsItemsBatchPostRequestLanguageEnum_MS;
  @BuiltValueEnumConst(wireName: r'MY')
  static const CatalogsItemsBatchPostRequestLanguageEnum MY = _$catalogsItemsBatchPostRequestLanguageEnum_MY;
  @BuiltValueEnumConst(wireName: r'NB')
  static const CatalogsItemsBatchPostRequestLanguageEnum NB = _$catalogsItemsBatchPostRequestLanguageEnum_NB;
  @BuiltValueEnumConst(wireName: r'NE')
  static const CatalogsItemsBatchPostRequestLanguageEnum NE = _$catalogsItemsBatchPostRequestLanguageEnum_NE;
  @BuiltValueEnumConst(wireName: r'NL')
  static const CatalogsItemsBatchPostRequestLanguageEnum NL = _$catalogsItemsBatchPostRequestLanguageEnum_NL;
  @BuiltValueEnumConst(wireName: r'false')
  static const CatalogsItemsBatchPostRequestLanguageEnum false_ = _$catalogsItemsBatchPostRequestLanguageEnum_false_;
  @BuiltValueEnumConst(wireName: r'PL')
  static const CatalogsItemsBatchPostRequestLanguageEnum PL = _$catalogsItemsBatchPostRequestLanguageEnum_PL;
  @BuiltValueEnumConst(wireName: r'PT')
  static const CatalogsItemsBatchPostRequestLanguageEnum PT = _$catalogsItemsBatchPostRequestLanguageEnum_PT;
  @BuiltValueEnumConst(wireName: r'RO')
  static const CatalogsItemsBatchPostRequestLanguageEnum RO = _$catalogsItemsBatchPostRequestLanguageEnum_RO;
  @BuiltValueEnumConst(wireName: r'RU')
  static const CatalogsItemsBatchPostRequestLanguageEnum RU = _$catalogsItemsBatchPostRequestLanguageEnum_RU;
  @BuiltValueEnumConst(wireName: r'SK')
  static const CatalogsItemsBatchPostRequestLanguageEnum SK = _$catalogsItemsBatchPostRequestLanguageEnum_SK;
  @BuiltValueEnumConst(wireName: r'SL')
  static const CatalogsItemsBatchPostRequestLanguageEnum SL = _$catalogsItemsBatchPostRequestLanguageEnum_SL;
  @BuiltValueEnumConst(wireName: r'SQ')
  static const CatalogsItemsBatchPostRequestLanguageEnum SQ = _$catalogsItemsBatchPostRequestLanguageEnum_SQ;
  @BuiltValueEnumConst(wireName: r'SR')
  static const CatalogsItemsBatchPostRequestLanguageEnum SR = _$catalogsItemsBatchPostRequestLanguageEnum_SR;
  @BuiltValueEnumConst(wireName: r'SV')
  static const CatalogsItemsBatchPostRequestLanguageEnum SV = _$catalogsItemsBatchPostRequestLanguageEnum_SV;
  @BuiltValueEnumConst(wireName: r'TL')
  static const CatalogsItemsBatchPostRequestLanguageEnum TL = _$catalogsItemsBatchPostRequestLanguageEnum_TL;
  @BuiltValueEnumConst(wireName: r'UK')
  static const CatalogsItemsBatchPostRequestLanguageEnum UK = _$catalogsItemsBatchPostRequestLanguageEnum_UK;
  @BuiltValueEnumConst(wireName: r'VI')
  static const CatalogsItemsBatchPostRequestLanguageEnum VI = _$catalogsItemsBatchPostRequestLanguageEnum_VI;
  @BuiltValueEnumConst(wireName: r'TE')
  static const CatalogsItemsBatchPostRequestLanguageEnum TE = _$catalogsItemsBatchPostRequestLanguageEnum_TE;
  @BuiltValueEnumConst(wireName: r'TH')
  static const CatalogsItemsBatchPostRequestLanguageEnum TH = _$catalogsItemsBatchPostRequestLanguageEnum_TH;
  @BuiltValueEnumConst(wireName: r'TR')
  static const CatalogsItemsBatchPostRequestLanguageEnum TR = _$catalogsItemsBatchPostRequestLanguageEnum_TR;
  @BuiltValueEnumConst(wireName: r'XX')
  static const CatalogsItemsBatchPostRequestLanguageEnum XX = _$catalogsItemsBatchPostRequestLanguageEnum_XX;
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

