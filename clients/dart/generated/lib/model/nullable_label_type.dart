//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
enum NullableLabelType {
  BRAND._(r'BRAND'),
  CUSTOM._(r'CUSTOM'),
  ;

  /// Instantiate a new enum with the provided value.
  const NullableLabelType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NullableLabelType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NullableLabelType? fromJson(dynamic value) => NullableLabelTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NullableLabelType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NullableLabelType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NullableLabelType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NullableLabelType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NullableLabelType] to String,
/// and [decode] dynamic data back to [NullableLabelType].
class NullableLabelTypeTypeTransformer {
  factory NullableLabelTypeTypeTransformer() => _instance ??= const NullableLabelTypeTypeTransformer._();

  const NullableLabelTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NullableLabelType data) => data._value;

  /// Returns the instance of [NullableLabelType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NullableLabelType? decode(dynamic data, {bool allowNull = true}) {
    if (data is NullableLabelType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'BRAND': return NullableLabelType.BRAND;
        case r'CUSTOM': return NullableLabelType.CUSTOM;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NullableLabelTypeTypeTransformer? _instance;
}

