//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Conversion attribution window in days.
enum CampaignPlanningConversionAttributionWindowDays {
  DAYS_0._(r'DAYS_0'),
  DAYS_1._(r'DAYS_1'),
  DAYS_7._(r'DAYS_7'),
  DAYS_30._(r'DAYS_30'),
  DAYS_60._(r'DAYS_60'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningConversionAttributionWindowDays._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningConversionAttributionWindowDays] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningConversionAttributionWindowDays? fromJson(dynamic value) => CampaignPlanningConversionAttributionWindowDaysTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningConversionAttributionWindowDays]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningConversionAttributionWindowDays> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConversionAttributionWindowDays>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConversionAttributionWindowDays.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningConversionAttributionWindowDays] to String,
/// and [decode] dynamic data back to [CampaignPlanningConversionAttributionWindowDays].
class CampaignPlanningConversionAttributionWindowDaysTypeTransformer {
  factory CampaignPlanningConversionAttributionWindowDaysTypeTransformer() => _instance ??= const CampaignPlanningConversionAttributionWindowDaysTypeTransformer._();

  const CampaignPlanningConversionAttributionWindowDaysTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningConversionAttributionWindowDays data) => data._value;

  /// Returns the instance of [CampaignPlanningConversionAttributionWindowDays] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningConversionAttributionWindowDays? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningConversionAttributionWindowDays) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'DAYS_0': return CampaignPlanningConversionAttributionWindowDays.DAYS_0;
        case r'DAYS_1': return CampaignPlanningConversionAttributionWindowDays.DAYS_1;
        case r'DAYS_7': return CampaignPlanningConversionAttributionWindowDays.DAYS_7;
        case r'DAYS_30': return CampaignPlanningConversionAttributionWindowDays.DAYS_30;
        case r'DAYS_60': return CampaignPlanningConversionAttributionWindowDays.DAYS_60;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningConversionAttributionWindowDaysTypeTransformer? _instance;
}

