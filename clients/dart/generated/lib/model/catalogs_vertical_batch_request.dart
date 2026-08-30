//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsVerticalBatchRequest {
  /// Returns a new [CatalogsVerticalBatchRequest] instance.
  CatalogsVerticalBatchRequest({
    this.catalogId,
    required this.catalogType,
    required this.country,
    this.items = const [],
    required this.language,
  });

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  CatalogsVerticalBatchRequestCatalogTypeEnum catalogType;

  Country country;

  /// Array with creative assets item operations
  List<CatalogsCreativeAssetsBatchItem> items;

  /// We recommend using the CatalogsLocale values.
  CatalogsVerticalBatchRequestLanguageEnum language;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsVerticalBatchRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode);

  @override
  String toString() => 'CatalogsVerticalBatchRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, items=$items, language=$language]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.catalogId != null) {
      json[r'catalog_id'] = this.catalogId;
    } else {
      json[r'catalog_id'] = null;
    }
      json[r'catalog_type'] = this.catalogType;
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
    return json;
  }

  /// Returns a new [CatalogsVerticalBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsVerticalBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsVerticalBatchRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsVerticalBatchRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "CatalogsVerticalBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsVerticalBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsVerticalBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsVerticalBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsVerticalBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsVerticalBatchRequest[language]" has a null value in JSON.');
        return true;
      }());

      return CatalogsVerticalBatchRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsVerticalBatchRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        items: CatalogsCreativeAssetsBatchItem.listFromJson(json[r'items']),
        language: CatalogsVerticalBatchRequestLanguageEnum.fromJson(json[r'language'])!,
      );
    }
    return null;
  }

  static List<CatalogsVerticalBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsVerticalBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsVerticalBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsVerticalBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsVerticalBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsVerticalBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsVerticalBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsVerticalBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'catalog_type',
    'country',
    'items',
    'language',
  };
}


enum CatalogsVerticalBatchRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsVerticalBatchRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsVerticalBatchRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsVerticalBatchRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsVerticalBatchRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsVerticalBatchRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalBatchRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalBatchRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalBatchRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalBatchRequestCatalogTypeEnum].
class CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsVerticalBatchRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsVerticalBatchRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalBatchRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsVerticalBatchRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsVerticalBatchRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer? _instance;
}


