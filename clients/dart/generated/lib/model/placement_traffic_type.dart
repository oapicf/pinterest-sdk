//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// A targeting option that enables advertisers to choose whether to run ads in fullscreen feed, two column feed, or both.
enum PlacementTrafficType {
  ALL._(r'ALL'),
  TWO_COLUMN_FEED._(r'TWO_COLUMN_FEED'),
  FULLSCREEN_FEED._(r'FULLSCREEN_FEED'),
  ;

  /// Instantiate a new enum with the provided value.
  const PlacementTrafficType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PlacementTrafficType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PlacementTrafficType? fromJson(dynamic value) => PlacementTrafficTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PlacementTrafficType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PlacementTrafficType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PlacementTrafficType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PlacementTrafficType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PlacementTrafficType] to String,
/// and [decode] dynamic data back to [PlacementTrafficType].
class PlacementTrafficTypeTypeTransformer {
  factory PlacementTrafficTypeTypeTransformer() => _instance ??= const PlacementTrafficTypeTypeTransformer._();

  const PlacementTrafficTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PlacementTrafficType data) => data._value;

  /// Returns the instance of [PlacementTrafficType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PlacementTrafficType? decode(dynamic data, {bool allowNull = true}) {
    if (data is PlacementTrafficType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ALL': return PlacementTrafficType.ALL;
        case r'TWO_COLUMN_FEED': return PlacementTrafficType.TWO_COLUMN_FEED;
        case r'FULLSCREEN_FEED': return PlacementTrafficType.FULLSCREEN_FEED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PlacementTrafficTypeTypeTransformer? _instance;
}

