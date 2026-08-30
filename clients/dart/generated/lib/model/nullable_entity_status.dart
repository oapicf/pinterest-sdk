//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Entity status
enum NullableEntityStatus {
  ACTIVE._(r'ACTIVE'),
  PAUSED._(r'PAUSED'),
  ARCHIVED._(r'ARCHIVED'),
  DRAFT._(r'DRAFT'),
  DELETED_DRAFT._(r'DELETED_DRAFT'),
  ;

  /// Instantiate a new enum with the provided value.
  const NullableEntityStatus._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [NullableEntityStatus] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static NullableEntityStatus? fromJson(dynamic value) => NullableEntityStatusTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [NullableEntityStatus]
  /// that were successfully decoded from the passed [JSON][json].
  static List<NullableEntityStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <NullableEntityStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = NullableEntityStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [NullableEntityStatus] to String,
/// and [decode] dynamic data back to [NullableEntityStatus].
class NullableEntityStatusTypeTransformer {
  factory NullableEntityStatusTypeTransformer() => _instance ??= const NullableEntityStatusTypeTransformer._();

  const NullableEntityStatusTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(NullableEntityStatus data) => data._value;

  /// Returns the instance of [NullableEntityStatus] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  NullableEntityStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data is NullableEntityStatus) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return NullableEntityStatus.ACTIVE;
        case r'PAUSED': return NullableEntityStatus.PAUSED;
        case r'ARCHIVED': return NullableEntityStatus.ARCHIVED;
        case r'DRAFT': return NullableEntityStatus.DRAFT;
        case r'DELETED_DRAFT': return NullableEntityStatus.DELETED_DRAFT;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static NullableEntityStatusTypeTransformer? _instance;
}

