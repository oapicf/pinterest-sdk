//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Order Line Paid Type
enum OrderLinePaidType {
  PAID._(r'PAID'),
  BONUS._(r'BONUS'),
  MAKE_GOOD._(r'MAKE_GOOD'),
  TEST._(r'TEST'),
  ;

  /// Instantiate a new enum with the provided value.
  const OrderLinePaidType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [OrderLinePaidType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static OrderLinePaidType? fromJson(dynamic value) => OrderLinePaidTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [OrderLinePaidType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<OrderLinePaidType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OrderLinePaidType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OrderLinePaidType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [OrderLinePaidType] to String,
/// and [decode] dynamic data back to [OrderLinePaidType].
class OrderLinePaidTypeTypeTransformer {
  factory OrderLinePaidTypeTypeTransformer() => _instance ??= const OrderLinePaidTypeTypeTransformer._();

  const OrderLinePaidTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(OrderLinePaidType data) => data._value;

  /// Returns the instance of [OrderLinePaidType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  OrderLinePaidType? decode(dynamic data, {bool allowNull = true}) {
    if (data is OrderLinePaidType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PAID': return OrderLinePaidType.PAID;
        case r'BONUS': return OrderLinePaidType.BONUS;
        case r'MAKE_GOOD': return OrderLinePaidType.MAKE_GOOD;
        case r'TEST': return OrderLinePaidType.TEST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static OrderLinePaidTypeTypeTransformer? _instance;
}

