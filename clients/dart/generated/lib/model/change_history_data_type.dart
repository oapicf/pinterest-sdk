//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


enum ChangeHistoryDataType {
  STRING._(r'STRING'),
  NUMERIC._(r'NUMERIC'),
  MICROCURRENCY._(r'MICROCURRENCY'),
  DATE._(r'DATE'),
  BOOL._(r'BOOL'),
  GENDER_LIST._(r'GENDER_LIST'),
  AGE_BUCKET_LIST._(r'AGE_BUCKET_LIST'),
  APPTYPE_LIST._(r'APPTYPE_LIST'),
  COUNTRY_LIST._(r'COUNTRY_LIST'),
  LOCALE_LIST._(r'LOCALE_LIST'),
  ;

  /// Instantiate a new enum with the provided value.
  const ChangeHistoryDataType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ChangeHistoryDataType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ChangeHistoryDataType? fromJson(dynamic value) => ChangeHistoryDataTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ChangeHistoryDataType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ChangeHistoryDataType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ChangeHistoryDataType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ChangeHistoryDataType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ChangeHistoryDataType] to String,
/// and [decode] dynamic data back to [ChangeHistoryDataType].
class ChangeHistoryDataTypeTypeTransformer {
  factory ChangeHistoryDataTypeTypeTransformer() => _instance ??= const ChangeHistoryDataTypeTypeTransformer._();

  const ChangeHistoryDataTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ChangeHistoryDataType data) => data._value;

  /// Returns the instance of [ChangeHistoryDataType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ChangeHistoryDataType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ChangeHistoryDataType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'STRING': return ChangeHistoryDataType.STRING;
        case r'NUMERIC': return ChangeHistoryDataType.NUMERIC;
        case r'MICROCURRENCY': return ChangeHistoryDataType.MICROCURRENCY;
        case r'DATE': return ChangeHistoryDataType.DATE;
        case r'BOOL': return ChangeHistoryDataType.BOOL;
        case r'GENDER_LIST': return ChangeHistoryDataType.GENDER_LIST;
        case r'AGE_BUCKET_LIST': return ChangeHistoryDataType.AGE_BUCKET_LIST;
        case r'APPTYPE_LIST': return ChangeHistoryDataType.APPTYPE_LIST;
        case r'COUNTRY_LIST': return ChangeHistoryDataType.COUNTRY_LIST;
        case r'LOCALE_LIST': return ChangeHistoryDataType.LOCALE_LIST;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ChangeHistoryDataTypeTypeTransformer? _instance;
}

