//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reason for a confidence level alert on delivery estimates.
enum CampaignPlanningConfidenceLevelAlertReason {
  UNKNOWN._(r'UNKNOWN'),
  OTHER._(r'OTHER'),
  ADVERTISER_HAS_NO_RECENT_CAMPAIGNS._(r'ADVERTISER_HAS_NO_RECENT_CAMPAIGNS'),
  ADVERTISER_HAS_NO_RECENT_CONVERSIONS._(r'ADVERTISER_HAS_NO_RECENT_CONVERSIONS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningConfidenceLevelAlertReason._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningConfidenceLevelAlertReason] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningConfidenceLevelAlertReason? fromJson(dynamic value) => CampaignPlanningConfidenceLevelAlertReasonTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningConfidenceLevelAlertReason]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningConfidenceLevelAlertReason> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConfidenceLevelAlertReason>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConfidenceLevelAlertReason.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningConfidenceLevelAlertReason] to String,
/// and [decode] dynamic data back to [CampaignPlanningConfidenceLevelAlertReason].
class CampaignPlanningConfidenceLevelAlertReasonTypeTransformer {
  factory CampaignPlanningConfidenceLevelAlertReasonTypeTransformer() => _instance ??= const CampaignPlanningConfidenceLevelAlertReasonTypeTransformer._();

  const CampaignPlanningConfidenceLevelAlertReasonTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningConfidenceLevelAlertReason data) => data._value;

  /// Returns the instance of [CampaignPlanningConfidenceLevelAlertReason] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningConfidenceLevelAlertReason? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningConfidenceLevelAlertReason) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return CampaignPlanningConfidenceLevelAlertReason.UNKNOWN;
        case r'OTHER': return CampaignPlanningConfidenceLevelAlertReason.OTHER;
        case r'ADVERTISER_HAS_NO_RECENT_CAMPAIGNS': return CampaignPlanningConfidenceLevelAlertReason.ADVERTISER_HAS_NO_RECENT_CAMPAIGNS;
        case r'ADVERTISER_HAS_NO_RECENT_CONVERSIONS': return CampaignPlanningConfidenceLevelAlertReason.ADVERTISER_HAS_NO_RECENT_CONVERSIONS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningConfidenceLevelAlertReasonTypeTransformer? _instance;
}

