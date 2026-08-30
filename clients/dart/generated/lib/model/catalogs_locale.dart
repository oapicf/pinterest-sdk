//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum CatalogsLocale {
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
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsLocale._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsLocale] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsLocale? fromJson(dynamic value) => CatalogsLocaleTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsLocale]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsLocale data) => data._value;

  /// Returns the instance of [CatalogsLocale] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsLocale? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsLocale) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static CatalogsLocaleTypeTransformer? _instance;
}

