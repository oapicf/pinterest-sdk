//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
enum PreferredMediaType {
  VIDEO._(r'VIDEO'),
  IMAGE._(r'IMAGE'),
  ;

  /// Instantiate a new enum with the provided value.
  const PreferredMediaType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [PreferredMediaType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static PreferredMediaType? fromJson(dynamic value) => PreferredMediaTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [PreferredMediaType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<PreferredMediaType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <PreferredMediaType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = PreferredMediaType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [PreferredMediaType] to String,
/// and [decode] dynamic data back to [PreferredMediaType].
class PreferredMediaTypeTypeTransformer {
  factory PreferredMediaTypeTypeTransformer() => _instance ??= const PreferredMediaTypeTypeTransformer._();

  const PreferredMediaTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(PreferredMediaType data) => data._value;

  /// Returns the instance of [PreferredMediaType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  PreferredMediaType? decode(dynamic data, {bool allowNull = true}) {
    if (data is PreferredMediaType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'VIDEO': return PreferredMediaType.VIDEO;
        case r'IMAGE': return PreferredMediaType.IMAGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static PreferredMediaTypeTypeTransformer? _instance;
}

