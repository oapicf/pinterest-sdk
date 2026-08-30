//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Fields that can be updated in campaign bid options.
enum CampaignBidOptionsUpdateMaskItems {
  AUDIENCE._(r'AUDIENCE'),
  APP_TYPE._(r'APP_TYPE'),
  PLACEMENT._(r'PLACEMENT'),
  GENDER._(r'GENDER'),
  AGE_BUCKET._(r'AGE_BUCKET'),
  FREQUENCY._(r'FREQUENCY'),
  ;

  /// Instantiate a new enum with the provided value.
  const CampaignBidOptionsUpdateMaskItems._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CampaignBidOptionsUpdateMaskItems] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CampaignBidOptionsUpdateMaskItems? fromJson(dynamic value) => CampaignBidOptionsUpdateMaskItemsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CampaignBidOptionsUpdateMaskItems]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CampaignBidOptionsUpdateMaskItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CampaignBidOptionsUpdateMaskItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CampaignBidOptionsUpdateMaskItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CampaignBidOptionsUpdateMaskItems] to String,
/// and [decode] dynamic data back to [CampaignBidOptionsUpdateMaskItems].
class CampaignBidOptionsUpdateMaskItemsTypeTransformer {
  factory CampaignBidOptionsUpdateMaskItemsTypeTransformer() => _instance ??= const CampaignBidOptionsUpdateMaskItemsTypeTransformer._();

  const CampaignBidOptionsUpdateMaskItemsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CampaignBidOptionsUpdateMaskItems data) => data._value;

  /// Returns the instance of [CampaignBidOptionsUpdateMaskItems] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CampaignBidOptionsUpdateMaskItems? decode(dynamic data, {bool allowNull = true}) {
    if (data is CampaignBidOptionsUpdateMaskItems) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AUDIENCE': return CampaignBidOptionsUpdateMaskItems.AUDIENCE;
        case r'APP_TYPE': return CampaignBidOptionsUpdateMaskItems.APP_TYPE;
        case r'PLACEMENT': return CampaignBidOptionsUpdateMaskItems.PLACEMENT;
        case r'GENDER': return CampaignBidOptionsUpdateMaskItems.GENDER;
        case r'AGE_BUCKET': return CampaignBidOptionsUpdateMaskItems.AGE_BUCKET;
        case r'FREQUENCY': return CampaignBidOptionsUpdateMaskItems.FREQUENCY;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CampaignBidOptionsUpdateMaskItemsTypeTransformer? _instance;
}

