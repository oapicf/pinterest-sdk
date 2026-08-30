//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Operating system family.
enum OsFamily {
  ios._(r'ios'),
  android._(r'android'),
  macos._(r'macos'),
  windows._(r'windows'),
  linux._(r'linux'),
  bsd._(r'bsd'),
  other._(r'other'),
  ;

  /// Instantiate a new enum with the provided value.
  const OsFamily._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [OsFamily] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static OsFamily? fromJson(dynamic value) => OsFamilyTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [OsFamily]
  /// that were successfully decoded from the passed [JSON][json].
  static List<OsFamily> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OsFamily>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OsFamily.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OsFamily] to String,
/// and [decode] dynamic data back to [OsFamily].
class OsFamilyTypeTransformer {
  factory OsFamilyTypeTransformer() => _instance ??= const OsFamilyTypeTransformer._();

  const OsFamilyTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(OsFamily data) => data._value;

  /// Returns the instance of [OsFamily] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OsFamily? decode(dynamic data, {bool allowNull = true}) {
    if (data is OsFamily) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ios': return OsFamily.ios;
        case r'android': return OsFamily.android;
        case r'macos': return OsFamily.macos;
        case r'windows': return OsFamily.windows;
        case r'linux': return OsFamily.linux;
        case r'bsd': return OsFamily.bsd;
        case r'other': return OsFamily.other;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static OsFamilyTypeTransformer? _instance;
}

