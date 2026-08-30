//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The field to search member assets by
enum AssetSearchBy {
  NAME._(r'NAME'),
  ID._(r'ID'),
  NAME_OR_ID._(r'NAME_OR_ID'),
  OWNER_NAME._(r'OWNER_NAME'),
  NAME_OR_OWNER._(r'NAME_OR_OWNER'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssetSearchBy._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssetSearchBy] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssetSearchBy? fromJson(dynamic value) => AssetSearchByTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssetSearchBy]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssetSearchBy> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetSearchBy>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetSearchBy.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetSearchBy] to String,
/// and [decode] dynamic data back to [AssetSearchBy].
class AssetSearchByTypeTransformer {
  factory AssetSearchByTypeTransformer() => _instance ??= const AssetSearchByTypeTransformer._();

  const AssetSearchByTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AssetSearchBy data) => data._value;

  /// Returns the instance of [AssetSearchBy] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetSearchBy? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssetSearchBy) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'NAME': return AssetSearchBy.NAME;
        case r'ID': return AssetSearchBy.ID;
        case r'NAME_OR_ID': return AssetSearchBy.NAME_OR_ID;
        case r'OWNER_NAME': return AssetSearchBy.OWNER_NAME;
        case r'NAME_OR_OWNER': return AssetSearchBy.NAME_OR_OWNER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssetSearchByTypeTransformer? _instance;
}

