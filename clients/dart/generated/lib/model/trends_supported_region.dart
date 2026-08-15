//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TrendsSupportedRegion {
  /// Instantiate a new enum with the provided [value].
  const TrendsSupportedRegion._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const US = TrendsSupportedRegion._(r'US');
  static const CA = TrendsSupportedRegion._(r'CA');
  static const DE = TrendsSupportedRegion._(r'DE');
  static const FR = TrendsSupportedRegion._(r'FR');
  static const ES = TrendsSupportedRegion._(r'ES');
  static const IT = TrendsSupportedRegion._(r'IT');
  static const dEPlusATPlusCH = TrendsSupportedRegion._(r'DE+AT+CH');
  static const gBPlusIE = TrendsSupportedRegion._(r'GB+IE');
  static const iTPlusESPlusPTPlusGRPlusMT = TrendsSupportedRegion._(r'IT+ES+PT+GR+MT');
  static const pLPlusROPlusHUPlusSKPlusCZ = TrendsSupportedRegion._(r'PL+RO+HU+SK+CZ');
  static const sEPlusDKPlusFIPlusNO = TrendsSupportedRegion._(r'SE+DK+FI+NO');
  static const nLPlusBEPlusLU = TrendsSupportedRegion._(r'NL+BE+LU');
  static const AR = TrendsSupportedRegion._(r'AR');
  static const BR = TrendsSupportedRegion._(r'BR');
  static const CO = TrendsSupportedRegion._(r'CO');
  static const MX = TrendsSupportedRegion._(r'MX');
  static const mXPlusARPlusCOPlusCL = TrendsSupportedRegion._(r'MX+AR+CO+CL');
  static const aUPlusNZ = TrendsSupportedRegion._(r'AU+NZ');

  /// List of all possible values in this [enum][TrendsSupportedRegion].
  static const values = <TrendsSupportedRegion>[
    US,
    CA,
    DE,
    FR,
    ES,
    IT,
    dEPlusATPlusCH,
    gBPlusIE,
    iTPlusESPlusPTPlusGRPlusMT,
    pLPlusROPlusHUPlusSKPlusCZ,
    sEPlusDKPlusFIPlusNO,
    nLPlusBEPlusLU,
    AR,
    BR,
    CO,
    MX,
    mXPlusARPlusCOPlusCL,
    aUPlusNZ,
  ];

  static TrendsSupportedRegion? fromJson(dynamic value) => TrendsSupportedRegionTypeTransformer().decode(value);

  static List<TrendsSupportedRegion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TrendsSupportedRegion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TrendsSupportedRegion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TrendsSupportedRegion] to String,
/// and [decode] dynamic data back to [TrendsSupportedRegion].
class TrendsSupportedRegionTypeTransformer {
  factory TrendsSupportedRegionTypeTransformer() => _instance ??= const TrendsSupportedRegionTypeTransformer._();

  const TrendsSupportedRegionTypeTransformer._();

  String encode(TrendsSupportedRegion data) => data.value;

  /// Decodes a [dynamic value][data] to a TrendsSupportedRegion.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendsSupportedRegion? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'US': return TrendsSupportedRegion.US;
        case r'CA': return TrendsSupportedRegion.CA;
        case r'DE': return TrendsSupportedRegion.DE;
        case r'FR': return TrendsSupportedRegion.FR;
        case r'ES': return TrendsSupportedRegion.ES;
        case r'IT': return TrendsSupportedRegion.IT;
        case r'DE+AT+CH': return TrendsSupportedRegion.dEPlusATPlusCH;
        case r'GB+IE': return TrendsSupportedRegion.gBPlusIE;
        case r'IT+ES+PT+GR+MT': return TrendsSupportedRegion.iTPlusESPlusPTPlusGRPlusMT;
        case r'PL+RO+HU+SK+CZ': return TrendsSupportedRegion.pLPlusROPlusHUPlusSKPlusCZ;
        case r'SE+DK+FI+NO': return TrendsSupportedRegion.sEPlusDKPlusFIPlusNO;
        case r'NL+BE+LU': return TrendsSupportedRegion.nLPlusBEPlusLU;
        case r'AR': return TrendsSupportedRegion.AR;
        case r'BR': return TrendsSupportedRegion.BR;
        case r'CO': return TrendsSupportedRegion.CO;
        case r'MX': return TrendsSupportedRegion.MX;
        case r'MX+AR+CO+CL': return TrendsSupportedRegion.mXPlusARPlusCOPlusCL;
        case r'AU+NZ': return TrendsSupportedRegion.aUPlusNZ;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TrendsSupportedRegionTypeTransformer] instance.
  static TrendsSupportedRegionTypeTransformer? _instance;
}

