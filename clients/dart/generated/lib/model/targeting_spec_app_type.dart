//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TargetingSpecAppType {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecAppType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const androidMobile = TargetingSpecAppType._(r'android_mobile');
  static const androidTablet = TargetingSpecAppType._(r'android_tablet');
  static const ipad = TargetingSpecAppType._(r'ipad');
  static const iphone = TargetingSpecAppType._(r'iphone');
  static const web = TargetingSpecAppType._(r'web');
  static const webMobile = TargetingSpecAppType._(r'web_mobile');

  /// List of all possible values in this [enum][TargetingSpecAppType].
  static const values = <TargetingSpecAppType>[
    androidMobile,
    androidTablet,
    ipad,
    iphone,
    web,
    webMobile,
  ];

  static TargetingSpecAppType? fromJson(dynamic value) => TargetingSpecAppTypeTypeTransformer().decode(value);

  static List<TargetingSpecAppType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecAppType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecAppType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecAppType] to String,
/// and [decode] dynamic data back to [TargetingSpecAppType].
class TargetingSpecAppTypeTypeTransformer {
  factory TargetingSpecAppTypeTypeTransformer() => _instance ??= const TargetingSpecAppTypeTypeTransformer._();

  const TargetingSpecAppTypeTypeTransformer._();

  String encode(TargetingSpecAppType data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecAppType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecAppType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'android_mobile': return TargetingSpecAppType.androidMobile;
        case r'android_tablet': return TargetingSpecAppType.androidTablet;
        case r'ipad': return TargetingSpecAppType.ipad;
        case r'iphone': return TargetingSpecAppType.iphone;
        case r'web': return TargetingSpecAppType.web;
        case r'web_mobile': return TargetingSpecAppType.webMobile;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecAppTypeTypeTransformer] instance.
  static TargetingSpecAppTypeTypeTransformer? _instance;
}

