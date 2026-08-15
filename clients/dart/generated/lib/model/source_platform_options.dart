//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// List of source platforms for a conversion event.
class SourcePlatformOptions {
  /// Instantiate a new enum with the provided [value].
  const SourcePlatformOptions._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const WEB = SourcePlatformOptions._(r'WEB');
  static const MOBILE = SourcePlatformOptions._(r'MOBILE');
  static const MOBILE_ANDROID = SourcePlatformOptions._(r'MOBILE_ANDROID');
  static const MOBILE_IOS = SourcePlatformOptions._(r'MOBILE_IOS');
  static const OFFLINE = SourcePlatformOptions._(r'OFFLINE');
  static const PINTEREST_WEB = SourcePlatformOptions._(r'PINTEREST_WEB');
  static const PINTEREST_ANDROID = SourcePlatformOptions._(r'PINTEREST_ANDROID');
  static const PINTEREST_IOS = SourcePlatformOptions._(r'PINTEREST_IOS');
  static const POINT_OF_SALE = SourcePlatformOptions._(r'POINT_OF_SALE');

  /// List of all possible values in this [enum][SourcePlatformOptions].
  static const values = <SourcePlatformOptions>[
    WEB,
    MOBILE,
    MOBILE_ANDROID,
    MOBILE_IOS,
    OFFLINE,
    PINTEREST_WEB,
    PINTEREST_ANDROID,
    PINTEREST_IOS,
    POINT_OF_SALE,
  ];

  static SourcePlatformOptions? fromJson(dynamic value) => SourcePlatformOptionsTypeTransformer().decode(value);

  static List<SourcePlatformOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <SourcePlatformOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = SourcePlatformOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [SourcePlatformOptions] to String,
/// and [decode] dynamic data back to [SourcePlatformOptions].
class SourcePlatformOptionsTypeTransformer {
  factory SourcePlatformOptionsTypeTransformer() => _instance ??= const SourcePlatformOptionsTypeTransformer._();

  const SourcePlatformOptionsTypeTransformer._();

  String encode(SourcePlatformOptions data) => data.value;

  /// Decodes a [dynamic value][data] to a SourcePlatformOptions.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  SourcePlatformOptions? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'WEB': return SourcePlatformOptions.WEB;
        case r'MOBILE': return SourcePlatformOptions.MOBILE;
        case r'MOBILE_ANDROID': return SourcePlatformOptions.MOBILE_ANDROID;
        case r'MOBILE_IOS': return SourcePlatformOptions.MOBILE_IOS;
        case r'OFFLINE': return SourcePlatformOptions.OFFLINE;
        case r'PINTEREST_WEB': return SourcePlatformOptions.PINTEREST_WEB;
        case r'PINTEREST_ANDROID': return SourcePlatformOptions.PINTEREST_ANDROID;
        case r'PINTEREST_IOS': return SourcePlatformOptions.PINTEREST_IOS;
        case r'POINT_OF_SALE': return SourcePlatformOptions.POINT_OF_SALE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [SourcePlatformOptionsTypeTransformer] instance.
  static SourcePlatformOptionsTypeTransformer? _instance;
}

