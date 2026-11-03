//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_creative_assets_batch_request.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_hotel_batch_request.dart';
import 'package:openapi/src/model/catalogs_retail_batch_request.dart';
import 'package:openapi/src/model/catalogs_creative_assets_batch_item.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_vertical_batch_request.g.dart';

/// A request object that can have multiple operations on a single batch
///
/// Properties:
/// * [catalogId] - Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
/// * [catalogType] 
/// * [country] 
/// * [items] - Array with creative assets item operations
/// * [language] - We recommend using the CatalogsLocale values.
@BuiltValue()
abstract class CatalogsVerticalBatchRequest implements Built<CatalogsVerticalBatchRequest, CatalogsVerticalBatchRequestBuilder> {
  /// One Of [CatalogsCreativeAssetsBatchRequest], [CatalogsHotelBatchRequest], [CatalogsRetailBatchRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'catalog_type';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATIVE_ASSETS': CatalogsCreativeAssetsBatchRequest,
    r'HOTEL': CatalogsHotelBatchRequest,
    r'RETAIL': CatalogsRetailBatchRequest,
  };

  CatalogsVerticalBatchRequest._();

  factory CatalogsVerticalBatchRequest([void updates(CatalogsVerticalBatchRequestBuilder b)]) = _$CatalogsVerticalBatchRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsVerticalBatchRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsVerticalBatchRequest> get serializer => _$CatalogsVerticalBatchRequestSerializer();
}

extension CatalogsVerticalBatchRequestDiscriminatorExt on CatalogsVerticalBatchRequest {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsBatchRequest) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelBatchRequest) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailBatchRequest) {
            return r'RETAIL';
        }
        return null;
    }
}
extension CatalogsVerticalBatchRequestBuilderDiscriminatorExt on CatalogsVerticalBatchRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsCreativeAssetsBatchRequestBuilder) {
            return r'CREATIVE_ASSETS';
        }
        if (this is CatalogsHotelBatchRequestBuilder) {
            return r'HOTEL';
        }
        if (this is CatalogsRetailBatchRequestBuilder) {
            return r'RETAIL';
        }
        return null;
    }
}

class _$CatalogsVerticalBatchRequestSerializer implements PrimitiveSerializer<CatalogsVerticalBatchRequest> {
  @override
  final Iterable<Type> types = const [CatalogsVerticalBatchRequest, _$CatalogsVerticalBatchRequest];

  @override
  final String wireName = r'CatalogsVerticalBatchRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsVerticalBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsVerticalBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsVerticalBatchRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsVerticalBatchRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsVerticalBatchRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsCreativeAssetsBatchRequest, CatalogsHotelBatchRequest, CatalogsRetailBatchRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATIVE_ASSETS':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsCreativeAssetsBatchRequest),
        ) as CatalogsCreativeAssetsBatchRequest;
        oneOfType = CatalogsCreativeAssetsBatchRequest;
        break;
      case r'HOTEL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsHotelBatchRequest),
        ) as CatalogsHotelBatchRequest;
        oneOfType = CatalogsHotelBatchRequest;
        break;
      case r'RETAIL':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsRetailBatchRequest),
        ) as CatalogsRetailBatchRequest;
        oneOfType = CatalogsRetailBatchRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}


class CatalogsVerticalBatchRequestCatalogTypeEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'CREATIVE_ASSETS')
  static const CatalogsVerticalBatchRequestCatalogTypeEnum CREATIVE_ASSETS = _$catalogsVerticalBatchRequestCatalogTypeEnum_CREATIVE_ASSETS;

  static Serializer<CatalogsVerticalBatchRequestCatalogTypeEnum> get serializer => _$catalogsVerticalBatchRequestCatalogTypeEnumSerializer;

  const CatalogsVerticalBatchRequestCatalogTypeEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalBatchRequestCatalogTypeEnum> get values => _$catalogsVerticalBatchRequestCatalogTypeEnumValues;
  static CatalogsVerticalBatchRequestCatalogTypeEnum valueOf(String name) => _$catalogsVerticalBatchRequestCatalogTypeEnumValueOf(name);
}

