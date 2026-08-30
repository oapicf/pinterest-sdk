//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Reason why a product pin is ineligible for tagging.
enum IneligibleProductTagReason {
  PIN_MISSING._(r'PIN_MISSING'),
  PIN_IS_PRIVATE._(r'PIN_IS_PRIVATE'),
  PRODUCT_METADATA_MISSING._(r'PRODUCT_METADATA_MISSING'),
  PIN_NOT_FROM_VERIFIED_DOMAIN._(r'PIN_NOT_FROM_VERIFIED_DOMAIN'),
  PIN_NOT_FROM_SAME_USER_AS_HERO_PIN._(r'PIN_NOT_FROM_SAME_USER_AS_HERO_PIN'),
  ;

  /// Instantiate a new enum with the provided value.
  const IneligibleProductTagReason._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [IneligibleProductTagReason] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static IneligibleProductTagReason? fromJson(dynamic value) => IneligibleProductTagReasonTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [IneligibleProductTagReason]
  /// that were successfully decoded from the passed [JSON][json].
  static List<IneligibleProductTagReason> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <IneligibleProductTagReason>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = IneligibleProductTagReason.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [IneligibleProductTagReason] to String,
/// and [decode] dynamic data back to [IneligibleProductTagReason].
class IneligibleProductTagReasonTypeTransformer {
  factory IneligibleProductTagReasonTypeTransformer() => _instance ??= const IneligibleProductTagReasonTypeTransformer._();

  const IneligibleProductTagReasonTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(IneligibleProductTagReason data) => data._value;

  /// Returns the instance of [IneligibleProductTagReason] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  IneligibleProductTagReason? decode(dynamic data, {bool allowNull = true}) {
    if (data is IneligibleProductTagReason) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'PIN_MISSING': return IneligibleProductTagReason.PIN_MISSING;
        case r'PIN_IS_PRIVATE': return IneligibleProductTagReason.PIN_IS_PRIVATE;
        case r'PRODUCT_METADATA_MISSING': return IneligibleProductTagReason.PRODUCT_METADATA_MISSING;
        case r'PIN_NOT_FROM_VERIFIED_DOMAIN': return IneligibleProductTagReason.PIN_NOT_FROM_VERIFIED_DOMAIN;
        case r'PIN_NOT_FROM_SAME_USER_AS_HERO_PIN': return IneligibleProductTagReason.PIN_NOT_FROM_SAME_USER_AS_HERO_PIN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static IneligibleProductTagReasonTypeTransformer? _instance;
}

