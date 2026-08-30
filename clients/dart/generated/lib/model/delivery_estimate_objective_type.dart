//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Objective type for delivery estimates.
enum DeliveryEstimateObjectiveType {
  AWARENESS._(r'AWARENESS'),
  CONSIDERATION._(r'CONSIDERATION'),
  CATALOG_SALES._(r'CATALOG_SALES'),
  WEB_CONVERSION._(r'WEB_CONVERSION'),
  ;

  /// Instantiate a new enum with the provided value.
  const DeliveryEstimateObjectiveType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [DeliveryEstimateObjectiveType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static DeliveryEstimateObjectiveType? fromJson(dynamic value) => DeliveryEstimateObjectiveTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [DeliveryEstimateObjectiveType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<DeliveryEstimateObjectiveType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DeliveryEstimateObjectiveType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DeliveryEstimateObjectiveType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DeliveryEstimateObjectiveType] to String,
/// and [decode] dynamic data back to [DeliveryEstimateObjectiveType].
class DeliveryEstimateObjectiveTypeTypeTransformer {
  factory DeliveryEstimateObjectiveTypeTypeTransformer() => _instance ??= const DeliveryEstimateObjectiveTypeTypeTransformer._();

  const DeliveryEstimateObjectiveTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(DeliveryEstimateObjectiveType data) => data._value;

  /// Returns the instance of [DeliveryEstimateObjectiveType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DeliveryEstimateObjectiveType? decode(dynamic data, {bool allowNull = true}) {
    if (data is DeliveryEstimateObjectiveType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AWARENESS': return DeliveryEstimateObjectiveType.AWARENESS;
        case r'CONSIDERATION': return DeliveryEstimateObjectiveType.CONSIDERATION;
        case r'CATALOG_SALES': return DeliveryEstimateObjectiveType.CATALOG_SALES;
        case r'WEB_CONVERSION': return DeliveryEstimateObjectiveType.WEB_CONVERSION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static DeliveryEstimateObjectiveTypeTypeTransformer? _instance;
}

