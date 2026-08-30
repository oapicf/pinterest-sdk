//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Language code, which is among the official ISO 639-1 language list.
enum Language {
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
  const Language._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [Language] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static Language? fromJson(dynamic value) => LanguageTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [Language]
  /// that were successfully decoded from the passed [JSON][json].
  static List<Language> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <Language>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = Language.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [Language] to String,
/// and [decode] dynamic data back to [Language].
class LanguageTypeTransformer {
  factory LanguageTypeTransformer() => _instance ??= const LanguageTypeTransformer._();

  const LanguageTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(Language data) => data._value;

  /// Returns the instance of [Language] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Language? decode(dynamic data, {bool allowNull = true}) {
    if (data is Language) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AM': return Language.AM;
        case r'AR': return Language.AR;
        case r'AZ': return Language.AZ;
        case r'BG': return Language.BG;
        case r'BN': return Language.BN;
        case r'BS': return Language.BS;
        case r'CA': return Language.CA;
        case r'CS': return Language.CS;
        case r'DA': return Language.DA;
        case r'DV': return Language.DV;
        case r'DZ': return Language.DZ;
        case r'DE': return Language.DE;
        case r'EL': return Language.EL;
        case r'EN': return Language.EN;
        case r'ES': return Language.ES;
        case r'ET': return Language.ET;
        case r'FA': return Language.FA;
        case r'FI': return Language.FI;
        case r'FR': return Language.FR;
        case r'HE': return Language.HE;
        case r'HI': return Language.HI;
        case r'HR': return Language.HR;
        case r'HU': return Language.HU;
        case r'HY': return Language.HY;
        case r'ID': return Language.ID;
        case r'IN': return Language.IN;
        case r'IS': return Language.IS;
        case r'IT': return Language.IT;
        case r'IW': return Language.IW;
        case r'JA': return Language.JA;
        case r'KA': return Language.KA;
        case r'KM': return Language.KM;
        case r'KO': return Language.KO;
        case r'LO': return Language.LO;
        case r'LT': return Language.LT;
        case r'LV': return Language.LV;
        case r'MK': return Language.MK;
        case r'MN': return Language.MN;
        case r'MS': return Language.MS;
        case r'MY': return Language.MY;
        case r'NB': return Language.NB;
        case r'NE': return Language.NE;
        case r'NL': return Language.NL;
        case r'false': return Language.false_;
        case r'PL': return Language.PL;
        case r'PT': return Language.PT;
        case r'RO': return Language.RO;
        case r'RU': return Language.RU;
        case r'SK': return Language.SK;
        case r'SL': return Language.SL;
        case r'SQ': return Language.SQ;
        case r'SR': return Language.SR;
        case r'SV': return Language.SV;
        case r'TL': return Language.TL;
        case r'UK': return Language.UK;
        case r'VI': return Language.VI;
        case r'TE': return Language.TE;
        case r'TH': return Language.TH;
        case r'TR': return Language.TR;
        case r'XX': return Language.XX;
        case r'ZH': return Language.ZH;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static LanguageTypeTransformer? _instance;
}

