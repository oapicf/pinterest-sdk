//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Catalog product group type  - **MERCHANT_CREATED**: Product groups created by merchants. - **ALL_PRODUCTS**: Consists of every product in your latest successful feed upload. - **BEST_DEALS**: Consists of products with the deepest drop in price. - **PINNER_FAVORITES**: Consists of products that are resonating most with people on Pinterest, based on engagement. - **TOP_SELLERS**: Consists of products with the highest conversion rate, if you have the conversion tag installed. - **BACK_IN_STOCK**: Consists of products that were previously out of stock and are now in stock. - **NEW_ARRIVALS**: Consists of products that are new to your Catalog. - **SHOPIFY_COLLECTIONS**: Product groups created based on Shopify Product Collections. - **I2PC**: Product groups created based on predicted product category. - **CATALOG_EXPANSION**: Consists of high-potential, recommended products from your catalog.
enum CatalogsProductGroupType {
  MERCHANT_CREATED._(r'MERCHANT_CREATED'),
  ALL_PRODUCTS._(r'ALL_PRODUCTS'),
  BEST_DEALS._(r'BEST_DEALS'),
  PINNER_FAVORITES._(r'PINNER_FAVORITES'),
  TOP_SELLERS._(r'TOP_SELLERS'),
  BACK_IN_STOCK._(r'BACK_IN_STOCK'),
  NEW_ARRIVALS._(r'NEW_ARRIVALS'),
  SHOPIFY_COLLECTIONS._(r'SHOPIFY_COLLECTIONS'),
  I2PC._(r'I2PC'),
  CATALOG_EXPANSION._(r'CATALOG_EXPANSION'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsProductGroupType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsProductGroupType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsProductGroupType? fromJson(dynamic value) => CatalogsProductGroupTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsProductGroupType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsProductGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsProductGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsProductGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsProductGroupType] to String,
/// and [decode] dynamic data back to [CatalogsProductGroupType].
class CatalogsProductGroupTypeTypeTransformer {
  factory CatalogsProductGroupTypeTypeTransformer() => _instance ??= const CatalogsProductGroupTypeTypeTransformer._();

  const CatalogsProductGroupTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsProductGroupType data) => data._value;

  /// Returns the instance of [CatalogsProductGroupType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsProductGroupType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MERCHANT_CREATED': return CatalogsProductGroupType.MERCHANT_CREATED;
        case r'ALL_PRODUCTS': return CatalogsProductGroupType.ALL_PRODUCTS;
        case r'BEST_DEALS': return CatalogsProductGroupType.BEST_DEALS;
        case r'PINNER_FAVORITES': return CatalogsProductGroupType.PINNER_FAVORITES;
        case r'TOP_SELLERS': return CatalogsProductGroupType.TOP_SELLERS;
        case r'BACK_IN_STOCK': return CatalogsProductGroupType.BACK_IN_STOCK;
        case r'NEW_ARRIVALS': return CatalogsProductGroupType.NEW_ARRIVALS;
        case r'SHOPIFY_COLLECTIONS': return CatalogsProductGroupType.SHOPIFY_COLLECTIONS;
        case r'I2PC': return CatalogsProductGroupType.I2PC;
        case r'CATALOG_EXPANSION': return CatalogsProductGroupType.CATALOG_EXPANSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsProductGroupTypeTypeTransformer? _instance;
}

