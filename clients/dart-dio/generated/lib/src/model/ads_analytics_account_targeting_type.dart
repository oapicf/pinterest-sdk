//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'ads_analytics_account_targeting_type.g.dart';

class AdsAnalyticsAccountTargetingType extends EnumClass {

  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'KEYWORD')
  static const AdsAnalyticsAccountTargetingType KEYWORD = _$KEYWORD;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'APPTYPE')
  static const AdsAnalyticsAccountTargetingType APPTYPE = _$APPTYPE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GENDER')
  static const AdsAnalyticsAccountTargetingType GENDER = _$GENDER;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'LOCATION')
  static const AdsAnalyticsAccountTargetingType LOCATION = _$LOCATION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PLACEMENT')
  static const AdsAnalyticsAccountTargetingType PLACEMENT = _$PLACEMENT;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'COUNTRY')
  static const AdsAnalyticsAccountTargetingType COUNTRY = _$COUNTRY;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'TARGETED_INTEREST')
  static const AdsAnalyticsAccountTargetingType TARGETED_INTEREST = _$TARGETED_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'PINNER_INTEREST')
  static const AdsAnalyticsAccountTargetingType PINNER_INTEREST = _$PINNER_INTEREST;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AUDIENCE_INCLUDE')
  static const AdsAnalyticsAccountTargetingType AUDIENCE_INCLUDE = _$AUDIENCE_INCLUDE;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'GEO')
  static const AdsAnalyticsAccountTargetingType GEO = _$GEO;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET')
  static const AdsAnalyticsAccountTargetingType AGE_BUCKET = _$AGE_BUCKET;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'REGION')
  static const AdsAnalyticsAccountTargetingType REGION = _$REGION;
  /// Reporting targeting type
  @BuiltValueEnumConst(wireName: r'AGE_BUCKET_AND_GENDER')
  static const AdsAnalyticsAccountTargetingType AGE_BUCKET_AND_GENDER = _$AGE_BUCKET_AND_GENDER;

  static Serializer<AdsAnalyticsAccountTargetingType> get serializer => _$adsAnalyticsAccountTargetingTypeSerializer;

  const AdsAnalyticsAccountTargetingType._(String name): super(name);

  static BuiltSet<AdsAnalyticsAccountTargetingType> get values => _$values;
  static AdsAnalyticsAccountTargetingType valueOf(String name) => _$valueOf(name);
}

/// Optionally, enum_class can generate a mixin to go with your enum for use
/// with Angular. It exposes your enum constants as getters. So, if you mix it
/// in to your Dart component class, the values become available to the
/// corresponding Angular template.
///
/// Trigger mixin generation by writing a line like this one next to your enum.
abstract class AdsAnalyticsAccountTargetingTypeMixin = Object with _$AdsAnalyticsAccountTargetingTypeMixin;

