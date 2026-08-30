//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
enum NullableLabelStatus {
  ACTIVE._(r'ACTIVE'),
  ARCHIVED._(r'ARCHIVED'),
  ;

  /// Instantiate a new enum with the provided value.
  const NullableLabelStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NullableLabelStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NullableLabelStatus? fromJson(dynamic value) => NullableLabelStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NullableLabelStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NullableLabelStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NullableLabelStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NullableLabelStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NullableLabelStatus] to String,
/// and [decode] dynamic data back to [NullableLabelStatus].
class NullableLabelStatusTypeTransformer {
  factory NullableLabelStatusTypeTransformer() => _instance ??= const NullableLabelStatusTypeTransformer._();

  const NullableLabelStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NullableLabelStatus data) => data._value;

  /// Returns the instance of [NullableLabelStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NullableLabelStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is NullableLabelStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return NullableLabelStatus.ACTIVE;
        case r'ARCHIVED': return NullableLabelStatus.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NullableLabelStatusTypeTransformer? _instance;
}

