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
class ActionType {
  /// Instantiate a new enum with the provided [value].
  const ActionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CLICKTHROUGH = ActionType._(r'CLICKTHROUGH');
  static const IMPRESSION = ActionType._(r'IMPRESSION');
  static const vIDEOV50MRC = ActionType._(r'VIDEO_V_50_MRC');

  /// List of all possible values in this [enum][ActionType].
  static const values = <ActionType>[
    CLICKTHROUGH,
    IMPRESSION,
    vIDEOV50MRC,
  ];

  static ActionType? fromJson(dynamic value) => ActionTypeTypeTransformer().decode(value);

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

  String encode(ActionType data) => data.value;

  /// Decodes a [dynamic value][data] to a ActionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  ActionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CLICKTHROUGH': return ActionType.CLICKTHROUGH;
        case r'IMPRESSION': return ActionType.IMPRESSION;
        case r'VIDEO_V_50_MRC': return ActionType.vIDEOV50MRC;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [ActionTypeTypeTransformer] instance.
  static ActionTypeTypeTransformer? _instance;
}

