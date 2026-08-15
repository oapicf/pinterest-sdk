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

class CatalogsVerticalBatchRequestLanguageEnum extends EnumClass {

  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const CatalogsVerticalBatchRequestLanguageEnum afZA = _$catalogsVerticalBatchRequestLanguageEnum_afZA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const CatalogsVerticalBatchRequestLanguageEnum arSA = _$catalogsVerticalBatchRequestLanguageEnum_arSA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const CatalogsVerticalBatchRequestLanguageEnum bgBG = _$catalogsVerticalBatchRequestLanguageEnum_bgBG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum bnIN = _$catalogsVerticalBatchRequestLanguageEnum_bnIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const CatalogsVerticalBatchRequestLanguageEnum csCZ = _$catalogsVerticalBatchRequestLanguageEnum_csCZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const CatalogsVerticalBatchRequestLanguageEnum daDK = _$catalogsVerticalBatchRequestLanguageEnum_daDK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'de')
  static const CatalogsVerticalBatchRequestLanguageEnum de = _$catalogsVerticalBatchRequestLanguageEnum_de;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const CatalogsVerticalBatchRequestLanguageEnum elGR = _$catalogsVerticalBatchRequestLanguageEnum_elGR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const CatalogsVerticalBatchRequestLanguageEnum enAU = _$catalogsVerticalBatchRequestLanguageEnum_enAU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const CatalogsVerticalBatchRequestLanguageEnum enCA = _$catalogsVerticalBatchRequestLanguageEnum_enCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const CatalogsVerticalBatchRequestLanguageEnum enGB = _$catalogsVerticalBatchRequestLanguageEnum_enGB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum enIN = _$catalogsVerticalBatchRequestLanguageEnum_enIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-US')
  static const CatalogsVerticalBatchRequestLanguageEnum enUS = _$catalogsVerticalBatchRequestLanguageEnum_enUS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-419')
  static const CatalogsVerticalBatchRequestLanguageEnum es419 = _$catalogsVerticalBatchRequestLanguageEnum_es419;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const CatalogsVerticalBatchRequestLanguageEnum esAR = _$catalogsVerticalBatchRequestLanguageEnum_esAR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const CatalogsVerticalBatchRequestLanguageEnum esES = _$catalogsVerticalBatchRequestLanguageEnum_esES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const CatalogsVerticalBatchRequestLanguageEnum esMX = _$catalogsVerticalBatchRequestLanguageEnum_esMX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const CatalogsVerticalBatchRequestLanguageEnum fiFI = _$catalogsVerticalBatchRequestLanguageEnum_fiFI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr')
  static const CatalogsVerticalBatchRequestLanguageEnum fr = _$catalogsVerticalBatchRequestLanguageEnum_fr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const CatalogsVerticalBatchRequestLanguageEnum frCA = _$catalogsVerticalBatchRequestLanguageEnum_frCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const CatalogsVerticalBatchRequestLanguageEnum heIL = _$catalogsVerticalBatchRequestLanguageEnum_heIL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum hiIN = _$catalogsVerticalBatchRequestLanguageEnum_hiIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const CatalogsVerticalBatchRequestLanguageEnum hrHR = _$catalogsVerticalBatchRequestLanguageEnum_hrHR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const CatalogsVerticalBatchRequestLanguageEnum huHU = _$catalogsVerticalBatchRequestLanguageEnum_huHU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const CatalogsVerticalBatchRequestLanguageEnum idID = _$catalogsVerticalBatchRequestLanguageEnum_idID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'it')
  static const CatalogsVerticalBatchRequestLanguageEnum it = _$catalogsVerticalBatchRequestLanguageEnum_it;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ja')
  static const CatalogsVerticalBatchRequestLanguageEnum ja = _$catalogsVerticalBatchRequestLanguageEnum_ja;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const CatalogsVerticalBatchRequestLanguageEnum koKR = _$catalogsVerticalBatchRequestLanguageEnum_koKR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const CatalogsVerticalBatchRequestLanguageEnum msMY = _$catalogsVerticalBatchRequestLanguageEnum_msMY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const CatalogsVerticalBatchRequestLanguageEnum nbNO = _$catalogsVerticalBatchRequestLanguageEnum_nbNO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nl')
  static const CatalogsVerticalBatchRequestLanguageEnum nl = _$catalogsVerticalBatchRequestLanguageEnum_nl;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const CatalogsVerticalBatchRequestLanguageEnum plPL = _$catalogsVerticalBatchRequestLanguageEnum_plPL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const CatalogsVerticalBatchRequestLanguageEnum ptBR = _$catalogsVerticalBatchRequestLanguageEnum_ptBR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const CatalogsVerticalBatchRequestLanguageEnum ptPT = _$catalogsVerticalBatchRequestLanguageEnum_ptPT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const CatalogsVerticalBatchRequestLanguageEnum roRO = _$catalogsVerticalBatchRequestLanguageEnum_roRO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const CatalogsVerticalBatchRequestLanguageEnum ruRU = _$catalogsVerticalBatchRequestLanguageEnum_ruRU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const CatalogsVerticalBatchRequestLanguageEnum skSK = _$catalogsVerticalBatchRequestLanguageEnum_skSK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const CatalogsVerticalBatchRequestLanguageEnum svSE = _$catalogsVerticalBatchRequestLanguageEnum_svSE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const CatalogsVerticalBatchRequestLanguageEnum teIN = _$catalogsVerticalBatchRequestLanguageEnum_teIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const CatalogsVerticalBatchRequestLanguageEnum thTH = _$catalogsVerticalBatchRequestLanguageEnum_thTH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const CatalogsVerticalBatchRequestLanguageEnum tlPH = _$catalogsVerticalBatchRequestLanguageEnum_tlPH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tr')
  static const CatalogsVerticalBatchRequestLanguageEnum tr = _$catalogsVerticalBatchRequestLanguageEnum_tr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const CatalogsVerticalBatchRequestLanguageEnum ukUA = _$catalogsVerticalBatchRequestLanguageEnum_ukUA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const CatalogsVerticalBatchRequestLanguageEnum viVN = _$catalogsVerticalBatchRequestLanguageEnum_viVN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const CatalogsVerticalBatchRequestLanguageEnum zhCN = _$catalogsVerticalBatchRequestLanguageEnum_zhCN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const CatalogsVerticalBatchRequestLanguageEnum zhTW = _$catalogsVerticalBatchRequestLanguageEnum_zhTW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AM')
  static const CatalogsVerticalBatchRequestLanguageEnum AM = _$catalogsVerticalBatchRequestLanguageEnum_AM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AR')
  static const CatalogsVerticalBatchRequestLanguageEnum AR = _$catalogsVerticalBatchRequestLanguageEnum_AR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AZ')
  static const CatalogsVerticalBatchRequestLanguageEnum AZ = _$catalogsVerticalBatchRequestLanguageEnum_AZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BG')
  static const CatalogsVerticalBatchRequestLanguageEnum BG = _$catalogsVerticalBatchRequestLanguageEnum_BG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BN')
  static const CatalogsVerticalBatchRequestLanguageEnum BN = _$catalogsVerticalBatchRequestLanguageEnum_BN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BS')
  static const CatalogsVerticalBatchRequestLanguageEnum BS = _$catalogsVerticalBatchRequestLanguageEnum_BS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CA')
  static const CatalogsVerticalBatchRequestLanguageEnum CA = _$catalogsVerticalBatchRequestLanguageEnum_CA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CS')
  static const CatalogsVerticalBatchRequestLanguageEnum CS = _$catalogsVerticalBatchRequestLanguageEnum_CS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DA')
  static const CatalogsVerticalBatchRequestLanguageEnum DA = _$catalogsVerticalBatchRequestLanguageEnum_DA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DV')
  static const CatalogsVerticalBatchRequestLanguageEnum DV = _$catalogsVerticalBatchRequestLanguageEnum_DV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DZ')
  static const CatalogsVerticalBatchRequestLanguageEnum DZ = _$catalogsVerticalBatchRequestLanguageEnum_DZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DE')
  static const CatalogsVerticalBatchRequestLanguageEnum DE = _$catalogsVerticalBatchRequestLanguageEnum_DE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EL')
  static const CatalogsVerticalBatchRequestLanguageEnum EL = _$catalogsVerticalBatchRequestLanguageEnum_EL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EN')
  static const CatalogsVerticalBatchRequestLanguageEnum EN = _$catalogsVerticalBatchRequestLanguageEnum_EN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ES')
  static const CatalogsVerticalBatchRequestLanguageEnum ES = _$catalogsVerticalBatchRequestLanguageEnum_ES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ET')
  static const CatalogsVerticalBatchRequestLanguageEnum ET = _$catalogsVerticalBatchRequestLanguageEnum_ET;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FA')
  static const CatalogsVerticalBatchRequestLanguageEnum FA = _$catalogsVerticalBatchRequestLanguageEnum_FA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FI')
  static const CatalogsVerticalBatchRequestLanguageEnum FI = _$catalogsVerticalBatchRequestLanguageEnum_FI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FR')
  static const CatalogsVerticalBatchRequestLanguageEnum FR = _$catalogsVerticalBatchRequestLanguageEnum_FR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HE')
  static const CatalogsVerticalBatchRequestLanguageEnum HE = _$catalogsVerticalBatchRequestLanguageEnum_HE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HI')
  static const CatalogsVerticalBatchRequestLanguageEnum HI = _$catalogsVerticalBatchRequestLanguageEnum_HI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HR')
  static const CatalogsVerticalBatchRequestLanguageEnum HR = _$catalogsVerticalBatchRequestLanguageEnum_HR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HU')
  static const CatalogsVerticalBatchRequestLanguageEnum HU = _$catalogsVerticalBatchRequestLanguageEnum_HU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HY')
  static const CatalogsVerticalBatchRequestLanguageEnum HY = _$catalogsVerticalBatchRequestLanguageEnum_HY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ID')
  static const CatalogsVerticalBatchRequestLanguageEnum ID = _$catalogsVerticalBatchRequestLanguageEnum_ID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IN')
  static const CatalogsVerticalBatchRequestLanguageEnum IN = _$catalogsVerticalBatchRequestLanguageEnum_IN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IS')
  static const CatalogsVerticalBatchRequestLanguageEnum IS = _$catalogsVerticalBatchRequestLanguageEnum_IS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IT')
  static const CatalogsVerticalBatchRequestLanguageEnum IT = _$catalogsVerticalBatchRequestLanguageEnum_IT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IW')
  static const CatalogsVerticalBatchRequestLanguageEnum IW = _$catalogsVerticalBatchRequestLanguageEnum_IW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'JA')
  static const CatalogsVerticalBatchRequestLanguageEnum JA = _$catalogsVerticalBatchRequestLanguageEnum_JA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KA')
  static const CatalogsVerticalBatchRequestLanguageEnum KA = _$catalogsVerticalBatchRequestLanguageEnum_KA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KM')
  static const CatalogsVerticalBatchRequestLanguageEnum KM = _$catalogsVerticalBatchRequestLanguageEnum_KM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KO')
  static const CatalogsVerticalBatchRequestLanguageEnum KO = _$catalogsVerticalBatchRequestLanguageEnum_KO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LO')
  static const CatalogsVerticalBatchRequestLanguageEnum LO = _$catalogsVerticalBatchRequestLanguageEnum_LO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LT')
  static const CatalogsVerticalBatchRequestLanguageEnum LT = _$catalogsVerticalBatchRequestLanguageEnum_LT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LV')
  static const CatalogsVerticalBatchRequestLanguageEnum LV = _$catalogsVerticalBatchRequestLanguageEnum_LV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MK')
  static const CatalogsVerticalBatchRequestLanguageEnum MK = _$catalogsVerticalBatchRequestLanguageEnum_MK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MN')
  static const CatalogsVerticalBatchRequestLanguageEnum MN = _$catalogsVerticalBatchRequestLanguageEnum_MN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MS')
  static const CatalogsVerticalBatchRequestLanguageEnum MS = _$catalogsVerticalBatchRequestLanguageEnum_MS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MY')
  static const CatalogsVerticalBatchRequestLanguageEnum MY = _$catalogsVerticalBatchRequestLanguageEnum_MY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NB')
  static const CatalogsVerticalBatchRequestLanguageEnum NB = _$catalogsVerticalBatchRequestLanguageEnum_NB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NE')
  static const CatalogsVerticalBatchRequestLanguageEnum NE = _$catalogsVerticalBatchRequestLanguageEnum_NE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NL')
  static const CatalogsVerticalBatchRequestLanguageEnum NL = _$catalogsVerticalBatchRequestLanguageEnum_NL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NO')
  static const CatalogsVerticalBatchRequestLanguageEnum NO = _$catalogsVerticalBatchRequestLanguageEnum_NO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PL')
  static const CatalogsVerticalBatchRequestLanguageEnum PL = _$catalogsVerticalBatchRequestLanguageEnum_PL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PT')
  static const CatalogsVerticalBatchRequestLanguageEnum PT = _$catalogsVerticalBatchRequestLanguageEnum_PT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RO')
  static const CatalogsVerticalBatchRequestLanguageEnum RO = _$catalogsVerticalBatchRequestLanguageEnum_RO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RU')
  static const CatalogsVerticalBatchRequestLanguageEnum RU = _$catalogsVerticalBatchRequestLanguageEnum_RU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SK')
  static const CatalogsVerticalBatchRequestLanguageEnum SK = _$catalogsVerticalBatchRequestLanguageEnum_SK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SL')
  static const CatalogsVerticalBatchRequestLanguageEnum SL = _$catalogsVerticalBatchRequestLanguageEnum_SL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SQ')
  static const CatalogsVerticalBatchRequestLanguageEnum SQ = _$catalogsVerticalBatchRequestLanguageEnum_SQ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SR')
  static const CatalogsVerticalBatchRequestLanguageEnum SR = _$catalogsVerticalBatchRequestLanguageEnum_SR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SV')
  static const CatalogsVerticalBatchRequestLanguageEnum SV = _$catalogsVerticalBatchRequestLanguageEnum_SV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TL')
  static const CatalogsVerticalBatchRequestLanguageEnum TL = _$catalogsVerticalBatchRequestLanguageEnum_TL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'UK')
  static const CatalogsVerticalBatchRequestLanguageEnum UK = _$catalogsVerticalBatchRequestLanguageEnum_UK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'VI')
  static const CatalogsVerticalBatchRequestLanguageEnum VI = _$catalogsVerticalBatchRequestLanguageEnum_VI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TE')
  static const CatalogsVerticalBatchRequestLanguageEnum TE = _$catalogsVerticalBatchRequestLanguageEnum_TE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TH')
  static const CatalogsVerticalBatchRequestLanguageEnum TH = _$catalogsVerticalBatchRequestLanguageEnum_TH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TR')
  static const CatalogsVerticalBatchRequestLanguageEnum TR = _$catalogsVerticalBatchRequestLanguageEnum_TR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'XX')
  static const CatalogsVerticalBatchRequestLanguageEnum XX = _$catalogsVerticalBatchRequestLanguageEnum_XX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ZH')
  static const CatalogsVerticalBatchRequestLanguageEnum ZH = _$catalogsVerticalBatchRequestLanguageEnum_ZH;

  static Serializer<CatalogsVerticalBatchRequestLanguageEnum> get serializer => _$catalogsVerticalBatchRequestLanguageEnumSerializer;

  const CatalogsVerticalBatchRequestLanguageEnum._(String name): super(name);

  static BuiltSet<CatalogsVerticalBatchRequestLanguageEnum> get values => _$catalogsVerticalBatchRequestLanguageEnumValues;
  static CatalogsVerticalBatchRequestLanguageEnum valueOf(String name) => _$catalogsVerticalBatchRequestLanguageEnumValueOf(name);
}

