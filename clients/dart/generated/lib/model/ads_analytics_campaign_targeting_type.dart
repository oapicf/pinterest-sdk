//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reporting targeting type for campaigns
class AdsAnalyticsCampaignTargetingType {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsCampaignTargetingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = AdsAnalyticsCampaignTargetingType._(r'KEYWORD');
  static const APPTYPE = AdsAnalyticsCampaignTargetingType._(r'APPTYPE');
  static const GENDER = AdsAnalyticsCampaignTargetingType._(r'GENDER');
  static const LOCATION = AdsAnalyticsCampaignTargetingType._(r'LOCATION');
  static const PLACEMENT = AdsAnalyticsCampaignTargetingType._(r'PLACEMENT');
  static const COUNTRY = AdsAnalyticsCampaignTargetingType._(r'COUNTRY');
  static const TARGETED_INTEREST = AdsAnalyticsCampaignTargetingType._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = AdsAnalyticsCampaignTargetingType._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = AdsAnalyticsCampaignTargetingType._(r'AUDIENCE_INCLUDE');
  static const GEO = AdsAnalyticsCampaignTargetingType._(r'GEO');
  static const AGE_BUCKET = AdsAnalyticsCampaignTargetingType._(r'AGE_BUCKET');
  static const REGION = AdsAnalyticsCampaignTargetingType._(r'REGION');
  static const CREATIVE_TYPE = AdsAnalyticsCampaignTargetingType._(r'CREATIVE_TYPE');
  static const AGE_BUCKET_AND_GENDER = AdsAnalyticsCampaignTargetingType._(r'AGE_BUCKET_AND_GENDER');
  static const AUDIENCE_MULTIPLIER = AdsAnalyticsCampaignTargetingType._(r'AUDIENCE_MULTIPLIER');

  /// List of all possible values in this [enum][AdsAnalyticsCampaignTargetingType].
  static const values = <AdsAnalyticsCampaignTargetingType>[
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
    CREATIVE_TYPE,
    AGE_BUCKET_AND_GENDER,
    AUDIENCE_MULTIPLIER,
  ];

  static AdsAnalyticsCampaignTargetingType? fromJson(dynamic value) => AdsAnalyticsCampaignTargetingTypeTypeTransformer().decode(value);

  static List<AdsAnalyticsCampaignTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsCampaignTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsCampaignTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsCampaignTargetingType] to String,
/// and [decode] dynamic data back to [AdsAnalyticsCampaignTargetingType].
class AdsAnalyticsCampaignTargetingTypeTypeTransformer {
  factory AdsAnalyticsCampaignTargetingTypeTypeTransformer() => _instance ??= const AdsAnalyticsCampaignTargetingTypeTypeTransformer._();

  const AdsAnalyticsCampaignTargetingTypeTypeTransformer._();

  String encode(AdsAnalyticsCampaignTargetingType data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsCampaignTargetingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsCampaignTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdsAnalyticsCampaignTargetingType.KEYWORD;
        case r'APPTYPE': return AdsAnalyticsCampaignTargetingType.APPTYPE;
        case r'GENDER': return AdsAnalyticsCampaignTargetingType.GENDER;
        case r'LOCATION': return AdsAnalyticsCampaignTargetingType.LOCATION;
        case r'PLACEMENT': return AdsAnalyticsCampaignTargetingType.PLACEMENT;
        case r'COUNTRY': return AdsAnalyticsCampaignTargetingType.COUNTRY;
        case r'TARGETED_INTEREST': return AdsAnalyticsCampaignTargetingType.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdsAnalyticsCampaignTargetingType.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdsAnalyticsCampaignTargetingType.AUDIENCE_INCLUDE;
        case r'GEO': return AdsAnalyticsCampaignTargetingType.GEO;
        case r'AGE_BUCKET': return AdsAnalyticsCampaignTargetingType.AGE_BUCKET;
        case r'REGION': return AdsAnalyticsCampaignTargetingType.REGION;
        case r'CREATIVE_TYPE': return AdsAnalyticsCampaignTargetingType.CREATIVE_TYPE;
        case r'AGE_BUCKET_AND_GENDER': return AdsAnalyticsCampaignTargetingType.AGE_BUCKET_AND_GENDER;
        case r'AUDIENCE_MULTIPLIER': return AdsAnalyticsCampaignTargetingType.AUDIENCE_MULTIPLIER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsAnalyticsCampaignTargetingTypeTypeTransformer] instance.
  static AdsAnalyticsCampaignTargetingTypeTypeTransformer? _instance;
}

