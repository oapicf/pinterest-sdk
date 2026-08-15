//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class CatalogsLocale {
  /// Instantiate a new enum with the provided [value].
  const CatalogsLocale._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const afZA = CatalogsLocale._(r'af-ZA');
  static const arSA = CatalogsLocale._(r'ar-SA');
  static const bgBG = CatalogsLocale._(r'bg-BG');
  static const bnIN = CatalogsLocale._(r'bn-IN');
  static const csCZ = CatalogsLocale._(r'cs-CZ');
  static const daDK = CatalogsLocale._(r'da-DK');
  static const de = CatalogsLocale._(r'de');
  static const elGR = CatalogsLocale._(r'el-GR');
  static const enAU = CatalogsLocale._(r'en-AU');
  static const enCA = CatalogsLocale._(r'en-CA');
  static const enGB = CatalogsLocale._(r'en-GB');
  static const enIN = CatalogsLocale._(r'en-IN');
  static const enUS = CatalogsLocale._(r'en-US');
  static const es419 = CatalogsLocale._(r'es-419');
  static const esAR = CatalogsLocale._(r'es-AR');
  static const esES = CatalogsLocale._(r'es-ES');
  static const esMX = CatalogsLocale._(r'es-MX');
  static const fiFI = CatalogsLocale._(r'fi-FI');
  static const fr = CatalogsLocale._(r'fr');
  static const frCA = CatalogsLocale._(r'fr-CA');
  static const heIL = CatalogsLocale._(r'he-IL');
  static const hiIN = CatalogsLocale._(r'hi-IN');
  static const hrHR = CatalogsLocale._(r'hr-HR');
  static const huHU = CatalogsLocale._(r'hu-HU');
  static const idID = CatalogsLocale._(r'id-ID');
  static const it = CatalogsLocale._(r'it');
  static const ja = CatalogsLocale._(r'ja');
  static const koKR = CatalogsLocale._(r'ko-KR');
  static const msMY = CatalogsLocale._(r'ms-MY');
  static const nbNO = CatalogsLocale._(r'nb-NO');
  static const nl = CatalogsLocale._(r'nl');
  static const plPL = CatalogsLocale._(r'pl-PL');
  static const ptBR = CatalogsLocale._(r'pt-BR');
  static const ptPT = CatalogsLocale._(r'pt-PT');
  static const roRO = CatalogsLocale._(r'ro-RO');
  static const ruRU = CatalogsLocale._(r'ru-RU');
  static const skSK = CatalogsLocale._(r'sk-SK');
  static const svSE = CatalogsLocale._(r'sv-SE');
  static const teIN = CatalogsLocale._(r'te-IN');
  static const thTH = CatalogsLocale._(r'th-TH');
  static const tlPH = CatalogsLocale._(r'tl-PH');
  static const tr = CatalogsLocale._(r'tr');
  static const ukUA = CatalogsLocale._(r'uk-UA');
  static const viVN = CatalogsLocale._(r'vi-VN');
  static const zhCN = CatalogsLocale._(r'zh-CN');
  static const zhTW = CatalogsLocale._(r'zh-TW');

  /// List of all possible values in this [enum][CatalogsLocale].
  static const values = <CatalogsLocale>[
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
  ];

  static CatalogsLocale? fromJson(dynamic value) => CatalogsLocaleTypeTransformer().decode(value);

  static List<CatalogsLocale> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsLocale>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsLocale.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsLocale] to String,
/// and [decode] dynamic data back to [CatalogsLocale].
class CatalogsLocaleTypeTransformer {
  factory CatalogsLocaleTypeTransformer() => _instance ??= const CatalogsLocaleTypeTransformer._();

  const CatalogsLocaleTypeTransformer._();

  String encode(CatalogsLocale data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsLocale.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsLocale? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'af-ZA': return CatalogsLocale.afZA;
        case r'ar-SA': return CatalogsLocale.arSA;
        case r'bg-BG': return CatalogsLocale.bgBG;
        case r'bn-IN': return CatalogsLocale.bnIN;
        case r'cs-CZ': return CatalogsLocale.csCZ;
        case r'da-DK': return CatalogsLocale.daDK;
        case r'de': return CatalogsLocale.de;
        case r'el-GR': return CatalogsLocale.elGR;
        case r'en-AU': return CatalogsLocale.enAU;
        case r'en-CA': return CatalogsLocale.enCA;
        case r'en-GB': return CatalogsLocale.enGB;
        case r'en-IN': return CatalogsLocale.enIN;
        case r'en-US': return CatalogsLocale.enUS;
        case r'es-419': return CatalogsLocale.es419;
        case r'es-AR': return CatalogsLocale.esAR;
        case r'es-ES': return CatalogsLocale.esES;
        case r'es-MX': return CatalogsLocale.esMX;
        case r'fi-FI': return CatalogsLocale.fiFI;
        case r'fr': return CatalogsLocale.fr;
        case r'fr-CA': return CatalogsLocale.frCA;
        case r'he-IL': return CatalogsLocale.heIL;
        case r'hi-IN': return CatalogsLocale.hiIN;
        case r'hr-HR': return CatalogsLocale.hrHR;
        case r'hu-HU': return CatalogsLocale.huHU;
        case r'id-ID': return CatalogsLocale.idID;
        case r'it': return CatalogsLocale.it;
        case r'ja': return CatalogsLocale.ja;
        case r'ko-KR': return CatalogsLocale.koKR;
        case r'ms-MY': return CatalogsLocale.msMY;
        case r'nb-NO': return CatalogsLocale.nbNO;
        case r'nl': return CatalogsLocale.nl;
        case r'pl-PL': return CatalogsLocale.plPL;
        case r'pt-BR': return CatalogsLocale.ptBR;
        case r'pt-PT': return CatalogsLocale.ptPT;
        case r'ro-RO': return CatalogsLocale.roRO;
        case r'ru-RU': return CatalogsLocale.ruRU;
        case r'sk-SK': return CatalogsLocale.skSK;
        case r'sv-SE': return CatalogsLocale.svSE;
        case r'te-IN': return CatalogsLocale.teIN;
        case r'th-TH': return CatalogsLocale.thTH;
        case r'tl-PH': return CatalogsLocale.tlPH;
        case r'tr': return CatalogsLocale.tr;
        case r'uk-UA': return CatalogsLocale.ukUA;
        case r'vi-VN': return CatalogsLocale.viVN;
        case r'zh-CN': return CatalogsLocale.zhCN;
        case r'zh-TW': return CatalogsLocale.zhTW;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsLocaleTypeTransformer] instance.
  static CatalogsLocaleTypeTransformer? _instance;
}

