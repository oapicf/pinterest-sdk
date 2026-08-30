//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Permission aggregation type for asset access
enum AssetPermissionType {
  AGGREGATED_PERMISSION._(r'AGGREGATED_PERMISSION'),
  DIRECT_PERMISSION._(r'DIRECT_PERMISSION'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssetPermissionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssetPermissionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssetPermissionType? fromJson(dynamic value) => AssetPermissionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssetPermissionType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssetPermissionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetPermissionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetPermissionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetPermissionType] to String,
/// and [decode] dynamic data back to [AssetPermissionType].
class AssetPermissionTypeTypeTransformer {
  factory AssetPermissionTypeTypeTransformer() => _instance ??= const AssetPermissionTypeTypeTransformer._();

  const AssetPermissionTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AssetPermissionType data) => data._value;

  /// Returns the instance of [AssetPermissionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetPermissionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssetPermissionType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AGGREGATED_PERMISSION': return AssetPermissionType.AGGREGATED_PERMISSION;
        case r'DIRECT_PERMISSION': return AssetPermissionType.DIRECT_PERMISSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssetPermissionTypeTypeTransformer? _instance;
}

