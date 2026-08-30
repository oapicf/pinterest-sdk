//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Estimation type for campaign planning estimated curve
enum CampaignPlanningEstimationType {
  IMPRESSION._(r'IMPRESSION'),
  CLICK._(r'CLICK'),
  CONVERSION._(r'CONVERSION'),
  WEEKLY_FREQUENCY._(r'WEEKLY_FREQUENCY'),
  WEEKLY_REACH._(r'WEEKLY_REACH'),
  LIFETIME_FREQUENCY._(r'LIFETIME_FREQUENCY'),
  LIFETIME_REACH._(r'LIFETIME_REACH'),
  CPM._(r'CPM'),
  CPC._(r'CPC'),
  CPA._(r'CPA'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningEstimationType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningEstimationType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningEstimationType? fromJson(dynamic value) => CampaignPlanningEstimationTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningEstimationType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningEstimationType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningEstimationType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningEstimationType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningEstimationType] to String,
/// and [decode] dynamic data back to [CampaignPlanningEstimationType].
class CampaignPlanningEstimationTypeTypeTransformer {
  factory CampaignPlanningEstimationTypeTypeTransformer() => _instance ??= const CampaignPlanningEstimationTypeTypeTransformer._();

  const CampaignPlanningEstimationTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningEstimationType data) => data._value;

  /// Returns the instance of [CampaignPlanningEstimationType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningEstimationType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningEstimationType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IMPRESSION': return CampaignPlanningEstimationType.IMPRESSION;
        case r'CLICK': return CampaignPlanningEstimationType.CLICK;
        case r'CONVERSION': return CampaignPlanningEstimationType.CONVERSION;
        case r'WEEKLY_FREQUENCY': return CampaignPlanningEstimationType.WEEKLY_FREQUENCY;
        case r'WEEKLY_REACH': return CampaignPlanningEstimationType.WEEKLY_REACH;
        case r'LIFETIME_FREQUENCY': return CampaignPlanningEstimationType.LIFETIME_FREQUENCY;
        case r'LIFETIME_REACH': return CampaignPlanningEstimationType.LIFETIME_REACH;
        case r'CPM': return CampaignPlanningEstimationType.CPM;
        case r'CPC': return CampaignPlanningEstimationType.CPC;
        case r'CPA': return CampaignPlanningEstimationType.CPA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningEstimationTypeTypeTransformer? _instance;
}