/// We recommend using the CatalogsLocale values.
enum CatalogsVerticalBatchRequestLanguageEnum {
  afZA._(r'af-ZA'),
  arSA._(r'ar-SA'),
  bgBG._(r'bg-BG'),
  bnIN._(r'bn-IN'),
  csCZ._(r'cs-CZ'),
  daDK._(r'da-DK'),
  de._(r'de'),
  elGR._(r'el-GR'),
  enAU._(r'en-AU'),
  enCA._(r'en-CA'),
  enGB._(r'en-GB'),
  enIN._(r'en-IN'),
  enUS._(r'en-US'),
  es419._(r'es-419'),
  esAR._(r'es-AR'),
  esES._(r'es-ES'),
  esMX._(r'es-MX'),
  fiFI._(r'fi-FI'),
  fr._(r'fr'),
  frCA._(r'fr-CA'),
  heIL._(r'he-IL'),
  hiIN._(r'hi-IN'),
  hrHR._(r'hr-HR'),
  huHU._(r'hu-HU'),
  idID._(r'id-ID'),
  it._(r'it'),
  ja._(r'ja'),
  koKR._(r'ko-KR'),
  msMY._(r'ms-MY'),
  nbNO._(r'nb-NO'),
  nl._(r'nl'),
  plPL._(r'pl-PL'),
  ptBR._(r'pt-BR'),
  ptPT._(r'pt-PT'),
  roRO._(r'ro-RO'),
  ruRU._(r'ru-RU'),
  skSK._(r'sk-SK'),
  svSE._(r'sv-SE'),
  teIN._(r'te-IN'),
  thTH._(r'th-TH'),
  tlPH._(r'tl-PH'),
  tr._(r'tr'),
  ukUA._(r'uk-UA'),
  viVN._(r'vi-VN'),
  zhCN._(r'zh-CN'),
  zhTW._(r'zh-TW'),
  AM._(r'AM'),
  AR._(r'AR'),
  AZ._(r'AZ'),
  BG._(r'BG'),
  BN._(r'BN'),
  BS._(r'BS'),
  CA._(r'CA'),
  CS._(r'CS'),
  DA._(r'DA'),
  DV._(r'DV'),
  DZ._(r'DZ'),
  DE._(r'DE'),
  EL._(r'EL'),
  EN._(r'EN'),
  ES._(r'ES'),
  ET._(r'ET'),
  FA._(r'FA'),
  FI._(r'FI'),
  FR._(r'FR'),
  HE._(r'HE'),
  HI._(r'HI'),
  HR._(r'HR'),
  HU._(r'HU'),
  HY._(r'HY'),
  ID._(r'ID'),
  IN._(r'IN'),
  IS._(r'IS'),
  IT._(r'IT'),
  IW._(r'IW'),
  JA._(r'JA'),
  KA._(r'KA'),
  KM._(r'KM'),
  KO._(r'KO'),
  LO._(r'LO'),
  LT._(r'LT'),
  LV._(r'LV'),
  MK._(r'MK'),
  MN._(r'MN'),
  MS._(r'MS'),
  MY._(r'MY'),
  NB._(r'NB'),
  NE._(r'NE'),
  NL._(r'NL'),
  false_._(r'false'),
  PL._(r'PL'),
  PT._(r'PT'),
  RO._(r'RO'),
  RU._(r'RU'),
  SK._(r'SK'),
  SL._(r'SL'),
  SQ._(r'SQ'),
  SR._(r'SR'),
  SV._(r'SV'),
  TL._(r'TL'),
  UK._(r'UK'),
  VI._(r'VI'),
  TE._(r'TE'),
  TH._(r'TH'),
  TR._(r'TR'),
  XX._(r'XX'),
  ZH._(r'ZH'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsVerticalBatchRequestLanguageEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsVerticalBatchRequestLanguageEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsVerticalBatchRequestLanguageEnum? fromJson(dynamic value) => CatalogsVerticalBatchRequestLanguageEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsVerticalBatchRequestLanguageEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsVerticalBatchRequestLanguageEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsVerticalBatchRequestLanguageEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsVerticalBatchRequestLanguageEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsVerticalBatchRequestLanguageEnum] to String,
/// and [decode] dynamic data back to [CatalogsVerticalBatchRequestLanguageEnum].
class CatalogsVerticalBatchRequestLanguageEnumTypeTransformer {
  factory CatalogsVerticalBatchRequestLanguageEnumTypeTransformer() => _instance ??= const CatalogsVerticalBatchRequestLanguageEnumTypeTransformer._();

  const CatalogsVerticalBatchRequestLanguageEnumTypeTransformer._();

  String encode(CatalogsVerticalBatchRequestLanguageEnum data) => data._value;

