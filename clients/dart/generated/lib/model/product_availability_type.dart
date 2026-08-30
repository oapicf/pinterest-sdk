//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Default availability for products in a feed.
enum ProductAvailabilityType {
  IN_STOCK._(r'IN_STOCK'),
  OUT_OF_STOCK._(r'OUT_OF_STOCK'),
  PREORDER._(r'PREORDER'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProductAvailabilityType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProductAvailabilityType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProductAvailabilityType? fromJson(dynamic value) => ProductAvailabilityTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProductAvailabilityType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProductAvailabilityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductAvailabilityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductAvailabilityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductAvailabilityType] to String,
/// and [decode] dynamic data back to [ProductAvailabilityType].
class ProductAvailabilityTypeTypeTransformer {
  factory ProductAvailabilityTypeTypeTransformer() => _instance ??= const ProductAvailabilityTypeTypeTransformer._();

  const ProductAvailabilityTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ProductAvailabilityType data) => data._value;

  /// Returns the instance of [ProductAvailabilityType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductAvailabilityType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProductAvailabilityType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'IN_STOCK': return ProductAvailabilityType.IN_STOCK;
        case r'OUT_OF_STOCK': return ProductAvailabilityType.OUT_OF_STOCK;
        case r'PREORDER': return ProductAvailabilityType.PREORDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProductAvailabilityTypeTypeTransformer? _instance;
}

