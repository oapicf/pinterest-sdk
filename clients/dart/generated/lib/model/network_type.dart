//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of network connection.
enum NetworkType {
  wifi._(r'wifi'),
  cellular2g._(r'cellular_2g'),
  cellular3g._(r'cellular_3g'),
  cellular4g._(r'cellular_4g'),
  cellular5g._(r'cellular_5g'),
  cellular6g._(r'cellular_6g'),
  ethernet._(r'ethernet'),
  unknown._(r'unknown'),
  ;

  /// Instantiate a new enum with the provided value.
  const NetworkType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NetworkType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NetworkType? fromJson(dynamic value) => NetworkTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NetworkType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NetworkType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NetworkType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NetworkType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NetworkType] to String,
/// and [decode] dynamic data back to [NetworkType].
class NetworkTypeTypeTransformer {
  factory NetworkTypeTypeTransformer() => _instance ??= const NetworkTypeTypeTransformer._();

  const NetworkTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NetworkType data) => data._value;

  /// Returns the instance of [NetworkType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NetworkType? decode(dynamic data, {bool allowNull = true}) {
    if (data is NetworkType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'wifi': return NetworkType.wifi;
        case r'cellular_2g': return NetworkType.cellular2g;
        case r'cellular_3g': return NetworkType.cellular3g;
        case r'cellular_4g': return NetworkType.cellular4g;
        case r'cellular_5g': return NetworkType.cellular5g;
        case r'cellular_6g': return NetworkType.cellular6g;
        case r'ethernet': return NetworkType.ethernet;
        case r'unknown': return NetworkType.unknown;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NetworkTypeTypeTransformer? _instance;
}

