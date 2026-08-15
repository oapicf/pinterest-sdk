//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsBatchRequest {
  /// Returns a new [CatalogsItemsBatchRequest] instance.
  CatalogsItemsBatchRequest({
    required this.country,
    this.items = const [],
    required this.language,
    required this.operation,
  });

  Country country;

  /// Array with catalogs items
  List<ItemDeleteBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  CatalogsItemsBatchRequestLanguageEnum language;

  BatchOperation operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsBatchRequest &&
    other.country == country &&
    _deepEquality.equals(other.items, items) &&
    other.language == language &&
    other.operation == operation;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (country.hashCode) +
    (items.hashCode) +
    (language.hashCode) +
    (operation.hashCode);

  @override
  String toString() => 'CatalogsItemsBatchRequest[country=$country, items=$items, language=$language, operation=$operation]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'country'] = this.country;
      json[r'items'] = this.items;
      json[r'language'] = this.language;
      json[r'operation'] = this.operation;
    return json;
  }

  /// Returns a new [CatalogsItemsBatchRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsBatchRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "CatalogsItemsBatchRequest[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "CatalogsItemsBatchRequest[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return CatalogsItemsBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteBatchRecord.listFromJson(json[r'items']),
        language: CatalogsItemsBatchRequestLanguageEnum.fromJson(json[r'language'])!,
        operation: BatchOperation.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsBatchRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsBatchRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsBatchRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsBatchRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsBatchRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsBatchRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsBatchRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsBatchRequest.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
    'country',
    'items',
    'language',
    'operation',
  };
}

