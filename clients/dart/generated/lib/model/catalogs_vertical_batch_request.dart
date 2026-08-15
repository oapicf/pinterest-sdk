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
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsVerticalBatchRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsVerticalBatchRequest[$key]" has a null value in JSON.');
        });
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


class CatalogsVerticalBatchRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsVerticalBatchRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = CatalogsVerticalBatchRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][CatalogsVerticalBatchRequestCatalogTypeEnum].
  static const values = <CatalogsVerticalBatchRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static CatalogsVerticalBatchRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer().decode(value);

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

  String encode(CatalogsVerticalBatchRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsVerticalBatchRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalBatchRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer] instance.
  static CatalogsVerticalBatchRequestCatalogTypeEnumTypeTransformer? _instance;
}


/// We recommend using the CatalogsLocale values.
class CatalogsVerticalBatchRequestLanguageEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsVerticalBatchRequestLanguageEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const afZA = CatalogsVerticalBatchRequestLanguageEnum._(r'af-ZA');
  static const arSA = CatalogsVerticalBatchRequestLanguageEnum._(r'ar-SA');
  static const bgBG = CatalogsVerticalBatchRequestLanguageEnum._(r'bg-BG');
  static const bnIN = CatalogsVerticalBatchRequestLanguageEnum._(r'bn-IN');
  static const csCZ = CatalogsVerticalBatchRequestLanguageEnum._(r'cs-CZ');
  static const daDK = CatalogsVerticalBatchRequestLanguageEnum._(r'da-DK');
  static const de = CatalogsVerticalBatchRequestLanguageEnum._(r'de');
  static const elGR = CatalogsVerticalBatchRequestLanguageEnum._(r'el-GR');
  static const enAU = CatalogsVerticalBatchRequestLanguageEnum._(r'en-AU');
  static const enCA = CatalogsVerticalBatchRequestLanguageEnum._(r'en-CA');
  static const enGB = CatalogsVerticalBatchRequestLanguageEnum._(r'en-GB');
  static const enIN = CatalogsVerticalBatchRequestLanguageEnum._(r'en-IN');
  static const enUS = CatalogsVerticalBatchRequestLanguageEnum._(r'en-US');
  static const es419 = CatalogsVerticalBatchRequestLanguageEnum._(r'es-419');
  static const esAR = CatalogsVerticalBatchRequestLanguageEnum._(r'es-AR');
  static const esES = CatalogsVerticalBatchRequestLanguageEnum._(r'es-ES');
  static const esMX = CatalogsVerticalBatchRequestLanguageEnum._(r'es-MX');
  static const fiFI = CatalogsVerticalBatchRequestLanguageEnum._(r'fi-FI');
  static const fr = CatalogsVerticalBatchRequestLanguageEnum._(r'fr');
  static const frCA = CatalogsVerticalBatchRequestLanguageEnum._(r'fr-CA');
  static const heIL = CatalogsVerticalBatchRequestLanguageEnum._(r'he-IL');
  static const hiIN = CatalogsVerticalBatchRequestLanguageEnum._(r'hi-IN');
  static const hrHR = CatalogsVerticalBatchRequestLanguageEnum._(r'hr-HR');
  static const huHU = CatalogsVerticalBatchRequestLanguageEnum._(r'hu-HU');
  static const idID = CatalogsVerticalBatchRequestLanguageEnum._(r'id-ID');
  static const it = CatalogsVerticalBatchRequestLanguageEnum._(r'it');
  static const ja = CatalogsVerticalBatchRequestLanguageEnum._(r'ja');
  static const koKR = CatalogsVerticalBatchRequestLanguageEnum._(r'ko-KR');
  static const msMY = CatalogsVerticalBatchRequestLanguageEnum._(r'ms-MY');
  static const nbNO = CatalogsVerticalBatchRequestLanguageEnum._(r'nb-NO');
  static const nl = CatalogsVerticalBatchRequestLanguageEnum._(r'nl');
  static const plPL = CatalogsVerticalBatchRequestLanguageEnum._(r'pl-PL');
  static const ptBR = CatalogsVerticalBatchRequestLanguageEnum._(r'pt-BR');
  static const ptPT = CatalogsVerticalBatchRequestLanguageEnum._(r'pt-PT');
  static const roRO = CatalogsVerticalBatchRequestLanguageEnum._(r'ro-RO');
  static const ruRU = CatalogsVerticalBatchRequestLanguageEnum._(r'ru-RU');
  static const skSK = CatalogsVerticalBatchRequestLanguageEnum._(r'sk-SK');
  static const svSE = CatalogsVerticalBatchRequestLanguageEnum._(r'sv-SE');
  static const teIN = CatalogsVerticalBatchRequestLanguageEnum._(r'te-IN');
  static const thTH = CatalogsVerticalBatchRequestLanguageEnum._(r'th-TH');
  static const tlPH = CatalogsVerticalBatchRequestLanguageEnum._(r'tl-PH');
  static const tr = CatalogsVerticalBatchRequestLanguageEnum._(r'tr');
  static const ukUA = CatalogsVerticalBatchRequestLanguageEnum._(r'uk-UA');
  static const viVN = CatalogsVerticalBatchRequestLanguageEnum._(r'vi-VN');
  static const zhCN = CatalogsVerticalBatchRequestLanguageEnum._(r'zh-CN');
  static const zhTW = CatalogsVerticalBatchRequestLanguageEnum._(r'zh-TW');
  static const AM = CatalogsVerticalBatchRequestLanguageEnum._(r'AM');
  static const AR = CatalogsVerticalBatchRequestLanguageEnum._(r'AR');
  static const AZ = CatalogsVerticalBatchRequestLanguageEnum._(r'AZ');
  static const BG = CatalogsVerticalBatchRequestLanguageEnum._(r'BG');
  static const BN = CatalogsVerticalBatchRequestLanguageEnum._(r'BN');
  static const BS = CatalogsVerticalBatchRequestLanguageEnum._(r'BS');
  static const CA = CatalogsVerticalBatchRequestLanguageEnum._(r'CA');
  static const CS = CatalogsVerticalBatchRequestLanguageEnum._(r'CS');
  static const DA = CatalogsVerticalBatchRequestLanguageEnum._(r'DA');
  static const DV = CatalogsVerticalBatchRequestLanguageEnum._(r'DV');
  static const DZ = CatalogsVerticalBatchRequestLanguageEnum._(r'DZ');
  static const DE = CatalogsVerticalBatchRequestLanguageEnum._(r'DE');
  static const EL = CatalogsVerticalBatchRequestLanguageEnum._(r'EL');
  static const EN = CatalogsVerticalBatchRequestLanguageEnum._(r'EN');
  static const ES = CatalogsVerticalBatchRequestLanguageEnum._(r'ES');
  static const ET = CatalogsVerticalBatchRequestLanguageEnum._(r'ET');
  static const FA = CatalogsVerticalBatchRequestLanguageEnum._(r'FA');
  static const FI = CatalogsVerticalBatchRequestLanguageEnum._(r'FI');
  static const FR = CatalogsVerticalBatchRequestLanguageEnum._(r'FR');
  static const HE = CatalogsVerticalBatchRequestLanguageEnum._(r'HE');
  static const HI = CatalogsVerticalBatchRequestLanguageEnum._(r'HI');
  static const HR = CatalogsVerticalBatchRequestLanguageEnum._(r'HR');
  static const HU = CatalogsVerticalBatchRequestLanguageEnum._(r'HU');
  static const HY = CatalogsVerticalBatchRequestLanguageEnum._(r'HY');
  static const ID = CatalogsVerticalBatchRequestLanguageEnum._(r'ID');
  static const IN = CatalogsVerticalBatchRequestLanguageEnum._(r'IN');
  static const IS = CatalogsVerticalBatchRequestLanguageEnum._(r'IS');
  static const IT = CatalogsVerticalBatchRequestLanguageEnum._(r'IT');
  static const IW = CatalogsVerticalBatchRequestLanguageEnum._(r'IW');
  static const JA = CatalogsVerticalBatchRequestLanguageEnum._(r'JA');
  static const KA = CatalogsVerticalBatchRequestLanguageEnum._(r'KA');
  static const KM = CatalogsVerticalBatchRequestLanguageEnum._(r'KM');
  static const KO = CatalogsVerticalBatchRequestLanguageEnum._(r'KO');
  static const LO = CatalogsVerticalBatchRequestLanguageEnum._(r'LO');
  static const LT = CatalogsVerticalBatchRequestLanguageEnum._(r'LT');
  static const LV = CatalogsVerticalBatchRequestLanguageEnum._(r'LV');
  static const MK = CatalogsVerticalBatchRequestLanguageEnum._(r'MK');
  static const MN = CatalogsVerticalBatchRequestLanguageEnum._(r'MN');
  static const MS = CatalogsVerticalBatchRequestLanguageEnum._(r'MS');
  static const MY = CatalogsVerticalBatchRequestLanguageEnum._(r'MY');
  static const NB = CatalogsVerticalBatchRequestLanguageEnum._(r'NB');
  static const NE = CatalogsVerticalBatchRequestLanguageEnum._(r'NE');
  static const NL = CatalogsVerticalBatchRequestLanguageEnum._(r'NL');
  static const NO = CatalogsVerticalBatchRequestLanguageEnum._(r'NO');
  static const PL = CatalogsVerticalBatchRequestLanguageEnum._(r'PL');
  static const PT = CatalogsVerticalBatchRequestLanguageEnum._(r'PT');
  static const RO = CatalogsVerticalBatchRequestLanguageEnum._(r'RO');
  static const RU = CatalogsVerticalBatchRequestLanguageEnum._(r'RU');
  static const SK = CatalogsVerticalBatchRequestLanguageEnum._(r'SK');
  static const SL = CatalogsVerticalBatchRequestLanguageEnum._(r'SL');
  static const SQ = CatalogsVerticalBatchRequestLanguageEnum._(r'SQ');
  static const SR = CatalogsVerticalBatchRequestLanguageEnum._(r'SR');
  static const SV = CatalogsVerticalBatchRequestLanguageEnum._(r'SV');
  static const TL = CatalogsVerticalBatchRequestLanguageEnum._(r'TL');
  static const UK = CatalogsVerticalBatchRequestLanguageEnum._(r'UK');
  static const VI = CatalogsVerticalBatchRequestLanguageEnum._(r'VI');
  static const TE = CatalogsVerticalBatchRequestLanguageEnum._(r'TE');
  static const TH = CatalogsVerticalBatchRequestLanguageEnum._(r'TH');
  static const TR = CatalogsVerticalBatchRequestLanguageEnum._(r'TR');
  static const XX = CatalogsVerticalBatchRequestLanguageEnum._(r'XX');
  static const ZH = CatalogsVerticalBatchRequestLanguageEnum._(r'ZH');

  /// List of all possible values in this [enum][CatalogsVerticalBatchRequestLanguageEnum].
  static const values = <CatalogsVerticalBatchRequestLanguageEnum>[
    afZA,
    arSA,
    bgBG,
    bnIN,
    csCZ,
    daDK,
    de,
    elGR,
    enAU,
    enCA,
    enGB,
    enIN,
    enUS,
    es419,
    esAR,
    esES,
    esMX,
    fiFI,
    fr,
    frCA,
    heIL,
    hiIN,
    hrHR,
    huHU,
    idID,
    it,
    ja,
    koKR,
    msMY,
    nbNO,
    nl,
    plPL,
    ptBR,
    ptPT,
    roRO,
    ruRU,
    skSK,
    svSE,
    teIN,
    thTH,
    tlPH,
    tr,
    ukUA,
    viVN,
    zhCN,
    zhTW,
    AM,
    AR,
    AZ,
    BG,
    BN,
    BS,
    CA,
    CS,
    DA,
    DV,
    DZ,
    DE,
    EL,
    EN,
    ES,
    ET,
    FA,
    FI,
    FR,
    HE,
    HI,
    HR,
    HU,
    HY,
    ID,
    IN,
    IS,
    IT,
    IW,
    JA,
    KA,
    KM,
    KO,
    LO,
    LT,
    LV,
    MK,
    MN,
    MS,
    MY,
    NB,
    NE,
    NL,
    NO,
    PL,
    PT,
    RO,
    RU,
    SK,
    SL,
    SQ,
    SR,
    SV,
    TL,
    UK,
    VI,
    TE,
    TH,
    TR,
    XX,
    ZH,
  ];

  static CatalogsVerticalBatchRequestLanguageEnum? fromJson(dynamic value) => CatalogsVerticalBatchRequestLanguageEnumTypeTransformer().decode(value);

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

  String encode(CatalogsVerticalBatchRequestLanguageEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsVerticalBatchRequestLanguageEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsVerticalBatchRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
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
        case r'NO': return CatalogsVerticalBatchRequestLanguageEnum.NO;
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

  /// Singleton [CatalogsVerticalBatchRequestLanguageEnumTypeTransformer] instance.
  static CatalogsVerticalBatchRequestLanguageEnumTypeTransformer? _instance;
}


