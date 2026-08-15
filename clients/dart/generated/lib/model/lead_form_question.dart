//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class LeadFormQuestion {
  /// Returns a new [LeadFormQuestion] instance.
  LeadFormQuestion({
    this.customQuestionFieldType,
    this.customQuestionLabel,
    this.customQuestionOptions = const [],
    this.questionType,
  });

  LeadFormQuestionFieldType? customQuestionFieldType;

  /// Question label for a custom question.
  String? customQuestionLabel;

  /// Question options for a custom question.
  List<String>? customQuestionOptions;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  LeadFormQuestionType? questionType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is LeadFormQuestion &&
    other.customQuestionFieldType == customQuestionFieldType &&
    other.customQuestionLabel == customQuestionLabel &&
    _deepEquality.equals(other.customQuestionOptions, customQuestionOptions) &&
    other.questionType == questionType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (customQuestionFieldType == null ? 0 : customQuestionFieldType!.hashCode) +
    (customQuestionLabel == null ? 0 : customQuestionLabel!.hashCode) +
    (customQuestionOptions == null ? 0 : customQuestionOptions!.hashCode) +
    (questionType == null ? 0 : questionType!.hashCode);

  @override
  String toString() => 'LeadFormQuestion[customQuestionFieldType=$customQuestionFieldType, customQuestionLabel=$customQuestionLabel, customQuestionOptions=$customQuestionOptions, questionType=$questionType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.customQuestionFieldType != null) {
      json[r'custom_question_field_type'] = this.customQuestionFieldType;
    } else {
      json[r'custom_question_field_type'] = null;
    }
    if (this.customQuestionLabel != null) {
      json[r'custom_question_label'] = this.customQuestionLabel;
    } else {
      json[r'custom_question_label'] = null;
    }
    if (this.customQuestionOptions != null) {
      json[r'custom_question_options'] = this.customQuestionOptions;
    } else {
      json[r'custom_question_options'] = null;
    }
    if (this.questionType != null) {
      json[r'question_type'] = this.questionType;
    } else {
      json[r'question_type'] = null;
    }
    return json;
  }

  /// Returns a new [LeadFormQuestion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static LeadFormQuestion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "LeadFormQuestion[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "LeadFormQuestion[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return LeadFormQuestion(
        customQuestionFieldType: LeadFormQuestionFieldType.fromJson(json[r'custom_question_field_type']),
        customQuestionLabel: mapValueOfType<String>(json, r'custom_question_label'),
        customQuestionOptions: json[r'custom_question_options'] is Iterable
            ? (json[r'custom_question_options'] as Iterable).cast<String>().toList(growable: false)
            : const [],
        questionType: LeadFormQuestionType.fromJson(json[r'question_type']),
      );
    }
    return null;
  }

  static List<LeadFormQuestion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <LeadFormQuestion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = LeadFormQuestion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, LeadFormQuestion> mapFromJson(dynamic json) {
    final map = <String, LeadFormQuestion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = LeadFormQuestion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of LeadFormQuestion-objects as value to a dart map
  static Map<String, List<LeadFormQuestion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<LeadFormQuestion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = LeadFormQuestion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

