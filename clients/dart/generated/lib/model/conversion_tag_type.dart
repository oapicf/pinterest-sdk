//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// conversion tag type
enum ConversionTagType {
  PAGE_LOAD._(r'PAGE_LOAD'),
  UNKNOWN._(r'UNKNOWN'),
  INITIALIZED._(r'INITIALIZED'),
  PAGE_VISIT._(r'PAGE_VISIT'),
  SIGNUP._(r'SIGNUP'),
  CHECKOUT._(r'CHECKOUT'),
  CUSTOM._(r'CUSTOM'),
  VIEW_CATEGORY._(r'VIEW_CATEGORY'),
  SEARCH._(r'SEARCH'),
  ADD_TO_CART._(r'ADD_TO_CART'),
  WATCH_VIDEO._(r'WATCH_VIDEO'),
  LEAD._(r'LEAD'),
  APP_INSTALL._(r'APP_INSTALL'),
  WEB_SESSION._(r'WEB_SESSION'),
  EXTERNAL_MEASUREMENT._(r'EXTERNAL_MEASUREMENT'),
  ADD_PAYMENT_INFO._(r'ADD_PAYMENT_INFO'),
  ADD_TO_WISHLIST._(r'ADD_TO_WISHLIST'),
  INITIATE_CHECKOUT._(r'INITIATE_CHECKOUT'),
  SUBSCRIBE._(r'SUBSCRIBE'),
  VIEW_CONTENT._(r'VIEW_CONTENT'),
  ADVERTISER_DEFINED_EVENT._(r'ADVERTISER_DEFINED_EVENT'),
  APP_OPEN._(r'APP_OPEN'),
  CONTACT._(r'CONTACT'),
  SCHEDULE._(r'SCHEDULE'),
  FIND_LOCATION._(r'FIND_LOCATION'),
  CUSTOMIZE_PRODUCT._(r'CUSTOMIZE_PRODUCT'),
  SUBMIT_APPLICATION._(r'SUBMIT_APPLICATION'),
  START_TRIAL._(r'START_TRIAL'),
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionTagType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionTagType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionTagType? fromJson(dynamic value) => ConversionTagTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionTagType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionTagType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionTagType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionTagType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionTagType] to String,
/// and [decode] dynamic data back to [ConversionTagType].
class ConversionTagTypeTypeTransformer {
  factory ConversionTagTypeTypeTransformer() => _instance ??= const ConversionTagTypeTypeTransformer._();

  const ConversionTagTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionTagType data) => data._value;

  /// Returns the instance of [ConversionTagType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionTagType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionTagType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PAGE_LOAD': return ConversionTagType.PAGE_LOAD;
        case r'UNKNOWN': return ConversionTagType.UNKNOWN;
        case r'INITIALIZED': return ConversionTagType.INITIALIZED;
        case r'PAGE_VISIT': return ConversionTagType.PAGE_VISIT;
        case r'SIGNUP': return ConversionTagType.SIGNUP;
        case r'CHECKOUT': return ConversionTagType.CHECKOUT;
        case r'CUSTOM': return ConversionTagType.CUSTOM;
        case r'VIEW_CATEGORY': return ConversionTagType.VIEW_CATEGORY;
        case r'SEARCH': return ConversionTagType.SEARCH;
        case r'ADD_TO_CART': return ConversionTagType.ADD_TO_CART;
        case r'WATCH_VIDEO': return ConversionTagType.WATCH_VIDEO;
        case r'LEAD': return ConversionTagType.LEAD;
        case r'APP_INSTALL': return ConversionTagType.APP_INSTALL;
        case r'WEB_SESSION': return ConversionTagType.WEB_SESSION;
        case r'EXTERNAL_MEASUREMENT': return ConversionTagType.EXTERNAL_MEASUREMENT;
        case r'ADD_PAYMENT_INFO': return ConversionTagType.ADD_PAYMENT_INFO;
        case r'ADD_TO_WISHLIST': return ConversionTagType.ADD_TO_WISHLIST;
        case r'INITIATE_CHECKOUT': return ConversionTagType.INITIATE_CHECKOUT;
        case r'SUBSCRIBE': return ConversionTagType.SUBSCRIBE;
        case r'VIEW_CONTENT': return ConversionTagType.VIEW_CONTENT;
        case r'ADVERTISER_DEFINED_EVENT': return ConversionTagType.ADVERTISER_DEFINED_EVENT;
        case r'APP_OPEN': return ConversionTagType.APP_OPEN;
        case r'CONTACT': return ConversionTagType.CONTACT;
        case r'SCHEDULE': return ConversionTagType.SCHEDULE;
        case r'FIND_LOCATION': return ConversionTagType.FIND_LOCATION;
        case r'CUSTOMIZE_PRODUCT': return ConversionTagType.CUSTOMIZE_PRODUCT;
        case r'SUBMIT_APPLICATION': return ConversionTagType.SUBMIT_APPLICATION;
        case r'START_TRIAL': return ConversionTagType.START_TRIAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionTagTypeTypeTransformer? _instance;
}

