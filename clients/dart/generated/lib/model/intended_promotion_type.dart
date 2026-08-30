//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specifies the intended promotion type for the campaign.  Note: This field is immutable unless the campaign is in draft status.  **STANDARD_AD** - For ads derived from Pins. - Supported for all objective types except for current CATALOG\\_SALES and WEB\\_CONVERSION, which are being deprecated. - For simplified objective types.  **CATALOG** - For creating product group promotions. - Supported for CONSIDERATION and SALES objective types. - For simplified objective types.  **LEGACY** - Intended only for maintaining backward compatibility. - Must be used for CATALOG\\_SALES and WEB\\_CONVERSION. - Supported for CATALOG\\_SALES and WEB\\_CONVERSION objective types.  **If you do not provide this parameter, the default is:** - LEGACY for CATALOG\\_SALES and WEB\\_CONVERSION - STANDARD_AD for other objective types
enum IntendedPromotionType {
  LEGACY._(r'LEGACY'),
  STANDARD_AD._(r'STANDARD_AD'),
  CATALOG._(r'CATALOG'),
  ;

  /// Instantiate a new enum with the provided value.
  const IntendedPromotionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [IntendedPromotionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static IntendedPromotionType? fromJson(dynamic value) => IntendedPromotionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [IntendedPromotionType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<IntendedPromotionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IntendedPromotionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IntendedPromotionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [IntendedPromotionType] to String,
/// and [decode] dynamic data back to [IntendedPromotionType].
class IntendedPromotionTypeTypeTransformer {
  factory IntendedPromotionTypeTypeTransformer() => _instance ??= const IntendedPromotionTypeTypeTransformer._();

  const IntendedPromotionTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(IntendedPromotionType data) => data._value;

  /// Returns the instance of [IntendedPromotionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IntendedPromotionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is IntendedPromotionType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'LEGACY': return IntendedPromotionType.LEGACY;
        case r'STANDARD_AD': return IntendedPromotionType.STANDARD_AD;
        case r'CATALOG': return IntendedPromotionType.CATALOG;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static IntendedPromotionTypeTypeTransformer? _instance;
}

