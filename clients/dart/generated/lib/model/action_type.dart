//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Ad group billable event type. For update, only draft ad groups may update billable event.
enum ActionType {
  CLICKTHROUGH._(r'CLICKTHROUGH'),
  IMPRESSION._(r'IMPRESSION'),
  VIDEO_V_50_MRC._(r'VIDEO_V_50_MRC'),
  ;

  /// Instantiate a new enum with the provided value.
  const ActionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [ActionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static ActionType? fromJson(dynamic value) => ActionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [ActionType]
  /// that were successfully decoded from the passed [JSON][json].
  static List<ActionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <ActionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = ActionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [ActionType] to String,
/// and [decode] dynamic data back to [ActionType].
class ActionTypeTypeTransformer {
  factory ActionTypeTypeTransformer() => _instance ??= const ActionTypeTypeTransformer._();

  const ActionTypeTypeTransformer._();

  /// Encodes this enum as a value suitable for JSON.
  String encode(ActionType data) => data._value;

  /// Returns the instance of [ActionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ActionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is ActionType) {
      return data;
    }
    if (data != null) {
      switch (data) {
        case r'CLICKTHROUGH': return ActionType.CLICKTHROUGH;
        case r'IMPRESSION': return ActionType.IMPRESSION;
        case r'VIDEO_V_50_MRC': return ActionType.VIDEO_V_50_MRC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// The singleton instance of this transformer.
  static ActionTypeTypeTransformer? _instance;
}

