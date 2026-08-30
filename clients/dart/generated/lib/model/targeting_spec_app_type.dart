//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum TargetingSpecAppType {
  androidMobile._(r'android_mobile'),
  androidTablet._(r'android_tablet'),
  ipad._(r'ipad'),
  iphone._(r'iphone'),
  web._(r'web'),
  webMobile._(r'web_mobile'),
  ;

  /// Instantiate a new enum with the provided value.
  const TargetingSpecAppType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [TargetingSpecAppType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static TargetingSpecAppType? fromJson(dynamic value) => TargetingSpecAppTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [TargetingSpecAppType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(TargetingSpecAppType data) => data._value;

  /// Returns the instance of [TargetingSpecAppType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecAppType? decode(dynamic data, {bool allowNull = true}) {
    if (data is TargetingSpecAppType) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static TargetingSpecAppTypeTypeTransformer? _instance;
}

