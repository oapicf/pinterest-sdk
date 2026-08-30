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
enum AdsAnalyticsCampaignTargetingType {
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
  CREATIVE_TYPE._(r'CREATIVE_TYPE'),
  AGE_BUCKET_AND_GENDER._(r'AGE_BUCKET_AND_GENDER'),
  AUDIENCE_MULTIPLIER._(r'AUDIENCE_MULTIPLIER'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdsAnalyticsCampaignTargetingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdsAnalyticsCampaignTargetingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdsAnalyticsCampaignTargetingType? fromJson(dynamic value) => AdsAnalyticsCampaignTargetingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdsAnalyticsCampaignTargetingType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdsAnalyticsCampaignTargetingType data) => data._value;

  /// Returns the instance of [AdsAnalyticsCampaignTargetingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdsAnalyticsCampaignTargetingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdsAnalyticsCampaignTargetingType) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static AdsAnalyticsCampaignTargetingTypeTypeTransformer? _instance;
}

