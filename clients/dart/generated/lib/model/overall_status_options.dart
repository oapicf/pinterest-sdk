//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Overall status of event quality score.
class OverallStatusOptions {
  /// Instantiate a new enum with the provided [value].
  const OverallStatusOptions._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NEEDS_IMPROVEMENT = OverallStatusOptions._(r'NEEDS_IMPROVEMENT');
  static const FAIR = OverallStatusOptions._(r'FAIR');
  static const GOOD = OverallStatusOptions._(r'GOOD');

  /// List of all possible values in this [enum][OverallStatusOptions].
  static const values = <OverallStatusOptions>[
    NEEDS_IMPROVEMENT,
    FAIR,
    GOOD,
  ];

  static OverallStatusOptions? fromJson(dynamic value) => OverallStatusOptionsTypeTransformer().decode(value);

  static List<OverallStatusOptions> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OverallStatusOptions>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OverallStatusOptions.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OverallStatusOptions] to String,
/// and [decode] dynamic data back to [OverallStatusOptions].
class OverallStatusOptionsTypeTransformer {
  factory OverallStatusOptionsTypeTransformer() => _instance ??= const OverallStatusOptionsTypeTransformer._();

  const OverallStatusOptionsTypeTransformer._();

  String encode(OverallStatusOptions data) => data.value;

  /// Decodes a [dynamic value][data] to a OverallStatusOptions.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OverallStatusOptions? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NEEDS_IMPROVEMENT': return OverallStatusOptions.NEEDS_IMPROVEMENT;
        case r'FAIR': return OverallStatusOptions.FAIR;
        case r'GOOD': return OverallStatusOptions.GOOD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OverallStatusOptionsTypeTransformer] instance.
  static OverallStatusOptionsTypeTransformer? _instance;
}