  /// Returns the instance of [CatalogsVerticalBatchRequestLanguageEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalBatchRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsVerticalBatchRequestLanguageEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'af-ZA': return CatalogsVerticalBatchRequestLanguageEnum.afZA;
        case r'ar-SA': return CatalogsVerticalBatchRequestLanguageEnum.arSA;
        case r'bg-BG': return CatalogsVerticalBatchRequestLanguageEnum.bgBG;
        case r'bn-IN': return CatalogsVerticalBatchRequestLanguageEnum.bnIN;
        case r'cs-CZ': return CatalogsVerticalBatchRequestLanguageEnum.csCZ;
        case r'da-DK': return CatalogsVerticalBatchRequestLanguageEnum.daDK;
        case r'de': return CatalogsVerticalBatchRequestLanguageEnum.de;
        case r'el-GR': return CatalogsVerticalBatchRequestLanguageEnum.elGR;
        case r'en-AU': return CatalogsVerticalBatchRequestLanguageEnum.enAU;
        case r'en-CA': return CatalogsVerticalBatchRequestLanguageEnum.enCA;
        case r'en-GB': return CatalogsVerticalBatchRequestLanguageEnum.enGB;
        case r'en-IN': return CatalogsVerticalBatchRequestLanguageEnum.enIN;
        case r'en-US': return CatalogsVerticalBatchRequestLanguageEnum.enUS;
        case r'es-419': return CatalogsVerticalBatchRequestLanguageEnum.es419;
        case r'es-AR': return CatalogsVerticalBatchRequestLanguageEnum.esAR;
        case r'es-ES': return CatalogsVerticalBatchRequestLanguageEnum.esES;
        case r'es-MX': return CatalogsVerticalBatchRequestLanguageEnum.esMX;
        case r'fi-FI': return CatalogsVerticalBatchRequestLanguageEnum.fiFI;
        case r'fr': return CatalogsVerticalBatchRequestLanguageEnum.fr;
        case r'fr-CA': return CatalogsVerticalBatchRequestLanguageEnum.frCA;
        case r'he-IL': return CatalogsVerticalBatchRequestLanguageEnum.heIL;
        case r'hi-IN': return CatalogsVerticalBatchRequestLanguageEnum.hiIN;
        case r'hr-HR': return CatalogsVerticalBatchRequestLanguageEnum.hrHR;
        case r'hu-HU': return CatalogsVerticalBatchRequestLanguageEnum.huHU;
        case r'id-ID': return CatalogsVerticalBatchRequestLanguageEnum.idID;
        case r'it': return CatalogsVerticalBatchRequestLanguageEnum.it;
        case r'ja': return CatalogsVerticalBatchRequestLanguageEnum.ja;
        case r'ko-KR': return CatalogsVerticalBatchRequestLanguageEnum.koKR;
        case r'ms-MY': return CatalogsVerticalBatchRequestLanguageEnum.msMY;
        case r'nb-NO': return CatalogsVerticalBatchRequestLanguageEnum.nbNO;
        case r'nl': return CatalogsVerticalBatchRequestLanguageEnum.nl;
        case r'pl-PL': return CatalogsVerticalBatchRequestLanguageEnum.plPL;
        case r'pt-BR': return CatalogsVerticalBatchRequestLanguageEnum.ptBR;
        case r'pt-PT': return CatalogsVerticalBatchRequestLanguageEnum.ptPT;
        case r'ro-RO': return CatalogsVerticalBatchRequestLanguageEnum.roRO;
        case r'ru-RU': return CatalogsVerticalBatchRequestLanguageEnum.ruRU;
        case r'sk-SK': return CatalogsVerticalBatchRequestLanguageEnum.skSK;
        case r'sv-SE': return CatalogsVerticalBatchRequestLanguageEnum.svSE;
        case r'te-IN': return CatalogsVerticalBatchRequestLanguageEnum.teIN;
        case r'th-TH': return CatalogsVerticalBatchRequestLanguageEnum.thTH;
        case r'tl-PH': return CatalogsVerticalBatchRequestLanguageEnum.tlPH;
        case r'tr': return CatalogsVerticalBatchRequestLanguageEnum.tr;
        case r'uk-UA': return CatalogsVerticalBatchRequestLanguageEnum.ukUA;
        case r'vi-VN': return CatalogsVerticalBatchRequestLanguageEnum.viVN;
        case r'zh-CN': return CatalogsVerticalBatchRequestLanguageEnum.zhCN;
        case r'zh-TW': return CatalogsVerticalBatchRequestLanguageEnum.zhTW;
        case r'AM': return CatalogsVerticalBatchRequestLanguageEnum.AM;
        case r'AR': return CatalogsVerticalBatchRequestLanguageEnum.AR;
        case r'AZ': return CatalogsVerticalBatchRequestLanguageEnum.AZ;
        case r'BG': return CatalogsVerticalBatchRequestLanguageEnum.BG;
        case r'BN': return CatalogsVerticalBatchRequestLanguageEnum.BN;
        case r'BS': return CatalogsVerticalBatchRequestLanguageEnum.BS;
        case r'CA': return CatalogsVerticalBatchRequestLanguageEnum.CA;
        case r'CS': return CatalogsVerticalBatchRequestLanguageEnum.CS;
        case r'DA': return CatalogsVerticalBatchRequestLanguageEnum.DA;
        case r'DV': return CatalogsVerticalBatchRequestLanguageEnum.DV;
        case r'DZ': return CatalogsVerticalBatchRequestLanguageEnum.DZ;
        case r'DE': return CatalogsVerticalBatchRequestLanguageEnum.DE;
        case r'EL': return CatalogsVerticalBatchRequestLanguageEnum.EL;
        case r'EN': return CatalogsVerticalBatchRequestLanguageEnum.EN;
        case r'ES': return CatalogsVerticalBatchRequestLanguageEnum.ES;
        case r'ET': return CatalogsVerticalBatchRequestLanguageEnum.ET;
        case r'FA': return CatalogsVerticalBatchRequestLanguageEnum.FA;
        case r'FI': return CatalogsVerticalBatchRequestLanguageEnum.FI;
        case r'FR': return CatalogsVerticalBatchRequestLanguageEnum.FR;
        case r'HE': return CatalogsVerticalBatchRequestLanguageEnum.HE;
        case r'HI': return CatalogsVerticalBatchRequestLanguageEnum.HI;
        case r'HR': return CatalogsVerticalBatchRequestLanguageEnum.HR;
        case r'HU': return CatalogsVerticalBatchRequestLanguageEnum.HU;
        case r'HY': return CatalogsVerticalBatchRequestLanguageEnum.HY;
        case r'ID': return CatalogsVerticalBatchRequestLanguageEnum.ID;
        case r'IN': return CatalogsVerticalBatchRequestLanguageEnum.IN;
        case r'IS': return CatalogsVerticalBatchRequestLanguageEnum.IS;
        case r'IT': return CatalogsVerticalBatchRequestLanguageEnum.IT;
        case r'IW': return CatalogsVerticalBatchRequestLanguageEnum.IW;
        case r'JA': return CatalogsVerticalBatchRequestLanguageEnum.JA;
        case r'KA': return CatalogsVerticalBatchRequestLanguageEnum.KA;
        case r'KM': return CatalogsVerticalBatchRequestLanguageEnum.KM;
        case r'KO': return CatalogsVerticalBatchRequestLanguageEnum.KO;
        case r'LO': return CatalogsVerticalBatchRequestLanguageEnum.LO;
        case r'LT': return CatalogsVerticalBatchRequestLanguageEnum.LT;
        case r'LV': return CatalogsVerticalBatchRequestLanguageEnum.LV;
        case r'MK': return CatalogsVerticalBatchRequestLanguageEnum.MK;
        case r'MN': return CatalogsVerticalBatchRequestLanguageEnum.MN;
        case r'MS': return CatalogsVerticalBatchRequestLanguageEnum.MS;
        case r'MY': return CatalogsVerticalBatchRequestLanguageEnum.MY;
        case r'NB': return CatalogsVerticalBatchRequestLanguageEnum.NB;
        case r'NE': return CatalogsVerticalBatchRequestLanguageEnum.NE;
        case r'NL': return CatalogsVerticalBatchRequestLanguageEnum.NL;
        case r'false': return CatalogsVerticalBatchRequestLanguageEnum.false_;
        case r'PL': return CatalogsVerticalBatchRequestLanguageEnum.PL;
        case r'PT': return CatalogsVerticalBatchRequestLanguageEnum.PT;
        case r'RO': return CatalogsVerticalBatchRequestLanguageEnum.RO;
        case r'RU': return CatalogsVerticalBatchRequestLanguageEnum.RU;
        case r'SK': return CatalogsVerticalBatchRequestLanguageEnum.SK;
        case r'SL': return CatalogsVerticalBatchRequestLanguageEnum.SL;
        case r'SQ': return CatalogsVerticalBatchRequestLanguageEnum.SQ;
        case r'SR': return CatalogsVerticalBatchRequestLanguageEnum.SR;
        case r'SV': return CatalogsVerticalBatchRequestLanguageEnum.SV;
        case r'TL': return CatalogsVerticalBatchRequestLanguageEnum.TL;
        case r'UK': return CatalogsVerticalBatchRequestLanguageEnum.UK;
        case r'VI': return CatalogsVerticalBatchRequestLanguageEnum.VI;
        case r'TE': return CatalogsVerticalBatchRequestLanguageEnum.TE;
        case r'TH': return CatalogsVerticalBatchRequestLanguageEnum.TH;
        case r'TR': return CatalogsVerticalBatchRequestLanguageEnum.TR;
        case r'XX': return CatalogsVerticalBatchRequestLanguageEnum.XX;
        case r'ZH': return CatalogsVerticalBatchRequestLanguageEnum.ZH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsVerticalBatchRequestLanguageEnumTypeTransformer? _instance;
}


