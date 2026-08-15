//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class ProductCategoryRegion {
  /// Instantiate a new enum with the provided [value].
  const ProductCategoryRegion._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const US = ProductCategoryRegion._(r'US');
  static const gBPlusIE = ProductCategoryRegion._(r'GB+IE');
  static const CA = ProductCategoryRegion._(r'CA');

  /// List of all possible values in this [enum][ProductCategoryRegion].
  static const values = <ProductCategoryRegion>[
    US,
    gBPlusIE,
    CA,
  ];

  static ProductCategoryRegion? fromJson(dynamic value) => ProductCategoryRegionTypeTransformer().decode(value);

  static List<ProductCategoryRegion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductCategoryRegion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductCategoryRegion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductCategoryRegion] to String,
/// and [decode] dynamic data back to [ProductCategoryRegion].
class ProductCategoryRegionTypeTransformer {
  factory ProductCategoryRegionTypeTransformer() => _instance ??= const ProductCategoryRegionTypeTransformer._();

  const ProductCategoryRegionTypeTransformer._();

  String encode(ProductCategoryRegion data) => data.value;

  /// Decodes a [dynamic value][data] to a ProductCategoryRegion.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductCategoryRegion? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'US': return ProductCategoryRegion.US;
        case r'GB+IE': return ProductCategoryRegion.gBPlusIE;
        case r'CA': return ProductCategoryRegion.CA;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ProductCategoryRegionTypeTransformer] instance.
  static ProductCategoryRegionTypeTransformer? _instance;
}

