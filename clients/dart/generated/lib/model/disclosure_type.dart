//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Type of information in the page referenced by `disclosure_url`, provided either by the Food and Drug Administration (FDA) or the manufacturer.
class DisclosureType {
  /// Instantiate a new enum with the provided [value].
  const DisclosureType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const NO_DISCLOSURE = DisclosureType._(r'NO_DISCLOSURE');
  static const PRESCRIBING_INFORMATION = DisclosureType._(r'PRESCRIBING_INFORMATION');
  static const PRESCRIBING_INFORMATION_BOX_WARNING = DisclosureType._(r'PRESCRIBING_INFORMATION_BOX_WARNING');
  static const IMPORTANT_SAFETY_INFO = DisclosureType._(r'IMPORTANT_SAFETY_INFO');
  static const MED_GUIDE = DisclosureType._(r'MED_GUIDE');
  static const PATIENT_INFORMATION = DisclosureType._(r'PATIENT_INFORMATION');

  /// List of all possible values in this [enum][DisclosureType].
  static const values = <DisclosureType>[
    NO_DISCLOSURE,
    PRESCRIBING_INFORMATION,
    PRESCRIBING_INFORMATION_BOX_WARNING,
    IMPORTANT_SAFETY_INFO,
    MED_GUIDE,
    PATIENT_INFORMATION,
  ];

  static DisclosureType? fromJson(dynamic value) => DisclosureTypeTypeTransformer().decode(value);

  static List<DisclosureType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <DisclosureType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = DisclosureType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [DisclosureType] to String,
/// and [decode] dynamic data back to [DisclosureType].
class DisclosureTypeTypeTransformer {
  factory DisclosureTypeTypeTransformer() => _instance ??= const DisclosureTypeTypeTransformer._();

  const DisclosureTypeTypeTransformer._();

  String encode(DisclosureType data) => data.value;

  /// Decodes a [dynamic value][data] to a DisclosureType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  DisclosureType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'NO_DISCLOSURE': return DisclosureType.NO_DISCLOSURE;
        case r'PRESCRIBING_INFORMATION': return DisclosureType.PRESCRIBING_INFORMATION;
        case r'PRESCRIBING_INFORMATION_BOX_WARNING': return DisclosureType.PRESCRIBING_INFORMATION_BOX_WARNING;
        case r'IMPORTANT_SAFETY_INFO': return DisclosureType.IMPORTANT_SAFETY_INFO;
        case r'MED_GUIDE': return DisclosureType.MED_GUIDE;
        case r'PATIENT_INFORMATION': return DisclosureType.PATIENT_INFORMATION;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [DisclosureTypeTypeTransformer] instance.
  static DisclosureTypeTypeTransformer? _instance;
}

