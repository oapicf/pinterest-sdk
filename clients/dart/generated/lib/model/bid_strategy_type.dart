//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\".
enum BidStrategyType {
  AUTOMATIC_BID._(r'AUTOMATIC_BID'),
  MAX_BID._(r'MAX_BID'),
  TARGET_AVG._(r'TARGET_AVG'),
  ;

  /// Instantiate a new enum with the provided value.
  const BidStrategyType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [BidStrategyType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static BidStrategyType? fromJson(dynamic value) => BidStrategyTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [BidStrategyType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<BidStrategyType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <BidStrategyType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = BidStrategyType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [BidStrategyType] to String,
/// and [decode] dynamic data back to [BidStrategyType].
class BidStrategyTypeTypeTransformer {
  factory BidStrategyTypeTypeTransformer() => _instance ??= const BidStrategyTypeTypeTransformer._();

  const BidStrategyTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(BidStrategyType data) => data._value;

  /// Returns the instance of [BidStrategyType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  BidStrategyType? decode(dynamic data, {bool allowNull = true}) {
    if (data is BidStrategyType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'AUTOMATIC_BID': return BidStrategyType.AUTOMATIC_BID;
        case r'MAX_BID': return BidStrategyType.MAX_BID;
        case r'TARGET_AVG': return BidStrategyType.TARGET_AVG;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static BidStrategyTypeTypeTransformer? _instance;
}

