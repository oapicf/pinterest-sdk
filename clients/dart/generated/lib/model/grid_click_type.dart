//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Where a user is taken after clicking on an ad in grid.  **Note:**  This parameter is read-only and is set to `DIRECT_TO_DESTINATION` by default for direct links supported ads. `grid_click_type` values provided will be ignored.
enum GridClickType {
  CLOSEUP._(r'CLOSEUP'),
  DIRECT_TO_DESTINATION._(r'DIRECT_TO_DESTINATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const GridClickType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [GridClickType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static GridClickType? fromJson(dynamic value) => GridClickTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [GridClickType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<GridClickType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <GridClickType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = GridClickType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [GridClickType] to String,
/// and [decode] dynamic data back to [GridClickType].
class GridClickTypeTypeTransformer {
  factory GridClickTypeTypeTransformer() => _instance ??= const GridClickTypeTypeTransformer._();

  const GridClickTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(GridClickType data) => data._value;

  /// Returns the instance of [GridClickType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GridClickType? decode(dynamic data, {bool allowNull = true}) {
    if (data is GridClickType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CLOSEUP': return GridClickType.CLOSEUP;
        case r'DIRECT_TO_DESTINATION': return GridClickType.DIRECT_TO_DESTINATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static GridClickTypeTypeTransformer? _instance;
}

