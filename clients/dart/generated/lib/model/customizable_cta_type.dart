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
class CustomizableCTAType {
  /// Instantiate a new enum with the provided [value].
  const CustomizableCTAType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const GET_OFFER = CustomizableCTAType._(r'GET_OFFER');
  static const LEARN_MORE = CustomizableCTAType._(r'LEARN_MORE');
  static const ORDER_NOW = CustomizableCTAType._(r'ORDER_NOW');
  static const SHOP_NOW = CustomizableCTAType._(r'SHOP_NOW');
  static const SIGN_UP = CustomizableCTAType._(r'SIGN_UP');
  static const SUBSCRIBE = CustomizableCTAType._(r'SUBSCRIBE');
  static const BUY_NOW = CustomizableCTAType._(r'BUY_NOW');
  static const CONTACT_US = CustomizableCTAType._(r'CONTACT_US');
  static const GET_QUOTE = CustomizableCTAType._(r'GET_QUOTE');
  static const VISIT_SITE = CustomizableCTAType._(r'VISIT_SITE');
  static const APPLY_NOW = CustomizableCTAType._(r'APPLY_NOW');
  static const BOOK_NOW = CustomizableCTAType._(r'BOOK_NOW');
  static const REQUEST_DEMO = CustomizableCTAType._(r'REQUEST_DEMO');
  static const REGISTER_NOW = CustomizableCTAType._(r'REGISTER_NOW');
  static const FIND_A_DEALER = CustomizableCTAType._(r'FIND_A_DEALER');
  static const ADD_TO_CART = CustomizableCTAType._(r'ADD_TO_CART');
  static const WATCH_NOW = CustomizableCTAType._(r'WATCH_NOW');
  static const READ_MORE = CustomizableCTAType._(r'READ_MORE');
  static const BUY_TICKETS = CustomizableCTAType._(r'BUY_TICKETS');
  static const DONATE_NOW = CustomizableCTAType._(r'DONATE_NOW');
  static const DOWNLOAD = CustomizableCTAType._(r'DOWNLOAD');
  static const EXPLORE_MORE = CustomizableCTAType._(r'EXPLORE_MORE');
  static const FIND_A_LOCATION = CustomizableCTAType._(r'FIND_A_LOCATION');
  static const GET_DEAL = CustomizableCTAType._(r'GET_DEAL');
  static const GET_RECIPE = CustomizableCTAType._(r'GET_RECIPE');
  static const GET_SHOWTIMES = CustomizableCTAType._(r'GET_SHOWTIMES');
  static const ON_SALE = CustomizableCTAType._(r'ON_SALE');
  static const PLAY_GAME = CustomizableCTAType._(r'PLAY_GAME');
  static const TRY_IT = CustomizableCTAType._(r'TRY_IT');

  /// List of all possible values in this [enum][CustomizableCTAType].
  static const values = <CustomizableCTAType>[
    GET_OFFER,
    LEARN_MORE,
    ORDER_NOW,
    SHOP_NOW,
    SIGN_UP,
    SUBSCRIBE,
    BUY_NOW,
    CONTACT_US,
    GET_QUOTE,
    VISIT_SITE,
    APPLY_NOW,
    BOOK_NOW,
    REQUEST_DEMO,
    REGISTER_NOW,
    FIND_A_DEALER,
    ADD_TO_CART,
    WATCH_NOW,
    READ_MORE,
    BUY_TICKETS,
    DONATE_NOW,
    DOWNLOAD,
    EXPLORE_MORE,
    FIND_A_LOCATION,
    GET_DEAL,
    GET_RECIPE,
    GET_SHOWTIMES,
    ON_SALE,
    PLAY_GAME,
    TRY_IT,
  ];

  static CustomizableCTAType? fromJson(dynamic value) => CustomizableCTATypeTypeTransformer().decode(value);

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

  String encode(CustomizableCTAType data) => data.value;

  /// Decodes a [dynamic value][data] to a CustomizableCTAType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CustomizableCTAType? decode(dynamic data, {bool allowNull = true}) {
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
        case r'GET_DEAL': return CustomizableCTAType.GET_DEAL;
        case r'GET_RECIPE': return CustomizableCTAType.GET_RECIPE;
        case r'GET_SHOWTIMES': return CustomizableCTAType.GET_SHOWTIMES;
        case r'ON_SALE': return CustomizableCTAType.ON_SALE;
        case r'PLAY_GAME': return CustomizableCTAType.PLAY_GAME;
        case r'TRY_IT': return CustomizableCTAType.TRY_IT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [CustomizableCTATypeTypeTransformer] instance.
  static CustomizableCTATypeTypeTransformer? _instance;
}

