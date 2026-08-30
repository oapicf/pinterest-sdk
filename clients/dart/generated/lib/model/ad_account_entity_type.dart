//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Specify the entity type to get summary information
enum AdAccountEntityType {
  ADVERTISER._(r'ADVERTISER'),
  CAMPAIGN._(r'CAMPAIGN'),
  AD_GROUP._(r'AD_GROUP'),
  AD._(r'AD'),
  ;

  /// Instantiate a new enum with the provided value.
  const AdAccountEntityType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AdAccountEntityType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AdAccountEntityType? fromJson(dynamic value) => AdAccountEntityTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AdAccountEntityType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AdAccountEntityType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AdAccountEntityType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AdAccountEntityType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AdAccountEntityType] to String,
/// and [decode] dynamic data back to [AdAccountEntityType].
class AdAccountEntityTypeTypeTransformer {
  factory AdAccountEntityTypeTypeTransformer() => _instance ??= const AdAccountEntityTypeTypeTransformer._();

  const AdAccountEntityTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AdAccountEntityType data) => data._value;

  /// Returns the instance of [AdAccountEntityType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AdAccountEntityType? decode(dynamic data, {bool allowNull = true}) {
    if (data is AdAccountEntityType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ADVERTISER': return AdAccountEntityType.ADVERTISER;
        case r'CAMPAIGN': return AdAccountEntityType.CAMPAIGN;
        case r'AD_GROUP': return AdAccountEntityType.AD_GROUP;
        case r'AD': return AdAccountEntityType.AD;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AdAccountEntityTypeTypeTransformer? _instance;
}

