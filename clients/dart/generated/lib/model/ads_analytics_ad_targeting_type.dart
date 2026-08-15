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
class AdsAnalyticsAdTargetingType {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsAdTargetingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = AdsAnalyticsAdTargetingType._(r'KEYWORD');
  static const APPTYPE = AdsAnalyticsAdTargetingType._(r'APPTYPE');
  static const GENDER = AdsAnalyticsAdTargetingType._(r'GENDER');
  static const LOCATION = AdsAnalyticsAdTargetingType._(r'LOCATION');
  static const PLACEMENT = AdsAnalyticsAdTargetingType._(r'PLACEMENT');
  static const COUNTRY = AdsAnalyticsAdTargetingType._(r'COUNTRY');
  static const TARGETED_INTEREST = AdsAnalyticsAdTargetingType._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = AdsAnalyticsAdTargetingType._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = AdsAnalyticsAdTargetingType._(r'AUDIENCE_INCLUDE');
  static const GEO = AdsAnalyticsAdTargetingType._(r'GEO');
  static const AGE_BUCKET = AdsAnalyticsAdTargetingType._(r'AGE_BUCKET');
  static const REGION = AdsAnalyticsAdTargetingType._(r'REGION');
  static const QUIZ_RESULT = AdsAnalyticsAdTargetingType._(r'QUIZ_RESULT');
  static const AGE_BUCKET_AND_GENDER = AdsAnalyticsAdTargetingType._(r'AGE_BUCKET_AND_GENDER');

  /// List of all possible values in this [enum][AdsAnalyticsAdTargetingType].
  static const values = <AdsAnalyticsAdTargetingType>[
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
    QUIZ_RESULT,
    AGE_BUCKET_AND_GENDER,
  ];

  static AdsAnalyticsAdTargetingType? fromJson(dynamic value) => AdsAnalyticsAdTargetingTypeTypeTransformer().decode(value);

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

  String encode(AdsAnalyticsAdTargetingType data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsAdTargetingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsAdTargetingType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [AdsAnalyticsAdTargetingTypeTypeTransformer] instance.
  static AdsAnalyticsAdTargetingTypeTypeTransformer? _instance;
}

