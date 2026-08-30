//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting targeting type for ad groups
enum AdsAnalyticsAdGroupTargetingType {
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
  AGE_BUCKET_AND_GENDER._(r'AGE_BUCKET_AND_GENDER'),
  CREATIVE_ENHANCEMENTS._(r'CREATIVE_ENHANCEMENTS'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsAnalyticsAdGroupTargetingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsAnalyticsAdGroupTargetingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsAnalyticsAdGroupTargetingType? fromJson(dynamic value) => AdsAnalyticsAdGroupTargetingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsAnalyticsAdGroupTargetingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdsAnalyticsAdGroupTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsAdGroupTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsAdGroupTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsAdGroupTargetingType] to String,
/// and [decode] dynamic data back to [AdsAnalyticsAdGroupTargetingType].
class AdsAnalyticsAdGroupTargetingTypeTypeTransformer {
  factory AdsAnalyticsAdGroupTargetingTypeTypeTransformer() => _instance ??= const AdsAnalyticsAdGroupTargetingTypeTypeTransformer._();

  const AdsAnalyticsAdGroupTargetingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsAnalyticsAdGroupTargetingType data) => data._value;

  /// Returns the instance of [AdsAnalyticsAdGroupTargetingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsAdGroupTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsAnalyticsAdGroupTargetingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdsAnalyticsAdGroupTargetingType.KEYWORD;
        case r'APPTYPE': return AdsAnalyticsAdGroupTargetingType.APPTYPE;
        case r'GENDER': return AdsAnalyticsAdGroupTargetingType.GENDER;
        case r'LOCATION': return AdsAnalyticsAdGroupTargetingType.LOCATION;
        case r'PLACEMENT': return AdsAnalyticsAdGroupTargetingType.PLACEMENT;
        case r'COUNTRY': return AdsAnalyticsAdGroupTargetingType.COUNTRY;
        case r'TARGETED_INTEREST': return AdsAnalyticsAdGroupTargetingType.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdsAnalyticsAdGroupTargetingType.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdsAnalyticsAdGroupTargetingType.AUDIENCE_INCLUDE;
        case r'GEO': return AdsAnalyticsAdGroupTargetingType.GEO;
        case r'AGE_BUCKET': return AdsAnalyticsAdGroupTargetingType.AGE_BUCKET;
        case r'REGION': return AdsAnalyticsAdGroupTargetingType.REGION;
        case r'AGE_BUCKET_AND_GENDER': return AdsAnalyticsAdGroupTargetingType.AGE_BUCKET_AND_GENDER;
        case r'CREATIVE_ENHANCEMENTS': return AdsAnalyticsAdGroupTargetingType.CREATIVE_ENHANCEMENTS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdsAnalyticsAdGroupTargetingTypeTypeTransformer? _instance;
}

