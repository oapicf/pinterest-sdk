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
class Language {
  /// Instantiate a new enum with the provided [value].
  const Language._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const AM = Language._(r'AM');
  static const AR = Language._(r'AR');
  static const AZ = Language._(r'AZ');
  static const BG = Language._(r'BG');
  static const BN = Language._(r'BN');
  static const BS = Language._(r'BS');
  static const CA = Language._(r'CA');
  static const CS = Language._(r'CS');
  static const DA = Language._(r'DA');
  static const DV = Language._(r'DV');
  static const DZ = Language._(r'DZ');
  static const DE = Language._(r'DE');
  static const EL = Language._(r'EL');
  static const EN = Language._(r'EN');
  static const ES = Language._(r'ES');
  static const ET = Language._(r'ET');
  static const FA = Language._(r'FA');
  static const FI = Language._(r'FI');
  static const FR = Language._(r'FR');
  static const HE = Language._(r'HE');
  static const HI = Language._(r'HI');
  static const HR = Language._(r'HR');
  static const HU = Language._(r'HU');
  static const HY = Language._(r'HY');
  static const ID = Language._(r'ID');
  static const IN = Language._(r'IN');
  static const IS = Language._(r'IS');
  static const IT = Language._(r'IT');
  static const IW = Language._(r'IW');
  static const JA = Language._(r'JA');
  static const KA = Language._(r'KA');
  static const KM = Language._(r'KM');
  static const KO = Language._(r'KO');
  static const LO = Language._(r'LO');
  static const LT = Language._(r'LT');
  static const LV = Language._(r'LV');
  static const MK = Language._(r'MK');
  static const MN = Language._(r'MN');
  static const MS = Language._(r'MS');
  static const MY = Language._(r'MY');
  static const NB = Language._(r'NB');
  static const NE = Language._(r'NE');
  static const NL = Language._(r'NL');
  static const NO = Language._(r'NO');
  static const PL = Language._(r'PL');
  static const PT = Language._(r'PT');
  static const RO = Language._(r'RO');
  static const RU = Language._(r'RU');
  static const SK = Language._(r'SK');
  static const SL = Language._(r'SL');
  static const SQ = Language._(r'SQ');
  static const SR = Language._(r'SR');
  static const SV = Language._(r'SV');
  static const TL = Language._(r'TL');
  static const UK = Language._(r'UK');
  static const VI = Language._(r'VI');
  static const TE = Language._(r'TE');
  static const TH = Language._(r'TH');
  static const TR = Language._(r'TR');
  static const XX = Language._(r'XX');
  static const ZH = Language._(r'ZH');

  /// List of all possible values in this [enum][Language].
  static const values = <Language>[
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

  static Language? fromJson(dynamic value) => LanguageTypeTransformer().decode(value);

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

  String encode(Language data) => data.value;

  /// Decodes a [dynamic value][data] to a Language.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  Language? decode(dynamic data, {bool allowNull = true}) {
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
        case r'NO': return Language.NO;
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

  /// Singleton [LanguageTypeTransformer] instance.
  static LanguageTypeTransformer? _instance;
}

