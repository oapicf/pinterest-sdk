//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Creative assets visibility.
enum CreativeAssetsVisibilityType {
  VISIBLE._(r'VISIBLE'),
  HIDDEN._(r'HIDDEN'),
  ;

  /// Instantiate a new enum with the provided value.
  const CreativeAssetsVisibilityType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [CreativeAssetsVisibilityType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static CreativeAssetsVisibilityType? fromJson(dynamic value) => CreativeAssetsVisibilityTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [CreativeAssetsVisibilityType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<CreativeAssetsVisibilityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <CreativeAssetsVisibilityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = CreativeAssetsVisibilityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [CreativeAssetsVisibilityType] to String,
/// and [decode] dynamic data back to [CreativeAssetsVisibilityType].
class CreativeAssetsVisibilityTypeTypeTransformer {
  factory CreativeAssetsVisibilityTypeTypeTransformer() => _instance ??= const CreativeAssetsVisibilityTypeTypeTransformer._();

  const CreativeAssetsVisibilityTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(CreativeAssetsVisibilityType data) => data._value;

  /// Returns the instance of [CreativeAssetsVisibilityType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  CreativeAssetsVisibilityType? decode(dynamic data, {bool allowNull = true}) {
    if (data is CreativeAssetsVisibilityType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'VISIBLE': return CreativeAssetsVisibilityType.VISIBLE;
        case r'HIDDEN': return CreativeAssetsVisibilityType.HIDDEN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static CreativeAssetsVisibilityTypeTypeTransformer? _instance;
}

