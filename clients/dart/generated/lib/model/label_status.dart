//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// The new status you want to give the label, either `ACTIVE` (in use) or no longer in use (`ARCHIVED`).
class LabelStatus {
  /// Instantiate a new enum with the provided [value].
  const LabelStatus._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const ACTIVE = LabelStatus._(r'ACTIVE');
  static const ARCHIVED = LabelStatus._(r'ARCHIVED');

  /// List of all possible values in this [enum][LabelStatus].
  static const values = <LabelStatus>[
    ACTIVE,
    ARCHIVED,
  ];

  static LabelStatus? fromJson(dynamic value) => LabelStatusTypeTransformer().decode(value);

  static List<LabelStatus> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LabelStatus>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LabelStatus.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LabelStatus] to String,
/// and [decode] dynamic data back to [LabelStatus].
class LabelStatusTypeTransformer {
  factory LabelStatusTypeTransformer() => _instance ??= const LabelStatusTypeTransformer._();

  const LabelStatusTypeTransformer._();

  String encode(LabelStatus data) => data.value;

  /// Decodes a [dynamic value][data] to a LabelStatus.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LabelStatus? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'ACTIVE': return LabelStatus.ACTIVE;
        case r'ARCHIVED': return LabelStatus.ARCHIVED;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LabelStatusTypeTransformer] instance.
  static LabelStatusTypeTransformer? _instance;
}

