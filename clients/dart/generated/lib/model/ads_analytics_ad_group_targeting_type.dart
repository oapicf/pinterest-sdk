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
class AdsAnalyticsAdGroupTargetingType {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsAdGroupTargetingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = AdsAnalyticsAdGroupTargetingType._(r'KEYWORD');
  static const APPTYPE = AdsAnalyticsAdGroupTargetingType._(r'APPTYPE');
  static const GENDER = AdsAnalyticsAdGroupTargetingType._(r'GENDER');
  static const LOCATION = AdsAnalyticsAdGroupTargetingType._(r'LOCATION');
  static const PLACEMENT = AdsAnalyticsAdGroupTargetingType._(r'PLACEMENT');
  static const COUNTRY = AdsAnalyticsAdGroupTargetingType._(r'COUNTRY');
  static const TARGETED_INTEREST = AdsAnalyticsAdGroupTargetingType._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = AdsAnalyticsAdGroupTargetingType._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = AdsAnalyticsAdGroupTargetingType._(r'AUDIENCE_INCLUDE');
  static const GEO = AdsAnalyticsAdGroupTargetingType._(r'GEO');
  static const AGE_BUCKET = AdsAnalyticsAdGroupTargetingType._(r'AGE_BUCKET');
  static const REGION = AdsAnalyticsAdGroupTargetingType._(r'REGION');
  static const AGE_BUCKET_AND_GENDER = AdsAnalyticsAdGroupTargetingType._(r'AGE_BUCKET_AND_GENDER');
  static const CREATIVE_ENHANCEMENTS = AdsAnalyticsAdGroupTargetingType._(r'CREATIVE_ENHANCEMENTS');

  /// List of all possible values in this [enum][AdsAnalyticsAdGroupTargetingType].
  static const values = <AdsAnalyticsAdGroupTargetingType>[
    KEYWORD,
    APPTYPE,
    GENDER,
    LOCATION,
    PLACEMENT,
    COUNTRY,
    TARGETED_INTEREST,
    PINNER_INTEREST,
    AUDIENCE_INCLUDE,
    GEO,
    AGE_BUCKET,
    REGION,
    AGE_BUCKET_AND_GENDER,
    CREATIVE_ENHANCEMENTS,
  ];

  static AdsAnalyticsAdGroupTargetingType? fromJson(dynamic value) => AdsAnalyticsAdGroupTargetingTypeTypeTransformer().decode(value);

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

  String encode(AdsAnalyticsAdGroupTargetingType data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsAdGroupTargetingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsAdGroupTargetingType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [AdsAnalyticsAdGroupTargetingTypeTypeTransformer] instance.
  static AdsAnalyticsAdGroupTargetingTypeTypeTransformer? _instance;
}

