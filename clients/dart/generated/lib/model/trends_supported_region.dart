//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum TrendsSupportedRegion {
  US._(r'US'),
  CA._(r'CA'),
  DE._(r'DE'),
  FR._(r'FR'),
  ES._(r'ES'),
  IT._(r'IT'),
  dEPlusATPlusCH._(r'DE+AT+CH'),
  gBPlusIE._(r'GB+IE'),
  iTPlusESPlusPTPlusGRPlusMT._(r'IT+ES+PT+GR+MT'),
  pLPlusROPlusHUPlusSKPlusCZ._(r'PL+RO+HU+SK+CZ'),
  sEPlusDKPlusFIPlusNO._(r'SE+DK+FI+NO'),
  nLPlusBEPlusLU._(r'NL+BE+LU'),
  AR._(r'AR'),
  BR._(r'BR'),
  CO._(r'CO'),
  MX._(r'MX'),
  mXPlusARPlusCOPlusCL._(r'MX+AR+CO+CL'),
  aUPlusNZ._(r'AU+NZ'),
  ;

  /// Instantiate a new enum with the provided value.
  const TrendsSupportedRegion._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TrendsSupportedRegion] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TrendsSupportedRegion? fromJson(dynamic value) => TrendsSupportedRegionTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TrendsSupportedRegion]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(TrendsSupportedRegion data) => data._value;

  /// Returns the instance of [TrendsSupportedRegion] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TrendsSupportedRegion? decode(dynamic data, {bool allowNull = true}) {
    if (data is TrendsSupportedRegion) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static TrendsSupportedRegionTypeTransformer? _instance;
}

