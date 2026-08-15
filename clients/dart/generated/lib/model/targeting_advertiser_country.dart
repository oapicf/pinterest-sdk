//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Advertiser's ISO two character country code.
class TargetingAdvertiserCountry {
  /// Instantiate a new enum with the provided [value].
  const TargetingAdvertiserCountry._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const US = TargetingAdvertiserCountry._(r'US');
  static const GB = TargetingAdvertiserCountry._(r'GB');
  static const CA = TargetingAdvertiserCountry._(r'CA');
  static const IE = TargetingAdvertiserCountry._(r'IE');
  static const AU = TargetingAdvertiserCountry._(r'AU');
  static const NZ = TargetingAdvertiserCountry._(r'NZ');
  static const FR = TargetingAdvertiserCountry._(r'FR');
  static const SE = TargetingAdvertiserCountry._(r'SE');
  static const IL = TargetingAdvertiserCountry._(r'IL');
  static const DE = TargetingAdvertiserCountry._(r'DE');
  static const AT = TargetingAdvertiserCountry._(r'AT');
  static const IT = TargetingAdvertiserCountry._(r'IT');
  static const ES = TargetingAdvertiserCountry._(r'ES');
  static const NL = TargetingAdvertiserCountry._(r'NL');
  static const BE = TargetingAdvertiserCountry._(r'BE');
  static const PT = TargetingAdvertiserCountry._(r'PT');
  static const CH = TargetingAdvertiserCountry._(r'CH');
  static const HK = TargetingAdvertiserCountry._(r'HK');
  static const JP = TargetingAdvertiserCountry._(r'JP');
  static const KR = TargetingAdvertiserCountry._(r'KR');
  static const SG = TargetingAdvertiserCountry._(r'SG');
  static const NO = TargetingAdvertiserCountry._(r'NO');
  static const DK = TargetingAdvertiserCountry._(r'DK');
  static const FI = TargetingAdvertiserCountry._(r'FI');
  static const CY = TargetingAdvertiserCountry._(r'CY');
  static const LU = TargetingAdvertiserCountry._(r'LU');
  static const MT = TargetingAdvertiserCountry._(r'MT');
  static const PL = TargetingAdvertiserCountry._(r'PL');
  static const RO = TargetingAdvertiserCountry._(r'RO');
  static const HU = TargetingAdvertiserCountry._(r'HU');
  static const CZ = TargetingAdvertiserCountry._(r'CZ');
  static const GR = TargetingAdvertiserCountry._(r'GR');
  static const SK = TargetingAdvertiserCountry._(r'SK');
  static const BR = TargetingAdvertiserCountry._(r'BR');
  static const MX = TargetingAdvertiserCountry._(r'MX');
  static const AR = TargetingAdvertiserCountry._(r'AR');
  static const CL = TargetingAdvertiserCountry._(r'CL');
  static const CO = TargetingAdvertiserCountry._(r'CO');

  /// List of all possible values in this [enum][TargetingAdvertiserCountry].
  static const values = <TargetingAdvertiserCountry>[
    US,
    GB,
    CA,
    IE,
    AU,
    NZ,
    FR,
    SE,
    IL,
    DE,
    AT,
    IT,
    ES,
    NL,
    BE,
    PT,
    CH,
    HK,
    JP,
    KR,
    SG,
    NO,
    DK,
    FI,
    CY,
    LU,
    MT,
    PL,
    RO,
    HU,
    CZ,
    GR,
    SK,
    BR,
    MX,
    AR,
    CL,
    CO,
  ];

  static TargetingAdvertiserCountry? fromJson(dynamic value) => TargetingAdvertiserCountryTypeTransformer().decode(value);

  static List<TargetingAdvertiserCountry> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingAdvertiserCountry>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingAdvertiserCountry.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingAdvertiserCountry] to String,
/// and [decode] dynamic data back to [TargetingAdvertiserCountry].
class TargetingAdvertiserCountryTypeTransformer {
  factory TargetingAdvertiserCountryTypeTransformer() => _instance ??= const TargetingAdvertiserCountryTypeTransformer._();

  const TargetingAdvertiserCountryTypeTransformer._();

  String encode(TargetingAdvertiserCountry data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingAdvertiserCountry.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingAdvertiserCountry? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'US': return TargetingAdvertiserCountry.US;
        case r'GB': return TargetingAdvertiserCountry.GB;
        case r'CA': return TargetingAdvertiserCountry.CA;
        case r'IE': return TargetingAdvertiserCountry.IE;
        case r'AU': return TargetingAdvertiserCountry.AU;
        case r'NZ': return TargetingAdvertiserCountry.NZ;
        case r'FR': return TargetingAdvertiserCountry.FR;
        case r'SE': return TargetingAdvertiserCountry.SE;
        case r'IL': return TargetingAdvertiserCountry.IL;
        case r'DE': return TargetingAdvertiserCountry.DE;
        case r'AT': return TargetingAdvertiserCountry.AT;
        case r'IT': return TargetingAdvertiserCountry.IT;
        case r'ES': return TargetingAdvertiserCountry.ES;
        case r'NL': return TargetingAdvertiserCountry.NL;
        case r'BE': return TargetingAdvertiserCountry.BE;
        case r'PT': return TargetingAdvertiserCountry.PT;
        case r'CH': return TargetingAdvertiserCountry.CH;
        case r'HK': return TargetingAdvertiserCountry.HK;
        case r'JP': return TargetingAdvertiserCountry.JP;
        case r'KR': return TargetingAdvertiserCountry.KR;
        case r'SG': return TargetingAdvertiserCountry.SG;
        case r'NO': return TargetingAdvertiserCountry.NO;
        case r'DK': return TargetingAdvertiserCountry.DK;
        case r'FI': return TargetingAdvertiserCountry.FI;
        case r'CY': return TargetingAdvertiserCountry.CY;
        case r'LU': return TargetingAdvertiserCountry.LU;
        case r'MT': return TargetingAdvertiserCountry.MT;
        case r'PL': return TargetingAdvertiserCountry.PL;
        case r'RO': return TargetingAdvertiserCountry.RO;
        case r'HU': return TargetingAdvertiserCountry.HU;
        case r'CZ': return TargetingAdvertiserCountry.CZ;
        case r'GR': return TargetingAdvertiserCountry.GR;
        case r'SK': return TargetingAdvertiserCountry.SK;
        case r'BR': return TargetingAdvertiserCountry.BR;
        case r'MX': return TargetingAdvertiserCountry.MX;
        case r'AR': return TargetingAdvertiserCountry.AR;
        case r'CL': return TargetingAdvertiserCountry.CL;
        case r'CO': return TargetingAdvertiserCountry.CO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingAdvertiserCountryTypeTransformer] instance.
  static TargetingAdvertiserCountryTypeTransformer? _instance;
}

