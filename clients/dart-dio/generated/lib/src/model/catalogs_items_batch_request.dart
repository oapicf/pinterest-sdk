//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_delete_batch_record.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/catalogs_items_update_batch_request.dart';
import 'package:openapi/src/model/country.dart';
import 'package:openapi/src/model/catalogs_items_upsert_batch_request.dart';
import 'package:openapi/src/model/catalogs_items_delete_discontinued_batch_request.dart';
import 'package:openapi/src/model/catalogs_items_create_batch_request.dart';
import 'package:openapi/src/model/catalogs_items_delete_batch_request.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';
import 'package:one_of/one_of.dart';

part 'catalogs_items_batch_request.g.dart';

/// Request object of catalogs items batch
///
/// Properties:
/// * [country] 
/// * [items] - Array with catalogs items
/// * [language] - We recommend using the CatalogsLocale values.
/// * [operation] 
@BuiltValue()
abstract class CatalogsItemsBatchRequest implements Built<CatalogsItemsBatchRequest, CatalogsItemsBatchRequestBuilder> {
  /// One Of [CatalogsItemsCreateBatchRequest], [CatalogsItemsDeleteBatchRequest], [CatalogsItemsDeleteDiscontinuedBatchRequest], [CatalogsItemsUpdateBatchRequest], [CatalogsItemsUpsertBatchRequest]
  OneOf get oneOf;

  static const String discriminatorFieldName = r'operation';

  static const Map<String, Type> discriminatorMapping = {
    r'CREATE': CatalogsItemsCreateBatchRequest,
    r'DELETE': CatalogsItemsDeleteBatchRequest,
    r'DELETE_DISCONTINUED': CatalogsItemsDeleteDiscontinuedBatchRequest,
    r'UPDATE': CatalogsItemsUpdateBatchRequest,
    r'UPSERT': CatalogsItemsUpsertBatchRequest,
  };

  CatalogsItemsBatchRequest._();

  factory CatalogsItemsBatchRequest([void updates(CatalogsItemsBatchRequestBuilder b)]) = _$CatalogsItemsBatchRequest;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(CatalogsItemsBatchRequestBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<CatalogsItemsBatchRequest> get serializer => _$CatalogsItemsBatchRequestSerializer();
}

extension CatalogsItemsBatchRequestDiscriminatorExt on CatalogsItemsBatchRequest {
    String? get discriminatorValue {
        if (this is CatalogsItemsCreateBatchRequest) {
            return r'CREATE';
        }
        if (this is CatalogsItemsDeleteBatchRequest) {
            return r'DELETE';
        }
        if (this is CatalogsItemsDeleteDiscontinuedBatchRequest) {
            return r'DELETE_DISCONTINUED';
        }
        if (this is CatalogsItemsUpdateBatchRequest) {
            return r'UPDATE';
        }
        if (this is CatalogsItemsUpsertBatchRequest) {
            return r'UPSERT';
        }
        return null;
    }
}
extension CatalogsItemsBatchRequestBuilderDiscriminatorExt on CatalogsItemsBatchRequestBuilder {
    String? get discriminatorValue {
        if (this is CatalogsItemsCreateBatchRequestBuilder) {
            return r'CREATE';
        }
        if (this is CatalogsItemsDeleteBatchRequestBuilder) {
            return r'DELETE';
        }
        if (this is CatalogsItemsDeleteDiscontinuedBatchRequestBuilder) {
            return r'DELETE_DISCONTINUED';
        }
        if (this is CatalogsItemsUpdateBatchRequestBuilder) {
            return r'UPDATE';
        }
        if (this is CatalogsItemsUpsertBatchRequestBuilder) {
            return r'UPSERT';
        }
        return null;
    }
}

class _$CatalogsItemsBatchRequestSerializer implements PrimitiveSerializer<CatalogsItemsBatchRequest> {
  @override
  final Iterable<Type> types = const [CatalogsItemsBatchRequest, _$CatalogsItemsBatchRequest];

  @override
  final String wireName = r'CatalogsItemsBatchRequest';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    CatalogsItemsBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
  }

