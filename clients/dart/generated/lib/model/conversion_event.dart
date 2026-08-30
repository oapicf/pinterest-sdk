//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum ConversionEvent {
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
  ;

  /// Instantiate a new enum with the provided value.
  const ConversionEvent._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ConversionEvent] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ConversionEvent? fromJson(dynamic value) => ConversionEventTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ConversionEvent]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ConversionEvent> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ConversionEvent>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ConversionEvent.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ConversionEvent] to String,
/// and [decode] dynamic data back to [ConversionEvent].
class ConversionEventTypeTransformer {
  factory ConversionEventTypeTransformer() => _instance ??= const ConversionEventTypeTransformer._();

  const ConversionEventTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ConversionEvent data) => data._value;

  /// Returns the instance of [ConversionEvent] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionEvent? decode(dynamic data, {bool allowNull = true}) {
    if (data is ConversionEvent) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PAGE_VISIT': return ConversionEvent.PAGE_VISIT;
        case r'SIGNUP': return ConversionEvent.SIGNUP;
        case r'CHECKOUT': return ConversionEvent.CHECKOUT;
        case r'CUSTOM': return ConversionEvent.CUSTOM;
        case r'VIEW_CATEGORY': return ConversionEvent.VIEW_CATEGORY;
        case r'SEARCH': return ConversionEvent.SEARCH;
        case r'ADD_TO_CART': return ConversionEvent.ADD_TO_CART;
        case r'WATCH_VIDEO': return ConversionEvent.WATCH_VIDEO;
        case r'LEAD': return ConversionEvent.LEAD;
        case r'APP_INSTALL': return ConversionEvent.APP_INSTALL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ConversionEventTypeTransformer? _instance;
}

