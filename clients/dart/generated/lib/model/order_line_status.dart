//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Order Line Status
class OrderLineStatus {
  /// Instantiate a new enum with the provided [value].
  const OrderLineStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = OrderLineStatus._(r'ACTIVE');
  static const PAUSED = OrderLineStatus._(r'PAUSED');
  static const DELETED = OrderLineStatus._(r'DELETED');

  /// List of all possible values in this [enum][OrderLineStatus].
  static const values = <OrderLineStatus>[
    ACTIVE,
    PAUSED,
    DELETED,
  ];

  static OrderLineStatus? fromJson(dynamic value) => OrderLineStatusTypeTransformer().decode(value);

  static List<OrderLineStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLineStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLineStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderLineStatus] to String,
/// and [decode] dynamic data back to [OrderLineStatus].
class OrderLineStatusTypeTransformer {
  factory OrderLineStatusTypeTransformer() => _instance ??= const OrderLineStatusTypeTransformer._();

  const OrderLineStatusTypeTransformer._();

  String encode(OrderLineStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a OrderLineStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderLineStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return OrderLineStatus.ACTIVE;
        case r'PAUSED': return OrderLineStatus.PAUSED;
        case r'DELETED': return OrderLineStatus.DELETED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [OrderLineStatusTypeTransformer] instance.
  static OrderLineStatusTypeTransformer? _instance;
}

