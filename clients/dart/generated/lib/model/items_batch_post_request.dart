//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class ItemsBatchPostRequest {
  /// Returns a new [ItemsBatchPostRequest] instance.
  ItemsBatchPostRequest({
    this.catalogId,
    required this.catalogType,
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  /// Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? catalogId;

  ItemsBatchPostRequestCatalogTypeEnum catalogType;

  Country country;

  /// Array with catalogs items
  List<ItemDeleteBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  ItemsBatchPostRequestLanguageEnum language;

  BatchOperation operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is ItemsBatchPostRequest &&
    other.catalogId == catalogId &&
    other.catalogType == catalogType &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (catalogId == null ? 0 : catalogId!.hashCode) +
    (catalogType.hashCode) +
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'ItemsBatchPostRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, items=$items, language=$language, operation=$operation]';

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
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [ItemsBatchPostRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static ItemsBatchPostRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "ItemsBatchPostRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "ItemsBatchPostRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return ItemsBatchPostRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: ItemsBatchPostRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteBatchRecord.listFromJson(json[r'items']),
        language: ItemsBatchPostRequestLanguageEnum.fromJson(json[r'language'])!,
        operation: BatchOperation.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<ItemsBatchPostRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemsBatchPostRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemsBatchPostRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, ItemsBatchPostRequest> mapFromJson(dynamic json) {
    final map = <String, ItemsBatchPostRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = ItemsBatchPostRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of ItemsBatchPostRequest-objects as value to a dart map
  static Map<String, List<ItemsBatchPostRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<ItemsBatchPostRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = ItemsBatchPostRequest.listFromJson(entry.value, growable: growable,);
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
    'operation',
  };
}


class ItemsBatchPostRequestCatalogTypeEnum {
  /// Instantiate a new enum with the provided [value].
  const ItemsBatchPostRequestCatalogTypeEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CREATIVE_ASSETS = ItemsBatchPostRequestCatalogTypeEnum._(r'CREATIVE_ASSETS');

  /// List of all possible values in this [enum][ItemsBatchPostRequestCatalogTypeEnum].
  static const values = <ItemsBatchPostRequestCatalogTypeEnum>[
    CREATIVE_ASSETS,
  ];

  static ItemsBatchPostRequestCatalogTypeEnum? fromJson(dynamic value) => ItemsBatchPostRequestCatalogTypeEnumTypeTransformer().decode(value);

  static List<ItemsBatchPostRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemsBatchPostRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemsBatchPostRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ItemsBatchPostRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [ItemsBatchPostRequestCatalogTypeEnum].
class ItemsBatchPostRequestCatalogTypeEnumTypeTransformer {
  factory ItemsBatchPostRequestCatalogTypeEnumTypeTransformer() => _instance ??= const ItemsBatchPostRequestCatalogTypeEnumTypeTransformer._();

  const ItemsBatchPostRequestCatalogTypeEnumTypeTransformer._();

  String encode(ItemsBatchPostRequestCatalogTypeEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ItemsBatchPostRequestCatalogTypeEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ItemsBatchPostRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return ItemsBatchPostRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ItemsBatchPostRequestCatalogTypeEnumTypeTransformer] instance.
  static ItemsBatchPostRequestCatalogTypeEnumTypeTransformer? _instance;
}


/// We recommend using the CatalogsLocale values.
class ItemsBatchPostRequestLanguageEnum {
  /// Instantiate a new enum with the provided [value].
  const ItemsBatchPostRequestLanguageEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const afZA = ItemsBatchPostRequestLanguageEnum._(r'af-ZA');
  static const arSA = ItemsBatchPostRequestLanguageEnum._(r'ar-SA');
  static const bgBG = ItemsBatchPostRequestLanguageEnum._(r'bg-BG');
  static const bnIN = ItemsBatchPostRequestLanguageEnum._(r'bn-IN');
  static const csCZ = ItemsBatchPostRequestLanguageEnum._(r'cs-CZ');
  static const daDK = ItemsBatchPostRequestLanguageEnum._(r'da-DK');
  static const de = ItemsBatchPostRequestLanguageEnum._(r'de');
  static const elGR = ItemsBatchPostRequestLanguageEnum._(r'el-GR');
  static const enAU = ItemsBatchPostRequestLanguageEnum._(r'en-AU');
  static const enCA = ItemsBatchPostRequestLanguageEnum._(r'en-CA');
  static const enGB = ItemsBatchPostRequestLanguageEnum._(r'en-GB');
  static const enIN = ItemsBatchPostRequestLanguageEnum._(r'en-IN');
  static const enUS = ItemsBatchPostRequestLanguageEnum._(r'en-US');
  static const es419 = ItemsBatchPostRequestLanguageEnum._(r'es-419');
  static const esAR = ItemsBatchPostRequestLanguageEnum._(r'es-AR');
  static const esES = ItemsBatchPostRequestLanguageEnum._(r'es-ES');
  static const esMX = ItemsBatchPostRequestLanguageEnum._(r'es-MX');
  static const fiFI = ItemsBatchPostRequestLanguageEnum._(r'fi-FI');
  static const fr = ItemsBatchPostRequestLanguageEnum._(r'fr');
  static const frCA = ItemsBatchPostRequestLanguageEnum._(r'fr-CA');
  static const heIL = ItemsBatchPostRequestLanguageEnum._(r'he-IL');
  static const hiIN = ItemsBatchPostRequestLanguageEnum._(r'hi-IN');
  static const hrHR = ItemsBatchPostRequestLanguageEnum._(r'hr-HR');
  static const huHU = ItemsBatchPostRequestLanguageEnum._(r'hu-HU');
  static const idID = ItemsBatchPostRequestLanguageEnum._(r'id-ID');
  static const it = ItemsBatchPostRequestLanguageEnum._(r'it');
  static const ja = ItemsBatchPostRequestLanguageEnum._(r'ja');
  static const koKR = ItemsBatchPostRequestLanguageEnum._(r'ko-KR');
  static const msMY = ItemsBatchPostRequestLanguageEnum._(r'ms-MY');
  static const nbNO = ItemsBatchPostRequestLanguageEnum._(r'nb-NO');
  static const nl = ItemsBatchPostRequestLanguageEnum._(r'nl');
  static const plPL = ItemsBatchPostRequestLanguageEnum._(r'pl-PL');
  static const ptBR = ItemsBatchPostRequestLanguageEnum._(r'pt-BR');
  static const ptPT = ItemsBatchPostRequestLanguageEnum._(r'pt-PT');
  static const roRO = ItemsBatchPostRequestLanguageEnum._(r'ro-RO');
  static const ruRU = ItemsBatchPostRequestLanguageEnum._(r'ru-RU');
  static const skSK = ItemsBatchPostRequestLanguageEnum._(r'sk-SK');
  static const svSE = ItemsBatchPostRequestLanguageEnum._(r'sv-SE');
  static const teIN = ItemsBatchPostRequestLanguageEnum._(r'te-IN');
  static const thTH = ItemsBatchPostRequestLanguageEnum._(r'th-TH');
  static const tlPH = ItemsBatchPostRequestLanguageEnum._(r'tl-PH');
  static const tr = ItemsBatchPostRequestLanguageEnum._(r'tr');
  static const ukUA = ItemsBatchPostRequestLanguageEnum._(r'uk-UA');
  static const viVN = ItemsBatchPostRequestLanguageEnum._(r'vi-VN');
  static const zhCN = ItemsBatchPostRequestLanguageEnum._(r'zh-CN');
  static const zhTW = ItemsBatchPostRequestLanguageEnum._(r'zh-TW');
  static const AM = ItemsBatchPostRequestLanguageEnum._(r'AM');
  static const AR = ItemsBatchPostRequestLanguageEnum._(r'AR');
  static const AZ = ItemsBatchPostRequestLanguageEnum._(r'AZ');
  static const BG = ItemsBatchPostRequestLanguageEnum._(r'BG');
  static const BN = ItemsBatchPostRequestLanguageEnum._(r'BN');
  static const BS = ItemsBatchPostRequestLanguageEnum._(r'BS');
  static const CA = ItemsBatchPostRequestLanguageEnum._(r'CA');
  static const CS = ItemsBatchPostRequestLanguageEnum._(r'CS');
  static const DA = ItemsBatchPostRequestLanguageEnum._(r'DA');
  static const DV = ItemsBatchPostRequestLanguageEnum._(r'DV');
  static const DZ = ItemsBatchPostRequestLanguageEnum._(r'DZ');
  static const DE = ItemsBatchPostRequestLanguageEnum._(r'DE');
  static const EL = ItemsBatchPostRequestLanguageEnum._(r'EL');
  static const EN = ItemsBatchPostRequestLanguageEnum._(r'EN');
  static const ES = ItemsBatchPostRequestLanguageEnum._(r'ES');
  static const ET = ItemsBatchPostRequestLanguageEnum._(r'ET');
  static const FA = ItemsBatchPostRequestLanguageEnum._(r'FA');
  static const FI = ItemsBatchPostRequestLanguageEnum._(r'FI');
  static const FR = ItemsBatchPostRequestLanguageEnum._(r'FR');
  static const HE = ItemsBatchPostRequestLanguageEnum._(r'HE');
  static const HI = ItemsBatchPostRequestLanguageEnum._(r'HI');
  static const HR = ItemsBatchPostRequestLanguageEnum._(r'HR');
  static const HU = ItemsBatchPostRequestLanguageEnum._(r'HU');
  static const HY = ItemsBatchPostRequestLanguageEnum._(r'HY');
  static const ID = ItemsBatchPostRequestLanguageEnum._(r'ID');
  static const IN = ItemsBatchPostRequestLanguageEnum._(r'IN');
  static const IS = ItemsBatchPostRequestLanguageEnum._(r'IS');
  static const IT = ItemsBatchPostRequestLanguageEnum._(r'IT');
  static const IW = ItemsBatchPostRequestLanguageEnum._(r'IW');
  static const JA = ItemsBatchPostRequestLanguageEnum._(r'JA');
  static const KA = ItemsBatchPostRequestLanguageEnum._(r'KA');
  static const KM = ItemsBatchPostRequestLanguageEnum._(r'KM');
  static const KO = ItemsBatchPostRequestLanguageEnum._(r'KO');
  static const LO = ItemsBatchPostRequestLanguageEnum._(r'LO');
  static const LT = ItemsBatchPostRequestLanguageEnum._(r'LT');
  static const LV = ItemsBatchPostRequestLanguageEnum._(r'LV');
  static const MK = ItemsBatchPostRequestLanguageEnum._(r'MK');
  static const MN = ItemsBatchPostRequestLanguageEnum._(r'MN');
  static const MS = ItemsBatchPostRequestLanguageEnum._(r'MS');
  static const MY = ItemsBatchPostRequestLanguageEnum._(r'MY');
  static const NB = ItemsBatchPostRequestLanguageEnum._(r'NB');
  static const NE = ItemsBatchPostRequestLanguageEnum._(r'NE');
  static const NL = ItemsBatchPostRequestLanguageEnum._(r'NL');
  static const NO = ItemsBatchPostRequestLanguageEnum._(r'NO');
  static const PL = ItemsBatchPostRequestLanguageEnum._(r'PL');
  static const PT = ItemsBatchPostRequestLanguageEnum._(r'PT');
  static const RO = ItemsBatchPostRequestLanguageEnum._(r'RO');
  static const RU = ItemsBatchPostRequestLanguageEnum._(r'RU');
  static const SK = ItemsBatchPostRequestLanguageEnum._(r'SK');
  static const SL = ItemsBatchPostRequestLanguageEnum._(r'SL');
  static const SQ = ItemsBatchPostRequestLanguageEnum._(r'SQ');
  static const SR = ItemsBatchPostRequestLanguageEnum._(r'SR');
  static const SV = ItemsBatchPostRequestLanguageEnum._(r'SV');
  static const TL = ItemsBatchPostRequestLanguageEnum._(r'TL');
  static const UK = ItemsBatchPostRequestLanguageEnum._(r'UK');
  static const VI = ItemsBatchPostRequestLanguageEnum._(r'VI');
  static const TE = ItemsBatchPostRequestLanguageEnum._(r'TE');
  static const TH = ItemsBatchPostRequestLanguageEnum._(r'TH');
  static const TR = ItemsBatchPostRequestLanguageEnum._(r'TR');
  static const XX = ItemsBatchPostRequestLanguageEnum._(r'XX');
  static const ZH = ItemsBatchPostRequestLanguageEnum._(r'ZH');

  /// List of all possible values in this [enum][ItemsBatchPostRequestLanguageEnum].
  static const values = <ItemsBatchPostRequestLanguageEnum>[
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

  static ItemsBatchPostRequestLanguageEnum? fromJson(dynamic value) => ItemsBatchPostRequestLanguageEnumTypeTransformer().decode(value);

  static List<ItemsBatchPostRequestLanguageEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ItemsBatchPostRequestLanguageEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ItemsBatchPostRequestLanguageEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ItemsBatchPostRequestLanguageEnum] to String,
/// and [decode] dynamic data back to [ItemsBatchPostRequestLanguageEnum].
class ItemsBatchPostRequestLanguageEnumTypeTransformer {
  factory ItemsBatchPostRequestLanguageEnumTypeTransformer() => _instance ??= const ItemsBatchPostRequestLanguageEnumTypeTransformer._();

  const ItemsBatchPostRequestLanguageEnumTypeTransformer._();

  String encode(ItemsBatchPostRequestLanguageEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a ItemsBatchPostRequestLanguageEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ItemsBatchPostRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'af-ZA': return ItemsBatchPostRequestLanguageEnum.afZA;
        case r'ar-SA': return ItemsBatchPostRequestLanguageEnum.arSA;
        case r'bg-BG': return ItemsBatchPostRequestLanguageEnum.bgBG;
        case r'bn-IN': return ItemsBatchPostRequestLanguageEnum.bnIN;
        case r'cs-CZ': return ItemsBatchPostRequestLanguageEnum.csCZ;
        case r'da-DK': return ItemsBatchPostRequestLanguageEnum.daDK;
        case r'de': return ItemsBatchPostRequestLanguageEnum.de;
        case r'el-GR': return ItemsBatchPostRequestLanguageEnum.elGR;
        case r'en-AU': return ItemsBatchPostRequestLanguageEnum.enAU;
        case r'en-CA': return ItemsBatchPostRequestLanguageEnum.enCA;
        case r'en-GB': return ItemsBatchPostRequestLanguageEnum.enGB;
        case r'en-IN': return ItemsBatchPostRequestLanguageEnum.enIN;
        case r'en-US': return ItemsBatchPostRequestLanguageEnum.enUS;
        case r'es-419': return ItemsBatchPostRequestLanguageEnum.es419;
        case r'es-AR': return ItemsBatchPostRequestLanguageEnum.esAR;
        case r'es-ES': return ItemsBatchPostRequestLanguageEnum.esES;
        case r'es-MX': return ItemsBatchPostRequestLanguageEnum.esMX;
        case r'fi-FI': return ItemsBatchPostRequestLanguageEnum.fiFI;
        case r'fr': return ItemsBatchPostRequestLanguageEnum.fr;
        case r'fr-CA': return ItemsBatchPostRequestLanguageEnum.frCA;
        case r'he-IL': return ItemsBatchPostRequestLanguageEnum.heIL;
        case r'hi-IN': return ItemsBatchPostRequestLanguageEnum.hiIN;
        case r'hr-HR': return ItemsBatchPostRequestLanguageEnum.hrHR;
        case r'hu-HU': return ItemsBatchPostRequestLanguageEnum.huHU;
        case r'id-ID': return ItemsBatchPostRequestLanguageEnum.idID;
        case r'it': return ItemsBatchPostRequestLanguageEnum.it;
        case r'ja': return ItemsBatchPostRequestLanguageEnum.ja;
        case r'ko-KR': return ItemsBatchPostRequestLanguageEnum.koKR;
        case r'ms-MY': return ItemsBatchPostRequestLanguageEnum.msMY;
        case r'nb-NO': return ItemsBatchPostRequestLanguageEnum.nbNO;
        case r'nl': return ItemsBatchPostRequestLanguageEnum.nl;
        case r'pl-PL': return ItemsBatchPostRequestLanguageEnum.plPL;
        case r'pt-BR': return ItemsBatchPostRequestLanguageEnum.ptBR;
        case r'pt-PT': return ItemsBatchPostRequestLanguageEnum.ptPT;
        case r'ro-RO': return ItemsBatchPostRequestLanguageEnum.roRO;
        case r'ru-RU': return ItemsBatchPostRequestLanguageEnum.ruRU;
        case r'sk-SK': return ItemsBatchPostRequestLanguageEnum.skSK;
        case r'sv-SE': return ItemsBatchPostRequestLanguageEnum.svSE;
        case r'te-IN': return ItemsBatchPostRequestLanguageEnum.teIN;
        case r'th-TH': return ItemsBatchPostRequestLanguageEnum.thTH;
        case r'tl-PH': return ItemsBatchPostRequestLanguageEnum.tlPH;
        case r'tr': return ItemsBatchPostRequestLanguageEnum.tr;
        case r'uk-UA': return ItemsBatchPostRequestLanguageEnum.ukUA;
        case r'vi-VN': return ItemsBatchPostRequestLanguageEnum.viVN;
        case r'zh-CN': return ItemsBatchPostRequestLanguageEnum.zhCN;
        case r'zh-TW': return ItemsBatchPostRequestLanguageEnum.zhTW;
        case r'AM': return ItemsBatchPostRequestLanguageEnum.AM;
        case r'AR': return ItemsBatchPostRequestLanguageEnum.AR;
        case r'AZ': return ItemsBatchPostRequestLanguageEnum.AZ;
        case r'BG': return ItemsBatchPostRequestLanguageEnum.BG;
        case r'BN': return ItemsBatchPostRequestLanguageEnum.BN;
        case r'BS': return ItemsBatchPostRequestLanguageEnum.BS;
        case r'CA': return ItemsBatchPostRequestLanguageEnum.CA;
        case r'CS': return ItemsBatchPostRequestLanguageEnum.CS;
        case r'DA': return ItemsBatchPostRequestLanguageEnum.DA;
        case r'DV': return ItemsBatchPostRequestLanguageEnum.DV;
        case r'DZ': return ItemsBatchPostRequestLanguageEnum.DZ;
        case r'DE': return ItemsBatchPostRequestLanguageEnum.DE;
        case r'EL': return ItemsBatchPostRequestLanguageEnum.EL;
        case r'EN': return ItemsBatchPostRequestLanguageEnum.EN;
        case r'ES': return ItemsBatchPostRequestLanguageEnum.ES;
        case r'ET': return ItemsBatchPostRequestLanguageEnum.ET;
        case r'FA': return ItemsBatchPostRequestLanguageEnum.FA;
        case r'FI': return ItemsBatchPostRequestLanguageEnum.FI;
        case r'FR': return ItemsBatchPostRequestLanguageEnum.FR;
        case r'HE': return ItemsBatchPostRequestLanguageEnum.HE;
        case r'HI': return ItemsBatchPostRequestLanguageEnum.HI;
        case r'HR': return ItemsBatchPostRequestLanguageEnum.HR;
        case r'HU': return ItemsBatchPostRequestLanguageEnum.HU;
        case r'HY': return ItemsBatchPostRequestLanguageEnum.HY;
        case r'ID': return ItemsBatchPostRequestLanguageEnum.ID;
        case r'IN': return ItemsBatchPostRequestLanguageEnum.IN;
        case r'IS': return ItemsBatchPostRequestLanguageEnum.IS;
        case r'IT': return ItemsBatchPostRequestLanguageEnum.IT;
        case r'IW': return ItemsBatchPostRequestLanguageEnum.IW;
        case r'JA': return ItemsBatchPostRequestLanguageEnum.JA;
        case r'KA': return ItemsBatchPostRequestLanguageEnum.KA;
        case r'KM': return ItemsBatchPostRequestLanguageEnum.KM;
        case r'KO': return ItemsBatchPostRequestLanguageEnum.KO;
        case r'LO': return ItemsBatchPostRequestLanguageEnum.LO;
        case r'LT': return ItemsBatchPostRequestLanguageEnum.LT;
        case r'LV': return ItemsBatchPostRequestLanguageEnum.LV;
        case r'MK': return ItemsBatchPostRequestLanguageEnum.MK;
        case r'MN': return ItemsBatchPostRequestLanguageEnum.MN;
        case r'MS': return ItemsBatchPostRequestLanguageEnum.MS;
        case r'MY': return ItemsBatchPostRequestLanguageEnum.MY;
        case r'NB': return ItemsBatchPostRequestLanguageEnum.NB;
        case r'NE': return ItemsBatchPostRequestLanguageEnum.NE;
        case r'NL': return ItemsBatchPostRequestLanguageEnum.NL;
        case r'NO': return ItemsBatchPostRequestLanguageEnum.NO;
        case r'PL': return ItemsBatchPostRequestLanguageEnum.PL;
        case r'PT': return ItemsBatchPostRequestLanguageEnum.PT;
        case r'RO': return ItemsBatchPostRequestLanguageEnum.RO;
        case r'RU': return ItemsBatchPostRequestLanguageEnum.RU;
        case r'SK': return ItemsBatchPostRequestLanguageEnum.SK;
        case r'SL': return ItemsBatchPostRequestLanguageEnum.SL;
        case r'SQ': return ItemsBatchPostRequestLanguageEnum.SQ;
        case r'SR': return ItemsBatchPostRequestLanguageEnum.SR;
        case r'SV': return ItemsBatchPostRequestLanguageEnum.SV;
        case r'TL': return ItemsBatchPostRequestLanguageEnum.TL;
        case r'UK': return ItemsBatchPostRequestLanguageEnum.UK;
        case r'VI': return ItemsBatchPostRequestLanguageEnum.VI;
        case r'TE': return ItemsBatchPostRequestLanguageEnum.TE;
        case r'TH': return ItemsBatchPostRequestLanguageEnum.TH;
        case r'TR': return ItemsBatchPostRequestLanguageEnum.TR;
        case r'XX': return ItemsBatchPostRequestLanguageEnum.XX;
        case r'ZH': return ItemsBatchPostRequestLanguageEnum.ZH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ItemsBatchPostRequestLanguageEnumTypeTransformer] instance.
  static ItemsBatchPostRequestLanguageEnumTypeTransformer? _instance;
}


