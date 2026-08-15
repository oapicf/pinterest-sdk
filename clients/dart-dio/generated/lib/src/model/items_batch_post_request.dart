//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/catalogs_items_batch_request.dart';
import 'package:openapi/src/model/catalogs_vertical_batch_request.dart';
import 'package:openapi/src/model/item_delete_batch_record.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/batch_operation.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'items_batch_post_request.g.dart';

/// ItemsBatchPostRequest
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [catalogType] 
/// * [country] 
/// * [items] - Array with catalogs items
/// * [language] - We recommend using the CatalogsLocale values.
/// * [operation] 
@BuiltValue()
abstract class ItemsBatchPostRequest implements Built<ItemsBatchPostRequest, ItemsBatchPostRequestBuilder> {
  /// One Of [CatalogsItemsBatchRequest], [CatalogsVerticalBatchRequest]
  OneOf get oneOf;

  ItemsBatchPostRequest._();

  factory ItemsBatchPostRequest([void updates(ItemsBatchPostRequestBuilder b)]) = _$ItemsBatchPostRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemsBatchPostRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemsBatchPostRequest> get serializer => _$ItemsBatchPostRequestSerializer();
}

class _$ItemsBatchPostRequestSerializer implements PrimitiveSerializer<ItemsBatchPostRequest> {
  @override
  final Iterable<Type> types = const [ItemsBatchPostRequest, _$ItemsBatchPostRequest];

  @override
  final String wireName = r'ItemsBatchPostRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemsBatchPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemsBatchPostRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  ItemsBatchPostRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemsBatchPostRequestBuilder();
    Object? oneOfDataSrc;
    final targetType = const FullType(OneOf, [FullType(CatalogsVerticalBatchRequest), FullType(CatalogsItemsBatchRequest), ]);
    oneOfDataSrc = serialized;
    result.oneOf = serializers.deserialize(oneOfDataSrc, specifiedType: targetType) as OneOf;
    return result.build();
  }
}

class ItemsBatchPostRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const ItemsBatchPostRequestCatalogTypeEnum CREATIVE_ASSETS = _$itemsBatchPostRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<ItemsBatchPostRequestCatalogTypeEnum> get serializer => _$itemsBatchPostRequestCatalogTypeEnumSerializer;

  const ItemsBatchPostRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<ItemsBatchPostRequestCatalogTypeEnum> get values => _$itemsBatchPostRequestCatalogTypeEnumValues;
  static ItemsBatchPostRequestCatalogTypeEnum valueOf(String name) => _$itemsBatchPostRequestCatalogTypeEnumValueOf(name);
}

