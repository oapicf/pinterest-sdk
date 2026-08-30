//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum QuerymetrictypesItems {
  ENGAGEMENT._(r'ENGAGEMENT'),
  ENGAGEMENT_RATE._(r'ENGAGEMENT_RATE'),
  IMPRESSION._(r'IMPRESSION'),
  OUTBOUND_CLICK._(r'OUTBOUND_CLICK'),
  OUTBOUND_CLICK_RATE._(r'OUTBOUND_CLICK_RATE'),
  PIN_CLICK._(r'PIN_CLICK'),
  PIN_CLICK_RATE._(r'PIN_CLICK_RATE'),
  SAVE._(r'SAVE'),
  SAVE_RATE._(r'SAVE_RATE'),
  ;

  /// Instantiate a new enum with the provided value.
  const QuerymetrictypesItems._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [QuerymetrictypesItems] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static QuerymetrictypesItems? fromJson(dynamic value) => QuerymetrictypesItemsTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [QuerymetrictypesItems]
  /// that were successfully decoded from the passed [JSON][json].
  static List<QuerymetrictypesItems> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuerymetrictypesItems>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuerymetrictypesItems.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [QuerymetrictypesItems] to String,
/// and [decode] dynamic data back to [QuerymetrictypesItems].
class QuerymetrictypesItemsTypeTransformer {
  factory QuerymetrictypesItemsTypeTransformer() => _instance ??= const QuerymetrictypesItemsTypeTransformer._();

  const QuerymetrictypesItemsTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(QuerymetrictypesItems data) => data._value;

  /// Returns the instance of [QuerymetrictypesItems] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  QuerymetrictypesItems? decode(dynamic data, {bool allowNull = true}) {
    if (data is QuerymetrictypesItems) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'ENGAGEMENT': return QuerymetrictypesItems.ENGAGEMENT;
        case r'ENGAGEMENT_RATE': return QuerymetrictypesItems.ENGAGEMENT_RATE;
        case r'IMPRESSION': return QuerymetrictypesItems.IMPRESSION;
        case r'OUTBOUND_CLICK': return QuerymetrictypesItems.OUTBOUND_CLICK;
        case r'OUTBOUND_CLICK_RATE': return QuerymetrictypesItems.OUTBOUND_CLICK_RATE;
        case r'PIN_CLICK': return QuerymetrictypesItems.PIN_CLICK;
        case r'PIN_CLICK_RATE': return QuerymetrictypesItems.PIN_CLICK_RATE;
        case r'SAVE': return QuerymetrictypesItems.SAVE;
        case r'SAVE_RATE': return QuerymetrictypesItems.SAVE_RATE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static QuerymetrictypesItemsTypeTransformer? _instance;
}

