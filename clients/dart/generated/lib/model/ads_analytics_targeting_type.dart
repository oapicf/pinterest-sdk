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
class AdsAnalyticsTargetingType {
  /// Instantiate a new enum with the provided [value].
  const AdsAnalyticsTargetingType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const KEYWORD = AdsAnalyticsTargetingType._(r'KEYWORD');
  static const APPTYPE = AdsAnalyticsTargetingType._(r'APPTYPE');
  static const GENDER = AdsAnalyticsTargetingType._(r'GENDER');
  static const LOCATION = AdsAnalyticsTargetingType._(r'LOCATION');
  static const PLACEMENT = AdsAnalyticsTargetingType._(r'PLACEMENT');
  static const COUNTRY = AdsAnalyticsTargetingType._(r'COUNTRY');
  static const TARGETED_INTEREST = AdsAnalyticsTargetingType._(r'TARGETED_INTEREST');
  static const PINNER_INTEREST = AdsAnalyticsTargetingType._(r'PINNER_INTEREST');
  static const AUDIENCE_INCLUDE = AdsAnalyticsTargetingType._(r'AUDIENCE_INCLUDE');
  static const GEO = AdsAnalyticsTargetingType._(r'GEO');
  static const AGE_BUCKET = AdsAnalyticsTargetingType._(r'AGE_BUCKET');
  static const REGION = AdsAnalyticsTargetingType._(r'REGION');
  static const AGE_BUCKET_AND_GENDER = AdsAnalyticsTargetingType._(r'AGE_BUCKET_AND_GENDER');

  /// List of all possible values in this [enum][AdsAnalyticsTargetingType].
  static const values = <AdsAnalyticsTargetingType>[
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
  ];

  static AdsAnalyticsTargetingType? fromJson(dynamic value) => AdsAnalyticsTargetingTypeTypeTransformer().decode(value);

  static List<AdsAnalyticsTargetingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdsAnalyticsTargetingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdsAnalyticsTargetingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdsAnalyticsTargetingType] to String,
/// and [decode] dynamic data back to [AdsAnalyticsTargetingType].
class AdsAnalyticsTargetingTypeTypeTransformer {
  factory AdsAnalyticsTargetingTypeTypeTransformer() => _instance ??= const AdsAnalyticsTargetingTypeTypeTransformer._();

  const AdsAnalyticsTargetingTypeTypeTransformer._();

  String encode(AdsAnalyticsTargetingType data) => data.value;

  /// Decodes a [dynamic value][data] to a AdsAnalyticsTargetingType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'KEYWORD': return AdsAnalyticsTargetingType.KEYWORD;
        case r'APPTYPE': return AdsAnalyticsTargetingType.APPTYPE;
        case r'GENDER': return AdsAnalyticsTargetingType.GENDER;
        case r'LOCATION': return AdsAnalyticsTargetingType.LOCATION;
        case r'PLACEMENT': return AdsAnalyticsTargetingType.PLACEMENT;
        case r'COUNTRY': return AdsAnalyticsTargetingType.COUNTRY;
        case r'TARGETED_INTEREST': return AdsAnalyticsTargetingType.TARGETED_INTEREST;
        case r'PINNER_INTEREST': return AdsAnalyticsTargetingType.PINNER_INTEREST;
        case r'AUDIENCE_INCLUDE': return AdsAnalyticsTargetingType.AUDIENCE_INCLUDE;
        case r'GEO': return AdsAnalyticsTargetingType.GEO;
        case r'AGE_BUCKET': return AdsAnalyticsTargetingType.AGE_BUCKET;
        case r'REGION': return AdsAnalyticsTargetingType.REGION;
        case r'AGE_BUCKET_AND_GENDER': return AdsAnalyticsTargetingType.AGE_BUCKET_AND_GENDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [AdsAnalyticsTargetingTypeTypeTransformer] instance.
  static AdsAnalyticsTargetingTypeTypeTransformer? _instance;
}

