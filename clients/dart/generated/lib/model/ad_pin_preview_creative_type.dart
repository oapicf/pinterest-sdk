//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AdPinPreviewCreativeType {
  SHOPPING._(r'SHOPPING'),
  COLLECTION._(r'COLLECTION'),
  MAX_VIDEO._(r'MAX_VIDEO'),
  MAX_WIDTH_VIDEO_COLLECTION._(r'MAX_WIDTH_VIDEO_COLLECTION'),
  MAX_WIDTH_REGULAR_COLLECTION._(r'MAX_WIDTH_REGULAR_COLLECTION'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdPinPreviewCreativeType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdPinPreviewCreativeType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdPinPreviewCreativeType? fromJson(dynamic value) => AdPinPreviewCreativeTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdPinPreviewCreativeType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdPinPreviewCreativeType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdPinPreviewCreativeType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdPinPreviewCreativeType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdPinPreviewCreativeType] to String,
/// and [decode] dynamic data back to [AdPinPreviewCreativeType].
class AdPinPreviewCreativeTypeTypeTransformer {
  factory AdPinPreviewCreativeTypeTypeTransformer() => _instance ??= const AdPinPreviewCreativeTypeTypeTransformer._();

  const AdPinPreviewCreativeTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdPinPreviewCreativeType data) => data._value;

  /// Returns the instance of [AdPinPreviewCreativeType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdPinPreviewCreativeType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdPinPreviewCreativeType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'SHOPPING': return AdPinPreviewCreativeType.SHOPPING;
        case r'COLLECTION': return AdPinPreviewCreativeType.COLLECTION;
        case r'MAX_VIDEO': return AdPinPreviewCreativeType.MAX_VIDEO;
        case r'MAX_WIDTH_VIDEO_COLLECTION': return AdPinPreviewCreativeType.MAX_WIDTH_VIDEO_COLLECTION;
        case r'MAX_WIDTH_REGULAR_COLLECTION': return AdPinPreviewCreativeType.MAX_WIDTH_REGULAR_COLLECTION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdPinPreviewCreativeTypeTypeTransformer? _instance;
}

