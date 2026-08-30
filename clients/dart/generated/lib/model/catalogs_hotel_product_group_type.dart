//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Catalog hotel product group type
enum CatalogsHotelProductGroupType {
  MERCHANT_CREATED._(r'MERCHANT_CREATED'),
  ALL_LISTINGS._(r'ALL_LISTINGS'),
  ;

  /// Instantiate a new enum with the provided value.
  const CatalogsHotelProductGroupType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CatalogsHotelProductGroupType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CatalogsHotelProductGroupType? fromJson(dynamic value) => CatalogsHotelProductGroupTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CatalogsHotelProductGroupType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CatalogsHotelProductGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CatalogsHotelProductGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CatalogsHotelProductGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CatalogsHotelProductGroupType] to String,
/// and [decode] dynamic data back to [CatalogsHotelProductGroupType].
class CatalogsHotelProductGroupTypeTypeTransformer {
  factory CatalogsHotelProductGroupTypeTypeTransformer() => _instance ??= const CatalogsHotelProductGroupTypeTypeTransformer._();

  const CatalogsHotelProductGroupTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CatalogsHotelProductGroupType data) => data._value;

  /// Returns the instance of [CatalogsHotelProductGroupType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CatalogsHotelProductGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CatalogsHotelProductGroupType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'MERCHANT_CREATED': return CatalogsHotelProductGroupType.MERCHANT_CREATED;
        case r'ALL_LISTINGS': return CatalogsHotelProductGroupType.ALL_LISTINGS;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CatalogsHotelProductGroupTypeTypeTransformer? _instance;
}

