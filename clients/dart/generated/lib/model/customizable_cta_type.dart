//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Select a call to action (CTA) to display below your ad. Available only for ads with direct links enabled. CTA options for consideration and conversion campaigns are LEARN_MORE, SHOP_NOW, BOOK_NOW, SIGN_UP, VISIT_SITE, BUY_NOW, GET_OFFER, ORDER_NOW, ADD_TO_CART (for conversion campaigns with add to cart conversion events only)
enum CustomizableCTAType {
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
  REQUEST_DEMO._(r'REQUEST_DEMO'),
  REGISTER_NOW._(r'REGISTER_NOW'),
  FIND_A_DEALER._(r'FIND_A_DEALER'),
  ADD_TO_CART._(r'ADD_TO_CART'),
  WATCH_NOW._(r'WATCH_NOW'),
  READ_MORE._(r'READ_MORE'),
  BUY_TICKETS._(r'BUY_TICKETS'),
  DONATE_NOW._(r'DONATE_NOW'),
  DOWNLOAD._(r'DOWNLOAD'),
  EXPLORE_MORE._(r'EXPLORE_MORE'),
  FIND_A_LOCATION._(r'FIND_A_LOCATION'),
  FIND_RETAILERS._(r'FIND_RETAILERS'),
  GET_DEAL._(r'GET_DEAL'),
  GET_RECIPE._(r'GET_RECIPE'),
  GET_SHOWTIMES._(r'GET_SHOWTIMES'),
  ON_SALE._(r'ON_SALE'),
  PLAY_GAME._(r'PLAY_GAME'),
  TRY_IT._(r'TRY_IT'),
  TAKE_A_PEEK._(r'TAKE_A_PEEK'),
  ;

  /// Instantiate a new enum with the provided value.
  const CustomizableCTAType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CustomizableCTAType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CustomizableCTAType? fromJson(dynamic value) => CustomizableCTATypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CustomizableCTAType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CustomizableCTAType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CustomizableCTAType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CustomizableCTAType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CustomizableCTAType] to String,
/// and [decode] dynamic data back to [CustomizableCTAType].
class CustomizableCTATypeTypeTransformer {
  factory CustomizableCTATypeTypeTransformer() => _instance ??= const CustomizableCTATypeTypeTransformer._();

  const CustomizableCTATypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CustomizableCTAType data) => data._value;

  /// Returns the instance of [CustomizableCTAType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CustomizableCTAType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CustomizableCTAType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'GET_OFFER': return CustomizableCTAType.GET_OFFER;
        case r'LEARN_MORE': return CustomizableCTAType.LEARN_MORE;
        case r'ORDER_NOW': return CustomizableCTAType.ORDER_NOW;
        case r'SHOP_NOW': return CustomizableCTAType.SHOP_NOW;
        case r'SIGN_UP': return CustomizableCTAType.SIGN_UP;
        case r'SUBSCRIBE': return CustomizableCTAType.SUBSCRIBE;
        case r'BUY_NOW': return CustomizableCTAType.BUY_NOW;
        case r'CONTACT_US': return CustomizableCTAType.CONTACT_US;
        case r'GET_QUOTE': return CustomizableCTAType.GET_QUOTE;
        case r'VISIT_SITE': return CustomizableCTAType.VISIT_SITE;
        case r'APPLY_NOW': return CustomizableCTAType.APPLY_NOW;
        case r'BOOK_NOW': return CustomizableCTAType.BOOK_NOW;
        case r'REQUEST_DEMO': return CustomizableCTAType.REQUEST_DEMO;
        case r'REGISTER_NOW': return CustomizableCTAType.REGISTER_NOW;
        case r'FIND_A_DEALER': return CustomizableCTAType.FIND_A_DEALER;
        case r'ADD_TO_CART': return CustomizableCTAType.ADD_TO_CART;
        case r'WATCH_NOW': return CustomizableCTAType.WATCH_NOW;
        case r'READ_MORE': return CustomizableCTAType.READ_MORE;
        case r'BUY_TICKETS': return CustomizableCTAType.BUY_TICKETS;
        case r'DONATE_NOW': return CustomizableCTAType.DONATE_NOW;
        case r'DOWNLOAD': return CustomizableCTAType.DOWNLOAD;
        case r'EXPLORE_MORE': return CustomizableCTAType.EXPLORE_MORE;
        case r'FIND_A_LOCATION': return CustomizableCTAType.FIND_A_LOCATION;
        case r'FIND_RETAILERS': return CustomizableCTAType.FIND_RETAILERS;
        case r'GET_DEAL': return CustomizableCTAType.GET_DEAL;
        case r'GET_RECIPE': return CustomizableCTAType.GET_RECIPE;
        case r'GET_SHOWTIMES': return CustomizableCTAType.GET_SHOWTIMES;
        case r'ON_SALE': return CustomizableCTAType.ON_SALE;
        case r'PLAY_GAME': return CustomizableCTAType.PLAY_GAME;
        case r'TRY_IT': return CustomizableCTAType.TRY_IT;
        case r'TAKE_A_PEEK': return CustomizableCTAType.TAKE_A_PEEK;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CustomizableCTATypeTypeTransformer? _instance;
}

