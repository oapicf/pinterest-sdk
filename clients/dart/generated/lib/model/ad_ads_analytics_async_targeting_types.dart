//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting targeting type
enum AdAdsAnalyticsAsyncTargetingTypes {
  KEYWORD._(r'KEYWORD'),
  APPTYPE._(r'APPTYPE'),
  GENDER._(r'GENDER'),
  LOCATION._(r'LOCATION'),
  PLACEMENT._(r'PLACEMENT'),
  COUNTRY._(r'COUNTRY'),
  TARGETED_INTEREST._(r'TARGETED_INTEREST'),
  PINNER_INTEREST._(r'PINNER_INTEREST'),
  AUDIENCE_INCLUDE._(r'AUDIENCE_INCLUDE'),
  GEO._(r'GEO'),
  AGE_BUCKET._(r'AGE_BUCKET'),
  REGION._(r'REGION'),
  MEDIA_TYPE._(r'MEDIA_TYPE'),
  AGE_BUCKET_AND_GENDER._(r'AGE_BUCKET_AND_GENDER'),
  AUDIENCE_MULTIPLIER._(r'AUDIENCE_MULTIPLIER'),
  CREATIVE_ENHANCEMENTS._(r'CREATIVE_ENHANCEMENTS'),
  LOCAL_ADS_STORE_CODE._(r'LOCAL_ADS_STORE_CODE'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdAdsAnalyticsAsyncTargetingTypes._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdAdsAnalyticsAsyncTargetingTypes] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdAdsAnalyticsAsyncTargetingTypes? fromJson(dynamic value) => AdAdsAnalyticsAsyncTargetingTypesTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdAdsAnalyticsAsyncTargetingTypes]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdAdsAnalyticsAsyncTargetingTypes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAdsAnalyticsAsyncTargetingTypes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAdsAnalyticsAsyncTargetingTypes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdAdsAnalyticsAsyncTargetingTypes] to String,
/// and [decode] dynamic data back to [AdAdsAnalyticsAsyncTargetingTypes].
class AdAdsAnalyticsAsyncTargetingTypesTypeTransformer {
  factory AdAdsAnalyticsAsyncTargetingTypesTypeTransformer() => _instance ??= const AdAdsAnalyticsAsyncTargetingTypesTypeTransformer._();

  const AdAdsAnalyticsAsyncTargetingTypesTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdAdsAnalyticsAsyncTargetingTypes data) => data._value;

  /// Returns the instance of [AdAdsAnalyticsAsyncTargetingTypes] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdAdsAnalyticsAsyncTargetingTypes? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdAdsAnalyticsAsyncTargetingTypes) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdAdsAnalyticsAsyncTargetingTypes.KEYWORD;
        case r'APPTYPE': return AdAdsAnalyticsAsyncTargetingTypes.APPTYPE;
        case r'GENDER': return AdAdsAnalyticsAsyncTargetingTypes.GENDER;
        case r'LOCATION': return AdAdsAnalyticsAsyncTargetingTypes.LOCATION;
        case r'PLACEMENT': return AdAdsAnalyticsAsyncTargetingTypes.PLACEMENT;
        case r'COUNTRY': return AdAdsAnalyticsAsyncTargetingTypes.COUNTRY;
        case r'TARGETED_INTEREST': return AdAdsAnalyticsAsyncTargetingTypes.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdAdsAnalyticsAsyncTargetingTypes.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdAdsAnalyticsAsyncTargetingTypes.AUDIENCE_INCLUDE;
        case r'GEO': return AdAdsAnalyticsAsyncTargetingTypes.GEO;
        case r'AGE_BUCKET': return AdAdsAnalyticsAsyncTargetingTypes.AGE_BUCKET;
        case r'REGION': return AdAdsAnalyticsAsyncTargetingTypes.REGION;
        case r'MEDIA_TYPE': return AdAdsAnalyticsAsyncTargetingTypes.MEDIA_TYPE;
        case r'AGE_BUCKET_AND_GENDER': return AdAdsAnalyticsAsyncTargetingTypes.AGE_BUCKET_AND_GENDER;
        case r'AUDIENCE_MULTIPLIER': return AdAdsAnalyticsAsyncTargetingTypes.AUDIENCE_MULTIPLIER;
        case r'CREATIVE_ENHANCEMENTS': return AdAdsAnalyticsAsyncTargetingTypes.CREATIVE_ENHANCEMENTS;
        case r'LOCAL_ADS_STORE_CODE': return AdAdsAnalyticsAsyncTargetingTypes.LOCAL_ADS_STORE_CODE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdAdsAnalyticsAsyncTargetingTypesTypeTransformer? _instance;
}