  @override
  Object serialize(
    Serializers serializers,
    CatalogsItemsBatchRequest object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final oneOf = object.oneOf;
    return serializers.serialize(oneOf.value, specifiedType: FullType(oneOf.valueType))!;
  }

  @override
  CatalogsItemsBatchRequest deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = CatalogsItemsBatchRequestBuilder();
    Object? oneOfDataSrc;
    final serializedList = (serialized as Iterable<Object?>).toList();
    final discIndex = serializedList.indexOf(CatalogsItemsBatchRequest.discriminatorFieldName) + 1;
    final discValue = serializers.deserialize(serializedList[discIndex], specifiedType: FullType(String)) as String;
    oneOfDataSrc = serialized;
    final oneOfTypes = [CatalogsItemsCreateBatchRequest, CatalogsItemsDeleteBatchRequest, CatalogsItemsDeleteDiscontinuedBatchRequest, CatalogsItemsUpdateBatchRequest, CatalogsItemsUpsertBatchRequest, ];
    Object oneOfResult;
    Type oneOfType;
    switch (discValue) {
      case r'CREATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsItemsCreateBatchRequest),
        ) as CatalogsItemsCreateBatchRequest;
        oneOfType = CatalogsItemsCreateBatchRequest;
        break;
      case r'DELETE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsItemsDeleteBatchRequest),
        ) as CatalogsItemsDeleteBatchRequest;
        oneOfType = CatalogsItemsDeleteBatchRequest;
        break;
      case r'DELETE_DISCONTINUED':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsItemsDeleteDiscontinuedBatchRequest),
        ) as CatalogsItemsDeleteDiscontinuedBatchRequest;
        oneOfType = CatalogsItemsDeleteDiscontinuedBatchRequest;
        break;
      case r'UPDATE':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsItemsUpdateBatchRequest),
        ) as CatalogsItemsUpdateBatchRequest;
        oneOfType = CatalogsItemsUpdateBatchRequest;
        break;
      case r'UPSERT':
        oneOfResult = serializers.deserialize(
          oneOfDataSrc,
          specifiedType: FullType(CatalogsItemsUpsertBatchRequest),
        ) as CatalogsItemsUpsertBatchRequest;
        oneOfType = CatalogsItemsUpsertBatchRequest;
        break;
      default:
        throw UnsupportedError("Couldn't deserialize oneOf for the discriminator value: ${discValue}");
    }
    result.oneOf = OneOfDynamic(typeIndex: oneOfTypes.indexOf(oneOfType), types: oneOfTypes, value: oneOfResult);
    return result.build();
  }
}

