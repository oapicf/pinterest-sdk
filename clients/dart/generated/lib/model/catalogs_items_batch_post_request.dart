//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class CatalogsItemsBatchPostRequest {
  /// Returns a new [CatalogsItemsBatchPostRequest] instance.
  CatalogsItemsBatchPostRequest({
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

  CatalogsItemsBatchPostRequestCatalogTypeEnum catalogType;

  Country country;

  /// Array with catalogs items
  List<ItemDeleteBatchRecord> items;

  /// We recommend using the CatalogsLocale values.
  CatalogsItemsBatchPostRequestLanguageEnum language;

  CatalogsItemsBatchPostRequestOperationEnum operation;

  @override
  bool operator ==(Object other) => identical(this, other) || other is CatalogsItemsBatchPostRequest &&
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
  String toString() => 'CatalogsItemsBatchPostRequest[catalogId=$catalogId, catalogType=$catalogType, country=$country, items=$items, language=$language, operation=$operation]';

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

  /// Returns a new [CatalogsItemsBatchPostRequest] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static CatalogsItemsBatchPostRequest? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        assert(json.containsKey(r'catalog_type'), 'Required key "CatalogsItemsBatchPostRequest[catalog_type]" is missing from JSON.');
        assert(json[r'catalog_type'] != null, 'Required key "CatalogsItemsBatchPostRequest[catalog_type]" has a null value in JSON.');
        assert(json.containsKey(r'country'), 'Required key "CatalogsItemsBatchPostRequest[country]" is missing from JSON.');
        assert(json[r'country'] != null, 'Required key "CatalogsItemsBatchPostRequest[country]" has a null value in JSON.');
        assert(json.containsKey(r'items'), 'Required key "CatalogsItemsBatchPostRequest[items]" is missing from JSON.');
        assert(json[r'items'] != null, 'Required key "CatalogsItemsBatchPostRequest[items]" has a null value in JSON.');
        assert(json.containsKey(r'language'), 'Required key "CatalogsItemsBatchPostRequest[language]" is missing from JSON.');
        assert(json[r'language'] != null, 'Required key "CatalogsItemsBatchPostRequest[language]" has a null value in JSON.');
        assert(json.containsKey(r'operation'), 'Required key "CatalogsItemsBatchPostRequest[operation]" is missing from JSON.');
        assert(json[r'operation'] != null, 'Required key "CatalogsItemsBatchPostRequest[operation]" has a null value in JSON.');
        return true;
      }());

      return CatalogsItemsBatchPostRequest(
        catalogId: mapValueOfType<String>(json, r'catalog_id'),
        catalogType: CatalogsItemsBatchPostRequestCatalogTypeEnum.fromJson(json[r'catalog_type'])!,
        country: Country.fromJson(json[r'country'])!,
        items: ItemDeleteBatchRecord.listFromJson(json[r'items']),
        language: CatalogsItemsBatchPostRequestLanguageEnum.fromJson(json[r'language'])!,
        operation: CatalogsItemsBatchPostRequestOperationEnum.fromJson(json[r'operation'])!,
      );
    }
    return null;
  }

  static List<CatalogsItemsBatchPostRequest> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchPostRequest>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchPostRequest.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, CatalogsItemsBatchPostRequest> mapFromJson(dynamic json) {
    final map = <String, CatalogsItemsBatchPostRequest>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = CatalogsItemsBatchPostRequest.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of CatalogsItemsBatchPostRequest-objects as value to a dart map
  static Map<String, List<CatalogsItemsBatchPostRequest>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<CatalogsItemsBatchPostRequest>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = CatalogsItemsBatchPostRequest.listFromJson(entry.value, growable: growable,);
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


enum CatalogsItemsBatchPostRequestCatalogTypeEnum {
  CREATIVE_ASSETS._(r'CREATIVE_ASSETS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsBatchPostRequestCatalogTypeEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsBatchPostRequestCatalogTypeEnum? fromJson(dynamic value) => CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsBatchPostRequestCatalogTypeEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsBatchPostRequestCatalogTypeEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchPostRequestCatalogTypeEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchPostRequestCatalogTypeEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsBatchPostRequestCatalogTypeEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsBatchPostRequestCatalogTypeEnum].
class CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer {
  factory CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer() => _instance ??= const CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer._();

  const CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer._();

  String encode(CatalogsItemsBatchPostRequestCatalogTypeEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestCatalogTypeEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchPostRequestCatalogTypeEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsBatchPostRequestCatalogTypeEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CREATIVE_ASSETS': return CatalogsItemsBatchPostRequestCatalogTypeEnum.CREATIVE_ASSETS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsBatchPostRequestCatalogTypeEnumTypeTransformer? _instance;
}


/// We recommend using the CatalogsLocale values.
enum CatalogsItemsBatchPostRequestLanguageEnum {
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
  const CatalogsItemsBatchPostRequestLanguageEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestLanguageEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsBatchPostRequestLanguageEnum? fromJson(dynamic value) => CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsBatchPostRequestLanguageEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsBatchPostRequestLanguageEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchPostRequestLanguageEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchPostRequestLanguageEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsBatchPostRequestLanguageEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsBatchPostRequestLanguageEnum].
class CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer {
  factory CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer() => _instance ??= const CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer._();

  const CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer._();

  String encode(CatalogsItemsBatchPostRequestLanguageEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestLanguageEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchPostRequestLanguageEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsBatchPostRequestLanguageEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'af-ZA': return CatalogsItemsBatchPostRequestLanguageEnum.afZA;
        case r'ar-SA': return CatalogsItemsBatchPostRequestLanguageEnum.arSA;
        case r'bg-BG': return CatalogsItemsBatchPostRequestLanguageEnum.bgBG;
        case r'bn-IN': return CatalogsItemsBatchPostRequestLanguageEnum.bnIN;
        case r'cs-CZ': return CatalogsItemsBatchPostRequestLanguageEnum.csCZ;
        case r'da-DK': return CatalogsItemsBatchPostRequestLanguageEnum.daDK;
        case r'de': return CatalogsItemsBatchPostRequestLanguageEnum.de;
        case r'el-GR': return CatalogsItemsBatchPostRequestLanguageEnum.elGR;
        case r'en-AU': return CatalogsItemsBatchPostRequestLanguageEnum.enAU;
        case r'en-CA': return CatalogsItemsBatchPostRequestLanguageEnum.enCA;
        case r'en-GB': return CatalogsItemsBatchPostRequestLanguageEnum.enGB;
        case r'en-IN': return CatalogsItemsBatchPostRequestLanguageEnum.enIN;
        case r'en-US': return CatalogsItemsBatchPostRequestLanguageEnum.enUS;
        case r'es-419': return CatalogsItemsBatchPostRequestLanguageEnum.es419;
        case r'es-AR': return CatalogsItemsBatchPostRequestLanguageEnum.esAR;
        case r'es-ES': return CatalogsItemsBatchPostRequestLanguageEnum.esES;
        case r'es-MX': return CatalogsItemsBatchPostRequestLanguageEnum.esMX;
        case r'fi-FI': return CatalogsItemsBatchPostRequestLanguageEnum.fiFI;
        case r'fr': return CatalogsItemsBatchPostRequestLanguageEnum.fr;
        case r'fr-CA': return CatalogsItemsBatchPostRequestLanguageEnum.frCA;
        case r'he-IL': return CatalogsItemsBatchPostRequestLanguageEnum.heIL;
        case r'hi-IN': return CatalogsItemsBatchPostRequestLanguageEnum.hiIN;
        case r'hr-HR': return CatalogsItemsBatchPostRequestLanguageEnum.hrHR;
        case r'hu-HU': return CatalogsItemsBatchPostRequestLanguageEnum.huHU;
        case r'id-ID': return CatalogsItemsBatchPostRequestLanguageEnum.idID;
        case r'it': return CatalogsItemsBatchPostRequestLanguageEnum.it;
        case r'ja': return CatalogsItemsBatchPostRequestLanguageEnum.ja;
        case r'ko-KR': return CatalogsItemsBatchPostRequestLanguageEnum.koKR;
        case r'ms-MY': return CatalogsItemsBatchPostRequestLanguageEnum.msMY;
        case r'nb-NO': return CatalogsItemsBatchPostRequestLanguageEnum.nbNO;
        case r'nl': return CatalogsItemsBatchPostRequestLanguageEnum.nl;
        case r'pl-PL': return CatalogsItemsBatchPostRequestLanguageEnum.plPL;
        case r'pt-BR': return CatalogsItemsBatchPostRequestLanguageEnum.ptBR;
        case r'pt-PT': return CatalogsItemsBatchPostRequestLanguageEnum.ptPT;
        case r'ro-RO': return CatalogsItemsBatchPostRequestLanguageEnum.roRO;
        case r'ru-RU': return CatalogsItemsBatchPostRequestLanguageEnum.ruRU;
        case r'sk-SK': return CatalogsItemsBatchPostRequestLanguageEnum.skSK;
        case r'sv-SE': return CatalogsItemsBatchPostRequestLanguageEnum.svSE;
        case r'te-IN': return CatalogsItemsBatchPostRequestLanguageEnum.teIN;
        case r'th-TH': return CatalogsItemsBatchPostRequestLanguageEnum.thTH;
        case r'tl-PH': return CatalogsItemsBatchPostRequestLanguageEnum.tlPH;
        case r'tr': return CatalogsItemsBatchPostRequestLanguageEnum.tr;
        case r'uk-UA': return CatalogsItemsBatchPostRequestLanguageEnum.ukUA;
        case r'vi-VN': return CatalogsItemsBatchPostRequestLanguageEnum.viVN;
        case r'zh-CN': return CatalogsItemsBatchPostRequestLanguageEnum.zhCN;
        case r'zh-TW': return CatalogsItemsBatchPostRequestLanguageEnum.zhTW;
        case r'AM': return CatalogsItemsBatchPostRequestLanguageEnum.AM;
        case r'AR': return CatalogsItemsBatchPostRequestLanguageEnum.AR;
        case r'AZ': return CatalogsItemsBatchPostRequestLanguageEnum.AZ;
        case r'BG': return CatalogsItemsBatchPostRequestLanguageEnum.BG;
        case r'BN': return CatalogsItemsBatchPostRequestLanguageEnum.BN;
        case r'BS': return CatalogsItemsBatchPostRequestLanguageEnum.BS;
        case r'CA': return CatalogsItemsBatchPostRequestLanguageEnum.CA;
        case r'CS': return CatalogsItemsBatchPostRequestLanguageEnum.CS;
        case r'DA': return CatalogsItemsBatchPostRequestLanguageEnum.DA;
        case r'DV': return CatalogsItemsBatchPostRequestLanguageEnum.DV;
        case r'DZ': return CatalogsItemsBatchPostRequestLanguageEnum.DZ;
        case r'DE': return CatalogsItemsBatchPostRequestLanguageEnum.DE;
        case r'EL': return CatalogsItemsBatchPostRequestLanguageEnum.EL;
        case r'EN': return CatalogsItemsBatchPostRequestLanguageEnum.EN;
        case r'ES': return CatalogsItemsBatchPostRequestLanguageEnum.ES;
        case r'ET': return CatalogsItemsBatchPostRequestLanguageEnum.ET;
        case r'FA': return CatalogsItemsBatchPostRequestLanguageEnum.FA;
        case r'FI': return CatalogsItemsBatchPostRequestLanguageEnum.FI;
        case r'FR': return CatalogsItemsBatchPostRequestLanguageEnum.FR;
        case r'HE': return CatalogsItemsBatchPostRequestLanguageEnum.HE;
        case r'HI': return CatalogsItemsBatchPostRequestLanguageEnum.HI;
        case r'HR': return CatalogsItemsBatchPostRequestLanguageEnum.HR;
        case r'HU': return CatalogsItemsBatchPostRequestLanguageEnum.HU;
        case r'HY': return CatalogsItemsBatchPostRequestLanguageEnum.HY;
        case r'ID': return CatalogsItemsBatchPostRequestLanguageEnum.ID;
        case r'IN': return CatalogsItemsBatchPostRequestLanguageEnum.IN;
        case r'IS': return CatalogsItemsBatchPostRequestLanguageEnum.IS;
        case r'IT': return CatalogsItemsBatchPostRequestLanguageEnum.IT;
        case r'IW': return CatalogsItemsBatchPostRequestLanguageEnum.IW;
        case r'JA': return CatalogsItemsBatchPostRequestLanguageEnum.JA;
        case r'KA': return CatalogsItemsBatchPostRequestLanguageEnum.KA;
        case r'KM': return CatalogsItemsBatchPostRequestLanguageEnum.KM;
        case r'KO': return CatalogsItemsBatchPostRequestLanguageEnum.KO;
        case r'LO': return CatalogsItemsBatchPostRequestLanguageEnum.LO;
        case r'LT': return CatalogsItemsBatchPostRequestLanguageEnum.LT;
        case r'LV': return CatalogsItemsBatchPostRequestLanguageEnum.LV;
        case r'MK': return CatalogsItemsBatchPostRequestLanguageEnum.MK;
        case r'MN': return CatalogsItemsBatchPostRequestLanguageEnum.MN;
        case r'MS': return CatalogsItemsBatchPostRequestLanguageEnum.MS;
        case r'MY': return CatalogsItemsBatchPostRequestLanguageEnum.MY;
        case r'NB': return CatalogsItemsBatchPostRequestLanguageEnum.NB;
        case r'NE': return CatalogsItemsBatchPostRequestLanguageEnum.NE;
        case r'NL': return CatalogsItemsBatchPostRequestLanguageEnum.NL;
        case r'false': return CatalogsItemsBatchPostRequestLanguageEnum.false_;
        case r'PL': return CatalogsItemsBatchPostRequestLanguageEnum.PL;
        case r'PT': return CatalogsItemsBatchPostRequestLanguageEnum.PT;
        case r'RO': return CatalogsItemsBatchPostRequestLanguageEnum.RO;
        case r'RU': return CatalogsItemsBatchPostRequestLanguageEnum.RU;
        case r'SK': return CatalogsItemsBatchPostRequestLanguageEnum.SK;
        case r'SL': return CatalogsItemsBatchPostRequestLanguageEnum.SL;
        case r'SQ': return CatalogsItemsBatchPostRequestLanguageEnum.SQ;
        case r'SR': return CatalogsItemsBatchPostRequestLanguageEnum.SR;
        case r'SV': return CatalogsItemsBatchPostRequestLanguageEnum.SV;
        case r'TL': return CatalogsItemsBatchPostRequestLanguageEnum.TL;
        case r'UK': return CatalogsItemsBatchPostRequestLanguageEnum.UK;
        case r'VI': return CatalogsItemsBatchPostRequestLanguageEnum.VI;
        case r'TE': return CatalogsItemsBatchPostRequestLanguageEnum.TE;
        case r'TH': return CatalogsItemsBatchPostRequestLanguageEnum.TH;
        case r'TR': return CatalogsItemsBatchPostRequestLanguageEnum.TR;
        case r'XX': return CatalogsItemsBatchPostRequestLanguageEnum.XX;
        case r'ZH': return CatalogsItemsBatchPostRequestLanguageEnum.ZH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsBatchPostRequestLanguageEnumTypeTransformer? _instance;
}



enum CatalogsItemsBatchPostRequestOperationEnum {
  DELETE._(r'DELETE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsItemsBatchPostRequestOperationEnum._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestOperationEnum] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsItemsBatchPostRequestOperationEnum? fromJson(dynamic value) => CatalogsItemsBatchPostRequestOperationEnumTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsItemsBatchPostRequestOperationEnum]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsItemsBatchPostRequestOperationEnum> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsItemsBatchPostRequestOperationEnum>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsItemsBatchPostRequestOperationEnum.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsItemsBatchPostRequestOperationEnum] to String,
/// and [decode] dynamic data back to [CatalogsItemsBatchPostRequestOperationEnum].
class CatalogsItemsBatchPostRequestOperationEnumTypeTransformer {
  factory CatalogsItemsBatchPostRequestOperationEnumTypeTransformer() => _instance ??= const CatalogsItemsBatchPostRequestOperationEnumTypeTransformer._();

  const CatalogsItemsBatchPostRequestOperationEnumTypeTransformer._();

  String encode(CatalogsItemsBatchPostRequestOperationEnum data) => data._value;

  /// Returns the instance of [CatalogsItemsBatchPostRequestOperationEnum] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsItemsBatchPostRequestOperationEnum? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsItemsBatchPostRequestOperationEnum) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DELETE': return CatalogsItemsBatchPostRequestOperationEnum.DELETE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsItemsBatchPostRequestOperationEnumTypeTransformer? _instance;
}


