//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuizPinQuestion {
  /// Returns a new [QuizPinQuestion] instance.
  QuizPinQuestion({
    this.options = const [],
    this.questionId,
    this.questionText,
  });

  List<QuizPinOption> options;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  num? questionId;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  String? questionText;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuizPinQuestion &&
    _deepEquality.equals(other.options, options) &&
    other.questionId == questionId &&
    other.questionText == questionText;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (options.hashCode) +
    (questionId == null ? 0 : questionId!.hashCode) +
    (questionText == null ? 0 : questionText!.hashCode);

  @override
  String toString() => 'QuizPinQuestion[options=$options, questionId=$questionId, questionText=$questionText]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'options'] = this.options;
    if (this.questionId != null) {
      json[r'question_id'] = this.questionId;
    } else {
      json[r'question_id'] = null;
    }
    if (this.questionText != null) {
      json[r'question_text'] = this.questionText;
    } else {
      json[r'question_text'] = null;
    }
    return json;
  }

  /// Returns a new [QuizPinQuestion] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuizPinQuestion? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "QuizPinQuestion[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "QuizPinQuestion[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return QuizPinQuestion(
        options: QuizPinOption.listFromJson(json[r'options']),
        questionId: num.parse('${json[r'question_id']}'),
        questionText: mapValueOfType<String>(json, r'question_text'),
      );
    }
    return null;
  }

  static List<QuizPinQuestion> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuizPinQuestion>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuizPinQuestion.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuizPinQuestion> mapFromJson(dynamic json) {
    final map = <String, QuizPinQuestion>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuizPinQuestion.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuizPinQuestion-objects as value to a dart map
  static Map<String, List<QuizPinQuestion>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuizPinQuestion>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuizPinQuestion.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

