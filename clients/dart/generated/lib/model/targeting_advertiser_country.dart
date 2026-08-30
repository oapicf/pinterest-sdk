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
enum TargetingAdvertiserCountry {
  US._(r'US'),
  GB._(r'GB'),
  CA._(r'CA'),
  IE._(r'IE'),
  AU._(r'AU'),
  NZ._(r'NZ'),
  FR._(r'FR'),
  SE._(r'SE'),
  IL._(r'IL'),
  DE._(r'DE'),
  AT._(r'AT'),
  IT._(r'IT'),
  ES._(r'ES'),
  NL._(r'NL'),
  BE._(r'BE'),
  PT._(r'PT'),
  CH._(r'CH'),
  HK._(r'HK'),
  JP._(r'JP'),
  KR._(r'KR'),
  SG._(r'SG'),
  false_._(r'false'),
  DK._(r'DK'),
  FI._(r'FI'),
  CY._(r'CY'),
  LU._(r'LU'),
  MT._(r'MT'),
  PL._(r'PL'),
  RO._(r'RO'),
  HU._(r'HU'),
  CZ._(r'CZ'),
  GR._(r'GR'),
  SK._(r'SK'),
  BR._(r'BR'),
  MX._(r'MX'),
  AR._(r'AR'),
  CL._(r'CL'),
  CO._(r'CO'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingAdvertiserCountry._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingAdvertiserCountry] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingAdvertiserCountry? fromJson(dynamic value) => TargetingAdvertiserCountryTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingAdvertiserCountry]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(TargetingAdvertiserCountry data) => data._value;

  /// Returns the instance of [TargetingAdvertiserCountry] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingAdvertiserCountry? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingAdvertiserCountry) {
      return data;
    }
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
        case r'false': return TargetingAdvertiserCountry.false_;
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

  /// The singleton instance of this transformer.
  static TargetingAdvertiserCountryTypeTransformer? _instance;
}

