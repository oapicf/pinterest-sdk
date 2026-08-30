//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting targeting type for ads
enum AdsAnalyticsAdTargetingType {
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
  QUIZ_RESULT._(r'QUIZ_RESULT'),
  AGE_BUCKET_AND_GENDER._(r'AGE_BUCKET_AND_GENDER'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsAnalyticsAdTargetingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsAnalyticsAdTargetingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsAnalyticsAdTargetingType? fromJson(dynamic value) => AdsAnalyticsAdTargetingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsAnalyticsAdTargetingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdsAnalyticsAdTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsAdTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsAdTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsAdTargetingType] to String,
/// and [decode] dynamic data back to [AdsAnalyticsAdTargetingType].
class AdsAnalyticsAdTargetingTypeTypeTransformer {
  factory AdsAnalyticsAdTargetingTypeTypeTransformer() => _instance ??= const AdsAnalyticsAdTargetingTypeTypeTransformer._();

  const AdsAnalyticsAdTargetingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsAnalyticsAdTargetingType data) => data._value;

  /// Returns the instance of [AdsAnalyticsAdTargetingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsAdTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsAnalyticsAdTargetingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdsAnalyticsAdTargetingType.KEYWORD;
        case r'APPTYPE': return AdsAnalyticsAdTargetingType.APPTYPE;
        case r'GENDER': return AdsAnalyticsAdTargetingType.GENDER;
        case r'LOCATION': return AdsAnalyticsAdTargetingType.LOCATION;
        case r'PLACEMENT': return AdsAnalyticsAdTargetingType.PLACEMENT;
        case r'COUNTRY': return AdsAnalyticsAdTargetingType.COUNTRY;
        case r'TARGETED_INTEREST': return AdsAnalyticsAdTargetingType.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdsAnalyticsAdTargetingType.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdsAnalyticsAdTargetingType.AUDIENCE_INCLUDE;
        case r'GEO': return AdsAnalyticsAdTargetingType.GEO;
        case r'AGE_BUCKET': return AdsAnalyticsAdTargetingType.AGE_BUCKET;
        case r'REGION': return AdsAnalyticsAdTargetingType.REGION;
        case r'QUIZ_RESULT': return AdsAnalyticsAdTargetingType.QUIZ_RESULT;
        case r'AGE_BUCKET_AND_GENDER': return AdsAnalyticsAdTargetingType.AGE_BUCKET_AND_GENDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdsAnalyticsAdTargetingTypeTypeTransformer? _instance;
}

