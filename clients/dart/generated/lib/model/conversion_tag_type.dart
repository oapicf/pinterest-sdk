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
class ConversionTagType {
  /// Instantiate a new enum with the provided [value].
  const ConversionTagType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const PAGE_LOAD = ConversionTagType._(r'PAGE_LOAD');
  static const UNKNOWN = ConversionTagType._(r'UNKNOWN');
  static const INITIALIZED = ConversionTagType._(r'INITIALIZED');
  static const PAGE_VISIT = ConversionTagType._(r'PAGE_VISIT');
  static const SIGNUP = ConversionTagType._(r'SIGNUP');
  static const CHECKOUT = ConversionTagType._(r'CHECKOUT');
  static const CUSTOM = ConversionTagType._(r'CUSTOM');
  static const VIEW_CATEGORY = ConversionTagType._(r'VIEW_CATEGORY');
  static const SEARCH = ConversionTagType._(r'SEARCH');
  static const ADD_TO_CART = ConversionTagType._(r'ADD_TO_CART');
  static const WATCH_VIDEO = ConversionTagType._(r'WATCH_VIDEO');
  static const LEAD = ConversionTagType._(r'LEAD');
  static const APP_INSTALL = ConversionTagType._(r'APP_INSTALL');
  static const WEB_SESSION = ConversionTagType._(r'WEB_SESSION');
  static const EXTERNAL_MEASUREMENT = ConversionTagType._(r'EXTERNAL_MEASUREMENT');

  /// List of all possible values in this [enum][ConversionTagType].
  static const values = <ConversionTagType>[
    PAGE_LOAD,
    UNKNOWN,
    INITIALIZED,
    PAGE_VISIT,
    SIGNUP,
    CHECKOUT,
    CUSTOM,
    VIEW_CATEGORY,
    SEARCH,
    ADD_TO_CART,
    WATCH_VIDEO,
    LEAD,
    APP_INSTALL,
    WEB_SESSION,
    EXTERNAL_MEASUREMENT,
  ];

  static ConversionTagType? fromJson(dynamic value) => ConversionTagTypeTypeTransformer().decode(value);

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

  String encode(ConversionTagType data) => data.value;

  /// Decodes a [dynamic value][data] to a ConversionTagType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ConversionTagType? decode(dynamic data, {bool allowNull = true}) {
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
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ConversionTagTypeTypeTransformer] instance.
  static ConversionTagTypeTypeTransformer? _instance;
}

