//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_targeting_type.g.dart';

class AdsAnalyticsTargetingType extends EnumClass {

  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsTargetingType KEYWORD = _$KEYWORD;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsTargetingType APPTYPE = _$APPTYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsTargetingType GENDER = _$GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsTargetingType LOCATION = _$LOCATION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsTargetingType PLACEMENT = _$PLACEMENT;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsTargetingType COUNTRY = _$COUNTRY;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsTargetingType TARGETED_INTEREST = _$TARGETED_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsTargetingType PINNER_INTEREST = _$PINNER_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsTargetingType GEO = _$GEO;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsTargetingType AGE_BUCKET = _$AGE_BUCKET;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsTargetingType REGION = _$REGION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsTargetingType AGE_BUCKET_AND_GENDER = _$AGE_BUCKET_AND_GENDER;

  static Serializer<AdsAnalyticsTargetingType> get serializer => _$adsAnalyticsTargetingTypeSerializer;

  const AdsAnalyticsTargetingType._(String name): super(name);

  static BuiltSet<AdsAnalyticsTargetingType> get values => _$values;
  static AdsAnalyticsTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsTargetingTypeMixin = Object with _$AdsAnalyticsTargetingTypeMixin;

