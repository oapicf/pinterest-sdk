//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Attribution model used to attribute the conversion event.
enum AttributionModel {
  firstTouch._(r'first_touch'),
  lastTouch._(r'last_touch'),
  multiTouch._(r'multi_touch'),
  mmm._(r'mmm'),
  ;

  /// Instantiate a new enum with the provided value.
  const AttributionModel._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [AttributionModel] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static AttributionModel? fromJson(dynamic value) => AttributionModelTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [AttributionModel]
  /// that were successfully decoded from the passed [JSON][json].
  static List<AttributionModel> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <AttributionModel>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = AttributionModel.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [AttributionModel] to String,
/// and [decode] dynamic data back to [AttributionModel].
class AttributionModelTypeTransformer {
  factory AttributionModelTypeTransformer() => _instance ??= const AttributionModelTypeTransformer._();

  const AttributionModelTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(AttributionModel data) => data._value;

  /// Returns the instance of [AttributionModel] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  AttributionModel? decode(dynamic data, {bool allowNull = true}) {
    if (data is AttributionModel) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'first_touch': return AttributionModel.firstTouch;
        case r'last_touch': return AttributionModel.lastTouch;
        case r'multi_touch': return AttributionModel.multiTouch;
        case r'mmm': return AttributionModel.mmm;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static AttributionModelTypeTransformer? _instance;
}

