//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AdGroupAudienceSizingCreativeTypes {
  REGULAR._(r'REGULAR'),
  VIDEO._(r'VIDEO'),
  SHOPPING._(r'SHOPPING'),
  CAROUSEL._(r'CAROUSEL'),
  MAX_VIDEO._(r'MAX_VIDEO'),
  SHOP_THE_PIN._(r'SHOP_THE_PIN'),
  COLLECTION._(r'COLLECTION'),
  IDEA._(r'IDEA'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdGroupAudienceSizingCreativeTypes._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdGroupAudienceSizingCreativeTypes] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdGroupAudienceSizingCreativeTypes? fromJson(dynamic value) => AdGroupAudienceSizingCreativeTypesTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdGroupAudienceSizingCreativeTypes]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdGroupAudienceSizingCreativeTypes> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdGroupAudienceSizingCreativeTypes>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdGroupAudienceSizingCreativeTypes.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdGroupAudienceSizingCreativeTypes] to String,
/// and [decode] dynamic data back to [AdGroupAudienceSizingCreativeTypes].
class AdGroupAudienceSizingCreativeTypesTypeTransformer {
  factory AdGroupAudienceSizingCreativeTypesTypeTransformer() => _instance ??= const AdGroupAudienceSizingCreativeTypesTypeTransformer._();

  const AdGroupAudienceSizingCreativeTypesTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdGroupAudienceSizingCreativeTypes data) => data._value;

  /// Returns the instance of [AdGroupAudienceSizingCreativeTypes] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdGroupAudienceSizingCreativeTypes? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdGroupAudienceSizingCreativeTypes) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'REGULAR': return AdGroupAudienceSizingCreativeTypes.REGULAR;
        case r'VIDEO': return AdGroupAudienceSizingCreativeTypes.VIDEO;
        case r'SHOPPING': return AdGroupAudienceSizingCreativeTypes.SHOPPING;
        case r'CAROUSEL': return AdGroupAudienceSizingCreativeTypes.CAROUSEL;
        case r'MAX_VIDEO': return AdGroupAudienceSizingCreativeTypes.MAX_VIDEO;
        case r'SHOP_THE_PIN': return AdGroupAudienceSizingCreativeTypes.SHOP_THE_PIN;
        case r'COLLECTION': return AdGroupAudienceSizingCreativeTypes.COLLECTION;
        case r'IDEA': return AdGroupAudienceSizingCreativeTypes.IDEA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdGroupAudienceSizingCreativeTypesTypeTransformer? _instance;
}

