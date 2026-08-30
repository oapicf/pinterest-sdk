//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Error code returned for a campaign planning estimate failure.
enum CampaignPlanningResponseErrorCode {
  SERVER_ERROR._(r'SERVER_ERROR'),
  AUDIENCE_LIST_MISSING._(r'AUDIENCE_LIST_MISSING'),
  INVALID_REQUEST._(r'INVALID_REQUEST'),
  PRODUCT_GROUP_MISSING._(r'PRODUCT_GROUP_MISSING'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignPlanningResponseErrorCode._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignPlanningResponseErrorCode] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignPlanningResponseErrorCode? fromJson(dynamic value) => CampaignPlanningResponseErrorCodeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignPlanningResponseErrorCode]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignPlanningResponseErrorCode> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignPlanningResponseErrorCode>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignPlanningResponseErrorCode.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignPlanningResponseErrorCode] to String,
/// and [decode] dynamic data back to [CampaignPlanningResponseErrorCode].
class CampaignPlanningResponseErrorCodeTypeTransformer {
  factory CampaignPlanningResponseErrorCodeTypeTransformer() => _instance ??= const CampaignPlanningResponseErrorCodeTypeTransformer._();

  const CampaignPlanningResponseErrorCodeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignPlanningResponseErrorCode data) => data._value;

  /// Returns the instance of [CampaignPlanningResponseErrorCode] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignPlanningResponseErrorCode? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignPlanningResponseErrorCode) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SERVER_ERROR': return CampaignPlanningResponseErrorCode.SERVER_ERROR;
        case r'AUDIENCE_LIST_MISSING': return CampaignPlanningResponseErrorCode.AUDIENCE_LIST_MISSING;
        case r'INVALID_REQUEST': return CampaignPlanningResponseErrorCode.INVALID_REQUEST;
        case r'PRODUCT_GROUP_MISSING': return CampaignPlanningResponseErrorCode.PRODUCT_GROUP_MISSING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignPlanningResponseErrorCodeTypeTransformer? _instance;
}

