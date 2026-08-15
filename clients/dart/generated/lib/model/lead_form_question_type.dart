//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

/// Lead form question type
class LeadFormQuestionType {
  /// Instantiate a new enum with the provided [value].
  const LeadFormQuestionType._(this.value);

  /// The underlying value of this enum member.
  final String value;

  @override
  String toString() => value;

  String toJson() => value;

  static const CUSTOM = LeadFormQuestionType._(r'CUSTOM');
  static const FULL_NAME = LeadFormQuestionType._(r'FULL_NAME');
  static const FIRST_NAME = LeadFormQuestionType._(r'FIRST_NAME');
  static const LAST_NAME = LeadFormQuestionType._(r'LAST_NAME');
  static const EMAIL = LeadFormQuestionType._(r'EMAIL');
  static const PHONE_NUMBER = LeadFormQuestionType._(r'PHONE_NUMBER');
  static const ZIP_CODE = LeadFormQuestionType._(r'ZIP_CODE');
  static const GENDER = LeadFormQuestionType._(r'GENDER');
  static const CITY = LeadFormQuestionType._(r'CITY');
  static const COUNTRY = LeadFormQuestionType._(r'COUNTRY');
  static const STATE_PROVINCE = LeadFormQuestionType._(r'STATE_PROVINCE');
  static const ADDRESS = LeadFormQuestionType._(r'ADDRESS');
  static const DATE_OF_BIRTH = LeadFormQuestionType._(r'DATE_OF_BIRTH');
  static const AGE = LeadFormQuestionType._(r'AGE');

  /// List of all possible values in this [enum][LeadFormQuestionType].
  static const values = <LeadFormQuestionType>[
    CUSTOM,
    FULL_NAME,
    FIRST_NAME,
    LAST_NAME,
    EMAIL,
    PHONE_NUMBER,
    ZIP_CODE,
    GENDER,
    CITY,
    COUNTRY,
    STATE_PROVINCE,
    ADDRESS,
    DATE_OF_BIRTH,
    AGE,
  ];

  static LeadFormQuestionType? fromJson(dynamic value) => LeadFormQuestionTypeTypeTransformer().decode(value);

  static List<LeadFormQuestionType> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormQuestionType>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormQuestionType.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }
}

/// Transformation class that can [encode] an instance of [LeadFormQuestionType] to String,
/// and [decode] dynamic data back to [LeadFormQuestionType].
class LeadFormQuestionTypeTypeTransformer {
  factory LeadFormQuestionTypeTypeTransformer() => _instance ??= const LeadFormQuestionTypeTypeTransformer._();

  const LeadFormQuestionTypeTypeTransformer._();

  String encode(LeadFormQuestionType data) => data.value;

  /// Decodes a [dynamic value][data] to a LeadFormQuestionType.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LeadFormQuestionType? decode(dynamic data, {bool allowNull = true}) {
    if (data != null) {
      switch (data) {
        case r'CUSTOM': return LeadFormQuestionType.CUSTOM;
        case r'FULL_NAME': return LeadFormQuestionType.FULL_NAME;
        case r'FIRST_NAME': return LeadFormQuestionType.FIRST_NAME;
        case r'LAST_NAME': return LeadFormQuestionType.LAST_NAME;
        case r'EMAIL': return LeadFormQuestionType.EMAIL;
        case r'PHONE_NUMBER': return LeadFormQuestionType.PHONE_NUMBER;
        case r'ZIP_CODE': return LeadFormQuestionType.ZIP_CODE;
        case r'GENDER': return LeadFormQuestionType.GENDER;
        case r'CITY': return LeadFormQuestionType.CITY;
        case r'COUNTRY': return LeadFormQuestionType.COUNTRY;
        case r'STATE_PROVINCE': return LeadFormQuestionType.STATE_PROVINCE;
        case r'ADDRESS': return LeadFormQuestionType.ADDRESS;
        case r'DATE_OF_BIRTH': return LeadFormQuestionType.DATE_OF_BIRTH;
        case r'AGE': return LeadFormQuestionType.AGE;
        default:
          if (!allowNull) {
            throw ArgumentError('Unknown enum value to decode: $data');
          }
      }
    }
    return null;
  }

  /// Singleton [LeadFormQuestionTypeTypeTransformer] instance.
  static LeadFormQuestionTypeTypeTransformer? _instance;
}

