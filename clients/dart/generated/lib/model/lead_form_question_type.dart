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
enum LeadFormQuestionType {
  CUSTOM._(r'CUSTOM'),
  FULL_NAME._(r'FULL_NAME'),
  FIRST_NAME._(r'FIRST_NAME'),
  LAST_NAME._(r'LAST_NAME'),
  EMAIL._(r'EMAIL'),
  PHONE_NUMBER._(r'PHONE_NUMBER'),
  ZIP_CODE._(r'ZIP_CODE'),
  GENDER._(r'GENDER'),
  CITY._(r'CITY'),
  COUNTRY._(r'COUNTRY'),
  STATE_PROVINCE._(r'STATE_PROVINCE'),
  ADDRESS._(r'ADDRESS'),
  DATE_OF_BIRTH._(r'DATE_OF_BIRTH'),
  AGE._(r'AGE'),
  ;

  /// Instantiate a new enum with the provided value.
  const LeadFormQuestionType._(this._value);

  /// The underlying value of this enum member.
  final String _value;

  @override
  String toString() => _value;

  /// Encodes this enum as a value suitable for JSON.
  String toJson() => _value;

  /// Returns the instance of [LeadFormQuestionType] that was successfully decoded
  /// from the passed [value] on success, null otherwise.
  static LeadFormQuestionType? fromJson(dynamic value) => LeadFormQuestionTypeTypeTransformer().decode(value);

  /// Returns a [List] containing instances of [LeadFormQuestionType]
  /// that were successfully decoded from the passed [JSON][json].
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

  /// Encodes this enum as a value suitable for JSON.
  String encode(LeadFormQuestionType data) => data._value;

  /// Returns the instance of [LeadFormQuestionType] that was successfully decoded
  /// from the passed [data] value on success, null otherwise.
  ///
  /// If [allowNull] is true and the [dynamic value][data] cannot be decoded successfully,
  /// then null is returned. However, if [allowNull] is false and the [dynamic value][data]
  /// cannot be decoded successfully, then an [UnimplementedError] is thrown.
  ///
  /// The [allowNull] is very handy when an API changes and a new enum value is added or removed,
  /// and users are still using an old app with the old code.
  LeadFormQuestionType? decode(dynamic data, {bool allowNull = true}) {
    if (data is LeadFormQuestionType) {
      return data;
    }
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

  /// The singleton instance of this transformer.
  static LeadFormQuestionTypeTypeTransformer? _instance;
}

