//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Collections ad header type for ads
enum AdCollectionsHeaderType {
  SHOP_THIS_COLLECTION._(r'SHOP_THIS_COLLECTION'),
  EXPLORE_THIS_COLLECTION._(r'EXPLORE_THIS_COLLECTION'),
  NO_HEADER._(r'NO_HEADER'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdCollectionsHeaderType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdCollectionsHeaderType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdCollectionsHeaderType? fromJson(dynamic value) => AdCollectionsHeaderTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdCollectionsHeaderType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdCollectionsHeaderType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdCollectionsHeaderType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdCollectionsHeaderType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdCollectionsHeaderType] to String,
/// and [decode] dynamic data back to [AdCollectionsHeaderType].
class AdCollectionsHeaderTypeTypeTransformer {
  factory AdCollectionsHeaderTypeTypeTransformer() => _instance ??= const AdCollectionsHeaderTypeTypeTransformer._();

  const AdCollectionsHeaderTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdCollectionsHeaderType data) => data._value;

  /// Returns the instance of [AdCollectionsHeaderType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdCollectionsHeaderType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdCollectionsHeaderType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SHOP_THIS_COLLECTION': return AdCollectionsHeaderType.SHOP_THIS_COLLECTION;
        case r'EXPLORE_THIS_COLLECTION': return AdCollectionsHeaderType.EXPLORE_THIS_COLLECTION;
        case r'NO_HEADER': return AdCollectionsHeaderType.NO_HEADER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdCollectionsHeaderTypeTypeTransformer? _instance;
}