/// We recommend using the CatalogsLocale values.
class CatalogsItemsBatchRequestLanguageEnum {
  /// Instantiate a new enum with the provided [value].
  const CatalogsItemsBatchRequestLanguageEnum._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const afZA = CatalogsItemsBatchRequestLanguageEnum._(r'af-ZA');
  static const arSA = CatalogsItemsBatchRequestLanguageEnum._(r'ar-SA');
  static const bgBG = CatalogsItemsBatchRequestLanguageEnum._(r'bg-BG');
  static const bnIN = CatalogsItemsBatchRequestLanguageEnum._(r'bn-IN');
  static const csCZ = CatalogsItemsBatchRequestLanguageEnum._(r'cs-CZ');
  static const daDK = CatalogsItemsBatchRequestLanguageEnum._(r'da-DK');
  static const de = CatalogsItemsBatchRequestLanguageEnum._(r'de');
  static const elGR = CatalogsItemsBatchRequestLanguageEnum._(r'el-GR');
  static const enAU = CatalogsItemsBatchRequestLanguageEnum._(r'en-AU');
  static const enCA = CatalogsItemsBatchRequestLanguageEnum._(r'en-CA');
  static const enGB = CatalogsItemsBatchRequestLanguageEnum._(r'en-GB');
  static const enIN = CatalogsItemsBatchRequestLanguageEnum._(r'en-IN');
  static const enUS = CatalogsItemsBatchRequestLanguageEnum._(r'en-US');
  static const es419 = CatalogsItemsBatchRequestLanguageEnum._(r'es-419');
  static const esAR = CatalogsItemsBatchRequestLanguageEnum._(r'es-AR');
  static const esES = CatalogsItemsBatchRequestLanguageEnum._(r'es-ES');
  static const esMX = CatalogsItemsBatchRequestLanguageEnum._(r'es-MX');
  static const fiFI = CatalogsItemsBatchRequestLanguageEnum._(r'fi-FI');
  static const fr = CatalogsItemsBatchRequestLanguageEnum._(r'fr');
  static const frCA = CatalogsItemsBatchRequestLanguageEnum._(r'fr-CA');
  static const heIL = CatalogsItemsBatchRequestLanguageEnum._(r'he-IL');
  static const hiIN = CatalogsItemsBatchRequestLanguageEnum._(r'hi-IN');
  static const hrHR = CatalogsItemsBatchRequestLanguageEnum._(r'hr-HR');
  static const huHU = CatalogsItemsBatchRequestLanguageEnum._(r'hu-HU');
  static const idID = CatalogsItemsBatchRequestLanguageEnum._(r'id-ID');
  static const it = CatalogsItemsBatchRequestLanguageEnum._(r'it');
  static const ja = CatalogsItemsBatchRequestLanguageEnum._(r'ja');
  static const koKR = CatalogsItemsBatchRequestLanguageEnum._(r'ko-KR');
  static const msMY = CatalogsItemsBatchRequestLanguageEnum._(r'ms-MY');
  static const nbNO = CatalogsItemsBatchRequestLanguageEnum._(r'nb-NO');
  static const nl = CatalogsItemsBatchRequestLanguageEnum._(r'nl');
  static const plPL = CatalogsItemsBatchRequestLanguageEnum._(r'pl-PL');
  static const ptBR = CatalogsItemsBatchRequestLanguageEnum._(r'pt-BR');
  static const ptPT = CatalogsItemsBatchRequestLanguageEnum._(r'pt-PT');
  static const roRO = CatalogsItemsBatchRequestLanguageEnum._(r'ro-RO');
  static const ruRU = CatalogsItemsBatchRequestLanguageEnum._(r'ru-RU');
  static const skSK = CatalogsItemsBatchRequestLanguageEnum._(r'sk-SK');
  static const svSE = CatalogsItemsBatchRequestLanguageEnum._(r'sv-SE');
  static const teIN = CatalogsItemsBatchRequestLanguageEnum._(r'te-IN');
  static const thTH = CatalogsItemsBatchRequestLanguageEnum._(r'th-TH');
  static const tlPH = CatalogsItemsBatchRequestLanguageEnum._(r'tl-PH');
  static const tr = CatalogsItemsBatchRequestLanguageEnum._(r'tr');
  static const ukUA = CatalogsItemsBatchRequestLanguageEnum._(r'uk-UA');
  static const viVN = CatalogsItemsBatchRequestLanguageEnum._(r'vi-VN');
  static const zhCN = CatalogsItemsBatchRequestLanguageEnum._(r'zh-CN');
  static const zhTW = CatalogsItemsBatchRequestLanguageEnum._(r'zh-TW');
  static const AM = CatalogsItemsBatchRequestLanguageEnum._(r'AM');
  static const AR = CatalogsItemsBatchRequestLanguageEnum._(r'AR');
  static const AZ = CatalogsItemsBatchRequestLanguageEnum._(r'AZ');
  static const BG = CatalogsItemsBatchRequestLanguageEnum._(r'BG');
  static const BN = CatalogsItemsBatchRequestLanguageEnum._(r'BN');
  static const BS = CatalogsItemsBatchRequestLanguageEnum._(r'BS');
  static const CA = CatalogsItemsBatchRequestLanguageEnum._(r'CA');
  static const CS = CatalogsItemsBatchRequestLanguageEnum._(r'CS');
  static const DA = CatalogsItemsBatchRequestLanguageEnum._(r'DA');
  static const DV = CatalogsItemsBatchRequestLanguageEnum._(r'DV');
  static const DZ = CatalogsItemsBatchRequestLanguageEnum._(r'DZ');
  static const DE = CatalogsItemsBatchRequestLanguageEnum._(r'DE');
  static const EL = CatalogsItemsBatchRequestLanguageEnum._(r'EL');
  static const EN = CatalogsItemsBatchRequestLanguageEnum._(r'EN');
  static const ES = CatalogsItemsBatchRequestLanguageEnum._(r'ES');
  static const ET = CatalogsItemsBatchRequestLanguageEnum._(r'ET');
  static const FA = CatalogsItemsBatchRequestLanguageEnum._(r'FA');
  static const FI = CatalogsItemsBatchRequestLanguageEnum._(r'FI');
  static const FR = CatalogsItemsBatchRequestLanguageEnum._(r'FR');
  static const HE = CatalogsItemsBatchRequestLanguageEnum._(r'HE');
  static const HI = CatalogsItemsBatchRequestLanguageEnum._(r'HI');
  static const HR = CatalogsItemsBatchRequestLanguageEnum._(r'HR');
  static const HU = CatalogsItemsBatchRequestLanguageEnum._(r'HU');
  static const HY = CatalogsItemsBatchRequestLanguageEnum._(r'HY');
  static const ID = CatalogsItemsBatchRequestLanguageEnum._(r'ID');
  static const IN = CatalogsItemsBatchRequestLanguageEnum._(r'IN');
  static const IS = CatalogsItemsBatchRequestLanguageEnum._(r'IS');
  static const IT = CatalogsItemsBatchRequestLanguageEnum._(r'IT');
  static const IW = CatalogsItemsBatchRequestLanguageEnum._(r'IW');
  static const JA = CatalogsItemsBatchRequestLanguageEnum._(r'JA');
  static const KA = CatalogsItemsBatchRequestLanguageEnum._(r'KA');
  static const KM = CatalogsItemsBatchRequestLanguageEnum._(r'KM');
  static const KO = CatalogsItemsBatchRequestLanguageEnum._(r'KO');
  static const LO = CatalogsItemsBatchRequestLanguageEnum._(r'LO');
  static const LT = CatalogsItemsBatchRequestLanguageEnum._(r'LT');
  static const LV = CatalogsItemsBatchRequestLanguageEnum._(r'LV');
  static const MK = CatalogsItemsBatchRequestLanguageEnum._(r'MK');
  static const MN = CatalogsItemsBatchRequestLanguageEnum._(r'MN');
  static const MS = CatalogsItemsBatchRequestLanguageEnum._(r'MS');
  static const MY = CatalogsItemsBatchRequestLanguageEnum._(r'MY');
  static const NB = CatalogsItemsBatchRequestLanguageEnum._(r'NB');
  static const NE = CatalogsItemsBatchRequestLanguageEnum._(r'NE');
  static const NL = CatalogsItemsBatchRequestLanguageEnum._(r'NL');
  static const NO = CatalogsItemsBatchRequestLanguageEnum._(r'NO');
  static const PL = CatalogsItemsBatchRequestLanguageEnum._(r'PL');
  static const PT = CatalogsItemsBatchRequestLanguageEnum._(r'PT');
  static const RO = CatalogsItemsBatchRequestLanguageEnum._(r'RO');
  static const RU = CatalogsItemsBatchRequestLanguageEnum._(r'RU');
  static const SK = CatalogsItemsBatchRequestLanguageEnum._(r'SK');
  static const SL = CatalogsItemsBatchRequestLanguageEnum._(r'SL');
  static const SQ = CatalogsItemsBatchRequestLanguageEnum._(r'SQ');
  static const SR = CatalogsItemsBatchRequestLanguageEnum._(r'SR');
  static const SV = CatalogsItemsBatchRequestLanguageEnum._(r'SV');
  static const TL = CatalogsItemsBatchRequestLanguageEnum._(r'TL');
  static const UK = CatalogsItemsBatchRequestLanguageEnum._(r'UK');
  static const VI = CatalogsItemsBatchRequestLanguageEnum._(r'VI');
  static const TE = CatalogsItemsBatchRequestLanguageEnum._(r'TE');
  static const TH = CatalogsItemsBatchRequestLanguageEnum._(r'TH');
  static const TR = CatalogsItemsBatchRequestLanguageEnum._(r'TR');
  static const XX = CatalogsItemsBatchRequestLanguageEnum._(r'XX');
  static const ZH = CatalogsItemsBatchRequestLanguageEnum._(r'ZH');

