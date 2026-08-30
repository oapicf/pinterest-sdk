//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Collections ad header type
enum CollectionsHeaderType {
  SHOP_THIS_COLLECTION._(r'SHOP_THIS_COLLECTION'),
  EXPLORE_THIS_COLLECTION._(r'EXPLORE_THIS_COLLECTION'),
  NO_HEADER._(r'NO_HEADER'),
  ON_SALE._(r'ON_SALE'),
  GET_DEAL._(r'GET_DEAL'),
  ;

  /// Instantiate a new enum with the provided value.
  const CollectionsHeaderType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CollectionsHeaderType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CollectionsHeaderType? fromJson(dynamic value) => CollectionsHeaderTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CollectionsHeaderType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CollectionsHeaderType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CollectionsHeaderType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CollectionsHeaderType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CollectionsHeaderType] to String,
/// and [decode] dynamic data back to [CollectionsHeaderType].
class CollectionsHeaderTypeTypeTransformer {
  factory CollectionsHeaderTypeTypeTransformer() => _instance ??= const CollectionsHeaderTypeTypeTransformer._();

  const CollectionsHeaderTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CollectionsHeaderType data) => data._value;

  /// Returns the instance of [CollectionsHeaderType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CollectionsHeaderType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CollectionsHeaderType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SHOP_THIS_COLLECTION': return CollectionsHeaderType.SHOP_THIS_COLLECTION;
        case r'EXPLORE_THIS_COLLECTION': return CollectionsHeaderType.EXPLORE_THIS_COLLECTION;
        case r'NO_HEADER': return CollectionsHeaderType.NO_HEADER;
        case r'ON_SALE': return CollectionsHeaderType.ON_SALE;
        case r'GET_DEAL': return CollectionsHeaderType.GET_DEAL;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CollectionsHeaderTypeTypeTransformer? _instance;
}

