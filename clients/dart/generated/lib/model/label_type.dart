//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Category for the labeled items. You can apply one BRAND label to a campaign. You can apply 30 CUSTOM labels to a campaign.
class LabelType {
  /// Instantiate a new enum with the provided [value].
  const LabelType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const BRAND = LabelType._(r'BRAND');
  static const CUSTOM = LabelType._(r'CUSTOM');

  /// List of all possible values in this [enum][LabelType].
  static const values = <LabelType>[
    BRAND,
    CUSTOM,
  ];

  static LabelType? fromJson(dynamic value) => LabelTypeTypeTransformer().decode(value);

  static List<LabelType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LabelType] to String,
/// and [decode] dynamic data back to [LabelType].
class LabelTypeTypeTransformer {
  factory LabelTypeTypeTransformer() => _instance ??= const LabelTypeTypeTransformer._();

  const LabelTypeTypeTransformer._();

  String encode(LabelType data) => data.value;

  /// Decodes a [dynamic value][data] to a LabelType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LabelType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'BRAND': return LabelType.BRAND;
        case r'CUSTOM': return LabelType.CUSTOM;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LabelTypeTypeTransformer] instance.
  static LabelTypeTypeTransformer? _instance;
}

