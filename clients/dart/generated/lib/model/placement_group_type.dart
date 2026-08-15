//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Campaign placement group type
class PlacementGroupType {
  /// Instantiate a new enum with the provided [value].
  const PlacementGroupType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ALL = PlacementGroupType._(r'ALL');
  static const SEARCH = PlacementGroupType._(r'SEARCH');
  static const BROWSE = PlacementGroupType._(r'BROWSE');
  static const OTHER = PlacementGroupType._(r'OTHER');

  /// List of all possible values in this [enum][PlacementGroupType].
  static const values = <PlacementGroupType>[
    ALL,
    SEARCH,
    BROWSE,
    OTHER,
  ];

  static PlacementGroupType? fromJson(dynamic value) => PlacementGroupTypeTypeTransformer().decode(value);

  static List<PlacementGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PlacementGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PlacementGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PlacementGroupType] to String,
/// and [decode] dynamic data back to [PlacementGroupType].
class PlacementGroupTypeTypeTransformer {
  factory PlacementGroupTypeTypeTransformer() => _instance ??= const PlacementGroupTypeTypeTransformer._();

  const PlacementGroupTypeTypeTransformer._();

  String encode(PlacementGroupType data) => data.value;

  /// Decodes a [dynamic value][data] to a PlacementGroupType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PlacementGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ALL': return PlacementGroupType.ALL;
        case r'SEARCH': return PlacementGroupType.SEARCH;
        case r'BROWSE': return PlacementGroupType.BROWSE;
        case r'OTHER': return PlacementGroupType.OTHER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PlacementGroupTypeTypeTransformer] instance.
  static PlacementGroupTypeTypeTransformer? _instance;
}