class ItemsBatchPostRequestLanguageEnum extends EnumClass {

  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const ItemsBatchPostRequestLanguageEnum afZA = _$itemsBatchPostRequestLanguageEnum_afZA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const ItemsBatchPostRequestLanguageEnum arSA = _$itemsBatchPostRequestLanguageEnum_arSA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const ItemsBatchPostRequestLanguageEnum bgBG = _$itemsBatchPostRequestLanguageEnum_bgBG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const ItemsBatchPostRequestLanguageEnum bnIN = _$itemsBatchPostRequestLanguageEnum_bnIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const ItemsBatchPostRequestLanguageEnum csCZ = _$itemsBatchPostRequestLanguageEnum_csCZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const ItemsBatchPostRequestLanguageEnum daDK = _$itemsBatchPostRequestLanguageEnum_daDK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'de')
  static const ItemsBatchPostRequestLanguageEnum de = _$itemsBatchPostRequestLanguageEnum_de;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const ItemsBatchPostRequestLanguageEnum elGR = _$itemsBatchPostRequestLanguageEnum_elGR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const ItemsBatchPostRequestLanguageEnum enAU = _$itemsBatchPostRequestLanguageEnum_enAU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const ItemsBatchPostRequestLanguageEnum enCA = _$itemsBatchPostRequestLanguageEnum_enCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const ItemsBatchPostRequestLanguageEnum enGB = _$itemsBatchPostRequestLanguageEnum_enGB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const ItemsBatchPostRequestLanguageEnum enIN = _$itemsBatchPostRequestLanguageEnum_enIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-US')
  static const ItemsBatchPostRequestLanguageEnum enUS = _$itemsBatchPostRequestLanguageEnum_enUS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-419')
  static const ItemsBatchPostRequestLanguageEnum es419 = _$itemsBatchPostRequestLanguageEnum_es419;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const ItemsBatchPostRequestLanguageEnum esAR = _$itemsBatchPostRequestLanguageEnum_esAR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const ItemsBatchPostRequestLanguageEnum esES = _$itemsBatchPostRequestLanguageEnum_esES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const ItemsBatchPostRequestLanguageEnum esMX = _$itemsBatchPostRequestLanguageEnum_esMX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const ItemsBatchPostRequestLanguageEnum fiFI = _$itemsBatchPostRequestLanguageEnum_fiFI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr')
  static const ItemsBatchPostRequestLanguageEnum fr = _$itemsBatchPostRequestLanguageEnum_fr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const ItemsBatchPostRequestLanguageEnum frCA = _$itemsBatchPostRequestLanguageEnum_frCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const ItemsBatchPostRequestLanguageEnum heIL = _$itemsBatchPostRequestLanguageEnum_heIL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const ItemsBatchPostRequestLanguageEnum hiIN = _$itemsBatchPostRequestLanguageEnum_hiIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const ItemsBatchPostRequestLanguageEnum hrHR = _$itemsBatchPostRequestLanguageEnum_hrHR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const ItemsBatchPostRequestLanguageEnum huHU = _$itemsBatchPostRequestLanguageEnum_huHU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const ItemsBatchPostRequestLanguageEnum idID = _$itemsBatchPostRequestLanguageEnum_idID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'it')
  static const ItemsBatchPostRequestLanguageEnum it = _$itemsBatchPostRequestLanguageEnum_it;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ja')
  static const ItemsBatchPostRequestLanguageEnum ja = _$itemsBatchPostRequestLanguageEnum_ja;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const ItemsBatchPostRequestLanguageEnum koKR = _$itemsBatchPostRequestLanguageEnum_koKR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const ItemsBatchPostRequestLanguageEnum msMY = _$itemsBatchPostRequestLanguageEnum_msMY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const ItemsBatchPostRequestLanguageEnum nbNO = _$itemsBatchPostRequestLanguageEnum_nbNO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nl')
  static const ItemsBatchPostRequestLanguageEnum nl = _$itemsBatchPostRequestLanguageEnum_nl;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const ItemsBatchPostRequestLanguageEnum plPL = _$itemsBatchPostRequestLanguageEnum_plPL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const ItemsBatchPostRequestLanguageEnum ptBR = _$itemsBatchPostRequestLanguageEnum_ptBR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const ItemsBatchPostRequestLanguageEnum ptPT = _$itemsBatchPostRequestLanguageEnum_ptPT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const ItemsBatchPostRequestLanguageEnum roRO = _$itemsBatchPostRequestLanguageEnum_roRO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const ItemsBatchPostRequestLanguageEnum ruRU = _$itemsBatchPostRequestLanguageEnum_ruRU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const ItemsBatchPostRequestLanguageEnum skSK = _$itemsBatchPostRequestLanguageEnum_skSK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const ItemsBatchPostRequestLanguageEnum svSE = _$itemsBatchPostRequestLanguageEnum_svSE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const ItemsBatchPostRequestLanguageEnum teIN = _$itemsBatchPostRequestLanguageEnum_teIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const ItemsBatchPostRequestLanguageEnum thTH = _$itemsBatchPostRequestLanguageEnum_thTH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const ItemsBatchPostRequestLanguageEnum tlPH = _$itemsBatchPostRequestLanguageEnum_tlPH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tr')
  static const ItemsBatchPostRequestLanguageEnum tr = _$itemsBatchPostRequestLanguageEnum_tr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const ItemsBatchPostRequestLanguageEnum ukUA = _$itemsBatchPostRequestLanguageEnum_ukUA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const ItemsBatchPostRequestLanguageEnum viVN = _$itemsBatchPostRequestLanguageEnum_viVN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const ItemsBatchPostRequestLanguageEnum zhCN = _$itemsBatchPostRequestLanguageEnum_zhCN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const ItemsBatchPostRequestLanguageEnum zhTW = _$itemsBatchPostRequestLanguageEnum_zhTW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AM')
  static const ItemsBatchPostRequestLanguageEnum AM = _$itemsBatchPostRequestLanguageEnum_AM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AR')
  static const ItemsBatchPostRequestLanguageEnum AR = _$itemsBatchPostRequestLanguageEnum_AR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AZ')
  static const ItemsBatchPostRequestLanguageEnum AZ = _$itemsBatchPostRequestLanguageEnum_AZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BG')
  static const ItemsBatchPostRequestLanguageEnum BG = _$itemsBatchPostRequestLanguageEnum_BG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BN')
  static const ItemsBatchPostRequestLanguageEnum BN = _$itemsBatchPostRequestLanguageEnum_BN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BS')
  static const ItemsBatchPostRequestLanguageEnum BS = _$itemsBatchPostRequestLanguageEnum_BS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CA')
  static const ItemsBatchPostRequestLanguageEnum CA = _$itemsBatchPostRequestLanguageEnum_CA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CS')
  static const ItemsBatchPostRequestLanguageEnum CS = _$itemsBatchPostRequestLanguageEnum_CS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DA')
  static const ItemsBatchPostRequestLanguageEnum DA = _$itemsBatchPostRequestLanguageEnum_DA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DV')
  static const ItemsBatchPostRequestLanguageEnum DV = _$itemsBatchPostRequestLanguageEnum_DV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DZ')
  static const ItemsBatchPostRequestLanguageEnum DZ = _$itemsBatchPostRequestLanguageEnum_DZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DE')
  static const ItemsBatchPostRequestLanguageEnum DE = _$itemsBatchPostRequestLanguageEnum_DE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EL')
  static const ItemsBatchPostRequestLanguageEnum EL = _$itemsBatchPostRequestLanguageEnum_EL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EN')
  static const ItemsBatchPostRequestLanguageEnum EN = _$itemsBatchPostRequestLanguageEnum_EN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ES')
  static const ItemsBatchPostRequestLanguageEnum ES = _$itemsBatchPostRequestLanguageEnum_ES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ET')
  static const ItemsBatchPostRequestLanguageEnum ET = _$itemsBatchPostRequestLanguageEnum_ET;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FA')
  static const ItemsBatchPostRequestLanguageEnum FA = _$itemsBatchPostRequestLanguageEnum_FA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FI')
  static const ItemsBatchPostRequestLanguageEnum FI = _$itemsBatchPostRequestLanguageEnum_FI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FR')
  static const ItemsBatchPostRequestLanguageEnum FR = _$itemsBatchPostRequestLanguageEnum_FR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HE')
  static const ItemsBatchPostRequestLanguageEnum HE = _$itemsBatchPostRequestLanguageEnum_HE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HI')
  static const ItemsBatchPostRequestLanguageEnum HI = _$itemsBatchPostRequestLanguageEnum_HI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HR')
  static const ItemsBatchPostRequestLanguageEnum HR = _$itemsBatchPostRequestLanguageEnum_HR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HU')
  static const ItemsBatchPostRequestLanguageEnum HU = _$itemsBatchPostRequestLanguageEnum_HU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HY')
  static const ItemsBatchPostRequestLanguageEnum HY = _$itemsBatchPostRequestLanguageEnum_HY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ID')
  static const ItemsBatchPostRequestLanguageEnum ID = _$itemsBatchPostRequestLanguageEnum_ID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IN')
  static const ItemsBatchPostRequestLanguageEnum IN = _$itemsBatchPostRequestLanguageEnum_IN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IS')
  static const ItemsBatchPostRequestLanguageEnum IS = _$itemsBatchPostRequestLanguageEnum_IS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IT')
  static const ItemsBatchPostRequestLanguageEnum IT = _$itemsBatchPostRequestLanguageEnum_IT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IW')
  static const ItemsBatchPostRequestLanguageEnum IW = _$itemsBatchPostRequestLanguageEnum_IW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'JA')
  static const ItemsBatchPostRequestLanguageEnum JA = _$itemsBatchPostRequestLanguageEnum_JA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KA')
  static const ItemsBatchPostRequestLanguageEnum KA = _$itemsBatchPostRequestLanguageEnum_KA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KM')
  static const ItemsBatchPostRequestLanguageEnum KM = _$itemsBatchPostRequestLanguageEnum_KM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KO')
  static const ItemsBatchPostRequestLanguageEnum KO = _$itemsBatchPostRequestLanguageEnum_KO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LO')
  static const ItemsBatchPostRequestLanguageEnum LO = _$itemsBatchPostRequestLanguageEnum_LO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LT')
  static const ItemsBatchPostRequestLanguageEnum LT = _$itemsBatchPostRequestLanguageEnum_LT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LV')
  static const ItemsBatchPostRequestLanguageEnum LV = _$itemsBatchPostRequestLanguageEnum_LV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MK')
  static const ItemsBatchPostRequestLanguageEnum MK = _$itemsBatchPostRequestLanguageEnum_MK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MN')
  static const ItemsBatchPostRequestLanguageEnum MN = _$itemsBatchPostRequestLanguageEnum_MN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MS')
  static const ItemsBatchPostRequestLanguageEnum MS = _$itemsBatchPostRequestLanguageEnum_MS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MY')
  static const ItemsBatchPostRequestLanguageEnum MY = _$itemsBatchPostRequestLanguageEnum_MY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NB')
  static const ItemsBatchPostRequestLanguageEnum NB = _$itemsBatchPostRequestLanguageEnum_NB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NE')
  static const ItemsBatchPostRequestLanguageEnum NE = _$itemsBatchPostRequestLanguageEnum_NE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NL')
  static const ItemsBatchPostRequestLanguageEnum NL = _$itemsBatchPostRequestLanguageEnum_NL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NO')
  static const ItemsBatchPostRequestLanguageEnum NO = _$itemsBatchPostRequestLanguageEnum_NO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PL')
  static const ItemsBatchPostRequestLanguageEnum PL = _$itemsBatchPostRequestLanguageEnum_PL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PT')
  static const ItemsBatchPostRequestLanguageEnum PT = _$itemsBatchPostRequestLanguageEnum_PT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RO')
  static const ItemsBatchPostRequestLanguageEnum RO = _$itemsBatchPostRequestLanguageEnum_RO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RU')
  static const ItemsBatchPostRequestLanguageEnum RU = _$itemsBatchPostRequestLanguageEnum_RU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SK')
  static const ItemsBatchPostRequestLanguageEnum SK = _$itemsBatchPostRequestLanguageEnum_SK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SL')
  static const ItemsBatchPostRequestLanguageEnum SL = _$itemsBatchPostRequestLanguageEnum_SL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SQ')
  static const ItemsBatchPostRequestLanguageEnum SQ = _$itemsBatchPostRequestLanguageEnum_SQ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SR')
  static const ItemsBatchPostRequestLanguageEnum SR = _$itemsBatchPostRequestLanguageEnum_SR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SV')
  static const ItemsBatchPostRequestLanguageEnum SV = _$itemsBatchPostRequestLanguageEnum_SV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TL')
  static const ItemsBatchPostRequestLanguageEnum TL = _$itemsBatchPostRequestLanguageEnum_TL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'UK')
  static const ItemsBatchPostRequestLanguageEnum UK = _$itemsBatchPostRequestLanguageEnum_UK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'VI')
  static const ItemsBatchPostRequestLanguageEnum VI = _$itemsBatchPostRequestLanguageEnum_VI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TE')
  static const ItemsBatchPostRequestLanguageEnum TE = _$itemsBatchPostRequestLanguageEnum_TE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TH')
  static const ItemsBatchPostRequestLanguageEnum TH = _$itemsBatchPostRequestLanguageEnum_TH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TR')
  static const ItemsBatchPostRequestLanguageEnum TR = _$itemsBatchPostRequestLanguageEnum_TR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'XX')
  static const ItemsBatchPostRequestLanguageEnum XX = _$itemsBatchPostRequestLanguageEnum_XX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ZH')
  static const ItemsBatchPostRequestLanguageEnum ZH = _$itemsBatchPostRequestLanguageEnum_ZH;

  static Serializer<ItemsBatchPostRequestLanguageEnum> get serializer => _$itemsBatchPostRequestLanguageEnumSerializer;

  const ItemsBatchPostRequestLanguageEnum._(String name): super(name);

  static BuiltSet<ItemsBatchPostRequestLanguageEnum> get values => _$itemsBatchPostRequestLanguageEnumValues;
  static ItemsBatchPostRequestLanguageEnum valueOf(String name) => _$itemsBatchPostRequestLanguageEnumValueOf(name);
}