/// We recommend using the CatalogsLocale values.
class CatalogsVerticalBatchRequestLanguageEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const CatalogsVerticalBatchRequestLanguageEnum afZA = _$catalogsVerticalBatchRequestLanguageEnum_afZA;
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const CatalogsVerticalBatchRequestLanguageEnum arSA = _$catalogsVerticalBatchRequestLanguageEnum_arSA;
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const CatalogsVerticalBatchRequestLanguageEnum bgBG = _$catalogsVerticalBatchRequestLanguageEnum_bgBG;
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum bnIN = _$catalogsVerticalBatchRequestLanguageEnum_bnIN;
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const CatalogsVerticalBatchRequestLanguageEnum csCZ = _$catalogsVerticalBatchRequestLanguageEnum_csCZ;
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const CatalogsVerticalBatchRequestLanguageEnum daDK = _$catalogsVerticalBatchRequestLanguageEnum_daDK;
  @BuiltValueEnumConst(wireName: r'de')
  static const CatalogsVerticalBatchRequestLanguageEnum de = _$catalogsVerticalBatchRequestLanguageEnum_de;
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const CatalogsVerticalBatchRequestLanguageEnum elGR = _$catalogsVerticalBatchRequestLanguageEnum_elGR;
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const CatalogsVerticalBatchRequestLanguageEnum enAU = _$catalogsVerticalBatchRequestLanguageEnum_enAU;
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const CatalogsVerticalBatchRequestLanguageEnum enCA = _$catalogsVerticalBatchRequestLanguageEnum_enCA;
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const CatalogsVerticalBatchRequestLanguageEnum enGB = _$catalogsVerticalBatchRequestLanguageEnum_enGB;
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum enIN = _$catalogsVerticalBatchRequestLanguageEnum_enIN;
  @BuiltValueEnumConst(wireName: r'en-US')
  static const CatalogsVerticalBatchRequestLanguageEnum enUS = _$catalogsVerticalBatchRequestLanguageEnum_enUS;
  @BuiltValueEnumConst(wireName: r'es-419')
  static const CatalogsVerticalBatchRequestLanguageEnum es419 = _$catalogsVerticalBatchRequestLanguageEnum_es419;
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const CatalogsVerticalBatchRequestLanguageEnum esAR = _$catalogsVerticalBatchRequestLanguageEnum_esAR;
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const CatalogsVerticalBatchRequestLanguageEnum esES = _$catalogsVerticalBatchRequestLanguageEnum_esES;
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const CatalogsVerticalBatchRequestLanguageEnum esMX = _$catalogsVerticalBatchRequestLanguageEnum_esMX;
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const CatalogsVerticalBatchRequestLanguageEnum fiFI = _$catalogsVerticalBatchRequestLanguageEnum_fiFI;
  @BuiltValueEnumConst(wireName: r'fr')
  static const CatalogsVerticalBatchRequestLanguageEnum fr = _$catalogsVerticalBatchRequestLanguageEnum_fr;
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const CatalogsVerticalBatchRequestLanguageEnum frCA = _$catalogsVerticalBatchRequestLanguageEnum_frCA;
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const CatalogsVerticalBatchRequestLanguageEnum heIL = _$catalogsVerticalBatchRequestLanguageEnum_heIL;
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum hiIN = _$catalogsVerticalBatchRequestLanguageEnum_hiIN;
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const CatalogsVerticalBatchRequestLanguageEnum hrHR = _$catalogsVerticalBatchRequestLanguageEnum_hrHR;
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const CatalogsVerticalBatchRequestLanguageEnum huHU = _$catalogsVerticalBatchRequestLanguageEnum_huHU;
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const CatalogsVerticalBatchRequestLanguageEnum idID = _$catalogsVerticalBatchRequestLanguageEnum_idID;
  @BuiltValueEnumConst(wireName: r'it')
  static const CatalogsVerticalBatchRequestLanguageEnum it = _$catalogsVerticalBatchRequestLanguageEnum_it;
  @BuiltValueEnumConst(wireName: r'ja')
  static const CatalogsVerticalBatchRequestLanguageEnum ja = _$catalogsVerticalBatchRequestLanguageEnum_ja;
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const CatalogsVerticalBatchRequestLanguageEnum koKR = _$catalogsVerticalBatchRequestLanguageEnum_koKR;
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const CatalogsVerticalBatchRequestLanguageEnum msMY = _$catalogsVerticalBatchRequestLanguageEnum_msMY;
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const CatalogsVerticalBatchRequestLanguageEnum nbNO = _$catalogsVerticalBatchRequestLanguageEnum_nbNO;
  @BuiltValueEnumConst(wireName: r'nl')
  static const CatalogsVerticalBatchRequestLanguageEnum nl = _$catalogsVerticalBatchRequestLanguageEnum_nl;
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const CatalogsVerticalBatchRequestLanguageEnum plPL = _$catalogsVerticalBatchRequestLanguageEnum_plPL;
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const CatalogsVerticalBatchRequestLanguageEnum ptBR = _$catalogsVerticalBatchRequestLanguageEnum_ptBR;
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const CatalogsVerticalBatchRequestLanguageEnum ptPT = _$catalogsVerticalBatchRequestLanguageEnum_ptPT;
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const CatalogsVerticalBatchRequestLanguageEnum roRO = _$catalogsVerticalBatchRequestLanguageEnum_roRO;
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const CatalogsVerticalBatchRequestLanguageEnum ruRU = _$catalogsVerticalBatchRequestLanguageEnum_ruRU;
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const CatalogsVerticalBatchRequestLanguageEnum skSK = _$catalogsVerticalBatchRequestLanguageEnum_skSK;
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const CatalogsVerticalBatchRequestLanguageEnum svSE = _$catalogsVerticalBatchRequestLanguageEnum_svSE;
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum teIN = _$catalogsVerticalBatchRequestLanguageEnum_teIN;
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const CatalogsVerticalBatchRequestLanguageEnum thTH = _$catalogsVerticalBatchRequestLanguageEnum_thTH;
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const CatalogsVerticalBatchRequestLanguageEnum tlPH = _$catalogsVerticalBatchRequestLanguageEnum_tlPH;
  @BuiltValueEnumConst(wireName: r'tr')
  static const CatalogsVerticalBatchRequestLanguageEnum tr = _$catalogsVerticalBatchRequestLanguageEnum_tr;
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const CatalogsVerticalBatchRequestLanguageEnum ukUA = _$catalogsVerticalBatchRequestLanguageEnum_ukUA;
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const CatalogsVerticalBatchRequestLanguageEnum viVN = _$catalogsVerticalBatchRequestLanguageEnum_viVN;
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const CatalogsVerticalBatchRequestLanguageEnum zhCN = _$catalogsVerticalBatchRequestLanguageEnum_zhCN;
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const CatalogsVerticalBatchRequestLanguageEnum zhTW = _$catalogsVerticalBatchRequestLanguageEnum_zhTW;
  @BuiltValueEnumConst(wireName: r'AM')
  static const CatalogsVerticalBatchRequestLanguageEnum AM = _$catalogsVerticalBatchRequestLanguageEnum_AM;
  @BuiltValueEnumConst(wireName: r'AR')
  static const CatalogsVerticalBatchRequestLanguageEnum AR = _$catalogsVerticalBatchRequestLanguageEnum_AR;
  @BuiltValueEnumConst(wireName: r'AZ')
  static const CatalogsVerticalBatchRequestLanguageEnum AZ = _$catalogsVerticalBatchRequestLanguageEnum_AZ;
  @BuiltValueEnumConst(wireName: r'BG')
  static const CatalogsVerticalBatchRequestLanguageEnum BG = _$catalogsVerticalBatchRequestLanguageEnum_BG;
  @BuiltValueEnumConst(wireName: r'BN')
  static const CatalogsVerticalBatchRequestLanguageEnum BN = _$catalogsVerticalBatchRequestLanguageEnum_BN;
  @BuiltValueEnumConst(wireName: r'BS')
  static const CatalogsVerticalBatchRequestLanguageEnum BS = _$catalogsVerticalBatchRequestLanguageEnum_BS;
  @BuiltValueEnumConst(wireName: r'CA')
  static const CatalogsVerticalBatchRequestLanguageEnum CA = _$catalogsVerticalBatchRequestLanguageEnum_CA;
  @BuiltValueEnumConst(wireName: r'CS')
  static const CatalogsVerticalBatchRequestLanguageEnum CS = _$catalogsVerticalBatchRequestLanguageEnum_CS;
  @BuiltValueEnumConst(wireName: r'DA')
  static const CatalogsVerticalBatchRequestLanguageEnum DA = _$catalogsVerticalBatchRequestLanguageEnum_DA;
  @BuiltValueEnumConst(wireName: r'DV')
  static const CatalogsVerticalBatchRequestLanguageEnum DV = _$catalogsVerticalBatchRequestLanguageEnum_DV;
  @BuiltValueEnumConst(wireName: r'DZ')
  static const CatalogsVerticalBatchRequestLanguageEnum DZ = _$catalogsVerticalBatchRequestLanguageEnum_DZ;
  @BuiltValueEnumConst(wireName: r'DE')
  static const CatalogsVerticalBatchRequestLanguageEnum DE = _$catalogsVerticalBatchRequestLanguageEnum_DE;
  @BuiltValueEnumConst(wireName: r'EL')
  static const CatalogsVerticalBatchRequestLanguageEnum EL = _$catalogsVerticalBatchRequestLanguageEnum_EL;
  @BuiltValueEnumConst(wireName: r'EN')
  static const CatalogsVerticalBatchRequestLanguageEnum EN = _$catalogsVerticalBatchRequestLanguageEnum_EN;
  @BuiltValueEnumConst(wireName: r'ES')
  static const CatalogsVerticalBatchRequestLanguageEnum ES = _$catalogsVerticalBatchRequestLanguageEnum_ES;
  @BuiltValueEnumConst(wireName: r'ET')
  static const CatalogsVerticalBatchRequestLanguageEnum ET = _$catalogsVerticalBatchRequestLanguageEnum_ET;
  @BuiltValueEnumConst(wireName: r'FA')
  static const CatalogsVerticalBatchRequestLanguageEnum FA = _$catalogsVerticalBatchRequestLanguageEnum_FA;
  @BuiltValueEnumConst(wireName: r'FI')
  static const CatalogsVerticalBatchRequestLanguageEnum FI = _$catalogsVerticalBatchRequestLanguageEnum_FI;
  @BuiltValueEnumConst(wireName: r'FR')
  static const CatalogsVerticalBatchRequestLanguageEnum FR = _$catalogsVerticalBatchRequestLanguageEnum_FR;
  @BuiltValueEnumConst(wireName: r'HE')
  static const CatalogsVerticalBatchRequestLanguageEnum HE = _$catalogsVerticalBatchRequestLanguageEnum_HE;
  @BuiltValueEnumConst(wireName: r'HI')
  static const CatalogsVerticalBatchRequestLanguageEnum HI = _$catalogsVerticalBatchRequestLanguageEnum_HI;
  @BuiltValueEnumConst(wireName: r'HR')
  static const CatalogsVerticalBatchRequestLanguageEnum HR = _$catalogsVerticalBatchRequestLanguageEnum_HR;
  @BuiltValueEnumConst(wireName: r'HU')
  static const CatalogsVerticalBatchRequestLanguageEnum HU = _$catalogsVerticalBatchRequestLanguageEnum_HU;
  @BuiltValueEnumConst(wireName: r'HY')
  static const CatalogsVerticalBatchRequestLanguageEnum HY = _$catalogsVerticalBatchRequestLanguageEnum_HY;
  @BuiltValueEnumConst(wireName: r'ID')
  static const CatalogsVerticalBatchRequestLanguageEnum ID = _$catalogsVerticalBatchRequestLanguageEnum_ID;
  @BuiltValueEnumConst(wireName: r'IN')
  static const CatalogsVerticalBatchRequestLanguageEnum IN = _$catalogsVerticalBatchRequestLanguageEnum_IN;
  @BuiltValueEnumConst(wireName: r'IS')
  static const CatalogsVerticalBatchRequestLanguageEnum IS = _$catalogsVerticalBatchRequestLanguageEnum_IS;
  @BuiltValueEnumConst(wireName: r'IT')
  static const CatalogsVerticalBatchRequestLanguageEnum IT = _$catalogsVerticalBatchRequestLanguageEnum_IT;
  @BuiltValueEnumConst(wireName: r'IW')
  static const CatalogsVerticalBatchRequestLanguageEnum IW = _$catalogsVerticalBatchRequestLanguageEnum_IW;
  @BuiltValueEnumConst(wireName: r'JA')
  static const CatalogsVerticalBatchRequestLanguageEnum JA = _$catalogsVerticalBatchRequestLanguageEnum_JA;
  @BuiltValueEnumConst(wireName: r'KA')
  static const CatalogsVerticalBatchRequestLanguageEnum KA = _$catalogsVerticalBatchRequestLanguageEnum_KA;
  @BuiltValueEnumConst(wireName: r'KM')
  static const CatalogsVerticalBatchRequestLanguageEnum KM = _$catalogsVerticalBatchRequestLanguageEnum_KM;
  @BuiltValueEnumConst(wireName: r'KO')
  static const CatalogsVerticalBatchRequestLanguageEnum KO = _$catalogsVerticalBatchRequestLanguageEnum_KO;
  @BuiltValueEnumConst(wireName: r'LO')
  static const CatalogsVerticalBatchRequestLanguageEnum LO = _$catalogsVerticalBatchRequestLanguageEnum_LO;
  @BuiltValueEnumConst(wireName: r'LT')
  static const CatalogsVerticalBatchRequestLanguageEnum LT = _$catalogsVerticalBatchRequestLanguageEnum_LT;
  @BuiltValueEnumConst(wireName: r'LV')
  static const CatalogsVerticalBatchRequestLanguageEnum LV = _$catalogsVerticalBatchRequestLanguageEnum_LV;
  @BuiltValueEnumConst(wireName: r'MK')
  static const CatalogsVerticalBatchRequestLanguageEnum MK = _$catalogsVerticalBatchRequestLanguageEnum_MK;
  @BuiltValueEnumConst(wireName: r'MN')
  static const CatalogsVerticalBatchRequestLanguageEnum MN = _$catalogsVerticalBatchRequestLanguageEnum_MN;
  @BuiltValueEnumConst(wireName: r'MS')
  static const CatalogsVerticalBatchRequestLanguageEnum MS = _$catalogsVerticalBatchRequestLanguageEnum_MS;
  @BuiltValueEnumConst(wireName: r'MY')
  static const CatalogsVerticalBatchRequestLanguageEnum MY = _$catalogsVerticalBatchRequestLanguageEnum_MY;
  @BuiltValueEnumConst(wireName: r'NB')
  static const CatalogsVerticalBatchRequestLanguageEnum NB = _$catalogsVerticalBatchRequestLanguageEnum_NB;
  @BuiltValueEnumConst(wireName: r'NE')
  static const CatalogsVerticalBatchRequestLanguageEnum NE = _$catalogsVerticalBatchRequestLanguageEnum_NE;
  @BuiltValueEnumConst(wireName: r'NL')
  static const CatalogsVerticalBatchRequestLanguageEnum NL = _$catalogsVerticalBatchRequestLanguageEnum_NL;
  @BuiltValueEnumConst(wireName: r'false')
  static const CatalogsVerticalBatchRequestLanguageEnum false_ = _$catalogsVerticalBatchRequestLanguageEnum_false_;
  @BuiltValueEnumConst(wireName: r'PL')
  static const CatalogsVerticalBatchRequestLanguageEnum PL = _$catalogsVerticalBatchRequestLanguageEnum_PL;
  @BuiltValueEnumConst(wireName: r'PT')
  static const CatalogsVerticalBatchRequestLanguageEnum PT = _$catalogsVerticalBatchRequestLanguageEnum_PT;
  @BuiltValueEnumConst(wireName: r'RO')
  static const CatalogsVerticalBatchRequestLanguageEnum RO = _$catalogsVerticalBatchRequestLanguageEnum_RO;
  @BuiltValueEnumConst(wireName: r'RU')
  static const CatalogsVerticalBatchRequestLanguageEnum RU = _$catalogsVerticalBatchRequestLanguageEnum_RU;
  @BuiltValueEnumConst(wireName: r'SK')
  static const CatalogsVerticalBatchRequestLanguageEnum SK = _$catalogsVerticalBatchRequestLanguageEnum_SK;
  @BuiltValueEnumConst(wireName: r'SL')
  static const CatalogsVerticalBatchRequestLanguageEnum SL = _$catalogsVerticalBatchRequestLanguageEnum_SL;
  @BuiltValueEnumConst(wireName: r'SQ')
  static const CatalogsVerticalBatchRequestLanguageEnum SQ = _$catalogsVerticalBatchRequestLanguageEnum_SQ;
  @BuiltValueEnumConst(wireName: r'SR')
  static const CatalogsVerticalBatchRequestLanguageEnum SR = _$catalogsVerticalBatchRequestLanguageEnum_SR;
  @BuiltValueEnumConst(wireName: r'SV')
  static const CatalogsVerticalBatchRequestLanguageEnum SV = _$catalogsVerticalBatchRequestLanguageEnum_SV;
  @BuiltValueEnumConst(wireName: r'TL')
  static const CatalogsVerticalBatchRequestLanguageEnum TL = _$catalogsVerticalBatchRequestLanguageEnum_TL;
  @BuiltValueEnumConst(wireName: r'UK')
  static const CatalogsVerticalBatchRequestLanguageEnum UK = _$catalogsVerticalBatchRequestLanguageEnum_UK;
  @BuiltValueEnumConst(wireName: r'VI')
  static const CatalogsVerticalBatchRequestLanguageEnum VI = _$catalogsVerticalBatchRequestLanguageEnum_VI;
  @BuiltValueEnumConst(wireName: r'TE')
  static const CatalogsVerticalBatchRequestLanguageEnum TE = _$catalogsVerticalBatchRequestLanguageEnum_TE;
  @BuiltValueEnumConst(wireName: r'TH')
  static const CatalogsVerticalBatchRequestLanguageEnum TH = _$catalogsVerticalBatchRequestLanguageEnum_TH;
  @BuiltValueEnumConst(wireName: r'TR')
  static const CatalogsVerticalBatchRequestLanguageEnum TR = _$catalogsVerticalBatchRequestLanguageEnum_TR;
  @BuiltValueEnumConst(wireName: r'XX')
  static const CatalogsVerticalBatchRequestLanguageEnum XX = _$catalogsVerticalBatchRequestLanguageEnum_XX;
  @BuiltValueEnumConst(wireName: r'ZH')
  static const CatalogsVerticalBatchRequestLanguageEnum ZH = _$catalogsVerticalBatchRequestLanguageEnum_ZH;

  static Serializer<CatalogsVerticalBatchRequestLanguageEnum> get serializer => _$catalogsVerticalBatchRequestLanguageEnumSerializer;

  const CatalogsVerticalBatchRequestLanguageEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalBatchRequestLanguageEnum> get values => _$catalogsVerticalBatchRequestLanguageEnumValues;
  static CatalogsVerticalBatchRequestLanguageEnum valueOf(String name) => _$catalogsVerticalBatchRequestLanguageEnumValueOf(name);
}

