//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Pinterest standard event types that a custom event can be mapped to. Restricted to event types that are valid ads optimization goals.
enum AdvertiserDefinedEventMappingType {
  SIGNUP._(r'SIGNUP'),
  ADD_TO_CART._(r'ADD_TO_CART'),
  LEAD._(r'LEAD'),
  CHECKOUT._(r'CHECKOUT'),
  SUBSCRIBE._(r'SUBSCRIBE'),
  ADD_TO_WISHLIST._(r'ADD_TO_WISHLIST'),
  ADD_PAYMENT_INFO._(r'ADD_PAYMENT_INFO'),
  INITIATE_CHECKOUT._(r'INITIATE_CHECKOUT'),
  CONTACT._(r'CONTACT'),
  CUSTOMIZE_PRODUCT._(r'CUSTOMIZE_PRODUCT'),
  FIND_LOCATION._(r'FIND_LOCATION'),
  SCHEDULE._(r'SCHEDULE'),
  SUBMIT_APPLICATION._(r'SUBMIT_APPLICATION'),
  START_TRIAL._(r'START_TRIAL'),
  PAGE_VISIT._(r'PAGE_VISIT'),
  VIEW_CATEGORY._(r'VIEW_CATEGORY'),
  VIEW_CONTENT._(r'VIEW_CONTENT'),
  SEARCH._(r'SEARCH'),
  WATCH_VIDEO._(r'WATCH_VIDEO'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdvertiserDefinedEventMappingType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdvertiserDefinedEventMappingType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdvertiserDefinedEventMappingType? fromJson(dynamic value) => AdvertiserDefinedEventMappingTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdvertiserDefinedEventMappingType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdvertiserDefinedEventMappingType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdvertiserDefinedEventMappingType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdvertiserDefinedEventMappingType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdvertiserDefinedEventMappingType] to String,
/// and [decode] dynamic data back to [AdvertiserDefinedEventMappingType].
class AdvertiserDefinedEventMappingTypeTypeTransformer {
  factory AdvertiserDefinedEventMappingTypeTypeTransformer() => _instance ??= const AdvertiserDefinedEventMappingTypeTypeTransformer._();

  const AdvertiserDefinedEventMappingTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdvertiserDefinedEventMappingType data) => data._value;

  /// Returns the instance of [AdvertiserDefinedEventMappingType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdvertiserDefinedEventMappingType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdvertiserDefinedEventMappingType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SIGNUP': return AdvertiserDefinedEventMappingType.SIGNUP;
        case r'ADD_TO_CART': return AdvertiserDefinedEventMappingType.ADD_TO_CART;
        case r'LEAD': return AdvertiserDefinedEventMappingType.LEAD;
        case r'CHECKOUT': return AdvertiserDefinedEventMappingType.CHECKOUT;
        case r'SUBSCRIBE': return AdvertiserDefinedEventMappingType.SUBSCRIBE;
        case r'ADD_TO_WISHLIST': return AdvertiserDefinedEventMappingType.ADD_TO_WISHLIST;
        case r'ADD_PAYMENT_INFO': return AdvertiserDefinedEventMappingType.ADD_PAYMENT_INFO;
        case r'INITIATE_CHECKOUT': return AdvertiserDefinedEventMappingType.INITIATE_CHECKOUT;
        case r'CONTACT': return AdvertiserDefinedEventMappingType.CONTACT;
        case r'CUSTOMIZE_PRODUCT': return AdvertiserDefinedEventMappingType.CUSTOMIZE_PRODUCT;
        case r'FIND_LOCATION': return AdvertiserDefinedEventMappingType.FIND_LOCATION;
        case r'SCHEDULE': return AdvertiserDefinedEventMappingType.SCHEDULE;
        case r'SUBMIT_APPLICATION': return AdvertiserDefinedEventMappingType.SUBMIT_APPLICATION;
        case r'START_TRIAL': return AdvertiserDefinedEventMappingType.START_TRIAL;
        case r'PAGE_VISIT': return AdvertiserDefinedEventMappingType.PAGE_VISIT;
        case r'VIEW_CATEGORY': return AdvertiserDefinedEventMappingType.VIEW_CATEGORY;
        case r'VIEW_CONTENT': return AdvertiserDefinedEventMappingType.VIEW_CONTENT;
        case r'SEARCH': return AdvertiserDefinedEventMappingType.SEARCH;
        case r'WATCH_VIDEO': return AdvertiserDefinedEventMappingType.WATCH_VIDEO;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdvertiserDefinedEventMappingTypeTypeTransformer? _instance;
}

