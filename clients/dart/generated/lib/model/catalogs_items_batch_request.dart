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

  CatalogsItemsBatchRequestOperationEnum operation;

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
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsBatchRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsBatchRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsItemsBatchRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsItemsBatchRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsBatchRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsBatchRequest[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsItemsBatchRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsItemsBatchRequest[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsBatchRequest(
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteBatchRecord.listFromJson(json[r'items']),
        language: CatalogsItemsBatchRequestLanguageEnum.fromJson(json[r'language'])!,
        operation: CatalogsItemsBatchRequestOperationEnum.fromJson(json[r'operation'])!,
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
enum CatalogsItemsBatchRequestLanguageEnum {
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
  const CatalogsItemsBatchRequestLanguageEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsBatchRequestLanguageEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsBatchRequestLanguageEnum? fromJson(dynamic value) => CatalogsItemsBatchRequestLanguageEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsBatchRequestLanguageEnum]
  /// that were successfully decoded from the passed [JSON][json].
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

  String encode(CatalogsItemsBatchRequestLanguageEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsBatchRequestLanguageEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsBatchRequestLanguageEnum) {
      return data;
    }
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
        case r'false': return CatalogsItemsBatchRequestLanguageEnum.false_;
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

  /// The singleton instance of this transformer.
  static CatalogsItemsBatchRequestLanguageEnumTypeTransformer? _instance;
}



enum CatalogsItemsBatchRequestOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsBatchRequestOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsBatchRequestOperationEnum? fromJson(dynamic value) => CatalogsItemsBatchRequestOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsBatchRequestOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsBatchRequestOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchRequestOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchRequestOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsBatchRequestOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsBatchRequestOperationEnum].
class CatalogsItemsBatchRequestOperationEnumTypeTransformer {
  factory CatalogsItemsBatchRequestOperationEnumTypeTransformer() => _instance ??= const CatalogsItemsBatchRequestOperationEnumTypeTransformer._();

  const CatalogsItemsBatchRequestOperationEnumTypeTransformer._();

  String encode(CatalogsItemsBatchRequestOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsBatchRequestOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchRequestOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsBatchRequestOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsItemsBatchRequestOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsBatchRequestOperationEnumTypeTransformer? _instance;
}


