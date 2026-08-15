//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'trends_supported_region.g.dart';

class TrendsSupportedRegion extends EnumClass {

  @BuiltValueEnumConst(wireName: r'US')
  static const TrendsSupportedRegion US = _$US;
  @BuiltValueEnumConst(wireName: r'CA')
  static const TrendsSupportedRegion CA = _$CA;
  @BuiltValueEnumConst(wireName: r'DE')
  static const TrendsSupportedRegion DE = _$DE;
  @BuiltValueEnumConst(wireName: r'FR')
  static const TrendsSupportedRegion FR = _$FR;
  @BuiltValueEnumConst(wireName: r'ES')
  static const TrendsSupportedRegion ES = _$ES;
  @BuiltValueEnumConst(wireName: r'IT')
  static const TrendsSupportedRegion IT = _$IT;
  @BuiltValueEnumConst(wireName: r'DE+AT+CH')
  static const TrendsSupportedRegion dEPlusATPlusCH = _$dEPlusATPlusCH;
  @BuiltValueEnumConst(wireName: r'GB+IE')
  static const TrendsSupportedRegion gBPlusIE = _$gBPlusIE;
  @BuiltValueEnumConst(wireName: r'IT+ES+PT+GR+MT')
  static const TrendsSupportedRegion iTPlusESPlusPTPlusGRPlusMT = _$iTPlusESPlusPTPlusGRPlusMT;
  @BuiltValueEnumConst(wireName: r'PL+RO+HU+SK+CZ')
  static const TrendsSupportedRegion pLPlusROPlusHUPlusSKPlusCZ = _$pLPlusROPlusHUPlusSKPlusCZ;
  @BuiltValueEnumConst(wireName: r'SE+DK+FI+NO')
  static const TrendsSupportedRegion sEPlusDKPlusFIPlusNO = _$sEPlusDKPlusFIPlusNO;
  @BuiltValueEnumConst(wireName: r'NL+BE+LU')
  static const TrendsSupportedRegion nLPlusBEPlusLU = _$nLPlusBEPlusLU;
  @BuiltValueEnumConst(wireName: r'AR')
  static const TrendsSupportedRegion AR = _$AR;
  @BuiltValueEnumConst(wireName: r'BR')
  static const TrendsSupportedRegion BR = _$BR;
  @BuiltValueEnumConst(wireName: r'CO')
  static const TrendsSupportedRegion CO = _$CO;
  @BuiltValueEnumConst(wireName: r'MX')
  static const TrendsSupportedRegion MX = _$MX;
  @BuiltValueEnumConst(wireName: r'MX+AR+CO+CL')
  static const TrendsSupportedRegion mXPlusARPlusCOPlusCL = _$mXPlusARPlusCOPlusCL;
  @BuiltValueEnumConst(wireName: r'AU+NZ')
  static const TrendsSupportedRegion aUPlusNZ = _$aUPlusNZ;

  static Serializer<TrendsSupportedRegion> get serializer => _$trendsSupportedRegionSerializer;

  const TrendsSupportedRegion._(String name): super(name);

  static BuiltSet<TrendsSupportedRegion> get values => _$values;
  static TrendsSupportedRegion valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class TrendsSupportedRegionMixin = Object with _$TrendsSupportedRegionMixin;

