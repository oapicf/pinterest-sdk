//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum ProductCategoriesEngagementType {
  ENGAGEMENT._(r'ENGAGEMENT'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  SAVE._(r'SAVE'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProductCategoriesEngagementType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProductCategoriesEngagementType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProductCategoriesEngagementType? fromJson(dynamic value) => ProductCategoriesEngagementTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProductCategoriesEngagementType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProductCategoriesEngagementType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductCategoriesEngagementType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductCategoriesEngagementType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductCategoriesEngagementType] to String,
/// and [decode] dynamic data back to [ProductCategoriesEngagementType].
class ProductCategoriesEngagementTypeTypeTransformer {
  factory ProductCategoriesEngagementTypeTypeTransformer() => _instance ??= const ProductCategoriesEngagementTypeTypeTransformer._();

  const ProductCategoriesEngagementTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ProductCategoriesEngagementType data) => data._value;

  /// Returns the instance of [ProductCategoriesEngagementType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductCategoriesEngagementType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProductCategoriesEngagementType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ENGAGEMENT': return ProductCategoriesEngagementType.ENGAGEMENT;
        case r'OUTBOUND_CLICK': return ProductCategoriesEngagementType.OUTBOUND_CLICK;
        case r'SAVE': return ProductCategoriesEngagementType.SAVE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProductCategoriesEngagementTypeTypeTransformer? _instance;
}

