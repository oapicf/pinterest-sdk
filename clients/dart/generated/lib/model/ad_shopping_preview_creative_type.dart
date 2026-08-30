//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AdShoppingPreviewCreativeType {
  SHOPPING._(r'SHOPPING'),
  COLLECTION._(r'COLLECTION'),
  CAROUSEL._(r'CAROUSEL'),
  MAX_WIDTH_COLLECTION._(r'MAX_WIDTH_COLLECTION'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdShoppingPreviewCreativeType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdShoppingPreviewCreativeType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdShoppingPreviewCreativeType? fromJson(dynamic value) => AdShoppingPreviewCreativeTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdShoppingPreviewCreativeType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdShoppingPreviewCreativeType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdShoppingPreviewCreativeType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdShoppingPreviewCreativeType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdShoppingPreviewCreativeType] to String,
/// and [decode] dynamic data back to [AdShoppingPreviewCreativeType].
class AdShoppingPreviewCreativeTypeTypeTransformer {
  factory AdShoppingPreviewCreativeTypeTypeTransformer() => _instance ??= const AdShoppingPreviewCreativeTypeTypeTransformer._();

  const AdShoppingPreviewCreativeTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdShoppingPreviewCreativeType data) => data._value;

  /// Returns the instance of [AdShoppingPreviewCreativeType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdShoppingPreviewCreativeType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdShoppingPreviewCreativeType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SHOPPING': return AdShoppingPreviewCreativeType.SHOPPING;
        case r'COLLECTION': return AdShoppingPreviewCreativeType.COLLECTION;
        case r'CAROUSEL': return AdShoppingPreviewCreativeType.CAROUSEL;
        case r'MAX_WIDTH_COLLECTION': return AdShoppingPreviewCreativeType.MAX_WIDTH_COLLECTION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdShoppingPreviewCreativeTypeTypeTransformer? _instance;
}