  /// List of all possible values in this [enum][CatalogsItemsBatchRequestLanguageEnum].
  static const values = <CatalogsItemsBatchRequestLanguageEnum>[
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

  static CatalogsItemsBatchRequestLanguageEnum? fromJson(dynamic value) => CatalogsItemsBatchRequestLanguageEnumTypeTransformer().decode(value);

  static List<CatalogsItemsBatchRequestLanguageEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchRequestLanguageEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchRequestLanguageEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsBatchRequestLanguageEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsBatchRequestLanguageEnum].
class CatalogsItemsBatchRequestLanguageEnumTypeTransformer {
  factory CatalogsItemsBatchRequestLanguageEnumTypeTransformer() => _instance ??= const CatalogsItemsBatchRequestLanguageEnumTypeTransformer._();

  const CatalogsItemsBatchRequestLanguageEnumTypeTransformer._();

  String encode(CatalogsItemsBatchRequestLanguageEnum data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsItemsBatchRequestLanguageEnum.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'af-ZA': return CatalogsItemsBatchRequestLanguageEnum.afZA;
        case r'ar-SA': return CatalogsItemsBatchRequestLanguageEnum.arSA;
        case r'bg-BG': return CatalogsItemsBatchRequestLanguageEnum.bgBG;
        case r'bn-IN': return CatalogsItemsBatchRequestLanguageEnum.bnIN;
        case r'cs-CZ': return CatalogsItemsBatchRequestLanguageEnum.csCZ;
        case r'da-DK': return CatalogsItemsBatchRequestLanguageEnum.daDK;
        case r'de': return CatalogsItemsBatchRequestLanguageEnum.de;
        case r'el-GR': return CatalogsItemsBatchRequestLanguageEnum.elGR;
        case r'en-AU': return CatalogsItemsBatchRequestLanguageEnum.enAU;
        case r'en-CA': return CatalogsItemsBatchRequestLanguageEnum.enCA;
        case r'en-GB': return CatalogsItemsBatchRequestLanguageEnum.enGB;
        case r'en-IN': return CatalogsItemsBatchRequestLanguageEnum.enIN;
        case r'en-US': return CatalogsItemsBatchRequestLanguageEnum.enUS;
        case r'es-419': return CatalogsItemsBatchRequestLanguageEnum.es419;
        case r'es-AR': return CatalogsItemsBatchRequestLanguageEnum.esAR;
        case r'es-ES': return CatalogsItemsBatchRequestLanguageEnum.esES;
        case r'es-MX': return CatalogsItemsBatchRequestLanguageEnum.esMX;
        case r'fi-FI': return CatalogsItemsBatchRequestLanguageEnum.fiFI;
        case r'fr': return CatalogsItemsBatchRequestLanguageEnum.fr;
        case r'fr-CA': return CatalogsItemsBatchRequestLanguageEnum.frCA;
        case r'he-IL': return CatalogsItemsBatchRequestLanguageEnum.heIL;
        case r'hi-IN': return CatalogsItemsBatchRequestLanguageEnum.hiIN;
        case r'hr-HR': return CatalogsItemsBatchRequestLanguageEnum.hrHR;
        case r'hu-HU': return CatalogsItemsBatchRequestLanguageEnum.huHU;
        case r'id-ID': return CatalogsItemsBatchRequestLanguageEnum.idID;
        case r'it': return CatalogsItemsBatchRequestLanguageEnum.it;
        case r'ja': return CatalogsItemsBatchRequestLanguageEnum.ja;
        case r'ko-KR': return CatalogsItemsBatchRequestLanguageEnum.koKR;
        case r'ms-MY': return CatalogsItemsBatchRequestLanguageEnum.msMY;
        case r'nb-NO': return CatalogsItemsBatchRequestLanguageEnum.nbNO;
        case r'nl': return CatalogsItemsBatchRequestLanguageEnum.nl;
        case r'pl-PL': return CatalogsItemsBatchRequestLanguageEnum.plPL;
        case r'pt-BR': return CatalogsItemsBatchRequestLanguageEnum.ptBR;
        case r'pt-PT': return CatalogsItemsBatchRequestLanguageEnum.ptPT;
        case r'ro-RO': return CatalogsItemsBatchRequestLanguageEnum.roRO;
        case r'ru-RU': return CatalogsItemsBatchRequestLanguageEnum.ruRU;
        case r'sk-SK': return CatalogsItemsBatchRequestLanguageEnum.skSK;
        case r'sv-SE': return CatalogsItemsBatchRequestLanguageEnum.svSE;
        case r'te-IN': return CatalogsItemsBatchRequestLanguageEnum.teIN;
        case r'th-TH': return CatalogsItemsBatchRequestLanguageEnum.thTH;
        case r'tl-PH': return CatalogsItemsBatchRequestLanguageEnum.tlPH;
        case r'tr': return CatalogsItemsBatchRequestLanguageEnum.tr;
        case r'uk-UA': return CatalogsItemsBatchRequestLanguageEnum.ukUA;
        case r'vi-VN': return CatalogsItemsBatchRequestLanguageEnum.viVN;
        case r'zh-CN': return CatalogsItemsBatchRequestLanguageEnum.zhCN;
        case r'zh-TW': return CatalogsItemsBatchRequestLanguageEnum.zhTW;
        case r'AM': return CatalogsItemsBatchRequestLanguageEnum.AM;
        case r'AR': return CatalogsItemsBatchRequestLanguageEnum.AR;
        case r'AZ': return CatalogsItemsBatchRequestLanguageEnum.AZ;
        case r'BG': return CatalogsItemsBatchRequestLanguageEnum.BG;
        case r'BN': return CatalogsItemsBatchRequestLanguageEnum.BN;
        case r'BS': return CatalogsItemsBatchRequestLanguageEnum.BS;
        case r'CA': return CatalogsItemsBatchRequestLanguageEnum.CA;
        case r'CS': return CatalogsItemsBatchRequestLanguageEnum.CS;
        case r'DA': return CatalogsItemsBatchRequestLanguageEnum.DA;
        case r'DV': return CatalogsItemsBatchRequestLanguageEnum.DV;
        case r'DZ': return CatalogsItemsBatchRequestLanguageEnum.DZ;
        case r'DE': return CatalogsItemsBatchRequestLanguageEnum.DE;
        case r'EL': return CatalogsItemsBatchRequestLanguageEnum.EL;
        case r'EN': return CatalogsItemsBatchRequestLanguageEnum.EN;
        case r'ES': return CatalogsItemsBatchRequestLanguageEnum.ES;
        case r'ET': return CatalogsItemsBatchRequestLanguageEnum.ET;
        case r'FA': return CatalogsItemsBatchRequestLanguageEnum.FA;
        case r'FI': return CatalogsItemsBatchRequestLanguageEnum.FI;
        case r'FR': return CatalogsItemsBatchRequestLanguageEnum.FR;
        case r'HE': return CatalogsItemsBatchRequestLanguageEnum.HE;
        case r'HI': return CatalogsItemsBatchRequestLanguageEnum.HI;
        case r'HR': return CatalogsItemsBatchRequestLanguageEnum.HR;
        case r'HU': return CatalogsItemsBatchRequestLanguageEnum.HU;
        case r'HY': return CatalogsItemsBatchRequestLanguageEnum.HY;
        case r'ID': return CatalogsItemsBatchRequestLanguageEnum.ID;
        case r'IN': return CatalogsItemsBatchRequestLanguageEnum.IN;
        case r'IS': return CatalogsItemsBatchRequestLanguageEnum.IS;
        case r'IT': return CatalogsItemsBatchRequestLanguageEnum.IT;
        case r'IW': return CatalogsItemsBatchRequestLanguageEnum.IW;
        case r'JA': return CatalogsItemsBatchRequestLanguageEnum.JA;
        case r'KA': return CatalogsItemsBatchRequestLanguageEnum.KA;
        case r'KM': return CatalogsItemsBatchRequestLanguageEnum.KM;
        case r'KO': return CatalogsItemsBatchRequestLanguageEnum.KO;
        case r'LO': return CatalogsItemsBatchRequestLanguageEnum.LO;
        case r'LT': return CatalogsItemsBatchRequestLanguageEnum.LT;
        case r'LV': return CatalogsItemsBatchRequestLanguageEnum.LV;
        case r'MK': return CatalogsItemsBatchRequestLanguageEnum.MK;
        case r'MN': return CatalogsItemsBatchRequestLanguageEnum.MN;
        case r'MS': return CatalogsItemsBatchRequestLanguageEnum.MS;
        case r'MY': return CatalogsItemsBatchRequestLanguageEnum.MY;
        case r'NB': return CatalogsItemsBatchRequestLanguageEnum.NB;
        case r'NE': return CatalogsItemsBatchRequestLanguageEnum.NE;
        case r'NL': return CatalogsItemsBatchRequestLanguageEnum.NL;
        case r'NO': return CatalogsItemsBatchRequestLanguageEnum.NO;
        case r'PL': return CatalogsItemsBatchRequestLanguageEnum.PL;
        case r'PT': return CatalogsItemsBatchRequestLanguageEnum.PT;
        case r'RO': return CatalogsItemsBatchRequestLanguageEnum.RO;
        case r'RU': return CatalogsItemsBatchRequestLanguageEnum.RU;
        case r'SK': return CatalogsItemsBatchRequestLanguageEnum.SK;
        case r'SL': return CatalogsItemsBatchRequestLanguageEnum.SL;
        case r'SQ': return CatalogsItemsBatchRequestLanguageEnum.SQ;
        case r'SR': return CatalogsItemsBatchRequestLanguageEnum.SR;
        case r'SV': return CatalogsItemsBatchRequestLanguageEnum.SV;
        case r'TL': return CatalogsItemsBatchRequestLanguageEnum.TL;
        case r'UK': return CatalogsItemsBatchRequestLanguageEnum.UK;
        case r'VI': return CatalogsItemsBatchRequestLanguageEnum.VI;
        case r'TE': return CatalogsItemsBatchRequestLanguageEnum.TE;
        case r'TH': return CatalogsItemsBatchRequestLanguageEnum.TH;
        case r'TR': return CatalogsItemsBatchRequestLanguageEnum.TR;
        case r'XX': return CatalogsItemsBatchRequestLanguageEnum.XX;
        case r'ZH': return CatalogsItemsBatchRequestLanguageEnum.ZH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsItemsBatchRequestLanguageEnumTypeTransformer] instance.
  static CatalogsItemsBatchRequestLanguageEnumTypeTransformer? _instance;
}


