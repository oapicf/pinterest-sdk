//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Conversion event for which a conversion rate estimate is computed.
enum CampaignPlanningConversionEvent {
  SIGNUP._(r'SIGNUP'),
  CHECKOUT._(r'CHECKOUT'),
  ADD_TO_CART._(r'ADD_TO_CART'),
  LEAD._(r'LEAD'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningConversionEvent._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningConversionEvent] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningConversionEvent? fromJson(dynamic value) => CampaignPlanningConversionEventTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningConversionEvent]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningConversionEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningConversionEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningConversionEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningConversionEvent] to String,
/// and [decode] dynamic data back to [CampaignPlanningConversionEvent].
class CampaignPlanningConversionEventTypeTransformer {
  factory CampaignPlanningConversionEventTypeTransformer() => _instance ??= const CampaignPlanningConversionEventTypeTransformer._();

  const CampaignPlanningConversionEventTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningConversionEvent data) => data._value;

  /// Returns the instance of [CampaignPlanningConversionEvent] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningConversionEvent? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningConversionEvent) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SIGNUP': return CampaignPlanningConversionEvent.SIGNUP;
        case r'CHECKOUT': return CampaignPlanningConversionEvent.CHECKOUT;
        case r'ADD_TO_CART': return CampaignPlanningConversionEvent.ADD_TO_CART;
        case r'LEAD': return CampaignPlanningConversionEvent.LEAD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningConversionEventTypeTransformer? _instance;
}

