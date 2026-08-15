//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Product availability.
class NonNullableProductAvailabilityType {
  /// Instantiate a new enum with the provided [value].
  const NonNullableProductAvailabilityType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const IN_STOCK = NonNullableProductAvailabilityType._(r'IN_STOCK');
  static const OUT_OF_STOCK = NonNullableProductAvailabilityType._(r'OUT_OF_STOCK');
  static const PREORDER = NonNullableProductAvailabilityType._(r'PREORDER');

  /// List of all possible values in this [enum][NonNullableProductAvailabilityType].
  static const values = <NonNullableProductAvailabilityType>[
    IN_STOCK,
    OUT_OF_STOCK,
    PREORDER,
  ];

  static NonNullableProductAvailabilityType? fromJson(dynamic value) => NonNullableProductAvailabilityTypeTypeTransformer().decode(value);

  static List<NonNullableProductAvailabilityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NonNullableProductAvailabilityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NonNullableProductAvailabilityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NonNullableProductAvailabilityType] to String,
/// and [decode] dynamic data back to [NonNullableProductAvailabilityType].
class NonNullableProductAvailabilityTypeTypeTransformer {
  factory NonNullableProductAvailabilityTypeTypeTransformer() => _instance ??= const NonNullableProductAvailabilityTypeTypeTransformer._();

  const NonNullableProductAvailabilityTypeTypeTransformer._();

  String encode(NonNullableProductAvailabilityType data) => data.value;

  /// Decodes a [dynamic value][data] to a NonNullableProductAvailabilityType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NonNullableProductAvailabilityType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'IN_STOCK': return NonNullableProductAvailabilityType.IN_STOCK;
        case r'OUT_OF_STOCK': return NonNullableProductAvailabilityType.OUT_OF_STOCK;
        case r'PREORDER': return NonNullableProductAvailabilityType.PREORDER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [NonNullableProductAvailabilityTypeTypeTransformer] instance.
  static NonNullableProductAvailabilityTypeTypeTransformer? _instance;
}

