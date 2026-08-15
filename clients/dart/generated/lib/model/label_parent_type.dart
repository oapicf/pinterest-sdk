//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Label parent entity type.
class LabelParentType {
  /// Instantiate a new enum with the provided [value].
  const LabelParentType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CAMPAIGN = LabelParentType._(r'CAMPAIGN');

  /// List of all possible values in this [enum][LabelParentType].
  static const values = <LabelParentType>[
    CAMPAIGN,
  ];

  static LabelParentType? fromJson(dynamic value) => LabelParentTypeTypeTransformer().decode(value);

  static List<LabelParentType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelParentType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelParentType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LabelParentType] to String,
/// and [decode] dynamic data back to [LabelParentType].
class LabelParentTypeTypeTransformer {
  factory LabelParentTypeTypeTransformer() => _instance ??= const LabelParentTypeTypeTransformer._();

  const LabelParentTypeTypeTransformer._();

  String encode(LabelParentType data) => data.value;

  /// Decodes a [dynamic value][data] to a LabelParentType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LabelParentType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CAMPAIGN': return LabelParentType.CAMPAIGN;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LabelParentTypeTypeTransformer] instance.
  static LabelParentTypeTypeTransformer? _instance;
}

