//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Advertiser campaign objective type. You can only update objectives for draft campaigns. `CTV_CONSIDERATION` is in BETA. `WEB_SESSIONS` and `VIDEO_VIEW` objectives are deprecated. We recommend using `VIDEO_COMPLETION` as an alternative for the latter.
enum ObjectiveType {
  AWARENESS._(r'AWARENESS'),
  CONSIDERATION._(r'CONSIDERATION'),
  WEB_CONVERSION._(r'WEB_CONVERSION'),
  CATALOG_SALES._(r'CATALOG_SALES'),
  VIDEO_COMPLETION._(r'VIDEO_COMPLETION'),
  SALES._(r'SALES'),
  APP_INSTALL._(r'APP_INSTALL'),
  CTV_CONSIDERATION._(r'CTV_CONSIDERATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const ObjectiveType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ObjectiveType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ObjectiveType? fromJson(dynamic value) => ObjectiveTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ObjectiveType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ObjectiveType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ObjectiveType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ObjectiveType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ObjectiveType] to String,
/// and [decode] dynamic data back to [ObjectiveType].
class ObjectiveTypeTypeTransformer {
  factory ObjectiveTypeTypeTransformer() => _instance ??= const ObjectiveTypeTypeTransformer._();

  const ObjectiveTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ObjectiveType data) => data._value;

  /// Returns the instance of [ObjectiveType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ObjectiveType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ObjectiveType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AWARENESS': return ObjectiveType.AWARENESS;
        case r'CONSIDERATION': return ObjectiveType.CONSIDERATION;
        case r'WEB_CONVERSION': return ObjectiveType.WEB_CONVERSION;
        case r'CATALOG_SALES': return ObjectiveType.CATALOG_SALES;
        case r'VIDEO_COMPLETION': return ObjectiveType.VIDEO_COMPLETION;
        case r'SALES': return ObjectiveType.SALES;
        case r'APP_INSTALL': return ObjectiveType.APP_INSTALL;
        case r'CTV_CONSIDERATION': return ObjectiveType.CTV_CONSIDERATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ObjectiveTypeTypeTransformer? _instance;
}

