//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Asset group type.
enum AssetGroupType {
  BRAND._(r'BRAND'),
  LOCATION_OR_LANGUAGE._(r'LOCATION_OR_LANGUAGE'),
  PRODUCT_LINE._(r'PRODUCT_LINE'),
  OTHER._(r'OTHER'),
  ;

  /// Instantiate a new enum with the provided value.
  const AssetGroupType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AssetGroupType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AssetGroupType? fromJson(dynamic value) => AssetGroupTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AssetGroupType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AssetGroupType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AssetGroupType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AssetGroupType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AssetGroupType] to String,
/// and [decode] dynamic data back to [AssetGroupType].
class AssetGroupTypeTypeTransformer {
  factory AssetGroupTypeTypeTransformer() => _instance ??= const AssetGroupTypeTypeTransformer._();

  const AssetGroupTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AssetGroupType data) => data._value;

  /// Returns the instance of [AssetGroupType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AssetGroupType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AssetGroupType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'BRAND': return AssetGroupType.BRAND;
        case r'LOCATION_OR_LANGUAGE': return AssetGroupType.LOCATION_OR_LANGUAGE;
        case r'PRODUCT_LINE': return AssetGroupType.PRODUCT_LINE;
        case r'OTHER': return AssetGroupType.OTHER;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AssetGroupTypeTypeTransformer? _instance;
}

