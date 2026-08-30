//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Severity of a confidence level alert on delivery estimates.
enum CampaignPlanningConfidenceLevelAlertSeverity {
  UNKNOWN._(r'UNKNOWN'),
  LOW_MILD._(r'LOW_MILD'),
  LOW_MODERATE._(r'LOW_MODERATE'),
  LOW_SEVERE._(r'LOW_SEVERE'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningConfidenceLevelAlertSeverity._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningConfidenceLevelAlertSeverity] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningConfidenceLevelAlertSeverity? fromJson(dynamic value) => CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningConfidenceLevelAlertSeverity]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningConfidenceLevelAlertSeverity> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConfidenceLevelAlertSeverity>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConfidenceLevelAlertSeverity.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningConfidenceLevelAlertSeverity] to String,
/// and [decode] dynamic data back to [CampaignPlanningConfidenceLevelAlertSeverity].
class CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer {
  factory CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer() => _instance ??= const CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer._();

  const CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningConfidenceLevelAlertSeverity data) => data._value;

  /// Returns the instance of [CampaignPlanningConfidenceLevelAlertSeverity] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningConfidenceLevelAlertSeverity? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningConfidenceLevelAlertSeverity) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'UNKNOWN': return CampaignPlanningConfidenceLevelAlertSeverity.UNKNOWN;
        case r'LOW_MILD': return CampaignPlanningConfidenceLevelAlertSeverity.LOW_MILD;
        case r'LOW_MODERATE': return CampaignPlanningConfidenceLevelAlertSeverity.LOW_MODERATE;
        case r'LOW_SEVERE': return CampaignPlanningConfidenceLevelAlertSeverity.LOW_SEVERE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningConfidenceLevelAlertSeverityTypeTransformer? _instance;
}

