//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Where a user is taken after clicking on an ad in grid. </p><strong>Note:</strong>  This parameter is read-only and is set to DIRECT_TO_DESTINATION by default for direct links supported ads.  grid_click_type values provided will be ignored.
class GridClickType {
  /// Instantiate a new enum with the provided [value].
  const GridClickType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CLOSEUP = GridClickType._(r'CLOSEUP');
  static const DIRECT_TO_DESTINATION = GridClickType._(r'DIRECT_TO_DESTINATION');

  /// List of all possible values in this [enum][GridClickType].
  static const values = <GridClickType>[
    CLOSEUP,
    DIRECT_TO_DESTINATION,
  ];

  static GridClickType? fromJson(dynamic value) => GridClickTypeTypeTransformer().decode(value);

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

  String encode(GridClickType data) => data.value;

  /// Decodes a [dynamic value][data] to a GridClickType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  GridClickType? decode(dynamic data, {bool allowNull = true}) {
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

  /// Singleton [GridClickTypeTypeTransformer] instance.
  static GridClickTypeTypeTransformer? _instance;
}