class CatalogsItemsBatchRequestLanguageEnum extends EnumClass {

  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'af-ZA')
  static const CatalogsItemsBatchRequestLanguageEnum afZA = _$catalogsItemsBatchRequestLanguageEnum_afZA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ar-SA')
  static const CatalogsItemsBatchRequestLanguageEnum arSA = _$catalogsItemsBatchRequestLanguageEnum_arSA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bg-BG')
  static const CatalogsItemsBatchRequestLanguageEnum bgBG = _$catalogsItemsBatchRequestLanguageEnum_bgBG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'bn-IN')
  static const CatalogsItemsBatchRequestLanguageEnum bnIN = _$catalogsItemsBatchRequestLanguageEnum_bnIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'cs-CZ')
  static const CatalogsItemsBatchRequestLanguageEnum csCZ = _$catalogsItemsBatchRequestLanguageEnum_csCZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'da-DK')
  static const CatalogsItemsBatchRequestLanguageEnum daDK = _$catalogsItemsBatchRequestLanguageEnum_daDK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'de')
  static const CatalogsItemsBatchRequestLanguageEnum de = _$catalogsItemsBatchRequestLanguageEnum_de;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'el-GR')
  static const CatalogsItemsBatchRequestLanguageEnum elGR = _$catalogsItemsBatchRequestLanguageEnum_elGR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-AU')
  static const CatalogsItemsBatchRequestLanguageEnum enAU = _$catalogsItemsBatchRequestLanguageEnum_enAU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-CA')
  static const CatalogsItemsBatchRequestLanguageEnum enCA = _$catalogsItemsBatchRequestLanguageEnum_enCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-GB')
  static const CatalogsItemsBatchRequestLanguageEnum enGB = _$catalogsItemsBatchRequestLanguageEnum_enGB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-IN')
  static const CatalogsItemsBatchRequestLanguageEnum enIN = _$catalogsItemsBatchRequestLanguageEnum_enIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'en-US')
  static const CatalogsItemsBatchRequestLanguageEnum enUS = _$catalogsItemsBatchRequestLanguageEnum_enUS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-419')
  static const CatalogsItemsBatchRequestLanguageEnum es419 = _$catalogsItemsBatchRequestLanguageEnum_es419;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-AR')
  static const CatalogsItemsBatchRequestLanguageEnum esAR = _$catalogsItemsBatchRequestLanguageEnum_esAR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-ES')
  static const CatalogsItemsBatchRequestLanguageEnum esES = _$catalogsItemsBatchRequestLanguageEnum_esES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'es-MX')
  static const CatalogsItemsBatchRequestLanguageEnum esMX = _$catalogsItemsBatchRequestLanguageEnum_esMX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fi-FI')
  static const CatalogsItemsBatchRequestLanguageEnum fiFI = _$catalogsItemsBatchRequestLanguageEnum_fiFI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr')
  static const CatalogsItemsBatchRequestLanguageEnum fr = _$catalogsItemsBatchRequestLanguageEnum_fr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'fr-CA')
  static const CatalogsItemsBatchRequestLanguageEnum frCA = _$catalogsItemsBatchRequestLanguageEnum_frCA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'he-IL')
  static const CatalogsItemsBatchRequestLanguageEnum heIL = _$catalogsItemsBatchRequestLanguageEnum_heIL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hi-IN')
  static const CatalogsItemsBatchRequestLanguageEnum hiIN = _$catalogsItemsBatchRequestLanguageEnum_hiIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hr-HR')
  static const CatalogsItemsBatchRequestLanguageEnum hrHR = _$catalogsItemsBatchRequestLanguageEnum_hrHR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'hu-HU')
  static const CatalogsItemsBatchRequestLanguageEnum huHU = _$catalogsItemsBatchRequestLanguageEnum_huHU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'id-ID')
  static const CatalogsItemsBatchRequestLanguageEnum idID = _$catalogsItemsBatchRequestLanguageEnum_idID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'it')
  static const CatalogsItemsBatchRequestLanguageEnum it = _$catalogsItemsBatchRequestLanguageEnum_it;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ja')
  static const CatalogsItemsBatchRequestLanguageEnum ja = _$catalogsItemsBatchRequestLanguageEnum_ja;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ko-KR')
  static const CatalogsItemsBatchRequestLanguageEnum koKR = _$catalogsItemsBatchRequestLanguageEnum_koKR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ms-MY')
  static const CatalogsItemsBatchRequestLanguageEnum msMY = _$catalogsItemsBatchRequestLanguageEnum_msMY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nb-NO')
  static const CatalogsItemsBatchRequestLanguageEnum nbNO = _$catalogsItemsBatchRequestLanguageEnum_nbNO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'nl')
  static const CatalogsItemsBatchRequestLanguageEnum nl = _$catalogsItemsBatchRequestLanguageEnum_nl;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pl-PL')
  static const CatalogsItemsBatchRequestLanguageEnum plPL = _$catalogsItemsBatchRequestLanguageEnum_plPL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-BR')
  static const CatalogsItemsBatchRequestLanguageEnum ptBR = _$catalogsItemsBatchRequestLanguageEnum_ptBR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'pt-PT')
  static const CatalogsItemsBatchRequestLanguageEnum ptPT = _$catalogsItemsBatchRequestLanguageEnum_ptPT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ro-RO')
  static const CatalogsItemsBatchRequestLanguageEnum roRO = _$catalogsItemsBatchRequestLanguageEnum_roRO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ru-RU')
  static const CatalogsItemsBatchRequestLanguageEnum ruRU = _$catalogsItemsBatchRequestLanguageEnum_ruRU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sk-SK')
  static const CatalogsItemsBatchRequestLanguageEnum skSK = _$catalogsItemsBatchRequestLanguageEnum_skSK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'sv-SE')
  static const CatalogsItemsBatchRequestLanguageEnum svSE = _$catalogsItemsBatchRequestLanguageEnum_svSE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'te-IN')
  static const CatalogsItemsBatchRequestLanguageEnum teIN = _$catalogsItemsBatchRequestLanguageEnum_teIN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'th-TH')
  static const CatalogsItemsBatchRequestLanguageEnum thTH = _$catalogsItemsBatchRequestLanguageEnum_thTH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tl-PH')
  static const CatalogsItemsBatchRequestLanguageEnum tlPH = _$catalogsItemsBatchRequestLanguageEnum_tlPH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'tr')
  static const CatalogsItemsBatchRequestLanguageEnum tr = _$catalogsItemsBatchRequestLanguageEnum_tr;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'uk-UA')
  static const CatalogsItemsBatchRequestLanguageEnum ukUA = _$catalogsItemsBatchRequestLanguageEnum_ukUA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'vi-VN')
  static const CatalogsItemsBatchRequestLanguageEnum viVN = _$catalogsItemsBatchRequestLanguageEnum_viVN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-CN')
  static const CatalogsItemsBatchRequestLanguageEnum zhCN = _$catalogsItemsBatchRequestLanguageEnum_zhCN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'zh-TW')
  static const CatalogsItemsBatchRequestLanguageEnum zhTW = _$catalogsItemsBatchRequestLanguageEnum_zhTW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AM')
  static const CatalogsItemsBatchRequestLanguageEnum AM = _$catalogsItemsBatchRequestLanguageEnum_AM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AR')
  static const CatalogsItemsBatchRequestLanguageEnum AR = _$catalogsItemsBatchRequestLanguageEnum_AR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'AZ')
  static const CatalogsItemsBatchRequestLanguageEnum AZ = _$catalogsItemsBatchRequestLanguageEnum_AZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BG')
  static const CatalogsItemsBatchRequestLanguageEnum BG = _$catalogsItemsBatchRequestLanguageEnum_BG;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BN')
  static const CatalogsItemsBatchRequestLanguageEnum BN = _$catalogsItemsBatchRequestLanguageEnum_BN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'BS')
  static const CatalogsItemsBatchRequestLanguageEnum BS = _$catalogsItemsBatchRequestLanguageEnum_BS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CA')
  static const CatalogsItemsBatchRequestLanguageEnum CA = _$catalogsItemsBatchRequestLanguageEnum_CA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'CS')
  static const CatalogsItemsBatchRequestLanguageEnum CS = _$catalogsItemsBatchRequestLanguageEnum_CS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DA')
  static const CatalogsItemsBatchRequestLanguageEnum DA = _$catalogsItemsBatchRequestLanguageEnum_DA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DV')
  static const CatalogsItemsBatchRequestLanguageEnum DV = _$catalogsItemsBatchRequestLanguageEnum_DV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DZ')
  static const CatalogsItemsBatchRequestLanguageEnum DZ = _$catalogsItemsBatchRequestLanguageEnum_DZ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'DE')
  static const CatalogsItemsBatchRequestLanguageEnum DE = _$catalogsItemsBatchRequestLanguageEnum_DE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EL')
  static const CatalogsItemsBatchRequestLanguageEnum EL = _$catalogsItemsBatchRequestLanguageEnum_EL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'EN')
  static const CatalogsItemsBatchRequestLanguageEnum EN = _$catalogsItemsBatchRequestLanguageEnum_EN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ES')
  static const CatalogsItemsBatchRequestLanguageEnum ES = _$catalogsItemsBatchRequestLanguageEnum_ES;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ET')
  static const CatalogsItemsBatchRequestLanguageEnum ET = _$catalogsItemsBatchRequestLanguageEnum_ET;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FA')
  static const CatalogsItemsBatchRequestLanguageEnum FA = _$catalogsItemsBatchRequestLanguageEnum_FA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FI')
  static const CatalogsItemsBatchRequestLanguageEnum FI = _$catalogsItemsBatchRequestLanguageEnum_FI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'FR')
  static const CatalogsItemsBatchRequestLanguageEnum FR = _$catalogsItemsBatchRequestLanguageEnum_FR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HE')
  static const CatalogsItemsBatchRequestLanguageEnum HE = _$catalogsItemsBatchRequestLanguageEnum_HE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HI')
  static const CatalogsItemsBatchRequestLanguageEnum HI = _$catalogsItemsBatchRequestLanguageEnum_HI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HR')
  static const CatalogsItemsBatchRequestLanguageEnum HR = _$catalogsItemsBatchRequestLanguageEnum_HR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HU')
  static const CatalogsItemsBatchRequestLanguageEnum HU = _$catalogsItemsBatchRequestLanguageEnum_HU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'HY')
  static const CatalogsItemsBatchRequestLanguageEnum HY = _$catalogsItemsBatchRequestLanguageEnum_HY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ID')
  static const CatalogsItemsBatchRequestLanguageEnum ID = _$catalogsItemsBatchRequestLanguageEnum_ID;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IN')
  static const CatalogsItemsBatchRequestLanguageEnum IN = _$catalogsItemsBatchRequestLanguageEnum_IN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IS')
  static const CatalogsItemsBatchRequestLanguageEnum IS = _$catalogsItemsBatchRequestLanguageEnum_IS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IT')
  static const CatalogsItemsBatchRequestLanguageEnum IT = _$catalogsItemsBatchRequestLanguageEnum_IT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'IW')
  static const CatalogsItemsBatchRequestLanguageEnum IW = _$catalogsItemsBatchRequestLanguageEnum_IW;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'JA')
  static const CatalogsItemsBatchRequestLanguageEnum JA = _$catalogsItemsBatchRequestLanguageEnum_JA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KA')
  static const CatalogsItemsBatchRequestLanguageEnum KA = _$catalogsItemsBatchRequestLanguageEnum_KA;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KM')
  static const CatalogsItemsBatchRequestLanguageEnum KM = _$catalogsItemsBatchRequestLanguageEnum_KM;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'KO')
  static const CatalogsItemsBatchRequestLanguageEnum KO = _$catalogsItemsBatchRequestLanguageEnum_KO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LO')
  static const CatalogsItemsBatchRequestLanguageEnum LO = _$catalogsItemsBatchRequestLanguageEnum_LO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LT')
  static const CatalogsItemsBatchRequestLanguageEnum LT = _$catalogsItemsBatchRequestLanguageEnum_LT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'LV')
  static const CatalogsItemsBatchRequestLanguageEnum LV = _$catalogsItemsBatchRequestLanguageEnum_LV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MK')
  static const CatalogsItemsBatchRequestLanguageEnum MK = _$catalogsItemsBatchRequestLanguageEnum_MK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MN')
  static const CatalogsItemsBatchRequestLanguageEnum MN = _$catalogsItemsBatchRequestLanguageEnum_MN;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MS')
  static const CatalogsItemsBatchRequestLanguageEnum MS = _$catalogsItemsBatchRequestLanguageEnum_MS;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'MY')
  static const CatalogsItemsBatchRequestLanguageEnum MY = _$catalogsItemsBatchRequestLanguageEnum_MY;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NB')
  static const CatalogsItemsBatchRequestLanguageEnum NB = _$catalogsItemsBatchRequestLanguageEnum_NB;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NE')
  static const CatalogsItemsBatchRequestLanguageEnum NE = _$catalogsItemsBatchRequestLanguageEnum_NE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'NL')
  static const CatalogsItemsBatchRequestLanguageEnum NL = _$catalogsItemsBatchRequestLanguageEnum_NL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'false')
  static const CatalogsItemsBatchRequestLanguageEnum false_ = _$catalogsItemsBatchRequestLanguageEnum_false_;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PL')
  static const CatalogsItemsBatchRequestLanguageEnum PL = _$catalogsItemsBatchRequestLanguageEnum_PL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'PT')
  static const CatalogsItemsBatchRequestLanguageEnum PT = _$catalogsItemsBatchRequestLanguageEnum_PT;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RO')
  static const CatalogsItemsBatchRequestLanguageEnum RO = _$catalogsItemsBatchRequestLanguageEnum_RO;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'RU')
  static const CatalogsItemsBatchRequestLanguageEnum RU = _$catalogsItemsBatchRequestLanguageEnum_RU;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SK')
  static const CatalogsItemsBatchRequestLanguageEnum SK = _$catalogsItemsBatchRequestLanguageEnum_SK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SL')
  static const CatalogsItemsBatchRequestLanguageEnum SL = _$catalogsItemsBatchRequestLanguageEnum_SL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SQ')
  static const CatalogsItemsBatchRequestLanguageEnum SQ = _$catalogsItemsBatchRequestLanguageEnum_SQ;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SR')
  static const CatalogsItemsBatchRequestLanguageEnum SR = _$catalogsItemsBatchRequestLanguageEnum_SR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'SV')
  static const CatalogsItemsBatchRequestLanguageEnum SV = _$catalogsItemsBatchRequestLanguageEnum_SV;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TL')
  static const CatalogsItemsBatchRequestLanguageEnum TL = _$catalogsItemsBatchRequestLanguageEnum_TL;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'UK')
  static const CatalogsItemsBatchRequestLanguageEnum UK = _$catalogsItemsBatchRequestLanguageEnum_UK;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'VI')
  static const CatalogsItemsBatchRequestLanguageEnum VI = _$catalogsItemsBatchRequestLanguageEnum_VI;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TE')
  static const CatalogsItemsBatchRequestLanguageEnum TE = _$catalogsItemsBatchRequestLanguageEnum_TE;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TH')
  static const CatalogsItemsBatchRequestLanguageEnum TH = _$catalogsItemsBatchRequestLanguageEnum_TH;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'TR')
  static const CatalogsItemsBatchRequestLanguageEnum TR = _$catalogsItemsBatchRequestLanguageEnum_TR;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'XX')
  static const CatalogsItemsBatchRequestLanguageEnum XX = _$catalogsItemsBatchRequestLanguageEnum_XX;
  /// We recommend using the CatalogsLocale values.
  @BuiltValueEnumConst(wireName: r'ZH')
  static const CatalogsItemsBatchRequestLanguageEnum ZH = _$catalogsItemsBatchRequestLanguageEnum_ZH;

  static Serializer<CatalogsItemsBatchRequestLanguageEnum> get serializer => _$catalogsItemsBatchRequestLanguageEnumSerializer;

  const CatalogsItemsBatchRequestLanguageEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsBatchRequestLanguageEnum> get values => _$catalogsItemsBatchRequestLanguageEnumValues;
  static CatalogsItemsBatchRequestLanguageEnum valueOf(String name) => _$catalogsItemsBatchRequestLanguageEnumValueOf(name);
}

class CatalogsItemsBatchRequestOperationEnum extends EnumClass {

  @BuiltValueEnumConst(wireName: r'DELETE')
  static const CatalogsItemsBatchRequestOperationEnum DELETE = _$catalogsItemsBatchRequestOperationEnum_DELETE;

  static Serializer<CatalogsItemsBatchRequestOperationEnum> get serializer => _$catalogsItemsBatchRequestOperationEnumSerializer;

  const CatalogsItemsBatchRequestOperationEnum._(String name): super(name);

  static BuiltSet<CatalogsItemsBatchRequestOperationEnum> get values => _$catalogsItemsBatchRequestOperationEnumValues;
  static CatalogsItemsBatchRequestOperationEnum valueOf(String name) => _$catalogsItemsBatchRequestOperationEnumValueOf(name);
}

