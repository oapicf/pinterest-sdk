//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Ad group pacing delivery type. With ACCELERATED, an ad group budget is spent as fast as possible. With STANDARD, an ad group budget is spent smoothly over a day. When using CBO, only the STANDARD pacing delivery type is allowed.
class PacingDeliveryType {
  /// Instantiate a new enum with the provided [value].
  const PacingDeliveryType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const STANDARD = PacingDeliveryType._(r'STANDARD');
  static const ACCELERATED = PacingDeliveryType._(r'ACCELERATED');

  /// List of all possible values in this [enum][PacingDeliveryType].
  static const values = <PacingDeliveryType>[
    STANDARD,
    ACCELERATED,
  ];

  static PacingDeliveryType? fromJson(dynamic value) => PacingDeliveryTypeTypeTransformer().decode(value);

  static List<PacingDeliveryType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PacingDeliveryType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PacingDeliveryType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PacingDeliveryType] to String,
/// and [decode] dynamic data back to [PacingDeliveryType].
class PacingDeliveryTypeTypeTransformer {
  factory PacingDeliveryTypeTypeTransformer() => _instance ??= const PacingDeliveryTypeTypeTransformer._();

  const PacingDeliveryTypeTypeTransformer._();

  String encode(PacingDeliveryType data) => data.value;

  /// Decodes a [dynamic value][data] to a PacingDeliveryType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PacingDeliveryType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'STANDARD': return PacingDeliveryType.STANDARD;
        case r'ACCELERATED': return PacingDeliveryType.ACCELERATED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [PacingDeliveryTypeTypeTransformer] instance.
  static PacingDeliveryTypeTypeTransformer? _instance;
}

