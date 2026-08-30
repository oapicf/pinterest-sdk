//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Select a call to action (CTA) to display below your ad. CTA options for catalog sales campaigns are SHOP_NOW, BOOK_NOW, ON_SALE, GET_DEAL, BUY_ONLINE_PICKUP_IN_STORE
enum ProductGroupPromotionCustomizableCTAType {
  GET_OFFER._(r'GET_OFFER'),
  LEARN_MORE._(r'LEARN_MORE'),
  ORDER_NOW._(r'ORDER_NOW'),
  SHOP_NOW._(r'SHOP_NOW'),
  SIGN_UP._(r'SIGN_UP'),
  SUBSCRIBE._(r'SUBSCRIBE'),
  BUY_NOW._(r'BUY_NOW'),
  CONTACT_US._(r'CONTACT_US'),
  GET_QUOTE._(r'GET_QUOTE'),
  VISIT_SITE._(r'VISIT_SITE'),
  APPLY_NOW._(r'APPLY_NOW'),
  BOOK_NOW._(r'BOOK_NOW'),
  REGISTER_NOW._(r'REGISTER_NOW'),
  FIND_A_DEALER._(r'FIND_A_DEALER'),
  WATCH_NOW._(r'WATCH_NOW'),
  READ_MORE._(r'READ_MORE'),
  BUY_TICKETS._(r'BUY_TICKETS'),
  DONATE_NOW._(r'DONATE_NOW'),
  DOWNLOAD._(r'DOWNLOAD'),
  EXPLORE_MORE._(r'EXPLORE_MORE'),
  FIND_A_LOCATION._(r'FIND_A_LOCATION'),
  GET_DEAL._(r'GET_DEAL'),
  GET_RECIPE._(r'GET_RECIPE'),
  GET_SHOWTIMES._(r'GET_SHOWTIMES'),
  ON_SALE._(r'ON_SALE'),
  PLAY_GAME._(r'PLAY_GAME'),
  TRY_IT._(r'TRY_IT'),
  BUY_ONLINE_PICKUP_IN_STORE._(r'BUY_ONLINE_PICKUP_IN_STORE'),
  SHOP_ON_ADVERTISER._(r'SHOP_ON_ADVERTISER'),
  SHOP_THE_COLLECTION._(r'SHOP_THE_COLLECTION'),
  GET_IT_NOW._(r'GET_IT_NOW'),
  TAKE_A_PEEK._(r'TAKE_A_PEEK'),
  TAKE_A_CLOSER_LOOK._(r'TAKE_A_CLOSER_LOOK'),
  ;

  /// Instantiate a new enum with the provided value.
  const ProductGroupPromotionCustomizableCTAType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ProductGroupPromotionCustomizableCTAType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ProductGroupPromotionCustomizableCTAType? fromJson(dynamic value) => ProductGroupPromotionCustomizableCTATypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ProductGroupPromotionCustomizableCTAType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ProductGroupPromotionCustomizableCTAType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ProductGroupPromotionCustomizableCTAType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ProductGroupPromotionCustomizableCTAType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ProductGroupPromotionCustomizableCTAType] to String,
/// and [decode] dynamic data back to [ProductGroupPromotionCustomizableCTAType].
class ProductGroupPromotionCustomizableCTATypeTypeTransformer {
  factory ProductGroupPromotionCustomizableCTATypeTypeTransformer() => _instance ??= const ProductGroupPromotionCustomizableCTATypeTypeTransformer._();

  const ProductGroupPromotionCustomizableCTATypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ProductGroupPromotionCustomizableCTAType data) => data._value;

  /// Returns the instance of [ProductGroupPromotionCustomizableCTAType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ProductGroupPromotionCustomizableCTAType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ProductGroupPromotionCustomizableCTAType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'GET_OFFER': return ProductGroupPromotionCustomizableCTAType.GET_OFFER;
        case r'LEARN_MORE': return ProductGroupPromotionCustomizableCTAType.LEARN_MORE;
        case r'ORDER_NOW': return ProductGroupPromotionCustomizableCTAType.ORDER_NOW;
        case r'SHOP_NOW': return ProductGroupPromotionCustomizableCTAType.SHOP_NOW;
        case r'SIGN_UP': return ProductGroupPromotionCustomizableCTAType.SIGN_UP;
        case r'SUBSCRIBE': return ProductGroupPromotionCustomizableCTAType.SUBSCRIBE;
        case r'BUY_NOW': return ProductGroupPromotionCustomizableCTAType.BUY_NOW;
        case r'CONTACT_US': return ProductGroupPromotionCustomizableCTAType.CONTACT_US;
        case r'GET_QUOTE': return ProductGroupPromotionCustomizableCTAType.GET_QUOTE;
        case r'VISIT_SITE': return ProductGroupPromotionCustomizableCTAType.VISIT_SITE;
        case r'APPLY_NOW': return ProductGroupPromotionCustomizableCTAType.APPLY_NOW;
        case r'BOOK_NOW': return ProductGroupPromotionCustomizableCTAType.BOOK_NOW;
        case r'REGISTER_NOW': return ProductGroupPromotionCustomizableCTAType.REGISTER_NOW;
        case r'FIND_A_DEALER': return ProductGroupPromotionCustomizableCTAType.FIND_A_DEALER;
        case r'WATCH_NOW': return ProductGroupPromotionCustomizableCTAType.WATCH_NOW;
        case r'READ_MORE': return ProductGroupPromotionCustomizableCTAType.READ_MORE;
        case r'BUY_TICKETS': return ProductGroupPromotionCustomizableCTAType.BUY_TICKETS;
        case r'DONATE_NOW': return ProductGroupPromotionCustomizableCTAType.DONATE_NOW;
        case r'DOWNLOAD': return ProductGroupPromotionCustomizableCTAType.DOWNLOAD;
        case r'EXPLORE_MORE': return ProductGroupPromotionCustomizableCTAType.EXPLORE_MORE;
        case r'FIND_A_LOCATION': return ProductGroupPromotionCustomizableCTAType.FIND_A_LOCATION;
        case r'GET_DEAL': return ProductGroupPromotionCustomizableCTAType.GET_DEAL;
        case r'GET_RECIPE': return ProductGroupPromotionCustomizableCTAType.GET_RECIPE;
        case r'GET_SHOWTIMES': return ProductGroupPromotionCustomizableCTAType.GET_SHOWTIMES;
        case r'ON_SALE': return ProductGroupPromotionCustomizableCTAType.ON_SALE;
        case r'PLAY_GAME': return ProductGroupPromotionCustomizableCTAType.PLAY_GAME;
        case r'TRY_IT': return ProductGroupPromotionCustomizableCTAType.TRY_IT;
        case r'BUY_ONLINE_PICKUP_IN_STORE': return ProductGroupPromotionCustomizableCTAType.BUY_ONLINE_PICKUP_IN_STORE;
        case r'SHOP_ON_ADVERTISER': return ProductGroupPromotionCustomizableCTAType.SHOP_ON_ADVERTISER;
        case r'SHOP_THE_COLLECTION': return ProductGroupPromotionCustomizableCTAType.SHOP_THE_COLLECTION;
        case r'GET_IT_NOW': return ProductGroupPromotionCustomizableCTAType.GET_IT_NOW;
        case r'TAKE_A_PEEK': return ProductGroupPromotionCustomizableCTAType.TAKE_A_PEEK;
        case r'TAKE_A_CLOSER_LOOK': return ProductGroupPromotionCustomizableCTAType.TAKE_A_CLOSER_LOOK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ProductGroupPromotionCustomizableCTATypeTypeTransformer? _instance;
}

