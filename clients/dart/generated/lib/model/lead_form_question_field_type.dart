//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Lead form question field type
class LeadFormQuestionFieldType {
  /// Instantiate a new enum with the provided [value].
  const LeadFormQuestionFieldType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const TEXT_FIELD = LeadFormQuestionFieldType._(r'TEXT_FIELD');
  static const TEXT_AREA = LeadFormQuestionFieldType._(r'TEXT_AREA');
  static const RADIO_LIST = LeadFormQuestionFieldType._(r'RADIO_LIST');
  static const CHECKBOX = LeadFormQuestionFieldType._(r'CHECKBOX');

  /// List of all possible values in this [enum][LeadFormQuestionFieldType].
  static const values = <LeadFormQuestionFieldType>[
    TEXT_FIELD,
    TEXT_AREA,
    RADIO_LIST,
    CHECKBOX,
  ];

  static LeadFormQuestionFieldType? fromJson(dynamic value) => LeadFormQuestionFieldTypeTypeTransformer().decode(value);

  static List<LeadFormQuestionFieldType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormQuestionFieldType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormQuestionFieldType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LeadFormQuestionFieldType] to String,
/// and [decode] dynamic data back to [LeadFormQuestionFieldType].
class LeadFormQuestionFieldTypeTypeTransformer {
  factory LeadFormQuestionFieldTypeTypeTransformer() => _instance ??= const LeadFormQuestionFieldTypeTypeTransformer._();

  const LeadFormQuestionFieldTypeTypeTransformer._();

  String encode(LeadFormQuestionFieldType data) => data.value;

  /// Decodes a [dynamic value][data] to a LeadFormQuestionFieldType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LeadFormQuestionFieldType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'TEXT_FIELD': return LeadFormQuestionFieldType.TEXT_FIELD;
        case r'TEXT_AREA': return LeadFormQuestionFieldType.TEXT_AREA;
        case r'RADIO_LIST': return LeadFormQuestionFieldType.RADIO_LIST;
        case r'CHECKBOX': return LeadFormQuestionFieldType.CHECKBOX;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LeadFormQuestionFieldTypeTypeTransformer] instance.
  static LeadFormQuestionFieldTypeTypeTransformer? _instance;
}

