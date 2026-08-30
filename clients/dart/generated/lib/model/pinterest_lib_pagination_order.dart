//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum PinterestLibPaginationOrder {
  ASCENDING._(r'ASCENDING'),
  DESCENDING._(r'DESCENDING'),
  ;

  /// Instantiate a new enum with the provided value.
  const PinterestLibPaginationOrder._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PinterestLibPaginationOrder] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PinterestLibPaginationOrder? fromJson(dynamic value) => PinterestLibPaginationOrderTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PinterestLibPaginationOrder]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PinterestLibPaginationOrder> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PinterestLibPaginationOrder>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PinterestLibPaginationOrder.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PinterestLibPaginationOrder] to String,
/// and [decode] dynamic data back to [PinterestLibPaginationOrder].
class PinterestLibPaginationOrderTypeTransformer {
  factory PinterestLibPaginationOrderTypeTransformer() => _instance ??= const PinterestLibPaginationOrderTypeTransformer._();

  const PinterestLibPaginationOrderTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PinterestLibPaginationOrder data) => data._value;

  /// Returns the instance of [PinterestLibPaginationOrder] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PinterestLibPaginationOrder? decode(dynamic data, {bool allowNull = true}) {
    if (data is PinterestLibPaginationOrder) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ASCENDING': return PinterestLibPaginationOrder.ASCENDING;
        case r'DESCENDING': return PinterestLibPaginationOrder.DESCENDING;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PinterestLibPaginationOrderTypeTransformer? _instance;
}

