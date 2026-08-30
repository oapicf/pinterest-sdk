//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The field to sort member assets by
enum AssetSortBy {
  NAME._(r'NAME'),
  ID._(r'ID'),
  PERMISSIONS._(r'PERMISSIONS'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssetSortBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssetSortBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssetSortBy? fromJson(dynamic value) => AssetSortByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssetSortBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssetSortBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetSortBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetSortBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetSortBy] to String,
/// and [decode] dynamic data back to [AssetSortBy].
class AssetSortByTypeTransformer {
  factory AssetSortByTypeTransformer() => _instance ??= const AssetSortByTypeTransformer._();

  const AssetSortByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AssetSortBy data) => data._value;

  /// Returns the instance of [AssetSortBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetSortBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssetSortBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'NAME': return AssetSortBy.NAME;
        case r'ID': return AssetSortBy.ID;
        case r'PERMISSIONS': return AssetSortBy.PERMISSIONS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssetSortByTypeTransformer? _instance;
}

