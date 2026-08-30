//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum AdgroupTrackingFeatureType {
  TRENDS._(r'TRENDS'),
  CLONE_META._(r'CLONE_META'),
  BULK_EDITOR._(r'BULK_EDITOR'),
  AD_ROTATION._(r'AD_ROTATION'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdgroupTrackingFeatureType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdgroupTrackingFeatureType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdgroupTrackingFeatureType? fromJson(dynamic value) => AdgroupTrackingFeatureTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdgroupTrackingFeatureType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdgroupTrackingFeatureType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdgroupTrackingFeatureType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdgroupTrackingFeatureType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdgroupTrackingFeatureType] to String,
/// and [decode] dynamic data back to [AdgroupTrackingFeatureType].
class AdgroupTrackingFeatureTypeTypeTransformer {
  factory AdgroupTrackingFeatureTypeTypeTransformer() => _instance ??= const AdgroupTrackingFeatureTypeTypeTransformer._();

  const AdgroupTrackingFeatureTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdgroupTrackingFeatureType data) => data._value;

  /// Returns the instance of [AdgroupTrackingFeatureType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdgroupTrackingFeatureType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdgroupTrackingFeatureType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'TRENDS': return AdgroupTrackingFeatureType.TRENDS;
        case r'CLONE_META': return AdgroupTrackingFeatureType.CLONE_META;
        case r'BULK_EDITOR': return AdgroupTrackingFeatureType.BULK_EDITOR;
        case r'AD_ROTATION': return AdgroupTrackingFeatureType.AD_ROTATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdgroupTrackingFeatureTypeTypeTransformer? _instance;
}

