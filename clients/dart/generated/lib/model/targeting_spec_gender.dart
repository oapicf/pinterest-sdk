//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;


class TargetingSpecGender {
  /// Instantiate a new enum with the provided [value].
  const TargetingSpecGender._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const unknown = TargetingSpecGender._(r'unknown');
  static const male = TargetingSpecGender._(r'male');
  static const female = TargetingSpecGender._(r'female');

  /// List of all possible values in this [enum][TargetingSpecGender].
  static const values = <TargetingSpecGender>[
    unknown,
    male,
    female,
  ];

  static TargetingSpecGender? fromJson(dynamic value) => TargetingSpecGenderTypeTransformer().decode(value);

  static List<TargetingSpecGender> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <TargetingSpecGender>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = TargetingSpecGender.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [TargetingSpecGender] to String,
/// and [decode] dynamic data back to [TargetingSpecGender].
class TargetingSpecGenderTypeTransformer {
  factory TargetingSpecGenderTypeTransformer() => _instance ??= const TargetingSpecGenderTypeTransformer._();

  const TargetingSpecGenderTypeTransformer._();

  String encode(TargetingSpecGender data) => data.value;

  /// Decodes a [dynamic value][data] to a TargetingSpecGender.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  TargetingSpecGender? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'unknown': return TargetingSpecGender.unknown;
        case r'male': return TargetingSpecGender.male;
        case r'female': return TargetingSpecGender.female;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [TargetingSpecGenderTypeTransformer] instance.
  static TargetingSpecGenderTypeTransformer? _instance;
}

