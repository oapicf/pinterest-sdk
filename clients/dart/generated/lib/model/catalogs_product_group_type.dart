//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// <p>Catalog product group type</p> <p>MERCHANT_CREATED: Product groups created by merchants. <br>ALL_PRODUCTS: Consists of every product in your latest successful feed upload. <br>BEST_DEALS: Consists of products with the deepest drop in price. <br>PINNER_FAVORITES: Consists of products that are resonating most with people on Pinterest, based on engagement. <br>TOP_SELLERS: Consists of products with the highest conversion rate, if you have the conversion tag installed. <br>BACK_IN_STOCK: Consists of products that were previously out of stock and are now in stock. <br>NEW_ARRIVALS: Consists of products that are new to your Catalog. <br>SHOPIFY_COLLECTION: Product groups created based on Shopify Product Collections. <br>I2PC: Product groups created based on predicted product category.</p>
class CatalogsProductGroupType {
  /// Instantiate a new enum with the provided [value].
  const CatalogsProductGroupType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const MERCHANT_CREATED = CatalogsProductGroupType._(r'MERCHANT_CREATED');
  static const ALL_PRODUCTS = CatalogsProductGroupType._(r'ALL_PRODUCTS');
  static const BEST_DEALS = CatalogsProductGroupType._(r'BEST_DEALS');
  static const PINNER_FAVORITES = CatalogsProductGroupType._(r'PINNER_FAVORITES');
  static const TOP_SELLERS = CatalogsProductGroupType._(r'TOP_SELLERS');
  static const BACK_IN_STOCK = CatalogsProductGroupType._(r'BACK_IN_STOCK');
  static const NEW_ARRIVALS = CatalogsProductGroupType._(r'NEW_ARRIVALS');
  static const SHOPIFY_COLLECTIONS = CatalogsProductGroupType._(r'SHOPIFY_COLLECTIONS');
  static const i2PC = CatalogsProductGroupType._(r'I2PC');

  /// List of all possible values in this [enum][CatalogsProductGroupType].
  static const values = <CatalogsProductGroupType>[
    MERCHANT_CREATED,
    ALL_PRODUCTS,
    BEST_DEALS,
    PINNER_FAVORITES,
    TOP_SELLERS,
    BACK_IN_STOCK,
    NEW_ARRIVALS,
    SHOPIFY_COLLECTIONS,
    i2PC,
  ];

  static CatalogsProductGroupType? fromJson(dynamic value) => CatalogsProductGroupTypeTypeTransformer().decode(value);

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

  String encode(CatalogsProductGroupType data) => data.value;

  /// Decodes a [dynamic value][data] to a CatalogsProductGroupType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsProductGroupType? decode(dynamic data, {bool allowNull = true}) {
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
        case r'I2PC': return CatalogsProductGroupType.i2PC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CatalogsProductGroupTypeTypeTransformer] instance.
  static CatalogsProductGroupTypeTypeTransformer? _instance;
}

