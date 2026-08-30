//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.18

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class QuizPinData {
  /// Returns a new [QuizPinData] instance.
  QuizPinData({
    this.questions = const [],
    this.results = const [],
    this.tieBreakerCustomResult,
    this.tieBreakerType,
  });

  List<QuizPinQuestion> questions;

  List<QuizPinResult> results;

  QuizPinResult? tieBreakerCustomResult;

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  TieBreakerType? tieBreakerType;

  @override
  bool operator ==(Object other) => identical(this, other) || other is QuizPinData &&
    _deepEquality.equals(other.questions, questions) &&
    _deepEquality.equals(other.results, results) &&
    other.tieBreakerCustomResult == tieBreakerCustomResult &&
    other.tieBreakerType == tieBreakerType;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (questions.hashCode) +
    (results.hashCode) +
    (tieBreakerCustomResult == null ? 0 : tieBreakerCustomResult!.hashCode) +
    (tieBreakerType == null ? 0 : tieBreakerType!.hashCode);

  @override
  String toString() => 'QuizPinData[questions=$questions, results=$results, tieBreakerCustomResult=$tieBreakerCustomResult, tieBreakerType=$tieBreakerType]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
      json[r'questions'] = this.questions;
      json[r'results'] = this.results;
    if (this.tieBreakerCustomResult != null) {
      json[r'tie_breaker_custom_result'] = this.tieBreakerCustomResult;
    } else {
      json[r'tie_breaker_custom_result'] = null;
    }
    if (this.tieBreakerType != null) {
      json[r'tie_breaker_type'] = this.tieBreakerType;
    } else {
      json[r'tie_breaker_type'] = null;
    }
    return json;
  }

  /// Returns a new [QuizPinData] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static QuizPinData? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        return true;
      }());

      return QuizPinData(
        questions: QuizPinQuestion.listFromJson(json[r'questions']),
        results: QuizPinResult.listFromJson(json[r'results']),
        tieBreakerCustomResult: QuizPinResult.fromJson(json[r'tie_breaker_custom_result']),
        tieBreakerType: TieBreakerType.fromJson(json[r'tie_breaker_type']),
      );
    }
    return null;
  }

  static List<QuizPinData> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <QuizPinData>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = QuizPinData.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, QuizPinData> mapFromJson(dynamic json) {
    final map = <String, QuizPinData>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = QuizPinData.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of QuizPinData-objects as value to a dart map
  static Map<String, List<QuizPinData>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<QuizPinData>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = QuizPinData.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

